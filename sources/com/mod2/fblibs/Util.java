package com.mod2.fblibs;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class Util {
    public static void clearCookies(Context context) {
        CookieSyncManager.createInstance(context);
        CookieManager.getInstance().removeAllCookie();
    }

    public static Bundle decodeUrl(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            String[] split = str.split("&");
            for (String split2 : split) {
                String[] split3 = split2.split("=");
                bundle.putString(split3[0], split3[1]);
            }
        }
        return bundle;
    }

    public static String encodePostBody(Bundle bundle, String str) {
        if (bundle == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : bundle.keySet()) {
            if (bundle.getByteArray(str2) == null) {
                sb.append("Content-Disposition: form-data; name=\"" + str2 + "\"\r\n\r\n" + bundle.getString(str2));
                sb.append("\r\n--" + str + IOUtils.LINE_SEPARATOR_WINDOWS);
            }
        }
        return sb.toString();
    }

    public static String encodeUrl(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (String str : bundle.keySet()) {
            if (z2) {
                z2 = false;
            } else {
                sb.append("&");
            }
            sb.append(String.valueOf(URLEncoder.encode(str)) + "=" + URLEncoder.encode(bundle.getString(str)));
        }
        return sb.toString();
    }

    public static String openUrl(String str, String str2, Bundle bundle) throws MalformedURLException, IOException {
        String str3 = str;
        if (str2.equals("GET")) {
            str3 = String.valueOf(str) + "?" + encodeUrl(bundle);
        }
        Log.d("Facebook-Util", String.valueOf(str2) + " URL: " + str3);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
        httpURLConnection.setRequestProperty("User-Agent", String.valueOf(System.getProperties().getProperty("http.agent")) + " FacebookAndroidSDK");
        if (!str2.equals("GET")) {
            Bundle bundle2 = new Bundle();
            for (String str4 : bundle.keySet()) {
                if (bundle.getByteArray(str4) != null) {
                    bundle2.putByteArray(str4, bundle.getByteArray(str4));
                }
            }
            if (!bundle.containsKey("method")) {
                bundle.putString("method", str2);
            }
            if (bundle.containsKey(Facebook.TOKEN)) {
                bundle.putString(Facebook.TOKEN, URLDecoder.decode(bundle.getString(Facebook.TOKEN)));
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
            httpURLConnection.connect();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            bufferedOutputStream.write("--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n".getBytes());
            bufferedOutputStream.write(encodePostBody(bundle, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").getBytes());
            bufferedOutputStream.write("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n".getBytes());
            if (!bundle2.isEmpty()) {
                for (String str5 : bundle2.keySet()) {
                    bufferedOutputStream.write(("Content-Disposition: form-data; filename=\"" + str5 + "\"" + IOUtils.LINE_SEPARATOR_WINDOWS).getBytes());
                    bufferedOutputStream.write("Content-Type: content/unknown\r\n\r\n".getBytes());
                    bufferedOutputStream.write(bundle2.getByteArray(str5));
                    bufferedOutputStream.write("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n".getBytes());
                }
            }
            bufferedOutputStream.flush();
        }
        try {
            return read(httpURLConnection.getInputStream());
        } catch (FileNotFoundException e2) {
            return read(httpURLConnection.getErrorStream());
        }
    }

    public static JSONObject parseJson(String str) throws JSONException, FacebookError {
        if (str.equals("false")) {
            throw new FacebookError("request failed");
        }
        String str2 = str;
        if (str.equals("true")) {
            str2 = "{value : true}";
        }
        JSONObject jSONObject = new JSONObject(str2);
        if (jSONObject.has("error")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("error");
            throw new FacebookError(jSONObject2.getString("message"), jSONObject2.getString("type"), 0);
        } else if (jSONObject.has("error_code") && jSONObject.has("error_msg")) {
            throw new FacebookError(jSONObject.getString("error_msg"), "", Integer.parseInt(jSONObject.getString("error_code")));
        } else if (jSONObject.has("error_code")) {
            throw new FacebookError("request failed", "", Integer.parseInt(jSONObject.getString("error_code")));
        } else if (jSONObject.has("error_msg")) {
            throw new FacebookError(jSONObject.getString("error_msg"));
        } else if (!jSONObject.has("error_reason")) {
            return jSONObject;
        } else {
            throw new FacebookError(jSONObject.getString("error_reason"));
        }
    }

    public static Bundle parseUrl(String str) {
        try {
            URL url = new URL(str.replace("fbconnect", "http"));
            Bundle decodeUrl = decodeUrl(url.getQuery());
            decodeUrl.putAll(decodeUrl(url.getRef()));
            return decodeUrl;
        } catch (MalformedURLException e2) {
            return new Bundle();
        }
    }

    private static String read(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1000);
        for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
            sb.append(readLine);
        }
        inputStream.close();
        return sb.toString();
    }

    public static void showAlert(Context context, String str, String str2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.create().show();
    }
}

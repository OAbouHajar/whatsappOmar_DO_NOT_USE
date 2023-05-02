package com.mod.libs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mod.libs.TThread;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class THttp {
    public Exception ExceptionFeedBack;
    public int FieldCount;
    public String Host;
    public String HtmlBody;
    public boolean Posted;
    public String Response;
    public int Row;
    public int RowCount;
    private JSONArray arrayJson;
    private boolean fTableReady;
    private List<NameValuePair> httpParams = null;
    private boolean isWorking;
    private JSONObject objData;
    private JSONObject objFieldName;
    private JSONObject objFieldType;

    class JavascriptInterface {
        public TThread thisThread;
        public String thisThreadID;

        public JavascriptInterface(TThread tThread, String str) {
            this.thisThread = tThread;
            this.thisThreadID = str;
        }

        public void showHTML(String str) {
            THttp.this.HtmlBody = str;
            this.thisThread.DoThread(this.thisThreadID);
        }
    }

    public interface OnHttpErrorEvent {
        void onHttpError(String str, Exception exc);
    }

    public interface OnHttpResponseEvent {
        void onHttpResponse(String str, String str2);
    }

    public static String ReadRaw(String str) {
        try {
            return ((String) new DefaultHttpClient().execute(new HttpGet(str), new BasicResponseHandler())).trim();
        } catch (Exception e2) {
            return "";
        }
    }

    public static String ReadRawContent(String str) {
        String ReadRaw = ReadRaw(str);
        if (ReadRaw.contains("<p>")) {
            ReadRaw = ReadRaw.split("<p>")[1].split("</p>")[0];
        }
        if (ReadRaw.contains("<body>")) {
            ReadRaw = ReadRaw.split("<body>")[1].split("</body>")[0];
        }
        if (ReadRaw.contains("</a>")) {
            ReadRaw = ReadRaw.split("</a>")[0].split(">")[1];
        }
        return ReadRaw.trim();
    }

    public void AddHttpParam(String str, String str2) {
        this.httpParams.add(new BasicNameValuePair(str, str2));
    }

    public void CreateHttpParams() {
        this.httpParams = new ArrayList();
    }

    @SuppressLint({"JavascriptInterface", "SetJavaScriptEnabled"})
    public void DoReadRawBody(Context context, TThread.OnThreadEvent onThreadEvent, String str, String str2) {
        TThread tThread = new TThread(onThreadEvent);
        final WebView webView = new WebView(context);
        webView.clearCache(true);
        webView.clearHistory();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new JavascriptInterface(tThread, str), "HtmlViewer");
        webView.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView webView, String str) {
                webView.loadUrl("javascript:window.HtmlViewer.showHTML(document.getElementsByTagName('body')[0].innerHTML);");
            }
        });
        webView.loadUrl(str2);
    }

    @SuppressLint({"JavascriptInterface", "SetJavaScriptEnabled"})
    public void DoReadRawTag(Context context, TThread.OnThreadEvent onThreadEvent, String str, String str2, final String str3) {
        TThread tThread = new TThread(onThreadEvent);
        final WebView webView = new WebView(context);
        webView.clearCache(true);
        webView.clearHistory();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new JavascriptInterface(tThread, str), "HtmlViewer");
        webView.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView webView, String str) {
                webView.loadUrl("javascript:window.HtmlViewer.showHTML(document.getElementsByTagName('" + str3 + "')[0].innerHTML);");
            }
        });
        webView.loadUrl(str2);
    }

    public boolean GetData() {
        if (this.Row >= this.RowCount + 1) {
            return false;
        }
        try {
            this.Row++;
            this.objData = this.arrayJson.getJSONObject(this.Row);
            return true;
        } catch (JSONException e2) {
            return false;
        }
    }

    public String GetFieldName(int i2) {
        try {
            return this.objFieldName.getString(Integer.toString(i2));
        } catch (JSONException e2) {
            return "";
        }
    }

    public String GetFieldType(int i2) {
        try {
            return this.objFieldType.getString(Integer.toString(i2));
        } catch (JSONException e2) {
            return "";
        }
    }

    public String GetFieldType(String str) {
        try {
            return this.objFieldType.getString(str);
        } catch (JSONException e2) {
            return "";
        }
    }

    public String GetFieldValue(int i2) {
        try {
            return this.objData.getString(Integer.toString(i2));
        } catch (JSONException e2) {
            return "";
        }
    }

    public String GetFieldValue(String str) {
        try {
            return this.objData.getString(str);
        } catch (JSONException e2) {
            return "";
        }
    }

    public void GetTableWhenReady() {
        try {
            this.arrayJson = new JSONArray(this.Response);
            this.RowCount = this.arrayJson.length() - 2;
            this.objFieldType = this.arrayJson.getJSONObject(0);
            this.objFieldName = this.arrayJson.getJSONObject(1);
            this.FieldCount = this.objFieldName.length() / 2;
            this.Row = 2;
            this.Row--;
        } catch (JSONException e2) {
        }
    }

    public void OpenSQL(String str) {
        try {
            this.Host = String.valueOf(this.Host) + "/tr/tSQL.php";
            CreateHttpParams();
            AddHttpParam("sqlText", str);
            Post();
        } catch (Exception e2) {
        }
    }

    public HttpPost PackHttpParams(String str, List<NameValuePair> list) {
        HttpPost httpPost = new HttpPost(str);
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(list));
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        return httpPost;
    }

    public void Post() {
        this.isWorking = true;
        this.Posted = false;
        this.fTableReady = false;
        try {
            this.Response = ((String) new DefaultHttpClient().execute(PackHttpParams(this.Host, this.httpParams), new BasicResponseHandler())).toString().trim();
            this.Posted = true;
            this.fTableReady = true;
            this.isWorking = false;
        } catch (Exception e2) {
            this.ExceptionFeedBack = e2;
            this.isWorking = false;
        }
        do {
        } while (this.isWorking);
    }

    public boolean TableReady() {
        if (this.fTableReady) {
            GetTableWhenReady();
        }
        return this.fTableReady;
    }

    public String TrimBody(String str) {
        return str.contains(">") ? str.split("\\>")[1].split("\\<")[0].trim() : str;
    }
}

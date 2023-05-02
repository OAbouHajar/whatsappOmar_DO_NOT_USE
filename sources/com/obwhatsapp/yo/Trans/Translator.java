package com.obwhatsapp.yo.Trans;

import android.os.AsyncTask;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Translator {
    String lang;
    String processed = null;
    String text;
    /* access modifiers changed from: private */
    public TranslateListener textCatcher;

    class Async extends AsyncTask<String, String, String> {
        Async() {
        }

        public String doInBackground(String... strArr) {
            try {
                String translate = translate();
                Translator.this.processed = translate.toString();
                return null;
            } catch (ParseException e2) {
                e2.printStackTrace();
                return "error";
            }
        }

        /* access modifiers changed from: protected */
        public void onCancelled(String str) {
            super.onCancelled(str);
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(String str) {
            if (Translator.this.processed == null) {
                Translator.this.textCatcher.onFailure("Network Error");
            } else if (Translator.this.processed.length() > 2) {
                Translator.this.textCatcher.onSuccess(Translator.this.processed);
            } else {
                Translator.this.textCatcher.onFailure("Invalid Input String");
            }
            super.onPostExecute(str);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
        }

        /* access modifiers changed from: protected */
        public void onProgressUpdate(String... strArr) {
            super.onProgressUpdate(strArr);
        }

        public String translate() throws ParseException {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://translate.googleapis.com/translate_a/single?client=gtx&sl=auto&tl=" + Translator.this.lang + "&ie=UTF-8&dt=t&q=" + URLEncoder.encode(Translator.this.text, DefaultCrypto.UTF_8)).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.addRequestProperty("Host", "translate.google.com");
                httpURLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (X11; Ubuntu; Linux i686; rv:56.0) Gecko/20100101 Firefox/56.0");
                httpURLConnection.addRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
                httpURLConnection.connect();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    String str = readLine;
                    if (readLine == null) {
                        break;
                    }
                    sb.append(str);
                }
                bufferedReader.close();
                httpURLConnection.disconnect();
                StringBuilder sb2 = new StringBuilder();
                Iterator it = ((JSONArray) ((JSONArray) new JSONParser().parse(sb.toString())).get(0)).iterator();
                while (it.hasNext()) {
                    sb2.append(((JSONArray) it.next()).get(0).toString());
                }
                return sb2.toString();
            } catch (MalformedURLException e2) {
                e2.printStackTrace();
                return e2.getLocalizedMessage();
            } catch (IOException e3) {
                e3.printStackTrace();
                return e3.getLocalizedMessage();
            }
        }
    }

    public interface TranslateListener {
        void onFailure(String str);

        void onSuccess(String str);
    }

    public Translator(String str, String str2) {
        this.lang = str;
        this.text = str2;
        new Async().execute(new String[0]);
    }

    public void A01(TranslateListener translateListener) {
        this.textCatcher = translateListener;
    }
}

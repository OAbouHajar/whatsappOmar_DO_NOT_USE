package com.example.quran;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.obwhatsapp.R;

public class MainActivity_quran_gz extends Activity {
    /* access modifiers changed from: private */
    public EditText edit;
    private TextView numtext;
    private WebView web;

    public void developeur(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("التطبيق من تطوير المبرمج احمد الهندي");
        builder.setPositiveButton("نعم", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        });
        builder.create().show();
    }

    public void loadPage(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("ادخل رقم جزء صحيح من 1 الى 30");
        builder.setPositiveButton("نعم", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        });
        try {
            int parseInt = Integer.parseInt(this.edit.getText().toString());
            if (parseInt <= 0 || parseInt >= 31) {
                builder.create().show();
                this.edit.setText("");
                return;
            }
            this.web.loadUrl("file:///android_asset/Quran/prt" + parseInt + ".htm");
            Toast.makeText(getApplicationContext(), " فتح الجزء رقم " + parseInt, 1).show();
            this.numtext.setText(Integer.toString(Integer.parseInt(this.edit.getText().toString())));
            this.edit.setText("");
        } catch (Exception e2) {
            builder.create().show();
        }
    }

    public void loadPageQuranGz(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("ادخل رقم جزء صحيح من 1 الى 30");
        builder.setPositiveButton("نعم", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        });
        try {
            int parseInt = Integer.parseInt(this.edit.getText().toString());
            if (parseInt <= 0 || parseInt >= 31) {
                builder.create().show();
                this.edit.setText("");
                return;
            }
            this.web.loadUrl("file:///android_asset/Quran/prt" + parseInt + ".htm");
            Toast.makeText(getApplicationContext(), " فتح الجزء رقم " + parseInt, 1).show();
            this.numtext.setText(Integer.toString(Integer.parseInt(this.edit.getText().toString())));
            this.edit.setText("");
        } catch (Exception e2) {
            builder.create().show();
        }
    }

    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("هل تريد اغلاق التطبيق ؟");
        builder.setPositiveButton("نعم", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i2) {
                MainActivity_quran_gz.this.finish();
            }
        });
        builder.setNegativeButton("لا", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        });
        builder.create().show();
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"SetJavaScriptEnabled", "ShowToast"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main2);
        this.web = (WebView) findViewById(R.id.webView1);
        this.numtext = (TextView) findViewById(R.id.textView3);
        this.edit = (EditText) findViewById(R.id.editText1);
        this.edit.setInputType(0);
        this.web.getSettings().setJavaScriptEnabled(true);
        this.web.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView webView, String str) {
                MainActivity_quran_gz.this.edit.setInputType(2);
            }
        });
        this.web.getSettings().setBuiltInZoomControls(true);
        this.web.getSettings().setSupportZoom(true);
        this.web.loadUrl("file:///android_asset/Quran/prt1.htm");
        Toast.makeText(getApplicationContext(), "فتح الجزء رقم 1", 1).show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}

package com.mod2.fb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcelable;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import com.mod2.libs.TFragBBM;
import java.io.File;

public class FacebookFragment extends TFragBBM {
    private static final int FILECHOOSER_RESULTCODE = 2888;
    private ImageButton buttonBack;
    private ImageButton buttonForward;
    private ImageButton buttonHome;
    /* access modifiers changed from: private */
    public Context context;
    private String homeUrl = "http://m.facebook.com";
    public Uri imageUri;
    /* access modifiers changed from: private */
    public Uri mCapturedImageURI = null;
    /* access modifiers changed from: private */
    public ValueCallback<Uri> mUploadMessage;
    private WebView webView;

    public class MyDownloadListener implements DownloadListener {
        public MyDownloadListener() {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
            FacebookFragment.this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    private class MyWebChromeClient extends WebChromeClient {
        private MyWebChromeClient() {
        }

        /* synthetic */ MyWebChromeClient(FacebookFragment facebookFragment, MyWebChromeClient myWebChromeClient) {
            this();
        }

        public void onConsoleMessage(String str, int i2, String str2) {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            onConsoleMessage(consoleMessage.message(), consoleMessage.lineNumber(), consoleMessage.sourceId());
            return true;
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback) {
            openFileChooser(valueCallback, "");
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
            FacebookFragment.this.mUploadMessage = valueCallback;
            try {
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "AndroidExampleFolder");
                if (!file.exists()) {
                    file.mkdirs();
                }
                FacebookFragment.this.mCapturedImageURI = Uri.fromFile(new File(file + File.separator + "IMG_" + String.valueOf(System.currentTimeMillis()) + ".jpg"));
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("output", FacebookFragment.this.mCapturedImageURI);
                Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
                intent2.addCategory("android.intent.category.OPENABLE");
                intent2.setType("image/*");
                Intent createChooser = Intent.createChooser(intent2, "Image Chooser");
                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Parcelable[]{intent});
                FacebookFragment.this.startActivityForResult(createChooser, FacebookFragment.FILECHOOSER_RESULTCODE);
            } catch (Exception e2) {
            }
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            openFileChooser(valueCallback, str);
        }
    }

    private class MyWebViewClient extends WebViewClient {
        private MyWebViewClient() {
        }

        /* synthetic */ MyWebViewClient(FacebookFragment facebookFragment, MyWebViewClient myWebViewClient) {
            this();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }

    public void onActResult(int i2, int i3, Intent intent) {
        if (i2 == FILECHOOSER_RESULTCODE && this.mUploadMessage != null) {
            Uri uri = null;
            if (i3 != -1) {
                uri = null;
            } else if (intent == null) {
                try {
                    uri = this.mCapturedImageURI;
                } catch (Exception e2) {
                }
            } else {
                uri = intent.getData();
            }
            this.mUploadMessage.onReceiveValue(uri);
            this.mUploadMessage = null;
        }
    }

    public void onButtonClick(View view) {
        if (view.equals(this.buttonBack)) {
            this.webView.goBack();
        }
        if (view.equals(this.buttonHome)) {
            this.webView.loadUrl(this.homeUrl);
        }
        if (view.equals(this.buttonForward)) {
            this.webView.goForward();
        }
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
    }

    public void onDlgNegativeBtnClick(DialogInterface dialogInterface) {
    }

    public void onDlgPositiveBtnClick(DialogInterface dialogInterface) {
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void onFragmentCreate(Context context2) {
        this.context = context2;
        InitFragmentLayout("fragment_facebook");
        this.webView = InitWebView("web_view_fb");
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setUserAgentString("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/534.57.2 (KHTML, like Gecko) Version/5.1.7 Safari/534.57.2");
        this.webView.getSettings().setLoadWithOverviewMode(true);
        this.webView.setScrollBarStyle(33554432);
        this.webView.setScrollbarFadingEnabled(false);
        this.webView.getSettings().setBuiltInZoomControls(true);
        this.webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        this.webView.getSettings().setAllowFileAccess(true);
        this.webView.getSettings().setSupportZoom(true);
        this.webView.setWebViewClient(new MyWebViewClient(this, (MyWebViewClient) null));
        this.webView.setWebChromeClient(new MyWebChromeClient(this, (MyWebChromeClient) null));
        this.webView.setDownloadListener(new MyDownloadListener());
        this.webView.loadUrl(this.homeUrl);
        this.buttonBack = InitImageButton("button_back");
        this.buttonHome = InitImageButton("button_home");
        this.buttonForward = InitImageButton("button_forward");
    }

    public void onThread(String str) {
    }

    public void onTimer(String str) {
    }

    public String onTitleCreate() {
        return "BBM Facebook";
    }

    public void onTriggered(String str) {
    }
}

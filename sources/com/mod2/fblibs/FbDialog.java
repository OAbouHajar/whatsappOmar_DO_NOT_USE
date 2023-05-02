package com.mod2.fblibs;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.mod2.fblibs.Facebook;

public class FbDialog extends Dialog {
    static final float[] DIMENSIONS_DIFF_LANDSCAPE = {20.0f, 60.0f};
    static final float[] DIMENSIONS_DIFF_PORTRAIT = {40.0f, 60.0f};
    static final String DISPLAY_STRING = "touch";
    static final int FB_BLUE = -9599820;
    static final String FB_ICON = "icon.png";
    static final FrameLayout.LayoutParams FILL = new FrameLayout.LayoutParams(-1, -1);
    static final int MARGIN = 4;
    static final int PADDING = 2;
    /* access modifiers changed from: private */
    public FrameLayout mContent;
    /* access modifiers changed from: private */
    public Facebook.DialogListener mListener;
    /* access modifiers changed from: private */
    public ProgressDialog mSpinner;
    private String mUrl;
    /* access modifiers changed from: private */
    public WebView mWebView;

    private class FbWebViewClient extends WebViewClient {
        public FbWebViewClient() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            FbDialog.this.mSpinner.dismiss();
            FbDialog.this.mContent.setBackgroundColor(0);
            FbDialog.this.mWebView.setVisibility(0);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Log.d("Facebook-WebView", new StringBuffer().append("Webview loading URL: ").append(str).toString());
            super.onPageStarted(webView, str, bitmap);
            FbDialog.this.mSpinner.show();
        }

        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
            FbDialog.this.mListener.onError(new DialogError(str, i2, str2));
            FbDialog.this.dismiss();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Log.d("Facebook-WebView", new StringBuffer().append("Redirect URL: ").append(str).toString());
            if (str.startsWith(Facebook.REDIRECT_URI)) {
                Bundle parseUrl = Util.parseUrl(str);
                String string = parseUrl.getString("error");
                if (string == null) {
                    string = parseUrl.getString("error_type");
                }
                if (string == null) {
                    FbDialog.this.mListener.onComplete(parseUrl);
                } else if (string.equals("access_denied") || string.equals("OAuthAccessDeniedException")) {
                    FbDialog.this.mListener.onCancel();
                } else {
                    FbDialog.this.mListener.onFacebookError(new FacebookError(string));
                }
                FbDialog.this.dismiss();
                return true;
            } else if (str.startsWith(Facebook.CANCEL_URI)) {
                FbDialog.this.mListener.onCancel();
                FbDialog.this.dismiss();
                return true;
            } else if (str.contains(FbDialog.DISPLAY_STRING)) {
                return false;
            } else {
                FbDialog.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
        }
    }

    public FbDialog(Context context, String str, Facebook.DialogListener dialogListener) {
        super(context, 16973840);
        this.mUrl = str;
        this.mListener = dialogListener;
    }

    private void setUpWebView(int i2) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.mWebView = new WebView(getContext());
        this.mWebView.setVerticalScrollBarEnabled(false);
        this.mWebView.setHorizontalScrollBarEnabled(false);
        this.mWebView.setWebViewClient(new FbWebViewClient());
        this.mWebView.getSettings().setJavaScriptEnabled(true);
        this.mWebView.loadUrl(this.mUrl);
        this.mWebView.setLayoutParams(FILL);
        this.mWebView.setVisibility(4);
        linearLayout.setPadding(i2, i2, i2, i2);
        linearLayout.addView(this.mWebView);
        this.mContent.addView(linearLayout);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mSpinner = new ProgressDialog(getContext());
        this.mSpinner.requestWindowFeature(1);
        this.mSpinner.setMessage("Loading...");
        this.mSpinner.setCancelable(false);
        requestWindowFeature(1);
        this.mContent = new FrameLayout(getContext());
        setUpWebView(10);
        addContentView(this.mContent, new ViewGroup.LayoutParams(-1, -1));
    }
}

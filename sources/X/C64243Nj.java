package X;

import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: X.3Nj  reason: invalid class name and case insensitive filesystem */
public class C64243Nj extends WebViewClient {
    public final /* synthetic */ C19980zJ A00;
    public final /* synthetic */ C610837g A01;

    public C64243Nj(C19980zJ r1, C610837g r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        this.A01.A0F("WebViewClient error", C13680ns.A0c(i2, "webview_error_"), true);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A01.A0F("WebViewClient error", AnonymousClass000.A0l(AnonymousClass000.A0r("webview_error_"), webResourceError.getErrorCode()), true);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith("y://error")) {
            this.A01.A0F("iFrame api script error", "iframe_api_script_error", true);
        }
        if (str.startsWith("https://")) {
            this.A00.Act(webView.getContext(), Uri.parse(str));
        }
        return true;
    }
}

package X;

import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.obwhatsapp.WaInAppBrowsingActivity;
import com.obwhatsapp.wamsys.SecureUriParser;

/* renamed from: X.2oC  reason: invalid class name and case insensitive filesystem */
public class C56602oC extends WebViewClient {
    public final /* synthetic */ C64213Ng A00;

    public C56602oC(C64213Ng r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r3 = r1.split("\\.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.lang.String r3) {
        /*
            android.net.Uri r0 = com.obwhatsapp.wamsys.SecureUriParser.parseEncodedRFC2396(r3)
            java.lang.String r1 = r0.getHost()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "\\."
            java.lang.String[] r3 = r1.split(r0)
            int r2 = r3.length
            r0 = 2
            if (r2 < r0) goto L_0x0031
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            int r0 = r2 + -2
            r0 = r3[r0]
            r1.append(r0)
            java.lang.String r0 = "."
            r1.append(r0)
            int r0 = r2 + -1
            r0 = r3[r0]
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            return r0
        L_0x0031:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56602oC.A00(java.lang.String):java.lang.String");
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WaInAppBrowsingActivity waInAppBrowsingActivity = this.A00.A00;
        boolean A03 = WaInAppBrowsingActivity.A03(waInAppBrowsingActivity.A00, waInAppBrowsingActivity, str);
        if (waInAppBrowsingActivity.getIntent().getBooleanExtra("webview_enforce_same_domain_for_new_tab", true)) {
            String url = webView.getUrl();
            if (!TextUtils.isEmpty(url) && !TextUtils.isEmpty(str)) {
                String A002 = A00(url);
                String A003 = A00(str);
                if (TextUtils.isEmpty(A002) || TextUtils.isEmpty(A003) || !A002.equals(A003)) {
                    return true;
                }
            }
        }
        if (!A03) {
            waInAppBrowsingActivity.startActivity(C13690nt.A0B(SecureUriParser.parseEncodedRFC2396(str)));
        }
        return A03;
    }
}

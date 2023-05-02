package X;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.obwhatsapp.R;
import com.obwhatsapp.WaInAppBrowsingActivity;
import com.obwhatsapp.wamsys.SecureUriParser;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;

/* renamed from: X.2oB  reason: invalid class name and case insensitive filesystem */
public class C56592oB extends WebViewClient {
    public final /* synthetic */ WaInAppBrowsingActivity A00;

    public C56592oB(WaInAppBrowsingActivity waInAppBrowsingActivity) {
        this.A00 = waInAppBrowsingActivity;
    }

    public void onPageFinished(WebView webView, String str) {
        String host;
        super.onPageFinished(webView, str);
        WaInAppBrowsingActivity waInAppBrowsingActivity = this.A00;
        if (webView != null) {
            if (!waInAppBrowsingActivity.A07) {
                waInAppBrowsingActivity.A39(webView.getUrl());
                if (!"about:blank".equals(webView.getTitle())) {
                    host = webView.getTitle();
                } else {
                    return;
                }
            } else {
                host = SecureUriParser.parseEncodedRFC2396(str).getHost();
            }
            waInAppBrowsingActivity.A38(host);
        }
    }

    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        AnonymousClass4L8 r1;
        StringBuilder A0r = AnonymousClass000.A0r("WaInappBrowsingActivity/onReceivedError: Error loading the page ");
        Uri parseEncodedRFC2396 = SecureUriParser.parseEncodedRFC2396(str2);
        AnonymousClass4J1 r5 = C817949t.A00;
        String scheme = parseEncodedRFC2396.getScheme();
        String authority = parseEncodedRFC2396.getAuthority();
        if (scheme == null || "".equals(scheme) || authority == null || "".equals(authority)) {
            r1 = new AnonymousClass4L8();
            r1.A01 = parseEncodedRFC2396.getPath();
            r1.A02 = scheme;
            r1.A00 = authority;
            parseEncodedRFC2396.getQuery();
        } else {
            String str3 = TextUtils.isEmpty(parseEncodedRFC2396.getPath()) ? null : "/--sanitized--";
            C812047g.A00(parseEncodedRFC2396, r5);
            r1 = new AnonymousClass4L8();
            r1.A02 = scheme;
            r1.A00 = authority;
            r1.A01 = str3;
        }
        String str4 = r1.A01;
        if (str4 == null) {
            str4 = "";
        }
        A0r.append(str4);
        A0r.append(": ");
        Log.e(AnonymousClass000.A0h(str, A0r));
        webView.loadUrl("about:blank");
        WaInAppBrowsingActivity waInAppBrowsingActivity = this.A00;
        waInAppBrowsingActivity.A3A(waInAppBrowsingActivity.getString(R.string.str1b88), true);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        StringBuilder A0r = AnonymousClass000.A0r("WaInappBrowsingActivity/onReceivedSslError: SSL Error while loading the page: ");
        A0r.append(sslError.getUrl());
        A0r.append(": Code ");
        Log.e(AnonymousClass000.A0l(A0r, sslError.getPrimaryError()));
        sslErrorHandler.cancel();
        webView.stopLoading();
        WaInAppBrowsingActivity waInAppBrowsingActivity = this.A00;
        waInAppBrowsingActivity.A3A(waInAppBrowsingActivity.getString(R.string.str1b8a), true);
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i2, SafeBrowsingResponse safeBrowsingResponse) {
        super.onSafeBrowsingHit(webView, webResourceRequest, i2, safeBrowsingResponse);
        Log.e(AnonymousClass000.A0h(webView.getUrl(), AnonymousClass000.A0r("WaInappBrowsingActivity/onSafeBrowsingHit: Unsafe page hit: ")));
        WaInAppBrowsingActivity waInAppBrowsingActivity = this.A00;
        Intent A09 = C13680ns.A09();
        String stringExtra = waInAppBrowsingActivity.getIntent().getStringExtra("webview_callback");
        if (stringExtra != null) {
            A09.putExtra("webview_callback", stringExtra);
        }
        waInAppBrowsingActivity.A36(0, A09);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (URLUtil.isHttpsUrl(str)) {
            return super.shouldInterceptRequest(webView, str);
        }
        Log.e(C13680ns.A0h("WaInappBrowsingActivity/shouldInterceptRequest: Cannot open resource trough a not encrypted channel: ", str));
        return new WebResourceResponse("application/octet-stream", WaInAppBrowsingActivity.A08, new ByteArrayInputStream("".getBytes()));
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WaInAppBrowsingActivity waInAppBrowsingActivity = this.A00;
        boolean A03 = WaInAppBrowsingActivity.A03(webView, waInAppBrowsingActivity, str);
        if (!A03) {
            waInAppBrowsingActivity.A38(waInAppBrowsingActivity.getString(R.string.str1b8b));
            waInAppBrowsingActivity.A39("");
        }
        return A03;
    }
}

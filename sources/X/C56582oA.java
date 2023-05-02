package X;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.obwhatsapp.R;
import com.obwhatsapp.support.faq.FaqItemActivity;

/* renamed from: X.2oA  reason: invalid class name and case insensitive filesystem */
public class C56582oA extends WebViewClient {
    public final /* synthetic */ FaqItemActivity A00;

    public C56582oA(FaqItemActivity faqItemActivity) {
        this.A00 = faqItemActivity;
    }

    public final boolean A00(Uri uri) {
        if (uri.toString().startsWith("tel:")) {
            this.A00.startActivity(new Intent("android.intent.action.DIAL", uri));
            return true;
        }
        FaqItemActivity faqItemActivity = this.A00;
        if (!"ombudsman".equals(uri.getHost())) {
            return false;
        }
        if (faqItemActivity.A0C.A0E(C16620tM.A02, 2341)) {
            Class AAo = faqItemActivity.A04.A03().AAo();
            if (AAo == null) {
                return true;
            }
            faqItemActivity.startActivity(new Intent(faqItemActivity, AAo));
            return true;
        }
        C32241fu A002 = C32241fu.A00(faqItemActivity);
        A002.A01(R.string.str0f4a);
        A002.A0F(faqItemActivity, (AnonymousClass023) null, R.string.str0e87);
        A002.A00();
        return true;
    }

    public void onPageFinished(WebView webView, String str) {
        AnonymousClass39V r0 = this.A00.A05;
        if (r0 != null) {
            r0.A00();
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A00(webResourceRequest.getUrl());
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A00(Uri.parse(str));
    }
}

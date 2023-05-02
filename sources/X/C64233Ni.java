package X;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.obwhatsapp.inappsupport.ui.FaqItemActivityV2;

/* renamed from: X.3Ni  reason: invalid class name and case insensitive filesystem */
public class C64233Ni extends WebViewClient {
    public final /* synthetic */ FaqItemActivityV2 A00;

    public C64233Ni(FaqItemActivityV2 faqItemActivityV2) {
        this.A00 = faqItemActivityV2;
    }

    public void onPageFinished(WebView webView, String str) {
        this.A00.A00.A00();
    }
}

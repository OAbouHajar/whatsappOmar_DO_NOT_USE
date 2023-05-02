package X;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Aj  reason: invalid class name and case insensitive filesystem */
public class C23071Aj {
    public static final Map A05;
    public final C19980zJ A00;
    public final C14870pt A01;
    public final AnonymousClass01V A02;
    public final AnonymousClass013 A03;
    public final C18160wF A04;

    static {
        HashMap hashMap = new HashMap();
        A05 = hashMap;
        hashMap.put("terms-of-service", "https://www.whatsapp.com/legal/#terms-of-service");
        hashMap.put("privacy-policy", "https://www.whatsapp.com/legal/#privacy-policy");
        hashMap.put("end-to-end-encryption", "https://faq.whatsapp.com/general/28030015/");
        hashMap.put("facebook-companies", "https://www.facebook.com/help/111814505650678");
        hashMap.put("how-whatsapp-works-with-the-facebook-companies", "https://faq.whatsapp.com/general/26000112/");
        hashMap.put("privacy-policy-managing-and-deleting-your-information", "https://www.whatsapp.com/legal/#privacy-policy-managing-and-deleting-your-information");
        hashMap.put("privacy-policy-our-global-operations", "https://www.whatsapp.com/legal/#privacy-policy-our-global-operations");
        hashMap.put("terms-of-service-age", "https://www.whatsapp.com/legal/#terms-of-service-age");
        hashMap.put("cookies", "https://www.whatsapp.com/legal/#cookies");
    }

    public C23071Aj(C19980zJ r1, C14870pt r2, AnonymousClass01V r3, AnonymousClass013 r4, C18160wF r5) {
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }

    public Uri A00(String str) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        AnonymousClass013 r2 = this.A03;
        buildUpon.appendQueryParameter("lg", r2.A06());
        buildUpon.appendQueryParameter("lc", r2.A05());
        buildUpon.appendQueryParameter("eea", this.A04.A04() ? "1" : "0");
        return buildUpon.build();
    }
}

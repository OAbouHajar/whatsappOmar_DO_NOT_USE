package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;

/* renamed from: X.5n7  reason: invalid class name and case insensitive filesystem */
public class C114095n7 extends C110695eg {
    public C114845oh A00;
    public String A01 = null;
    public final C23071Aj A02;
    public final C118955vg A03;

    public C114095n7(C23071Aj r10, C16440t3 r11, AnonymousClass013 r12, C18030w2 r13, C14710pd r14, C18300wT r15, C18290wS r16, C1222969a r17, C118955vg r18) {
        super(r11, r12, r13, r14, r15, r16, r17);
        this.A02 = r10;
        this.A03 = r18;
    }

    public void A0E(String str) {
        String A0n;
        String A0n2;
        String A0n3;
        String A0n4;
        String A0n5;
        this.A01 = null;
        if (!TextUtils.isEmpty(str) && this.A07.A03.A09()) {
            try {
                C18450wi.A0H(str, 0);
                Uri parse = Uri.parse(str);
                List<String> pathSegments = parse.getPathSegments();
                if (((pathSegments.size() == 3 && (A0n3 = AnonymousClass000.A0n(pathSegments, 0)) != null && A0n3.equalsIgnoreCase("pay") && (A0n4 = AnonymousClass000.A0n(pathSegments, 1)) != null && A0n4.equalsIgnoreCase("br") && (A0n5 = AnonymousClass000.A0n(pathSegments, 2)) != null && A0n5.equalsIgnoreCase("add-credential")) || (pathSegments.size() == 2 && (A0n = AnonymousClass000.A0n(pathSegments, 0)) != null && A0n.equalsIgnoreCase("br") && (A0n2 = AnonymousClass000.A0n(pathSegments, 1)) != null && A0n2.equalsIgnoreCase("add-credential"))) && (parse.getQueryParameterNames().contains("pushAccountData") || parse.getQueryParameterNames().contains("pushData"))) {
                    Uri parse2 = Uri.parse(str);
                    Set<String> queryParameterNames = parse2.getQueryParameterNames();
                    if (queryParameterNames.contains("pushAccountData") && this.A08.A0C(1601)) {
                        this.A01 = parse2.getQueryParameter("pushAccountData");
                        this.A00 = C114845oh.MASTERCARD;
                        Log.i("Push Prov deeplink received for MasterCard");
                        this.A00.A09(2);
                        return;
                    } else if (queryParameterNames.contains("pushData") && this.A08.A0C(2608)) {
                        this.A01 = parse2.getQueryParameter("pushData");
                        this.A00 = C114845oh.VISA;
                        Log.i("Push Prov deeplink received for VISA");
                        this.A00.A09(2);
                        return;
                    }
                }
            } catch (NullPointerException | UnsupportedOperationException unused) {
                Log.i("Unable to read query param pushAccountDataorpushData");
            }
        }
        super.A0E(str);
    }

    public int A0H(int i2) {
        if (i2 != 0 || !C110115dX.A17(this.A09.A01(), "payment_brazil_nux_dismissed")) {
            C118955vg r2 = this.A03;
            C118915vc r1 = r2.A06;
            if (!r1.A03() || C110105dW.A0i(this.A0A).isEmpty()) {
                if (r1.A03()) {
                    return 2;
                }
                return r2.A05() ? 3 : 1;
            }
        }
        return 0;
    }
}

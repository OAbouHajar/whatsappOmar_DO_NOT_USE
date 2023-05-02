package X;

import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.275  reason: invalid class name */
public class AnonymousClass275 implements C19550yc {
    public final AnonymousClass274 A00;
    public final C17190ug A01;

    public AnonymousClass275(AnonymousClass274 r1, C17190ug r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void APb(String str) {
        StringBuilder sb = new StringBuilder("PrivacySettingsProtocolHelper/onDeliveryFailure iqid=");
        sb.append(str);
        Log.w(sb.toString());
    }

    public void AQe(C28371Vv r2, String str) {
        Log.e("PrivacySettingsProtocolHelper/onError");
    }

    public void AYG(C28371Vv r10, String str) {
        C28371Vv A0H = r10.A0H();
        C28371Vv.A06(A0H, "privacy");
        HashMap hashMap = new HashMap();
        C28371Vv[] r8 = A0H.A03;
        if (r8 != null) {
            for (C28371Vv r6 : r8) {
                C28371Vv.A06(r6, "category");
                String A0N = r6.A0N(FacebookFacade.RequestParameter.NAME, (String) null);
                String A0N2 = r6.A0N("value", (String) null);
                if ("error".equals(A0N2)) {
                    C28371Vv A0H2 = r6.A0H();
                    C28371Vv.A06(A0H2, "error");
                    A0N2 = A0H2.A0N("code", (String) null);
                }
                hashMap.put(A0N, A0N2);
            }
        }
        AnonymousClass274 r2 = this.A00;
        AnonymousClass273 r1 = r2.A00;
        if (r1 != null) {
            r1.A00(3);
        }
        r2.A01.A02(hashMap);
    }
}

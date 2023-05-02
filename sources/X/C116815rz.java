package X;

import com.facebook.redex.IDxObserverShape118S0100000_3_I1;
import com.obwhatsapp.R;

/* renamed from: X.5rz  reason: invalid class name and case insensitive filesystem */
public class C116815rz {
    public String A00;
    public boolean A01;

    public static void A00(AnonymousClass028 r2) {
        C116815rz r1 = new C116815rz();
        r1.A01 = true;
        r2.A0B(r1);
    }

    public static void A01(AnonymousClass028 r2, C16980tz r3) {
        String string = r3.A00.getString(R.string.str13db);
        C116815rz r0 = new C116815rz();
        r0.A00 = string;
        r2.A0B(r0);
    }

    public static void A02(IDxObserverShape118S0100000_3_I1 iDxObserverShape118S0100000_3_I1, Object obj) {
        C14550pN r1 = (C14550pN) iDxObserverShape118S0100000_3_I1.A00;
        C116815rz r2 = (C116815rz) obj;
        r1.Ac1();
        if (!r2.A01) {
            r1.A2h(r2.A00);
        }
    }
}

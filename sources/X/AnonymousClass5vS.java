package X;

import android.text.TextUtils;
import java.math.BigDecimal;

/* renamed from: X.5vS  reason: invalid class name */
public final class AnonymousClass5vS {
    public final AnonymousClass173 A00;
    public final C14710pd A01;
    public final C18300wT A02;

    public AnonymousClass5vS(AnonymousClass173 r1, C14710pd r2, C18300wT r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public C28401Vy A00(String str, String str2, String str3) {
        BigDecimal bigDecimal;
        C28411Vz A012 = this.A00.A01("INR");
        if (!TextUtils.isEmpty(str)) {
            bigDecimal = new BigDecimal(str);
        } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return A012.ADP();
        } else {
            bigDecimal = new BigDecimal(str3);
        }
        return C110115dX.A0C(A012, bigDecimal);
    }

    public void A01(String str) {
        if (str != null) {
            C18300wT r2 = this.A02;
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(r2.A05());
            A0o.append(";");
            r2.A0J(AnonymousClass000.A0h(str, A0o));
        }
    }

    public boolean A02(C30671cl r4, String str) {
        C39901tF r1 = r4.A08;
        if (!(r1 instanceof C111805hR)) {
            return false;
        }
        boolean equals = "p2m".equals(str);
        if ((!"OD_UNSECURED".equals(((C111805hR) r1).A0B)) || equals) {
            return false;
        }
        return this.A01.A0C(1677);
    }
}

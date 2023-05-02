package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0x0  reason: invalid class name and case insensitive filesystem */
public class C18630x0 {
    public final C226718v A00;
    public final C14710pd A01;
    public final Map A02 = new HashMap();

    public C18630x0(C226718v r2, C14710pd r3) {
        this.A01 = r3;
        this.A00 = r2;
    }

    public void A00(int i2, String str, String str2) {
        Map map = this.A02;
        C31081dR r2 = (C31081dR) map.get(str);
        if (r2 == null) {
            C226718v r4 = this.A00;
            C31091dS r3 = new C31091dS(i2);
            if (this.A01.A0E(C16620tM.A02, 1272)) {
                r3.A03 = true;
            }
            r2 = r4.A00(r3, str);
            map.put(str, r2);
        }
        r2.A0D(str2, -1);
    }

    public void A01(String str) {
        C31081dR r1 = (C31081dR) this.A02.get(str);
        if (r1 != null) {
            r1.A07("datasource");
        }
    }

    public void A02(String str) {
        C31081dR r1 = (C31081dR) this.A02.get(str);
        if (r1 != null) {
            r1.A08("datasource");
        }
    }

    public void A03(String str, String str2, String str3) {
        C31081dR r1 = (C31081dR) this.A02.get(str);
        if (r1 != null) {
            r1.A0A(str2, str3, true);
        }
    }

    public void A04(String str, String str2, boolean z2) {
        C31081dR r1 = (C31081dR) this.A02.get(str);
        if (r1 != null) {
            r1.A0B(str2, z2, true);
        }
    }

    public void A05(String str, boolean z2) {
        Map map = this.A02;
        C31081dR r1 = (C31081dR) map.get(str);
        if (r1 != null) {
            short s2 = 3;
            if (z2) {
                s2 = 2;
            }
            r1.A0C(s2);
            map.remove(str);
        }
    }
}

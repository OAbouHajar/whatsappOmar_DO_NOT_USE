package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1MU  reason: invalid class name */
public class AnonymousClass1MU {
    public final C16440t3 A00;
    public final C16490t9 A01;
    public final Map A02 = new HashMap();

    public AnonymousClass1MU(C16440t3 r2, C16490t9 r3) {
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A00(int i2, String str, boolean z2) {
        C75203rm r1 = new C75203rm();
        r1.A02 = Integer.valueOf(i2);
        r1.A04 = (Long) this.A02.get(str);
        r1.A00 = Boolean.valueOf(z2);
        this.A01.A06(r1);
    }

    public void A01(String str, boolean z2) {
        C75203rm r1 = new C75203rm();
        r1.A02 = 5;
        r1.A04 = (Long) this.A02.get(str);
        r1.A00 = Boolean.TRUE;
        r1.A01 = Boolean.valueOf(z2);
        this.A01.A06(r1);
    }
}

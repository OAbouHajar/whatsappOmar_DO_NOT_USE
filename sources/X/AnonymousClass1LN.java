package X;

import java.util.Map;

/* renamed from: X.1LN  reason: invalid class name */
public abstract class AnonymousClass1LN extends C20010zM {
    public final AnonymousClass1L9 A00;

    public AnonymousClass1LN(AnonymousClass1L9 r1) {
        this.A00 = r1;
    }

    public boolean A01(Map map) {
        C18450wi.A0H(map, 0);
        if (map.values().size() != 1) {
            return true;
        }
        C16740tZ r1 = (C16740tZ) C003101j.A01(map.values());
        return !(r1 instanceof C16730tY) || !C38621r6.A10((C16730tY) r1);
    }

    public boolean A02(C14550pN r5, Map map) {
        AnonymousClass29T.A01(r5, 13);
        AnonymousClass1L9 r2 = this.A00;
        if (r2.A03 && r2.A00 == 2) {
            r2.A00 = 3;
            r2.A00(1);
        }
        return true;
    }
}

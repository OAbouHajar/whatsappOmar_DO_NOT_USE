package X;

import java.util.Map;

/* renamed from: X.61h  reason: invalid class name and case insensitive filesystem */
public final class C1203461h implements AnonymousClass1IH {
    public final AnonymousClass013 A00;

    public C1203461h(AnonymousClass013 r1) {
        this.A00 = r1;
    }

    public Class A8z() {
        return C114965ot.class;
    }

    public /* bridge */ /* synthetic */ Object AcV(Enum enumR, Object obj, Map map) {
        String str;
        int i2;
        C35431lv r6 = (C35431lv) obj;
        C114965ot r5 = (C114965ot) enumR;
        boolean A19 = C110115dX.A19(r6, r5);
        int A01 = C110115dX.A01(r5, C115455pm.A00);
        if (A01 != A19) {
            if (A01 == 2) {
                i2 = (int) (r6.A02.A00.doubleValue() * ((double) r6.A00));
            } else if (A01 == 3) {
                i2 = r6.A00;
            } else if (A01 == 4) {
                str = r6.A01.A9G(this.A00, r6.A02.A00);
            } else if (A01 == 5) {
                str = r6.A01.A9I(this.A00, r6.A02.A00, 0);
            } else {
                throw new AnonymousClass2Xe();
            }
            return Integer.valueOf(i2);
        }
        str = ((C35491m1) r6.A01).A04;
        C18450wi.A0B(str);
        return str;
    }
}

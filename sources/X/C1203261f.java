package X;

import java.util.Map;

/* renamed from: X.61f  reason: invalid class name and case insensitive filesystem */
public final class C1203261f implements AnonymousClass1IH {
    public Class A8z() {
        return C114945or.class;
    }

    public /* bridge */ /* synthetic */ Object AcV(Enum enumR, Object obj, Map map) {
        C117015sJ r5 = (C117015sJ) obj;
        C114945or r4 = (C114945or) enumR;
        boolean A19 = C110115dX.A19(r5, r4);
        int A01 = C110115dX.A01(r4, C115435pk.A00);
        if (A01 == A19) {
            return r5.A00;
        }
        if (A01 == 2) {
            return Boolean.valueOf(r5.A02);
        }
        throw new AnonymousClass2Xe();
    }
}

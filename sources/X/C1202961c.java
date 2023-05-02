package X;

import java.util.Map;

/* renamed from: X.61c  reason: invalid class name and case insensitive filesystem */
public final class C1202961c implements AnonymousClass1IH {
    public Class A8z() {
        return C114935oq.class;
    }

    public /* bridge */ /* synthetic */ Object AcV(Enum enumR, Object obj, Map map) {
        C35511m3 r6 = (C35511m3) obj;
        C114935oq r5 = (C114935oq) enumR;
        boolean A19 = C110115dX.A19(r6, r5);
        if (!(r6 instanceof C111765hN)) {
            return null;
        }
        int A01 = C110115dX.A01(r5, C115395pg.A00);
        if (A01 == A19) {
            C35301lh r0 = ((C111765hN) r6).A02;
            if (r0 != null) {
                return r0.A00;
            }
            return null;
        } else if (A01 == 2) {
            return ((C111765hN) r6).A03;
        } else {
            throw new AnonymousClass2Xe();
        }
    }
}

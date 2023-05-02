package X;

/* renamed from: X.4u0  reason: invalid class name and case insensitive filesystem */
public class C99424u0 implements AnonymousClass5OR {
    public boolean A8k(C89494cI r4, C89494cI r5, C84634Lh r6) {
        if (!(r4 instanceof C70163gD) || !(r5 instanceof C70163gD)) {
            return r4.equals(r5);
        }
        C70163gD A02 = r4.A02();
        C70163gD A022 = r5.A02();
        if (A02 == A022) {
            return true;
        }
        Object obj = A02.A00;
        if (obj != null) {
            return obj.equals(A022.A07());
        }
        if (A022.A00 == null) {
            return true;
        }
    }
}

package X;

/* renamed from: X.4uC  reason: invalid class name and case insensitive filesystem */
public class C99544uC implements AnonymousClass5OR {
    public boolean A8k(C89494cI r5, C89494cI r6, C84634Lh r7) {
        if (r6 instanceof C70163gD) {
            r6 = C70163gD.A00(r6);
            if (r6 instanceof C70093g6) {
                return false;
            }
        }
        C70183gF A06 = r6.A06();
        if (r5 instanceof C70163gD) {
            r5 = C70163gD.A00(r5);
            if (r5 instanceof C70093g6) {
                return false;
            }
        }
        for (Object contains : r5.A06().A00) {
            if (!A06.A00.contains(contains)) {
                return false;
            }
        }
        return true;
    }
}

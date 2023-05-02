package X;

/* renamed from: X.4uG  reason: invalid class name and case insensitive filesystem */
public class C99584uG implements AnonymousClass5OR {
    public boolean A8k(C89494cI r5, C89494cI r6, C84634Lh r7) {
        C70153gC r2;
        C70133gA r0;
        String str;
        boolean z2 = r5 instanceof C70153gC;
        boolean z3 = z2;
        boolean z4 = r6 instanceof C70153gC;
        if (!((z4) ^ z3)) {
            return false;
        }
        if (z3) {
            if (z2) {
                r2 = (C70153gC) r5;
                if ((r6 instanceof C70133gA) || (r6 instanceof C70173gE)) {
                    r0 = r6.A05();
                    str = r0.A01;
                } else {
                    if (r6 instanceof C70113g8) {
                        str = ((C70113g8) r6).toString();
                    }
                    str = "";
                }
            }
            throw C70003fx.A00("Expected regexp node");
        }
        if (z4) {
            r2 = (C70153gC) r6;
            if ((r5 instanceof C70133gA) || (r5 instanceof C70173gE)) {
                r0 = r5.A05();
                str = r0.A01;
            } else {
                if (r5 instanceof C70113g8) {
                    str = ((C70113g8) r5).toString();
                }
                str = "";
            }
        }
        throw C70003fx.A00("Expected regexp node");
        return r2.A02.matcher(str).matches();
    }
}

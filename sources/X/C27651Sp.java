package X;

/* renamed from: X.1Sp  reason: invalid class name and case insensitive filesystem */
public final class C27651Sp extends C16580tI {
    public final void A04(String str) {
        C47592Jp r1;
        C47602Jq r0;
        for (C47552Jl r02 : A01()) {
            C42821yj r2 = r02.A00;
            if (r2.A2w.A01()) {
                r2.A2w.A00(false);
            }
            C47572Jn r22 = r2.A2v;
            if (!(r22 == null || (r1 = r22.A0A) == null)) {
                if (!r22.isShowing()) {
                    r22.A06();
                }
                r22.A0G(3);
                if (!(str == null || (r0 = r1.A04) == null)) {
                    r0.A06(str);
                }
            }
        }
    }

    public final void A05(String str) {
        for (C47552Jl r0 : A01()) {
            C42821yj r1 = r0.A00;
            if (r1.A2w.A01()) {
                r1.A2w.A00(false);
            }
            C47572Jn r02 = r1.A2v;
            if (r02 != null) {
                r02.A0K(str);
            }
        }
    }
}

package X;

/* renamed from: X.2a9  reason: invalid class name */
public final class AnonymousClass2a9 {
    public final C15800rs A00;
    public final C17580vJ A01;
    public final AnonymousClass15H A02;
    public final C14710pd A03;

    public AnonymousClass2a9(C15800rs r2, C17580vJ r3, AnonymousClass15H r4, C14710pd r5) {
        C18450wi.A0H(r5, 1);
        C18450wi.A0H(r2, 2);
        C18450wi.A0H(r3, 3);
        C18450wi.A0H(r4, 4);
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final AnonymousClass1ZT A00(C15830rv r6) {
        AnonymousClass1ZX r62;
        AnonymousClass1ZT A012;
        if ((r6 instanceof AnonymousClass1ZX) && (r62 = (AnonymousClass1ZX) r6) != null && this.A03.A0E(C16620tM.A02, 2479) && (A012 = this.A01.A01(r62)) != null) {
            boolean A0C = this.A00.A0C(A012);
            AnonymousClass15H r1 = this.A02;
            boolean A0A = r1.A0A(r62);
            if (A0C) {
                if (!A0A) {
                    r1.A08(r62, true);
                }
                return A012;
            } else if (A0A) {
                r1.A08(r62, false);
                return null;
            }
        }
        return null;
    }
}

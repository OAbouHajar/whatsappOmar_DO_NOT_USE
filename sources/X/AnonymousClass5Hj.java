package X;

/* renamed from: X.5Hj  reason: invalid class name */
public class AnonymousClass5Hj extends C32061fa {
    public C107395Ia A00;
    public C107395Ia A01;
    public AnonymousClass5I1 A02;
    public AnonymousClass5IM A03;
    public C107335Hu A04;

    public AnonymousClass5Hj(C32411gJ r5) {
        AnonymousClass5IM r2;
        C107525In r1;
        C32071fb A0u = AnonymousClass3K3.A0u(r5);
        this.A02 = A0u instanceof AnonymousClass5I1 ? (AnonymousClass5I1) A0u : A0u != null ? new AnonymousClass5I1(C32411gJ.A00(A0u)) : null;
        C32071fb A0C = r5.A0C(1);
        if (A0C == null || (A0C instanceof AnonymousClass5IM)) {
            r2 = (AnonymousClass5IM) A0C;
        } else if (A0C instanceof C107525In) {
            r2 = new AnonymousClass5IM((C107525In) A0C);
        } else {
            throw AnonymousClass000.A0T(AnonymousClass000.A0h(AnonymousClass000.A0d(A0C), AnonymousClass000.A0r("unknown object in factory: ")));
        }
        this.A03 = r2;
        this.A01 = C107395Ia.A01(r5.A0C(2));
        if (r5.A0A() > 4) {
            this.A00 = C107395Ia.A01(C107525In.A00((C107525In) r5.A0C(3)));
            r1 = (C107525In) r5.A0C(4);
        } else if (r5.A0A() > 3) {
            r1 = (C107525In) r5.A0C(3);
            if (r1.A00 == 0) {
                this.A00 = C107395Ia.A01(C107525In.A00(r1));
                return;
            }
        } else {
            return;
        }
        this.A04 = C107335Hu.A01(C32411gJ.A01(r1, true));
    }

    public C32051fZ Agm() {
        C32391gH r3 = new C32391gH(5);
        r3.A02(this.A02);
        r3.A02(this.A03);
        r3.A02(this.A01);
        C107395Ia r2 = this.A00;
        if (r2 != null) {
            C107525In.A03(r2, r3, 0, true);
        }
        C107335Hu r0 = this.A04;
        if (r0 != null) {
            C107525In.A04(r0, r3, true);
        }
        return new C32401gI(r3);
    }
}

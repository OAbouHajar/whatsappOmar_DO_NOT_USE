package X;

/* renamed from: X.5I0  reason: invalid class name */
public class AnonymousClass5I0 extends C32061fa {
    public C32411gJ A00;
    public AnonymousClass5HY A01;
    public AnonymousClass5IC A02;
    public AnonymousClass5II A03;

    public AnonymousClass5I0(C32411gJ r4) {
        C32071fb A0u = AnonymousClass3K3.A0u(r4);
        this.A02 = A0u instanceof AnonymousClass5IC ? (AnonymousClass5IC) A0u : A0u != null ? new AnonymousClass5IC(C32411gJ.A00(A0u)) : null;
        this.A03 = AnonymousClass5II.A00(r4.A0C(1));
        this.A01 = (AnonymousClass5HY) r4.A0C(2);
        if (r4.A0A() > 3) {
            this.A00 = C32411gJ.A01((C107525In) r4.A0C(3), true);
        }
    }

    public C32051fZ Agm() {
        C32391gH r3 = new C32391gH(4);
        r3.A02(this.A02);
        r3.A02(this.A03);
        r3.A02(this.A01);
        C32411gJ r2 = this.A00;
        if (r2 != null) {
            C107525In.A03(r2, r3, 0, true);
        }
        return new C32401gI(r3);
    }
}

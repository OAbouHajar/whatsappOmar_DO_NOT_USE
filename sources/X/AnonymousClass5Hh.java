package X;

/* renamed from: X.5Hh  reason: invalid class name */
public class AnonymousClass5Hh extends C32061fa {
    public C107395Ia A00;
    public AnonymousClass5ID A01;

    public AnonymousClass5Hh(C32411gJ r3) {
        this.A00 = C107395Ia.A01(AnonymousClass3K3.A0u(r3));
        if (r3.A0A() > 1) {
            this.A01 = AnonymousClass5ID.A00(AnonymousClass5IZ.A00(C107525In.A00((C107525In) r3.A0C(1))));
        }
    }

    public C32051fZ Agm() {
        C32391gH A0v = AnonymousClass3K3.A0v();
        A0v.A02(this.A00);
        AnonymousClass5ID r2 = this.A01;
        if (r2 != null) {
            C107525In.A03(r2, A0v, 0, true);
        }
        return new C32401gI(A0v);
    }
}

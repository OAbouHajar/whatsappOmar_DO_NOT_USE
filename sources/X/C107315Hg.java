package X;

/* renamed from: X.5Hg  reason: invalid class name and case insensitive filesystem */
public class C107315Hg extends C32061fa {
    public C107295He A00;
    public C107325Ht A01;

    public C107315Hg(C32411gJ r3) {
        C32071fb A0u = AnonymousClass3K3.A0u(r3);
        this.A00 = A0u instanceof C107295He ? (C107295He) A0u : A0u != null ? new C107295He(AnonymousClass5IZ.A00(A0u)) : null;
        if (r3.A0A() == 2) {
            C32411gJ A012 = C32411gJ.A01((C107525In) r3.A0C(1), true);
            this.A01 = A012 != null ? new C107325Ht(C32411gJ.A00(A012)) : null;
        }
    }

    public C32051fZ Agm() {
        C32391gH A0v = AnonymousClass3K3.A0v();
        A0v.A02(this.A00);
        C107325Ht r2 = this.A01;
        if (r2 != null) {
            C107525In.A03(r2, A0v, 0, true);
        }
        return new C32401gI(A0v);
    }
}

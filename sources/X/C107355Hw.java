package X;

/* renamed from: X.5Hw  reason: invalid class name and case insensitive filesystem */
public class C107355Hw extends C32061fa {
    public final C32071fb A00;
    public final C32041fY A01;

    public C107355Hw(C32411gJ r2) {
        this.A01 = C32041fY.A00(AnonymousClass3K3.A0u(r2));
        this.A00 = C107525In.A00(C107525In.A01(AnonymousClass3K4.A0h(r2)));
    }

    public static C107355Hw A00(Object obj) {
        if (obj instanceof C107355Hw) {
            return (C107355Hw) obj;
        }
        if (obj != null) {
            return new C107355Hw(C32411gJ.A00(obj));
        }
        return null;
    }

    public C32051fZ Agm() {
        C32391gH A0v = AnonymousClass3K3.A0v();
        A0v.A02(this.A01);
        C107525In.A03(this.A00, A0v, 0, true);
        return new C32401gI(A0v);
    }
}

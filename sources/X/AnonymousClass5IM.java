package X;

/* renamed from: X.5IM  reason: invalid class name */
public class AnonymousClass5IM extends C32061fa implements AnonymousClass5NM {
    public int A00;
    public C32071fb A01;

    public AnonymousClass5IM() {
        this.A00 = 0;
        this.A01 = C107275Hc.A00;
    }

    public AnonymousClass5IM(C107525In r3) {
        C32071fb r1;
        int i2 = r3.A00;
        this.A00 = i2;
        if (i2 != 0) {
            if (i2 == 1) {
                C32411gJ A012 = C32411gJ.A01(r3, false);
                r1 = A012 != null ? new AnonymousClass5Hh(C32411gJ.A00(A012)) : null;
                this.A01 = r1;
            } else if (i2 != 2) {
                throw AnonymousClass000.A0T(C13680ns.A0c(i2, "Unknown tag encountered: "));
            }
        }
        r1 = C107275Hc.A00;
        this.A01 = r1;
    }

    public C32051fZ Agm() {
        return new C107625Ix(this.A01, this.A00, false);
    }
}

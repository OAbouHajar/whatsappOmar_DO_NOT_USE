package X;

/* renamed from: X.5Hq  reason: invalid class name */
public class AnonymousClass5Hq extends C32061fa {
    public C32411gJ A00;
    public C107335Hu A01;

    public AnonymousClass5Hq(C32411gJ r3) {
        if (r3.A0A() < 2 || r3.A0A() > 3) {
            throw AnonymousClass000.A0T(AnonymousClass000.A0l(AnonymousClass000.A0r("Bad sequence size: "), r3.A0A()));
        }
        this.A00 = r3;
    }

    public C107335Hu A03() {
        if (this.A01 == null) {
            C32411gJ r2 = this.A00;
            if (r2.A0A() == 3) {
                this.A01 = C107335Hu.A01(r2.A0C(2));
            }
        }
        return this.A01;
    }

    public C32051fZ Agm() {
        return this.A00;
    }
}

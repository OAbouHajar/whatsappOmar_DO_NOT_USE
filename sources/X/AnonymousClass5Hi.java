package X;

/* renamed from: X.5Hi  reason: invalid class name */
public class AnonymousClass5Hi extends C32061fa {
    public C32071fb A00;
    public C32041fY A01;

    public AnonymousClass5Hi(C32411gJ r3) {
        if (r3.A0A() == 2) {
            this.A01 = C32041fY.A00(AnonymousClass3K3.A0u(r3));
            this.A00 = AnonymousClass3K4.A0h(r3);
            return;
        }
        throw AnonymousClass000.A0T(AnonymousClass000.A0l(AnonymousClass000.A0r("Bad sequence size: "), r3.A0A()));
    }

    public C32051fZ Agm() {
        C32391gH A0v = AnonymousClass3K3.A0v();
        A0v.A02(this.A01);
        return AnonymousClass3K3.A0x(this.A00, A0v);
    }
}

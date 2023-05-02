package X;

/* renamed from: X.5II  reason: invalid class name */
public class AnonymousClass5II extends C32061fa {
    public C32071fb A00;
    public C32041fY A01;

    public AnonymousClass5II(C32041fY r1) {
        this.A01 = r1;
    }

    public AnonymousClass5II(C32071fb r1, C32041fY r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public AnonymousClass5II(C32411gJ r4) {
        if (r4.A0A() < 1 || r4.A0A() > 2) {
            throw AnonymousClass000.A0T(AnonymousClass000.A0l(AnonymousClass000.A0r("Bad sequence size: "), r4.A0A()));
        }
        this.A01 = C32041fY.A00(AnonymousClass3K3.A0u(r4));
        this.A00 = r4.A0A() == 2 ? r4.A0C(1) : null;
    }

    public static AnonymousClass5II A00(Object obj) {
        if (obj instanceof AnonymousClass5II) {
            return (AnonymousClass5II) obj;
        }
        if (obj != null) {
            return new AnonymousClass5II(C32411gJ.A00(obj));
        }
        return null;
    }

    public C32051fZ Agm() {
        C32391gH A0v = AnonymousClass3K3.A0v();
        A0v.A02(this.A01);
        C32071fb r0 = this.A00;
        if (r0 != null) {
            A0v.A02(r0);
        }
        return new C32401gI(A0v);
    }
}

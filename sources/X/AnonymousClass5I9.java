package X;

/* renamed from: X.5I9  reason: invalid class name */
public class AnonymousClass5I9 extends C32061fa {
    public C32071fb A00;
    public C32041fY A01;

    public AnonymousClass5I9(C32071fb r1, C32041fY r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public AnonymousClass5I9(C32411gJ r2) {
        this.A01 = (C32041fY) AnonymousClass3K3.A0u(r2);
        this.A00 = AnonymousClass3K4.A0h(r2);
    }

    public static AnonymousClass5I9 A00(Object obj) {
        if (obj instanceof AnonymousClass5I9) {
            return (AnonymousClass5I9) obj;
        }
        if (obj != null) {
            return new AnonymousClass5I9(C32411gJ.A00(obj));
        }
        throw AnonymousClass000.A0T("null value in getInstance()");
    }

    public C32051fZ Agm() {
        C32391gH A0v = AnonymousClass3K3.A0v();
        A0v.A02(this.A01);
        return AnonymousClass3K3.A0x(this.A00, A0v);
    }
}

package X;

/* renamed from: X.5I5  reason: invalid class name */
public class AnonymousClass5I5 extends C32061fa {
    public static final C32041fY A02 = AnonymousClass3K3.A0w("1.3.6.1.5.5.7.48.2");
    public static final C32041fY A03 = AnonymousClass3K3.A0w("1.3.6.1.5.5.7.48.1");
    public C32041fY A00;
    public AnonymousClass5IP A01;

    public AnonymousClass5I5(C32411gJ r3) {
        if (r3.A0A() == 2) {
            this.A00 = C32041fY.A00(AnonymousClass3K3.A0u(r3));
            this.A01 = AnonymousClass5IP.A00(AnonymousClass3K4.A0h(r3));
            return;
        }
        throw AnonymousClass000.A0T("wrong number of elements in sequence");
    }

    public C32051fZ Agm() {
        C32391gH A0v = AnonymousClass3K3.A0v();
        A0v.A02(this.A00);
        return AnonymousClass3K3.A0x(this.A01, A0v);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("AccessDescription: Oid(");
        A0r.append(this.A00.A01);
        return AnonymousClass000.A0h(")", A0r);
    }
}

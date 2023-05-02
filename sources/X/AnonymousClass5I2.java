package X;

/* renamed from: X.5I2  reason: invalid class name */
public class AnonymousClass5I2 extends C32061fa {
    public C32411gJ A00;
    public AnonymousClass5HY A01;
    public AnonymousClass5II A02;
    public AnonymousClass5I3 A03;

    public AnonymousClass5I2(C32411gJ r3) {
        this.A00 = r3;
        if (r3.A0A() == 3) {
            this.A03 = AnonymousClass5I3.A00(AnonymousClass3K3.A0u(r3));
            this.A02 = AnonymousClass5II.A00(AnonymousClass3K4.A0h(r3));
            this.A01 = AnonymousClass5HY.A00(r3.A0C(2));
            return;
        }
        throw AnonymousClass000.A0T("sequence wrong size for a certificate");
    }

    public static AnonymousClass5I2 A00(Object obj) {
        if (obj instanceof AnonymousClass5I2) {
            return (AnonymousClass5I2) obj;
        }
        if (obj != null) {
            return new AnonymousClass5I2(C32411gJ.A00(obj));
        }
        return null;
    }

    public C32051fZ Agm() {
        return this.A00;
    }
}

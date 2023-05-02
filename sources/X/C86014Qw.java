package X;

/* renamed from: X.4Qw  reason: invalid class name and case insensitive filesystem */
public class C86014Qw {
    public C89254bq A00;
    public byte[] A01;

    public C86014Qw(C89254bq r1, byte[] bArr) {
        this.A01 = bArr;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WtCertificateEntry{certData=");
        A0r.append(C32311g7.A03(this.A01));
        A0r.append(", wtExtensions=");
        A0r.append(this.A00);
        return AnonymousClass000.A0k(A0r);
    }
}

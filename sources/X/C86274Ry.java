package X;

/* renamed from: X.4Ry  reason: invalid class name and case insensitive filesystem */
public class C86274Ry {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C86274Ry(String str, String str2, String str3, int i2, int i3, int i4) {
        this.A00 = i2;
        this.A04 = str;
        this.A02 = i3;
        this.A01 = i4;
        this.A05 = str2;
        this.A03 = str3;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamsysMMSUploadRequest{mediaType=");
        A0r.append(this.A00);
        A0r.append(", filePath='");
        char A002 = AnonymousClass3K3.A00(this.A04, A0r);
        A0r.append(", uploadType=");
        A0r.append(this.A02);
        A0r.append(", uploadOptions=");
        A0r.append(this.A01);
        A0r.append(", transferOptions=");
        A0r.append(7);
        A0r.append(", loggingId='");
        A0r.append(this.A05);
        A0r.append(A002);
        A0r.append(", connBlockJSONStr='");
        A0r.append(this.A03);
        A0r.append(A002);
        return AnonymousClass000.A0k(A0r);
    }
}

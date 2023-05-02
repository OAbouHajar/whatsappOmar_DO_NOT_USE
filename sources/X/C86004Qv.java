package X;

/* renamed from: X.4Qv  reason: invalid class name and case insensitive filesystem */
public class C86004Qv {
    public final String A00;
    public final String A01;

    public C86004Qv(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("EncFileInfo{remotePath='");
        char A002 = AnonymousClass3K3.A00(this.A01, A0r);
        A0r.append(", ivBase64='");
        A0r.append(this.A00);
        A0r.append(A002);
        return AnonymousClass000.A0k(A0r);
    }
}

package X;

/* renamed from: X.4RG  reason: invalid class name */
public class AnonymousClass4RG {
    public final String A00;
    public final String A01;
    public final String A02;

    public AnonymousClass4RG(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("KeyInfo{version='");
        char A002 = AnonymousClass3K3.A00(this.A02, A0r);
        A0r.append(", accountHashBase64='");
        A0r.append(this.A00);
        A0r.append(A002);
        A0r.append(", serverSaltBase64='");
        A0r.append(this.A01);
        A0r.append(A002);
        return AnonymousClass000.A0k(A0r);
    }
}

package X;

/* renamed from: X.4RY  reason: invalid class name */
public class AnonymousClass4RY {
    public final int A00;
    public final AnonymousClass4M7 A01;
    public final String A02;
    public final String A03;

    public AnonymousClass4RY(AnonymousClass4M7 r1, String str, String str2, int i2) {
        this.A00 = i2;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("CollectionError{code=");
        A0r.append(this.A00);
        A0r.append(", text='");
        A0r.append(this.A03);
        A0r.append(", collection='");
        A0r.append(this.A02);
        return AnonymousClass000.A0k(A0r);
    }
}

package X;

/* renamed from: X.0dl  reason: invalid class name and case insensitive filesystem */
public class C08510dl implements C12660kl {
    public final int A00;
    public final AnonymousClass0HR A01;
    public final String A02;
    public final boolean A03;

    public C08510dl(AnonymousClass0HR r1, String str, int i2, boolean z2) {
        this.A02 = str;
        this.A00 = i2;
        this.A01 = r1;
        this.A03 = z2;
    }

    public C13150lY Agn(AnonymousClass0Ak r2, C08360dV r3) {
        return new C08260dL(r2, this, r3);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ShapePath{name=");
        A0r.append(this.A02);
        A0r.append(", index=");
        A0r.append(this.A00);
        return AnonymousClass000.A0k(A0r);
    }
}

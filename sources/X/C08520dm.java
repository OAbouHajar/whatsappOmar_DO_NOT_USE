package X;

/* renamed from: X.0dm  reason: invalid class name and case insensitive filesystem */
public class C08520dm implements C12660kl {
    public final AnonymousClass0HT A00;
    public final C13230lg A01;
    public final C13230lg A02;
    public final String A03;
    public final boolean A04;

    public C08520dm(AnonymousClass0HT r1, C13230lg r2, C13230lg r3, String str, boolean z2) {
        this.A03 = str;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = z2;
    }

    public C13150lY Agn(AnonymousClass0Ak r2, C08360dV r3) {
        return new C08290dO(r2, this, r3);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("RectangleShape{position=");
        A0r.append(this.A01);
        A0r.append(", size=");
        A0r.append(this.A02);
        return AnonymousClass000.A0k(A0r);
    }
}

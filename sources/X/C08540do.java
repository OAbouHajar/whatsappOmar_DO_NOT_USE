package X;

/* renamed from: X.0do  reason: invalid class name and case insensitive filesystem */
public class C08540do implements C12660kl {
    public final AnonymousClass0HT A00;
    public final AnonymousClass0HT A01;
    public final AnonymousClass0HT A02;
    public final AnonymousClass0JW A03;
    public final String A04;
    public final boolean A05;

    public C08540do(AnonymousClass0HT r1, AnonymousClass0HT r2, AnonymousClass0HT r3, AnonymousClass0JW r4, String str, boolean z2) {
        this.A04 = str;
        this.A03 = r4;
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = z2;
    }

    public C13150lY Agn(AnonymousClass0Ak r2, C08360dV r3) {
        return new C08240dJ(this, r3);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Trim Path: {start: ");
        A0r.append(this.A02);
        A0r.append(", end: ");
        A0r.append(this.A00);
        A0r.append(", offset: ");
        A0r.append(this.A01);
        return AnonymousClass000.A0h("}", A0r);
    }
}

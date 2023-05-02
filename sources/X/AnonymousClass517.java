package X;

/* renamed from: X.517  reason: invalid class name */
public class AnonymousClass517 implements C49482Ti {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public AnonymousClass517(String str, int i2, int i3, long j2, boolean z2, boolean z3) {
        this.A02 = j2;
        this.A03 = str;
        this.A00 = i2;
        this.A01 = i3;
        this.A05 = z2;
        this.A04 = z3;
    }

    public boolean A8a(C49482Ti r4) {
        if (r4 instanceof AnonymousClass517) {
            AnonymousClass517 r42 = (AnonymousClass517) r4;
            return AnonymousClass1ZW.A0F(this.A03, r42.A03) && this.A00 == r42.A00 && this.A01 == r42.A01 && this.A05 == r42.A05 && this.A04 == r42.A04;
        }
    }

    public long AFd() {
        return this.A02;
    }

    public int AH0() {
        return 1;
    }
}

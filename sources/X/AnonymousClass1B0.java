package X;

/* renamed from: X.1B0  reason: invalid class name */
public class AnonymousClass1B0 {
    public final C16490t9 A00;

    public AnonymousClass1B0(C16490t9 r1) {
        this.A00 = r1;
    }

    public void A00(int i2, long j2, long j3, long j4, long j5, long j6, boolean z2, boolean z3) {
        C75743se r2 = new C75743se();
        r2.A03 = Integer.valueOf(i2);
        r2.A02 = Double.valueOf((double) (Math.round(((double) j2) / 1000.0d) * 1000));
        r2.A07 = Long.valueOf(Math.round(((double) j3) / 1000.0d) * 1000);
        r2.A00 = Boolean.valueOf(z2);
        r2.A04 = 0;
        r2.A05 = Long.valueOf(j4);
        r2.A06 = Long.valueOf(j5);
        r2.A01 = Boolean.valueOf(z3);
        r2.A08 = Long.valueOf(j6);
        this.A00.A05(r2);
    }
}

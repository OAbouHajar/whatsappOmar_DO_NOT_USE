package X;

/* renamed from: X.0t5  reason: invalid class name and case insensitive filesystem */
public class C16450t5 {
    public final C16570tH A00;
    public final C16600tK A01;
    public final C16490t9 A02;

    public C16450t5(C16570tH r1, C16600tK r2, C16490t9 r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void A00(int i2, int i3, int i4, int i5, long j2, boolean z2, boolean z3) {
        C75733sd r2 = new C75733sd();
        r2.A07 = Long.valueOf(j2);
        r2.A03 = Integer.valueOf(i2);
        r2.A06 = Long.valueOf((long) i4);
        r2.A04 = Integer.valueOf(i3);
        if (this.A00.A00) {
            r2.A02 = 1;
        } else {
            r2.A02 = 2;
        }
        r2.A01 = Boolean.valueOf(this.A01.A08());
        r2.A00 = Boolean.valueOf(z2);
        r2.A08 = Long.valueOf((long) i5);
        if (z3) {
            r2.A05 = 0;
        } else {
            r2.A05 = 1;
        }
        this.A02.A06(r2);
    }

    public void A01(int i2, long j2, long j3, long j4) {
        C16560tG r3 = new C16560tG();
        r3.A03 = Integer.valueOf(i2);
        r3.A04 = Long.valueOf(j2);
        r3.A06 = Long.valueOf(j3);
        r3.A05 = Long.valueOf(j4);
        if (this.A00.A00) {
            r3.A01 = 1;
        } else {
            r3.A01 = 2;
        }
        r3.A00 = Boolean.valueOf(this.A01.A08());
        r3.A02 = 1;
        this.A02.A06(r3);
    }
}

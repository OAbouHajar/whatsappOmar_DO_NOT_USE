package X;

/* renamed from: X.4V3  reason: invalid class name */
public final class AnonymousClass4V3 {
    public int A00;
    public int A01;
    public int A02;
    public C90184df A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public AnonymousClass4V3(C90184df r1) {
        this.A03 = r1;
    }

    public void A00(int i2) {
        this.A04 |= AnonymousClass000.A1Q(i2);
        this.A01 += i2;
    }

    public void A01(int i2) {
        boolean z2 = true;
        if (!this.A06 || this.A00 == 4) {
            this.A04 = true;
            this.A06 = true;
            this.A00 = i2;
            return;
        }
        if (i2 != 4) {
            z2 = false;
        }
        C90524eJ.A03(z2);
    }
}

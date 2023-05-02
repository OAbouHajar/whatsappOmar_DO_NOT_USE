package X;

/* renamed from: X.08D  reason: invalid class name */
public class AnonymousClass08D {
    public int A00 = Integer.MIN_VALUE;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = Integer.MIN_VALUE;
    public boolean A06 = false;
    public boolean A07 = false;

    public void A00(int i2, int i3) {
        this.A05 = i2;
        this.A00 = i3;
        this.A06 = true;
        if (this.A07) {
            if (i3 != Integer.MIN_VALUE) {
                this.A03 = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.A04 = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.A03 = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.A04 = i3;
        }
    }
}

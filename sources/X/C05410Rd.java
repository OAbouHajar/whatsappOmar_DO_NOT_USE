package X;

/* renamed from: X.0Rd  reason: invalid class name and case insensitive filesystem */
public class C05410Rd {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02;
    public float A03;
    public boolean A04 = false;
    public final /* synthetic */ AnonymousClass0XJ A05;

    public C05410Rd(AnonymousClass0XJ r6, float f2, float f3, float f4, float f5) {
        this.A05 = r6;
        this.A02 = f2;
        this.A03 = f3;
        double sqrt = Math.sqrt((double) ((f4 * f4) + (f5 * f5)));
        if (sqrt != 0.0d) {
            this.A00 = (float) (((double) f4) / sqrt);
            this.A01 = (float) (((double) f5) / sqrt);
        }
    }

    public void A00(float f2, float f3) {
        float f4 = f2 - this.A02;
        float f5 = f3 - this.A03;
        double sqrt = Math.sqrt((double) ((f4 * f4) + (f5 * f5)));
        if (sqrt != 0.0d) {
            f4 = (float) (((double) f4) / sqrt);
            f5 = (float) (((double) f5) / sqrt);
        }
        float f6 = this.A00;
        if (f4 == (-f6) && f5 == (-this.A01)) {
            this.A04 = true;
            this.A00 = -f5;
        } else {
            this.A00 = f6 + f4;
            f4 = this.A01 + f5;
        }
        this.A01 = f4;
    }

    public void A01(C05410Rd r5) {
        float f2 = r5.A00;
        float f3 = this.A00;
        if (f2 == (-f3)) {
            float f4 = r5.A01;
            if (f4 == (-this.A01)) {
                this.A04 = true;
                this.A00 = -f4;
                this.A01 = r5.A00;
                return;
            }
        }
        this.A00 = f3 + f2;
        this.A01 += r5.A01;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("(");
        A0r.append(this.A02);
        A0r.append(",");
        A0r.append(this.A03);
        A0r.append(" ");
        A0r.append(this.A00);
        A0r.append(",");
        A0r.append(this.A01);
        return AnonymousClass000.A0h(")", A0r);
    }
}

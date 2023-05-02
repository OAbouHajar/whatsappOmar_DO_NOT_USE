package X;

/* renamed from: X.0QW  reason: invalid class name */
public final class AnonymousClass0QW {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public boolean A04 = false;

    public AnonymousClass0YH A00() {
        return new AnonymousClass0YH(new AnonymousClass020(this.A02, this.A03), new AnonymousClass020(this.A01, this.A00));
    }

    public void A01(AnonymousClass020 r13) {
        if (!this.A04) {
            double d2 = r13.A00;
            this.A02 = d2;
            this.A01 = d2;
            double d3 = r13.A01;
            this.A00 = d3;
            this.A03 = d3;
            this.A04 = true;
        }
        double d4 = r13.A00;
        if (d4 > this.A01) {
            this.A01 = d4;
        } else if (d4 < this.A02) {
            this.A02 = d4;
        }
        double d5 = this.A00;
        double d6 = this.A03;
        double d7 = d5 - d6;
        double A07 = d7 + ((double) AnonymousClass000.A07((d7 > 0.0d ? 1 : (d7 == 0.0d ? 0 : -1))));
        double d8 = r13.A01;
        double d9 = d8 - d6;
        double A072 = d9 + ((double) AnonymousClass000.A07((d9 > 0.0d ? 1 : (d9 == 0.0d ? 0 : -1))));
        double d10 = d5 - d8;
        double A073 = d10 + ((double) AnonymousClass000.A07((d10 > 0.0d ? 1 : (d10 == 0.0d ? 0 : -1))));
        if (Double.compare(A072, A07) <= 0 && Double.compare(A073, A07) <= 0) {
            return;
        }
        if (A072 <= A073) {
            this.A00 = d8;
        } else {
            this.A03 = d8;
        }
    }
}

package X;

/* renamed from: X.0qr  reason: invalid class name and case insensitive filesystem */
public final class C15420qr {
    public long A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public boolean A03 = false;
    public boolean A04 = false;

    public C15260qa A00() {
        long j2 = this.A00;
        if (j2 == 0 && this.A01 == 0 && this.A02 == 0) {
            throw new IllegalArgumentException("Should set at least some max size limit");
        }
        long j3 = this.A01;
        if (j3 == 0) {
            this.A01 = j2;
            j3 = j2;
        }
        long j4 = this.A02;
        if (j4 == 0) {
            this.A02 = j3;
            j4 = j3;
        }
        return new C15260qa(j2, j3, j4, this.A03, this.A04);
    }
}

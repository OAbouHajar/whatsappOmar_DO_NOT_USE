package X;

/* renamed from: X.0Q1  reason: invalid class name */
public class AnonymousClass0Q1 {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05 = 0;
    public long A06 = Long.MIN_VALUE;
    public long A07 = -1;

    public final float A00(long j2) {
        long j3 = this.A06;
        if (j2 < j3) {
            return 0.0f;
        }
        long j4 = this.A07;
        if (j4 < 0 || j2 < j4) {
            float f2 = ((float) (j2 - j3)) / ((float) this.A04);
            if (f2 > 1.0f) {
                f2 = 1.0f;
            } else if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            return f2 * 0.5f;
        }
        float f3 = this.A00;
        float f4 = 1.0f - f3;
        float f5 = ((float) (j2 - j4)) / ((float) this.A02);
        if (f5 > 1.0f) {
            f5 = 1.0f;
        } else if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        return f4 + (f3 * f5);
    }
}

package X;

/* renamed from: X.4aN  reason: invalid class name and case insensitive filesystem */
public class C88364aN {
    public long A00;
    public long A01;
    public long A02;
    public long A03 = 0;
    public long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public C88364aN(long j2, long j3, long j4, long j5, long j6, long j7) {
        this.A06 = j2;
        this.A07 = j3;
        long j8 = j4;
        this.A01 = j8;
        long j9 = j5;
        this.A02 = j9;
        long j10 = j6;
        this.A00 = j10;
        long j11 = j7;
        this.A05 = j11;
        this.A04 = A00(j3, 0, j8, j9, j10, j11);
    }

    public static long A00(long j2, long j3, long j4, long j5, long j6, long j7) {
        if (j5 + 1 >= j6 || j3 + 1 >= j4) {
            return j5;
        }
        long j8 = (long) (((float) (j2 - j3)) * (((float) (j6 - j5)) / ((float) (j4 - j3))));
        return Math.max(j5, Math.min(((j8 + j5) - j7) - (j8 / 20), j6 - 1));
    }
}

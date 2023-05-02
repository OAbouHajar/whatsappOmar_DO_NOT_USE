package X;

/* renamed from: X.4ov  reason: invalid class name and case insensitive filesystem */
public final class C96804ov implements AnonymousClass5UQ {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long[] A05;

    public C96804ov(long[] jArr, int i2, long j2, long j3, long j4) {
        this.A03 = j2;
        this.A00 = i2;
        this.A04 = j3;
        this.A05 = jArr;
        this.A02 = j4;
        this.A01 = j4 != -1 ? j2 + j4 : -1;
    }

    public long ABc() {
        return this.A01;
    }

    public long ABr() {
        return this.A04;
    }

    public AnonymousClass4VV AFq(long j2) {
        long A0T;
        long max;
        long j3;
        long[] jArr = this.A05;
        if (!AnonymousClass000.A1V(jArr)) {
            A0T = 0;
            j3 = this.A03;
            max = (long) this.A00;
        } else {
            long j4 = this.A04;
            A0T = AnonymousClass3K3.A0T(j2, j4);
            double d2 = (((double) A0T) * 100.0d) / ((double) j4);
            double d3 = 0.0d;
            if (d2 > 0.0d) {
                if (d2 >= 100.0d) {
                    d3 = 256.0d;
                } else {
                    int i2 = (int) d2;
                    C90524eJ.A01(jArr);
                    double d4 = (double) jArr[i2];
                    d3 = d4 + ((d2 - ((double) i2)) * ((i2 == 99 ? 256.0d : (double) jArr[i2 + 1]) - d4));
                }
            }
            long j5 = this.A02;
            max = Math.max((long) this.A00, Math.min(Math.round((d3 / 256.0d) * ((double) j5)), j5 - 1));
            j3 = this.A03;
        }
        C89174bi r1 = new C89174bi(A0T, j3 + max);
        return new AnonymousClass4VV(r1, r1);
    }

    public long AGZ(long j2) {
        long j3 = j2 - this.A03;
        long[] jArr = this.A05;
        if (!AnonymousClass000.A1V(jArr) || j3 <= ((long) this.A00)) {
            return 0;
        }
        C90524eJ.A01(jArr);
        double d2 = (((double) j3) * 256.0d) / ((double) this.A02);
        int A042 = AnonymousClass3C1.A04(jArr, (long) d2, true);
        long j4 = this.A04;
        long j5 = (j4 * ((long) A042)) / 100;
        long j6 = jArr[A042];
        int i2 = A042 + 1;
        long j7 = (j4 * ((long) i2)) / 100;
        long j8 = A042 == 99 ? 256 : jArr[i2];
        return j5 + Math.round((j6 == j8 ? 0.0d : (d2 - ((double) j6)) / ((double) (j8 - j6))) * ((double) (j7 - j5)));
    }

    public boolean AJe() {
        return AnonymousClass000.A1V(this.A05);
    }
}

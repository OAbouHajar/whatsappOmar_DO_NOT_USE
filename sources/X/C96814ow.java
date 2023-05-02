package X;

import android.util.Pair;

/* renamed from: X.4ow  reason: invalid class name and case insensitive filesystem */
public final class C96814ow implements AnonymousClass5UQ {
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    public C96814ow(long[] jArr, long[] jArr2, long j2) {
        this.A01 = jArr;
        this.A02 = jArr2;
        this.A00 = j2 == -9223372036854775807L ? C90604eR.A01(jArr2[jArr2.length - 1]) : j2;
    }

    public static Pair A00(long[] jArr, long[] jArr2, long j2) {
        Long valueOf;
        Long valueOf2;
        int A04 = AnonymousClass3C1.A04(jArr, j2, true);
        long j3 = jArr[A04];
        long j4 = jArr2[A04];
        int i2 = A04 + 1;
        if (i2 == jArr.length) {
            valueOf = Long.valueOf(j3);
            valueOf2 = Long.valueOf(j4);
        } else {
            long j5 = jArr[i2];
            long j6 = jArr2[i2];
            double d2 = j5 == j3 ? 0.0d : (((double) j2) - ((double) j3)) / ((double) (j5 - j3));
            valueOf = Long.valueOf(j2);
            valueOf2 = Long.valueOf(((long) (d2 * ((double) (j6 - j4)))) + j4);
        }
        return Pair.create(valueOf, valueOf2);
    }

    public long ABc() {
        return -1;
    }

    public long ABr() {
        return this.A00;
    }

    public AnonymousClass4VV AFq(long j2) {
        Pair A002 = A00(this.A02, this.A01, C90604eR.A02(AnonymousClass3K3.A0T(j2, this.A00)));
        C89174bi r1 = new C89174bi(C90604eR.A01(C13700nu.A01(A002.first)), C13700nu.A01(A002.second));
        return new AnonymousClass4VV(r1, r1);
    }

    public long AGZ(long j2) {
        return C90604eR.A01(C13700nu.A01(A00(this.A01, this.A02, j2).second));
    }

    public boolean AJe() {
        return true;
    }
}

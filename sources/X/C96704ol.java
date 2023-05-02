package X;

/* renamed from: X.4ol  reason: invalid class name and case insensitive filesystem */
public final class C96704ol implements C32371gD {
    public final long A00;
    public final boolean A01;
    public final long[] A02;
    public final long[] A03;

    public C96704ol(long[] jArr, long[] jArr2, long j2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        C90524eJ.A03(AnonymousClass000.A1R(length, length2));
        boolean A1Q = AnonymousClass000.A1Q(length2);
        this.A01 = A1Q;
        if (!A1Q || jArr2[0] <= 0) {
            this.A02 = jArr;
            this.A03 = jArr2;
        } else {
            int i2 = length2 + 1;
            long[] jArr3 = new long[i2];
            this.A02 = jArr3;
            long[] jArr4 = new long[i2];
            this.A03 = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.A00 = j2;
    }

    public long ABr() {
        return this.A00;
    }

    public AnonymousClass4VV AFq(long j2) {
        if (!this.A01) {
            C89174bi r1 = C89174bi.A02;
            return new AnonymousClass4VV(r1, r1);
        }
        long[] jArr = this.A03;
        int A04 = AnonymousClass3C1.A04(jArr, j2, true);
        long j3 = jArr[A04];
        long[] jArr2 = this.A02;
        C89174bi r4 = new C89174bi(j3, jArr2[A04]);
        if (r4.A01 == j2 || A04 == jArr.length - 1) {
            return new AnonymousClass4VV(r4, r4);
        }
        int i2 = A04 + 1;
        return AnonymousClass4VV.A00(r4, jArr[i2], jArr2[i2]);
    }

    public boolean AJe() {
        return this.A01;
    }
}

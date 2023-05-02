package X;

/* renamed from: X.4ou  reason: invalid class name and case insensitive filesystem */
public final class C96794ou implements AnonymousClass5UQ {
    public final long A00;
    public final long A01;
    public final long[] A02;
    public final long[] A03;

    public C96794ou(long[] jArr, long[] jArr2, long j2, long j3) {
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A01 = j2;
        this.A00 = j3;
    }

    public long ABc() {
        return this.A00;
    }

    public long ABr() {
        return this.A01;
    }

    public AnonymousClass4VV AFq(long j2) {
        long[] jArr = this.A03;
        int A04 = AnonymousClass3C1.A04(jArr, j2, true);
        long j3 = jArr[A04];
        long[] jArr2 = this.A02;
        C89174bi r4 = new C89174bi(j3, jArr2[A04]);
        if (r4.A01 >= j2 || A04 == jArr.length - 1) {
            return new AnonymousClass4VV(r4, r4);
        }
        int i2 = A04 + 1;
        return AnonymousClass4VV.A00(r4, jArr[i2], jArr2[i2]);
    }

    public long AGZ(long j2) {
        return this.A03[AnonymousClass3C1.A04(this.A02, j2, true)];
    }

    public boolean AJe() {
        return true;
    }
}

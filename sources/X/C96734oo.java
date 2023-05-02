package X;

import java.util.Arrays;

/* renamed from: X.4oo  reason: invalid class name and case insensitive filesystem */
public final class C96734oo implements C32371gD {
    public final int A00;
    public final long A01;
    public final int[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long[] A05;

    public C96734oo(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A02 = iArr;
        this.A04 = jArr;
        this.A03 = jArr2;
        this.A05 = jArr3;
        int length = iArr.length;
        this.A00 = length;
        if (length > 0) {
            int i2 = length - 1;
            this.A01 = jArr2[i2] + jArr3[i2];
        }
    }

    public long ABr() {
        return this.A01;
    }

    public AnonymousClass4VV AFq(long j2) {
        long[] jArr = this.A05;
        int A042 = AnonymousClass3C1.A04(jArr, j2, true);
        long j3 = jArr[A042];
        long[] jArr2 = this.A04;
        C89174bi r4 = new C89174bi(j3, jArr2[A042]);
        if (r4.A01 >= j2 || A042 == this.A00 - 1) {
            return new AnonymousClass4VV(r4, r4);
        }
        int i2 = A042 + 1;
        return AnonymousClass4VV.A00(r4, jArr[i2], jArr2[i2]);
    }

    public boolean AJe() {
        return true;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ChunkIndex(length=");
        A0r.append(this.A00);
        A0r.append(", sizes=");
        A0r.append(Arrays.toString(this.A02));
        A0r.append(", offsets=");
        A0r.append(Arrays.toString(this.A04));
        A0r.append(", timeUs=");
        A0r.append(Arrays.toString(this.A05));
        A0r.append(", durationsUs=");
        A0r.append(Arrays.toString(this.A03));
        return AnonymousClass000.A0h(")", A0r);
    }
}

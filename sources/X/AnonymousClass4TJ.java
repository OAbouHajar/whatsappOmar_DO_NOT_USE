package X;

import java.util.Arrays;

/* renamed from: X.4TJ  reason: invalid class name */
public final class AnonymousClass4TJ {
    public int A00;
    public long[] A01 = new long[32];

    public long A00(int i2) {
        if (i2 >= 0 && i2 < this.A00) {
            return this.A01[i2];
        }
        StringBuilder A0r = AnonymousClass000.A0r("Invalid index ");
        A0r.append(i2);
        A0r.append(", size is ");
        throw new IndexOutOfBoundsException(AnonymousClass000.A0l(A0r, this.A00));
    }

    public void A01(long j2) {
        int i2 = this.A00;
        long[] jArr = this.A01;
        if (i2 == jArr.length) {
            jArr = Arrays.copyOf(jArr, i2 << 1);
            this.A01 = jArr;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        jArr[i3] = j2;
    }
}

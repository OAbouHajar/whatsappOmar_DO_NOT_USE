package X;

import android.support.v4.view.MotionEventCompat;

/* renamed from: X.4WE  reason: invalid class name */
public final class AnonymousClass4WE {
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;

    public AnonymousClass4WE(byte[] bArr) {
        this.A03 = bArr;
        this.A02 = bArr.length;
    }

    public int A00(int i2) {
        int i3 = this.A01;
        int i4 = this.A00;
        int min = Math.min(i2, 8 - i4);
        byte[] bArr = this.A03;
        int i5 = i3 + 1;
        int i6 = ((bArr[i3] & 255) >> i4) & (MotionEventCompat.ACTION_MASK >> (8 - min));
        while (min < i2) {
            i6 |= (bArr[i5] & 255) << min;
            min += 8;
            i5++;
        }
        int i7 = i6 & (-1 >>> (32 - i2));
        A01(i2);
        return i7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r0 = r3.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(int r4) {
        /*
            r3 = this;
            int r0 = r4 >> 3
            int r2 = r3.A01
            int r2 = r2 + r0
            r3.A01 = r2
            int r1 = r3.A00
            int r0 = r0 << 3
            int r4 = r4 - r0
            int r1 = r1 + r4
            r3.A00 = r1
            r0 = 7
            if (r1 <= r0) goto L_0x001a
            int r2 = r2 + 1
            r3.A01 = r2
            int r1 = r1 + -8
            r3.A00 = r1
        L_0x001a:
            if (r2 < 0) goto L_0x0029
            int r0 = r3.A02
            if (r2 < r0) goto L_0x0024
            if (r2 != r0) goto L_0x0029
            if (r1 != 0) goto L_0x0029
        L_0x0024:
            r0 = 1
        L_0x0025:
            X.C90524eJ.A04(r0)
            return
        L_0x0029:
            r0 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4WE.A01(int):void");
    }

    public boolean A02() {
        boolean A1R = AnonymousClass000.A1R(((this.A03[this.A01] & 255) >> this.A00) & 1, 1);
        A01(1);
        return A1R;
    }
}

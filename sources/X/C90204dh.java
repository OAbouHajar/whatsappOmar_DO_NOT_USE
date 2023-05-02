package X;

import android.support.v4.view.MotionEventCompat;

/* renamed from: X.4dh  reason: invalid class name and case insensitive filesystem */
public final class C90204dh {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C90204dh() {
        this.A03 = AnonymousClass3C1.A0A;
    }

    public C90204dh(byte[] bArr, int i2) {
        this.A03 = bArr;
        this.A01 = i2;
    }

    public static int A00(C90204dh r2) {
        return ((r2.A01 - r2.A02) << 3) - r2.A00;
    }

    public static int A01(C90204dh r0, int i2, int i3) {
        r0.A08(i2);
        return r0.A04(i3);
    }

    public static long A02(C90204dh r4, long j2) {
        r4.A08(1);
        long A04 = j2 | ((long) (r4.A04(15) << 15)) | ((long) r4.A04(15));
        r4.A08(1);
        return A04;
    }

    public static void A03(C90204dh r1, int i2) {
        if (r1.A0C()) {
            r1.A08(i2);
        }
    }

    public int A04(int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.A00 + i2;
        this.A00 = i3;
        int i4 = 0;
        while (i3 > 8) {
            i3 -= 8;
            this.A00 = i3;
            byte[] bArr = this.A03;
            int i5 = this.A02;
            this.A02 = i5 + 1;
            i4 |= (bArr[i5] & 255) << i3;
        }
        byte[] bArr2 = this.A03;
        int i6 = this.A02;
        int i7 = (-1 >>> (32 - i2)) & (i4 | ((bArr2[i6] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.A00 = 0;
            this.A02 = i6 + 1;
        }
        A06();
        return i7;
    }

    public void A05() {
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 == 8) {
            this.A00 = 0;
            this.A02++;
        }
        A06();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06() {
        /*
            r2 = this;
            int r1 = r2.A02
            if (r1 < 0) goto L_0x0013
            int r0 = r2.A01
            if (r1 < r0) goto L_0x000e
            if (r1 != r0) goto L_0x0013
            int r0 = r2.A00
            if (r0 != 0) goto L_0x0013
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C90524eJ.A04(r0)
            return
        L_0x0013:
            r0 = 0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90204dh.A06():void");
    }

    public void A07(int i2) {
        int i3 = i2 >> 3;
        this.A02 = i3;
        this.A00 = i2 - (i3 << 3);
        A06();
    }

    public void A08(int i2) {
        int i3 = i2 >> 3;
        int i4 = this.A02 + i3;
        this.A02 = i4;
        int i5 = this.A00 + (i2 - (i3 << 3));
        this.A00 = i5;
        if (i5 > 7) {
            this.A02 = i4 + 1;
            this.A00 = i5 - 8;
        }
        A06();
    }

    public void A09(int i2) {
        C90524eJ.A04(AnonymousClass000.A1P(this.A00));
        this.A02 += i2;
        A06();
    }

    public void A0A(byte[] bArr, int i2) {
        int i3 = i2 >> 3;
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr2 = this.A03;
            int i5 = this.A02;
            int i6 = i5 + 1;
            this.A02 = i6;
            byte b2 = bArr2[i5];
            int i7 = this.A00;
            byte b3 = (byte) (b2 << i7);
            bArr[i4] = b3;
            AnonymousClass3K4.A0i((255 & bArr2[i6]) >> (8 - i7), bArr, b3, i4);
        }
        int i8 = i2 & 7;
        if (i8 != 0) {
            byte b4 = (byte) (bArr[i3] & (MotionEventCompat.ACTION_MASK >> i8));
            bArr[i3] = b4;
            int i9 = this.A00;
            if (i9 + i8 > 8) {
                byte[] bArr3 = this.A03;
                int i10 = this.A02;
                this.A02 = i10 + 1;
                b4 = (byte) (b4 | ((bArr3[i10] & 255) << i9));
                bArr[i3] = b4;
                i9 -= 8;
                this.A00 = i9;
            }
            int i11 = i9 + i8;
            this.A00 = i11;
            byte[] bArr4 = this.A03;
            int i12 = this.A02;
            AnonymousClass3K4.A0i((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8)), bArr, b4, i3);
            if (i11 == 8) {
                this.A00 = 0;
                this.A02 = i12 + 1;
            }
            A06();
        }
    }

    public void A0B(byte[] bArr, int i2) {
        C90524eJ.A04(AnonymousClass000.A1P(this.A00));
        System.arraycopy(this.A03, this.A02, bArr, 0, i2);
        this.A02 += i2;
        A06();
    }

    public boolean A0C() {
        boolean A1O = AnonymousClass000.A1O(this.A03[this.A02] & (128 >> this.A00));
        A05();
        return A1O;
    }
}

package X;

import android.support.v4.view.MotionEventCompat;

/* renamed from: X.4UF  reason: invalid class name */
public final class AnonymousClass4UF {
    public int A00;
    public int A01;
    public final byte[] A02;

    public AnonymousClass4UF(byte[] bArr) {
        this.A02 = bArr;
    }

    public int A00() {
        return ((this.A02.length - this.A01) << 3) - this.A00;
    }

    public int A01(int i2) {
        if (i2 <= 0 || i2 > 32 || i2 > A00()) {
            throw AnonymousClass000.A0T(String.valueOf(i2));
        }
        int i3 = this.A00;
        byte b2 = 0;
        if (i3 > 0) {
            int i4 = 8 - i3;
            int i5 = i4;
            if (i2 < i4) {
                i5 = i2;
            }
            int i6 = i4 - i5;
            byte[] bArr = this.A02;
            int i7 = this.A01;
            int i8 = (((MotionEventCompat.ACTION_MASK >> (8 - i5)) << i6) & bArr[i7]) >> i6;
            i2 -= i5;
            i3 += i5;
            this.A00 = i3;
            if (i3 == 8) {
                this.A00 = 0;
                i3 = 0;
                this.A01 = i7 + 1;
            }
            b2 = i8;
            if (i2 <= 0) {
                return b2;
            }
        }
        while (i2 >= 8) {
            byte[] bArr2 = this.A02;
            int i9 = this.A01;
            b2 = (bArr2[i9] & 255) | (b2 << 8);
            this.A01 = i9 + 1;
            i2 -= 8;
        }
        if (i2 <= 0) {
            return b2;
        }
        int i10 = 8 - i2;
        int i11 = (b2 << i2) | ((((MotionEventCompat.ACTION_MASK >> i10) << i10) & this.A02[this.A01]) >> i10);
        this.A00 = i3 + i2;
        return i11;
    }
}

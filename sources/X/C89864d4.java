package X;

import android.support.v4.view.MotionEventCompat;

/* renamed from: X.4d4  reason: invalid class name and case insensitive filesystem */
public class C89864d4 {
    public static final C89864d4 A01 = new C89864d4(33023);
    public int A00;

    public C89864d4(int i2) {
        this.A00 = i2;
    }

    public C89864d4(C107645Iz r8) {
        byte[] bArr = r8.A01;
        int min = Math.min(4, bArr.length - 1);
        int i2 = 0;
        for (int i3 = 0; i3 < min; i3++) {
            i2 |= (255 & bArr[i3]) << (i3 << 3);
        }
        if (min >= 0 && min < 4) {
            i2 |= (((byte) (bArr[min] & (MotionEventCompat.ACTION_MASK << r8.A00))) & 255) << (min << 3);
        }
        this.A00 = i2;
    }
}

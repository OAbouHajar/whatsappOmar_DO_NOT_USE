package X;

import android.support.v4.view.MotionEventCompat;

/* renamed from: X.4cc  reason: invalid class name and case insensitive filesystem */
public final class C89654cc {
    public static final int[] A00 = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static void A00(C90504eH r2, int i2) {
        r2.A0Q(7);
        byte[] bArr = r2.A02;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & MotionEventCompat.ACTION_MASK);
        bArr[5] = (byte) ((i2 >> 8) & MotionEventCompat.ACTION_MASK);
        bArr[6] = (byte) (i2 & MotionEventCompat.ACTION_MASK);
    }
}

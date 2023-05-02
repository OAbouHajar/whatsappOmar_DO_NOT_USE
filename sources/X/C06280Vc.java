package X;

import android.support.v4.view.MotionEventCompat;

/* renamed from: X.0Vc  reason: invalid class name and case insensitive filesystem */
public class C06280Vc {
    public static float A00(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((double) ((f2 + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    public static float A01(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow((double) f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int A02(float f2, int i2, int i3) {
        if (i2 == i3) {
            return i2;
        }
        float f3 = ((float) ((i2 >> 24) & MotionEventCompat.ACTION_MASK)) / 255.0f;
        float A00 = A00(((float) ((i2 >> 16) & MotionEventCompat.ACTION_MASK)) / 255.0f);
        float A002 = A00(((float) ((i2 >> 8) & MotionEventCompat.ACTION_MASK)) / 255.0f);
        float A003 = A00(((float) (i2 & MotionEventCompat.ACTION_MASK)) / 255.0f);
        float A004 = A00(((float) ((i3 >> 16) & MotionEventCompat.ACTION_MASK)) / 255.0f);
        float A005 = A002 + ((A00(((float) ((i3 >> 8) & MotionEventCompat.ACTION_MASK)) / 255.0f) - A002) * f2);
        float A01 = AnonymousClass000.A01(A00(((float) (i3 & MotionEventCompat.ACTION_MASK)) / 255.0f), A003, f2);
        return (Math.round(A01(A00 + ((A004 - A00) * f2)) * 255.0f) << 16) | (Math.round((f3 + (((((float) ((i3 >> 24) & MotionEventCompat.ACTION_MASK)) / 255.0f) - f3) * f2)) * 255.0f) << 24) | (Math.round(A01(A005) * 255.0f) << 8) | Math.round(A01(A01) * 255.0f);
    }
}

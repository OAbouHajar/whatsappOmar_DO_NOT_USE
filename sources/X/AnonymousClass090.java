package X;

import android.graphics.Color;
import android.support.v4.view.MotionEventCompat;
import androidx.core.view.ViewCompat;

/* renamed from: X.090  reason: invalid class name */
public final class AnonymousClass090 {
    public static final ThreadLocal A00 = new ThreadLocal();

    public static double A00(int i2) {
        ThreadLocal threadLocal = A00;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i2);
        int green = Color.green(i2);
        int blue = Color.blue(i2);
        if (dArr.length == 3) {
            double d2 = ((double) red) / 255.0d;
            double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = ((double) green) / 255.0d;
            double pow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            double d4 = ((double) blue) / 255.0d;
            double pow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return dArr[1] / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static double A01(int i2, int i3) {
        if (Color.alpha(i3) == 255) {
            if (Color.alpha(i2) < 255) {
                i2 = A05(i2, i3);
            }
            double A002 = A00(i2) + 0.05d;
            double A003 = A00(i3) + 0.05d;
            return Math.max(A002, A003) / Math.min(A002, A003);
        }
        StringBuilder sb = new StringBuilder("background can not be translucent: #");
        sb.append(Integer.toHexString(i3));
        throw new IllegalArgumentException(sb.toString());
    }

    public static int A02(double d2, double d3, double d4) {
        double d5 = (((3.2406d * d2) + (-1.5372d * d3)) + (-0.4986d * d4)) / 100.0d;
        double d6 = (((-0.9689d * d2) + (1.8758d * d3)) + (0.0415d * d4)) / 100.0d;
        double d7 = (((0.0557d * d2) + (-0.204d * d3)) + (1.057d * d4)) / 100.0d;
        double pow = d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d;
        double pow2 = d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        double pow3 = d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int i2 = 0;
        if (round >= 0) {
            i2 = Math.min(round, MotionEventCompat.ACTION_MASK);
        }
        int round2 = (int) Math.round(pow2 * 255.0d);
        int i3 = 0;
        if (round2 >= 0) {
            i3 = Math.min(round2, MotionEventCompat.ACTION_MASK);
        }
        int round3 = (int) Math.round(pow3 * 255.0d);
        int i4 = 0;
        if (round3 >= 0) {
            i4 = Math.min(round3, MotionEventCompat.ACTION_MASK);
        }
        return Color.rgb(i2, i3, i4);
    }

    public static int A03(float f2, int i2, int i3) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f3) + (((float) Color.alpha(i3)) * f2)), (int) ((((float) Color.red(i2)) * f3) + (((float) Color.red(i3)) * f2)), (int) ((((float) Color.green(i2)) * f3) + (((float) Color.green(i3)) * f2)), (int) ((((float) Color.blue(i2)) * f3) + (((float) Color.blue(i3)) * f2)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A04(float r8, int r9, int r10) {
        /*
            int r0 = android.graphics.Color.alpha(r10)
            r7 = 255(0xff, float:3.57E-43)
            if (r0 != r7) goto L_0x0039
            int r0 = A06(r9, r7)
            double r4 = A01(r0, r10)
            double r2 = (double) r8
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            r0 = -1
            return r0
        L_0x0017:
            r8 = 0
            r6 = 0
        L_0x0019:
            int r0 = r6 + r7
            int r1 = r0 >> 1
            int r0 = A06(r9, r1)
            double r4 = A01(r0, r10)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0036
            r6 = r1
        L_0x002a:
            int r8 = r8 + 1
            r0 = 10
            if (r8 > r0) goto L_0x0038
            int r1 = r7 - r6
            r0 = 1
            if (r1 <= r0) goto L_0x0038
            goto L_0x0019
        L_0x0036:
            r7 = r1
            goto L_0x002a
        L_0x0038:
            return r7
        L_0x0039:
            java.lang.String r0 = "background can not be translucent: #"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r10)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass090.A04(float, int, int):int");
    }

    public static int A05(int i2, int i3) {
        int alpha = Color.alpha(i3);
        int alpha2 = Color.alpha(i2);
        int i4 = 255 - alpha2;
        int i5 = 255 - (((255 - alpha) * i4) / MotionEventCompat.ACTION_MASK);
        return Color.argb(i5, i5 == 0 ? 0 : (((Color.red(i2) * MotionEventCompat.ACTION_MASK) * alpha2) + ((Color.red(i3) * alpha) * i4)) / (i5 * MotionEventCompat.ACTION_MASK), i5 == 0 ? 0 : (((Color.green(i2) * MotionEventCompat.ACTION_MASK) * alpha2) + ((Color.green(i3) * alpha) * i4)) / (i5 * MotionEventCompat.ACTION_MASK), i5 == 0 ? 0 : (((Color.blue(i2) * MotionEventCompat.ACTION_MASK) * alpha2) + ((Color.blue(i3) * alpha) * i4)) / (i5 * MotionEventCompat.ACTION_MASK));
    }

    public static int A06(int i2, int i3) {
        if (i3 >= 0 && i3 <= 255) {
            return (i2 & ViewCompat.MEASURED_SIZE_MASK) | (i3 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static void A07(int i2, int i3, float[] fArr, int i4) {
        float f2;
        float abs;
        float f3 = ((float) i2) / 255.0f;
        float f4 = ((float) i3) / 255.0f;
        float f5 = ((float) i4) / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            f2 = 0.0f;
            abs = 0.0f;
        } else {
            f2 = max == f3 ? ((f4 - f5) / f6) % 6.0f : max == f4 ? ((f5 - f3) / f6) + 2.0f : 4.0f + ((f3 - f4) / f6);
            abs = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f2 * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        float f9 = 0.0f;
        if (f8 >= 0.0f) {
            f9 = Math.min(f8, 360.0f);
        }
        fArr[0] = f9;
        float f10 = 0.0f;
        if (abs >= 0.0f) {
            f10 = Math.min(abs, 1.0f);
        }
        fArr[1] = f10;
        float f11 = 0.0f;
        if (f7 >= 0.0f) {
            f11 = Math.min(f7, 1.0f);
        }
        fArr[2] = f11;
    }
}

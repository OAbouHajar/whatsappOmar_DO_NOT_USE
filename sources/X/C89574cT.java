package X;

/* renamed from: X.4cT  reason: invalid class name and case insensitive filesystem */
public class C89574cT {
    public static int A00(int i2, int i3, boolean z2) {
        int min = Math.min(4, A02(i2, z2));
        double d2 = (double) (min > 0 ? i3 / min : 0);
        double d3 = 1.0d;
        if (C13700nu.A0g(i2, 12)) {
            d3 = 1.0d - 0.04d;
        }
        return (int) (d2 * d3);
    }

    public static int A01(int i2, boolean z2) {
        if (z2) {
            if (i2 > 2) {
                int i3 = 3;
                if (i2 <= 8) {
                    i3 = 2;
                }
                return ((i2 + i3) - 1) / i3;
            } else if (i2 <= 0) {
                return 0;
            } else {
                return i2;
            }
        } else if (i2 <= 2) {
            return 1;
        } else {
            return i2 <= 8 ? 2 : 3;
        }
    }

    public static int A02(int i2, boolean z2) {
        if (z2) {
            if (i2 <= 2) {
                return 1;
            }
            return i2 <= 8 ? 2 : 3;
        } else if (i2 > 2) {
            int i3 = 3;
            if (i2 <= 8) {
                i3 = 2;
            }
            return ((i2 + i3) - 1) / i3;
        } else if (i2 <= 0) {
            return 0;
        } else {
            return i2;
        }
    }
}

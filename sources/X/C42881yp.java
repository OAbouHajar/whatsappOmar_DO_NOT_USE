package X;

/* renamed from: X.1yp  reason: invalid class name and case insensitive filesystem */
public final class C42881yp {
    public static final int[] A00 = {14, 0, 1, 2, 20, 3, 4, 15, 5, 11, 12, 13, 8, 18, 17, 16, 9, 10, 7, 6};

    public static int A00(int i2, int i3) {
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        while (true) {
            int[] iArr = A00;
            if (i4 < iArr.length) {
                if (iArr[i4] == i2) {
                    i5 = i4;
                }
                if (iArr[i4] == i3) {
                    i6 = i4;
                }
                if (i5 != -1 && i6 != -1) {
                    break;
                }
                i4++;
            } else {
                break;
            }
        }
        if (i5 < i6) {
            return -1;
        }
        return i5 > i6 ? 1 : 0;
    }

    public static boolean A01(int i2) {
        return i2 == 15 || i2 == 5 || i2 == 13 || i2 == 17 || i2 == 18 || i2 == 8;
    }

    public static boolean A02(int i2, int i3) {
        return A00(i2, i3) >= 0;
    }
}

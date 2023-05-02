package X;

/* renamed from: X.48Z  reason: invalid class name */
public class AnonymousClass48Z {
    public static int[] A00(int i2, int i3) {
        int i4;
        int i5 = 32 / i3;
        int i6 = (int) ((1 << i5) - 1);
        int[] iArr = new int[i3];
        int i7 = 0;
        while (true) {
            if (i7 >= i3) {
                break;
            }
            iArr[(i3 - i7) - 1] = (i2 >> (i5 * i7)) & i6;
            i7++;
        }
        for (i4 = 0; i4 < i3 - 1; i4++) {
            AnonymousClass3K4.A17(iArr, i4);
        }
        return iArr;
    }
}

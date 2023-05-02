package X;

/* renamed from: X.4ZE  reason: invalid class name */
public final class AnonymousClass4ZE {
    public static final int[] A00 = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] A01 = {1, 2, 3, 6};
    public static final int[] A02 = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] A03 = {48000, 44100, 32000};
    public static final int[] A04 = {24000, 22050, 16000};
    public static final int[] A05 = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int A00(int i2, int i3) {
        int i4 = i3 >> 1;
        if (i2 < 0) {
            return -1;
        }
        int[] iArr = A03;
        if (i2 >= iArr.length || i3 < 0) {
            return -1;
        }
        int[] iArr2 = A05;
        if (i4 >= iArr2.length) {
            return -1;
        }
        int i5 = iArr[i2];
        if (i5 == 44100) {
            return (iArr2[i4] + (i3 % 2)) << 1;
        }
        int i6 = A00[i4];
        return i5 == 32000 ? i6 * 6 : i6 << 2;
    }
}

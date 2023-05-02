package X;

/* renamed from: X.1eE  reason: invalid class name and case insensitive filesystem */
public abstract class C31461eE {
    public static int A00(byte[] bArr, int i2) {
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        return (bArr[i4 + 1] & 255) | (bArr[i2] << 24) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 8);
    }

    public static int A01(byte[] bArr, int i2) {
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        return (bArr[i4 + 1] << 24) | (bArr[i2] & 255) | ((bArr[i3] & 255) << 8) | ((bArr[i4] & 255) << 16);
    }

    public static void A02(byte[] bArr, int i2, int i3) {
        bArr[i3] = (byte) (i2 >>> 24);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i2 >>> 16);
        int i5 = i4 + 1;
        bArr[i5] = (byte) (i2 >>> 8);
        bArr[i5 + 1] = (byte) i2;
    }

    public static void A03(byte[] bArr, int i2, int i3) {
        bArr[i3] = (byte) i2;
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        int i5 = i4 + 1;
        bArr[i5] = (byte) (i2 >>> 16);
        bArr[i5 + 1] = (byte) (i2 >>> 24);
    }

    public static void A04(byte[] bArr, int i2, long j2) {
        A02(bArr, (int) (j2 >>> 32), i2);
        A02(bArr, (int) (j2 & 4294967295L), i2 + 4);
    }

    public static void A05(byte[] bArr, int i2, long j2) {
        A03(bArr, (int) (4294967295L & j2), i2);
        A03(bArr, (int) (j2 >>> 32), i2 + 4);
    }
}

package X;

/* renamed from: X.1hx  reason: invalid class name and case insensitive filesystem */
public final class C33111hx {
    public static int A00(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i2 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i2;
            }
            i2 = (i2 * 257) ^ bArr[length];
        }
    }

    public static boolean A01(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return false;
        }
        if (bArr == bArr2) {
            return true;
        }
        int length = bArr.length;
        byte b2 = length;
        int length2 = bArr2.length;
        if (length >= length2) {
            length = length2;
        }
        byte b3 = b2 ^ length2;
        for (int i2 = 0; i2 != length; i2++) {
            b3 |= bArr[i2] ^ bArr2[i2];
        }
        while (length < length2) {
            byte b4 = bArr2[length];
            b3 |= b4 ^ (b4 ^ -1);
            length++;
        }
        return b3 == 0;
    }

    public static byte[] A02(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static char[] A03(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return (char[]) cArr.clone();
    }
}

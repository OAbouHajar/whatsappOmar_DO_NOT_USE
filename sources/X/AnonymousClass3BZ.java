package X;

import java.io.EOFException;
import java.io.InputStream;

/* renamed from: X.3BZ  reason: invalid class name */
public class AnonymousClass3BZ {
    public static final AnonymousClass4IC A00 = new AnonymousClass4IC(30, 72);
    public static final AnonymousClass4IC A01 = new AnonymousClass4IC(48, 96);
    public static final byte[] A02 = {69, 120, 105, 102, 0};
    public static final byte[] A03 = {74, 70, 73, 70, 0};
    public static final byte[] A04 = {74, 70, 88, 88, 0};
    public static final int[] A05 = {0, 208, 209, 210, 211, 212, 213, 214, 215};

    public static void A00(InputStream inputStream, int i2) {
        byte[] bArr = new byte[1024];
        while (i2 > 0) {
            int min = Math.min(Math.min(1024, i2), 1024);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            if (i3 != -1) {
                i2 -= 1024;
            } else {
                throw new EOFException(C13680ns.A0c(i2, "Unexpected EOF skipping "));
            }
        }
    }

    public static boolean A01(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        if (length >= length2) {
            int i2 = 0;
            while (i2 < length2) {
                if (bArr[i2] == bArr2[i2]) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }
}

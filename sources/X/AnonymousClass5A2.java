package X;

import java.security.SecureRandom;

/* renamed from: X.5A2  reason: invalid class name */
public class AnonymousClass5A2 implements C109515Sl {
    public int A4f(byte[] bArr, int i2) {
        int length = bArr.length;
        int i3 = length - i2;
        while (i2 < length) {
            bArr[i2] = 0;
            i2++;
        }
        return i3;
    }

    public void AHy(SecureRandom secureRandom) {
    }

    public int Aa9(byte[] bArr) {
        int length = bArr.length;
        int i2 = length;
        while (length > 0 && bArr[length - 1] == 0) {
            length--;
        }
        return i2 - length;
    }
}

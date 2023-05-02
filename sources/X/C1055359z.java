package X;

import java.security.SecureRandom;

/* renamed from: X.59z  reason: invalid class name and case insensitive filesystem */
public class C1055359z implements C109515Sl {
    public int A4f(byte[] bArr, int i2) {
        int length = bArr.length;
        int i3 = length - i2;
        byte b2 = Byte.MIN_VALUE;
        while (true) {
            bArr[i2] = b2;
            i2++;
            if (i2 >= length) {
                return i3;
            }
            b2 = 0;
        }
    }

    public void AHy(SecureRandom secureRandom) {
    }

    public int Aa9(byte[] bArr) {
        int length = bArr.length;
        int i2 = length;
        do {
            length--;
            if (length <= 0 || bArr[length] != 0) {
            }
            length--;
            break;
        } while (bArr[length] != 0);
        if (bArr[length] == Byte.MIN_VALUE) {
            return i2 - length;
        }
        throw new AnonymousClass5JC("pad block corrupted");
    }
}

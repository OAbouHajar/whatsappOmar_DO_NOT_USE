package X;

import java.security.SecureRandom;

/* renamed from: X.5A4  reason: invalid class name */
public class AnonymousClass5A4 implements C109515Sl {
    public SecureRandom A00 = null;

    public int A4f(byte[] bArr, int i2) {
        int length = bArr.length;
        byte b2 = (byte) (length - i2);
        while (i2 < length - 1) {
            SecureRandom secureRandom = this.A00;
            bArr[i2] = secureRandom == null ? 0 : (byte) secureRandom.nextInt();
            i2++;
        }
        bArr[i2] = b2;
        return b2;
    }

    public void AHy(SecureRandom secureRandom) {
        this.A00 = secureRandom;
    }

    public int Aa9(byte[] bArr) {
        int length = bArr.length;
        byte b2 = bArr[length - 1] & 255;
        if (b2 <= length) {
            return b2;
        }
        throw new AnonymousClass5JC("pad block corrupted");
    }
}

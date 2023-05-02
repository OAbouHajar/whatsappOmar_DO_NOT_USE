package X;

import android.support.v4.view.MotionEventCompat;
import java.security.SecureRandom;

/* renamed from: X.5A1  reason: invalid class name */
public class AnonymousClass5A1 implements C109515Sl {
    public int A4f(byte[] bArr, int i2) {
        int length = bArr.length;
        int i3 = length - i2;
        int i4 = MotionEventCompat.ACTION_MASK;
        int i5 = length - 1;
        if (i2 > 0) {
            i5 = i2 - 1;
        }
        if ((bArr[i5] & 1) != 0) {
            i4 = 0;
        }
        byte b2 = (byte) i4;
        while (i2 < length) {
            bArr[i2] = b2;
            i2++;
        }
        return i3;
    }

    public void AHy(SecureRandom secureRandom) {
    }

    public int Aa9(byte[] bArr) {
        int length = bArr.length;
        int i2 = length - 1;
        byte b2 = bArr[i2];
        while (i2 > 0 && bArr[i2 - 1] == b2) {
            i2--;
        }
        return length - i2;
    }
}

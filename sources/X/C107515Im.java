package X;

import android.support.v4.view.MotionEventCompat;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.5Im  reason: invalid class name and case insensitive filesystem */
public abstract class C107515Im extends C32051fZ implements C33031hp {
    public static final char[] A02 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final int A00;
    public final byte[] A01;

    public C107515Im(byte[] bArr, int i2) {
        String str;
        if (bArr != null) {
            if (bArr.length == 0) {
                str = i2 != 0 ? "zero length data with non-zero pad bits" : str;
                this.A01 = C33111hx.A02(bArr);
                this.A00 = i2;
                return;
            }
            if (i2 > 7 || i2 < 0) {
                str = "pad bits cannot be greater than 7 or less than 0";
            }
            this.A01 = C33111hx.A02(bArr);
            this.A00 = i2;
            return;
            throw AnonymousClass000.A0T(str);
        }
        throw AnonymousClass000.A0W("'data' cannot be null");
    }

    public C32051fZ A05() {
        return new AnonymousClass5HY(this.A01, this.A00);
    }

    public void A07(C33061hs r8, boolean z2) {
        int i2;
        if (this instanceof AnonymousClass5HX) {
            byte b2 = (byte) this.A00;
            byte[] bArr = this.A01;
            if (z2) {
                r8.A00.write(3);
            }
            int length = bArr.length;
            r8.A02(length + 1);
            OutputStream outputStream = r8.A00;
            outputStream.write(b2);
            outputStream.write(bArr, 0, length);
            return;
        }
        byte[] bArr2 = this.A01;
        int length2 = bArr2.length;
        if (!(length2 == 0 || (i2 = this.A00) == 0)) {
            int i3 = length2 - 1;
            byte b3 = bArr2[i3];
            byte b4 = (byte) ((MotionEventCompat.ACTION_MASK << i2) & b3);
            if (b3 != b4) {
                byte b5 = (byte) i2;
                if (z2) {
                    r8.A00.write(3);
                }
                r8.A02(i3 + 2);
                OutputStream outputStream2 = r8.A00;
                outputStream2.write(b5);
                outputStream2.write(bArr2, 0, i3);
                outputStream2.write(b4);
                return;
            }
        }
        byte b6 = (byte) this.A00;
        if (z2) {
            r8.A00.write(3);
        }
        r8.A02(length2 + 1);
        OutputStream outputStream3 = r8.A00;
        outputStream3.write(b6);
        outputStream3.write(bArr2, 0, length2);
    }

    public boolean A09(C32051fZ r9) {
        if (!(r9 instanceof C107515Im)) {
            return false;
        }
        C107515Im r92 = (C107515Im) r9;
        int i2 = this.A00;
        if (i2 != r92.A00) {
            return false;
        }
        byte[] bArr = this.A01;
        byte[] bArr2 = r92.A01;
        int length = bArr.length;
        if (length != bArr2.length) {
            return false;
        }
        int i3 = length - 1;
        if (i3 < 0) {
            return true;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4] != bArr2[i4]) {
                return false;
            }
        }
        byte b2 = bArr[i3];
        int i5 = MotionEventCompat.ACTION_MASK << i2;
        return ((byte) (b2 & i5)) == ((byte) (bArr2[i3] & i5));
    }

    public byte[] A0A() {
        byte[] bArr = this.A01;
        int length = bArr.length;
        if (length == 0) {
            return bArr;
        }
        byte[] A022 = C33111hx.A02(bArr);
        int i2 = length - 1;
        A022[i2] = (byte) (A022[i2] & (MotionEventCompat.ACTION_MASK << this.A00));
        return A022;
    }

    public String AGJ() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] A012 = A01();
            for (int i2 = 0; i2 != A012.length; i2++) {
                char[] cArr = A02;
                stringBuffer.append(cArr[(A012[i2] >>> 4) & 15]);
                stringBuffer.append(cArr[A012[i2] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e2) {
            throw new AnonymousClass44B(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("Internal error encoding BitString: ")), e2);
        }
    }

    public int hashCode() {
        byte[] bArr = this.A01;
        int length = bArr.length - 1;
        if (length < 0) {
            return 1;
        }
        byte b2 = bArr[length];
        int i2 = this.A00;
        byte b3 = (byte) (b2 & (MotionEventCompat.ACTION_MASK << i2));
        int i3 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return ((i3 * 257) ^ b3) ^ i2;
            }
            i3 = (i3 * 257) ^ bArr[length];
        }
    }

    public String toString() {
        return AGJ();
    }
}

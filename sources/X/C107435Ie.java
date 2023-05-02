package X;

import java.util.Arrays;

/* renamed from: X.5Ie  reason: invalid class name and case insensitive filesystem */
public class C107435Ie extends C32051fZ implements C33031hp {
    public final char[] A00;

    public C107435Ie(char[] cArr) {
        this.A00 = cArr;
    }

    public int A03() {
        int length = this.A00.length << 1;
        return C32551gZ.A00(length) + 1 + length;
    }

    public void A07(C33061hs r14, boolean z2) {
        char[] cArr = this.A00;
        int length = cArr.length;
        if (z2) {
            r14.A00.write(30);
        }
        r14.A02(length << 1);
        byte[] bArr = new byte[8];
        int i2 = length & -4;
        int i3 = 0;
        while (i3 < i2) {
            char c2 = cArr[i3];
            char c3 = cArr[i3 + 1];
            char c4 = cArr[i3 + 2];
            char c5 = cArr[i3 + 3];
            i3 += 4;
            bArr[0] = (byte) (c2 >> 8);
            bArr[1] = (byte) c2;
            bArr[2] = (byte) (c3 >> 8);
            bArr[3] = (byte) c3;
            bArr[4] = (byte) (c4 >> 8);
            bArr[5] = (byte) c4;
            bArr[6] = (byte) (c5 >> 8);
            bArr[7] = (byte) c5;
            r14.A00.write(bArr, 0, 8);
        }
        if (i3 < length) {
            int i4 = 0;
            do {
                char c6 = cArr[i3];
                i3++;
                int i5 = i4 + 1;
                bArr[i4] = (byte) (c6 >> 8);
                i4 = i5 + 1;
                bArr[i5] = (byte) c6;
            } while (i3 < length);
            r14.A00.write(bArr, 0, i4);
        }
    }

    public boolean A08() {
        return false;
    }

    public boolean A09(C32051fZ r3) {
        if (!(r3 instanceof C107435Ie)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C107435Ie) r3).A00);
    }

    public String AGJ() {
        return new String(this.A00);
    }

    public int hashCode() {
        char[] cArr = this.A00;
        int length = cArr.length;
        int i2 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i2;
            }
            i2 = (i2 * 257) ^ cArr[length];
        }
    }

    public String toString() {
        return new String(this.A00);
    }
}

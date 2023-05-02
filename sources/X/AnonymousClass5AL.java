package X;

import java.io.OutputStream;

/* renamed from: X.5AL  reason: invalid class name */
public class AnonymousClass5AL implements AnonymousClass5R5 {
    public final byte[] A00;
    public final byte[] A01;

    public AnonymousClass5AL() {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        this.A01 = bArr;
        byte[] bArr2 = new byte[128];
        this.A00 = bArr2;
        int i2 = 0;
        int i3 = 0;
        do {
            bArr2[i3] = -1;
            i3++;
        } while (i3 < 128);
        do {
            bArr2[bArr[i2]] = (byte) i2;
            i2++;
        } while (i2 < 16);
        bArr2[65] = bArr2[97];
        bArr2[66] = bArr2[98];
        bArr2[67] = bArr2[99];
        bArr2[68] = bArr2[100];
        bArr2[69] = bArr2[101];
        bArr2[70] = bArr2[102];
    }

    public byte[] A00(String str, int i2, int i3) {
        String str2;
        if (i3 < 0 || i2 > str.length() - i3) {
            throw new IndexOutOfBoundsException("invalid offset and/or length specified");
        }
        if ((i3 & 1) == 0) {
            int i4 = i3 >>> 1;
            byte[] bArr = new byte[i4];
            int i5 = 0;
            while (i5 < i4) {
                byte[] bArr2 = this.A00;
                int i6 = i2 + 1;
                byte b2 = bArr2[str.charAt(i2)];
                i2 = i6 + 1;
                byte b3 = (b2 << 4) | bArr2[str.charAt(i6)];
                if (b3 >= 0) {
                    i5 = AnonymousClass3K4.A0C(bArr, b3, i5);
                } else {
                    str2 = "invalid characters encountered in Hex string";
                }
            }
            return bArr;
        }
        str2 = "a hexadecimal encoding must have an even number of characters";
        throw AnonymousClass3K3.A0e(str2);
    }

    public int A8N(OutputStream outputStream, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[72];
        while (i3 > 0) {
            int min = Math.min(36, i3);
            int i4 = min + i2;
            int i5 = 0;
            for (int i6 = i2; i6 < i4; i6++) {
                byte b2 = bArr[i6] & 255;
                int i7 = i5 + 1;
                byte[] bArr3 = this.A01;
                AnonymousClass3K4.A16(bArr3, bArr2, b2 >>> 4, i5);
                i5 = i7 + 1;
                AnonymousClass3K4.A16(bArr3, bArr2, b2 & 15, i7);
            }
            outputStream.write(bArr2, 0, i5);
            i2 += min;
            i3 -= min;
        }
        return i3 << 1;
    }
}

package X;

import java.io.OutputStream;

/* renamed from: X.5AM  reason: invalid class name */
public class AnonymousClass5AM implements AnonymousClass5R5 {
    public final byte[] A00;
    public final byte[] A01;

    public AnonymousClass5AM() {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
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
        } while (i2 < 64);
    }

    public final int A00(String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != 10 && charAt != 13 && charAt != 9 && charAt != ' ') {
                break;
            }
            i2++;
        }
        return i2;
    }

    public int A8N(OutputStream outputStream, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        byte b2;
        int i6 = i3;
        int i7 = 0;
        byte[] bArr2 = new byte[72];
        while (i6 > 0) {
            int min = Math.min(54, i6);
            int i8 = (i7 + min) - 2;
            int i9 = i7;
            int i10 = 0;
            while (true) {
                if (i9 >= i8) {
                    break;
                }
                int i11 = i9 + 1;
                byte b3 = bArr[i9];
                int i12 = i11 + 1;
                byte b4 = bArr[i11] & 255;
                i9 = i12 + 1;
                byte b5 = bArr[i12] & 255;
                int i13 = i4 + 1;
                byte[] bArr3 = this.A01;
                AnonymousClass3K4.A16(bArr3, bArr2, (b3 >>> 2) & 63, i4);
                int i14 = i13 + 1;
                AnonymousClass3K4.A16(bArr3, bArr2, ((b3 << 4) | (b4 >>> 4)) & 63, i13);
                int i15 = i14 + 1;
                AnonymousClass3K4.A16(bArr3, bArr2, ((b4 << 2) | (b5 >>> 6)) & 63, i14);
                i10 = i15 + 1;
                AnonymousClass3K4.A16(bArr3, bArr2, b5 & 63, i15);
            }
            int i16 = min - (i9 - i7);
            if (i16 == 1) {
                byte b6 = bArr[i9] & 255;
                int i17 = i4 + 1;
                byte[] bArr4 = this.A01;
                AnonymousClass3K4.A16(bArr4, bArr2, (b6 >>> 2) & 63, i4);
                int i18 = i17 + 1;
                AnonymousClass3K4.A16(bArr4, bArr2, (b6 << 4) & 63, i17);
                i5 = i18 + 1;
                b2 = 61;
                bArr2[i18] = 61;
                i4 = i5 + 1;
            } else if (i16 == 2) {
                byte b7 = bArr[i9] & 255;
                byte b8 = bArr[i9 + 1] & 255;
                int i19 = i4 + 1;
                byte[] bArr5 = this.A01;
                AnonymousClass3K4.A16(bArr5, bArr2, (b7 >>> 2) & 63, i4);
                int i20 = i19 + 1;
                AnonymousClass3K4.A16(bArr5, bArr2, ((b7 << 4) | (b8 >>> 4)) & 63, i19);
                i5 = i20 + 1;
                AnonymousClass3K4.A16(bArr5, bArr2, (b8 << 2) & 63, i20);
                i4 = i5 + 1;
                b2 = 61;
            } else {
                outputStream.write(bArr2, 0, i4);
                i7 += min;
                i6 -= min;
            }
            bArr2[i5] = b2;
            outputStream.write(bArr2, 0, i4);
            i7 += min;
            i6 -= min;
        }
        return ((i6 + 2) / 3) << 2;
    }
}

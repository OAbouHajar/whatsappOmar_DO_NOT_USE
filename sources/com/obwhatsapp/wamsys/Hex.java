package com.obwhatsapp.wamsys;

public class Hex {
    public static final char[] FIRST_CHAR;
    public static final char[] HEX_DIGITS;
    public static final char[] SECOND_CHAR;

    static {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        HEX_DIGITS = cArr;
        char[] cArr2 = new char[256];
        FIRST_CHAR = cArr2;
        char[] cArr3 = new char[256];
        SECOND_CHAR = cArr3;
        int i2 = 0;
        do {
            cArr2[i2] = cArr[(i2 >> 4) & 15];
            cArr3[i2] = cArr[i2 & 15];
            i2++;
        } while (i2 < 256);
    }

    public static String encodeHex(byte[] bArr, boolean z2) {
        char[] cArr = new char[(r7 << 1)];
        int i2 = 0;
        for (byte b2 : bArr) {
            byte b3 = b2 & 255;
            if (b3 == 0 && z2) {
                break;
            }
            int i3 = i2 + 1;
            cArr[i2] = FIRST_CHAR[b3];
            i2 = i3 + 1;
            cArr[i3] = SECOND_CHAR[b3];
        }
        return new String(cArr, 0, i2);
    }
}

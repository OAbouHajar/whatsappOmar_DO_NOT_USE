package X;

/* renamed from: X.4Ar  reason: invalid class name and case insensitive filesystem */
public class C82014Ar {
    public static final byte[] A00;
    public static final short[] A01 = new short[128];

    static {
        byte[] bArr = new byte[112];
        A00 = bArr;
        byte[] bArr2 = new byte[128];
        int i2 = 0;
        int i3 = 0;
        do {
            bArr2[i3] = 1;
            i3++;
        } while (i3 <= 15);
        int i4 = 16;
        do {
            bArr2[i4] = 2;
            i4++;
        } while (i4 <= 31);
        int i5 = 32;
        do {
            bArr2[i5] = 3;
            i5++;
        } while (i5 <= 63);
        int i6 = 64;
        do {
            bArr2[i6] = 0;
            i6++;
        } while (i6 <= 65);
        int i7 = 66;
        do {
            bArr2[i7] = 4;
            i7++;
        } while (i7 <= 95);
        bArr2[96] = 5;
        int i8 = 97;
        do {
            bArr2[i8] = 6;
            i8++;
        } while (i8 <= 108);
        bArr2[109] = 7;
        int i9 = 110;
        do {
            bArr2[i9] = 6;
            i9++;
        } while (i9 <= 111);
        bArr2[112] = 8;
        int i10 = 113;
        do {
            bArr2[i10] = 9;
            i10++;
        } while (i10 <= 115);
        bArr2[116] = 10;
        int i11 = 117;
        do {
            bArr2[i11] = 0;
            i11++;
        } while (i11 <= 127);
        int i12 = 0;
        do {
            bArr[i12] = -2;
            i12++;
        } while (i12 <= 111);
        int i13 = 8;
        do {
            bArr[i13] = -1;
            i13++;
        } while (i13 <= 11);
        int i14 = 24;
        do {
            bArr[i14] = 0;
            i14++;
        } while (i14 <= 27);
        int i15 = 40;
        do {
            bArr[i15] = 16;
            i15++;
        } while (i15 <= 43);
        int i16 = 58;
        do {
            bArr[i16] = 0;
            i16++;
        } while (i16 <= 59);
        int i17 = 72;
        do {
            bArr[i17] = 0;
            i17++;
        } while (i17 <= 73);
        int i18 = 89;
        do {
            bArr[i18] = 16;
            i18++;
        } while (i18 <= 91);
        bArr[104] = 16;
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
        do {
            byte b2 = bArr2[i2];
            A01[i2] = (short) (bArr4[b2] | ((bArr3[b2] & i2) << 8));
            i2++;
        } while (i2 < 128);
    }
}

package X;

/* renamed from: X.2Gq  reason: invalid class name and case insensitive filesystem */
public class C46882Gq implements C46892Gr {
    public static final byte[] A08 = C32941ha.A03("expand 32-byte k");
    public static final byte[] A09 = C32941ha.A03("expand 16-byte k");
    public static final int[] A0A;
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public boolean A04 = false;
    public byte[] A05 = new byte[64];
    public int[] A06 = new int[16];
    public int[] A07 = new int[16];

    static {
        byte[] A032 = C32941ha.A03("expand 16-byte kexpand 32-byte k");
        int i2 = 0;
        int[] iArr = new int[8];
        int i3 = 0;
        do {
            iArr[i3] = C31461eE.A01(A032, i2);
            i2 += 4;
            i3++;
        } while (i3 < 8);
        A0A = iArr;
    }

    public static void A00(int[] iArr, int[] iArr2) {
        int rotateLeft;
        int i2 = 20;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        } else if (iArr2.length == 16) {
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            int i7 = iArr[4];
            int i8 = iArr[5];
            int i9 = iArr[6];
            int i10 = iArr[7];
            int i11 = iArr[8];
            int i12 = 9;
            int i13 = iArr[9];
            int i14 = iArr[10];
            int i15 = iArr[11];
            int i16 = iArr[12];
            int i17 = 13;
            int i18 = iArr[13];
            int i19 = iArr[14];
            int i20 = iArr[15];
            do {
                int rotateLeft2 = Integer.rotateLeft(i3 + i16, 7) ^ i7;
                int rotateLeft3 = i11 ^ Integer.rotateLeft(rotateLeft2 + i3, i12);
                int rotateLeft4 = i16 ^ Integer.rotateLeft(rotateLeft3 + rotateLeft2, i17);
                int rotateLeft5 = Integer.rotateLeft(rotateLeft4 + rotateLeft3, 18) ^ i3;
                int rotateLeft6 = i13 ^ Integer.rotateLeft(i8 + i4, 7);
                int rotateLeft7 = i18 ^ Integer.rotateLeft(rotateLeft6 + i8, i12);
                int rotateLeft8 = i4 ^ Integer.rotateLeft(rotateLeft7 + rotateLeft6, i17);
                int rotateLeft9 = Integer.rotateLeft(rotateLeft8 + rotateLeft7, 18) ^ i8;
                int rotateLeft10 = i19 ^ Integer.rotateLeft(i14 + i9, 7);
                int rotateLeft11 = i5 ^ Integer.rotateLeft(rotateLeft10 + i14, i12);
                int rotateLeft12 = i9 ^ Integer.rotateLeft(rotateLeft11 + rotateLeft10, 13);
                int rotateLeft13 = i14 ^ Integer.rotateLeft(rotateLeft12 + rotateLeft11, 18);
                int rotateLeft14 = i6 ^ Integer.rotateLeft(i20 + i15, 7);
                int rotateLeft15 = i10 ^ Integer.rotateLeft(rotateLeft14 + i20, i12);
                int rotateLeft16 = i15 ^ Integer.rotateLeft(rotateLeft15 + rotateLeft14, 13);
                int rotateLeft17 = i20 ^ Integer.rotateLeft(rotateLeft16 + rotateLeft15, 18);
                i4 = rotateLeft8 ^ Integer.rotateLeft(rotateLeft5 + rotateLeft14, 7);
                i5 = rotateLeft11 ^ Integer.rotateLeft(i4 + rotateLeft5, i12);
                i6 = rotateLeft14 ^ Integer.rotateLeft(i5 + i4, 13);
                rotateLeft = rotateLeft5 ^ Integer.rotateLeft(i6 + i5, 18);
                i9 = rotateLeft12 ^ Integer.rotateLeft(rotateLeft9 + rotateLeft2, 7);
                i10 = rotateLeft15 ^ Integer.rotateLeft(i9 + rotateLeft9, i12);
                i7 = Integer.rotateLeft(i10 + i9, 13) ^ rotateLeft2;
                i8 = rotateLeft9 ^ Integer.rotateLeft(i7 + i10, 18);
                i15 = rotateLeft16 ^ Integer.rotateLeft(rotateLeft13 + rotateLeft6, 7);
                int rotateLeft18 = Integer.rotateLeft(i15 + rotateLeft13, i12) ^ rotateLeft3;
                i17 = 13;
                i13 = rotateLeft6 ^ Integer.rotateLeft(rotateLeft18 + i15, 13);
                i14 = rotateLeft13 ^ Integer.rotateLeft(i13 + rotateLeft18, 18);
                i16 = rotateLeft4 ^ Integer.rotateLeft(rotateLeft17 + rotateLeft10, 7);
                i18 = rotateLeft7 ^ Integer.rotateLeft(i16 + rotateLeft17, 9);
                i19 = rotateLeft10 ^ Integer.rotateLeft(i18 + i16, 13);
                i20 = rotateLeft17 ^ Integer.rotateLeft(i19 + i18, 18);
                i2 -= 2;
                i11 = rotateLeft18;
                i3 = rotateLeft;
                i12 = 9;
            } while (i2 > 0);
            iArr2[0] = rotateLeft + iArr[0];
            iArr2[1] = i4 + iArr[1];
            iArr2[2] = i5 + iArr[2];
            iArr2[3] = i6 + iArr[3];
            iArr2[4] = i7 + iArr[4];
            iArr2[5] = i8 + iArr[5];
            iArr2[6] = i9 + iArr[6];
            iArr2[7] = i10 + iArr[7];
            iArr2[8] = i11 + iArr[8];
            iArr2[9] = i13 + iArr[9];
            iArr2[10] = i14 + iArr[10];
            iArr2[11] = i15 + iArr[11];
            iArr2[12] = i16 + iArr[12];
            iArr2[13] = i18 + iArr[13];
            iArr2[14] = i19 + iArr[14];
            iArr2[15] = i20 + iArr[15];
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void A01(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        if (!this.A04) {
            StringBuilder sb = new StringBuilder("XSalsa20");
            sb.append(" not initialised");
            throw new IllegalStateException(sb.toString());
        } else if (i2 + i3 > bArr.length) {
            throw new AnonymousClass5JI("input buffer too short");
        } else if (i4 + i3 <= bArr2.length) {
            int i5 = this.A00 + i3;
            this.A00 = i5;
            if (i5 < i3 && i5 >= 0) {
                int i6 = this.A01 + 1;
                this.A01 = i6;
                if (i6 == 0) {
                    int i7 = this.A02 + 1;
                    this.A02 = i7;
                    if ((i7 & 32) != 0) {
                        throw new AnonymousClass5JJ("2^70 byte limit per IV would be exceeded; Change IV");
                    }
                }
            }
            for (int i8 = 0; i8 < i3; i8++) {
                byte[] bArr3 = this.A05;
                int i9 = this.A03;
                bArr2[i8 + i4] = (byte) (bArr3[i9] ^ bArr[i8 + i2]);
                int i10 = (i9 + 1) & 63;
                this.A03 = i10;
                if (i10 == 0) {
                    int[] iArr = this.A06;
                    int i11 = iArr[8] + 1;
                    iArr[8] = i11;
                    if (i11 == 0) {
                        iArr[9] = iArr[9] + 1;
                    }
                    int[] iArr2 = this.A07;
                    A00(iArr, iArr2);
                    int i12 = 0;
                    for (int A032 : iArr2) {
                        C31461eE.A03(bArr3, A032, i12);
                        i12 += 4;
                    }
                }
            }
        } else {
            throw new AnonymousClass5JD("output buffer too short");
        }
    }
}

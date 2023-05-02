package X;

import java.util.Arrays;

/* renamed from: X.59m  reason: invalid class name */
public class AnonymousClass59m implements AnonymousClass5VO {
    public static long[] A06 = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public byte[] A04;
    public long[] A05;

    public AnonymousClass59m() {
        this(256);
    }

    public AnonymousClass59m(int i2) {
        if (i2 == 224 || i2 == 256 || i2 == 384 || i2 == 512) {
            this.A05 = new long[25];
            this.A04 = new byte[192];
            A02(i2);
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("'bitLength' ");
        A0r.append(i2);
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(" not supported for SHA-3", A0r));
    }

    public static long A00(byte[] bArr, int i2) {
        return ((((long) C31461eE.A01(bArr, i2 + 4)) & 4294967295L) << 32) | (4294967295L & ((long) C31461eE.A01(bArr, i2)));
    }

    public final void A01() {
        long j2;
        long[] jArr = this.A05;
        int i2 = 0;
        long j3 = jArr[0];
        long j4 = jArr[1];
        long j5 = jArr[2];
        long j6 = jArr[3];
        long j7 = jArr[4];
        long j8 = jArr[5];
        long j9 = jArr[6];
        long j10 = jArr[7];
        long j11 = jArr[8];
        long j12 = jArr[9];
        long j13 = jArr[10];
        long j14 = jArr[11];
        long j15 = jArr[12];
        long j16 = jArr[13];
        long j17 = jArr[14];
        long j18 = jArr[15];
        long j19 = jArr[16];
        long j20 = jArr[17];
        long j21 = jArr[18];
        long j22 = jArr[19];
        long j23 = jArr[20];
        long j24 = jArr[21];
        long j25 = jArr[22];
        long j26 = jArr[23];
        long j27 = jArr[24];
        do {
            long j28 = (((j3 ^ j8) ^ j13) ^ j18) ^ j23;
            long j29 = (((j4 ^ j9) ^ j14) ^ j19) ^ j24;
            long j30 = (((j5 ^ j10) ^ j15) ^ j20) ^ j25;
            long j31 = (((j6 ^ j11) ^ j16) ^ j21) ^ j26;
            long j32 = (((j7 ^ j12) ^ j17) ^ j22) ^ j27;
            long j33 = ((j29 << 1) | (j29 >>> -1)) ^ j32;
            long j34 = ((j30 << 1) | (j30 >>> -1)) ^ j28;
            long j35 = ((j31 << 1) | (j31 >>> -1)) ^ j29;
            long j36 = ((j32 << 1) | (j32 >>> -1)) ^ j30;
            long j37 = ((j28 << 1) | (j28 >>> -1)) ^ j31;
            long j38 = j3 ^ j33;
            long j39 = j8 ^ j33;
            long j40 = j13 ^ j33;
            long j41 = j18 ^ j33;
            long j42 = j23 ^ j33;
            long j43 = j4 ^ j34;
            long j44 = j9 ^ j34;
            long j45 = j14 ^ j34;
            long j46 = j19 ^ j34;
            long j47 = j24 ^ j34;
            long j48 = j5 ^ j35;
            long j49 = j10 ^ j35;
            long j50 = j15 ^ j35;
            long j51 = j20 ^ j35;
            long j52 = j25 ^ j35;
            long j53 = j6 ^ j36;
            long j54 = j11 ^ j36;
            long j55 = j16 ^ j36;
            long j56 = j21 ^ j36;
            long j57 = j26 ^ j36;
            long j58 = j7 ^ j37;
            long j59 = j12 ^ j37;
            long j60 = j17 ^ j37;
            long j61 = j22 ^ j37;
            long j62 = j27 ^ j37;
            long j63 = (j43 << 1) | (j43 >>> 63);
            long j64 = (j44 << 44) | (j44 >>> 20);
            long j65 = (j59 << 20) | (j59 >>> 44);
            long j66 = (j52 << 61) | (j52 >>> 3);
            long j67 = (j60 << 39) | (j60 >>> 25);
            long j68 = (j42 << 18) | (j42 >>> 46);
            long j69 = (j48 << 62) | (j48 >>> 2);
            long j70 = (j50 << 43) | (j50 >>> 21);
            long j71 = (j55 << 25) | (j55 >>> 39);
            long j72 = (j61 << 8) | (j61 >>> 56);
            long j73 = (j57 << 56) | (j57 >>> 8);
            long j74 = (j41 << 41) | (j41 >>> 23);
            long j75 = (j58 << 27) | (j58 >>> 37);
            long j76 = (j62 << 14) | (j62 >>> 50);
            long j77 = (j47 << 2) | (j47 >>> 62);
            long j78 = (j54 << 55) | (j54 >>> 9);
            long j79 = (j46 << 45) | (j46 >>> 19);
            long j80 = (j39 << 36) | (j39 >>> 28);
            long j81 = (j53 << 28) | (j53 >>> 36);
            long j82 = (j56 << 21) | (j56 >>> 43);
            long j83 = (j51 << 15) | (j51 >>> 49);
            long j84 = (j45 << 10) | (j45 >>> 54);
            long j85 = (j49 << 6) | (j49 >>> 58);
            long j86 = (j40 << 3) | (j40 >>> 61);
            long j87 = j38 ^ ((j64 ^ -1) & j70);
            j4 = j64 ^ ((j70 ^ -1) & j82);
            j5 = j70 ^ ((j82 ^ -1) & j76);
            j6 = j82 ^ ((j76 ^ -1) & j38);
            j7 = j76 ^ ((j38 ^ -1) & j64);
            j8 = j81 ^ ((j65 ^ -1) & j86);
            j9 = j65 ^ ((j86 ^ -1) & j79);
            j10 = j86 ^ ((j79 ^ -1) & j66);
            j11 = j79 ^ ((j66 ^ -1) & j81);
            j12 = j66 ^ ((j81 ^ -1) & j65);
            j13 = ((j85 ^ -1) & j71) ^ j63;
            j14 = j85 ^ ((j71 ^ -1) & j72);
            j15 = j71 ^ ((j72 ^ -1) & j68);
            j16 = j72 ^ ((j68 ^ -1) & j63);
            j17 = j68 ^ ((j63 ^ -1) & j85);
            j18 = j75 ^ ((j80 ^ -1) & j84);
            j19 = j80 ^ ((j84 ^ -1) & j83);
            j20 = j84 ^ ((j83 ^ -1) & j73);
            j21 = j83 ^ ((j73 ^ -1) & j75);
            j22 = j73 ^ ((j75 ^ -1) & j80);
            j23 = j69 ^ ((j78 ^ -1) & j67);
            j24 = j78 ^ ((j67 ^ -1) & j74);
            j25 = j67 ^ ((j74 ^ -1) & j77);
            j26 = j74 ^ ((j77 ^ -1) & j69);
            j27 = j77 ^ ((j69 ^ -1) & j78);
            j2 = j87 ^ A06[i2];
            i2++;
            j3 = j2;
        } while (i2 < 24);
        jArr[0] = j2;
        jArr[1] = j4;
        jArr[2] = j5;
        jArr[3] = j6;
        jArr[4] = j7;
        jArr[5] = j8;
        jArr[6] = j9;
        jArr[7] = j10;
        jArr[8] = j11;
        jArr[9] = j12;
        jArr[10] = j13;
        jArr[11] = j14;
        jArr[12] = j15;
        jArr[13] = j16;
        jArr[14] = j17;
        jArr[15] = j18;
        jArr[16] = j19;
        jArr[17] = j20;
        jArr[18] = j21;
        jArr[19] = j22;
        jArr[20] = j23;
        jArr[21] = j24;
        jArr[22] = j25;
        jArr[23] = j26;
        jArr[24] = j27;
    }

    public final void A02(int i2) {
        if (i2 == 128 || i2 == 224 || i2 == 256 || i2 == 288 || i2 == 384 || i2 == 512) {
            int i3 = 1600 - (i2 << 1);
            if (i3 <= 0 || i3 >= 1600 || i3 % 64 != 0) {
                throw AnonymousClass000.A0V("invalid rate value");
            }
            this.A02 = i3;
            int i4 = 0;
            while (true) {
                long[] jArr = this.A05;
                if (i4 < jArr.length) {
                    jArr[i4] = 0;
                    i4++;
                } else {
                    Arrays.fill(this.A04, (byte) 0);
                    this.A00 = 0;
                    this.A03 = false;
                    this.A01 = (1600 - i3) >> 1;
                    return;
                }
            }
        } else {
            throw AnonymousClass000.A0T("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
    }

    public final void A03(byte[] bArr, int i2) {
        int i3 = this.A02 >>> 6;
        for (int i4 = 0; i4 < i3; i4++) {
            long[] jArr = this.A05;
            jArr[i4] = jArr[i4] ^ A00(bArr, i2);
            i2 += 8;
        }
        long[] jArr2 = this.A05;
        int length = jArr2.length;
        byte[] bArr2 = new byte[(length << 3)];
        int i5 = 0;
        for (int i6 = 0; i6 != length; i6++) {
            C31461eE.A05(bArr2, i5, jArr2[i6]);
            i5 += 8;
        }
        C90584eP.A00(bArr2);
        A01();
    }

    public int A8A(byte[] bArr, int i2) {
        String str;
        int i3 = this.A00;
        if (i3 % 8 != 0) {
            str = "attempt to absorb with odd length queue";
        } else if (!this.A03) {
            byte[] bArr2 = this.A04;
            bArr2[i3 >>> 3] = (byte) (2 & ((1 << 2) - 1));
            int i4 = i3 + 2;
            this.A00 = i4;
            long j2 = (long) this.A01;
            int i5 = i4 >>> 3;
            AnonymousClass3K4.A0i(bArr2[i5], bArr2, (byte) (1 << (i4 & 7)), i5);
            int i6 = i4 + 1;
            this.A00 = i6;
            int i7 = 0;
            if (i6 == this.A02) {
                A03(bArr2, 0);
            } else {
                int i8 = i6 >>> 6;
                int i9 = i6 & 63;
                int i10 = 0;
                for (int i11 = 0; i11 < i8; i11++) {
                    long[] jArr = this.A05;
                    jArr[i11] = jArr[i11] ^ A00(bArr2, i10);
                    i10 += 8;
                }
                if (i9 > 0) {
                    long[] jArr2 = this.A05;
                    jArr2[i8] = (((1 << i9) - 1) & A00(bArr2, i10)) ^ jArr2[i8];
                }
            }
            long[] jArr3 = this.A05;
            int i12 = (this.A02 - 1) >>> 6;
            jArr3[i12] = jArr3[i12] ^ Long.MIN_VALUE;
            this.A00 = 0;
            this.A03 = true;
            long j3 = 0;
            if (j2 % 8 != 0) {
                str = "outputLength not a multiple of 8";
            } else {
                while (j3 < j2) {
                    if (i7 == 0) {
                        A01();
                        i7 = this.A02;
                        int i13 = i7 >>> 6;
                        int i14 = 0;
                        for (int i15 = 0; i15 < i13; i15++) {
                            C31461eE.A05(bArr2, i14, jArr3[i15]);
                            i14 += 8;
                        }
                        this.A00 = i7;
                    }
                    int min = (int) Math.min((long) i7, j2 - j3);
                    System.arraycopy(bArr2, (this.A02 - i7) >> 3, bArr, ((int) (j3 / 8)) + i2, min >> 3);
                    i7 = this.A00 - min;
                    this.A00 = i7;
                    j3 += (long) min;
                }
                reset();
                return this.A01 >> 3;
            }
        } else {
            str = "attempt to absorb while squeezing";
        }
        throw AnonymousClass000.A0V(str);
    }

    public String A9q() {
        return AnonymousClass000.A0l(AnonymousClass000.A0r("SHA3-"), this.A01);
    }

    public int AAI() {
        return this.A02 >> 3;
    }

    public int ABn() {
        return this.A01 >> 3;
    }

    public void AhH(byte b2) {
        String str;
        int i2 = this.A00;
        if (i2 % 8 != 0) {
            str = "attempt to absorb with odd length queue";
        } else if (!this.A03) {
            byte[] bArr = this.A04;
            bArr[i2 >>> 3] = b2;
            int i3 = i2 + 8;
            this.A00 = i3;
            if (i3 == this.A02) {
                A03(bArr, 0);
                this.A00 = 0;
                return;
            }
            return;
        } else {
            str = "attempt to absorb while squeezing";
        }
        throw AnonymousClass000.A0V(str);
    }

    public void reset() {
        A02(this.A01);
    }

    public void update(byte[] bArr, int i2, int i3) {
        String str;
        int i4;
        int i5;
        int i6 = this.A00;
        if (i6 % 8 != 0) {
            str = "attempt to absorb with odd length queue";
        } else if (!this.A03) {
            int i7 = i6 >>> 3;
            int i8 = this.A02 >>> 3;
            int i9 = i8 - i7;
            if (i3 < i9) {
                System.arraycopy(bArr, i2, this.A04, i7, i3);
                i5 = this.A00 + (i3 << 3);
            } else {
                if (i7 > 0) {
                    byte[] bArr2 = this.A04;
                    System.arraycopy(bArr, i2, bArr2, i7, i9);
                    A03(bArr2, 0);
                } else {
                    i9 = 0;
                }
                while (true) {
                    i4 = i3 - i9;
                    if (i4 < i8) {
                        break;
                    }
                    A03(bArr, i2 + i9);
                    i9 += i8;
                }
                System.arraycopy(bArr, i2 + i9, this.A04, 0, i4);
                i5 = i4 << 3;
            }
            this.A00 = i5;
            return;
        } else {
            str = "attempt to absorb while squeezing";
        }
        throw AnonymousClass000.A0V(str);
    }
}

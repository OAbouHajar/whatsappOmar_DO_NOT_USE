package X;

/* renamed from: X.4ez  reason: invalid class name and case insensitive filesystem */
public abstract class C90874ez {
    public static final int[] A00 = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    public static int A00(byte[] bArr, int i2) {
        int i3 = i2 + 1;
        int A0L = AnonymousClass3K3.A0L(bArr, i3, bArr[i2] & 255);
        int i4 = i3 + 1;
        return (bArr[i4 + 1] << 24) | AnonymousClass3K3.A0M(bArr, i4, A0L);
    }

    public static void A01(int i2, int i3, int[] iArr, int[] iArr2) {
        int i4 = iArr[i2];
        int i5 = iArr[i2 + 1];
        int i6 = iArr[i2 + 2];
        int i7 = iArr[i2 + 3];
        iArr2[i3] = i4 & 67108863;
        iArr2[i3 + 1] = ((i4 >>> 26) | (i5 << 6)) & 67108863;
        iArr2[i3 + 2] = ((i6 << 12) | (i5 >>> 20)) & 33554431;
        iArr2[i3 + 3] = ((i7 << 19) | (i6 >>> 13)) & 67108863;
        iArr2[i3 + 4] = i7 >>> 7;
    }

    public static void A02(int i2, int i3, int[] iArr, int[] iArr2) {
        int i4 = iArr[i2];
        int i5 = iArr[i2 + 1];
        int i6 = iArr[i2 + 2];
        int i7 = iArr[i2 + 3];
        int i8 = iArr[i2 + 4];
        iArr2[i3] = i4 | (i5 << 26);
        iArr2[i3 + 1] = (i5 >>> 6) | (i6 << 20);
        iArr2[i3 + 2] = (i6 >>> 12) | (i7 << 13);
        iArr2[i3 + 3] = (i8 << 7) | (i7 >>> 19);
    }

    public static void A03(byte[] bArr, int i2, int i3) {
        bArr[AnonymousClass3K4.A0C(bArr, i2 >>> 16, AnonymousClass3K4.A0C(bArr, i2 >>> 8, AnonymousClass3K4.A0C(bArr, i2, i3)))] = (byte) (i2 >>> 24);
    }

    public static void A04(byte[] bArr, int[] iArr, int i2, int i3) {
        int A002 = A00(bArr, i2);
        int A003 = A00(bArr, i2 + 4);
        int A004 = A00(bArr, i2 + 8);
        int A005 = A00(bArr, i2 + 12);
        iArr[i3] = A002 & 67108863;
        iArr[i3 + 1] = ((A002 >>> 26) | (A003 << 6)) & 67108863;
        iArr[i3 + 2] = ((A004 << 12) | (A003 >>> 20)) & 33554431;
        iArr[i3 + 3] = ((A005 << 19) | (A004 >>> 13)) & 67108863;
        iArr[i3 + 4] = A005 >>> 7;
    }

    public static void A05(byte[] bArr, int[] iArr, int i2, int i3) {
        int i4 = iArr[i2];
        int i5 = iArr[i2 + 1];
        int i6 = iArr[i2 + 2];
        int i7 = iArr[i2 + 3];
        int i8 = iArr[i2 + 4];
        A03(bArr, (i5 << 26) | i4, i3);
        A03(bArr, (i5 >>> 6) | (i6 << 20), i3 + 4);
        A03(bArr, (i6 >>> 12) | (i7 << 13), i3 + 8);
        A03(bArr, (i8 << 7) | (i7 >>> 19), i3 + 12);
    }

    public static void A06(int[] iArr, int i2) {
        int i3 = iArr[9];
        long j2 = ((long) (((i3 >> 24) + i2) * 19)) + ((long) iArr[0]);
        iArr[0] = ((int) j2) & 67108863;
        long j3 = (j2 >> 26) + ((long) iArr[1]);
        iArr[1] = ((int) j3) & 67108863;
        long j4 = (j3 >> 26) + ((long) iArr[2]);
        iArr[2] = ((int) j4) & 33554431;
        long j5 = (j4 >> 25) + ((long) iArr[3]);
        iArr[3] = ((int) j5) & 67108863;
        long j6 = (j5 >> 26) + ((long) iArr[4]);
        iArr[4] = ((int) j6) & 33554431;
        long j7 = (j6 >> 25) + ((long) iArr[5]);
        iArr[5] = ((int) j7) & 67108863;
        long j8 = (j7 >> 26) + ((long) iArr[6]);
        iArr[6] = ((int) j8) & 67108863;
        long j9 = (j8 >> 26) + ((long) iArr[7]);
        iArr[7] = 33554431 & ((int) j9);
        long j10 = (j9 >> 25) + ((long) iArr[8]);
        iArr[8] = 67108863 & ((int) j10);
        iArr[9] = (16777215 & i3) + ((int) (j10 >> 26));
    }

    public static void A07(int[] iArr, int[] iArr2) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        long j2 = (long) 121666;
        long j3 = ((long) i4) * j2;
        int i11 = ((int) j3) & 33554431;
        long j4 = ((long) i6) * j2;
        int i12 = ((int) j4) & 33554431;
        long j5 = ((long) i9) * j2;
        int i13 = ((int) j5) & 33554431;
        long j6 = ((long) iArr[9]) * j2;
        int i14 = ((int) j6) & 33554431;
        long j7 = ((j6 >> 25) * 38) + (((long) i2) * j2);
        iArr2[0] = ((int) j7) & 67108863;
        long j8 = (j4 >> 25) + (((long) i7) * j2);
        iArr2[5] = ((int) j8) & 67108863;
        long j9 = (j7 >> 26) + (((long) i3) * j2);
        iArr2[1] = ((int) j9) & 67108863;
        long j10 = (j3 >> 25) + (((long) i5) * j2);
        iArr2[3] = ((int) j10) & 67108863;
        long j11 = (j8 >> 26) + (((long) i8) * j2);
        iArr2[6] = ((int) j11) & 67108863;
        long j12 = (j5 >> 25) + (((long) i10) * j2);
        iArr2[8] = ((int) j12) & 67108863;
        iArr2[2] = i11 + ((int) (j9 >> 26));
        iArr2[4] = i12 + ((int) (j10 >> 26));
        iArr2[7] = i13 + ((int) (j11 >> 26));
        iArr2[9] = i14 + ((int) (j12 >> 26));
    }

    public static void A08(int[] iArr, int[] iArr2) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        long j2 = (long) i2;
        long j3 = j2 * j2;
        long j4 = (long) (i3 << 1);
        long j5 = j4;
        long j6 = j2 * j4;
        long j7 = (long) (i4 << 1);
        long j8 = (long) i3;
        long j9 = (j2 * j7) + (j8 * j8);
        long j10 = (long) (i5 << 1);
        long j11 = (j5 * j7) + (j2 * j10);
        long j12 = (long) (i6 << 1);
        long j13 = (((long) i4) * j7) + (j2 * j12) + (j8 * j10);
        long j14 = (j5 * j12) + (j10 * j7);
        long j15 = (long) i5;
        long j16 = (j7 * j12) + (j15 * j15);
        long j17 = j15 * j12;
        long j18 = ((long) i6) * j12;
        long j19 = (long) i7;
        long j20 = (long) (i8 << 1);
        long j21 = j19 * j20;
        long j22 = (long) (i9 << 1);
        long j23 = (long) i8;
        long j24 = (j19 * j22) + (j23 * j23);
        long j25 = (long) (i10 << 1);
        long j26 = (j20 * j22) + (j19 * j25);
        long j27 = (long) (i11 << 1);
        long j28 = (((long) i9) * j22) + (j19 * j27) + (j23 * j25);
        long j29 = (j20 * j27) + (j25 * j22);
        long j30 = (long) i10;
        long j31 = j3 - (j29 * 38);
        long j32 = j6 - (((j22 * j27) + (j30 * j30)) * 38);
        long j33 = j9 - ((j30 * j27) * 38);
        long j34 = j11 - ((((long) i11) * j27) * 38);
        long j35 = j14 - (j19 * j19);
        long j36 = j16 - j21;
        long j37 = j17 - j24;
        long j38 = j18 - j26;
        int i12 = i3 + i8;
        int i13 = i4 + i9;
        int i14 = i5 + i10;
        int i15 = i6 + i11;
        long j39 = (long) (i2 + i7);
        long j40 = j39 * j39;
        long j41 = (long) (i12 << 1);
        long j42 = j39 * j41;
        long j43 = (long) (i13 << 1);
        long j44 = (long) i12;
        long j45 = (j39 * j43) + (j44 * j44);
        long j46 = (long) (i14 << 1);
        long j47 = (j41 * j43) + (j39 * j46);
        long j48 = (long) (i15 << 1);
        long j49 = (((long) i13) * j43) + (j39 * j48) + (j44 * j46);
        long j50 = (j41 * j48) + (j46 * j43);
        long j51 = (long) i14;
        long j52 = (j43 * j48) + (j51 * j51);
        long j53 = j38 + (j47 - j34);
        int i16 = ((int) j53) & 67108863;
        long j54 = (j53 >> 26) + ((j49 - j13) - j28);
        long j55 = j31 + ((((j54 >> 25) + j50) - j35) * 38);
        iArr2[0] = ((int) j55) & 67108863;
        long j56 = (j55 >> 26) + j32 + ((j52 - j36) * 38);
        iArr2[1] = ((int) j56) & 67108863;
        long j57 = (j56 >> 26) + j33 + (((j51 * j48) - j37) * 38);
        iArr2[2] = ((int) j57) & 33554431;
        long j58 = (j57 >> 25) + j34 + (((((long) i15) * j48) - j38) * 38);
        iArr2[3] = ((int) j58) & 67108863;
        long j59 = (j58 >> 26) + j13 + (38 * j28);
        iArr2[4] = ((int) j59) & 33554431;
        long j60 = (j59 >> 25) + j35 + (j40 - j31);
        iArr2[5] = ((int) j60) & 67108863;
        long j61 = (j60 >> 26) + j36 + (j42 - j32);
        iArr2[6] = ((int) j61) & 67108863;
        long j62 = (j61 >> 26) + j37 + (j45 - j33);
        iArr2[7] = ((int) j62) & 33554431;
        long j63 = (j62 >> 25) + ((long) i16);
        iArr2[8] = ((int) j63) & 67108863;
        iArr2[9] = (((int) j54) & 33554431) + ((int) (j63 >> 26));
    }

    public static void A09(int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = iArr[0];
        int i3 = iArr2[0];
        int i4 = iArr[1];
        int i5 = iArr2[1];
        int i6 = iArr[2];
        int i7 = iArr2[2];
        int i8 = iArr[3];
        int i9 = iArr2[3];
        int i10 = iArr[4];
        int i11 = iArr2[4];
        int i12 = iArr[5];
        int i13 = iArr2[5];
        int i14 = iArr[6];
        int i15 = iArr2[6];
        int i16 = iArr[7];
        int i17 = iArr2[7];
        int i18 = iArr[8];
        int i19 = iArr2[8];
        int i20 = iArr[9];
        int i21 = iArr2[9];
        long j2 = (long) i2;
        long j3 = (long) i3;
        long j4 = j2 * j3;
        long j5 = (long) i5;
        long j6 = (long) i4;
        long j7 = j6;
        long j8 = (j2 * j5) + (j6 * j3);
        long j9 = (long) i7;
        long j10 = (long) i6;
        long j11 = j10;
        long j12 = (j2 * j9) + (j7 * j5) + (j10 * j3);
        long j13 = (long) i9;
        long j14 = (long) i8;
        long j15 = j14;
        long j16 = (((j7 * j9) + (j11 * j5)) << 1) + (j2 * j13) + (j14 * j3);
        long j17 = (long) i11;
        long j18 = (long) i10;
        long j19 = j18;
        long j20 = ((j11 * j9) << 1) + (j2 * j17) + (j7 * j13) + (j15 * j5) + (j3 * j18);
        long j21 = (((j11 * j17) + (j19 * j9)) << 1) + (j15 * j13);
        long j22 = (j15 * j17) + (j19 * j13);
        long j23 = (long) i12;
        long j24 = (long) i13;
        long j25 = j23 * j24;
        long j26 = (long) i15;
        long j27 = j26;
        long j28 = (long) i14;
        long j29 = (j23 * j26) + (j28 * j24);
        long j30 = (long) i17;
        long j31 = (long) i16;
        long j32 = (long) i19;
        long j33 = (long) i18;
        long j34 = j33;
        long j35 = (((j28 * j30) + (j31 * j27)) << 1) + (j23 * j32) + (j33 * j24);
        long j36 = (long) i21;
        long j37 = (long) i20;
        long j38 = ((j31 * j30) << 1) + (j23 * j36) + (j28 * j32) + (j34 * j27) + (j24 * j37);
        long j39 = j4 - (((((j28 * j36) + (j31 * j32)) + (j34 * j30)) + (j37 * j27)) * 76);
        long j40 = j8 - (((((j31 * j36) + (j37 * j30)) << 1) + (j34 * j32)) * 38);
        long j41 = j12 - (((j34 * j36) + (j32 * j37)) * 38);
        long j42 = j16 - ((j37 * j36) * 76);
        long j43 = (((((j7 * j17) + (j11 * j13)) + (j15 * j9)) + (j19 * j5)) << 1) - j25;
        long j44 = j21 - j29;
        long j45 = j22 - (((j23 * j30) + (j28 * j27)) + (j31 * j24));
        long j46 = ((j19 * j17) << 1) - j35;
        int i22 = i10 + i20;
        long j47 = (long) (i2 + i12);
        long j48 = (long) (i3 + i13);
        long j49 = j47 * j48;
        long j50 = (long) (i5 + i15);
        long j51 = j50;
        long j52 = (long) (i4 + i14);
        long j53 = (j47 * j50) + (j52 * j48);
        long j54 = (long) (i7 + i17);
        long j55 = (long) (i6 + i16);
        long j56 = (j47 * j54) + (j52 * j51) + (j55 * j48);
        long j57 = (long) (i9 + i19);
        long j58 = j57;
        long j59 = (long) (i8 + i18);
        long j60 = (((j52 * j54) + (j55 * j51)) << 1) + (j47 * j57) + (j59 * j48);
        long j61 = (long) (i11 + i21);
        long j62 = (long) i22;
        long j63 = ((j55 * j54) << 1) + (j47 * j61) + (j52 * j58) + (j59 * j51) + (j48 * j62);
        long j64 = (((j55 * j61) + (j62 * j54)) << 1) + (j59 * j58);
        long j65 = j46 + (j60 - j42);
        long j66 = (j65 >> 26) + ((j63 - j20) - j38);
        long j67 = j39 + ((((j66 >> 25) + (((((j52 * j61) + (j55 * j58)) + (j59 * j54)) + (j62 * j51)) << 1)) - j43) * 38);
        iArr3[0] = ((int) j67) & 67108863;
        long j68 = (j67 >> 26) + j40 + ((j64 - j44) * 38);
        iArr3[1] = ((int) j68) & 67108863;
        long j69 = (j68 >> 26) + j41 + ((((j59 * j61) + (j62 * j58)) - j45) * 38);
        iArr3[2] = ((int) j69) & 33554431;
        long j70 = (j69 >> 25) + j42 + ((((j62 * j61) << 1) - j46) * 38);
        iArr3[3] = ((int) j70) & 67108863;
        long j71 = (j70 >> 26) + j20 + (j38 * 38);
        iArr3[4] = ((int) j71) & 33554431;
        long j72 = (j71 >> 25) + j43 + (j49 - j39);
        iArr3[5] = ((int) j72) & 67108863;
        long j73 = (j72 >> 26) + j44 + (j53 - j40);
        iArr3[6] = ((int) j73) & 67108863;
        long j74 = (j73 >> 26) + j45 + (j56 - j41);
        iArr3[7] = ((int) j74) & 33554431;
        long j75 = (j74 >> 25) + ((long) (((int) j65) & 67108863));
        iArr3[8] = ((int) j75) & 67108863;
        iArr3[9] = (((int) j66) & 33554431) + ((int) (j75 >> 26));
    }
}

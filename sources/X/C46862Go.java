package X;

import androidx.core.view.ViewCompat;

/* renamed from: X.2Go  reason: invalid class name and case insensitive filesystem */
public class C46862Go {
    public static final int A00;
    public static final int A01;
    public static final int A02;
    public static final int A03;
    public static final byte[] A04 = new byte[16];
    public static final byte[] A05;

    static {
        byte[] bytes = "expand 32-byte k".getBytes();
        A05 = bytes;
        A00 = C31461eE.A01(bytes, 0);
        A02 = C31461eE.A01(bytes, 4);
        A03 = C31461eE.A01(bytes, 8);
        A01 = C31461eE.A01(bytes, 12);
    }

    public static void A00(int[] iArr, int[] iArr2, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        long j2 = 0;
        while (i2 > 0) {
            if (i5 < Math.min(30, i2)) {
                j2 |= (((long) iArr[i3]) & 4294967295L) << i5;
                i5 += 32;
                i3++;
            }
            iArr2[i4] = ((int) j2) & 1073741823;
            j2 >>>= 30;
            i5 -= 30;
            i2 -= 30;
            i4++;
        }
    }

    public static byte[] A01(byte[] bArr, byte[] bArr2) {
        int i2;
        int i3;
        int i4;
        byte[] bArr3 = new byte[32];
        int[] iArr = new int[8];
        int i5 = 0;
        do {
            int i6 = i5 << 2;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            iArr[i5] = (bArr2[i8 + 1] << 24) | (bArr2[i6] & 255) | ((bArr2[i7] & 255) << 8) | ((bArr2[i8] & 255) << 16);
            i5++;
        } while (i5 < 8);
        iArr[0] = iArr[0] & -8;
        int i9 = iArr[7] & Integer.MAX_VALUE;
        iArr[7] = i9;
        iArr[7] = i9 | 1073741824;
        int[] iArr2 = new int[10];
        byte[] bArr4 = bArr;
        C90874ez.A04(bArr4, iArr2, 0, 0);
        C90874ez.A04(bArr4, iArr2, 16, 5);
        iArr2[9] = iArr2[9] & ViewCompat.MEASURED_SIZE_MASK;
        int[] iArr3 = new int[10];
        int i10 = 0;
        int i11 = 0;
        do {
            iArr3[i11] = iArr2[i11];
            i11++;
        } while (i11 < 10);
        int[] iArr4 = new int[10];
        int[] iArr5 = iArr4;
        iArr4[0] = 1;
        int[] iArr6 = new int[10];
        iArr6[0] = 1;
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        int[] iArr9 = new int[10];
        int i12 = 254;
        int i13 = 1;
        while (true) {
            int i14 = 0;
            do {
                int i15 = iArr6[i14];
                int i16 = iArr7[i14];
                iArr8[i14] = i15 + i16;
                iArr6[i14] = i15 - i16;
                i14++;
            } while (i14 < 10);
            int i17 = 0;
            do {
                int i18 = iArr3[i17];
                int i19 = iArr5[i17];
                iArr7[i17] = i18 + i19;
                iArr3[i17] = i18 - i19;
                i17++;
            } while (i17 < 10);
            int[] iArr10 = iArr3;
            C90874ez.A09(iArr8, iArr10, iArr8);
            C90874ez.A09(iArr6, iArr7, iArr6);
            C90874ez.A08(iArr7, iArr7);
            C90874ez.A08(iArr10, iArr10);
            int i20 = 0;
            do {
                iArr9[i20] = iArr7[i20] - iArr3[i20];
                i20++;
            } while (i20 < 10);
            C90874ez.A07(iArr9, iArr5);
            int i21 = 0;
            do {
                iArr5[i21] = iArr5[i21] + iArr3[i21];
                i21++;
            } while (i21 < 10);
            int[] iArr11 = iArr5;
            C90874ez.A09(iArr11, iArr9, iArr11);
            int[] iArr12 = iArr3;
            C90874ez.A09(iArr12, iArr7, iArr12);
            int i22 = 0;
            do {
                int i23 = iArr8[i22];
                int i24 = iArr6[i22];
                iArr6[i22] = i23 + i24;
                iArr7[i22] = i23 - i24;
                i22++;
            } while (i22 < 10);
            C90874ez.A08(iArr6, iArr6);
            C90874ez.A08(iArr7, iArr7);
            C90874ez.A09(iArr7, iArr2, iArr7);
            i12--;
            int i25 = (iArr[i12 >>> 5] >>> (i12 & 31)) & 1;
            int i26 = i13 ^ i25;
            int i27 = 0;
            int i28 = -i26;
            do {
                int i29 = iArr3[i27];
                int i30 = iArr6[i27];
                int i31 = (i29 ^ i30) & i28;
                iArr3[i27] = i29 ^ i31;
                iArr6[i27] = i30 ^ i31;
                i27++;
            } while (i27 < 10);
            int i32 = 0;
            int i33 = -i26;
            do {
                int i34 = iArr5[i32];
                int i35 = iArr7[i32];
                int i36 = (i34 ^ i35) & i33;
                iArr5[i32] = i34 ^ i36;
                iArr7[i32] = i35 ^ i36;
                i32++;
            } while (i32 < 10);
            if (i12 < 3) {
                break;
            }
            i13 = i25;
        }
        do {
            int[] iArr13 = new int[10];
            int[] iArr14 = new int[10];
            int i37 = 0;
            do {
                int i38 = iArr3[i37];
                int i39 = iArr5[i37];
                iArr13[i37] = i38 + i39;
                iArr14[i37] = i38 - i39;
                i37++;
            } while (i37 < 10);
            C90874ez.A08(iArr13, iArr13);
            C90874ez.A08(iArr14, iArr14);
            C90874ez.A09(iArr13, iArr14, iArr3);
            int i40 = 0;
            do {
                iArr13[i40] = iArr13[i40] - iArr14[i40];
                i40++;
            } while (i40 < 10);
            C90874ez.A07(iArr13, iArr5);
            int i41 = 0;
            do {
                iArr5[i41] = iArr5[i41] + iArr14[i41];
                i41++;
            } while (i41 < 10);
            int[] iArr15 = iArr5;
            C90874ez.A09(iArr15, iArr13, iArr15);
            i10++;
        } while (i10 < 3);
        int[] iArr16 = new int[10];
        int[] iArr17 = new int[8];
        int i42 = 0;
        do {
            iArr16[i42] = iArr5[i42];
            i42++;
        } while (i42 < 10);
        int i43 = (iArr16[9] >>> 23) & 1;
        C90874ez.A06(iArr16, i43);
        C90874ez.A06(iArr16, -i43);
        int[] iArr18 = iArr17;
        C90874ez.A02(0, 0, iArr16, iArr18);
        C90874ez.A02(5, 4, iArr16, iArr18);
        int[] iArr19 = C90874ez.A00;
        int length = iArr19.length;
        int numberOfLeadingZeros = (length << 5) - Integer.numberOfLeadingZeros(iArr19[length - 1]);
        int i44 = (numberOfLeadingZeros + 29) / 30;
        int[] iArr20 = new int[4];
        int[] iArr21 = new int[i44];
        int[] iArr22 = new int[i44];
        int[] iArr23 = new int[i44];
        int[] iArr24 = new int[i44];
        int[] iArr25 = new int[i44];
        iArr22[0] = 1;
        int i45 = numberOfLeadingZeros;
        A00(iArr17, iArr24, i45);
        int[] iArr26 = iArr25;
        A00(iArr19, iArr26, i45);
        System.arraycopy(iArr26, 0, iArr23, 0, i44);
        int i46 = iArr25[0];
        int i47 = (2 - (i46 * i46)) * i46;
        int i48 = i47 * (2 - (i46 * i47));
        int i49 = i48 * (2 - (i46 * i48));
        int i50 = i49 * (2 - (i46 * i49));
        int i51 = numberOfLeadingZeros * 49;
        int i52 = 47;
        if (numberOfLeadingZeros < 46) {
            i52 = 80;
        }
        int i53 = (i51 + i52) / 17;
        int i54 = -1;
        for (int i55 = 0; i55 < i53; i55 += 30) {
            int i56 = iArr23[0];
            int i57 = iArr24[0];
            int i58 = 1;
            int i59 = 0;
            int i60 = 0;
            int i61 = 1;
            for (int i62 = 0; i62 < 30; i62++) {
                int i63 = i54 >> 31;
                int i64 = -(i57 & 1);
                int i65 = i57 + (((i56 ^ i63) - i63) & i64);
                i60 += ((i58 ^ i63) - i63) & i64;
                i61 += ((i59 ^ i63) - i63) & i64;
                int i66 = i63 & i64;
                i54 = (i54 ^ i66) - (i66 + 1);
                i56 += i65 & i66;
                i57 = i65 >> 1;
                i58 = (i58 + (i60 & i66)) << 1;
                i59 = (i59 + (i66 & i61)) << 1;
            }
            iArr20[0] = i58;
            iArr20[1] = i59;
            iArr20[2] = i60;
            iArr20[3] = i61;
            int i67 = iArr20[0];
            int i68 = iArr20[1];
            int i69 = iArr20[2];
            int i70 = i44 - 1;
            int i71 = iArr21[i70] >> 31;
            int i72 = iArr22[i70] >> 31;
            int i73 = (i67 & i71) + (i68 & i72);
            int i74 = (i71 & i69) + (i72 & i61);
            int i75 = iArr25[0];
            long j2 = (long) i67;
            long j3 = (long) iArr21[0];
            long j4 = j3;
            long j5 = j2 * j3;
            long j6 = (long) i68;
            long j7 = j6;
            long j8 = (long) iArr22[0];
            long j9 = j5 + (j6 * j8);
            long j10 = (long) i69;
            long j11 = j10;
            long j12 = j4 * j10;
            long j13 = (long) i61;
            long j14 = j13;
            long j15 = j12 + (j8 * j13);
            long j16 = (long) i75;
            long j17 = (long) (i73 - (((((int) j9) * i50) + i73) & 1073741823));
            long j18 = (long) (i74 - (((((int) j15) * i50) + i74) & 1073741823));
            long j19 = (j9 + (j16 * j17)) >> 30;
            long j20 = (j15 + (j16 * j18)) >> 30;
            for (int i76 = 1; i76 < i44; i76++) {
                int i77 = iArr25[i76];
                long j21 = (long) iArr21[i76];
                long j22 = (long) iArr22[i76];
                long j23 = (long) i77;
                long j24 = j19 + (j2 * j21) + (j7 * j22) + (j23 * j17);
                long j25 = j20 + (j21 * j11) + (j22 * j14) + (j23 * j18);
                int i78 = i76 - 1;
                iArr21[i78] = ((int) j24) & 1073741823;
                j19 = j24 >> 30;
                iArr22[i78] = ((int) j25) & 1073741823;
                j20 = j25 >> 30;
            }
            iArr21[i70] = (int) j19;
            iArr22[i70] = (int) j20;
            int i79 = iArr20[0];
            int i80 = iArr20[1];
            int i81 = iArr20[2];
            int i82 = iArr20[3];
            long j26 = (long) i79;
            long j27 = (long) iArr23[0];
            long j28 = j27;
            long j29 = j26 * j27;
            long j30 = (long) i80;
            long j31 = (long) iArr24[0];
            long j32 = (long) i81;
            long j33 = (long) i82;
            long j34 = (j29 + (j30 * j31)) >> 30;
            long j35 = ((j28 * j32) + (j31 * j33)) >> 30;
            for (int i83 = 1; i83 < i44; i83++) {
                long j36 = (long) iArr23[i83];
                long j37 = (long) iArr24[i83];
                long j38 = j34 + (j26 * j36) + (j30 * j37);
                long j39 = j35 + (j36 * j32) + (j37 * j33);
                int i84 = i83 - 1;
                iArr23[i84] = ((int) j38) & 1073741823;
                j34 = j38 >> 30;
                iArr24[i84] = 1073741823 & ((int) j39);
                j35 = j39 >> 30;
            }
            int i85 = i44 - 1;
            iArr23[i85] = (int) j34;
            iArr24[i85] = (int) j35;
        }
        int i86 = i44 - 1;
        int i87 = iArr23[i86] >> 31;
        int i88 = 0;
        for (int i89 = 0; i89 < i86; i89++) {
            int i90 = i88 + ((iArr23[i89] ^ i87) - i87);
            iArr23[i89] = 1073741823 & i90;
            i88 = i90 >> 30;
        }
        iArr23[i86] = i88 + ((iArr23[i86] ^ i87) - i87);
        int i91 = iArr21[i86] >> 31;
        int i92 = 0;
        for (int i93 = 0; i93 < i86; i93++) {
            int i94 = i92 + (((iArr21[i93] + (iArr25[i93] & i91)) ^ i87) - i87);
            iArr21[i93] = 1073741823 & i94;
            i92 = i94 >> 30;
        }
        int i95 = i92 + (((iArr21[i86] + (i91 & iArr25[i86])) ^ i87) - i87);
        iArr21[i86] = i95;
        int i96 = i95 >> 31;
        int i97 = 0;
        for (int i98 = 0; i98 < i86; i98++) {
            int i99 = i97 + iArr21[i98] + (iArr25[i98] & i96);
            iArr21[i98] = i99 & 1073741823;
            i97 = i99 >> 30;
        }
        iArr21[i86] = i97 + iArr21[i86] + (i96 & iArr25[i86]);
        int i100 = 0;
        int i101 = 0;
        int i102 = 0;
        long j40 = 0;
        while (true) {
            i2 = 1;
            if (numberOfLeadingZeros <= 0) {
                break;
            }
            while (i102 < Math.min(32, numberOfLeadingZeros)) {
                j40 |= ((long) iArr21[i100]) << i102;
                i102 += 30;
                i100++;
            }
            iArr17[i101] = (int) j40;
            j40 >>>= 32;
            i102 -= 32;
            numberOfLeadingZeros -= 32;
            i101++;
        }
        do {
            i3 = i2;
            i2++;
        } while (i3 < i44);
        int i103 = 0;
        do {
            i4 = i103;
            i103++;
        } while (i4 < i44);
        int[] iArr27 = iArr17;
        int[] iArr28 = iArr5;
        C90874ez.A01(0, 0, iArr27, iArr28);
        C90874ez.A01(4, 5, iArr27, iArr28);
        iArr5[9] = iArr5[9] & ViewCompat.MEASURED_SIZE_MASK;
        int[] iArr29 = iArr3;
        C90874ez.A09(iArr29, iArr5, iArr29);
        int i104 = (iArr3[9] >>> 23) & 1;
        C90874ez.A06(iArr29, i104);
        C90874ez.A06(iArr29, -i104);
        byte[] bArr5 = bArr3;
        C90874ez.A05(bArr5, iArr29, 0, 0);
        C90874ez.A05(bArr5, iArr29, 5, 16);
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = A04;
        int A012 = C31461eE.A01(bArr7, 0);
        int A013 = C31461eE.A01(bArr7, 4);
        int A014 = C31461eE.A01(bArr7, 8);
        int A015 = C31461eE.A01(bArr7, 12);
        int i105 = A00;
        int i106 = A02;
        int i107 = A03;
        int i108 = A01;
        int[] iArr30 = {i105, C31461eE.A01(bArr3, 0), C31461eE.A01(bArr3, 4), C31461eE.A01(bArr3, 8), C31461eE.A01(bArr3, 12), i106, A012, A013, A014, A015, i107, C31461eE.A01(bArr3, 16), C31461eE.A01(bArr3, 20), C31461eE.A01(bArr3, 24), C31461eE.A01(bArr3, 28), i108};
        C46882Gq.A00(iArr30, iArr30);
        iArr30[0] = iArr30[0] - i105;
        iArr30[5] = iArr30[5] - i106;
        iArr30[10] = iArr30[10] - i107;
        iArr30[15] = iArr30[15] - i108;
        iArr30[6] = iArr30[6] - A012;
        iArr30[7] = iArr30[7] - A013;
        iArr30[8] = iArr30[8] - A014;
        int i109 = iArr30[9] - A015;
        iArr30[9] = i109;
        C31461eE.A03(bArr6, iArr30[0], 0);
        C31461eE.A03(bArr6, iArr30[5], 4);
        C31461eE.A03(bArr6, iArr30[10], 8);
        C31461eE.A03(bArr6, iArr30[15], 12);
        C31461eE.A03(bArr6, iArr30[6], 16);
        C31461eE.A03(bArr6, iArr30[7], 20);
        C31461eE.A03(bArr6, iArr30[8], 24);
        C31461eE.A03(bArr6, i109, 28);
        return bArr6;
    }
}

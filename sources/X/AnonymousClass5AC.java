package X;

/* renamed from: X.5AC  reason: invalid class name */
public abstract class AnonymousClass5AC implements AnonymousClass5SH, AnonymousClass5VO {
    public int A00;
    public long A01;
    public final byte[] A02;

    public AnonymousClass5AC() {
        this.A02 = new byte[4];
        this.A00 = 0;
    }

    public AnonymousClass5AC(AnonymousClass5AC r2) {
        this.A02 = new byte[4];
        A0E(r2);
    }

    public static int A00(int i2) {
        return (i2 >>> 22) | (i2 << 10);
    }

    public static int A01(int i2, int i3, int i4) {
        int i5 = i2 + i3;
        return ((i5 >>> 18) | (i5 << 14)) + i4;
    }

    public static int A02(int i2, int i3, int i4) {
        int i5 = i2 + i3;
        return ((i5 >>> 20) | (i5 << 12)) + i4;
    }

    public static int A03(int i2, int i3, int i4) {
        int i5 = i2 + i3;
        return ((i5 >>> 21) | (i5 << 11)) + i4;
    }

    public static int A04(int i2, int i3, int i4) {
        int i5 = i2 + i3;
        return ((i5 >>> 23) | (i5 << 9)) + i4;
    }

    public static int A05(int i2, int i3, int i4, int i5) {
        return i5 + (((i3 ^ -1) & i4) | (i2 & i3));
    }

    public static int A06(int i2, int i3, int i4, int i5) {
        return i5 + ((i2 ^ i3) ^ i4);
    }

    public static int A07(int i2, int i3, int i4, int i5) {
        return ((i2 >>> i3) | i4) + i5;
    }

    public static int A08(int i2, int i3, int i4, int i5, int i6) {
        return i5 + ((i2 & i3) | (i4 & (i3 ^ -1))) + i6;
    }

    public static int A09(int i2, int i3, int i4, int i5, int i6) {
        return i5 + ((i3 | (i2 ^ -1)) ^ i4) + i6;
    }

    public static int A0A(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i4 + 1;
        return (bArr[i5 + 1] & 255) | i3 | (i2 << 16) | ((bArr[i5] & 255) << 8);
    }

    public static int A0B(byte[] bArr, int[] iArr, int i2, int i3) {
        iArr[i3] = ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        return 16;
    }

    public static int A0C(int[] iArr, int i2) {
        int i3 = iArr[i2 - 2];
        int i4 = ((i3 >>> 10) ^ (((i3 >>> 17) | (i3 << 15)) ^ ((i3 >>> 19) | (i3 << 13)))) + iArr[i2 - 7];
        int i5 = iArr[i2 - 15];
        iArr[i2] = i4 + ((i5 >>> 3) ^ (((i5 >>> 7) | (i5 << 25)) ^ ((i5 >>> 18) | (i5 << 14)))) + iArr[i2 - 16];
        return i2 + 1;
    }

    public void A0D() {
        char c2;
        int[] iArr;
        char c3;
        char c4;
        int[] iArr2;
        int i2;
        long j2 = this.A01 << 3;
        byte b2 = Byte.MIN_VALUE;
        while (true) {
            AhH(b2);
            if (this.A00 == 0) {
                break;
            }
            b2 = 0;
        }
        if (this instanceof AnonymousClass5JP) {
            AnonymousClass5JP r1 = (AnonymousClass5JP) this;
            int i3 = r1.A00;
            if (i3 > 14) {
                r1.A03[i3] = 0;
                r1.A00 = i3 + 1;
                r1.A0L();
            }
            while (true) {
                i2 = r1.A00;
                if (i2 >= 14) {
                    break;
                }
                r1.A03[i2] = 0;
                r1.A00 = i2 + 1;
            }
            int[] iArr3 = r1.A03;
            int i4 = i2 + 1;
            r1.A00 = i4;
            iArr3[i2] = (int) (j2 >>> 32);
            r1.A00 = i4 + 1;
            iArr3[i4] = (int) j2;
        } else {
            if (this instanceof AnonymousClass5JU) {
                AnonymousClass5JU r12 = (AnonymousClass5JU) this;
                c4 = 14;
                if (r12.A08 > 14) {
                    r12.A0L();
                }
                iArr2 = r12.A09;
            } else if (this instanceof AnonymousClass5JT) {
                AnonymousClass5JT r13 = (AnonymousClass5JT) this;
                c4 = 14;
                if (r13.A08 > 14) {
                    r13.A0L();
                }
                iArr2 = r13.A09;
            } else {
                if (this instanceof AnonymousClass5JR) {
                    AnonymousClass5JR r14 = (AnonymousClass5JR) this;
                    if (r14.A05 > 14) {
                        r14.A0L();
                    }
                    iArr = r14.A06;
                    iArr[14] = (int) (j2 >>> 32);
                    c3 = 15;
                } else {
                    if (this instanceof AnonymousClass5JQ) {
                        AnonymousClass5JQ r15 = (AnonymousClass5JQ) this;
                        c2 = 14;
                        if (r15.A05 > 14) {
                            r15.A0L();
                        }
                        iArr = r15.A06;
                    } else {
                        AnonymousClass5JS r16 = (AnonymousClass5JS) this;
                        c2 = 14;
                        if (r16.A04 > 14) {
                            r16.A0L();
                        }
                        iArr = r16.A05;
                    }
                    iArr[c2] = (int) (-1 & j2);
                    c3 = 15;
                    j2 >>>= 32;
                }
                iArr[c3] = (int) j2;
            }
            iArr2[c4] = (int) (j2 >>> 32);
            iArr2[15] = (int) (j2 & -1);
        }
        A0L();
    }

    public void A0E(AnonymousClass5AC r5) {
        byte[] bArr = r5.A02;
        System.arraycopy(bArr, 0, this.A02, 0, bArr.length);
        this.A00 = r5.A00;
        this.A01 = r5.A01;
    }

    public void A0F(byte[] bArr, int i2) {
        if (this instanceof AnonymousClass5JP) {
            AnonymousClass5JP r4 = (AnonymousClass5JP) this;
            int i3 = i2 + 1;
            int A0A = A0A(bArr, bArr[i3] & 255, (bArr[i2] & 255) << 24, i3);
            int[] iArr = r4.A03;
            int i4 = r4.A00;
            iArr[i4] = A0A;
            int i5 = i4 + 1;
            r4.A00 = i5;
            if (i5 >= 16) {
                r4.A0L();
            }
        } else if (this instanceof AnonymousClass5JU) {
            AnonymousClass5JU r42 = (AnonymousClass5JU) this;
            int i6 = i2 + 1;
            int A0A2 = A0A(bArr, bArr[i6] & 255, bArr[i2] << 24, i6);
            int[] iArr2 = r42.A09;
            int i7 = r42.A08;
            iArr2[i7] = A0A2;
            int i8 = i7 + 1;
            r42.A08 = i8;
            if (i8 == 16) {
                r42.A0L();
            }
        } else if (this instanceof AnonymousClass5JT) {
            AnonymousClass5JT r43 = (AnonymousClass5JT) this;
            int i9 = i2 + 1;
            int A0A3 = A0A(bArr, bArr[i9] & 255, bArr[i2] << 24, i9);
            int[] iArr3 = r43.A09;
            int i10 = r43.A08;
            iArr3[i10] = A0A3;
            int i11 = i10 + 1;
            r43.A08 = i11;
            if (i11 == 16) {
                r43.A0L();
            }
        } else if (this instanceof AnonymousClass5JR) {
            AnonymousClass5JR r44 = (AnonymousClass5JR) this;
            int i12 = i2 + 1;
            int A0A4 = A0A(bArr, bArr[i12] & 255, bArr[i2] << 24, i12);
            int[] iArr4 = r44.A06;
            int i13 = r44.A05;
            iArr4[i13] = A0A4;
            int i14 = i13 + 1;
            r44.A05 = i14;
            if (i14 == 16) {
                r44.A0L();
            }
        } else if (this instanceof AnonymousClass5JQ) {
            AnonymousClass5JQ r3 = (AnonymousClass5JQ) this;
            int[] iArr5 = r3.A06;
            int i15 = r3.A05;
            int i16 = i15 + 1;
            r3.A05 = i16;
            if (i16 == A0B(bArr, iArr5, i2, i15)) {
                r3.A0L();
            }
        } else {
            AnonymousClass5JS r32 = (AnonymousClass5JS) this;
            int[] iArr6 = r32.A05;
            int i17 = r32.A04;
            int i18 = i17 + 1;
            r32.A04 = i18;
            if (i18 == A0B(bArr, iArr6, i2, i17)) {
                r32.A0L();
            }
        }
    }

    public void A0L() {
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3;
        int i4;
        int i5;
        AnonymousClass5JP r4 = (AnonymousClass5JP) this;
        int i6 = 0;
        do {
            iArr = r4.A02;
            iArr[i6] = r4.A03[i6];
            i6++;
        } while (i6 < 16);
        int i7 = 16;
        do {
            int i8 = iArr[i7 - 3];
            int i9 = (i8 >>> 17) | (i8 << 15);
            int i10 = iArr[i7 - 13];
            int i11 = i9 ^ (iArr[i7 - 16] ^ iArr[i7 - 9]);
            iArr[i7] = (((i11 ^ ((i11 << 15) | (i11 >>> 17))) ^ ((i11 << 23) | (i11 >>> 9))) ^ ((i10 >>> 25) | (i10 << 7))) ^ iArr[i7 - 6];
            i7++;
        } while (i7 < 68);
        int[] iArr3 = r4.A01;
        int i12 = iArr3[0];
        int i13 = i12;
        int i14 = iArr3[1];
        int i15 = iArr3[2];
        int i16 = iArr3[3];
        int i17 = iArr3[4];
        int i18 = iArr3[5];
        int i19 = iArr3[6];
        int i20 = iArr3[7];
        int i21 = 0;
        do {
            int i22 = (i12 << 12) | (i12 >>> 20);
            iArr2 = AnonymousClass5JP.A04;
            int i23 = i22 + i17 + iArr2[i21];
            int i24 = (i23 << 7) | (i23 >>> 25);
            int i25 = iArr[i21];
            i2 = ((i12 ^ i14) ^ i15) + i16 + (i22 ^ i24) + (iArr[i21 + 4] ^ i25);
            int i26 = ((i17 ^ i18) ^ i19) + i20 + i24 + i25;
            int i27 = (i18 << 19) | (i18 >>> 13);
            i3 = (i26 ^ ((i26 << 9) | (i26 >>> 23))) ^ ((i26 << 17) | (i26 >>> 15));
            i21++;
            i18 = i17;
            i17 = i3;
            i16 = i15;
            i15 = (i14 << 9) | (i14 >>> 23);
            i20 = i19;
            i19 = i27;
            i14 = i12;
            i12 = i2;
        } while (i21 < 16);
        int i28 = 16;
        do {
            int i29 = (i2 << 12) | (i2 >>> 20);
            int i30 = i29 + i3 + iArr2[i28];
            int i31 = (i30 << 7) | (i30 >>> 25);
            int i32 = i31 ^ i29;
            int i33 = iArr[i28];
            i2 = ((i2 & i15) | (i2 & i14) | (i14 & i15)) + i16 + i32 + (i33 ^ iArr[i28 + 4]);
            int i34 = (((i3 ^ -1) & i19) | (i18 & i3)) + i20 + i31 + i33;
            i4 = (i14 >>> 23) | (i14 << 9);
            i5 = (i18 << 19) | (i18 >>> 13);
            i3 = (i34 ^ ((i34 << 9) | (i34 >>> 23))) ^ ((i34 << 17) | (i34 >>> 15));
            i28++;
            i18 = i17;
            i17 = i3;
            i16 = i15;
            i15 = i4;
            i14 = i12;
            i12 = i2;
            i20 = i19;
            i19 = i5;
        } while (i28 < 64);
        iArr3[0] = i2 ^ i13;
        iArr3[1] = iArr3[1] ^ i14;
        iArr3[2] = iArr3[2] ^ i4;
        iArr3[3] = iArr3[3] ^ i16;
        iArr3[4] = iArr3[4] ^ i3;
        iArr3[5] = iArr3[5] ^ i18;
        iArr3[6] = i5 ^ iArr3[6];
        iArr3[7] = iArr3[7] ^ i20;
        r4.A00 = 0;
    }

    public int AAI() {
        return 64;
    }

    public void AhH(byte b2) {
        byte[] bArr = this.A02;
        int i2 = this.A00;
        int i3 = i2 + 1;
        this.A00 = i3;
        bArr[i2] = b2;
        if (i3 == bArr.length) {
            A0F(bArr, 0);
            this.A00 = 0;
        }
        this.A01++;
    }

    public void reset() {
        this.A01 = 0;
        this.A00 = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.A02;
            if (i2 < bArr.length) {
                bArr[i2] = 0;
                i2++;
            } else {
                return;
            }
        }
    }

    public void update(byte[] bArr, int i2, int i3) {
        int i4 = 0;
        int max = Math.max(0, i3);
        int i5 = this.A00;
        int i6 = 0;
        if (i5 != 0) {
            while (true) {
                if (i6 >= max) {
                    i4 = i6;
                    break;
                }
                byte[] bArr2 = this.A02;
                int i7 = i5;
                i5++;
                this.A00 = i5;
                int i8 = i6 + 1;
                AnonymousClass3K4.A16(bArr, bArr2, i6 + i2, i7);
                if (i5 == 4) {
                    A0F(bArr2, 0);
                    this.A00 = 0;
                    i5 = 0;
                    i4 = i8;
                    break;
                }
                i6 = i8;
            }
        }
        int i9 = ((max - i4) & -4) + i4;
        while (i4 < i9) {
            A0F(bArr, i2 + i4);
            i4 += 4;
        }
        while (i4 < max) {
            byte[] bArr3 = this.A02;
            int i10 = i5;
            i5++;
            this.A00 = i5;
            AnonymousClass3K4.A16(bArr, bArr3, i4 + i2, i10);
            i4++;
        }
        this.A01 += (long) max;
    }
}

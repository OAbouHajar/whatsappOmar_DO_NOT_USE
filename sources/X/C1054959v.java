package X;

/* renamed from: X.59v  reason: invalid class name and case insensitive filesystem */
public class C1054959v implements AnonymousClass5VP {
    public int A00;
    public int A01;
    public AnonymousClass5T1 A02;
    public C46932Gv A03;
    public AnonymousClass401 A04 = new AnonymousClass401(this);
    public AnonymousClass401 A05 = new AnonymousClass401(this);
    public boolean A06;
    public byte[] A07;
    public byte[] A08;
    public byte[] A09;

    public C1054959v(AnonymousClass5T1 r3) {
        this.A02 = r3;
        int AA7 = r3.AA7();
        this.A00 = AA7;
        this.A08 = new byte[AA7];
        if (AA7 != 16) {
            throw AnonymousClass000.A0T("cipher required with a block size of 16.");
        }
    }

    public final void A00(byte[] bArr, byte[] bArr2, int i2, int i3) {
        String str;
        int i4;
        int i5 = i2;
        int i6 = i3;
        AnonymousClass5T1 r3 = this.A02;
        int i7 = this.A01 << 3;
        if (i7 % 8 == 0) {
            AnonymousClass59X r10 = new AnonymousClass59X(r3);
            int i8 = i7 >> 3;
            int AA7 = r3.AA7();
            byte[] bArr3 = new byte[AA7];
            byte[] bArr4 = new byte[AA7];
            C46932Gv r1 = this.A03;
            for (int i9 = 0; i9 < AA7; i9++) {
                bArr4[i9] = 0;
            }
            r10.reset();
            r10.AI1(r1, true);
            byte[] bArr5 = new byte[16];
            AnonymousClass401 r17 = this.A04;
            int size = r17.size();
            byte[] bArr6 = this.A07;
            if (size + (bArr6 == null ? 0 : bArr6.length) > 0) {
                bArr5[0] = (byte) (bArr5[0] | 64);
            }
            int i10 = 2;
            byte b2 = (byte) (bArr5[0] | ((((i8 - 2) / 2) & 7) << 3));
            bArr5[0] = b2;
            byte[] bArr7 = this.A09;
            int length = bArr7.length;
            AnonymousClass3K4.A0i(b2, bArr5, ((15 - length) - 1) & 7, 0);
            System.arraycopy(bArr7, 0, bArr5, 1, length);
            int i11 = i6;
            int i12 = 1;
            while (i11 > 0) {
                AnonymousClass3K4.A15(bArr5, i11, 16 - i12);
                i11 >>>= 8;
                i12++;
            }
            int i13 = 0;
            int i14 = 16;
            int AA72 = r10.A01.AA7();
            if (16 > AA72) {
                System.arraycopy(bArr5, 0, bArr4, 0, AA72);
                r10.Aaq(bArr4, bArr3, 0, 0);
                i14 = 16 - AA72;
                i13 = AA72;
                while (i14 > AA72) {
                    r10.Aaq(bArr5, bArr3, i13, 0);
                    i14 -= AA72;
                    i13 += AA72;
                }
            }
            System.arraycopy(bArr5, i13, bArr4, 0, i14);
            int size2 = r17.size();
            byte[] bArr8 = this.A07;
            if (size2 + (bArr8 == null ? 0 : bArr8.length) > 0) {
                int size3 = r17.size();
                byte[] bArr9 = this.A07;
                int length2 = size3 + (bArr9 == null ? 0 : bArr9.length);
                if (length2 < 65280) {
                    byte b3 = (byte) (length2 >> 8);
                    if (i14 == AA7) {
                        r10.Aaq(bArr4, bArr3, 0, 0);
                        i14 = 0;
                    }
                    int i15 = i14 + 1;
                    bArr4[i14] = b3;
                    byte b4 = (byte) length2;
                    if (i15 == AA7) {
                        r10.Aaq(bArr4, bArr3, 0, 0);
                        i15 = 0;
                    }
                    i4 = i15 + 1;
                    bArr4[i15] = b4;
                } else {
                    if (i14 == AA7) {
                        r10.Aaq(bArr4, bArr3, 0, 0);
                        i14 = 0;
                    }
                    int i16 = i14 + 1;
                    bArr4[i14] = -1;
                    if (i16 == AA7) {
                        r10.Aaq(bArr4, bArr3, 0, 0);
                        i16 = 0;
                    }
                    int i17 = i16 + 1;
                    bArr4[i16] = -2;
                    byte b5 = (byte) (length2 >> 24);
                    if (i17 == AA7) {
                        r10.Aaq(bArr4, bArr3, 0, 0);
                        i17 = 0;
                    }
                    int i18 = i17 + 1;
                    bArr4[i17] = b5;
                    byte b6 = (byte) (length2 >> 16);
                    if (i18 == AA7) {
                        r10.Aaq(bArr4, bArr3, 0, 0);
                        i18 = 0;
                    }
                    int i19 = i18 + 1;
                    bArr4[i18] = b6;
                    byte b7 = (byte) (length2 >> 8);
                    if (i19 == AA7) {
                        r10.Aaq(bArr4, bArr3, 0, 0);
                        i19 = 0;
                    }
                    int i20 = i19 + 1;
                    bArr4[i19] = b7;
                    byte b8 = (byte) length2;
                    if (i20 == AA7) {
                        r10.Aaq(bArr4, bArr3, 0, 0);
                        i20 = 0;
                    }
                    i4 = i20 + 1;
                    bArr4[i20] = b8;
                    i10 = 6;
                }
                byte[] bArr10 = this.A07;
                if (bArr10 != null) {
                    int length3 = bArr10.length;
                    int i21 = 0;
                    int i22 = AA72 - i4;
                    if (length3 > i22) {
                        System.arraycopy(bArr10, 0, bArr4, i4, i22);
                        r10.Aaq(bArr4, bArr3, 0, 0);
                        i4 = 0;
                        length3 -= i22;
                        i21 = i22;
                        while (length3 > AA72) {
                            r10.Aaq(bArr10, bArr3, i21, 0);
                            length3 -= AA72;
                            i21 += AA72;
                        }
                    }
                    System.arraycopy(bArr10, i21, bArr4, i4, length3);
                    i4 += length3;
                }
                if (r17.size() > 0) {
                    byte[] A002 = r17.A00();
                    int size4 = r17.size();
                    int i23 = 0;
                    if (size4 >= 0) {
                        int i24 = AA72 - i4;
                        if (size4 > i24) {
                            System.arraycopy(A002, 0, bArr4, i4, i24);
                            r10.Aaq(bArr4, bArr3, 0, 0);
                            i4 = 0;
                            size4 -= i24;
                            i23 = i24;
                            while (size4 > AA72) {
                                r10.Aaq(A002, bArr3, i23, 0);
                                size4 -= AA72;
                                i23 += AA72;
                            }
                        }
                        System.arraycopy(A002, i23, bArr4, i4, size4);
                        i4 += size4;
                    }
                    str = "Can't have a negative input length!";
                }
                int i25 = (i10 + length2) % 16;
                if (i25 != 0) {
                    while (i25 != 16) {
                        int i26 = i14;
                        if (i14 == AA7) {
                            r10.Aaq(bArr4, bArr3, 0, 0);
                            i26 = 0;
                        }
                        i14 = i26 + 1;
                        bArr4[i26] = 0;
                        i25++;
                    }
                }
            }
            if (i3 >= 0) {
                int i27 = AA72 - i14;
                byte[] bArr11 = bArr;
                if (i6 > i27) {
                    System.arraycopy(bArr11, i5, bArr4, i14, i27);
                    r10.Aaq(bArr4, bArr3, 0, 0);
                    i14 = 0;
                    i6 = i3 - i27;
                    i5 = i2 + i27;
                    while (i6 > AA72) {
                        r10.Aaq(bArr11, bArr3, i5, 0);
                        i6 -= AA72;
                        i5 += AA72;
                    }
                }
                System.arraycopy(bArr11, i5, bArr4, i14, i6);
                for (int i28 = i14 + i6; i28 < AA72; i28++) {
                    bArr4[i28] = 0;
                }
                r10.Aaq(bArr4, bArr3, 0, 0);
                System.arraycopy(bArr3, 0, bArr2, 0, i8);
                for (int i29 = 0; i29 < AA7; i29++) {
                    bArr4[i29] = 0;
                }
                r10.reset();
                return;
            }
            str = "Can't have a negative input length!";
        } else {
            str = "MAC size must be multiple of 8";
        }
        throw AnonymousClass000.A0T(str);
    }

    public int A8A(byte[] bArr, int i2) {
        int i3;
        AnonymousClass401 r8 = this.A05;
        byte[] A002 = r8.A00();
        int size = r8.size();
        int i4 = 0;
        if (this.A03 != null) {
            byte[] bArr2 = this.A09;
            int length = bArr2.length;
            int i5 = 15 - length;
            if (i5 >= 4 || size < (1 << (i5 << 3))) {
                int i6 = this.A00;
                byte[] bArr3 = new byte[i6];
                bArr3[0] = (byte) ((i5 - 1) & 7);
                System.arraycopy(bArr2, 0, bArr3, 1, length);
                AnonymousClass5T1 r6 = this.A02;
                AnonymousClass5JO r5 = new AnonymousClass5JO(r6);
                r5.AI1(new C1054259l(this.A03, bArr3), this.A06);
                boolean z2 = this.A06;
                int i7 = this.A01;
                if (z2) {
                    i3 = i7 + size;
                    if (bArr.length >= i3 + i2) {
                        byte[] bArr4 = this.A08;
                        A00(A002, bArr4, 0, size);
                        byte[] bArr5 = new byte[i6];
                        r5.Aaq(bArr4, bArr5, 0, 0);
                        int i8 = i2;
                        while (i4 < size - i6) {
                            r5.Aaq(A002, bArr, i4, i8);
                            i8 += i6;
                            i4 += i6;
                        }
                        byte[] bArr6 = new byte[i6];
                        int i9 = size - i4;
                        System.arraycopy(A002, i4, bArr6, 0, i9);
                        r5.Aaq(bArr6, bArr6, 0, 0);
                        System.arraycopy(bArr6, 0, bArr, i8, i9);
                        System.arraycopy(bArr5, 0, bArr, i2 + size, this.A01);
                    } else {
                        throw new AnonymousClass5JD("Output buffer too short.");
                    }
                } else if (size >= i7) {
                    int i10 = size - i7;
                    if (bArr.length >= i10 + i2) {
                        byte[] bArr7 = this.A08;
                        System.arraycopy(A002, i10, bArr7, 0, i7);
                        r5.Aaq(bArr7, bArr7, 0, 0);
                        for (int i11 = this.A01; i11 != bArr7.length; i11++) {
                            bArr7[i11] = 0;
                        }
                        int i12 = 0;
                        int i13 = i2;
                        while (i12 < i10 - i6) {
                            r5.Aaq(A002, bArr, i12, i13);
                            i13 += i6;
                            i12 += i6;
                        }
                        byte[] bArr8 = new byte[i6];
                        int i14 = i10 - i12;
                        System.arraycopy(A002, i12, bArr8, 0, i14);
                        r5.Aaq(bArr8, bArr8, 0, 0);
                        System.arraycopy(bArr8, 0, bArr, i13, i14);
                        byte[] bArr9 = new byte[i6];
                        A00(bArr, bArr9, i2, i10);
                        if (C33111hx.A01(bArr7, bArr9)) {
                            i3 = i10;
                        } else {
                            throw new AnonymousClass5JC("mac check in CCM failed");
                        }
                    } else {
                        throw new AnonymousClass5JD("Output buffer too short.");
                    }
                } else {
                    throw new AnonymousClass5JC("data too short");
                }
                r6.reset();
                this.A04.reset();
                r8.reset();
                return i3;
            }
            throw AnonymousClass000.A0V("CCM packet too large for choice of q.");
        }
        throw AnonymousClass000.A0V("CCM cipher unitialized.");
    }

    public String A9q() {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass3K4.A14(A0o, this.A02);
        return AnonymousClass000.A0h("/CCM", A0o);
    }

    public byte[] ADG() {
        int i2 = this.A01;
        byte[] bArr = new byte[i2];
        System.arraycopy(this.A08, 0, bArr, 0, i2);
        return bArr;
    }

    public int AE9(int i2) {
        int size = i2 + this.A05.size();
        boolean z2 = this.A06;
        int i3 = this.A01;
        if (z2) {
            return size + i3;
        }
        int i4 = size;
        int i5 = size - i3;
        if (i4 < i3) {
            return 0;
        }
        return i5;
    }

    public AnonymousClass5T1 AGk() {
        return this.A02;
    }

    public int AGm(int i2) {
        return 0;
    }

    public void AI1(C46932Gv r3, boolean z2) {
        String str;
        C46932Gv r0;
        int length;
        this.A06 = z2;
        if (r3 instanceof C1053859h) {
            C1053859h r32 = (C1053859h) r3;
            this.A09 = C33111hx.A02(r32.A03);
            this.A07 = C33111hx.A02(r32.A02);
            int i2 = r32.A00;
            if (!z2 || (i2 >= 32 && i2 <= 128 && (i2 & 15) == 0)) {
                this.A01 = i2 >>> 3;
                r0 = r32.A01;
            } else {
                str = "tag length in octets must be one of {4,6,8,10,12,14,16}";
                throw AnonymousClass000.A0T(str);
            }
        } else if (r3 instanceof C1054259l) {
            C1054259l r33 = (C1054259l) r3;
            this.A09 = r33.A01;
            this.A07 = null;
            this.A01 = 8;
            r0 = r33.A00;
        } else {
            str = AnonymousClass000.A0h(AnonymousClass000.A0d(r3), AnonymousClass000.A0r("invalid parameters passed to CCM: "));
            throw AnonymousClass000.A0T(str);
        }
        if (r0 != null) {
            this.A03 = r0;
        }
        byte[] bArr = this.A09;
        if (bArr == null || (length = bArr.length) < 7 || length > 13) {
            str = "nonce must have length from 7 to 13 octets";
            throw AnonymousClass000.A0T(str);
        }
        this.A02.reset();
        this.A04.reset();
        this.A05.reset();
    }

    public void Aap(byte[] bArr, int i2, int i3) {
        this.A04.write(bArr, i2, i3);
    }

    public int Aar(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        if (bArr.length >= i2 + i3) {
            this.A05.write(bArr, i2, i3);
            return 0;
        }
        throw new AnonymousClass5JI("Input buffer too short");
    }
}

package X;

/* renamed from: X.59Z  reason: invalid class name */
public class AnonymousClass59Z implements AnonymousClass5T1 {
    public int A00;
    public int A01;
    public AnonymousClass5T1 A02;
    public boolean A03;
    public boolean A04;
    public byte[] A05;
    public byte[] A06;
    public byte[] A07;
    public byte[] A08;

    public AnonymousClass59Z(AnonymousClass5T1 r3, boolean z2) {
        this.A02 = r3;
        this.A04 = z2;
        int AA7 = r3.AA7();
        this.A00 = AA7;
        this.A07 = new byte[AA7];
        this.A05 = new byte[AA7];
        this.A06 = new byte[AA7];
        this.A08 = new byte[AA7];
    }

    public String A9q() {
        String str;
        boolean z2 = this.A04;
        StringBuilder A0o = AnonymousClass000.A0o();
        String A9q = this.A02.A9q();
        if (z2) {
            A0o.append(A9q);
            str = "/PGPCFBwithIV";
        } else {
            A0o.append(A9q);
            str = "/PGPCFB";
        }
        return AnonymousClass000.A0h(str, A0o);
    }

    public int AA7() {
        return this.A02.AA7();
    }

    public void AI1(C46932Gv r7, boolean z2) {
        AnonymousClass5T1 r0;
        this.A03 = z2;
        if (r7 instanceof C1054259l) {
            C1054259l r72 = (C1054259l) r7;
            byte[] bArr = r72.A01;
            int length = bArr.length;
            byte[] bArr2 = this.A07;
            int length2 = bArr2.length;
            if (length < length2) {
                int i2 = length2 - length;
                System.arraycopy(bArr, 0, bArr2, i2, length);
                for (int i3 = 0; i3 < i2; i3++) {
                    bArr2[i3] = 0;
                }
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
            }
            reset();
            r0 = this.A02;
            r7 = r72.A00;
        } else {
            reset();
            r0 = this.A02;
        }
        r0.AI1(r7, true);
    }

    public int Aaq(byte[] bArr, byte[] bArr2, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        boolean z2 = this.A04;
        boolean z3 = this.A03;
        if (z2) {
            if (z3) {
                i4 = this.A00;
                if (i2 + i4 <= bArr.length) {
                    int i7 = this.A01;
                    if (i7 == 0) {
                        int i8 = i4 << 1;
                        if (i8 + i3 + 2 <= bArr2.length) {
                            AnonymousClass5T1 r8 = this.A02;
                            byte[] bArr3 = this.A05;
                            byte[] bArr4 = this.A06;
                            r8.Aaq(bArr3, bArr4, 0, 0);
                            for (int i9 = 0; i9 < i4; i9++) {
                                AnonymousClass3K2.A1U(bArr4, bArr2, i9, this.A07[i9], i3 + i9);
                            }
                            System.arraycopy(bArr2, i3, bArr3, 0, i4);
                            r8.Aaq(bArr3, bArr4, 0, 0);
                            int i10 = i3 + i4;
                            byte[] bArr5 = this.A07;
                            AnonymousClass3K2.A1U(bArr4, bArr2, 0, bArr5[i4 - 2], i10);
                            AnonymousClass3K2.A1U(bArr4, bArr2, 1, bArr5[i4 - 1], i10 + 1);
                            System.arraycopy(bArr2, i3 + 2, bArr3, 0, i4);
                            r8.Aaq(bArr3, bArr4, 0, 0);
                            for (int i11 = 0; i11 < i4; i11++) {
                                AnonymousClass3K2.A1U(bArr4, bArr2, i11, bArr[i2 + i11], i10 + 2 + i11);
                            }
                            System.arraycopy(bArr2, i10 + 2, bArr3, 0, i4);
                            i5 = i8 + 2;
                            i6 = this.A01 + i5;
                        } else {
                            throw new AnonymousClass5JD("output buffer too short");
                        }
                    } else if (i7 >= i4 + 2) {
                        if (i4 + i3 <= bArr2.length) {
                            AnonymousClass5T1 r0 = this.A02;
                            byte[] bArr6 = this.A05;
                            byte[] bArr7 = this.A06;
                            r0.Aaq(bArr6, bArr7, 0, 0);
                            for (int i12 = 0; i12 < i4; i12++) {
                                AnonymousClass3K2.A1U(bArr7, bArr2, i12, bArr[i2 + i12], i3 + i12);
                            }
                            System.arraycopy(bArr2, i3, bArr6, 0, i4);
                        } else {
                            throw new AnonymousClass5JD("output buffer too short");
                        }
                    }
                } else {
                    throw new AnonymousClass5JI("input buffer too short");
                }
            } else {
                int i13 = this.A00;
                if (i2 + i13 <= bArr.length) {
                    if (i3 + i13 <= bArr2.length) {
                        int i14 = this.A01;
                        if (i14 == 0) {
                            for (int i15 = 0; i15 < i13; i15++) {
                                AnonymousClass3K4.A16(bArr, this.A05, i2 + i15, i15);
                            }
                            this.A02.Aaq(this.A05, this.A06, 0, 0);
                            this.A01 += i13;
                            return 0;
                        } else if (i14 == i13) {
                            byte[] bArr8 = this.A08;
                            System.arraycopy(bArr, i2, bArr8, 0, i13);
                            byte[] bArr9 = this.A05;
                            i5 = i13 - 2;
                            System.arraycopy(bArr9, 2, bArr9, 0, i5);
                            int i16 = i13 - 2;
                            AnonymousClass3K4.A16(bArr8, bArr9, 0, i16);
                            AnonymousClass3K4.A16(bArr8, bArr9, 1, i13 - 1);
                            AnonymousClass5T1 r02 = this.A02;
                            byte[] bArr10 = this.A06;
                            r02.Aaq(bArr9, bArr10, 0, 0);
                            for (int i17 = 0; i17 < i16; i17++) {
                                AnonymousClass3K2.A1U(bArr10, bArr2, i17, bArr8[i17 + 2], i3 + i17);
                            }
                            System.arraycopy(bArr8, 2, bArr9, 0, i5);
                            i6 = this.A01 + 2;
                        } else {
                            if (i14 >= i13 + 2) {
                                byte[] bArr11 = this.A08;
                                System.arraycopy(bArr, i2, bArr11, 0, i13);
                                byte b2 = bArr11[0];
                                int i18 = i13 - 2;
                                byte[] bArr12 = this.A06;
                                AnonymousClass3K2.A1U(bArr12, bArr2, i18, b2, i3);
                                AnonymousClass3K2.A1U(bArr12, bArr2, i13 - 1, bArr11[1], i3 + 1);
                                byte[] bArr13 = this.A05;
                                System.arraycopy(bArr11, 0, bArr13, i18, 2);
                                this.A02.Aaq(bArr13, bArr12, 0, 0);
                                for (int i19 = 0; i19 < i13 - 2; i19++) {
                                    AnonymousClass3K2.A1U(bArr12, bArr2, i19, bArr11[i19 + 2], i3 + i19 + 2);
                                }
                                System.arraycopy(bArr11, 2, bArr13, 0, i18);
                            }
                            return i13;
                        }
                    }
                    throw AnonymousClass5JD.A00();
                }
                throw new AnonymousClass5JI("input buffer too short");
            }
            this.A01 = i6;
            return i5;
        }
        i4 = this.A00;
        int i20 = i2 + i4;
        int length = bArr.length;
        if (z3) {
            if (i20 <= length) {
                if (i4 + i3 <= bArr2.length) {
                    AnonymousClass5T1 r03 = this.A02;
                    byte[] bArr14 = this.A05;
                    byte[] bArr15 = this.A06;
                    r03.Aaq(bArr14, bArr15, 0, 0);
                    for (int i21 = 0; i21 < i4; i21++) {
                        AnonymousClass3K2.A1U(bArr15, bArr2, i21, bArr[i2 + i21], i3 + i21);
                    }
                    for (int i22 = 0; i22 < i4; i22++) {
                        AnonymousClass3K4.A16(bArr2, bArr14, i3 + i22, i22);
                    }
                }
                throw AnonymousClass5JD.A00();
            }
            throw new AnonymousClass5JI("input buffer too short");
        } else if (i20 <= length) {
            if (i4 + i3 <= bArr2.length) {
                AnonymousClass5T1 r04 = this.A02;
                byte[] bArr16 = this.A05;
                byte[] bArr17 = this.A06;
                r04.Aaq(bArr16, bArr17, 0, 0);
                for (int i23 = 0; i23 < i4; i23++) {
                    AnonymousClass3K2.A1U(bArr17, bArr2, i23, bArr[i2 + i23], i3 + i23);
                }
                for (int i24 = 0; i24 < i4; i24++) {
                    AnonymousClass3K4.A16(bArr, bArr16, i2 + i24, i24);
                }
            }
            throw AnonymousClass5JD.A00();
        } else {
            throw new AnonymousClass5JI("input buffer too short");
        }
        return i4;
    }

    public void reset() {
        this.A01 = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.A05;
            if (i2 != bArr.length) {
                if (this.A04) {
                    bArr[i2] = 0;
                } else {
                    bArr[i2] = this.A07[i2];
                }
                i2++;
            } else {
                this.A02.reset();
                return;
            }
        }
    }
}

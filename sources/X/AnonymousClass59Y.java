package X;

/* renamed from: X.59Y  reason: invalid class name */
public class AnonymousClass59Y implements AnonymousClass5T1 {
    public int A00;
    public int A01;
    public AnonymousClass5T1 A02;
    public boolean A03;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;

    public AnonymousClass59Y(AnonymousClass5T1 r3) {
        this.A02 = r3;
        int AA7 = r3.AA7();
        this.A00 = AA7;
        this.A06 = new byte[AA7];
        this.A04 = new byte[AA7];
        this.A05 = new byte[AA7];
    }

    public String A9q() {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass3K4.A14(A0o, this.A02);
        return AnonymousClass000.A0h("/OpenPGPCFB", A0o);
    }

    public int AA7() {
        return this.A02.AA7();
    }

    public void AI1(C46932Gv r3, boolean z2) {
        this.A03 = z2;
        reset();
        this.A02.AI1(r3, true);
    }

    public int Aaq(byte[] bArr, byte[] bArr2, int i2, int i3) {
        boolean z2 = this.A03;
        int i4 = this.A00;
        int i5 = i2 + i4;
        int length = bArr.length;
        if (z2) {
            if (i5 <= length) {
                if (i3 + i4 <= bArr2.length) {
                    int i6 = this.A01;
                    int i7 = 2;
                    if (i6 > i4) {
                        byte[] bArr3 = this.A04;
                        byte b2 = bArr[i2];
                        byte[] bArr4 = this.A05;
                        byte b3 = (byte) (b2 ^ bArr4[i4 - 2]);
                        bArr2[i3] = b3;
                        bArr3[i4 - 2] = b3;
                        byte b4 = (byte) (bArr[i2 + 1] ^ bArr4[i4 - 1]);
                        bArr2[i3 + 1] = b4;
                        bArr3[i4 - 1] = b4;
                        this.A02.Aaq(bArr3, bArr4, 0, 0);
                        while (i7 < i4) {
                            int i8 = i7 - 2;
                            byte b5 = (byte) (bArr[i2 + i7] ^ bArr4[i8]);
                            bArr2[i3 + i7] = b5;
                            bArr3[i8] = b5;
                            i7++;
                        }
                    } else if (i6 == 0) {
                        AnonymousClass5T1 r0 = this.A02;
                        byte[] bArr5 = this.A04;
                        byte[] bArr6 = this.A05;
                        r0.Aaq(bArr5, bArr6, 0, 0);
                        for (int i9 = 0; i9 < i4; i9++) {
                            byte b6 = (byte) (bArr[i2 + i9] ^ bArr6[i9]);
                            bArr2[i3 + i9] = b6;
                            bArr5[i9] = b6;
                        }
                    } else if (i6 == i4) {
                        AnonymousClass5T1 r2 = this.A02;
                        byte[] bArr7 = this.A04;
                        byte[] bArr8 = this.A05;
                        r2.Aaq(bArr7, bArr8, 0, 0);
                        AnonymousClass3K2.A1U(bArr8, bArr2, 0, bArr[i2], i3);
                        AnonymousClass3K2.A1U(bArr8, bArr2, 1, bArr[i2 + 1], i3 + 1);
                        int i10 = i4 - 2;
                        System.arraycopy(bArr7, 2, bArr7, 0, i10);
                        System.arraycopy(bArr2, i3, bArr7, i10, 2);
                        r2.Aaq(bArr7, bArr8, 0, 0);
                        while (i7 < i4) {
                            int i11 = i7 - 2;
                            byte b7 = (byte) (bArr[i2 + i7] ^ bArr8[i11]);
                            bArr2[i3 + i7] = b7;
                            bArr7[i11] = b7;
                            i7++;
                        }
                    }
                    return i4;
                }
                throw AnonymousClass5JD.A00();
            }
            throw new AnonymousClass5JI("input buffer too short");
        } else if (i5 <= length) {
            if (i3 + i4 <= bArr2.length) {
                int i12 = this.A01;
                int i13 = 2;
                int i14 = 0;
                if (i12 > i4) {
                    byte b8 = bArr[i2];
                    byte[] bArr9 = this.A04;
                    bArr9[i4 - 2] = b8;
                    byte[] bArr10 = this.A05;
                    AnonymousClass3K2.A1U(bArr10, bArr2, i4 - 2, b8, i3);
                    byte b9 = bArr[i2 + 1];
                    bArr9[i4 - 1] = b9;
                    AnonymousClass3K2.A1U(bArr10, bArr2, i4 - 1, b9, i3 + 1);
                    this.A02.Aaq(bArr9, bArr10, 0, 0);
                    while (i13 < i4) {
                        byte b10 = bArr[i2 + i13];
                        int i15 = i13 - 2;
                        bArr9[i15] = b10;
                        AnonymousClass3K2.A1U(bArr10, bArr2, i15, b10, i3 + i13);
                        i13++;
                    }
                } else if (i12 == 0) {
                    AnonymousClass5T1 r02 = this.A02;
                    byte[] bArr11 = this.A04;
                    byte[] bArr12 = this.A05;
                    r02.Aaq(bArr11, bArr12, 0, 0);
                    while (i14 < i4) {
                        int i16 = i2 + i14;
                        AnonymousClass3K4.A16(bArr, bArr11, i16, i14);
                        i14 = AnonymousClass3K3.A0O(bArr12, bArr2, i14, bArr[i16]);
                    }
                } else if (i12 == i4) {
                    AnonymousClass5T1 r7 = this.A02;
                    byte[] bArr13 = this.A04;
                    byte[] bArr14 = this.A05;
                    r7.Aaq(bArr13, bArr14, 0, 0);
                    byte b11 = bArr[i2];
                    byte b12 = bArr[i2 + 1];
                    AnonymousClass3K2.A1U(bArr14, bArr2, 0, b11, i3);
                    AnonymousClass3K2.A1U(bArr14, bArr2, 1, b12, i3 + 1);
                    System.arraycopy(bArr13, 2, bArr13, 0, i4 - 2);
                    bArr13[i4 - 2] = b11;
                    bArr13[i4 - 1] = b12;
                    r7.Aaq(bArr13, bArr14, 0, 0);
                    while (i13 < i4) {
                        byte b13 = bArr[i2 + i13];
                        int i17 = i13 - 2;
                        bArr13[i17] = b13;
                        AnonymousClass3K2.A1U(bArr14, bArr2, i17, b13, i3 + i13);
                        i13++;
                    }
                }
                return i4;
            }
            throw AnonymousClass5JD.A00();
        } else {
            throw new AnonymousClass5JI("input buffer too short");
        }
        this.A01 += i4;
        return i4;
    }

    public void reset() {
        this.A01 = 0;
        byte[] bArr = this.A06;
        byte[] bArr2 = this.A04;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.A02.reset();
    }
}

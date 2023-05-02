package X;

/* renamed from: X.59u  reason: invalid class name and case insensitive filesystem */
public class C1054859u implements C109575Sr {
    public AnonymousClass5T1 A00;
    public C46922Gu A01;
    public boolean A02;
    public byte[] A03 = null;
    public byte[] A04;
    public byte[] A05;

    public C1054859u(AnonymousClass5T1 r2) {
        byte[] bArr = {-90, 89, 89, -90};
        this.A04 = bArr;
        this.A05 = bArr;
        this.A00 = r2;
    }

    public String A9q() {
        return this.A00.A9q();
    }

    public void AI1(C46932Gv r3, boolean z2) {
        this.A02 = z2;
        if (r3 instanceof C1053759g) {
            r3 = ((C1053759g) r3).A01;
        }
        if (r3 instanceof C46922Gu) {
            this.A01 = (C46922Gu) r3;
            this.A05 = this.A04;
        } else if (r3 instanceof C1054259l) {
            C1054259l r32 = (C1054259l) r3;
            byte[] bArr = r32.A01;
            this.A05 = bArr;
            this.A01 = (C46922Gu) r32.A00;
            if (bArr.length != 4) {
                throw AnonymousClass000.A0T("IV length not equal to 4");
            }
        }
    }

    public byte[] AhF(byte[] bArr, int i2, int i3) {
        byte[] bArr2;
        int i4 = i3;
        if (!this.A02) {
            int i5 = i3 >> 3;
            if ((i5 << 3) != i4) {
                throw new AnonymousClass5JC("unwrap data must be a multiple of 8 bytes");
            } else if (i5 > 1) {
                byte[] bArr3 = new byte[i4];
                byte[] bArr4 = bArr;
                System.arraycopy(bArr4, 0, bArr3, 0, i4);
                byte[] bArr5 = new byte[i4];
                if (i5 == 2) {
                    AnonymousClass5T1 r2 = this.A00;
                    r2.AI1(this.A01, false);
                    for (int i6 = 0; i6 < i4; i6 += r2.AA7()) {
                        r2.Aaq(bArr3, bArr5, i6, i6);
                    }
                    byte[] bArr6 = new byte[8];
                    this.A03 = bArr6;
                    System.arraycopy(bArr5, 0, bArr6, 0, 8);
                    int length = this.A03.length;
                    int i7 = i3 - length;
                    bArr2 = new byte[i7];
                    System.arraycopy(bArr5, length, bArr2, 0, i7);
                } else {
                    int i8 = i3 - 8;
                    bArr2 = new byte[i8];
                    byte[] bArr7 = new byte[8];
                    byte[] bArr8 = new byte[16];
                    System.arraycopy(bArr4, 0, bArr7, 0, 8);
                    System.arraycopy(bArr4, 8, bArr2, 0, i8);
                    AnonymousClass5T1 r12 = this.A00;
                    r12.AI1(this.A01, false);
                    int i9 = (i3 / 8) - 1;
                    int i10 = 5;
                    do {
                        for (int i11 = i9; i11 >= 1; i11--) {
                            System.arraycopy(bArr7, 0, bArr8, 0, 8);
                            int i12 = (i11 - 1) << 3;
                            System.arraycopy(bArr2, i12, bArr8, 8, 8);
                            int i13 = (i9 * i10) + i11;
                            int i14 = 1;
                            while (i13 != 0) {
                                int i15 = 8 - i14;
                                bArr8[i15] = (byte) (((byte) i13) ^ bArr8[i15]);
                                i13 >>>= 8;
                                i14++;
                            }
                            r12.Aaq(bArr8, bArr8, 0, 0);
                            System.arraycopy(bArr8, 0, bArr7, 0, 8);
                            System.arraycopy(bArr8, 8, bArr2, i12, 8);
                        }
                        i10--;
                    } while (i10 >= 0);
                    this.A03 = bArr7;
                }
                int i16 = 4;
                byte[] bArr9 = new byte[4];
                byte[] bArr10 = new byte[4];
                System.arraycopy(this.A03, 0, bArr9, 0, 4);
                System.arraycopy(this.A03, 4, bArr10, 0, 4);
                int A002 = C31461eE.A00(bArr10, 0);
                boolean A012 = C33111hx.A01(bArr9, this.A05);
                int length2 = bArr2.length;
                if (A002 <= length2 - 8) {
                    A012 = false;
                }
                if (A002 > length2) {
                    A012 = false;
                }
                int i17 = length2 - A002;
                if (i17 >= 8 || i17 < 0) {
                    A012 = false;
                } else {
                    i16 = i17;
                }
                byte[] bArr11 = new byte[i16];
                System.arraycopy(bArr2, length2 - i16, bArr11, 0, i16);
                if (!C33111hx.A01(bArr11, new byte[i16]) || !A012) {
                    throw new AnonymousClass5JC("checksum failed");
                }
                byte[] bArr12 = new byte[A002];
                System.arraycopy(bArr2, 0, bArr12, 0, A002);
                return bArr12;
            } else {
                throw new AnonymousClass5JC("unwrap data must be at least 16 bytes");
            }
        } else {
            throw AnonymousClass000.A0V("not set for unwrapping");
        }
    }

    public byte[] AiA(byte[] bArr, int i2, int i3) {
        if (this.A02) {
            byte[] bArr2 = new byte[8];
            byte[] bArr3 = new byte[4];
            int i4 = i3;
            C31461eE.A02(bArr3, i4, 0);
            byte[] bArr4 = this.A05;
            int i5 = 0;
            System.arraycopy(bArr4, 0, bArr2, 0, bArr4.length);
            System.arraycopy(bArr3, 0, bArr2, this.A05.length, 4);
            byte[] bArr5 = new byte[i4];
            System.arraycopy(bArr, 0, bArr5, 0, i4);
            int i6 = (8 - (i3 % 8)) % 8;
            int i7 = i3 + i6;
            byte[] bArr6 = new byte[i7];
            System.arraycopy(bArr5, 0, bArr6, 0, i4);
            if (i6 != 0) {
                System.arraycopy(new byte[i6], 0, bArr6, i4, i6);
            }
            if (i7 == 8) {
                byte[] bArr7 = new byte[16];
                System.arraycopy(bArr2, 0, bArr7, 0, 8);
                System.arraycopy(bArr6, 0, bArr7, 8, i7);
                AnonymousClass5T1 r1 = this.A00;
                r1.AI1(this.A01, true);
                do {
                    r1.Aaq(bArr7, bArr7, i5, i5);
                    i5 += r1.AA7();
                } while (i5 < 16);
                return bArr7;
            }
            AnonymousClass5T1 r10 = this.A00;
            C1054259l r0 = new C1054259l(this.A01, bArr2);
            byte[] bArr8 = r0.A01;
            C46932Gv r12 = r0.A00;
            int length = bArr8.length;
            if (length == 8) {
                int i8 = i7 >> 3;
                if ((i8 << 3) == i7) {
                    byte[] bArr9 = new byte[(i7 + 8)];
                    byte[] bArr10 = new byte[16];
                    System.arraycopy(bArr8, 0, bArr9, 0, length);
                    System.arraycopy(bArr6, 0, bArr9, length, i7);
                    r10.AI1(r12, true);
                    int i9 = 0;
                    do {
                        for (int i10 = 1; i10 <= i8; i10++) {
                            System.arraycopy(bArr9, 0, bArr10, 0, length);
                            int i11 = i10 << 3;
                            System.arraycopy(bArr9, i11, bArr10, length, 8);
                            r10.Aaq(bArr10, bArr10, 0, 0);
                            int i12 = (i8 * i9) + i10;
                            int i13 = 1;
                            while (i12 != 0) {
                                int i14 = length - i13;
                                bArr10[i14] = (byte) (((byte) i12) ^ bArr10[i14]);
                                i12 >>>= 8;
                                i13++;
                            }
                            System.arraycopy(bArr10, 0, bArr9, 0, 8);
                            System.arraycopy(bArr10, 8, bArr9, i11, 8);
                        }
                        i9++;
                    } while (i9 != 6);
                    return bArr9;
                }
                throw new AnonymousClass5JI("wrap data must be a multiple of 8 bytes");
            }
            throw AnonymousClass000.A0T("IV not equal to 8");
        }
        throw AnonymousClass000.A0V("not set for wrapping");
    }
}

package X;

/* renamed from: X.59s  reason: invalid class name and case insensitive filesystem */
public class C1054659s implements C109575Sr {
    public AnonymousClass5T1 A00;
    public C46922Gu A01;
    public boolean A02;
    public byte[] A03 = {-90, -90, -90, -90, -90, -90, -90, -90};

    public C1054659s() {
        C1053159a r1 = new C1053159a();
        this.A00 = r1;
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
        } else if (r3 instanceof C1054259l) {
            C1054259l r32 = (C1054259l) r3;
            byte[] bArr = r32.A01;
            this.A03 = bArr;
            this.A01 = (C46922Gu) r32.A00;
            if (bArr.length != 8) {
                throw AnonymousClass000.A0T("IV not equal to 8");
            }
        }
    }

    public byte[] AhF(byte[] bArr, int i2, int i3) {
        int i4 = i3;
        if (!this.A02) {
            int i5 = i3 >> 3;
            if ((i5 << 3) == i4) {
                int length = this.A03.length;
                byte[] bArr2 = new byte[(i3 - length)];
                byte[] bArr3 = new byte[length];
                byte[] bArr4 = new byte[(length + 8)];
                byte[] bArr5 = bArr;
                System.arraycopy(bArr5, 0, bArr3, 0, length);
                int length2 = this.A03.length;
                System.arraycopy(bArr5, 0 + length2, bArr2, 0, i3 - length2);
                AnonymousClass5T1 r7 = this.A00;
                r7.AI1(this.A01, false);
                int i6 = i5 - 1;
                int i7 = 5;
                do {
                    for (int i8 = i6; i8 >= 1; i8--) {
                        System.arraycopy(bArr3, 0, bArr4, 0, this.A03.length);
                        int i9 = (i8 - 1) << 3;
                        System.arraycopy(bArr2, i9, bArr4, this.A03.length, 8);
                        int i10 = (i6 * i7) + i8;
                        int i11 = 1;
                        while (i10 != 0) {
                            int length3 = this.A03.length - i11;
                            bArr4[length3] = (byte) (((byte) i10) ^ bArr4[length3]);
                            i10 >>>= 8;
                            i11++;
                        }
                        r7.Aaq(bArr4, bArr4, 0, 0);
                        System.arraycopy(bArr4, 0, bArr3, 0, 8);
                        System.arraycopy(bArr4, 8, bArr2, i9, 8);
                    }
                    i7--;
                } while (i7 >= 0);
                if (C33111hx.A01(bArr3, this.A03)) {
                    return bArr2;
                }
                throw new AnonymousClass5JC("checksum failed");
            }
            throw new AnonymousClass5JC("unwrap data must be a multiple of 8 bytes");
        }
        throw AnonymousClass000.A0V("not set for unwrapping");
    }

    public byte[] AiA(byte[] bArr, int i2, int i3) {
        if (this.A02) {
            int i4 = i3;
            int i5 = i3 >> 3;
            if ((i5 << 3) == i4) {
                byte[] bArr2 = this.A03;
                int length = bArr2.length;
                byte[] bArr3 = new byte[(length + i3)];
                byte[] bArr4 = new byte[(length + 8)];
                System.arraycopy(bArr2, 0, bArr3, 0, length);
                System.arraycopy(bArr, 0, bArr3, this.A03.length, i4);
                AnonymousClass5T1 r11 = this.A00;
                r11.AI1(this.A01, true);
                int i6 = 0;
                do {
                    for (int i7 = 1; i7 <= i5; i7++) {
                        System.arraycopy(bArr3, 0, bArr4, 0, this.A03.length);
                        int i8 = i7 << 3;
                        System.arraycopy(bArr3, i8, bArr4, this.A03.length, 8);
                        r11.Aaq(bArr4, bArr4, 0, 0);
                        int i9 = (i5 * i6) + i7;
                        int i10 = 1;
                        while (i9 != 0) {
                            int length2 = this.A03.length - i10;
                            bArr4[length2] = (byte) (((byte) i9) ^ bArr4[length2]);
                            i9 >>>= 8;
                            i10++;
                        }
                        System.arraycopy(bArr4, 0, bArr3, 0, 8);
                        System.arraycopy(bArr4, 8, bArr3, i8, 8);
                    }
                    i6++;
                } while (i6 != 6);
                return bArr3;
            }
            throw new AnonymousClass5JI("wrap data must be a multiple of 8 bytes");
        }
        throw AnonymousClass000.A0V("not set for wrapping");
    }
}

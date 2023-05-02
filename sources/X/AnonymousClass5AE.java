package X;

import java.lang.reflect.Array;

/* renamed from: X.5AE  reason: invalid class name */
public class AnonymousClass5AE implements AnonymousClass5SH, AnonymousClass5VO {
    public static final byte[] A0I = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    public int A00;
    public long A01;
    public AnonymousClass5T1 A02;
    public byte[] A03 = new byte[32];
    public byte[] A04;
    public byte[] A05 = new byte[32];
    public byte[] A06 = new byte[32];
    public byte[] A07;
    public byte[] A08 = new byte[32];
    public byte[] A09;
    public byte[] A0A;
    public byte[] A0B;
    public byte[] A0C;
    public byte[] A0D;
    public byte[] A0E;
    public short[] A0F;
    public short[] A0G;
    public byte[][] A0H;

    public AnonymousClass5AE() {
        A00(this, new int[]{4, 32});
        byte[] bArr = (byte[]) C1053359c.A03.get(C32941ha.A01("D-A"));
        if (bArr != null) {
            byte[] A022 = C33111hx.A02(bArr);
            this.A0D = A022;
            this.A02.AI1(new C1053559e(A022), true);
            reset();
            return;
        }
        throw AnonymousClass000.A0T("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"Param-Z\", \"D-Test\", \"D-A\".");
    }

    public AnonymousClass5AE(AnonymousClass5AE r3) {
        A00(this, new int[]{4, 32});
        AcP(r3);
    }

    public static void A00(AnonymousClass5AE r3, int[] iArr) {
        r3.A0H = (byte[][]) Array.newInstance(byte.class, iArr);
        r3.A0E = new byte[32];
        r3.A02 = new C1053359c();
        r3.A04 = new byte[32];
        r3.A0C = new byte[8];
        r3.A0F = new short[16];
        r3.A0G = new short[16];
        r3.A07 = new byte[32];
        r3.A09 = new byte[32];
        r3.A0A = new byte[32];
        r3.A0B = new byte[32];
    }

    public void A01(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4 = this.A06;
        System.arraycopy(bArr, 0, bArr4, 0, 32);
        byte[] bArr5 = this.A03;
        byte[] bArr6 = this.A09;
        System.arraycopy(bArr5, 0, bArr6, 0, 32);
        System.arraycopy(bArr4, 0, this.A0A, 0, 32);
        int i2 = 0;
        do {
            bArr2 = this.A0B;
            i2 = AnonymousClass3K3.A0O(this.A0A, bArr2, i2, bArr6[i2]);
        } while (i2 < 32);
        int i3 = 0;
        do {
            bArr3 = this.A04;
            int i4 = i3 << 2;
            AnonymousClass3K4.A16(bArr2, bArr3, i3, i4);
            AnonymousClass3K4.A16(bArr2, bArr3, i3 + 8, i4 + 1);
            AnonymousClass3K4.A16(bArr2, bArr3, i3 + 16, i4 + 2);
            AnonymousClass3K4.A16(bArr2, bArr3, i3 + 24, i4 + 3);
            i3++;
        } while (i3 < 8);
        byte[] bArr7 = this.A07;
        AnonymousClass5T1 r9 = this.A02;
        r9.AI1(new C46922Gu(bArr3), true);
        r9.Aaq(bArr5, bArr7, 0, 0);
        int i5 = 1;
        do {
            A02(bArr6);
            int i6 = 0;
            do {
                i6 = AnonymousClass3K3.A0O(this.A0H[i5], bArr6, i6, bArr6[i6]);
            } while (i6 < 32);
            byte[] bArr8 = this.A0A;
            A02(bArr8);
            A02(bArr8);
            this.A0A = bArr8;
            int i7 = 0;
            do {
                i7 = AnonymousClass3K3.A0O(bArr8, bArr2, i7, bArr6[i7]);
            } while (i7 < 32);
            int i8 = 0;
            do {
                int i9 = i8 << 2;
                AnonymousClass3K4.A16(bArr2, bArr3, i8, i9);
                AnonymousClass3K4.A16(bArr2, bArr3, i8 + 8, i9 + 1);
                AnonymousClass3K4.A16(bArr2, bArr3, i8 + 16, i9 + 2);
                AnonymousClass3K4.A16(bArr2, bArr3, i8 + 24, i9 + 3);
                i8++;
            } while (i8 < 8);
            int i10 = i5 << 3;
            r9.AI1(new C46922Gu(bArr3), true);
            r9.Aaq(bArr5, bArr7, i10, i10);
            i5++;
        } while (i5 < 4);
        int i11 = 0;
        do {
            A03(bArr7);
            i11++;
        } while (i11 < 12);
        int i12 = 0;
        do {
            i12 = AnonymousClass3K3.A0O(bArr4, bArr7, i12, bArr7[i12]);
        } while (i12 < 32);
        A03(bArr7);
        int i13 = 0;
        do {
            i13 = AnonymousClass3K4.A0C(bArr7, bArr5[i13] ^ bArr7[i13], i13);
        } while (i13 < 32);
        int i14 = 0;
        do {
            A03(bArr7);
            i14++;
        } while (i14 < 61);
        System.arraycopy(bArr7, 0, bArr5, 0, bArr5.length);
    }

    public final void A02(byte[] bArr) {
        byte[] bArr2;
        int i2 = 0;
        do {
            bArr2 = this.A0C;
            AnonymousClass3K2.A1U(bArr, bArr2, i2 + 8, bArr[i2], i2);
            i2++;
        } while (i2 < 8);
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(bArr2, 0, bArr, 24, 8);
    }

    public final void A03(byte[] bArr) {
        int length;
        short[] sArr = this.A0F;
        int i2 = 0;
        while (true) {
            length = bArr.length >> 1;
            if (i2 >= length) {
                break;
            }
            int i3 = i2 << 1;
            sArr[i2] = (short) ((bArr[i3] & 255) | ((bArr[i3 + 1] << 8) & 65280));
            i2++;
        }
        short[] sArr2 = this.A0G;
        sArr2[15] = (short) (((((sArr[0] ^ sArr[1]) ^ sArr[2]) ^ sArr[3]) ^ sArr[12]) ^ sArr[15]);
        System.arraycopy(sArr, 1, sArr2, 0, 15);
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i4 << 1;
            short s2 = sArr2[i4];
            bArr[i5 + 1] = (byte) (s2 >> 8);
            bArr[i5] = (byte) s2;
        }
    }

    public AnonymousClass5SH A6m() {
        return new AnonymousClass5AE(this);
    }

    public int A8A(byte[] bArr, int i2) {
        byte[] bArr2 = this.A05;
        C31461eE.A05(bArr2, 0, this.A01 * 8);
        while (this.A00 != 0) {
            AhH((byte) 0);
        }
        A01(bArr2);
        A01(this.A08);
        byte[] bArr3 = this.A03;
        System.arraycopy(bArr3, 0, bArr, i2, bArr3.length);
        reset();
        return 32;
    }

    public String A9q() {
        return "GOST3411";
    }

    public int AAI() {
        return 32;
    }

    public int ABn() {
        return 32;
    }

    public void AcP(AnonymousClass5SH r8) {
        AnonymousClass5AE r82 = (AnonymousClass5AE) r8;
        byte[] bArr = r82.A0D;
        this.A0D = bArr;
        this.A02.AI1(new C1053559e(bArr), true);
        reset();
        byte[] bArr2 = r82.A03;
        System.arraycopy(bArr2, 0, this.A03, 0, bArr2.length);
        byte[] bArr3 = r82.A05;
        System.arraycopy(bArr3, 0, this.A05, 0, bArr3.length);
        byte[] bArr4 = r82.A06;
        System.arraycopy(bArr4, 0, this.A06, 0, bArr4.length);
        byte[] bArr5 = r82.A08;
        System.arraycopy(bArr5, 0, this.A08, 0, bArr5.length);
        byte[][] bArr6 = r82.A0H;
        byte[] bArr7 = bArr6[1];
        byte[][] bArr8 = this.A0H;
        System.arraycopy(bArr7, 0, bArr8[1], 0, bArr7.length);
        byte[] bArr9 = bArr6[2];
        System.arraycopy(bArr9, 0, bArr8[2], 0, bArr9.length);
        byte[] bArr10 = bArr6[3];
        System.arraycopy(bArr10, 0, bArr8[3], 0, bArr10.length);
        byte[] bArr11 = r82.A0E;
        System.arraycopy(bArr11, 0, this.A0E, 0, bArr11.length);
        this.A00 = r82.A00;
        this.A01 = r82.A01;
    }

    public void AhH(byte b2) {
        byte[] bArr = this.A0E;
        int i2 = this.A00;
        int i3 = i2 + 1;
        this.A00 = i3;
        bArr[i2] = b2;
        if (i3 == bArr.length) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                byte[] bArr2 = this.A08;
                if (i4 == bArr2.length) {
                    break;
                }
                int i6 = (bArr2[i4] & 255) + (bArr[i4] & 255) + i5;
                bArr2[i4] = (byte) i6;
                i5 = i6 >>> 8;
                i4++;
            }
            A01(bArr);
            this.A00 = 0;
        }
        this.A01++;
    }

    public void reset() {
        byte[][] bArr;
        this.A01 = 0;
        this.A00 = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.A03;
            if (i2 >= bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.A05;
            if (i3 >= bArr3.length) {
                break;
            }
            bArr3[i3] = 0;
            i3++;
        }
        int i4 = 0;
        while (true) {
            byte[] bArr4 = this.A06;
            if (i4 >= bArr4.length) {
                break;
            }
            bArr4[i4] = 0;
            i4++;
        }
        int i5 = 0;
        while (true) {
            bArr = this.A0H;
            byte[] bArr5 = bArr[1];
            if (i5 >= bArr5.length) {
                break;
            }
            bArr5[i5] = 0;
            i5++;
        }
        int i6 = 0;
        while (true) {
            byte[] bArr6 = bArr[3];
            if (i6 >= bArr6.length) {
                break;
            }
            bArr6[i6] = 0;
            i6++;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr7 = this.A08;
            if (i7 >= bArr7.length) {
                break;
            }
            bArr7[i7] = 0;
            i7++;
        }
        int i8 = 0;
        while (true) {
            byte[] bArr8 = this.A0E;
            if (i8 < bArr8.length) {
                bArr8[i8] = 0;
                i8++;
            } else {
                byte[] bArr9 = A0I;
                System.arraycopy(bArr9, 0, bArr[2], 0, bArr9.length);
                return;
            }
        }
    }

    public void update(byte[] bArr, int i2, int i3) {
        while (this.A00 != 0 && i3 > 0) {
            AhH(bArr[i2]);
            i2++;
            i3--;
        }
        while (true) {
            byte[] bArr2 = this.A0E;
            int length = bArr2.length;
            if (i3 <= length) {
                break;
            }
            System.arraycopy(bArr, i2, bArr2, 0, length);
            int i4 = 0;
            int i5 = 0;
            while (true) {
                byte[] bArr3 = this.A08;
                if (i4 == bArr3.length) {
                    break;
                }
                int i6 = (bArr3[i4] & 255) + (bArr2[i4] & 255) + i5;
                bArr3[i4] = (byte) i6;
                i5 = i6 >>> 8;
                i4++;
            }
            A01(bArr2);
            i2 += length;
            i3 -= length;
            this.A01 += (long) length;
        }
        while (i3 > 0) {
            AhH(bArr[i2]);
            i2++;
            i3--;
        }
    }
}

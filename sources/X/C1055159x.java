package X;

import java.util.Arrays;
import java.util.Vector;

/* renamed from: X.59x  reason: invalid class name and case insensitive filesystem */
public class C1055159x implements AnonymousClass5VP {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Vector A05;
    public AnonymousClass5T1 A06;
    public AnonymousClass5T1 A07;
    public boolean A08;
    public byte[] A09;
    public byte[] A0A = null;
    public byte[] A0B;
    public byte[] A0C;
    public byte[] A0D;
    public byte[] A0E = new byte[16];
    public byte[] A0F = new byte[16];
    public byte[] A0G = new byte[24];
    public byte[] A0H;
    public byte[] A0I;
    public byte[] A0J;
    public byte[] A0K;
    public byte[] A0L;

    public C1055159x(AnonymousClass5T1 r3, AnonymousClass5T1 r4) {
        String str;
        if (r3.AA7() != 16) {
            str = "'hashCipher' must have a block size of 16";
        } else if (r4.AA7() != 16) {
            str = "'mainCipher' must have a block size of 16";
        } else if (r3.A9q().equals(r4.A9q())) {
            this.A06 = r3;
            this.A07 = r4;
            return;
        } else {
            str = "'hashCipher' and 'mainCipher' must be the same algorithm";
        }
        throw AnonymousClass000.A0T(str);
    }

    public static void A00(byte[] bArr, byte[] bArr2) {
        int i2 = 15;
        do {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            i2--;
        } while (i2 >= 0);
    }

    public static byte[] A01(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i2 = 16;
        int i3 = 0;
        while (true) {
            i2--;
            if (i2 >= 0) {
                byte b2 = bArr[i2] & 255;
                AnonymousClass3K4.A0i(i3, bArr2, b2 << 1, i2);
                i3 = (b2 >>> 7) & 1;
            } else {
                bArr2[15] = (byte) ((135 >>> ((1 - i3) << 3)) ^ bArr2[15]);
                return bArr2;
            }
        }
    }

    public int A8A(byte[] bArr, int i2) {
        byte[] bArr2;
        if (!this.A08) {
            int i3 = this.A02;
            int i4 = this.A01;
            if (i3 >= i4) {
                int i5 = i3 - i4;
                this.A02 = i5;
                bArr2 = new byte[i4];
                System.arraycopy(this.A0L, i5, bArr2, 0, i4);
            } else {
                throw new AnonymousClass5JC("data too short");
            }
        } else {
            bArr2 = null;
        }
        int i6 = this.A00;
        if (i6 > 0) {
            byte[] bArr3 = this.A0I;
            byte b2 = Byte.MIN_VALUE;
            while (true) {
                bArr3[i6] = b2;
                i6++;
                if (i6 >= 16) {
                    break;
                }
                b2 = 0;
            }
            byte[] bArr4 = this.A0B;
            byte[] bArr5 = this.A0D;
            A00(bArr5, bArr4);
            A00(bArr3, bArr5);
            this.A06.Aaq(bArr3, bArr3, 0, 0);
            A00(this.A0H, this.A0I);
        }
        int i7 = this.A02;
        if (i7 > 0) {
            if (this.A08) {
                byte[] bArr6 = this.A0L;
                byte b3 = Byte.MIN_VALUE;
                while (true) {
                    bArr6[i7] = b3;
                    i7++;
                    if (i7 >= 16) {
                        break;
                    }
                    b3 = 0;
                }
                A00(this.A09, bArr6);
            }
            byte[] bArr7 = this.A0E;
            A00(bArr7, this.A0B);
            byte[] bArr8 = new byte[16];
            this.A06.Aaq(bArr7, bArr8, 0, 0);
            byte[] bArr9 = this.A0L;
            A00(bArr9, bArr8);
            int length = bArr.length;
            int i8 = this.A02;
            if (length >= i2 + i8) {
                System.arraycopy(bArr9, 0, bArr, i2, i8);
                if (!this.A08) {
                    byte[] bArr10 = this.A0L;
                    int i9 = this.A02;
                    byte b4 = Byte.MIN_VALUE;
                    while (true) {
                        bArr10[i9] = b4;
                        i9++;
                        if (i9 >= 16) {
                            break;
                        }
                        b4 = 0;
                    }
                    A00(this.A09, bArr10);
                }
            } else {
                throw new AnonymousClass5JD("Output buffer too short");
            }
        }
        byte[] bArr11 = this.A09;
        byte[] bArr12 = this.A0E;
        A00(bArr11, bArr12);
        A00(bArr11, this.A0C);
        AnonymousClass5T1 r6 = this.A06;
        r6.Aaq(bArr11, bArr11, 0, 0);
        byte[] bArr13 = this.A09;
        A00(bArr13, this.A0H);
        int i10 = this.A01;
        byte[] bArr14 = new byte[i10];
        this.A0K = bArr14;
        System.arraycopy(bArr13, 0, bArr14, 0, i10);
        int i11 = this.A02;
        if (this.A08) {
            int length2 = bArr.length;
            int i12 = i2 + i11;
            int i13 = this.A01;
            if (length2 >= i12 + i13) {
                System.arraycopy(this.A0K, 0, bArr, i12, i13);
                i11 += this.A01;
            } else {
                throw new AnonymousClass5JD("Output buffer too short");
            }
        } else if (!C33111hx.A01(this.A0K, bArr2)) {
            throw new AnonymousClass5JC("mac check in OCB failed");
        }
        r6.reset();
        this.A07.reset();
        byte[] bArr15 = this.A0I;
        if (bArr15 != null) {
            Arrays.fill(bArr15, (byte) 0);
        }
        byte[] bArr16 = this.A0L;
        if (bArr16 != null) {
            Arrays.fill(bArr16, (byte) 0);
        }
        this.A00 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A04 = 0;
        byte[] bArr17 = this.A0D;
        if (bArr17 != null) {
            Arrays.fill(bArr17, (byte) 0);
        }
        byte[] bArr18 = this.A0H;
        if (bArr18 != null) {
            Arrays.fill(bArr18, (byte) 0);
        }
        System.arraycopy(this.A0F, 0, bArr12, 0, 16);
        byte[] bArr19 = this.A09;
        if (bArr19 != null) {
            Arrays.fill(bArr19, (byte) 0);
        }
        byte[] bArr20 = this.A0J;
        if (bArr20 != null) {
            Aap(bArr20, 0, bArr20.length);
        }
        return i11;
    }

    public String A9q() {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass3K4.A14(A0o, this.A07);
        return AnonymousClass000.A0h("/OCB", A0o);
    }

    public byte[] ADG() {
        byte[] bArr = this.A0K;
        return bArr == null ? new byte[this.A01] : C33111hx.A02(bArr);
    }

    public int AE9(int i2) {
        int i3 = i2 + this.A02;
        boolean z2 = this.A08;
        int i4 = this.A01;
        if (z2) {
            return i3 + i4;
        }
        int i5 = i3;
        int i6 = i3 - i4;
        if (i5 < i4) {
            return 0;
        }
        return i6;
    }

    public AnonymousClass5T1 AGk() {
        return this.A07;
    }

    public int AGm(int i2) {
        int i3 = i2 + this.A02;
        if (!this.A08) {
            int i4 = this.A01;
            int i5 = i3;
            i3 -= i4;
            if (i5 < i4) {
                return 0;
            }
        }
        return i3 - (i3 % 16);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AI1(X.C46932Gv r11, boolean r12) {
        /*
            r10 = this;
            boolean r9 = r10.A08
            r10.A08 = r12
            r2 = 0
            r10.A0K = r2
            boolean r0 = r11 instanceof X.C1053859h
            r5 = 16
            if (r0 == 0) goto L_0x00c3
            X.59h r11 = (X.C1053859h) r11
            byte[] r0 = r11.A03
            byte[] r6 = X.C33111hx.A02(r0)
            byte[] r0 = r11.A02
            byte[] r0 = X.C33111hx.A02(r0)
            r10.A0J = r0
            int r1 = r11.A00
            r0 = 64
            if (r1 < r0) goto L_0x0121
            r0 = 128(0x80, float:1.794E-43)
            if (r1 > r0) goto L_0x0121
            int r0 = r1 % 8
            if (r0 != 0) goto L_0x0121
            int r1 = r1 >> 3
            r10.A01 = r1
            X.2Gu r7 = r11.A01
        L_0x0031:
            byte[] r0 = new byte[r5]
            r10.A0I = r0
            int r0 = r1 + 16
            if (r12 == 0) goto L_0x003b
            r0 = 16
        L_0x003b:
            byte[] r0 = new byte[r0]
            r10.A0L = r0
            r4 = 0
            if (r6 != 0) goto L_0x0044
            byte[] r6 = new byte[r4]
        L_0x0044:
            int r3 = r6.length
            r8 = 15
            if (r3 > r8) goto L_0x012b
            r1 = 1
            if (r7 == 0) goto L_0x00be
            X.5T1 r0 = r10.A06
            r0.AI1(r7, r1)
            X.5T1 r0 = r10.A07
            r0.AI1(r7, r12)
            r10.A0A = r2
        L_0x0058:
            byte[] r0 = new byte[r5]
            r10.A0B = r0
            X.5T1 r2 = r10.A06
            r2.Aaq(r0, r0, r4, r4)
            byte[] r0 = r10.A0B
            byte[] r0 = A01(r0)
            r10.A0C = r0
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            r10.A05 = r1
            byte[] r0 = r10.A0C
            byte[] r0 = A01(r0)
            r1.addElement(r0)
            byte[] r1 = new byte[r5]
            int r0 = 16 - r3
            r7 = 0
            java.lang.System.arraycopy(r6, r4, r1, r0, r3)
            int r0 = r10.A01
            int r0 = r0 << 4
            byte r0 = (byte) r0
            r1[r4] = r0
            int r3 = 15 - r3
            byte r0 = r1[r3]
            r0 = r0 | 1
            byte r0 = (byte) r0
            r1[r3] = r0
            byte r0 = r1[r8]
            r6 = r0 & 63
            r0 = r0 & 192(0xc0, float:2.69E-43)
            byte r0 = (byte) r0
            r1[r8] = r0
            byte[] r0 = r10.A0A
            if (r0 == 0) goto L_0x00a4
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x00d5
        L_0x00a4:
            byte[] r3 = new byte[r5]
            r10.A0A = r1
            r2.Aaq(r1, r3, r4, r4)
            byte[] r2 = r10.A0G
            java.lang.System.arraycopy(r3, r4, r2, r4, r5)
        L_0x00b0:
            int r1 = r7 + 16
            byte r0 = r3[r7]
            int r7 = r7 + 1
            X.AnonymousClass3K2.A1U(r3, r2, r7, r0, r1)
            r0 = 8
            if (r7 >= r0) goto L_0x00d5
            goto L_0x00b0
        L_0x00be:
            if (r9 == r12) goto L_0x0058
            java.lang.String r0 = "cannot change encrypting state without providing key."
            goto L_0x012d
        L_0x00c3:
            boolean r0 = r11 instanceof X.C1054259l
            if (r0 == 0) goto L_0x0128
            X.59l r11 = (X.C1054259l) r11
            byte[] r6 = r11.A01
            r10.A0J = r2
            r10.A01 = r5
            r1 = 16
            X.2Gv r7 = r11.A00
            goto L_0x0031
        L_0x00d5:
            int r8 = r6 % 8
            int r7 = r6 >> 3
            if (r8 != 0) goto L_0x0106
            byte[] r0 = r10.A0G
            byte[] r6 = r10.A0F
            java.lang.System.arraycopy(r0, r7, r6, r4, r5)
        L_0x00e2:
            r10.A00 = r4
            r10.A02 = r4
            r0 = 0
            r10.A03 = r0
            r10.A04 = r0
            byte[] r0 = new byte[r5]
            r10.A0D = r0
            byte[] r0 = new byte[r5]
            r10.A0H = r0
            byte[] r0 = r10.A0E
            java.lang.System.arraycopy(r6, r4, r0, r4, r5)
            byte[] r0 = new byte[r5]
            r10.A09 = r0
            byte[] r1 = r10.A0J
            if (r1 == 0) goto L_0x0105
            int r0 = r1.length
            r10.Aap(r1, r4, r0)
        L_0x0105:
            return
        L_0x0106:
            r3 = 0
        L_0x0107:
            byte[] r1 = r10.A0G
            byte r0 = r1[r7]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r7 = r7 + 1
            byte r0 = r1[r7]
            r1 = r0 & 255(0xff, float:3.57E-43)
            byte[] r6 = r10.A0F
            int r2 = r2 << r8
            int r0 = 8 - r8
            int r1 = r1 >>> r0
            X.AnonymousClass3K4.A0i(r1, r6, r2, r3)
            int r3 = r3 + 1
            if (r3 >= r5) goto L_0x00e2
            goto L_0x0107
        L_0x0121:
            java.lang.String r0 = "Invalid value for MAC size: "
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)
            goto L_0x012d
        L_0x0128:
            java.lang.String r0 = "invalid parameters passed to OCB"
            goto L_0x012d
        L_0x012b:
            java.lang.String r0 = "IV must be no more than 15 bytes"
        L_0x012d:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1055159x.AI1(X.2Gv, boolean):void");
    }

    public void Aap(byte[] bArr, int i2, int i3) {
        Vector vector;
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr2 = this.A0I;
            int i5 = this.A00;
            AnonymousClass3K4.A16(bArr, bArr2, i2 + i4, i5);
            int i6 = i5 + 1;
            this.A00 = i6;
            if (i6 == bArr2.length) {
                long j2 = this.A03 + 1;
                this.A03 = j2;
                int i7 = 0;
                if (j2 == 0) {
                    i7 = 64;
                } else {
                    while ((1 & j2) == 0) {
                        i7++;
                        j2 >>>= 1;
                    }
                }
                while (true) {
                    int size = this.A05.size();
                    vector = this.A05;
                    if (i7 < size) {
                        break;
                    }
                    vector.addElement(A01((byte[]) vector.lastElement()));
                }
                byte[] bArr3 = this.A0D;
                A00(bArr3, (byte[]) vector.elementAt(i7));
                byte[] bArr4 = this.A0I;
                A00(bArr4, bArr3);
                this.A06.Aaq(bArr4, bArr4, 0, 0);
                A00(this.A0H, this.A0I);
                this.A00 = 0;
            }
        }
    }

    public int Aar(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        Vector vector;
        byte[] bArr3 = bArr;
        int i5 = i3;
        if (bArr3.length >= i2 + i3) {
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                byte[] bArr4 = this.A0L;
                int i8 = this.A02;
                AnonymousClass3K4.A16(bArr3, bArr4, i2 + i7, i8);
                int i9 = i8 + 1;
                this.A02 = i9;
                if (i9 == bArr4.length) {
                    int i10 = i4 + i6;
                    byte[] bArr5 = bArr2;
                    if (bArr5.length >= i10 + 16) {
                        if (this.A08) {
                            A00(this.A09, bArr4);
                            this.A02 = 0;
                        }
                        byte[] bArr6 = this.A0E;
                        long j2 = this.A04 + 1;
                        this.A04 = j2;
                        int i11 = 0;
                        if (j2 == 0) {
                            i11 = 64;
                        } else {
                            while ((1 & j2) == 0) {
                                i11++;
                                j2 >>>= 1;
                            }
                        }
                        while (true) {
                            int size = this.A05.size();
                            vector = this.A05;
                            if (i11 < size) {
                                break;
                            }
                            vector.addElement(A01((byte[]) vector.lastElement()));
                        }
                        A00(bArr6, (byte[]) vector.elementAt(i11));
                        byte[] bArr7 = this.A0L;
                        A00(bArr7, bArr6);
                        this.A07.Aaq(bArr7, bArr7, 0, 0);
                        byte[] bArr8 = this.A0L;
                        A00(bArr8, bArr6);
                        System.arraycopy(bArr8, 0, bArr5, i10, 16);
                        if (!this.A08) {
                            byte[] bArr9 = this.A09;
                            byte[] bArr10 = this.A0L;
                            A00(bArr9, bArr10);
                            System.arraycopy(bArr10, 16, bArr10, 0, this.A01);
                            this.A02 = this.A01;
                        }
                        i6 += 16;
                    } else {
                        throw new AnonymousClass5JD("Output buffer too short");
                    }
                }
            }
            return i6;
        }
        throw new AnonymousClass5JI("Input buffer too short");
    }
}

package X;

/* renamed from: X.4cD  reason: invalid class name and case insensitive filesystem */
public class C89454cD {
    public int A00;
    public byte[] A01;

    public C89454cD() {
        this.A01 = new byte[64];
    }

    public C89454cD(int i2) {
        this.A01 = new byte[i2];
    }

    public static C89454cD A00() {
        return new C89454cD();
    }

    public static void A01(C89454cD r2, int i2) {
        if (i2 < 64) {
            r2.A04(i2);
            return;
        }
        r2.A04(251);
        r2.A06(i2);
    }

    public static void A02(C89454cD r3, C89454cD r4) {
        r4.A0C(r3.A01, 0, r3.A00);
    }

    public static void A03(C89454cD r3, byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2 + 1;
        bArr[i2] = (byte) i3;
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i4 >>> 8);
        bArr[i6] = (byte) i4;
        r3.A00 = i6 + 1;
    }

    public void A04(int i2) {
        int i3 = this.A00;
        int i4 = i3 + 1;
        if (i4 > this.A01.length) {
            A07(1);
        }
        this.A01[i3] = (byte) i2;
        this.A00 = i4;
    }

    public void A05(int i2) {
        int i3 = this.A00;
        if (i3 + 4 > this.A01.length) {
            A07(4);
        }
        byte[] bArr = this.A01;
        int A0F = AnonymousClass3K2.A0F(bArr, i3, i2);
        bArr[A0F] = (byte) i2;
        this.A00 = A0F + 1;
    }

    public void A06(int i2) {
        int i3 = this.A00;
        if (i3 + 2 > this.A01.length) {
            A07(2);
        }
        byte[] bArr = this.A01;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 >>> 8);
        bArr[i4] = (byte) i2;
        this.A00 = i4 + 1;
    }

    public final void A07(int i2) {
        byte[] bArr = this.A01;
        int length = bArr.length << 1;
        int i3 = this.A00;
        int i4 = i2 + i3;
        if (length <= i4) {
            length = i4;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        this.A01 = bArr2;
    }

    public final void A08(int i2, int i3) {
        int i4 = this.A00;
        if (i4 + 2 > this.A01.length) {
            A07(2);
        }
        byte[] bArr = this.A01;
        int i5 = i4 + 1;
        bArr[i4] = (byte) i2;
        bArr[i5] = (byte) i3;
        this.A00 = i5 + 1;
    }

    public final void A09(int i2, int i3) {
        int i4 = this.A00;
        if (i4 + 3 > this.A01.length) {
            A07(3);
        }
        A03(this, this.A01, i4, i2, i3);
    }

    public final void A0A(int i2, int i3, int i4) {
        int i5 = this.A00;
        if (i5 + 5 > this.A01.length) {
            A07(5);
        }
        byte[] bArr = this.A01;
        int i6 = i5 + 1;
        bArr[i5] = (byte) i2;
        bArr[i6] = (byte) (i3 >>> 8);
        A03(this, bArr, i6 + 1, i3, i4);
    }

    public final void A0B(int i2, String str, int i3) {
        byte[] bArr;
        int i4;
        int length = str.length();
        int i5 = i2;
        for (int i6 = i2; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if (charAt >= 1) {
                if (charAt <= 127) {
                    i5++;
                } else if (charAt > 2047) {
                    i5 += 3;
                }
            }
            i5 += 2;
        }
        if (i5 <= i3) {
            int i7 = this.A00;
            int i8 = (i7 - i2) - 2;
            if (i8 >= 0) {
                byte[] bArr2 = this.A01;
                bArr2[AnonymousClass3K4.A0C(bArr2, i5 >>> 8, i8)] = (byte) i5;
            }
            if ((i7 + i5) - i2 > this.A01.length) {
                A07(i5 - i2);
            }
            int i9 = this.A00;
            while (i2 < length) {
                char charAt2 = str.charAt(i2);
                if (charAt2 >= 1) {
                    if (charAt2 <= 127) {
                        bArr = this.A01;
                        i4 = i9 + 1;
                    } else if (charAt2 > 2047) {
                        bArr = this.A01;
                        int i10 = i9 + 1;
                        bArr[i9] = (byte) (((charAt2 >> 12) & 15) | 224);
                        i9 = i10 + 1;
                        bArr[i10] = (byte) (((charAt2 >> 6) & 63) | 128);
                        i4 = i9 + 1;
                        charAt2 = (charAt2 & '?') | 128;
                    }
                    bArr[i9] = (byte) charAt2;
                    i9 = i4;
                    i2++;
                }
                byte[] bArr3 = this.A01;
                int i11 = i9 + 1;
                bArr3[i9] = (byte) (((charAt2 >> 6) & 31) | 192);
                i9 = i11 + 1;
                bArr3[i11] = (byte) ((charAt2 & '?') | 128);
                i2++;
            }
            this.A00 = i9;
            return;
        }
        throw AnonymousClass000.A0T("UTF8 string too large");
    }

    public void A0C(byte[] bArr, int i2, int i3) {
        if (this.A00 + i3 > this.A01.length) {
            A07(i3);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i2, this.A01, this.A00, i3);
        }
        this.A00 += i3;
    }
}

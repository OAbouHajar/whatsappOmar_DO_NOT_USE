package X;

import java.util.Arrays;

/* renamed from: X.59w  reason: invalid class name and case insensitive filesystem */
public class C1055059w implements AnonymousClass5VP {
    public int A00;
    public int A01;
    public int A02;
    public C46912Gt A03;
    public AnonymousClass5JO A04;
    public boolean A05;
    public boolean A06;
    public byte[] A07;
    public byte[] A08;
    public byte[] A09;
    public byte[] A0A;
    public byte[] A0B;

    public C1055059w(AnonymousClass5T1 r3) {
        int AA7 = r3.AA7();
        this.A00 = AA7;
        C1054459q r1 = new C1054459q(r3);
        this.A03 = r1;
        this.A0A = new byte[AA7];
        int i2 = r1.A01;
        this.A07 = new byte[i2];
        this.A0B = new byte[i2];
        this.A04 = new AnonymousClass5JO(r3);
    }

    public final void A00() {
        byte[] bArr = new byte[this.A00];
        int i2 = 0;
        this.A03.A8A(bArr, 0);
        while (true) {
            byte[] bArr2 = this.A0A;
            if (i2 < bArr2.length) {
                i2 = AnonymousClass3K3.A0O(bArr, bArr2, i2, this.A0B[i2] ^ this.A07[i2]);
            } else {
                return;
            }
        }
    }

    public final void A01() {
        if (!this.A05) {
            this.A05 = true;
            C46912Gt r5 = this.A03;
            r5.A8A(this.A07, 0);
            int i2 = this.A00;
            byte[] bArr = new byte[i2];
            bArr[i2 - 1] = 2;
            r5.update(bArr, 0, i2);
        }
    }

    public final void A02(boolean z2) {
        this.A04.reset();
        C46912Gt r5 = this.A03;
        r5.reset();
        this.A01 = 0;
        Arrays.fill(this.A08, (byte) 0);
        if (z2) {
            Arrays.fill(this.A0A, (byte) 0);
        }
        int i2 = this.A00;
        byte[] bArr = new byte[i2];
        bArr[i2 - 1] = 1;
        r5.update(bArr, 0, i2);
        this.A05 = false;
        byte[] bArr2 = this.A09;
        if (bArr2 != null) {
            Aap(bArr2, 0, bArr2.length);
        }
    }

    public int A8A(byte[] bArr, int i2) {
        A01();
        int i3 = this.A01;
        byte[] bArr2 = this.A08;
        byte[] bArr3 = new byte[bArr2.length];
        this.A01 = 0;
        if (this.A06) {
            int i4 = i2 + i3;
            if (bArr.length >= this.A02 + i4) {
                this.A04.Aaq(bArr2, bArr3, 0, 0);
                System.arraycopy(bArr3, 0, bArr, i2, i3);
                this.A03.update(bArr3, 0, i3);
                A00();
                System.arraycopy(this.A0A, 0, bArr, i4, this.A02);
                A02(false);
                return i3 + this.A02;
            }
            throw new AnonymousClass5JD("Output buffer too short");
        }
        int i5 = this.A02;
        if (i3 < i5) {
            throw new AnonymousClass5JC("data too short");
        } else if (bArr.length >= (i2 + i3) - i5) {
            if (i3 > i5) {
                this.A03.update(bArr2, 0, i3 - i5);
                this.A04.Aaq(this.A08, bArr3, 0, 0);
                System.arraycopy(bArr3, 0, bArr, i2, i3 - this.A02);
            }
            A00();
            byte[] bArr4 = this.A08;
            int i6 = this.A02;
            int i7 = i3 - i6;
            byte b2 = 0;
            for (int i8 = 0; i8 < i6; i8++) {
                b2 |= this.A0A[i8] ^ bArr4[i7 + i8];
            }
            if (b2 == 0) {
                A02(false);
                return i3 - this.A02;
            }
            throw new AnonymousClass5JC("mac check in EAX failed");
        } else {
            throw new AnonymousClass5JD("Output buffer too short");
        }
    }

    public String A9q() {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass3K4.A14(A0o, this.A04.A00);
        return AnonymousClass000.A0h("/EAX", A0o);
    }

    public byte[] ADG() {
        int i2 = this.A02;
        byte[] bArr = new byte[i2];
        System.arraycopy(this.A0A, 0, bArr, 0, i2);
        return bArr;
    }

    public int AE9(int i2) {
        int i3 = i2 + this.A01;
        boolean z2 = this.A06;
        int i4 = this.A02;
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
        return this.A04.A00;
    }

    public int AGm(int i2) {
        int i3 = i2 + this.A01;
        if (!this.A06) {
            int i4 = this.A02;
            int i5 = i3;
            i3 -= i4;
            if (i5 < i4) {
                return 0;
            }
        }
        return i3 - (i3 % this.A00);
    }

    public void AI1(C46932Gv r8, boolean z2) {
        byte[] bArr;
        int ADH;
        C46932Gv r1;
        this.A06 = z2;
        if (r8 instanceof C1053859h) {
            C1053859h r82 = (C1053859h) r8;
            bArr = C33111hx.A02(r82.A03);
            this.A09 = C33111hx.A02(r82.A02);
            ADH = r82.A00 >> 3;
            this.A02 = ADH;
            r1 = r82.A01;
        } else if (r8 instanceof C1054259l) {
            C1054259l r83 = (C1054259l) r8;
            bArr = r83.A01;
            this.A09 = null;
            ADH = this.A03.ADH() >> 1;
            this.A02 = ADH;
            r1 = r83.A00;
        } else {
            throw AnonymousClass000.A0T("invalid parameters passed to EAX");
        }
        int i2 = this.A00;
        int i3 = i2;
        if (!z2) {
            i2 += ADH;
        }
        this.A08 = new byte[i2];
        byte[] bArr2 = new byte[i3];
        C46912Gt r2 = this.A03;
        r2.AHz(r1);
        bArr2[i3 - 1] = 0;
        r2.update(bArr2, 0, i3);
        r2.update(bArr, 0, bArr.length);
        byte[] bArr3 = this.A0B;
        r2.A8A(bArr3, 0);
        this.A04.AI1(new C1054259l((C46932Gv) null, bArr3), true);
        A02(true);
    }

    public void Aap(byte[] bArr, int i2, int i3) {
        if (!this.A05) {
            this.A03.update(bArr, i2, i3);
            return;
        }
        throw AnonymousClass000.A0V("AAD data cannot be added after encryption/decryption processing has begun.");
    }

    public int Aar(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        int i5;
        A01();
        if (bArr.length >= i2 + i3) {
            int i6 = 0;
            for (int i7 = 0; i7 != i3; i7++) {
                byte b2 = bArr[i2 + i7];
                int i8 = i4 + i6;
                byte[] bArr3 = this.A08;
                int i9 = this.A01;
                int i10 = i9 + 1;
                this.A01 = i10;
                bArr3[i9] = b2;
                if (i10 == bArr3.length) {
                    int length = bArr2.length;
                    int i11 = this.A00;
                    if (length >= i8 + i11) {
                        if (this.A06) {
                            i5 = this.A04.Aaq(bArr3, bArr2, 0, i8);
                            this.A03.update(bArr2, i8, i11);
                        } else {
                            this.A03.update(bArr3, 0, i11);
                            i5 = this.A04.Aaq(this.A08, bArr2, 0, i8);
                        }
                        this.A01 = 0;
                        if (!this.A06) {
                            byte[] bArr4 = this.A08;
                            System.arraycopy(bArr4, i11, bArr4, 0, this.A02);
                            this.A01 = this.A02;
                        }
                    } else {
                        throw new AnonymousClass5JD("Output buffer is too short");
                    }
                } else {
                    i5 = 0;
                }
                i6 += i5;
            }
            return i6;
        }
        throw new AnonymousClass5JI("Input buffer too short");
    }
}

package X;

/* renamed from: X.3ZG  reason: invalid class name */
public class AnonymousClass3ZG extends C32561ga {
    public int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public AnonymousClass3ZG(byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            int length = bArr.length;
            int i4 = i2 + i3;
            if ((i2 | i3 | (length - i4)) >= 0) {
                this.A03 = bArr;
                this.A02 = i2;
                this.A00 = i2;
                this.A01 = i4;
                return;
            }
            Object[] objArr = new Object[3];
            AnonymousClass000.A1M(objArr, length, 0);
            AnonymousClass000.A1M(objArr, i2, 1);
            AnonymousClass000.A1M(objArr, i3, 2);
            throw AnonymousClass000.A0T(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", objArr));
        }
        throw AnonymousClass000.A0W("buffer");
    }

    public static AnonymousClass40Q A04(AnonymousClass3ZG r3, Throwable th) {
        return new AnonymousClass40Q(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(r3.A00), Integer.valueOf(r3.A01), 1}), th);
    }

    public final void A05(byte[] bArr, int i2, int i3) {
        A0E(bArr, i2, i3);
    }

    public void A06() {
        if (this instanceof AnonymousClass3ZE) {
            AnonymousClass3ZE r0 = (AnonymousClass3ZE) this;
            r0.A01.position(r0.A00 + (r0.A00 - r0.A02));
        }
    }

    public final void A07(byte b2) {
        try {
            byte[] bArr = this.A03;
            int i2 = this.A00;
            this.A00 = i2 + 1;
            bArr[i2] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw A04(this, e2);
        }
    }

    public final void A08(int i2) {
        if (!C32561ga.A02 || this.A01 - this.A00 < 10) {
            while ((i2 & -128) != 0) {
                try {
                    byte[] bArr = this.A03;
                    int i3 = this.A00;
                    this.A00 = i3 + 1;
                    bArr[i3] = (byte) ((i2 & 127) | 128);
                    i2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw A04(this, e2);
                }
            }
            byte[] bArr2 = this.A03;
            int i4 = this.A00;
            this.A00 = i4 + 1;
            bArr2[i4] = (byte) i2;
            return;
        }
        while (true) {
            int i5 = i2 & -128;
            byte[] bArr3 = this.A03;
            int i6 = this.A00;
            this.A00 = i6 + 1;
            long j2 = (long) i6;
            if (i5 == 0) {
                C90904f2.A08(bArr3, (byte) i2, j2);
                return;
            } else {
                C90904f2.A08(bArr3, (byte) ((i2 & 127) | 128), j2);
                i2 >>>= 7;
            }
        }
    }

    public final void A09(int i2) {
        try {
            byte[] bArr = this.A03;
            int i3 = this.A00;
            int i4 = i3 + 1;
            this.A00 = i4;
            bArr[i3] = (byte) i2;
            int i5 = i4 + 1;
            this.A00 = i5;
            bArr[i4] = (byte) (i2 >> 8);
            int i6 = i5 + 1;
            this.A00 = i6;
            bArr[i5] = (byte) (i2 >> 16);
            this.A00 = i6 + 1;
            bArr[i6] = i2 >> 24;
        } catch (IndexOutOfBoundsException e2) {
            throw A04(this, e2);
        }
    }

    public final void A0A(int i2, String str) {
        int A012;
        AnonymousClass3K3.A1A(this, i2);
        int i3 = this.A00;
        try {
            int length = str.length();
            int A002 = C32561ga.A00(length * 3);
            int A003 = C32561ga.A00(length);
            if (A003 == A002) {
                int i4 = i3 + A003;
                this.A00 = i4;
                A012 = C90324dx.A00.A01(str, this.A03, i4, this.A01 - i4);
                this.A00 = i3;
                A08((A012 - i3) - A003);
            } else {
                A08(C90324dx.A00(str));
                byte[] bArr = this.A03;
                int i5 = this.A00;
                A012 = C90324dx.A00.A01(str, bArr, i5, this.A01 - i5);
            }
            this.A00 = A012;
        } catch (AnonymousClass442 e2) {
            this.A00 = i3;
            A0D(e2, str);
        } catch (IndexOutOfBoundsException e3) {
            throw new AnonymousClass40Q((Throwable) e3);
        }
    }

    public final void A0B(long j2) {
        if (!C32561ga.A02 || this.A01 - this.A00 < 10) {
            while ((j2 & -128) != 0) {
                try {
                    byte[] bArr = this.A03;
                    int i2 = this.A00;
                    this.A00 = i2 + 1;
                    bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw A04(this, e2);
                }
            }
            byte[] bArr2 = this.A03;
            int i3 = this.A00;
            this.A00 = i3 + 1;
            bArr2[i3] = (byte) ((int) j2);
            return;
        }
        while (true) {
            int i4 = ((j2 & -128) > 0 ? 1 : ((j2 & -128) == 0 ? 0 : -1));
            byte[] bArr3 = this.A03;
            int i5 = this.A00;
            this.A00 = i5 + 1;
            long j3 = (long) i5;
            int i6 = (int) j2;
            if (i4 == 0) {
                C90904f2.A08(bArr3, (byte) i6, j3);
                return;
            } else {
                C90904f2.A08(bArr3, (byte) ((i6 & 127) | 128), j3);
                j2 >>>= 7;
            }
        }
    }

    public final void A0C(long j2) {
        try {
            byte[] bArr = this.A03;
            int i2 = this.A00;
            int i3 = i2 + 1;
            this.A00 = i3;
            bArr[i2] = (byte) ((int) j2);
            int i4 = i3 + 1;
            this.A00 = i4;
            AnonymousClass3K3.A0y(j2, bArr, 8, i3);
            int i5 = i4 + 1;
            this.A00 = i5;
            AnonymousClass3K3.A0y(j2, bArr, 16, i4);
            int i6 = i5 + 1;
            this.A00 = i6;
            AnonymousClass3K3.A0y(j2, bArr, 24, i5);
            int i7 = i6 + 1;
            this.A00 = i7;
            AnonymousClass3K3.A0y(j2, bArr, 32, i6);
            int i8 = i7 + 1;
            this.A00 = i8;
            AnonymousClass3K3.A0y(j2, bArr, 40, i7);
            int i9 = i8 + 1;
            this.A00 = i9;
            AnonymousClass3K3.A0y(j2, bArr, 48, i8);
            this.A00 = i9 + 1;
            AnonymousClass3K3.A0y(j2, bArr, 56, i9);
        } catch (IndexOutOfBoundsException e2) {
            throw A04(this, e2);
        }
    }

    public final void A0E(byte[] bArr, int i2, int i3) {
        try {
            System.arraycopy(bArr, i2, this.A03, this.A00, i3);
            this.A00 += i3;
        } catch (IndexOutOfBoundsException e2) {
            Object[] objArr = new Object[3];
            AnonymousClass000.A1M(objArr, this.A00, 0);
            AnonymousClass000.A1M(objArr, this.A01, 1);
            AnonymousClass000.A1M(objArr, i3, 2);
            throw new AnonymousClass40Q(String.format("Pos: %d, limit: %d, len: %d", objArr), e2);
        }
    }
}

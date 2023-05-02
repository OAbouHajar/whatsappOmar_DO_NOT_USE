package X;

/* renamed from: X.5JG  reason: invalid class name */
public class AnonymousClass5JG extends C89194bk {
    public int A00;
    public int A01;
    public AnonymousClass5T8 A02;

    public AnonymousClass5JG(AnonymousClass5T8 r3) {
        this.A02 = r3;
        if (r3 instanceof AnonymousClass5VO) {
            this.A00 = r3.ABn();
            this.A01 = ((AnonymousClass5VO) r3).AAI();
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Digest ");
        A0r.append(r3.A9q());
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(" unsupported", A0r));
    }

    public final byte[] A04(int i2, int i3) {
        byte[] bArr;
        byte[] bArr2;
        int length;
        int length2;
        int i4 = this.A01;
        byte[] bArr3 = new byte[i4];
        byte[] bArr4 = new byte[i3];
        int i5 = 0;
        int i6 = 0;
        while (i6 != i4) {
            i6 = AnonymousClass3K4.A0C(bArr3, i2, i6);
        }
        byte[] bArr5 = this.A02;
        if (bArr5 == null || (length2 = bArr5.length) == 0) {
            bArr = new byte[0];
        } else {
            int i7 = i4 * (((length2 + i4) - 1) / i4);
            bArr = new byte[i7];
            for (int i8 = 0; i8 != i7; i8++) {
                AnonymousClass3K4.A16(bArr5, bArr, i8 % length2, i8);
            }
        }
        byte[] bArr6 = this.A01;
        if (bArr6 == null || (length = bArr6.length) == 0) {
            bArr2 = new byte[0];
        } else {
            int i9 = i4 * (((length + i4) - 1) / i4);
            bArr2 = new byte[i9];
            for (int i10 = 0; i10 != i9; i10++) {
                AnonymousClass3K4.A16(bArr6, bArr2, i10 % length, i10);
            }
        }
        int length3 = bArr.length;
        int length4 = bArr2.length;
        int i11 = length3 + length4;
        byte[] bArr7 = new byte[i11];
        System.arraycopy(bArr, 0, bArr7, 0, length3);
        System.arraycopy(bArr2, 0, bArr7, length3, length4);
        byte[] bArr8 = new byte[i4];
        int i12 = this.A00;
        int i13 = ((i3 + i12) - 1) / i12;
        byte[] bArr9 = new byte[i12];
        int i14 = 1;
        while (i14 <= i13) {
            AnonymousClass5T8 r14 = this.A02;
            r14.update(bArr3, i5, i4);
            r14.update(bArr7, i5, i11);
            r14.A8A(bArr9, i5);
            for (int i15 = 1; i15 < this.A00; i15++) {
                r14.update(bArr9, i5, i12);
                r14.A8A(bArr9, i5);
            }
            for (int i16 = 0; i16 != i4; i16++) {
                AnonymousClass3K4.A16(bArr9, bArr8, i16 % i12, i16);
            }
            for (int i17 = 0; i17 != i11 / i4; i17++) {
                int i18 = i4 * i17;
                int i19 = (i4 + i18) - 1;
                int i20 = (bArr8[i4 - 1] & 255) + (bArr7[i19] & 255) + 1;
                bArr7[i19] = (byte) i20;
                int i21 = i20 >>> 8;
                for (int i22 = i4 - 2; i22 >= 0; i22--) {
                    int i23 = i18 + i22;
                    int i24 = i21 + (bArr8[i22] & 255) + (bArr7[i23] & 255);
                    bArr7[i23] = (byte) i24;
                    i21 = i24 >>> 8;
                }
            }
            if (i14 == i13) {
                int i25 = (i14 - 1) * i12;
                System.arraycopy(bArr9, 0, bArr4, i25, i3 - i25);
            } else {
                System.arraycopy(bArr9, 0, bArr4, (i14 - 1) * i12, i12);
            }
            i14++;
            i5 = 0;
        }
        return bArr4;
    }
}

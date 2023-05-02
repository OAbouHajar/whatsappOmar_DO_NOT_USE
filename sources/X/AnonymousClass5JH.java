package X;

/* renamed from: X.5JH  reason: invalid class name */
public class AnonymousClass5JH extends C89194bk {
    public C46912Gt A00;
    public byte[] A01;

    public AnonymousClass5JH() {
        this(new AnonymousClass5JR());
    }

    public AnonymousClass5JH(AnonymousClass5T8 r2) {
        C1054559r r0 = new C1054559r(r2);
        this.A00 = r0;
        this.A01 = new byte[r0.A01];
    }

    public final byte[] A04(int i2) {
        C46912Gt r12 = this.A00;
        int ADH = r12.ADH();
        int i3 = ((i2 + ADH) - 1) / ADH;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[(i3 * ADH)];
        r12.AHz(new C46922Gu(this.A01));
        int i4 = 0;
        int i5 = 1;
        while (i5 <= i3) {
            int i6 = 3;
            while (true) {
                byte b2 = (byte) (bArr[i6] + 1);
                bArr[i6] = b2;
                if (b2 != 0) {
                    break;
                }
                i6--;
            }
            byte[] bArr3 = this.A02;
            int i7 = this.A00;
            if (i7 != 0) {
                if (bArr3 != null) {
                    r12.update(bArr3, 0, bArr3.length);
                }
                r12.update(bArr, 0, 4);
                byte[] bArr4 = this.A01;
                r12.A8A(bArr4, 0);
                int length = bArr4.length;
                System.arraycopy(bArr4, 0, bArr2, i4, length);
                for (int i8 = 1; i8 < i7; i8++) {
                    r12.update(bArr4, 0, length);
                    r12.A8A(bArr4, 0);
                    for (int i9 = 0; i9 != length; i9++) {
                        int i10 = i4 + i9;
                        bArr2[i10] = (byte) (bArr4[i9] ^ bArr2[i10]);
                    }
                }
                i4 += ADH;
                i5++;
            } else {
                throw AnonymousClass000.A0T("iteration count must be at least 1.");
            }
        }
        return bArr2;
    }
}

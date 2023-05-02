package X;

import org.apache.commons.io.FilenameUtils;

/* renamed from: X.4Wl  reason: invalid class name and case insensitive filesystem */
public abstract class C87354Wl {
    public final int A00;
    public final int A01;

    public C87354Wl(int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
    }

    public byte[] A00() {
        byte[] bArr;
        int i2;
        int i3;
        int i4;
        byte[] bArr2;
        if (this instanceof C69683fR) {
            C69683fR r6 = (C69683fR) this;
            int i5 = r6.A01;
            int i6 = r6.A00;
            int i7 = r6.A01;
            if (i5 == i7 && i6 == r6.A00) {
                return r6.A02;
            }
            i4 = i5 * i6;
            bArr = new byte[i4];
            i3 = 0 * i7;
            i2 = 0;
            if (i5 == i7) {
                bArr2 = r6.A02;
            } else {
                while (i2 < i6) {
                    System.arraycopy(r6.A02, i3, bArr, i2 * i5, i5);
                    i3 += i7;
                    i2++;
                }
                return bArr;
            }
        } else if (this instanceof C69693fS) {
            C69693fS r62 = (C69693fS) this;
            int i8 = r62.A01;
            int i9 = r62.A00;
            int i10 = r62.A01;
            if (i8 == i10 && i9 == r62.A00) {
                return r62.A04;
            }
            i4 = i8 * i9;
            bArr = new byte[i4];
            i3 = (r62.A03 * i10) + r62.A02;
            i2 = 0;
            if (i8 == i10) {
                bArr2 = r62.A04;
            } else {
                while (i2 < i9) {
                    System.arraycopy(r62.A04, i3, bArr, i2 * i8, i8);
                    i3 += i10;
                    i2++;
                }
                return bArr;
            }
        } else {
            C69703fT r1 = (C69703fT) this;
            byte[] A002 = r1.A00.A00();
            int i11 = r1.A01 * r1.A00;
            byte[] bArr3 = new byte[i11];
            for (int i12 = 0; i12 < i11; i12 = AnonymousClass3K4.A0C(bArr3, 255 - (A002[i12] & 255), i12)) {
            }
            return bArr3;
        }
        System.arraycopy(bArr2, i3, bArr, i2, i4);
        return bArr;
    }

    public byte[] A01(byte[] bArr, int i2) {
        int i3;
        int i4;
        byte[] bArr2;
        if (this instanceof C69683fR) {
            C69683fR r1 = (C69683fR) this;
            if (i2 >= 0 && i2 < r1.A00) {
                i3 = r1.A01;
                if (bArr == null || bArr.length < i3) {
                    bArr = new byte[i3];
                }
                i4 = i2 * r1.A01;
                bArr2 = r1.A02;
            }
            throw AnonymousClass000.A0T("Requested row is outside the image: ".concat(String.valueOf(i2)));
        } else if (this instanceof C69693fS) {
            C69693fS r12 = (C69693fS) this;
            if (i2 >= 0 && i2 < r12.A00) {
                i3 = r12.A01;
                if (bArr == null || bArr.length < i3) {
                    bArr = new byte[i3];
                }
                i4 = ((i2 + r12.A03) * r12.A01) + r12.A02;
                bArr2 = r12.A04;
            }
            throw AnonymousClass000.A0T("Requested row is outside the image: ".concat(String.valueOf(i2)));
        } else {
            C69703fT r13 = (C69703fT) this;
            byte[] A012 = r13.A00.A01(bArr, i2);
            int i5 = r13.A01;
            for (int i6 = 0; i6 < i5; i6 = AnonymousClass3K4.A0C(A012, 255 - (A012[i6] & 255), i6)) {
            }
            return A012;
        }
        System.arraycopy(bArr2, i4, bArr, 0, i3);
        return bArr;
    }

    public final String toString() {
        int i2 = this.A01;
        byte[] bArr = new byte[i2];
        int i3 = this.A00;
        StringBuilder A0g = C13690nt.A0g((i2 + 1) * i3);
        for (int i4 = 0; i4 < i3; i4++) {
            bArr = A01(bArr, i4);
            for (int i5 = 0; i5 < i2; i5++) {
                byte b2 = bArr[i5] & 255;
                char c2 = '#';
                if (b2 >= 64) {
                    c2 = '+';
                    if (b2 >= 128) {
                        c2 = ' ';
                        if (b2 < 192) {
                            c2 = FilenameUtils.EXTENSION_SEPARATOR;
                        }
                    }
                }
                A0g.append(c2);
            }
            A0g.append(10);
        }
        return A0g.toString();
    }
}

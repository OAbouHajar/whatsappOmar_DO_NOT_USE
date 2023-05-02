package X;

/* renamed from: X.59p  reason: invalid class name and case insensitive filesystem */
public class C1054359p implements C46912Gt {
    public int A00;
    public AnonymousClass5T8 A01;
    public byte[] A02 = new byte[64];
    public byte[] A03 = new byte[64];

    public C1054359p(AnonymousClass5T8 r3) {
        this.A01 = r3;
        this.A00 = r3.ABn();
    }

    public int A8A(byte[] bArr, int i2) {
        int i3 = this.A00;
        byte[] bArr2 = new byte[i3];
        AnonymousClass5T8 r3 = this.A01;
        r3.A8A(bArr2, 0);
        byte[] bArr3 = this.A03;
        r3.update(bArr3, 0, bArr3.length);
        r3.update(bArr2, 0, i3);
        int A8A = r3.A8A(bArr, i2);
        reset();
        return A8A;
    }

    public int ADH() {
        return this.A00;
    }

    public void AHz(C46932Gv r8) {
        byte[] bArr;
        int i2;
        AnonymousClass5T8 r5 = this.A01;
        r5.reset();
        byte[] bArr2 = ((C46922Gu) r8).A00;
        int length = bArr2.length;
        if (length <= 64) {
            bArr = this.A02;
            System.arraycopy(bArr2, 0, bArr, 0, length);
            while (true) {
                i2 = bArr.length;
                if (length >= i2) {
                    break;
                }
                bArr[length] = 0;
                length++;
            }
        } else {
            r5.update(bArr2, 0, length);
            bArr = this.A02;
            r5.A8A(bArr, 0);
            int i3 = this.A00;
            while (true) {
                i2 = bArr.length;
                if (i3 >= i2) {
                    break;
                }
                bArr[i3] = 0;
                i3++;
            }
        }
        byte[] bArr3 = new byte[i2];
        this.A03 = bArr3;
        System.arraycopy(bArr, 0, bArr3, 0, i2);
        for (int i4 = 0; i4 < i2; i4 = AnonymousClass3K4.A0C(bArr, bArr[i4] ^ 54, i4)) {
        }
        int i5 = 0;
        while (true) {
            byte[] bArr4 = this.A03;
            if (i5 < bArr4.length) {
                i5 = AnonymousClass3K4.A0C(bArr4, bArr4[i5] ^ 92, i5);
            } else {
                r5.update(bArr, 0, i2);
                return;
            }
        }
    }

    public void AhH(byte b2) {
        this.A01.AhH(b2);
    }

    public void reset() {
        AnonymousClass5T8 r3 = this.A01;
        r3.reset();
        byte[] bArr = this.A02;
        r3.update(bArr, 0, bArr.length);
    }

    public void update(byte[] bArr, int i2, int i3) {
        this.A01.update(bArr, i2, i3);
    }
}

package X;

import java.util.Arrays;

/* renamed from: X.4WU  reason: invalid class name */
public final class AnonymousClass4WU {
    public int A00;
    public boolean A01;
    public boolean A02;
    public byte[] A03;
    public final int A04;

    public AnonymousClass4WU(int i2) {
        this.A04 = i2;
        byte[] bArr = new byte[131];
        this.A03 = bArr;
        bArr[2] = 1;
    }

    public void A00(int i2) {
        boolean z2 = true;
        C90524eJ.A04(!this.A02);
        if (i2 != this.A04) {
            z2 = false;
        }
        this.A02 = z2;
        if (z2) {
            this.A00 = 3;
            this.A01 = false;
        }
    }

    public void A01(byte[] bArr, int i2, int i3) {
        if (this.A02) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.A03;
            int length = bArr2.length;
            int i5 = this.A00 + i4;
            if (length < i5) {
                bArr2 = Arrays.copyOf(bArr2, i5 << 1);
                this.A03 = bArr2;
            }
            System.arraycopy(bArr, i2, bArr2, this.A00, i4);
            this.A00 += i4;
        }
    }

    public boolean A02(int i2) {
        if (!this.A02) {
            return false;
        }
        this.A00 -= i2;
        this.A02 = false;
        this.A01 = true;
        return true;
    }
}

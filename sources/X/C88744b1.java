package X;

import java.util.Arrays;

/* renamed from: X.4b1  reason: invalid class name and case insensitive filesystem */
public final class C88744b1 {
    public static final byte[] A04 = {0, 0, 1};
    public int A00;
    public int A01;
    public boolean A02;
    public byte[] A03 = new byte[128];

    public void A00(byte[] bArr, int i2, int i3) {
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
}

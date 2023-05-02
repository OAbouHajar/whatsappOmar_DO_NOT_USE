package X;

import java.io.OutputStream;

/* renamed from: X.1hs  reason: invalid class name and case insensitive filesystem */
public class C33061hs {
    public OutputStream A00;

    public C33061hs(OutputStream outputStream) {
        this.A00 = outputStream;
    }

    public C33061hs A00() {
        return ((this instanceof C33081hu) || (this instanceof C33071ht)) ? this : new C33081hu(this.A00);
    }

    public C33071ht A01() {
        return this instanceof C33071ht ? (C33071ht) this : new C33071ht(this.A00);
    }

    public final void A02(int i2) {
        if (i2 > 127) {
            int i3 = i2;
            int i4 = 1;
            while (true) {
                i3 >>>= 8;
                if (i3 == 0) {
                    break;
                }
                i4++;
            }
            OutputStream outputStream = this.A00;
            outputStream.write((byte) (i4 | 128));
            for (int i5 = (i4 - 1) << 3; i5 >= 0; i5 -= 8) {
                outputStream.write((byte) (i2 >> i5));
            }
            return;
        }
        this.A00.write((byte) i2);
    }

    public final void A03(int i2, int i3, boolean z2) {
        if (!z2) {
            return;
        }
        if (i3 < 31) {
            this.A00.write(i2 | i3);
            return;
        }
        OutputStream outputStream = this.A00;
        outputStream.write(31 | i2);
        if (i3 < 128) {
            outputStream.write(i3);
            return;
        }
        byte[] bArr = new byte[5];
        int i4 = 4;
        bArr[4] = (byte) (i3 & 127);
        do {
            i3 >>= 7;
            i4--;
            bArr[i4] = (byte) ((i3 & 127) | 128);
        } while (i3 > 127);
        outputStream.write(bArr, i4, 5 - i4);
    }

    public void A04(C32051fZ r2, boolean z2) {
        C32051fZ A05;
        if (this instanceof C33081hu) {
            A05 = r2.A06();
        } else if (this instanceof C33071ht) {
            A05 = r2.A05();
        } else {
            r2.A07(this, z2);
            return;
        }
        A05.A07(this, z2);
    }

    public final void A05(byte[] bArr, int i2, int i3, boolean z2) {
        A03(i2, i3, z2);
        int length = bArr.length;
        A02(length);
        this.A00.write(bArr, 0, length);
    }

    public final void A06(byte[] bArr, int i2, boolean z2) {
        if (z2) {
            this.A00.write(i2);
        }
        int length = bArr.length;
        A02(length);
        this.A00.write(bArr, 0, length);
    }

    public final void A07(C32071fb[] r6, int i2, boolean z2) {
        if (z2) {
            this.A00.write(i2);
        }
        OutputStream outputStream = this.A00;
        outputStream.write(128);
        for (C32071fb Agm : r6) {
            A04(Agm.Agm(), true);
        }
        outputStream.write(0);
        outputStream.write(0);
    }
}

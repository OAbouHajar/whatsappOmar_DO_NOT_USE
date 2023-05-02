package X;

import java.util.Arrays;

/* renamed from: X.5JL  reason: invalid class name */
public class AnonymousClass5JL extends C1053459d {
    public int A00;
    public int A01;
    public AnonymousClass5T1 A02;
    public boolean A03;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;
    public byte[] A07;

    public AnonymousClass5JL(AnonymousClass5T1 r3, int i2) {
        super(r3);
        if (i2 > (r3.AA7() << 3) || i2 < 8 || i2 % 8 != 0) {
            StringBuilder A0r = AnonymousClass000.A0r("CFB");
            A0r.append(i2);
            throw AnonymousClass000.A0T(AnonymousClass000.A0h(" not supported", A0r));
        }
        this.A02 = r3;
        int i3 = i2 / 8;
        this.A00 = i3;
        int AA7 = r3.AA7();
        this.A04 = new byte[AA7];
        this.A06 = new byte[AA7];
        this.A05 = new byte[AA7];
        this.A07 = new byte[i3];
    }

    public String A9q() {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass3K4.A14(A0o, this.A02);
        A0o.append("/CFB");
        return AnonymousClass000.A0l(A0o, this.A00 << 3);
    }

    public int AA7() {
        return this.A00;
    }

    public void AI1(C46932Gv r7, boolean z2) {
        this.A03 = z2;
        if (r7 instanceof C1054259l) {
            C1054259l r72 = (C1054259l) r7;
            byte[] bArr = r72.A01;
            int length = bArr.length;
            byte[] bArr2 = this.A04;
            int length2 = bArr2.length;
            if (length < length2) {
                int i2 = length2 - length;
                System.arraycopy(bArr, 0, bArr2, i2, length);
                for (int i3 = 0; i3 < i2; i3++) {
                    bArr2[i3] = 0;
                }
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
            }
            reset();
            r7 = r72.A00;
        } else {
            reset();
        }
        if (r7 != null) {
            this.A02.AI1(r7, true);
        }
    }

    public int Aaq(byte[] bArr, byte[] bArr2, int i2, int i3) {
        int i4 = this.A00;
        A01(bArr, bArr2, i2, i4, i3);
        return i4;
    }

    public void reset() {
        byte[] bArr = this.A04;
        System.arraycopy(bArr, 0, this.A06, 0, bArr.length);
        Arrays.fill(this.A07, (byte) 0);
        this.A01 = 0;
        this.A02.reset();
    }
}

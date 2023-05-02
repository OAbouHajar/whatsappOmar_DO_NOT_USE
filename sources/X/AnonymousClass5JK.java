package X;

/* renamed from: X.5JK  reason: invalid class name */
public class AnonymousClass5JK extends C1053459d {
    public int A00;
    public byte[] A01;
    public byte[] A02;
    public byte[] A03;
    public final int A04;
    public final AnonymousClass5T1 A05;

    public AnonymousClass5JK(AnonymousClass5T1 r3, int i2) {
        super(r3);
        if (i2 > (r3.AA7() << 3) || i2 < 8 || i2 % 8 != 0) {
            StringBuilder A0r = AnonymousClass000.A0r("0FB");
            A0r.append(i2);
            throw AnonymousClass000.A0T(AnonymousClass000.A0h(" not supported", A0r));
        }
        this.A05 = r3;
        this.A04 = i2 / 8;
        int AA7 = r3.AA7();
        this.A01 = new byte[AA7];
        this.A03 = new byte[AA7];
        this.A02 = new byte[AA7];
    }

    public String A9q() {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass3K4.A14(A0o, this.A05);
        A0o.append("/OFB");
        return AnonymousClass000.A0l(A0o, this.A04 << 3);
    }

    public int AA7() {
        return this.A04;
    }

    public void AI1(C46932Gv r7, boolean z2) {
        if (r7 instanceof C1054259l) {
            C1054259l r72 = (C1054259l) r7;
            byte[] bArr = r72.A01;
            int length = bArr.length;
            byte[] bArr2 = this.A01;
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
            this.A05.AI1(r7, true);
        }
    }

    public int Aaq(byte[] bArr, byte[] bArr2, int i2, int i3) {
        int i4 = this.A04;
        A01(bArr, bArr2, i2, i4, i3);
        return i4;
    }

    public void reset() {
        byte[] bArr = this.A01;
        System.arraycopy(bArr, 0, this.A03, 0, bArr.length);
        this.A00 = 0;
        this.A05.reset();
    }
}

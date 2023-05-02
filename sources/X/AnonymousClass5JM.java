package X;

/* renamed from: X.5JM  reason: invalid class name */
public class AnonymousClass5JM extends C1053459d {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03 = true;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;
    public final int A07;
    public final AnonymousClass5T1 A08;

    public AnonymousClass5JM(AnonymousClass5T1 r3) {
        super(r3);
        this.A08 = r3;
        int AA7 = r3.AA7();
        this.A07 = AA7;
        if (AA7 == 8) {
            int AA72 = r3.AA7();
            this.A04 = new byte[AA72];
            this.A06 = new byte[AA72];
            this.A05 = new byte[AA72];
            return;
        }
        throw AnonymousClass000.A0T("GCTR only for 64 bit block ciphers");
    }

    public String A9q() {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass3K4.A14(A0o, this.A08);
        return AnonymousClass000.A0h("/GCTR", A0o);
    }

    public int AA7() {
        return this.A07;
    }

    public void AI1(C46932Gv r7, boolean z2) {
        this.A03 = true;
        this.A00 = 0;
        this.A01 = 0;
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
            this.A08.AI1(r7, true);
        }
    }

    public int Aaq(byte[] bArr, byte[] bArr2, int i2, int i3) {
        int i4 = this.A07;
        A01(bArr, bArr2, i2, i4, i3);
        return i4;
    }

    public void reset() {
        this.A03 = true;
        this.A00 = 0;
        this.A01 = 0;
        byte[] bArr = this.A04;
        System.arraycopy(bArr, 0, this.A06, 0, bArr.length);
        this.A02 = 0;
        this.A08.reset();
    }
}

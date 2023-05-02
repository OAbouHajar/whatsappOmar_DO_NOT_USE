package X;

import java.util.Arrays;

/* renamed from: X.5JO  reason: invalid class name */
public class AnonymousClass5JO extends C1053459d implements C46892Gr {
    public int A00 = 0;
    public byte[] A01;
    public byte[] A02;
    public byte[] A03;
    public final int A04;
    public final AnonymousClass5T1 A05;

    public AnonymousClass5JO(AnonymousClass5T1 r3) {
        super(r3);
        this.A05 = r3;
        int AA7 = r3.AA7();
        this.A04 = AA7;
        this.A01 = new byte[AA7];
        this.A02 = new byte[AA7];
        this.A03 = new byte[AA7];
    }

    public String A9q() {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass3K4.A14(A0o, this.A05);
        return AnonymousClass000.A0h("/SIC", A0o);
    }

    public int AA7() {
        return this.A05.AA7();
    }

    public void AI1(C46932Gv r6, boolean z2) {
        String str;
        StringBuilder sb;
        if (r6 instanceof C1054259l) {
            C1054259l r62 = (C1054259l) r6;
            byte[] A022 = C33111hx.A02(r62.A01);
            this.A01 = A022;
            int i2 = this.A04;
            int length = A022.length;
            if (i2 >= length) {
                int i3 = i2 >> 1;
                int i4 = 8;
                if (8 > i3) {
                    i4 = i3;
                }
                if (i2 - length <= i4) {
                    C46932Gv r2 = r62.A00;
                    if (r2 != null) {
                        this.A05.AI1(r2, true);
                    }
                    reset();
                    return;
                }
                sb = AnonymousClass000.A0r("CTR/SIC mode requires IV of at least: ");
                i2 -= i4;
            } else {
                sb = AnonymousClass000.A0r("CTR/SIC mode requires IV no greater than: ");
            }
            sb.append(i2);
            str = AnonymousClass000.A0h(" bytes.", sb);
        } else {
            str = "CTR/SIC mode requires ParametersWithIV";
        }
        throw AnonymousClass000.A0T(str);
    }

    public int Aaq(byte[] bArr, byte[] bArr2, int i2, int i3) {
        int i4 = this.A04;
        A01(bArr, bArr2, i2, i4, i3);
        return i4;
    }

    public void reset() {
        byte[] bArr = this.A02;
        Arrays.fill(bArr, (byte) 0);
        byte[] bArr2 = this.A01;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.A05.reset();
        this.A00 = 0;
    }
}

package X;

import java.util.Arrays;

/* renamed from: X.59X  reason: invalid class name */
public class AnonymousClass59X implements AnonymousClass5T1 {
    public int A00;
    public AnonymousClass5T1 A01;
    public boolean A02;
    public byte[] A03;
    public byte[] A04;
    public byte[] A05;

    public AnonymousClass59X(AnonymousClass5T1 r3) {
        this.A01 = r3;
        int AA7 = r3.AA7();
        this.A00 = AA7;
        this.A03 = new byte[AA7];
        this.A05 = new byte[AA7];
        this.A04 = new byte[AA7];
    }

    public String A9q() {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass3K4.A14(A0o, this.A01);
        return AnonymousClass000.A0h("/CBC", A0o);
    }

    public int AA7() {
        return this.A01.AA7();
    }

    public void AI1(C46932Gv r7, boolean z2) {
        boolean z3 = this.A02;
        this.A02 = z2;
        if (r7 instanceof C1054259l) {
            C1054259l r72 = (C1054259l) r7;
            byte[] bArr = r72.A01;
            int length = bArr.length;
            if (length == this.A00) {
                System.arraycopy(bArr, 0, this.A03, 0, length);
                reset();
                r7 = r72.A00;
            } else {
                throw AnonymousClass000.A0T("initialisation vector must be the same length as block size");
            }
        } else {
            reset();
        }
        if (r7 != null) {
            this.A01.AI1(r7, z2);
        } else if (z3 != z2) {
            throw AnonymousClass000.A0T("cannot change encrypting state without providing key.");
        }
    }

    public int Aaq(byte[] bArr, byte[] bArr2, int i2, int i3) {
        boolean z2 = this.A02;
        int i4 = this.A00;
        if (z2) {
            if (i4 + i2 <= bArr.length) {
                for (int i5 = 0; i5 < i4; i5++) {
                    byte[] bArr3 = this.A05;
                    AnonymousClass3K2.A1U(bArr, bArr3, i2 + i5, bArr3[i5], i5);
                }
                int Aaq = this.A01.Aaq(this.A05, bArr2, 0, i3);
                byte[] bArr4 = this.A05;
                System.arraycopy(bArr2, i3, bArr4, 0, bArr4.length);
                return Aaq;
            }
            throw new AnonymousClass5JI("input buffer too short");
        } else if (i2 + i4 <= bArr.length) {
            System.arraycopy(bArr, i2, this.A04, 0, i4);
            int Aaq2 = this.A01.Aaq(bArr, bArr2, i2, i3);
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = i3 + i6;
                AnonymousClass3K2.A1U(this.A05, bArr2, i6, bArr2[i7], i7);
            }
            byte[] bArr5 = this.A05;
            this.A05 = this.A04;
            this.A04 = bArr5;
            return Aaq2;
        } else {
            throw new AnonymousClass5JI("input buffer too short");
        }
    }

    public void reset() {
        byte[] bArr = this.A03;
        System.arraycopy(bArr, 0, this.A05, 0, bArr.length);
        Arrays.fill(this.A04, (byte) 0);
        this.A01.reset();
    }
}

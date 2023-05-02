package X;

import java.security.SecureRandom;
import java.util.Arrays;

/* renamed from: X.59t  reason: invalid class name and case insensitive filesystem */
public class C1054759t implements C109575Sr {
    public SecureRandom A00;
    public AnonymousClass59X A01;
    public C1054259l A02;
    public boolean A03;

    public C1054759t(AnonymousClass5T1 r2) {
        this.A01 = new AnonymousClass59X(r2);
    }

    public String A9q() {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass3K4.A14(A0o, this.A01.A01);
        return AnonymousClass000.A0h("/RFC3211Wrap", A0o);
    }

    public void AI1(C46932Gv r4, boolean z2) {
        this.A03 = z2;
        if (r4 instanceof C1053759g) {
            C1053759g r42 = (C1053759g) r4;
            this.A00 = r42.A00;
            C46932Gv r1 = r42.A01;
            if (r1 instanceof C1054259l) {
                this.A02 = (C1054259l) r1;
                return;
            }
        } else {
            if (z2) {
                this.A00 = C90614eS.A00();
            }
            if (r4 instanceof C1054259l) {
                this.A02 = (C1054259l) r4;
                return;
            }
        }
        throw AnonymousClass000.A0T("RFC3211Wrap requires an IV");
    }

    public byte[] AhF(byte[] bArr, int i2, int i3) {
        int i4;
        if (!this.A03) {
            AnonymousClass59X r3 = this.A01;
            int AA7 = r3.A01.AA7();
            if (i3 >= (AA7 << 1)) {
                byte[] bArr2 = new byte[i3];
                byte[] bArr3 = new byte[AA7];
                boolean z2 = false;
                System.arraycopy(bArr, 0, bArr2, 0, i3);
                System.arraycopy(bArr, 0, bArr3, 0, AA7);
                r3.AI1(new C1054259l(this.A02.A00, bArr3), false);
                for (int i5 = AA7; i5 < i3; i5 += AA7) {
                    r3.Aaq(bArr2, bArr2, i5, i5);
                }
                System.arraycopy(bArr2, i3 - AA7, bArr3, 0, AA7);
                r3.AI1(new C1054259l(this.A02.A00, bArr3), false);
                r3.Aaq(bArr2, bArr2, 0, 0);
                r3.AI1(this.A02, false);
                for (int i6 = 0; i6 < i3; i6 += AA7) {
                    r3.Aaq(bArr2, bArr2, i6, i6);
                }
                byte b2 = bArr2[0] & 255;
                int i7 = i3 - 4;
                boolean z3 = true;
                if (b2 <= i7) {
                    z3 = false;
                    i7 = b2;
                }
                byte[] bArr4 = new byte[i7];
                System.arraycopy(bArr2, 4, bArr4, 0, i7);
                int i8 = 0;
                byte b3 = 0;
                do {
                    i4 = i8 + 1;
                    b3 |= bArr2[i8 + 4] ^ ((byte) (bArr2[i4] ^ -1));
                    i8 = i4;
                } while (i4 != 3);
                Arrays.fill(bArr2, (byte) 0);
                if (b3 != 0) {
                    z2 = true;
                }
                if (!z3 && !z2) {
                    return bArr4;
                }
                throw new AnonymousClass5JC("wrapped key corrupted");
            }
            throw new AnonymousClass5JC("input too short");
        }
        throw AnonymousClass000.A0V("not set for unwrapping");
    }

    public byte[] AiA(byte[] bArr, int i2, int i3) {
        if (!this.A03) {
            throw AnonymousClass000.A0V("not set for wrapping");
        } else if (i3 > 255 || i3 < 0) {
            throw AnonymousClass000.A0T("input must be from 0 to 255 bytes");
        } else {
            AnonymousClass59X r3 = this.A01;
            r3.AI1(this.A02, true);
            int AA7 = r3.A01.AA7();
            int i4 = i3 + 4;
            int i5 = AA7 << 1;
            if (i4 >= i5) {
                i5 = i4 % AA7 == 0 ? i4 : ((i4 / AA7) + 1) * AA7;
            }
            byte[] bArr2 = new byte[i5];
            bArr2[0] = (byte) i3;
            System.arraycopy(bArr, 0, bArr2, 4, i3);
            int i6 = i5 - i4;
            byte[] bArr3 = new byte[i6];
            this.A00.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i4, i6);
            bArr2[1] = (byte) (bArr2[4] ^ -1);
            bArr2[2] = (byte) (bArr2[5] ^ -1);
            bArr2[3] = (byte) (bArr2[6] ^ -1);
            for (int i7 = 0; i7 < i5; i7 += AA7) {
                r3.Aaq(bArr2, bArr2, i7, i7);
            }
            for (int i8 = 0; i8 < i5; i8 += AA7) {
                r3.Aaq(bArr2, bArr2, i8, i8);
            }
            return bArr2;
        }
    }
}

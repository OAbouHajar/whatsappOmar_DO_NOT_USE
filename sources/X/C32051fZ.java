package X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.1fZ  reason: invalid class name and case insensitive filesystem */
public abstract class C32051fZ extends C32061fa {
    public static C32051fZ A02(byte[] bArr) {
        C33011hn r0 = new C33011hn(bArr);
        try {
            C32051fZ A05 = r0.A05();
            if (r0.available() == 0) {
                return A05;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public int A03() {
        byte[] bArr;
        if (this instanceof C33021ho) {
            bArr = ((C33021ho) this).A00;
        } else if (this instanceof C32401gI) {
            C32401gI r4 = (C32401gI) this;
            int i2 = r4.A00;
            if (i2 < 0) {
                i2 = 0;
                for (C32071fb Agm : r4.A00) {
                    i2 += Agm.Agm().A05().A03();
                }
                r4.A00 = i2;
            }
            return C32551gZ.A00(i2) + 1 + i2;
        } else if (this instanceof C32041fY) {
            bArr = ((C32041fY) this).A0B();
        } else if (!(this instanceof C33041hq)) {
            return 3;
        } else {
            bArr = ((C33041hq) this).A01;
        }
        int length = bArr.length;
        return C32551gZ.A00(length) + 1 + length;
    }

    public final boolean A04(C32051fZ r3) {
        return this == r3 || A09(r3);
    }

    public C32051fZ A05() {
        return this;
    }

    public C32051fZ A06() {
        return this;
    }

    public void A07(C33061hs r4, boolean z2) {
        byte[] bArr;
        int i2;
        if (this instanceof C33021ho) {
            bArr = ((C33021ho) this).A00;
            i2 = 22;
        } else if (this instanceof C32041fY) {
            bArr = ((C32041fY) this).A0B();
            i2 = 6;
        } else if (this instanceof C33041hq) {
            bArr = ((C33041hq) this).A01;
            i2 = 2;
        } else {
            byte b2 = ((C33051hr) this).A00;
            if (z2) {
                r4.A00.write(1);
            }
            r4.A02(1);
            r4.A00.write(b2);
            return;
        }
        r4.A06(bArr, i2, z2);
    }

    public boolean A08() {
        return !(this instanceof C33021ho) && (this instanceof C32411gJ);
    }

    public boolean A09(C32051fZ r6) {
        byte[] bArr;
        byte[] bArr2;
        if (this instanceof C33021ho) {
            C33021ho r1 = (C33021ho) this;
            if (!(r6 instanceof C33021ho)) {
                return false;
            }
            bArr = r1.A00;
            bArr2 = ((C33021ho) r6).A00;
        } else if (this instanceof C32411gJ) {
            C32411gJ r4 = (C32411gJ) this;
            if (!(r6 instanceof C32411gJ)) {
                return false;
            }
            C32411gJ r62 = (C32411gJ) r6;
            int A0A = r4.A0A();
            if (r62.A0A() != A0A) {
                return false;
            }
            for (int i2 = 0; i2 < A0A; i2++) {
                C32051fZ Agm = r4.A00[i2].Agm();
                C32051fZ Agm2 = r62.A00[i2].Agm();
                if (Agm != Agm2 && !Agm.A09(Agm2)) {
                    return false;
                }
            }
            return true;
        } else if (this instanceof C32041fY) {
            C32041fY r12 = (C32041fY) this;
            if (r6 == r12) {
                return true;
            }
            if (r6 instanceof C32041fY) {
                return r12.A01.equals(((C32041fY) r6).A01);
            }
            return false;
        } else if (this instanceof C33041hq) {
            C33041hq r13 = (C33041hq) this;
            if (!(r6 instanceof C33041hq)) {
                return false;
            }
            bArr = r13.A01;
            bArr2 = ((C33041hq) r6).A01;
        } else {
            C33051hr r14 = (C33051hr) this;
            if (!(r6 instanceof C33051hr)) {
                return false;
            }
            C33051hr r63 = (C33051hr) r6;
            boolean z2 = false;
            if (r14.A00 != 0) {
                z2 = true;
            }
            boolean z3 = false;
            if (r63.A00 != 0) {
                z3 = true;
            }
            return z2 == z3;
        }
        return Arrays.equals(bArr, bArr2);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32071fb) && A09(((C32071fb) obj).Agm()));
    }

    public abstract int hashCode();
}

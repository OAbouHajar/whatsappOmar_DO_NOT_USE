package X;

/* renamed from: X.5Iq  reason: invalid class name and case insensitive filesystem */
public class C107555Iq extends C32411gJ {
    public int A00 = -1;

    public C107555Iq() {
    }

    public C107555Iq(C32071fb r2) {
        super(r2);
    }

    public C107555Iq(C32391gH r2) {
        super(r2);
    }

    public C107555Iq(C32071fb[] r2) {
        super(r2, false);
    }

    public int A03() {
        int i2 = this.A00;
        if (i2 < 0) {
            int length = this.A00.length;
            i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                i2 = AnonymousClass3K3.A0P(this.A00, i3, i2);
            }
            this.A00 = i2;
        }
        return C32551gZ.A00(i2) + 1 + i2;
    }

    public C32051fZ A06() {
        return this;
    }

    public void A07(C33061hs r9, boolean z2) {
        if (z2) {
            r9.A00.write(48);
        }
        C33061hs A002 = r9.A00();
        int length = this.A00.length;
        int i2 = this.A00;
        int i3 = 0;
        if (i2 < 0) {
            if (length > 16) {
                int i4 = 0;
                i2 = 0;
                do {
                    i2 = AnonymousClass3K3.A0P(this.A00, i4, i2);
                    i4++;
                } while (i4 < length);
                this.A00 = i2;
            } else {
                C32051fZ[] r7 = new C32051fZ[length];
                int i5 = 0;
                for (int i6 = 0; i6 < length; i6++) {
                    C32051fZ A06 = this.A00[i6].Agm().A06();
                    r7[i6] = A06;
                    i5 += A06.A03();
                }
                this.A00 = i5;
                r9.A02(i5);
                while (i3 < length) {
                    A002.A04(r7[i3], true);
                    i3++;
                }
                return;
            }
        }
        r9.A02(i2);
        while (i3 < length) {
            A002.A04(this.A00[i3].Agm(), true);
            i3++;
        }
    }
}

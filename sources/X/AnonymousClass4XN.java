package X;

/* renamed from: X.4XN  reason: invalid class name */
public final class AnonymousClass4XN {
    public int A00 = 0;
    public int A01;
    public int A02;
    public byte[] A03;

    public AnonymousClass4XN(byte[] bArr, int i2, int i3) {
        this.A03 = bArr;
        this.A02 = i2;
        this.A01 = i3;
        A04();
    }

    public int A00() {
        int i2 = 0;
        int i3 = 0;
        while (!A06()) {
            i3++;
        }
        int i4 = (1 << i3) - 1;
        if (i3 > 0) {
            i2 = A02(i3);
        }
        int i5 = i4 + i2;
        int i6 = 1;
        if (i5 % 2 == 0) {
            i6 = -1;
        }
        return i6 * ((i5 + 1) >> 1);
    }

    public int A01() {
        int i2 = 0;
        int i3 = 0;
        while (!A06()) {
            i3++;
        }
        int i4 = (1 << i3) - 1;
        if (i3 > 0) {
            i2 = A02(i3);
        }
        return i4 + i2;
    }

    public int A02(int i2) {
        int i3;
        int i4 = this.A00 + i2;
        this.A00 = i4;
        int i5 = 0;
        while (true) {
            i3 = 2;
            if (i4 <= 8) {
                break;
            }
            i4 -= 8;
            this.A00 = i4;
            byte[] bArr = this.A03;
            int i6 = this.A02;
            i5 |= (bArr[i6] & 255) << i4;
            if (!A07(i6 + 1)) {
                i3 = 1;
            }
            this.A02 = i6 + i3;
        }
        byte[] bArr2 = this.A03;
        int i7 = this.A02;
        int i8 = (-1 >>> (32 - i2)) & (i5 | ((bArr2[i7] & 255) >> (8 - i4)));
        if (i4 == 8) {
            this.A00 = 0;
            if (!A07(i7 + 1)) {
                i3 = 1;
            }
            this.A02 = i7 + i3;
        }
        A04();
        return i8;
    }

    public void A03() {
        int i2 = 1;
        int i3 = this.A00 + 1;
        this.A00 = i3;
        if (i3 == 8) {
            this.A00 = 0;
            int i4 = this.A02;
            if (A07(i4 + 1)) {
                i2 = 2;
            }
            this.A02 = i4 + i2;
        }
        A04();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r2 = this;
            int r1 = r2.A02
            if (r1 < 0) goto L_0x0013
            int r0 = r2.A01
            if (r1 < r0) goto L_0x000e
            if (r1 != r0) goto L_0x0013
            int r0 = r2.A00
            if (r0 != 0) goto L_0x0013
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C90524eJ.A04(r0)
            return
        L_0x0013:
            r0 = 0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XN.A04():void");
    }

    public void A05(int i2) {
        int i3 = this.A02;
        int i4 = i2 >> 3;
        int i5 = i3 + i4;
        this.A02 = i5;
        int i6 = this.A00 + (i2 - (i4 << 3));
        this.A00 = i6;
        if (i6 > 7) {
            i5++;
            this.A02 = i5;
            this.A00 = i6 - 8;
        }
        while (true) {
            i3++;
            if (i3 > i5) {
                A04();
                return;
            } else if (A07(i3)) {
                i5++;
                this.A02 = i5;
                i3 += 2;
            }
        }
    }

    public boolean A06() {
        boolean A1O = AnonymousClass000.A1O(this.A03[this.A02] & (128 >> this.A00));
        A03();
        return A1O;
    }

    public final boolean A07(int i2) {
        if (2 > i2 || i2 >= this.A01) {
            return false;
        }
        byte[] bArr = this.A03;
        return bArr[i2] == 3 && bArr[i2 + -2] == 0 && bArr[i2 - 1] == 0;
    }
}

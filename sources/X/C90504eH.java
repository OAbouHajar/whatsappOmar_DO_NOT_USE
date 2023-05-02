package X;

import java.util.Arrays;

/* renamed from: X.4eH  reason: invalid class name and case insensitive filesystem */
public final class C90504eH {
    public int A00;
    public int A01;
    public byte[] A02;

    public C90504eH() {
        this.A02 = AnonymousClass3C1.A0A;
    }

    public C90504eH(int i2) {
        this.A02 = new byte[i2];
        this.A00 = i2;
    }

    public C90504eH(byte[] bArr) {
        this.A02 = bArr;
        this.A00 = bArr.length;
    }

    public C90504eH(byte[] bArr, int i2) {
        this.A02 = bArr;
        this.A00 = i2;
    }

    public static int A00(C90504eH r2) {
        return r2.A00 - r2.A01;
    }

    public static int A01(C90504eH r0, int i2) {
        r0.A0T(i2);
        return r0.A0C();
    }

    public static int A02(C90504eH r0, int i2) {
        r0.A0S(i2);
        return r0.A0E();
    }

    public static int A03(C90504eH r0, int i2) {
        r0.A0S(i2);
        return r0.A07();
    }

    public static int A04(C90504eH r0, byte[] bArr, int i2, int i3) {
        r0.A01 = i2;
        return bArr[i3] & 255;
    }

    public static C90504eH A05(int i2) {
        return new C90504eH(i2);
    }

    public static void A06(C55142iu r2, C90504eH r3, int i2) {
        r2.AaL(r3.A02, 0, i2);
    }

    public int A07() {
        byte[] bArr = this.A02;
        int i2 = this.A01;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.A01 = i4;
        int A0M = AnonymousClass3K3.A0M(bArr, i3, A04(this, bArr, i3, i2) << 24);
        int i5 = i4 + 1;
        this.A01 = i5;
        return A04(this, bArr, i5 + 1, i5) | AnonymousClass3K3.A0L(bArr, i4, A0M);
    }

    public int A08() {
        byte[] bArr = this.A02;
        int i2 = this.A01;
        int i3 = i2 + 1;
        int A04 = A04(this, bArr, i3, i2);
        int i4 = i3 + 1;
        this.A01 = i4;
        int A0L = AnonymousClass3K3.A0L(bArr, i3, A04);
        int i5 = i4 + 1;
        this.A01 = i5;
        return (A04(this, bArr, i5 + 1, i5) << 24) | AnonymousClass3K3.A0M(bArr, i4, A0L);
    }

    public int A09() {
        int A08 = A08();
        if (A08 >= 0) {
            return A08;
        }
        throw AnonymousClass000.A0V(C13680ns.A0c(A08, "Top bit not zero: "));
    }

    public int A0A() {
        byte[] bArr = this.A02;
        int i2 = this.A01;
        int i3 = i2 + 1;
        return (A04(this, bArr, i3 + 1, i3) << 8) | A04(this, bArr, i3, i2);
    }

    public int A0B() {
        return (A0C() << 21) | (A0C() << 14) | (A0C() << 7) | A0C();
    }

    public int A0C() {
        byte[] bArr = this.A02;
        int i2 = this.A01;
        return A04(this, bArr, i2 + 1, i2);
    }

    public int A0D() {
        byte[] bArr = this.A02;
        int i2 = this.A01;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.A01 = i4;
        return A04(this, bArr, i4 + 1, i4) | AnonymousClass3K3.A0L(bArr, i3, A04(this, bArr, i3, i2) << 16);
    }

    public int A0E() {
        int A07 = A07();
        if (A07 >= 0) {
            return A07;
        }
        throw AnonymousClass000.A0V(C13680ns.A0c(A07, "Top bit not zero: "));
    }

    public int A0F() {
        byte[] bArr = this.A02;
        int i2 = this.A01;
        int i3 = i2 + 1;
        return A04(this, bArr, i3 + 1, i3) | (A04(this, bArr, i3, i2) << 8);
    }

    public long A0G() {
        byte[] bArr = this.A02;
        int i2 = this.A01;
        int i3 = i2 + 1;
        this.A01 = i3;
        int i4 = i3 + 1;
        this.A01 = i4;
        int i5 = i4 + 1;
        this.A01 = i5;
        long j2 = (((long) bArr[i2]) & 255) | ((((long) bArr[i3]) & 255) << 8) | ((((long) bArr[i4]) & 255) << 16);
        this.A01 = i5 + 1;
        return ((((long) bArr[i5]) & 255) << 24) | j2;
    }

    public long A0H() {
        byte[] bArr = this.A02;
        int i2 = this.A01;
        int i3 = i2 + 1;
        this.A01 = i3;
        int i4 = i3 + 1;
        this.A01 = i4;
        int i5 = i4 + 1;
        this.A01 = i5;
        int i6 = i5 + 1;
        this.A01 = i6;
        int i7 = i6 + 1;
        this.A01 = i7;
        int i8 = i7 + 1;
        this.A01 = i8;
        int i9 = i8 + 1;
        this.A01 = i9;
        this.A01 = i9 + 1;
        return (((long) bArr[i9]) & 255) | ((((long) bArr[i2]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16) | ((((long) bArr[i8]) & 255) << 8);
    }

    public long A0I() {
        byte[] bArr = this.A02;
        int i2 = this.A01;
        int i3 = i2 + 1;
        this.A01 = i3;
        int i4 = i3 + 1;
        this.A01 = i4;
        int i5 = i4 + 1;
        this.A01 = i5;
        this.A01 = i5 + 1;
        return (((long) bArr[i5]) & 255) | ((((long) bArr[i2]) & 255) << 24) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 8);
    }

    public long A0J() {
        long A0H = A0H();
        if (A0H >= 0) {
            return A0H;
        }
        throw AnonymousClass000.A0V(C13680ns.A0j(AnonymousClass000.A0r("Top bit not zero: "), A0H));
    }

    public long A0K() {
        int i2;
        byte[] bArr = this.A02;
        int i3 = this.A01;
        long j2 = (long) bArr[i3];
        int i4 = 7;
        while (true) {
            int i5 = 1;
            if (i4 < 0) {
                break;
            }
            int i6 = 1 << i4;
            if ((((long) i6) & j2) == 0) {
                if (i4 < 6) {
                    j2 &= (long) (i6 - 1);
                    i2 = 7 - i4;
                    if (i2 != 0) {
                        while (i5 < i2) {
                            byte b2 = bArr[i3 + i5];
                            if ((b2 & 192) == 128) {
                                j2 = (j2 << 6) | ((long) (b2 & 63));
                                i5++;
                            } else {
                                throw new NumberFormatException(C13680ns.A0j(AnonymousClass000.A0r("Invalid UTF-8 sequence continuation byte: "), j2));
                            }
                        }
                    }
                } else if (i4 == 7) {
                    i2 = 1;
                }
                this.A01 = i3 + i2;
                return j2;
            }
            i4--;
        }
        throw new NumberFormatException(C13680ns.A0j(AnonymousClass000.A0r("Invalid UTF-8 sequence first byte: "), j2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        if (r5 == r3) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0L() {
        /*
            r6 = this;
            int r2 = r6.A00
            int r3 = r6.A01
            int r0 = r2 - r3
            if (r0 != 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            r5 = r3
        L_0x000b:
            if (r5 >= r2) goto L_0x001c
            byte[] r0 = r6.A02
            byte r1 = r0[r5]
            r0 = 10
            if (r1 == r0) goto L_0x001c
            r0 = 13
            if (r1 == r0) goto L_0x001c
            int r5 = r5 + 1
            goto L_0x000b
        L_0x001c:
            int r1 = r5 - r3
            r0 = 3
            if (r1 < r0) goto L_0x003d
            byte[] r2 = r6.A02
            byte r1 = r2[r3]
            r0 = -17
            if (r1 != r0) goto L_0x003d
            int r0 = r3 + 1
            byte r1 = r2[r0]
            r0 = -69
            if (r1 != r0) goto L_0x003d
            int r0 = r3 + 2
            byte r1 = r2[r0]
            r0 = -65
            if (r1 != r0) goto L_0x003d
            int r3 = r3 + 3
            r6.A01 = r3
        L_0x003d:
            byte[] r2 = r6.A02
            int r1 = r5 - r3
            java.nio.charset.Charset r0 = X.AnonymousClass4BH.A05
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2, r3, r1, r0)
            r6.A01 = r5
            int r3 = r6.A00
            if (r5 == r3) goto L_0x005c
            byte[] r2 = r6.A02
            byte r1 = r2[r5]
            r0 = 13
            if (r1 != r0) goto L_0x005d
            int r5 = r5 + 1
            r6.A01 = r5
            if (r5 != r3) goto L_0x005d
        L_0x005c:
            return r4
        L_0x005d:
            byte r1 = r2[r5]
            r0 = 10
            if (r1 != r0) goto L_0x005c
            int r0 = r5 + 1
            r6.A01 = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90504eH.A0L():java.lang.String");
    }

    public String A0M() {
        int i2 = this.A00;
        int i3 = this.A01;
        if (i2 - i3 == 0) {
            return null;
        }
        int i4 = i3;
        while (i4 < i2 && this.A02[i4] != 0) {
            i4++;
        }
        String str = new String(this.A02, i3, i4 - i3, AnonymousClass4BH.A05);
        this.A01 = i4;
        if (i4 >= this.A00) {
            return str;
        }
        this.A01 = i4 + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r5.A02[r1] != 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0N(int r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0005
            java.lang.String r0 = ""
            return r0
        L_0x0005:
            int r4 = r5.A01
            int r0 = r4 + r6
            int r1 = r0 + -1
            int r0 = r5.A00
            if (r1 >= r0) goto L_0x0017
            byte[] r0 = r5.A02
            byte r0 = r0[r1]
            int r3 = r6 + -1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r3 = r6
        L_0x0018:
            byte[] r2 = r5.A02
            java.nio.charset.Charset r0 = X.AnonymousClass4BH.A05
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2, r4, r3, r0)
            int r0 = r5.A01
            int r0 = r0 + r6
            r5.A01 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90504eH.A0N(int):java.lang.String");
    }

    public String A0O(int i2) {
        String str = new String(this.A02, this.A01, i2, AnonymousClass4BH.A05);
        this.A01 += i2;
        return str;
    }

    public void A0P(int i2) {
        byte[] bArr = this.A02;
        if (i2 > bArr.length) {
            this.A02 = Arrays.copyOf(bArr, i2);
        }
    }

    public void A0Q(int i2) {
        byte[] bArr = this.A02;
        if (bArr.length < i2) {
            bArr = new byte[i2];
        }
        A0U(bArr, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r3 > r2.A02.length) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0R(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L_0x0008
            byte[] r0 = r2.A02
            int r1 = r0.length
            r0 = 1
            if (r3 <= r1) goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            X.C90524eJ.A03(r0)
            r2.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90504eH.A0R(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r3 > r2.A00) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0S(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L_0x0007
            int r1 = r2.A00
            r0 = 1
            if (r3 <= r1) goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            X.C90524eJ.A03(r0)
            r2.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90504eH.A0S(int):void");
    }

    public void A0T(int i2) {
        A0S(this.A01 + i2);
    }

    public void A0U(byte[] bArr, int i2) {
        this.A02 = bArr;
        this.A00 = i2;
        this.A01 = 0;
    }

    public void A0V(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.A02, this.A01, bArr, i2, i3);
        this.A01 += i3;
    }
}

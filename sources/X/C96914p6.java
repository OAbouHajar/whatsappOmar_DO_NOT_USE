package X;

/* renamed from: X.4p6  reason: invalid class name and case insensitive filesystem */
public final class C96914p6 implements C109595St {
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public long A03;
    public long A04;
    public C32491gT A05;
    public C32481gS A06;
    public String A07;
    public boolean A08 = false;
    public final C90204dh A09;
    public final C90504eH A0A;
    public final String A0B;

    public C96914p6(String str) {
        C90204dh r0 = new C90204dh(new byte[16], 16);
        this.A09 = r0;
        this.A0A = new C90504eH(r0.A03);
        this.A0B = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0127, code lost:
        if (r4 != 3) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012b, code lost:
        if (r4 != 11) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0132, code lost:
        if (r4 != 8) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015d, code lost:
        r2.A02 = 1;
        r1 = r2.A0A.A02;
        r1[0] = -84;
        r0 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0169, code lost:
        if (r4 == false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016b, code lost:
        r0 = 65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016d, code lost:
        r1[1] = (byte) r0;
        r2.A00 = 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A6b(X.C90504eH r18) {
        /*
            r17 = this;
            r2 = r17
            X.1gS r0 = r2.A06
            X.C90524eJ.A01(r0)
        L_0x0007:
            r8 = r18
            int r6 = r8.A00
            int r0 = r8.A01
            int r4 = r6 - r0
            if (r4 <= 0) goto L_0x0174
            int r0 = r2.A02
            r14 = 0
            r5 = 2
            r12 = 1
            if (r0 == 0) goto L_0x0137
            if (r0 == r12) goto L_0x0042
            int r1 = r2.A01
            int r0 = r2.A00
            int r1 = X.AnonymousClass3K4.A06(r1, r0, r4)
            X.1gS r0 = r2.A06
            r0.Acw(r8, r1)
            int r0 = r2.A00
            int r0 = r0 + r1
            r2.A00 = r0
            int r13 = r2.A01
            if (r0 != r13) goto L_0x0007
            X.1gS r10 = r2.A06
            long r15 = r2.A04
            r11 = 0
            r10.Ad0(r11, r12, r13, r14, r15)
            long r3 = r2.A04
            long r0 = r2.A03
            long r3 = r3 + r0
            r2.A04 = r3
            r2.A02 = r14
            goto L_0x0007
        L_0x0042:
            X.4eH r7 = r2.A0A
            byte[] r3 = r7.A02
            r6 = 16
            int r0 = r2.A00
            int r1 = X.AnonymousClass3K4.A06(r6, r0, r4)
            r8.A0V(r3, r0, r1)
            int r0 = r2.A00
            int r0 = r0 + r1
            r2.A00 = r0
            if (r0 != r6) goto L_0x0007
            X.4dh r4 = r2.A09
            r4.A07(r14)
            int r3 = r4.A04(r6)
            int r11 = r4.A04(r6)
            r10 = 4
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = 4
            if (r11 != r1) goto L_0x0073
            r0 = 24
            int r11 = r4.A04(r0)
            r0 = 7
        L_0x0073:
            int r11 = r11 + r0
            r0 = 44097(0xac41, float:6.1793E-41)
            if (r3 != r0) goto L_0x007b
            int r11 = r11 + 2
        L_0x007b:
            int r0 = r4.A04(r5)
            r9 = 3
            if (r0 != r9) goto L_0x008b
        L_0x0082:
            r4.A04(r5)
            boolean r0 = r4.A0C()
            if (r0 != 0) goto L_0x0082
        L_0x008b:
            r0 = 10
            int r13 = r4.A04(r0)
            boolean r0 = r4.A0C()
            if (r0 == 0) goto L_0x00a0
            int r0 = r4.A04(r9)
            if (r0 <= 0) goto L_0x00a0
            r4.A08(r5)
        L_0x00a0:
            boolean r3 = r4.A0C()
            r1 = 48000(0xbb80, float:6.7262E-41)
            r0 = 44100(0xac44, float:6.1797E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r3 == 0) goto L_0x00b2
            r8 = 48000(0xbb80, float:6.7262E-41)
        L_0x00b2:
            int r4 = r4.A04(r10)
            if (r8 != r0) goto L_0x010f
            r0 = 13
            if (r4 != r0) goto L_0x0135
            int[] r0 = X.C89654cc.A00
            r12 = r0[r4]
        L_0x00c0:
            X.1gT r3 = r2.A05
            java.lang.String r1 = "audio/ac4"
            if (r3 == 0) goto L_0x00d6
            int r0 = r3.A06
            if (r5 != r0) goto L_0x00d6
            int r0 = r3.A0F
            if (r8 != r0) goto L_0x00d6
            java.lang.String r0 = r3.A0T
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00f4
        L_0x00d6:
            X.1gR r3 = X.AnonymousClass3K4.A0N()
            java.lang.String r0 = r2.A07
            r3.A0O = r0
            r3.A0R = r1
            r3.A04 = r5
            r3.A0D = r8
            java.lang.String r0 = r2.A0B
            r3.A0Q = r0
            X.1gT r1 = new X.1gT
            r1.<init>((X.C32471gR) r3)
            r2.A05 = r1
            X.1gS r0 = r2.A06
            r0.A9D(r1)
        L_0x00f4:
            r2.A01 = r11
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = (long) r12
            long r3 = r3 * r0
            X.1gT r0 = r2.A05
            int r0 = r0.A0F
            long r0 = (long) r0
            long r3 = r3 / r0
            r2.A03 = r3
            r7.A0S(r14)
            X.1gS r0 = r2.A06
            r0.Acw(r7, r6)
            r2.A02 = r5
            goto L_0x0007
        L_0x010f:
            if (r8 != r1) goto L_0x0135
            int[] r1 = X.C89654cc.A00
            int r0 = r1.length
            if (r4 >= r0) goto L_0x0135
            r12 = r1[r4]
            int r3 = r13 % 5
            r1 = 8
            r0 = 1
            if (r3 == r0) goto L_0x0130
            r0 = 11
            if (r3 == r5) goto L_0x0129
            if (r3 == r9) goto L_0x0130
            if (r3 != r10) goto L_0x00c0
            if (r4 == r9) goto L_0x012d
        L_0x0129:
            if (r4 == r1) goto L_0x012d
            if (r4 != r0) goto L_0x00c0
        L_0x012d:
            int r12 = r12 + 1
            goto L_0x00c0
        L_0x0130:
            if (r4 == r9) goto L_0x012d
            if (r4 != r1) goto L_0x00c0
            goto L_0x012d
        L_0x0135:
            r12 = 0
            goto L_0x00c0
        L_0x0137:
            int r0 = r8.A01
            int r0 = r6 - r0
            r4 = 0
            if (r0 <= 0) goto L_0x0007
            boolean r1 = r2.A08
            r0 = 172(0xac, float:2.41E-43)
            int r3 = r8.A0C()
            if (r1 != 0) goto L_0x014e
            if (r3 != r0) goto L_0x014b
            r4 = 1
        L_0x014b:
            r2.A08 = r4
            goto L_0x0137
        L_0x014e:
            boolean r0 = X.AnonymousClass000.A1R(r3, r0)
            r2.A08 = r0
            r1 = 64
            r0 = 65
            if (r3 == r1) goto L_0x015d
            if (r3 != r0) goto L_0x0137
            r4 = 1
        L_0x015d:
            r2.A02 = r12
            X.4eH r0 = r2.A0A
            byte[] r1 = r0.A02
            r0 = -84
            r1[r14] = r0
            r0 = 64
            if (r4 == 0) goto L_0x016d
            r0 = 65
        L_0x016d:
            byte r0 = (byte) r0
            r1[r12] = r0
            r2.A00 = r5
            goto L_0x0007
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96914p6.A6b(X.4eH):void");
    }

    public void A7e(C15060qG r2, AnonymousClass4WV r3) {
        r3.A03();
        this.A07 = r3.A02();
        this.A06 = AnonymousClass4WV.A00(r2, r3);
    }

    public void Aa7() {
    }

    public void Aa8(long j2, int i2) {
        this.A04 = j2;
    }

    public void AdB() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
    }
}

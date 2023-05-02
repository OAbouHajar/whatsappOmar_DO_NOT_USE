package X;

/* renamed from: X.4p7  reason: invalid class name and case insensitive filesystem */
public final class C96924p7 implements C109595St {
    public int A00;
    public int A01;
    public int A02 = 0;
    public long A03;
    public long A04;
    public C32481gS A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass4S0 A09;
    public final C90504eH A0A;
    public final String A0B;

    public C96924p7(String str) {
        C90504eH A052 = C90504eH.A05(4);
        this.A0A = A052;
        A052.A02[0] = -1;
        this.A09 = new AnonymousClass4S0();
        this.A0B = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d2, code lost:
        if ((r7[r8] & 224) != 224) goto L_0x00d4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A6b(X.C90504eH r18) {
        /*
            r17 = this;
            r3 = r17
            X.1gS r0 = r3.A05
            X.C90524eJ.A01(r0)
        L_0x0007:
            r9 = r18
            int r10 = r9.A00
            int r8 = r9.A01
            int r2 = r10 - r8
            if (r2 <= 0) goto L_0x00f6
            int r0 = r3.A02
            if (r0 == 0) goto L_0x00b7
            r12 = 1
            if (r0 == r12) goto L_0x0043
            int r1 = r3.A01
            int r0 = r3.A00
            int r1 = X.AnonymousClass3K4.A06(r1, r0, r2)
            X.1gS r0 = r3.A05
            r0.Acw(r9, r1)
            int r0 = r3.A00
            int r0 = r0 + r1
            r3.A00 = r0
            int r13 = r3.A01
            if (r0 < r13) goto L_0x0007
            X.1gS r10 = r3.A05
            long r15 = r3.A04
            r14 = 0
            r11 = 0
            r10.Ad0(r11, r12, r13, r14, r15)
            long r4 = r3.A04
            long r0 = r3.A03
            long r4 = r4 + r0
            r3.A04 = r4
            r3.A00 = r14
            r3.A02 = r14
            goto L_0x0007
        L_0x0043:
            int r5 = r3.A00
            r4 = 4
            int r0 = 4 - r5
            int r1 = java.lang.Math.min(r2, r0)
            X.4eH r2 = r3.A0A
            byte[] r0 = r2.A02
            r9.A0V(r0, r5, r1)
            int r0 = r3.A00
            int r0 = r0 + r1
            r3.A00 = r0
            if (r0 < r4) goto L_0x0007
            r7 = 0
            r2.A0S(r7)
            X.4S0 r9 = r3.A09
            int r0 = r2.A07()
            boolean r0 = r9.A00(r0)
            if (r0 != 0) goto L_0x006f
            r3.A00 = r7
            r3.A02 = r12
            goto L_0x0007
        L_0x006f:
            int r0 = r9.A02
            r3.A01 = r0
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x00aa
            r10 = 1000000(0xf4240, double:4.940656E-318)
            int r0 = r9.A04
            long r5 = (long) r0
            long r5 = r5 * r10
            int r8 = r9.A03
            long r0 = (long) r8
            long r5 = r5 / r0
            r3.A03 = r5
            X.1gR r5 = X.AnonymousClass3K4.A0N()
            java.lang.String r0 = r3.A06
            r5.A0O = r0
            java.lang.String r0 = r9.A06
            r5.A0R = r0
            r0 = 4096(0x1000, float:5.74E-42)
            r5.A08 = r0
            int r0 = r9.A01
            r5.A04 = r0
            r5.A0D = r8
            java.lang.String r0 = r3.A0B
            r5.A0Q = r0
            X.1gT r1 = new X.1gT
            r1.<init>((X.C32471gR) r5)
            X.1gS r0 = r3.A05
            r0.A9D(r1)
            r3.A07 = r12
        L_0x00aa:
            r2.A0S(r7)
            X.1gS r0 = r3.A05
            r0.Acw(r2, r4)
            r0 = 2
            r3.A02 = r0
            goto L_0x0007
        L_0x00b7:
            byte[] r7 = r9.A02
        L_0x00b9:
            if (r8 >= r10) goto L_0x00f1
            byte r1 = r7[r8]
            r0 = 255(0xff, float:3.57E-43)
            r1 = r1 & r0
            r6 = 0
            r5 = 1
            boolean r4 = X.AnonymousClass000.A1R(r1, r0)
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x00d4
            byte r2 = r7[r8]
            r0 = 224(0xe0, float:3.14E-43)
            r2 = r2 & r0
            r1 = 224(0xe0, float:3.14E-43)
            r0 = 1
            if (r2 == r1) goto L_0x00d5
        L_0x00d4:
            r0 = 0
        L_0x00d5:
            r3.A08 = r4
            if (r0 == 0) goto L_0x00ee
            int r0 = r8 + 1
            r9.A0S(r0)
            r3.A08 = r6
            X.4eH r0 = r3.A0A
            byte[] r0 = r0.A02
            X.AnonymousClass3K4.A16(r7, r0, r8, r5)
            r0 = 2
            r3.A00 = r0
            r3.A02 = r5
            goto L_0x0007
        L_0x00ee:
            int r8 = r8 + 1
            goto L_0x00b9
        L_0x00f1:
            r9.A0S(r10)
            goto L_0x0007
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96924p7.A6b(X.4eH):void");
    }

    public void A7e(C15060qG r2, AnonymousClass4WV r3) {
        r3.A03();
        this.A06 = r3.A02();
        this.A05 = AnonymousClass4WV.A00(r2, r3);
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

package X;

/* renamed from: X.4pI  reason: invalid class name and case insensitive filesystem */
public final class C97034pI implements AnonymousClass5SN {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass5RA A04;
    public final C90504eH A05 = C90504eH.A05(32);

    public C97034pI(AnonymousClass5RA r2) {
        this.A04 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009f, code lost:
        if (r10.A02 == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a1, code lost:
        r5 = r6.A02;
        r4 = 0;
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        if (r4 >= r9) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a7, code lost:
        r0 = X.AnonymousClass3C1.A0B[((r0 >>> 24) ^ (r5[r4] & 255)) & 255] ^ (r0 << 8);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ba, code lost:
        if (r0 != 0) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bc, code lost:
        r6.A0R(r9 - 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c2, code lost:
        r6.A0R(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c5, code lost:
        r6.A0S(0);
        r10.A04.A6b(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A6c(X.C90504eH r11, int r12) {
        /*
            r10 = this;
            r7 = 1
            r0 = r12 & 1
            r8 = 0
            if (r0 == 0) goto L_0x00cf
            r2 = 1
            int r0 = r11.A0C()
            int r1 = r11.A01
            int r1 = r1 + r0
        L_0x000e:
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x001b
            if (r2 == 0) goto L_0x0038
            r10.A03 = r8
            r11.A0S(r1)
        L_0x0019:
            r10.A00 = r8
        L_0x001b:
            int r1 = X.C90504eH.A00(r11)
            if (r1 <= 0) goto L_0x0038
            int r2 = r10.A00
            r4 = 3
            if (r2 >= r4) goto L_0x0087
            if (r2 != 0) goto L_0x0039
            int r1 = r11.A0C()
            int r0 = r11.A01
            int r0 = r0 - r7
            r11.A0S(r0)
            r0 = 255(0xff, float:3.57E-43)
            if (r1 != r0) goto L_0x0039
        L_0x0036:
            r10.A03 = r7
        L_0x0038:
            return
        L_0x0039:
            int r1 = X.C90504eH.A00(r11)
            int r2 = r10.A00
            int r0 = 3 - r2
            int r1 = java.lang.Math.min(r1, r0)
            X.4eH r3 = r10.A05
            byte[] r0 = r3.A02
            r11.A0V(r0, r2, r1)
            int r0 = r10.A00
            int r0 = r0 + r1
            r10.A00 = r0
            if (r0 != r4) goto L_0x001b
            r3.A0S(r8)
            r3.A0R(r4)
            int r2 = X.C90504eH.A01(r3, r7)
            int r1 = r3.A0C()
            r0 = r2 & 128(0x80, float:1.794E-43)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r10.A02 = r0
            r0 = r2 & 15
            int r0 = r0 << 8
            r0 = r0 | r1
            int r2 = r0 + 3
            r10.A01 = r2
            byte[] r0 = r3.A02
            int r0 = r0.length
            if (r0 >= r2) goto L_0x001b
            r1 = 4098(0x1002, float:5.743E-42)
            int r0 = r0 << 1
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = java.lang.Math.min(r1, r0)
            r3.A0P(r0)
            goto L_0x001b
        L_0x0087:
            int r0 = r10.A01
            int r1 = X.AnonymousClass3K4.A06(r0, r2, r1)
            X.4eH r6 = r10.A05
            byte[] r0 = r6.A02
            r11.A0V(r0, r2, r1)
            int r0 = r10.A00
            int r0 = r0 + r1
            r10.A00 = r0
            int r9 = r10.A01
            if (r0 != r9) goto L_0x001b
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x00c2
            byte[] r5 = r6.A02
            r4 = 0
            r0 = -1
        L_0x00a5:
            if (r4 >= r9) goto L_0x00ba
            int r3 = r0 << 8
            int[] r2 = X.AnonymousClass3C1.A0B
            int r1 = r0 >>> 24
            byte r0 = r5[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 ^ r0
            r0 = r1 & 255(0xff, float:3.57E-43)
            r0 = r2[r0]
            r0 = r0 ^ r3
            int r4 = r4 + 1
            goto L_0x00a5
        L_0x00ba:
            if (r0 != 0) goto L_0x0036
            int r0 = r9 + -4
            r6.A0R(r0)
            goto L_0x00c5
        L_0x00c2:
            r6.A0R(r9)
        L_0x00c5:
            r6.A0S(r8)
            X.5RA r0 = r10.A04
            r0.A6b(r6)
            goto L_0x0019
        L_0x00cf:
            r2 = 0
            r1 = -1
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97034pI.A6c(X.4eH, int):void");
    }

    public void AI2(C15060qG r2, AnonymousClass4WV r3, AnonymousClass4X5 r4) {
        this.A04.AI2(r2, r3, r4);
        this.A03 = true;
    }

    public void AdB() {
        this.A03 = true;
    }
}

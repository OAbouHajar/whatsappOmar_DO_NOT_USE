package X;

/* renamed from: X.4pA  reason: invalid class name and case insensitive filesystem */
public final class C96954pA implements C109595St {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public C32491gT A0C;
    public C32481gS A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public final C90204dh A0I;
    public final C90504eH A0J;
    public final String A0K;

    public C96954pA(String str) {
        this.A0K = str;
        C90504eH A052 = C90504eH.A05(1024);
        this.A0J = A052;
        byte[] bArr = A052.A02;
        this.A0I = new C90204dh(bArr, bArr.length);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013d, code lost:
        if (r13.A0H == false) goto L_0x01ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A6b(X.C90504eH r14) {
        /*
            r13 = this;
            X.1gS r0 = r13.A0D
            X.C90524eJ.A01(r0)
        L_0x0005:
            int r2 = X.C90504eH.A00(r14)
            if (r2 <= 0) goto L_0x0235
            int r0 = r13.A08
            r3 = 86
            r1 = 1
            if (r0 == 0) goto L_0x0207
            r5 = 2
            r10 = 0
            if (r0 == r1) goto L_0x016b
            r3 = 3
            if (r0 == r5) goto L_0x0141
            int r0 = r13.A06
            int r1 = r13.A01
            int r3 = X.AnonymousClass3K4.A06(r0, r1, r2)
            X.4dh r2 = r13.A0I
            byte[] r0 = r2.A03
            r14.A0V(r0, r1, r3)
            int r1 = r13.A01
            int r1 = r1 + r3
            r13.A01 = r1
            int r0 = r13.A06
            if (r1 != r0) goto L_0x0005
            r2.A07(r10)
            boolean r0 = r2.A0C()
            if (r0 != 0) goto L_0x013b
            r8 = 1
            r13.A0H = r8
            int r7 = r2.A04(r8)
            if (r7 != r8) goto L_0x0138
            int r0 = r2.A04(r8)
        L_0x0047:
            r13.A00 = r0
            if (r0 != 0) goto L_0x021d
            if (r7 != r8) goto L_0x0058
            int r0 = r2.A04(r5)
            int r0 = r0 + 1
            int r0 = r0 << 3
            r2.A04(r0)
        L_0x0058:
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x0217
            r0 = 6
            int r0 = r2.A04(r0)
            r13.A04 = r0
            r0 = 4
            int r1 = r2.A04(r0)
            r0 = 3
            int r0 = r2.A04(r0)
            if (r1 != 0) goto L_0x0211
            if (r0 != 0) goto L_0x0211
            r6 = 8
            if (r7 != 0) goto L_0x010c
            int r0 = r2.A02
            int r3 = r0 << 3
            int r0 = r2.A00
            int r3 = r3 + r0
            int r4 = X.C90204dh.A00(r2)
            X.4JS r1 = X.C89734co.A01(r2, r8)
            java.lang.String r0 = r1.A02
            r13.A0E = r0
            int r0 = r1.A01
            r13.A05 = r0
            int r0 = r1.A00
            r13.A02 = r0
            int r0 = X.C90204dh.A00(r2)
            int r4 = r4 - r0
            r2.A07(r3)
            int r0 = r4 + 7
            int r0 = r0 / r6
            byte[] r3 = new byte[r0]
            r2.A0A(r3, r4)
            X.1gR r1 = X.AnonymousClass3K4.A0N()
            java.lang.String r0 = r13.A0F
            r1.A0O = r0
            java.lang.String r0 = "audio/mp4a-latm"
            r1.A0R = r0
            java.lang.String r0 = r13.A0E
            r1.A0M = r0
            int r0 = r13.A02
            r1.A04 = r0
            int r0 = r13.A05
            r1.A0D = r0
            java.util.List r0 = java.util.Collections.singletonList(r3)
            r1.A0S = r0
            java.lang.String r0 = r13.A0K
            r1.A0Q = r0
            X.1gT r9 = new X.1gT
            r9.<init>((X.C32471gR) r1)
            X.1gT r0 = r13.A0C
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00e1
            r13.A0C = r9
            r3 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r0 = r9.A0F
            long r0 = (long) r0
            long r3 = r3 / r0
            r13.A0A = r3
            X.1gS r0 = r13.A0D
            r0.A9D(r9)
        L_0x00e1:
            r0 = 3
            int r3 = r2.A04(r0)
            r13.A03 = r3
            if (r3 == 0) goto L_0x0103
            if (r3 == r8) goto L_0x0106
            r1 = 6
            if (r3 == r0) goto L_0x017e
            r0 = 4
            if (r3 == r0) goto L_0x017e
            r0 = 5
            if (r3 == r0) goto L_0x017e
            if (r3 == r1) goto L_0x00ff
            r0 = 7
            if (r3 == r0) goto L_0x00ff
            java.lang.IllegalStateException r0 = X.AnonymousClass3K4.A0V()
            throw r0
        L_0x00ff:
            r2.A08(r8)
            goto L_0x0181
        L_0x0103:
            r0 = 8
            goto L_0x0108
        L_0x0106:
            r0 = 9
        L_0x0108:
            r2.A08(r0)
            goto L_0x0181
        L_0x010c:
            int r0 = r2.A04(r5)
            int r0 = r0 + 1
            int r0 = r0 << 3
            int r0 = r2.A04(r0)
            long r0 = (long) r0
            int r3 = (int) r0
            int r4 = X.C90204dh.A00(r2)
            X.4JS r1 = X.C89734co.A01(r2, r8)
            java.lang.String r0 = r1.A02
            r13.A0E = r0
            int r0 = r1.A01
            r13.A05 = r0
            int r0 = r1.A00
            r13.A02 = r0
            int r0 = X.C90204dh.A00(r2)
            int r4 = r4 - r0
            int r3 = r3 - r4
            r2.A08(r3)
            goto L_0x00e1
        L_0x0138:
            r0 = 0
            goto L_0x0047
        L_0x013b:
            boolean r0 = r13.A0H
            if (r0 != 0) goto L_0x01a1
            goto L_0x01ea
        L_0x0141:
            int r0 = r13.A07
            r0 = r0 & -225(0xffffffffffffff1f, float:NaN)
            int r2 = r0 << 8
            int r0 = r14.A0C()
            r2 = r2 | r0
            r13.A06 = r2
            X.4eH r1 = r13.A0J
            byte[] r0 = r1.A02
            int r0 = r0.length
            if (r2 <= r0) goto L_0x0165
            r1.A0Q(r2)
            X.4dh r2 = r13.A0I
            byte[] r1 = r1.A02
            int r0 = r1.length
            r2.A03 = r1
            r2.A02 = r10
            r2.A00 = r10
            r2.A01 = r0
        L_0x0165:
            r13.A01 = r10
            r13.A08 = r3
            goto L_0x0005
        L_0x016b:
            int r2 = r14.A0C()
            r1 = r2 & 224(0xe0, float:3.14E-43)
            r0 = 224(0xe0, float:3.14E-43)
            if (r1 != r0) goto L_0x017b
            r13.A07 = r2
            r13.A08 = r5
            goto L_0x0005
        L_0x017b:
            if (r2 == r3) goto L_0x0005
            goto L_0x01ea
        L_0x017e:
            r2.A08(r1)
        L_0x0181:
            boolean r0 = r2.A0C()
            r13.A0G = r0
            r3 = 0
            r13.A09 = r3
            if (r0 == 0) goto L_0x019e
            if (r7 != r8) goto L_0x01f7
            int r0 = r2.A04(r5)
            int r0 = r0 + 1
            int r0 = r0 << 3
            int r0 = r2.A04(r0)
            long r0 = (long) r0
            r13.A09 = r0
        L_0x019e:
            X.C90204dh.A03(r2, r6)
        L_0x01a1:
            int r0 = r13.A00
            if (r0 != 0) goto L_0x022f
            int r0 = r13.A04
            if (r0 != 0) goto L_0x0229
            int r0 = r13.A03
            if (r0 != 0) goto L_0x0223
            r9 = 0
        L_0x01ae:
            r0 = 8
            int r1 = r2.A04(r0)
            int r9 = r9 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L_0x01ae
            int r0 = r2.A02
            int r1 = r0 << 3
            int r0 = r2.A00
            int r1 = r1 + r0
            r0 = r1 & 7
            X.4eH r4 = r13.A0J
            if (r0 != 0) goto L_0x01ee
            int r3 = r1 >> 3
        L_0x01c8:
            r4.A0S(r3)
            X.1gS r0 = r13.A0D
            r0.Acw(r4, r9)
            X.1gS r6 = r13.A0D
            long r11 = r13.A0B
            r8 = 1
            r7 = 0
            r6.Ad0(r7, r8, r9, r10, r11)
            long r3 = r13.A0B
            long r0 = r13.A0A
            long r3 = r3 + r0
            r13.A0B = r3
            boolean r0 = r13.A0G
            if (r0 == 0) goto L_0x01ea
            long r3 = r13.A09
            int r0 = (int) r3
            r2.A08(r0)
        L_0x01ea:
            r13.A08 = r10
            goto L_0x0005
        L_0x01ee:
            byte[] r1 = r4.A02
            int r0 = r9 << 3
            r3 = 0
            r2.A0A(r1, r0)
            goto L_0x01c8
        L_0x01f7:
            boolean r5 = r2.A0C()
            long r3 = r3 << r6
            int r0 = r2.A04(r6)
            long r0 = (long) r0
            long r3 = r3 + r0
            r13.A09 = r3
            if (r5 != 0) goto L_0x01f7
            goto L_0x019e
        L_0x0207:
            int r0 = r14.A0C()
            if (r0 != r3) goto L_0x0005
            r13.A08 = r1
            goto L_0x0005
        L_0x0211:
            X.40M r0 = new X.40M
            r0.<init>()
            throw r0
        L_0x0217:
            X.40M r0 = new X.40M
            r0.<init>()
            throw r0
        L_0x021d:
            X.40M r0 = new X.40M
            r0.<init>()
            throw r0
        L_0x0223:
            X.40M r0 = new X.40M
            r0.<init>()
            throw r0
        L_0x0229:
            X.40M r0 = new X.40M
            r0.<init>()
            throw r0
        L_0x022f:
            X.40M r0 = new X.40M
            r0.<init>()
            throw r0
        L_0x0235:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96954pA.A6b(X.4eH):void");
    }

    public void A7e(C15060qG r2, AnonymousClass4WV r3) {
        r3.A03();
        this.A0D = AnonymousClass4WV.A00(r2, r3);
        this.A0F = r3.A02();
    }

    public void Aa7() {
    }

    public void Aa8(long j2, int i2) {
        this.A0B = j2;
    }

    public void AdB() {
        this.A08 = 0;
        this.A0H = false;
    }
}

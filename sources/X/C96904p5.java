package X;

/* renamed from: X.4p5  reason: invalid class name and case insensitive filesystem */
public final class C96904p5 implements C109595St {
    public int A00;
    public int A01;
    public int A02 = 0;
    public long A03;
    public long A04;
    public C32491gT A05;
    public C32481gS A06;
    public String A07;
    public boolean A08;
    public final C90204dh A09;
    public final C90504eH A0A;
    public final String A0B;

    public C96904p5(String str) {
        C90204dh r0 = new C90204dh(new byte[128], 128);
        this.A09 = r0;
        this.A0A = new C90504eH(r0.A03);
        this.A0B = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A6b(X.C90504eH r23) {
        /*
            r22 = this;
            r1 = r22
            X.1gS r0 = r1.A06
            X.C90524eJ.A01(r0)
        L_0x0007:
            r8 = r23
            int r9 = r8.A00
            int r0 = r8.A01
            int r6 = r9 - r0
            if (r6 <= 0) goto L_0x02d0
            int r0 = r1.A02
            r2 = 0
            r4 = 2
            r7 = 1
            if (r0 == 0) goto L_0x02a3
            if (r0 == r7) goto L_0x0044
            int r3 = r1.A01
            int r0 = r1.A00
            int r3 = X.AnonymousClass3K4.A06(r3, r0, r6)
            X.1gS r0 = r1.A06
            r0.Acw(r8, r3)
            int r0 = r1.A00
            int r0 = r0 + r3
            r1.A00 = r0
            int r6 = r1.A01
            if (r0 != r6) goto L_0x0007
            X.1gS r3 = r1.A06
            long r8 = r1.A04
            r4 = 0
            r5 = 1
            r7 = 0
            r3.Ad0(r4, r5, r6, r7, r8)
            long r5 = r1.A04
            long r3 = r1.A03
            long r5 = r5 + r3
            r1.A04 = r5
            r1.A02 = r2
            goto L_0x0007
        L_0x0044:
            X.4eH r0 = r1.A0A
            r21 = r0
            byte[] r5 = r0.A02
            int r3 = r1.A00
            r0 = 128(0x80, float:1.794E-43)
            int r0 = X.AnonymousClass3K4.A06(r0, r3, r6)
            r8.A0V(r5, r3, r0)
            int r3 = r1.A00
            int r3 = r3 + r0
            r1.A00 = r3
            r0 = 128(0x80, float:1.794E-43)
            if (r3 != r0) goto L_0x0007
            X.4dh r8 = r1.A09
            r8.A07(r2)
            int r0 = r8.A02
            int r3 = r0 << 3
            int r0 = r8.A00
            int r3 = r3 + r0
            r0 = 40
            r8.A08(r0)
            r14 = 5
            int r0 = r8.A04(r14)
            r13 = 10
            r9 = 1
            boolean r0 = X.C13700nu.A0g(r0, r13)
            r8.A07(r3)
            r12 = -1
            r10 = 8
            r5 = 3
            if (r0 == 0) goto L_0x025e
            r11 = 16
            int r0 = X.C90204dh.A01(r8, r11, r4)
            if (r0 == 0) goto L_0x025b
            if (r0 == r7) goto L_0x0258
            if (r0 != r4) goto L_0x0091
            r12 = 2
        L_0x0091:
            r8.A08(r5)
            r0 = 11
            int r0 = r8.A04(r0)
            int r0 = r0 + 1
            int r20 = r0 << 1
            int r7 = r8.A04(r4)
            if (r7 != r5) goto L_0x024a
            int[] r3 = X.AnonymousClass4ZE.A04
            int r0 = r8.A04(r4)
            r6 = r3[r0]
            r3 = 3
            r15 = 6
        L_0x00ae:
            int r19 = r15 << 8
            int r0 = r8.A04(r5)
            boolean r18 = r8.A0C()
            int[] r16 = X.AnonymousClass4ZE.A02
            r17 = r16[r0]
            int r17 = r17 + r18
            r8.A08(r13)
            X.C90204dh.A03(r8, r10)
            if (r0 != 0) goto L_0x00cc
            r8.A08(r14)
            X.C90204dh.A03(r8, r10)
        L_0x00cc:
            if (r12 != r9) goto L_0x00d1
            X.C90204dh.A03(r8, r11)
        L_0x00d1:
            boolean r13 = r8.A0C()
            r11 = 4
            if (r13 == 0) goto L_0x012c
            if (r0 <= r4) goto L_0x00dd
            r8.A08(r4)
        L_0x00dd:
            r13 = r0 & 1
            if (r13 == 0) goto L_0x0247
            if (r0 <= r4) goto L_0x0247
            r13 = 6
            r8.A08(r13)
        L_0x00e7:
            r16 = r0 & 4
            if (r16 == 0) goto L_0x00ee
            r8.A08(r13)
        L_0x00ee:
            if (r18 == 0) goto L_0x00f3
            X.C90204dh.A03(r8, r14)
        L_0x00f3:
            if (r12 != 0) goto L_0x012c
            boolean r16 = r8.A0C()
            if (r16 == 0) goto L_0x00fe
            r8.A08(r13)
        L_0x00fe:
            if (r0 != 0) goto L_0x0103
            X.C90204dh.A03(r8, r13)
        L_0x0103:
            X.C90204dh.A03(r8, r13)
            int r13 = r8.A04(r4)
            if (r13 != r9) goto L_0x01e0
            r8.A08(r14)
        L_0x010f:
            if (r0 >= r4) goto L_0x0121
            boolean r13 = r8.A0C()
            r9 = 14
            if (r13 == 0) goto L_0x011c
            r8.A08(r9)
        L_0x011c:
            if (r0 != 0) goto L_0x0121
            X.C90204dh.A03(r8, r9)
        L_0x0121:
            boolean r9 = r8.A0C()
            if (r9 == 0) goto L_0x012c
            if (r3 != 0) goto L_0x01d7
            r8.A08(r14)
        L_0x012c:
            boolean r9 = r8.A0C()
            if (r9 == 0) goto L_0x0147
            r8.A08(r14)
            if (r0 != r4) goto L_0x01cf
            r8.A08(r11)
        L_0x013a:
            X.C90204dh.A03(r8, r10)
            if (r0 != 0) goto L_0x0142
            X.C90204dh.A03(r8, r10)
        L_0x0142:
            if (r7 >= r5) goto L_0x0147
            r8.A05()
        L_0x0147:
            if (r12 != 0) goto L_0x01c0
            if (r3 == r5) goto L_0x014e
            r8.A05()
        L_0x014e:
            r3 = 6
        L_0x014f:
            boolean r0 = r8.A0C()
            if (r0 == 0) goto L_0x01bd
            int r0 = r8.A04(r3)
            r3 = 1
            if (r0 != r3) goto L_0x01bd
            int r0 = r8.A04(r10)
            if (r0 != r3) goto L_0x01bd
            java.lang.String r7 = "audio/eac3-joc"
        L_0x0164:
            X.1gT r5 = r1.A05
            if (r5 == 0) goto L_0x017a
            int r3 = r5.A06
            r0 = r17
            if (r0 != r3) goto L_0x017a
            int r0 = r5.A0F
            if (r6 != r0) goto L_0x017a
            java.lang.String r0 = r5.A0T
            boolean r0 = X.AnonymousClass3C1.A0F(r7, r0)
            if (r0 != 0) goto L_0x019a
        L_0x017a:
            X.1gR r5 = X.AnonymousClass3K4.A0N()
            java.lang.String r0 = r1.A07
            r5.A0O = r0
            r5.A0R = r7
            r0 = r17
            r5.A04 = r0
            r5.A0D = r6
            java.lang.String r0 = r1.A0B
            r5.A0Q = r0
            X.1gT r3 = new X.1gT
            r3.<init>((X.C32471gR) r5)
            r1.A05 = r3
            X.1gS r0 = r1.A06
            r0.A9D(r3)
        L_0x019a:
            r0 = r20
            r1.A01 = r0
            r5 = 1000000(0xf4240, double:4.940656E-318)
            r0 = r19
            long r7 = (long) r0
            long r7 = r7 * r5
            X.1gT r0 = r1.A05
            int r0 = r0.A0F
            long r5 = (long) r0
            long r7 = r7 / r5
            r1.A03 = r7
            r0 = r21
            r0.A0S(r2)
            X.1gS r3 = r1.A06
            r2 = 128(0x80, float:1.794E-43)
            r3.Acw(r0, r2)
            r1.A02 = r4
            goto L_0x0007
        L_0x01bd:
            java.lang.String r7 = "audio/eac3"
            goto L_0x0164
        L_0x01c0:
            if (r12 != r4) goto L_0x014e
            if (r3 == r5) goto L_0x01ca
            boolean r0 = r8.A0C()
            if (r0 == 0) goto L_0x014e
        L_0x01ca:
            r3 = 6
            r8.A08(r3)
            goto L_0x014f
        L_0x01cf:
            r9 = 6
            if (r0 < r9) goto L_0x013a
            r8.A08(r4)
            goto L_0x013a
        L_0x01d7:
            r9 = 0
        L_0x01d8:
            if (r9 >= r15) goto L_0x012c
            X.C90204dh.A03(r8, r14)
            int r9 = r9 + 1
            goto L_0x01d8
        L_0x01e0:
            if (r13 != r4) goto L_0x01e9
            r9 = 12
            r8.A08(r9)
            goto L_0x010f
        L_0x01e9:
            if (r13 != r5) goto L_0x010f
            int r13 = r8.A04(r14)
            boolean r9 = r8.A0C()
            if (r9 == 0) goto L_0x0219
            r8.A08(r14)
            X.C90204dh.A03(r8, r11)
            X.C90204dh.A03(r8, r11)
            X.C90204dh.A03(r8, r11)
            X.C90204dh.A03(r8, r11)
            X.C90204dh.A03(r8, r11)
            X.C90204dh.A03(r8, r11)
            X.C90204dh.A03(r8, r11)
            boolean r9 = r8.A0C()
            if (r9 == 0) goto L_0x0219
            X.C90204dh.A03(r8, r11)
            X.C90204dh.A03(r8, r11)
        L_0x0219:
            boolean r9 = r8.A0C()
            if (r9 == 0) goto L_0x022f
            r8.A08(r14)
            boolean r9 = r8.A0C()
            if (r9 == 0) goto L_0x022f
            r9 = 7
            r8.A08(r9)
            X.C90204dh.A03(r8, r10)
        L_0x022f:
            int r9 = r13 + 2
            int r9 = r9 << 3
            r8.A08(r9)
            int r9 = r8.A00
            if (r9 == 0) goto L_0x010f
            r8.A00 = r2
            int r9 = r8.A02
            int r9 = r9 + 1
            r8.A02 = r9
            r8.A06()
            goto L_0x010f
        L_0x0247:
            r13 = 6
            goto L_0x00e7
        L_0x024a:
            int r3 = r8.A04(r4)
            int[] r0 = X.AnonymousClass4ZE.A01
            r15 = r0[r3]
            int[] r0 = X.AnonymousClass4ZE.A03
            r6 = r0[r7]
            goto L_0x00ae
        L_0x0258:
            r12 = 1
            goto L_0x0091
        L_0x025b:
            r12 = 0
            goto L_0x0091
        L_0x025e:
            r0 = 32
            int r6 = X.C90204dh.A01(r8, r0, r4)
            if (r6 != r5) goto L_0x02a0
            r7 = 0
        L_0x0267:
            r0 = 6
            int r0 = r8.A04(r0)
            int r20 = X.AnonymousClass4ZE.A00(r6, r0)
            int r5 = X.C90204dh.A01(r8, r10, r5)
            r0 = r5 & 1
            if (r0 == 0) goto L_0x027d
            if (r5 == r9) goto L_0x0289
            r8.A08(r4)
        L_0x027d:
            r0 = r5 & 4
            if (r0 == 0) goto L_0x0284
            r8.A08(r4)
        L_0x0284:
            if (r5 != r4) goto L_0x0289
            r8.A08(r4)
        L_0x0289:
            int[] r3 = X.AnonymousClass4ZE.A03
            int r0 = r3.length
            if (r6 >= r0) goto L_0x029e
            r6 = r3[r6]
        L_0x0290:
            boolean r3 = r8.A0C()
            int[] r0 = X.AnonymousClass4ZE.A02
            r17 = r0[r5]
            int r17 = r17 + r3
            r19 = 1536(0x600, float:2.152E-42)
            goto L_0x0164
        L_0x029e:
            r6 = -1
            goto L_0x0290
        L_0x02a0:
            java.lang.String r7 = "audio/ac3"
            goto L_0x0267
        L_0x02a3:
            int r0 = r8.A01
            int r0 = r9 - r0
            r6 = 0
            if (r0 <= 0) goto L_0x0007
            boolean r0 = r1.A08
            r5 = 11
            int r3 = r8.A0C()
            if (r0 == 0) goto L_0x02ca
            r0 = 119(0x77, float:1.67E-43)
            if (r3 != r0) goto L_0x02ca
            r1.A08 = r2
            r1.A02 = r7
            X.4eH r0 = r1.A0A
            byte[] r3 = r0.A02
            r3[r2] = r5
            r0 = 119(0x77, float:1.67E-43)
            r3[r7] = r0
            r1.A00 = r4
            goto L_0x0007
        L_0x02ca:
            if (r3 != r5) goto L_0x02cd
            r6 = 1
        L_0x02cd:
            r1.A08 = r6
            goto L_0x02a3
        L_0x02d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96904p5.A6b(X.4eH):void");
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

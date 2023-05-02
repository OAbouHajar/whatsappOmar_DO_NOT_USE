package X;

/* renamed from: X.4oW  reason: invalid class name and case insensitive filesystem */
public final class C96554oW implements C55132it {
    public int A00;
    public int A01 = 1;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public C15060qG A06;
    public C65393Up A07;
    public C65383Uo A08;
    public boolean A09;
    public boolean A0A;
    public final C65403Uq A0B = new C65403Uq();
    public final C90504eH A0C = C90504eH.A05(9);
    public final C90504eH A0D = C90504eH.A05(4);
    public final C90504eH A0E = new C90504eH();
    public final C90504eH A0F = C90504eH.A05(11);

    public final C90504eH A00(C55142iu r5) {
        int i2 = this.A02;
        C90504eH r3 = this.A0E;
        int length = r3.A02.length;
        if (i2 > length) {
            r3.A0U(new byte[Math.max(length << 1, i2)], 0);
        } else {
            r3.A0S(0);
        }
        r3.A0R(this.A02);
        r5.readFully(r3.A02, 0, this.A02);
        return r3;
    }

    public void AHx(C15060qG r1) {
        this.A06 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0200, code lost:
        if (r7 != 1) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x00d6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0007 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int AbN(X.C55142iu r24, X.AnonymousClass4Bt r25) {
        /*
            r23 = this;
            r4 = r23
            X.0qG r0 = r4.A06
            X.C90524eJ.A01(r0)
        L_0x0007:
            int r1 = r4.A01
            r3 = 1
            r9 = -1
            r10 = r24
            if (r1 == r3) goto L_0x0338
            r0 = 2
            if (r1 == r0) goto L_0x032b
            r7 = 3
            if (r1 == r7) goto L_0x02f5
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x02e0
            long r14 = r4.A04
            long r0 = r4.A05
            long r14 = r14 + r0
        L_0x001e:
            int r5 = r4.A03
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
            r2 = 8
            if (r5 != r2) goto L_0x010a
            X.3Up r2 = r4.A07
            if (r2 == 0) goto L_0x02d8
            boolean r2 = r4.A0A
            if (r2 != 0) goto L_0x0039
            X.0qG r2 = r4.A06
            X.AnonymousClass3K2.A15(r2, r0)
            r4.A0A = r3
        L_0x0039:
            X.3Up r6 = r4.A07
            X.4eH r5 = r4.A00(r10)
            boolean r2 = r6.A02
            if (r2 != 0) goto L_0x0105
            int r8 = r5.A0C()
            int r2 = r8 >> 4
            r7 = r2 & 15
            r6.A00 = r7
            r2 = 2
            if (r7 != r2) goto L_0x00db
            int r8 = r8 >> r2
            r7 = r8 & 3
            int[] r2 = X.C65393Up.A03
            r7 = r2[r7]
            X.1gR r8 = X.AnonymousClass3K4.A0N()
            java.lang.String r2 = "audio/mpeg"
            r8.A0R = r2
            r8.A04 = r3
            r8.A0D = r7
        L_0x0063:
            X.1gT r7 = new X.1gT
            r7.<init>((X.C32471gR) r8)
            X.1gS r2 = r6.A00
            r2.A9D(r7)
            r6.A01 = r3
        L_0x006f:
            r6.A02 = r3
        L_0x0071:
            int r8 = r6.A00
            r2 = 2
            if (r8 == r2) goto L_0x0202
            int r7 = r5.A0C()
            if (r7 != 0) goto L_0x01fc
            boolean r2 = r6.A01
            if (r2 != 0) goto L_0x01fc
            int r7 = X.C90504eH.A00(r5)
            byte[] r8 = new byte[r7]
            r5.A0V(r8, r9, r7)
            X.4dh r2 = new X.4dh
            r2.<init>(r8, r7)
            X.4JS r5 = X.C89734co.A01(r2, r9)
            X.1gR r7 = X.AnonymousClass3K4.A0N()
            java.lang.String r2 = "audio/mp4a-latm"
            r7.A0R = r2
            java.lang.String r2 = r5.A02
            r7.A0M = r2
            int r2 = r5.A00
            r7.A04 = r2
            int r2 = r5.A01
            r7.A0D = r2
            java.util.List r2 = java.util.Collections.singletonList(r8)
            r7.A0S = r2
            X.1gT r5 = new X.1gT
            r5.<init>((X.C32471gR) r7)
            X.1gS r2 = r6.A00
            r2.A9D(r5)
            r6.A01 = r3
        L_0x00b8:
            r7 = 1
        L_0x00b9:
            boolean r2 = r4.A09
            if (r2 != 0) goto L_0x00ce
            if (r9 == 0) goto L_0x00ce
            r4.A09 = r3
            X.3Uq r2 = r4.A0B
            long r5 = r2.A00
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x00d8
            long r2 = r4.A05
            long r0 = -r2
        L_0x00cc:
            r4.A04 = r0
        L_0x00ce:
            r0 = 4
            r4.A00 = r0
            r0 = 2
            r4.A01 = r0
            if (r7 == 0) goto L_0x0007
            r0 = 0
            return r0
        L_0x00d8:
            r0 = 0
            goto L_0x00cc
        L_0x00db:
            r2 = 7
            if (r7 == r2) goto L_0x00f2
            r2 = 8
            if (r7 != r2) goto L_0x00f5
            java.lang.String r2 = "audio/g711-mlaw"
        L_0x00e4:
            X.1gR r8 = X.AnonymousClass3K4.A0N()
            r8.A0R = r2
            r8.A04 = r3
            r2 = 8000(0x1f40, float:1.121E-41)
            r8.A0D = r2
            goto L_0x0063
        L_0x00f2:
            java.lang.String r2 = "audio/g711-alaw"
            goto L_0x00e4
        L_0x00f5:
            r2 = 10
            if (r7 == r2) goto L_0x006f
            java.lang.String r0 = "Audio format not supported: "
            java.lang.String r1 = X.C13680ns.A0c(r7, r0)
            X.3UL r0 = new X.3UL
            r0.<init>(r1)
            throw r0
        L_0x0105:
            r5.A0T(r3)
            goto L_0x0071
        L_0x010a:
            r2 = 9
            if (r5 != r2) goto L_0x0214
            X.3Uo r2 = r4.A08
            if (r2 == 0) goto L_0x02d8
            boolean r2 = r4.A0A
            if (r2 != 0) goto L_0x011d
            X.0qG r2 = r4.A06
            X.AnonymousClass3K2.A15(r2, r0)
            r4.A0A = r3
        L_0x011d:
            X.3Uo r7 = r4.A08
            X.4eH r8 = r4.A00(r10)
            int r5 = r8.A0C()
            int r2 = r5 >> 4
            r13 = r2 & 15
            r5 = r5 & 15
            r2 = 7
            if (r5 != r2) goto L_0x0393
            r7.A00 = r13
            r2 = 5
            if (r13 == r2) goto L_0x00b8
            int r2 = r8.A0C()
            byte[] r11 = r8.A02
            int r5 = r8.A01
            int r10 = r5 + 1
            int r5 = X.C90504eH.A04(r8, r11, r10, r5)
            int r5 = r5 << 24
            int r6 = r5 >> 8
            int r5 = r10 + 1
            r8.A01 = r5
            int r6 = X.AnonymousClass3K3.A0L(r11, r10, r6)
            int r10 = r5 + 1
            int r5 = X.C90504eH.A04(r8, r11, r10, r5)
            r5 = r5 | r6
            long r5 = (long) r5
            r11 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r11
            long r14 = r14 + r5
            if (r2 != 0) goto L_0x01a5
            boolean r2 = r7.A02
            if (r2 != 0) goto L_0x00b8
            int r2 = r8.A00
            int r2 = r2 - r10
            byte[] r2 = new byte[r2]
            X.4eH r6 = new X.4eH
            r6.<init>((byte[]) r2)
            byte[] r5 = r6.A02
            int r2 = r8.A00
            int r2 = r2 - r10
            r8.A0V(r5, r9, r2)
            X.4aE r5 = X.C88274aE.A00(r6)
            int r2 = r5.A02
            r7.A01 = r2
            X.1gR r6 = X.AnonymousClass3K4.A0N()
            java.lang.String r2 = "video/avc"
            r6.A0R = r2
            java.lang.String r2 = r5.A04
            r6.A0M = r2
            int r2 = r5.A03
            r6.A0G = r2
            int r2 = r5.A01
            r6.A07 = r2
            float r2 = r5.A00
            r6.A01 = r2
            java.util.List r2 = r5.A05
            r6.A0S = r2
            X.1gT r5 = new X.1gT
            r5.<init>((X.C32471gR) r6)
            X.1gS r2 = r7.A00
            r2.A9D(r5)
            r7.A02 = r3
            goto L_0x00b8
        L_0x01a5:
            if (r2 != r3) goto L_0x00b8
            boolean r2 = r7.A02
            if (r2 == 0) goto L_0x00b8
            boolean r18 = X.AnonymousClass000.A1R(r13, r3)
            boolean r2 = r7.A03
            if (r2 != 0) goto L_0x01b7
            if (r18 != 0) goto L_0x01b7
            goto L_0x00b8
        L_0x01b7:
            X.4eH r11 = r7.A04
            byte[] r5 = r11.A02
            r5[r9] = r9
            r5[r3] = r9
            r2 = 2
            r5[r2] = r9
            int r2 = r7.A01
            r12 = 4
            int r10 = 4 - r2
            r19 = 0
        L_0x01c9:
            int r2 = X.C90504eH.A00(r8)
            if (r2 <= 0) goto L_0x01ec
            byte[] r5 = r11.A02
            int r2 = r7.A01
            r8.A0V(r5, r10, r2)
            int r6 = X.C90504eH.A02(r11, r9)
            X.4eH r5 = r7.A05
            r5.A0S(r9)
            X.1gS r2 = r7.A00
            r2.Acw(r5, r12)
            int r19 = r19 + 4
            r2.Acw(r8, r6)
            int r19 = r19 + r6
            goto L_0x01c9
        L_0x01ec:
            X.1gS r2 = r7.A00
            r17 = 0
            r20 = 0
            r16 = r2
            r21 = r14
            r16.Ad0(r17, r18, r19, r20, r21)
            r7.A03 = r3
            goto L_0x0211
        L_0x01fc:
            r2 = 10
            if (r8 != r2) goto L_0x0202
            if (r7 != r3) goto L_0x00b8
        L_0x0202:
            int r12 = X.C90504eH.A00(r5)
            X.1gS r9 = r6.A00
            r9.Acw(r5, r12)
            r10 = 0
            r13 = 0
            r11 = 1
            r9.Ad0(r10, r11, r12, r13, r14)
        L_0x0211:
            r9 = 1
            goto L_0x00b8
        L_0x0214:
            r2 = 18
            if (r5 != r2) goto L_0x02d8
            boolean r2 = r4.A0A
            if (r2 != 0) goto L_0x02d8
            X.3Uq r2 = r4.A0B
            X.4eH r7 = r4.A00(r10)
            int r6 = r7.A0C()
            r5 = 2
            if (r6 != r5) goto L_0x02c0
            java.lang.String r6 = X.C65403Uq.A01(r7)
            java.lang.String r5 = "onMetaData"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x02c0
            int r6 = r7.A0C()
            r5 = 8
            if (r6 != r5) goto L_0x02c0
            java.util.HashMap r12 = X.C65403Uq.A02(r7)
            java.lang.String r5 = "duration"
            java.lang.Object r6 = r12.get(r5)
            boolean r5 = r6 instanceof java.lang.Double
            r16 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r5 == 0) goto L_0x025f
            double r7 = X.AnonymousClass3K3.A01(r6)
            r10 = 0
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x025f
            double r7 = r7 * r16
            long r5 = (long) r7
            r2.A00 = r5
        L_0x025f:
            java.lang.String r5 = "keyframes"
            java.lang.Object r6 = r12.get(r5)
            boolean r5 = r6 instanceof java.util.Map
            if (r5 == 0) goto L_0x02c0
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r5 = "filepositions"
            java.lang.Object r13 = r6.get(r5)
            java.lang.String r5 = "times"
            java.lang.Object r12 = r6.get(r5)
            boolean r5 = r13 instanceof java.util.List
            if (r5 == 0) goto L_0x02c0
            boolean r5 = r12 instanceof java.util.List
            if (r5 == 0) goto L_0x02c0
            java.util.List r13 = (java.util.List) r13
            java.util.List r12 = (java.util.List) r12
            int r11 = r12.size()
            long[] r5 = new long[r11]
            r2.A02 = r5
            long[] r5 = new long[r11]
            r2.A01 = r5
            r10 = 0
        L_0x0290:
            if (r10 >= r11) goto L_0x02c0
            java.lang.Object r14 = r13.get(r10)
            java.lang.Object r6 = r12.get(r10)
            boolean r5 = r6 instanceof java.lang.Double
            if (r5 == 0) goto L_0x02b8
            boolean r5 = r14 instanceof java.lang.Double
            if (r5 == 0) goto L_0x02b8
            long[] r15 = r2.A02
            double r7 = X.AnonymousClass3K3.A01(r6)
            double r7 = r7 * r16
            long r5 = (long) r7
            r15[r10] = r5
            long[] r7 = r2.A01
            long r5 = X.C13700nu.A01(r14)
            r7[r10] = r5
            int r10 = r10 + 1
            goto L_0x0290
        L_0x02b8:
            long[] r5 = new long[r9]
            r2.A02 = r5
            long[] r5 = new long[r9]
            r2.A01 = r5
        L_0x02c0:
            long r5 = r2.A00
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x00b8
            X.0qG r10 = r4.A06
            long[] r8 = r2.A01
            long[] r7 = r2.A02
            X.4ol r2 = new X.4ol
            r2.<init>(r8, r7, r5)
            r10.AdD(r2)
            r4.A0A = r3
            goto L_0x00b8
        L_0x02d8:
            int r2 = r4.A02
            r10.Afx(r2)
            r7 = 0
            goto L_0x00b9
        L_0x02e0:
            X.3Uq r0 = r4.A0B
            long r5 = r0.A00
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x02f1
            r14 = 0
            goto L_0x001e
        L_0x02f1:
            long r14 = r4.A05
            goto L_0x001e
        L_0x02f5:
            X.4eH r8 = r4.A0F
            byte[] r3 = r8.A02
            r2 = 0
            r1 = 11
            r0 = 1
            boolean r0 = r10.AbV(r3, r2, r1, r0)
            if (r0 == 0) goto L_0x039f
            r8.A0S(r2)
            int r0 = r8.A0C()
            r4.A03 = r0
            int r0 = r8.A0D()
            r4.A02 = r0
            int r0 = r8.A0D()
            long r5 = (long) r0
            r4.A05 = r5
            int r0 = r8.A0C()
            int r0 = r0 << 24
            long r2 = (long) r0
            long r2 = r2 | r5
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r4.A05 = r2
            r8.A0T(r7)
            r0 = 4
            goto L_0x0334
        L_0x032b:
            int r0 = r4.A00
            r10.Afx(r0)
            r0 = 0
            r4.A00 = r0
            r0 = 3
        L_0x0334:
            r4.A01 = r0
            goto L_0x0007
        L_0x0338:
            X.4eH r6 = r4.A0C
            byte[] r0 = r6.A02
            r7 = 0
            r5 = 9
            boolean r0 = r10.AbV(r0, r7, r5, r3)
            if (r0 == 0) goto L_0x039f
            r6.A0S(r7)
            r0 = 4
            int r2 = X.C90504eH.A01(r6, r0)
            r0 = r2 & 4
            boolean r1 = X.AnonymousClass000.A1O(r0)
            r0 = r2 & 1
            if (r0 == 0) goto L_0x0358
            r7 = 1
        L_0x0358:
            if (r1 == 0) goto L_0x036d
            X.3Up r0 = r4.A07
            if (r0 != 0) goto L_0x036d
            X.0qG r1 = r4.A06
            r0 = 8
            X.1gS r1 = r1.Ah1(r0, r3)
            X.3Up r0 = new X.3Up
            r0.<init>(r1)
            r4.A07 = r0
        L_0x036d:
            r2 = 2
            if (r7 == 0) goto L_0x0381
            X.3Uo r0 = r4.A08
            if (r0 != 0) goto L_0x0381
            X.0qG r0 = r4.A06
            X.1gS r1 = r0.Ah1(r5, r2)
            X.3Uo r0 = new X.3Uo
            r0.<init>(r1)
            r4.A08 = r0
        L_0x0381:
            X.0qG r0 = r4.A06
            r0.A8W()
            int r0 = r6.A07()
            int r0 = r0 - r5
            int r0 = r0 + 4
            r4.A00 = r0
            r4.A01 = r2
            goto L_0x0007
        L_0x0393:
            java.lang.String r0 = "Video format not supported: "
            java.lang.String r1 = X.C13680ns.A0c(r5, r0)
            X.3UL r0 = new X.3UL
            r0.<init>(r1)
            throw r0
        L_0x039f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96554oW.AbN(X.2iu, X.4Bt):int");
    }

    public void AdC(long j2, long j3) {
        if (j2 == 0) {
            this.A01 = 1;
            this.A09 = false;
        } else {
            this.A01 = 3;
        }
        this.A00 = 0;
    }

    public boolean Afz(C55142iu r5) {
        C90504eH r3 = this.A0D;
        r5.AaL(r3.A02, 0, 3);
        r3.A0S(0);
        if (r3.A0D() != 4607062) {
            return false;
        }
        r5.AaL(r3.A02, 0, 2);
        r3.A0S(0);
        if ((r3.A0F() & 250) != 0) {
            return false;
        }
        r5.AaL(r3.A02, 0, 4);
        int A032 = C90504eH.A03(r3, 0);
        r5.AcS();
        r5.A4m(A032);
        C90504eH.A06(r5, r3, 4);
        return C90504eH.A03(r3, 0) == 0;
    }
}

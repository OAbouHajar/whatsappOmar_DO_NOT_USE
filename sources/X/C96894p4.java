package X;

/* renamed from: X.4p4  reason: invalid class name and case insensitive filesystem */
public final class C96894p4 implements C109595St {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public long A04;
    public long A05;
    public C32491gT A06;
    public C32481gS A07;
    public String A08;
    public final C90504eH A09 = new C90504eH(new byte[18]);
    public final String A0A;

    public C96894p4(String str) {
        this.A0A = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0007 A[EDGE_INSN: B:84:0x0007->B:78:0x0007 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A6b(X.C90504eH r23) {
        /*
            r22 = this;
            r8 = r22
            X.1gS r0 = r8.A07
            X.C90524eJ.A01(r0)
        L_0x0007:
            r1 = r23
            int r2 = r1.A00
            int r0 = r1.A01
            int r4 = r2 - r0
            if (r4 <= 0) goto L_0x0277
            int r0 = r8.A02
            r3 = 1
            if (r0 == 0) goto L_0x022e
            r7 = 0
            r15 = 2
            if (r0 == r3) goto L_0x0044
            int r2 = r8.A01
            int r0 = r8.A00
            int r2 = X.AnonymousClass3K4.A06(r2, r0, r4)
            X.1gS r0 = r8.A07
            r0.Acw(r1, r2)
            int r0 = r8.A00
            int r0 = r0 + r2
            r8.A00 = r0
            int r3 = r8.A01
            if (r0 != r3) goto L_0x0007
            X.1gS r0 = r8.A07
            long r5 = r8.A05
            r2 = 1
            r1 = 0
            r4 = 0
            r0.Ad0(r1, r2, r3, r4, r5)
            long r2 = r8.A05
            long r0 = r8.A04
            long r2 = r2 + r0
            r8.A05 = r2
            r8.A02 = r7
            goto L_0x0007
        L_0x0044:
            X.4eH r14 = r8.A09
            byte[] r3 = r14.A02
            int r2 = r8.A00
            r0 = 18
            int r0 = X.AnonymousClass3K4.A06(r0, r2, r4)
            r1.A0V(r3, r2, r0)
            int r1 = r8.A00
            int r1 = r1 + r0
            r8.A00 = r1
            r0 = 18
            if (r1 != r0) goto L_0x0007
            byte[] r13 = r14.A02
            X.1gT r0 = r8.A06
            if (r0 != 0) goto L_0x00cb
            java.lang.String r0 = r8.A08
            r21 = r0
            java.lang.String r0 = r8.A0A
            r20 = r0
            r19 = 0
            byte r2 = r13[r7]
            r1 = 127(0x7f, float:1.78E-43)
            int r0 = r13.length
            if (r2 != r1) goto L_0x0185
            X.4dh r12 = new X.4dh
            r12.<init>(r13, r0)
        L_0x0078:
            r0 = 60
            r12.A08(r0)
            r0 = 6
            int r1 = r12.A04(r0)
            int[] r0 = X.C82034Av.A00
            r4 = r0[r1]
            r0 = 4
            int r1 = r12.A04(r0)
            int[] r0 = X.C82034Av.A01
            r3 = r0[r1]
            r0 = 5
            int r2 = r12.A04(r0)
            int[] r1 = X.C82034Av.A02
            int r0 = r1.length
            if (r2 < r0) goto L_0x017e
            r1 = -1
        L_0x009a:
            r0 = 10
            int r0 = X.C90204dh.A01(r12, r0, r15)
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            int r4 = r4 + r0
            X.1gR r2 = X.AnonymousClass3K4.A0N()
            r0 = r21
            r2.A0O = r0
            java.lang.String r0 = "audio/vnd.dts"
            r2.A0R = r0
            r2.A03 = r1
            r2.A04 = r4
            r2.A0D = r3
            r0 = r19
            r2.A0I = r0
            r0 = r20
            r2.A0Q = r0
            X.1gT r1 = new X.1gT
            r1.<init>((X.C32471gR) r2)
            r8.A06 = r1
            X.1gS r0 = r8.A07
            r0.A9D(r1)
        L_0x00cb:
            byte r1 = r13[r7]
            r0 = -2
            r3 = 6
            r2 = 7
            r6 = 4
            if (r1 == r0) goto L_0x016d
            r0 = -1
            if (r1 == r0) goto L_0x0151
            r0 = 31
            if (r1 == r0) goto L_0x0142
            r0 = 5
            byte r0 = r13[r0]
            r0 = r0 & 3
            int r4 = r0 << 12
            byte r3 = r13[r3]
            r0 = r3 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r6
            r4 = r4 | r0
            byte r0 = r13[r2]
            r2 = r0
        L_0x00ea:
            r0 = r0 & 240(0xf0, float:3.36E-43)
            int r0 = r0 >> r6
            r0 = r0 | r4
            int r0 = r0 + 1
        L_0x00f0:
            r8.A01 = r0
            r9 = 1000000(0xf4240, double:4.940656E-318)
            r0 = -2
            r5 = 6
            r4 = 5
            if (r1 == r0) goto L_0x013a
            r0 = -1
            if (r1 == r0) goto L_0x0132
            r0 = 31
            if (r1 == r0) goto L_0x012b
            byte r0 = r13[r6]
            r1 = r0 & 1
            int r1 = r1 << r5
            byte r0 = r13[r4]
        L_0x0108:
            r0 = r0 & 252(0xfc, float:3.53E-43)
        L_0x010a:
            int r0 = r0 >> 2
            r0 = r0 | r1
            int r0 = r0 + 1
            int r0 = r0 << 5
            long r1 = (long) r0
            long r1 = r1 * r9
            X.1gT r0 = r8.A06
            int r0 = r0.A0F
            long r3 = (long) r0
            long r1 = r1 / r3
            int r0 = (int) r1
            long r0 = (long) r0
            r8.A04 = r0
            r14.A0S(r7)
            X.1gS r1 = r8.A07
            r0 = 18
            r1.Acw(r14, r0)
            r8.A02 = r15
            goto L_0x0007
        L_0x012b:
            byte r0 = r13[r4]
            r1 = r0 & 7
            int r1 = r1 << r6
            r2 = r3
            goto L_0x0137
        L_0x0132:
            byte r0 = r13[r6]
            r1 = r0 & 7
            int r1 = r1 << r6
        L_0x0137:
            r0 = r2 & 60
            goto L_0x010a
        L_0x013a:
            byte r0 = r13[r4]
            r1 = r0 & 1
            int r1 = r1 << r5
            byte r0 = r13[r6]
            goto L_0x0108
        L_0x0142:
            byte r3 = r13[r3]
            r0 = r3 & 3
            int r4 = r0 << 12
            byte r2 = r13[r2]
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r6
            r4 = r4 | r0
            r0 = 8
            goto L_0x015f
        L_0x0151:
            byte r2 = r13[r2]
            r0 = r2 & 3
            int r4 = r0 << 12
            byte r3 = r13[r3]
            r0 = r3 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r6
            r4 = r4 | r0
            r0 = 9
        L_0x015f:
            byte r0 = r13[r0]
            r0 = r0 & 60
            int r0 = r0 >> 2
            r0 = r0 | r4
            int r0 = r0 + 1
            int r0 = r0 << 4
            int r0 = r0 / 14
            goto L_0x00f0
        L_0x016d:
            byte r0 = r13[r6]
            r0 = r0 & 3
            int r4 = r0 << 12
            byte r2 = r13[r2]
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r6
            r4 = r4 | r0
            byte r0 = r13[r3]
            r3 = r0
            goto L_0x00ea
        L_0x017e:
            r0 = r1[r2]
            int r1 = r0 * 1000
            int r1 = r1 / r15
            goto L_0x009a
        L_0x0185:
            byte[] r11 = java.util.Arrays.copyOf(r13, r0)
            byte r1 = r11[r7]
            r0 = -2
            if (r1 == r0) goto L_0x0191
            r0 = -1
            if (r1 != r0) goto L_0x01a4
        L_0x0191:
            r3 = 0
        L_0x0192:
            int r0 = r11.length
            int r0 = r0 + -1
            if (r3 >= r0) goto L_0x01a4
            byte r2 = r11[r3]
            int r1 = r3 + 1
            byte r0 = r11[r1]
            r11[r3] = r0
            r11[r1] = r2
            int r3 = r3 + 2
            goto L_0x0192
        L_0x01a4:
            int r10 = r11.length
            X.4dh r12 = new X.4dh
            r12.<init>(r11, r10)
            byte r1 = r11[r7]
            r0 = 31
            if (r1 != r0) goto L_0x0224
            X.4dh r9 = new X.4dh
            r9.<init>(r11, r10)
        L_0x01b5:
            int r1 = X.C90204dh.A00(r9)
            r0 = 16
            if (r1 < r0) goto L_0x0224
            r9.A08(r15)
            r6 = 14
            int r5 = r9.A04(r6)
            r18 = 1
            int r0 = r18 << r6
            int r0 = r0 - r18
            r5 = r5 & r0
            int r1 = r12.A00
            int r0 = 8 - r1
            int r17 = java.lang.Math.min(r0, r6)
            int r0 = r0 - r17
            r2 = 65280(0xff00, float:9.1477E-41)
            int r2 = r2 >> r1
            int r1 = r18 << r0
            int r1 = r1 - r18
            r2 = r2 | r1
            byte[] r4 = r12.A03
            int r3 = r12.A02
            byte r1 = r4[r3]
            r2 = r2 & r1
            byte r1 = (byte) r2
            r16 = r1
            r4[r3] = r1
            int r2 = r6 - r17
            int r1 = r5 >>> r2
            int r1 = r1 << r0
            r0 = r16
            X.AnonymousClass3K4.A0i(r1, r4, r0, r3)
            int r3 = r3 + 1
        L_0x01f8:
            r0 = 8
            if (r2 <= r0) goto L_0x0207
            int r1 = r3 + 1
            int r2 = r2 + -8
            int r0 = r5 >>> r2
            byte r0 = (byte) r0
            r4[r3] = r0
            r3 = r1
            goto L_0x01f8
        L_0x0207:
            int r16 = 8 - r2
            byte r1 = r4[r3]
            int r0 = r18 << r16
            int r0 = r0 - r18
            r1 = r1 & r0
            byte r1 = (byte) r1
            r4[r3] = r1
            int r0 = r18 << r2
            int r0 = r0 - r18
            r5 = r5 & r0
            int r5 = r5 << r16
            X.AnonymousClass3K4.A0i(r5, r4, r1, r3)
            r12.A08(r6)
            r12.A06()
            goto L_0x01b5
        L_0x0224:
            r12.A03 = r11
            r12.A02 = r7
            r12.A00 = r7
            r12.A01 = r10
            goto L_0x0078
        L_0x022e:
            int r0 = r1.A01
            int r0 = r2 - r0
            r4 = 0
            if (r0 <= 0) goto L_0x0007
            int r0 = r8.A03
            int r5 = r0 << 8
            r8.A03 = r5
            int r0 = r1.A0C()
            r5 = r5 | r0
            r8.A03 = r5
            r0 = 2147385345(0x7ffe8001, float:NaN)
            if (r5 == r0) goto L_0x0256
            r0 = -25230976(0xfffffffffe7f0180, float:-8.474023E37)
            if (r5 == r0) goto L_0x0256
            r0 = 536864768(0x1fffe800, float:1.0838051E-19)
            if (r5 == r0) goto L_0x0256
            r0 = -14745368(0xffffffffff1f00e8, float:-2.1135196E38)
            if (r5 != r0) goto L_0x022e
        L_0x0256:
            X.4eH r0 = r8.A09
            byte[] r2 = r0.A02
            int r0 = r5 >> 24
            X.AnonymousClass3K4.A15(r2, r0, r4)
            int r0 = r5 >> 16
            X.AnonymousClass3K4.A15(r2, r0, r3)
            r1 = 2
            int r0 = r5 >> 8
            X.AnonymousClass3K4.A15(r2, r0, r1)
            r0 = 3
            X.AnonymousClass3K4.A15(r2, r5, r0)
            r0 = 4
            r8.A00 = r0
            r8.A03 = r4
            r8.A02 = r3
            goto L_0x0007
        L_0x0277:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96894p4.A6b(X.4eH):void");
    }

    public void A7e(C15060qG r2, AnonymousClass4WV r3) {
        r3.A03();
        this.A08 = r3.A02();
        this.A07 = AnonymousClass4WV.A00(r2, r3);
    }

    public void Aa7() {
    }

    public void Aa8(long j2, int i2) {
        this.A05 = j2;
    }

    public void AdB() {
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }
}

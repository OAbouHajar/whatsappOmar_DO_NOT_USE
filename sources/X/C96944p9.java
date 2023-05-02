package X;

/* renamed from: X.4p9  reason: invalid class name and case insensitive filesystem */
public final class C96944p9 implements C109595St {
    public long A00;
    public long A01;
    public C32481gS A02;
    public AnonymousClass4P4 A03;
    public String A04;
    public boolean A05;
    public final AnonymousClass4WU A06 = new AnonymousClass4WU(34);
    public final AnonymousClass4WU A07 = new AnonymousClass4WU(39);
    public final AnonymousClass4WU A08 = new AnonymousClass4WU(33);
    public final AnonymousClass4WU A09 = new AnonymousClass4WU(40);
    public final AnonymousClass4WU A0A = new AnonymousClass4WU(32);
    public final C85814Qb A0B;
    public final C90504eH A0C = new C90504eH();
    public final boolean[] A0D = new boolean[3];

    public C96944p9(C85814Qb r3) {
        this.A0B = r3;
    }

    public final void A00(byte[] bArr, int i2, int i3) {
        AnonymousClass4P4 r2 = this.A03;
        if (r2.A07) {
            int i4 = r2.A00;
            int i5 = (i2 + 2) - i4;
            if (i5 < i3) {
                r2.A06 = AnonymousClass000.A1O(bArr[i5] & 128);
                r2.A07 = false;
            } else {
                r2.A00 = i4 + (i3 - i2);
            }
        }
        if (!this.A05) {
            this.A0A.A01(bArr, i2, i3);
            this.A08.A01(bArr, i2, i3);
            this.A06.A01(bArr, i2, i3);
        }
        this.A07.A01(bArr, i2, i3);
        this.A09.A01(bArr, i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03bb, code lost:
        if (r4 > 21) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015e, code lost:
        if (r0 == 2) goto L_0x0160;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A6b(X.C90504eH r31) {
        /*
            r30 = this;
            r6 = r30
            X.1gS r0 = r6.A02
            X.C90524eJ.A01(r0)
        L_0x0007:
            r4 = r31
            int r5 = r4.A00
            int r3 = r4.A01
            int r2 = r5 - r3
            if (r2 <= 0) goto L_0x002f
            byte[] r0 = r4.A02
            r25 = r0
            long r7 = r6.A01
            long r0 = (long) r2
            long r7 = r7 + r0
            r6.A01 = r7
            X.1gS r0 = r6.A02
            r0.Acw(r4, r2)
        L_0x0020:
            if (r3 >= r5) goto L_0x0007
            boolean[] r1 = r6.A0D
            r0 = r25
            int r1 = X.C90674eb.A01(r0, r1, r3, r5)
            if (r1 != r5) goto L_0x0030
            r6.A00(r0, r3, r5)
        L_0x002f:
            return
        L_0x0030:
            int r24 = r1 + 3
            byte r0 = r25[r24]
            r0 = r0 & 126(0x7e, float:1.77E-43)
            int r4 = r0 >> 1
            int r2 = r1 - r3
            if (r2 <= 0) goto L_0x0041
            r0 = r25
            r6.A00(r0, r3, r1)
        L_0x0041:
            int r23 = r5 - r1
            long r0 = r6.A01
            r16 = r0
            r0 = r23
            long r0 = (long) r0
            long r16 = r16 - r0
            r22 = 0
            if (r2 >= 0) goto L_0x0053
            int r0 = -r2
            r22 = r0
        L_0x0053:
            long r0 = r6.A00
            r28 = r0
            X.4P4 r7 = r6.A03
            boolean r1 = r6.A05
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r7.A08
            r7.A0B = r0
            r0 = 0
            r7.A09 = r0
        L_0x006a:
            boolean r0 = r6.A05
            if (r0 != 0) goto L_0x02ef
            X.4WU r1 = r6.A0A
            r0 = r22
            r1.A02(r0)
            X.4WU r8 = r6.A08
            r8.A02(r0)
            X.4WU r3 = r6.A06
            r3.A02(r0)
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x02ef
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x02ef
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x02ef
            X.1gS r0 = r6.A02
            r27 = r0
            java.lang.String r0 = r6.A04
            r26 = r0
            int r7 = r1.A00
            int r2 = r8.A00
            int r2 = r2 + r7
            int r0 = r3.A00
            int r2 = r2 + r0
            byte[] r11 = new byte[r2]
            byte[] r0 = r1.A03
            r12 = 0
            java.lang.System.arraycopy(r0, r12, r11, r12, r7)
            byte[] r7 = r8.A03
            int r2 = r1.A00
            int r0 = r8.A00
            java.lang.System.arraycopy(r7, r12, r11, r2, r0)
            byte[] r2 = r3.A03
            int r1 = r1.A00
            int r0 = r8.A00
            int r1 = r1 + r0
            int r0 = r3.A00
            java.lang.System.arraycopy(r2, r12, r11, r1, r0)
            byte[] r1 = r8.A03
            int r0 = r8.A00
            X.4XN r10 = new X.4XN
            r10.<init>(r1, r12, r0)
            r0 = 44
            r10.A05(r0)
            r7 = 3
            int r2 = r10.A02(r7)
            r10.A03()
            r0 = 88
            r10.A05(r0)
            r1 = 8
            r10.A05(r1)
            r9 = 0
            r3 = 0
        L_0x00da:
            if (r9 >= r2) goto L_0x0123
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x00e4
            int r3 = r3 + 89
        L_0x00e4:
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x00ec
            int r3 = r3 + 8
        L_0x00ec:
            int r9 = r9 + 1
            goto L_0x00da
        L_0x00ef:
            boolean r0 = r7.A05
            if (r0 != 0) goto L_0x00f7
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x006a
        L_0x00f7:
            if (r1 == 0) goto L_0x0112
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x0112
            long r2 = r7.A01
            long r0 = r16 - r2
            int r8 = (int) r0
            int r12 = r23 + r8
            boolean r10 = r7.A0B
            long r0 = r7.A03
            long r2 = r2 - r0
            int r11 = (int) r2
            X.1gS r8 = r7.A0C
            long r13 = r7.A04
            r9 = 0
            r8.Ad0(r9, r10, r11, r12, r13)
        L_0x0112:
            long r0 = r7.A01
            r7.A03 = r0
            long r0 = r7.A02
            r7.A04 = r0
            boolean r0 = r7.A08
            r7.A0B = r0
            r0 = 1
            r7.A0A = r0
            goto L_0x006a
        L_0x0123:
            r10.A05(r3)
            r3 = 2
            if (r2 <= 0) goto L_0x0130
            int r0 = 8 - r2
            int r0 = r0 << 1
            r10.A05(r0)
        L_0x0130:
            r10.A01()
            int r0 = r10.A01()
            if (r0 != r7) goto L_0x013c
            r10.A03()
        L_0x013c:
            int r9 = r10.A01()
            int r7 = r10.A01()
            boolean r13 = r10.A06()
            r15 = 1
            if (r13 == 0) goto L_0x016f
            int r21 = r10.A01()
            int r20 = r10.A01()
            int r19 = r10.A01()
            int r18 = r10.A01()
            if (r0 == r15) goto L_0x0160
            r14 = 1
            if (r0 != r3) goto L_0x0161
        L_0x0160:
            r14 = 2
        L_0x0161:
            r13 = 1
            if (r0 != r15) goto L_0x0165
            r13 = 2
        L_0x0165:
            int r21 = r21 + r20
            int r14 = r14 * r21
            int r9 = r9 - r14
            int r19 = r19 + r18
            int r13 = r13 * r19
            int r7 = r7 - r13
        L_0x016f:
            r10.A01()
            r10.A01()
            int r20 = r10.A01()
            boolean r13 = r10.A06()
            r0 = r2
            if (r13 == 0) goto L_0x0181
            r0 = 0
        L_0x0181:
            r10.A01()
            r10.A01()
            if (r0 > r2) goto L_0x018f
            r10.A01()
            int r0 = r0 + 1
            goto L_0x0181
        L_0x018f:
            r10.A01()
            r10.A01()
            r10.A01()
            r10.A01()
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x01de
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x01de
            r14 = 0
        L_0x01a8:
            r13 = 0
        L_0x01a9:
            boolean r0 = r10.A06()
            r18 = 1
            if (r0 != 0) goto L_0x01c4
            r10.A01()
        L_0x01b4:
            r0 = 3
            if (r14 != r0) goto L_0x01b9
            r18 = 3
        L_0x01b9:
            int r13 = r13 + r18
            r0 = 6
            if (r13 < r0) goto L_0x01a9
            int r14 = r14 + 1
            r0 = 4
            if (r14 >= r0) goto L_0x01de
            goto L_0x01a8
        L_0x01c4:
            r2 = 64
            int r0 = r14 << 1
            int r0 = r0 + 4
            int r0 = r15 << r0
            int r2 = java.lang.Math.min(r2, r0)
            if (r14 <= r15) goto L_0x01d5
            r10.A00()
        L_0x01d5:
            r0 = 0
        L_0x01d6:
            if (r0 >= r2) goto L_0x01b4
            r10.A00()
            int r0 = r0 + 1
            goto L_0x01d6
        L_0x01de:
            r10.A05(r3)
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x01f3
            r10.A05(r1)
            r10.A01()
            r10.A01()
            r10.A03()
        L_0x01f3:
            int r19 = r10.A01()
            r13 = 0
            r18 = 0
            r2 = 0
        L_0x01fb:
            r0 = r19
            if (r13 >= r0) goto L_0x0241
            if (r13 == 0) goto L_0x0205
            boolean r18 = r10.A06()
        L_0x0205:
            if (r18 == 0) goto L_0x021c
            r10.A03()
            r10.A01()
            r0 = 0
        L_0x020e:
            if (r0 > r2) goto L_0x023e
            boolean r14 = r10.A06()
            if (r14 == 0) goto L_0x0219
            r10.A03()
        L_0x0219:
            int r0 = r0 + 1
            goto L_0x020e
        L_0x021c:
            int r15 = r10.A01()
            int r14 = r10.A01()
            int r2 = r15 + r14
            r0 = 0
        L_0x0227:
            if (r0 >= r15) goto L_0x0232
            r10.A01()
            r10.A03()
            int r0 = r0 + 1
            goto L_0x0227
        L_0x0232:
            r0 = 0
        L_0x0233:
            if (r0 >= r14) goto L_0x023e
            r10.A01()
            r10.A03()
            int r0 = r0 + 1
            goto L_0x0233
        L_0x023e:
            int r13 = r13 + 1
            goto L_0x01fb
        L_0x0241:
            boolean r0 = r10.A06()
            r13 = 4
            if (r0 == 0) goto L_0x0259
            r2 = 0
        L_0x0249:
            int r0 = r10.A01()
            if (r2 >= r0) goto L_0x0259
            int r0 = r20 + 4
            int r0 = r0 + 1
            r10.A05(r0)
            int r2 = r2 + 1
            goto L_0x0249
        L_0x0259:
            r10.A05(r3)
            r2 = 1065353216(0x3f800000, float:1.0)
            boolean r0 = r10.A06()
            r3 = 24
            if (r0 == 0) goto L_0x02b7
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x0285
            int r14 = r10.A02(r1)
            r0 = 255(0xff, float:3.57E-43)
            if (r14 != r0) goto L_0x03be
            r0 = 16
            int r1 = r10.A02(r0)
            int r0 = r10.A02(r0)
            if (r1 == 0) goto L_0x0285
            if (r0 == 0) goto L_0x0285
            float r2 = (float) r1
            float r0 = (float) r0
            float r2 = r2 / r0
        L_0x0285:
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x028e
            r10.A03()
        L_0x028e:
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x02a0
            r10.A05(r13)
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x02a0
            r10.A05(r3)
        L_0x02a0:
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x02ac
            r10.A01()
            r10.A01()
        L_0x02ac:
            r10.A03()
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x02b7
            int r7 = r7 << 1
        L_0x02b7:
            byte[] r1 = r8.A03
            int r0 = r8.A00
            r10.A03 = r1
            r10.A02 = r12
            r10.A01 = r0
            r10.A00 = r12
            r10.A04()
            r10.A05(r3)
            java.lang.String r3 = X.AnonymousClass4Yu.A00(r10)
            X.1gR r1 = X.AnonymousClass3K4.A0N()
            r0 = r26
            r1.A0O = r0
            java.lang.String r0 = "video/hevc"
            r1.A0R = r0
            r1.A0M = r3
            r1.A0G = r9
            r1.A07 = r7
            r1.A01 = r2
            java.util.List r0 = java.util.Collections.singletonList(r11)
            r1.A0S = r0
            r0 = r27
            X.AnonymousClass3K3.A19(r1, r0)
            r0 = 1
            r6.A05 = r0
        L_0x02ef:
            X.4WU r3 = r6.A07
            r0 = r22
            boolean r0 = r3.A02(r0)
            r7 = 5
            if (r0 == 0) goto L_0x0315
            byte[] r1 = r3.A03
            int r0 = r3.A00
            int r1 = X.C90674eb.A00(r1, r0)
            X.4eH r8 = r6.A0C
            byte[] r0 = r3.A03
            r8.A0U(r0, r1)
            r8.A0T(r7)
            X.4Qb r0 = r6.A0B
            X.1gS[] r2 = r0.A01
            r0 = r28
            X.C87504Xd.A00(r8, r2, r0)
        L_0x0315:
            X.4WU r2 = r6.A09
            r0 = r22
            boolean r0 = r2.A02(r0)
            if (r0 == 0) goto L_0x033a
            byte[] r1 = r2.A03
            int r0 = r2.A00
            int r1 = X.C90674eb.A00(r1, r0)
            X.4eH r8 = r6.A0C
            byte[] r0 = r2.A03
            r8.A0U(r0, r1)
            r8.A0T(r7)
            X.4Qb r0 = r6.A0B
            X.1gS[] r7 = r0.A01
            r0 = r28
            X.C87504Xd.A00(r8, r7, r0)
        L_0x033a:
            long r0 = r6.A00
            X.4P4 r8 = r6.A03
            boolean r10 = r6.A05
            r7 = 0
            r8.A06 = r7
            r8.A05 = r7
            r8.A02 = r0
            r8.A00 = r7
            r0 = r16
            r8.A01 = r0
            r0 = 32
            if (r4 < r0) goto L_0x03b4
            r0 = 40
            if (r4 == r0) goto L_0x038b
            r9 = 1
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x037b
            boolean r0 = r8.A09
            if (r0 != 0) goto L_0x037b
            if (r10 == 0) goto L_0x0379
            boolean r10 = r8.A0B
            long r0 = r8.A03
            long r16 = r16 - r0
            r0 = r16
            int r12 = (int) r0
            X.1gS r11 = r8.A0C
            long r0 = r8.A04
            r14 = 0
            r13 = r11
            r15 = r10
            r16 = r12
            r17 = r23
            r18 = r0
            r13.Ad0(r14, r15, r16, r17, r18)
        L_0x0379:
            r8.A0A = r7
        L_0x037b:
            r0 = 35
            if (r4 <= r0) goto L_0x0383
            r0 = 39
            if (r4 != r0) goto L_0x038b
        L_0x0383:
            boolean r0 = r8.A09
            r0 = r0 ^ 1
            r8.A05 = r0
            r8.A09 = r9
        L_0x038b:
            r1 = 0
        L_0x038c:
            r8.A08 = r1
            if (r1 != 0) goto L_0x0394
            r0 = 9
            if (r4 > r0) goto L_0x0395
        L_0x0394:
            r7 = 1
        L_0x0395:
            r8.A07 = r7
            boolean r0 = r6.A05
            if (r0 != 0) goto L_0x03aa
            X.4WU r0 = r6.A0A
            r0.A00(r4)
            X.4WU r0 = r6.A08
            r0.A00(r4)
            X.4WU r0 = r6.A06
            r0.A00(r4)
        L_0x03aa:
            r3.A00(r4)
            r2.A00(r4)
            r3 = r24
            goto L_0x0020
        L_0x03b4:
            r0 = 16
            if (r4 < r0) goto L_0x038b
            r0 = 21
            r1 = 1
            if (r4 <= r0) goto L_0x038c
            goto L_0x038b
        L_0x03be:
            float[] r1 = X.C90674eb.A03
            int r0 = r1.length
            if (r14 >= r0) goto L_0x03c7
            r2 = r1[r14]
            goto L_0x0285
        L_0x03c7:
            java.lang.String r0 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r1 = X.C13680ns.A0c(r14, r0)
            java.lang.String r0 = "H265Reader"
            android.util.Log.w(r0, r1)
            goto L_0x0285
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96944p9.A6b(X.4eH):void");
    }

    public void A7e(C15060qG r3, AnonymousClass4WV r4) {
        r4.A03();
        this.A04 = r4.A02();
        C32481gS Ah1 = r3.Ah1(r4.A01(), 2);
        this.A02 = Ah1;
        this.A03 = new AnonymousClass4P4(Ah1);
        this.A0B.A00(r3, r4);
    }

    public void Aa7() {
    }

    public void Aa8(long j2, int i2) {
        this.A00 = j2;
    }

    public void AdB() {
        this.A01 = 0;
        boolean A1T = AnonymousClass3K3.A1T(this.A0D);
        AnonymousClass4WU r0 = this.A0A;
        r0.A02 = A1T;
        r0.A01 = A1T;
        AnonymousClass4WU r02 = this.A08;
        r02.A02 = A1T;
        r02.A01 = A1T;
        AnonymousClass4WU r03 = this.A06;
        r03.A02 = A1T;
        r03.A01 = A1T;
        AnonymousClass4WU r04 = this.A07;
        r04.A02 = A1T;
        r04.A01 = A1T;
        AnonymousClass4WU r05 = this.A09;
        r05.A02 = A1T;
        r05.A01 = A1T;
        AnonymousClass4P4 r06 = this.A03;
        if (r06 != null) {
            r06.A07 = A1T;
            r06.A06 = A1T;
            r06.A05 = A1T;
            r06.A0A = A1T;
            r06.A09 = A1T;
        }
    }
}

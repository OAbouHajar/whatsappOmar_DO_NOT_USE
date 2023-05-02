package X;

/* renamed from: X.4pB  reason: invalid class name and case insensitive filesystem */
public final class C96964pB implements C109595St {
    public static final double[] A0G = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public C32481gS A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final C88744b1 A0B = new C88744b1();
    public final AnonymousClass4WU A0C;
    public final AnonymousClass4TF A0D;
    public final C90504eH A0E;
    public final boolean[] A0F = new boolean[4];

    public C96964pB(AnonymousClass4TF r3) {
        C90504eH r0;
        this.A0D = r3;
        if (r3 != null) {
            this.A0C = new AnonymousClass4WU(178);
            r0 = new C90504eH();
        } else {
            r0 = null;
            this.A0C = null;
        }
        this.A0E = r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c7, code lost:
        if (r8 >= 0) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0170  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A6b(X.C90504eH r28) {
        /*
            r27 = this;
            r6 = r27
            X.1gS r7 = r6.A05
            X.C90524eJ.A01(r7)
            r26 = r28
            r0 = r26
            int r9 = r0.A01
            int r5 = r0.A00
            byte[] r13 = r0.A02
            long r2 = r6.A04
            int r4 = r5 - r9
            long r0 = (long) r4
            long r2 = r2 + r0
            r6.A04 = r2
            r0 = r26
            r7.Acw(r0, r4)
        L_0x001e:
            boolean[] r0 = r6.A0F
            int r7 = X.C90674eb.A01(r13, r0, r9, r5)
            if (r7 != r5) goto L_0x0037
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x002f
            X.4b1 r0 = r6.A0B
            r0.A00(r13, r9, r5)
        L_0x002f:
            X.4WU r0 = r6.A0C
            if (r0 == 0) goto L_0x0036
            r0.A01(r13, r9, r5)
        L_0x0036:
            return
        L_0x0037:
            r0 = r26
            byte[] r0 = r0.A02
            int r18 = r7 + 3
            byte r0 = r0[r18]
            r4 = r0 & 255(0xff, float:3.57E-43)
            int r8 = r7 - r9
            boolean r0 = r6.A07
            r12 = 0
            r10 = 1
            if (r0 != 0) goto L_0x006c
            if (r8 <= 0) goto L_0x01c6
            X.4b1 r0 = r6.A0B
            r0.A00(r13, r9, r7)
        L_0x0050:
            r3 = 0
        L_0x0051:
            X.4b1 r1 = r6.A0B
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x01be
            int r2 = r1.A00
            int r2 = r2 - r3
            r1.A00 = r2
            int r0 = r1.A01
            if (r0 != 0) goto L_0x0111
            r0 = 181(0xb5, float:2.54E-43)
            if (r4 != r0) goto L_0x0111
            r1.A01 = r2
        L_0x0066:
            byte[] r2 = X.C88744b1.A04
            int r0 = r2.length
            r1.A00(r2, r12, r0)
        L_0x006c:
            X.4WU r2 = r6.A0C
            if (r2 == 0) goto L_0x00a9
            if (r8 <= 0) goto L_0x00a7
            r2.A01(r13, r9, r7)
            r0 = 0
        L_0x0076:
            boolean r0 = r2.A02(r0)
            if (r0 == 0) goto L_0x0092
            byte[] r1 = r2.A03
            int r0 = r2.A00
            int r1 = X.C90674eb.A00(r1, r0)
            X.4eH r8 = r6.A0E
            byte[] r0 = r2.A03
            r8.A0U(r0, r1)
            X.4TF r3 = r6.A0D
            long r0 = r6.A03
            r3.A01(r8, r0)
        L_0x0092:
            r0 = 178(0xb2, float:2.5E-43)
            if (r4 != r0) goto L_0x00a9
            r0 = r26
            byte[] r1 = r0.A02
            int r0 = r7 + 2
            byte r0 = r1[r0]
            if (r0 != r10) goto L_0x00a3
            r2.A00(r4)
        L_0x00a3:
            r9 = r18
            goto L_0x001e
        L_0x00a7:
            int r0 = -r8
            goto L_0x0076
        L_0x00a9:
            if (r4 == 0) goto L_0x00b6
            r0 = 179(0xb3, float:2.51E-43)
            if (r4 == r0) goto L_0x00b6
            r0 = 184(0xb8, float:2.58E-43)
            if (r4 != r0) goto L_0x00a3
            r6.A09 = r10
            goto L_0x00a3
        L_0x00b6:
            int r7 = r5 - r7
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x00e0
            boolean r8 = r6.A09
            long r2 = r6.A04
            long r0 = r6.A02
            long r2 = r2 - r0
            int r9 = (int) r2
            int r9 = r9 - r7
            X.1gS r2 = r6.A05
            long r0 = r6.A03
            r20 = 0
            r19 = r2
            r21 = r8
            r22 = r9
            r23 = r7
            r24 = r0
            r19.Ad0(r20, r21, r22, r23, r24)
        L_0x00e0:
            boolean r9 = r6.A0A
            if (r9 == 0) goto L_0x00e8
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x0108
        L_0x00e8:
            long r2 = r6.A04
            long r0 = (long) r7
            long r2 = r2 - r0
            r6.A02 = r2
            long r2 = r6.A01
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0100
            if (r9 == 0) goto L_0x010e
            long r2 = r6.A03
            long r0 = r6.A00
            long r2 = r2 + r0
        L_0x0100:
            r6.A03 = r2
            r6.A09 = r12
            r6.A01 = r7
            r6.A0A = r10
        L_0x0108:
            if (r4 != 0) goto L_0x010b
            r12 = 1
        L_0x010b:
            r6.A08 = r12
            goto L_0x00a3
        L_0x010e:
            r2 = 0
            goto L_0x0100
        L_0x0111:
            r1.A02 = r12
            java.lang.String r14 = r6.A06
            byte[] r0 = r1.A03
            byte[] r17 = java.util.Arrays.copyOf(r0, r2)
            r2 = 4
            byte r0 = r17[r2]
            r11 = r0 & 255(0xff, float:3.57E-43)
            r0 = 5
            byte r0 = r17[r0]
            r3 = r0 & 255(0xff, float:3.57E-43)
            r0 = 6
            byte r0 = r17[r0]
            r15 = r0 & 255(0xff, float:3.57E-43)
            int r11 = r11 << r2
            int r0 = r3 >> 4
            r11 = r11 | r0
            r0 = r3 & 15
            int r3 = r0 << 8
            r3 = r3 | r15
            r16 = 7
            byte r0 = r17[r16]
            r0 = r0 & 240(0xf0, float:3.36E-43)
            int r0 = r0 >> r2
            r15 = 2
            if (r0 == r15) goto L_0x01b8
            r15 = 3
            if (r0 == r15) goto L_0x01b2
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r0 != r2) goto L_0x014b
            int r0 = r3 * 121
            float r15 = (float) r0
            int r0 = r11 * 100
        L_0x0149:
            float r0 = (float) r0
            float r15 = r15 / r0
        L_0x014b:
            X.1gR r2 = X.AnonymousClass3K4.A0N()
            r2.A0O = r14
            java.lang.String r0 = "video/mpeg2"
            r2.A0R = r0
            r2.A0G = r11
            r2.A07 = r3
            r2.A01 = r15
            java.util.List r0 = java.util.Collections.singletonList(r17)
            r2.A0S = r0
            X.1gT r11 = new X.1gT
            r11.<init>((X.C32471gR) r2)
            r2 = 0
            byte r0 = r17[r16]
            r0 = r0 & 15
            int r15 = r0 + -1
            if (r15 < 0) goto L_0x0195
            double[] r14 = A0G
            int r0 = r14.length
            if (r15 >= r0) goto L_0x0195
            r15 = r14[r15]
            int r0 = r1.A01
            int r0 = r0 + 9
            byte r1 = r17[r0]
            r0 = r1 & 96
            int r0 = r0 >> 5
            r14 = r1 & 31
            if (r0 == r14) goto L_0x018e
            double r2 = (double) r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 + r0
            int r0 = r14 + 1
            double r0 = (double) r0
            double r2 = r2 / r0
            double r15 = r15 * r2
        L_0x018e:
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r15
            long r2 = (long) r0
        L_0x0195:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            android.util.Pair r2 = android.util.Pair.create(r11, r0)
            X.1gS r1 = r6.A05
            java.lang.Object r0 = r2.first
            X.1gT r0 = (X.C32491gT) r0
            r1.A9D(r0)
            java.lang.Object r0 = r2.second
            long r0 = X.C13700nu.A01(r0)
            r6.A00 = r0
            r6.A07 = r10
            goto L_0x006c
        L_0x01b2:
            int r0 = r3 << 4
            float r15 = (float) r0
            int r0 = r11 * 9
            goto L_0x0149
        L_0x01b8:
            int r0 = r3 << 2
            float r15 = (float) r0
            int r0 = r11 * 3
            goto L_0x0149
        L_0x01be:
            r0 = 179(0xb3, float:2.51E-43)
            if (r4 != r0) goto L_0x0066
            r1.A02 = r10
            goto L_0x0066
        L_0x01c6:
            int r3 = -r8
            if (r8 < 0) goto L_0x0051
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96964pB.A6b(X.4eH):void");
    }

    public void A7e(C15060qG r3, AnonymousClass4WV r4) {
        r4.A03();
        this.A06 = r4.A02();
        this.A05 = r3.Ah1(r4.A01(), 2);
        AnonymousClass4TF r0 = this.A0D;
        if (r0 != null) {
            r0.A00(r3, r4);
        }
    }

    public void Aa7() {
    }

    public void Aa8(long j2, int i2) {
        this.A01 = j2;
    }

    public void AdB() {
        boolean A1T = AnonymousClass3K3.A1T(this.A0F);
        C88744b1 r0 = this.A0B;
        r0.A02 = A1T;
        r0.A00 = A1T ? 1 : 0;
        r0.A01 = A1T;
        AnonymousClass4WU r02 = this.A0C;
        if (r02 != null) {
            r02.A02 = A1T;
            r02.A01 = A1T;
        }
        this.A04 = 0;
        this.A0A = A1T;
    }
}

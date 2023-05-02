package X;

/* renamed from: X.4pD  reason: invalid class name and case insensitive filesystem */
public final class C96984pD implements C109595St {
    public static final float[] A0B = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public long A00;
    public long A01;
    public C32481gS A02;
    public AnonymousClass4S9 A03;
    public String A04;
    public boolean A05;
    public final C88754b2 A06;
    public final AnonymousClass4WU A07;
    public final AnonymousClass4TF A08;
    public final C90504eH A09;
    public final boolean[] A0A;

    public C96984pD() {
        this((AnonymousClass4TF) null);
    }

    public C96984pD(AnonymousClass4TF r3) {
        this.A08 = r3;
        this.A0A = new boolean[4];
        this.A06 = new C88754b2();
        this.A07 = new AnonymousClass4WU(178);
        this.A09 = new C90504eH();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d9, code lost:
        if (r5 == 179) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0213, code lost:
        if (r5 != 181) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x023d, code lost:
        if (r8 >= 0) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A6b(X.C90504eH r24) {
        /*
            r23 = this;
            r6 = r23
            X.4S9 r0 = r6.A03
            X.C90524eJ.A01(r0)
            X.1gS r5 = r6.A02
            X.C90524eJ.A01(r5)
            r7 = r24
            int r0 = r7.A01
            r19 = r0
            int r0 = r7.A00
            r18 = r0
            byte[] r0 = r7.A02
            r22 = r0
            long r3 = r6.A01
            int r2 = r18 - r19
            long r0 = (long) r2
            long r3 = r3 + r0
            r6.A01 = r3
            r5.Acw(r7, r2)
        L_0x0025:
            boolean[] r3 = r6.A0A
            r2 = r22
            r1 = r19
            r0 = r18
            int r3 = X.C90674eb.A01(r2, r3, r1, r0)
            if (r3 != r0) goto L_0x004b
            boolean r0 = r6.A05
            if (r0 != 0) goto L_0x003e
            X.4b2 r3 = r6.A06
            r0 = r18
            r3.A00(r2, r1, r0)
        L_0x003e:
            X.4S9 r3 = r6.A03
            r0 = r18
            r3.A00(r2, r1, r0)
            X.4WU r3 = r6.A07
            r3.A01(r2, r1, r0)
            return
        L_0x004b:
            byte[] r0 = r7.A02
            int r17 = r3 + 3
            byte r0 = r0[r17]
            r5 = r0 & 255(0xff, float:3.57E-43)
            int r8 = r3 - r19
            boolean r0 = r6.A05
            r2 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0162
            if (r8 <= 0) goto L_0x023c
            X.4b2 r9 = r6.A06
            r1 = r22
            r0 = r19
            r9.A00(r1, r0, r3)
        L_0x0066:
            r14 = 0
        L_0x0067:
            X.4b2 r9 = r6.A06
            int r0 = r9.A01
            if (r0 == 0) goto L_0x022c
            r13 = 181(0xb5, float:2.54E-43)
            r12 = 2
            java.lang.String r11 = "Unexpected start code value"
            java.lang.String r10 = "H263Reader"
            if (r0 == r2) goto L_0x0213
            r1 = 3
            if (r0 == r12) goto L_0x020c
            r12 = 4
            if (r0 == r1) goto L_0x021f
            r0 = 179(0xb3, float:2.51E-43)
            if (r5 == r0) goto L_0x0082
            if (r5 != r13) goto L_0x0234
        L_0x0082:
            int r11 = r9.A00
            int r11 = r11 - r14
            r9.A00 = r11
            r9.A03 = r4
            X.1gS r0 = r6.A02
            r21 = r0
            int r1 = r9.A02
            java.lang.String r0 = r6.A04
            r20 = r0
            byte[] r0 = r9.A04
            byte[] r13 = java.util.Arrays.copyOf(r0, r11)
            int r0 = r13.length
            X.4dh r14 = new X.4dh
            r14.<init>(r13, r0)
            r14.A09(r1)
            r14.A09(r12)
            r14.A05()
            r0 = 8
            r14.A08(r0)
            boolean r1 = r14.A0C()
            r11 = 3
            if (r1 == 0) goto L_0x00ba
            r14.A08(r12)
            r14.A08(r11)
        L_0x00ba:
            int r15 = r14.A04(r12)
            r9 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r16 = "Invalid aspect ratio"
            r12 = 15
            if (r15 != r12) goto L_0x01fc
            int r1 = r14.A04(r0)
            int r0 = r14.A04(r0)
            if (r0 == 0) goto L_0x0205
            float r9 = (float) r1
            float r0 = (float) r0
            float r9 = r9 / r0
        L_0x00d3:
            boolean r0 = r14.A0C()
            r1 = 2
            if (r0 == 0) goto L_0x0109
            r14.A08(r1)
            r14.A08(r2)
            boolean r0 = r14.A0C()
            if (r0 == 0) goto L_0x0109
            r14.A08(r12)
            r14.A05()
            r14.A08(r12)
            r14.A05()
            r14.A08(r12)
            r14.A05()
            r14.A08(r11)
            r0 = 11
            r14.A08(r0)
            r14.A05()
            r14.A08(r12)
            r14.A05()
        L_0x0109:
            int r0 = r14.A04(r1)
            if (r0 == 0) goto L_0x0114
            java.lang.String r0 = "Unhandled video object layer shape"
            android.util.Log.w(r10, r0)
        L_0x0114:
            r14.A05()
            r0 = 16
            int r1 = r14.A04(r0)
            r14.A05()
            boolean r0 = r14.A0C()
            if (r0 == 0) goto L_0x012d
            if (r1 != 0) goto L_0x01ed
            java.lang.String r0 = "Invalid vop_increment_time_resolution"
            android.util.Log.w(r10, r0)
        L_0x012d:
            r14.A05()
            r0 = 13
            int r11 = r14.A04(r0)
            r14.A05()
            int r10 = r14.A04(r0)
            r14.A05()
            r14.A05()
            X.1gR r1 = X.AnonymousClass3K4.A0N()
            r0 = r20
            r1.A0O = r0
            java.lang.String r0 = "video/mp4v-es"
            r1.A0R = r0
            r1.A0G = r11
            r1.A07 = r10
            r1.A01 = r9
            java.util.List r0 = java.util.Collections.singletonList(r13)
            r1.A0S = r0
            r0 = r21
            X.AnonymousClass3K3.A19(r1, r0)
            r6.A05 = r2
        L_0x0162:
            X.4S9 r9 = r6.A03
            r1 = r22
            r0 = r19
            r9.A00(r1, r0, r3)
            X.4WU r9 = r6.A07
            if (r8 <= 0) goto L_0x01eb
            r9.A01(r1, r0, r3)
        L_0x0172:
            boolean r0 = r9.A02(r4)
            if (r0 == 0) goto L_0x018e
            byte[] r1 = r9.A03
            int r0 = r9.A00
            int r1 = X.C90674eb.A00(r1, r0)
            X.4eH r8 = r6.A09
            byte[] r0 = r9.A03
            r8.A0U(r0, r1)
            X.4TF r4 = r6.A08
            long r0 = r6.A00
            r4.A01(r8, r0)
        L_0x018e:
            r0 = 178(0xb2, float:2.5E-43)
            if (r5 != r0) goto L_0x019d
            byte[] r1 = r7.A02
            int r0 = r3 + 2
            byte r0 = r1[r0]
            if (r0 != r2) goto L_0x019d
            r9.A00(r5)
        L_0x019d:
            int r12 = r18 - r3
            long r0 = r6.A01
            long r2 = (long) r12
            long r0 = r0 - r2
            X.4S9 r4 = r6.A03
            boolean r8 = r6.A05
            int r3 = r4.A00
            r2 = 182(0xb6, float:2.55E-43)
            if (r3 != r2) goto L_0x01c2
            if (r8 == 0) goto L_0x01c2
            boolean r2 = r4.A05
            if (r2 == 0) goto L_0x01c2
            long r2 = r4.A02
            long r8 = r0 - r2
            int r11 = (int) r8
            boolean r10 = r4.A06
            X.1gS r8 = r4.A07
            long r13 = r4.A03
            r9 = 0
            r8.Ad0(r9, r10, r11, r12, r13)
        L_0x01c2:
            int r2 = r4.A00
            r10 = 179(0xb3, float:2.51E-43)
            if (r2 == r10) goto L_0x01ca
            r4.A02 = r0
        L_0x01ca:
            X.4S9 r9 = r6.A03
            long r2 = r6.A00
            r9.A00 = r5
            r8 = 0
            r9.A06 = r8
            r4 = 1
            r1 = 182(0xb6, float:2.55E-43)
            if (r5 == r1) goto L_0x01db
            r0 = 0
            if (r5 != r10) goto L_0x01dc
        L_0x01db:
            r0 = 1
        L_0x01dc:
            r9.A05 = r0
            if (r5 == r1) goto L_0x01e1
            r4 = 0
        L_0x01e1:
            r9.A04 = r4
            r9.A01 = r8
            r9.A03 = r2
            r19 = r17
            goto L_0x0025
        L_0x01eb:
            int r4 = -r8
            goto L_0x0172
        L_0x01ed:
            int r1 = r1 + -1
            r0 = 0
        L_0x01f0:
            if (r1 <= 0) goto L_0x01f7
            int r0 = r0 + 1
            int r1 = r1 >> 1
            goto L_0x01f0
        L_0x01f7:
            r14.A08(r0)
            goto L_0x012d
        L_0x01fc:
            float[] r1 = A0B
            int r0 = r1.length
            if (r15 >= r0) goto L_0x0205
            r9 = r1[r15]
            goto L_0x00d3
        L_0x0205:
            r0 = r16
            android.util.Log.w(r10, r0)
            goto L_0x00d3
        L_0x020c:
            r0 = 31
            if (r5 > r0) goto L_0x0215
            r9.A01 = r1
            goto L_0x0234
        L_0x0213:
            if (r5 == r13) goto L_0x0229
        L_0x0215:
            android.util.Log.w(r10, r11)
            r9.A03 = r4
            r9.A00 = r4
            r9.A01 = r4
            goto L_0x0234
        L_0x021f:
            r1 = r5 & 240(0xf0, float:3.36E-43)
            r0 = 32
            if (r1 != r0) goto L_0x0215
            int r0 = r9.A00
            r9.A02 = r0
        L_0x0229:
            r9.A01 = r12
            goto L_0x0234
        L_0x022c:
            r0 = 176(0xb0, float:2.47E-43)
            if (r5 != r0) goto L_0x0234
            r9.A01 = r2
            r9.A03 = r2
        L_0x0234:
            byte[] r1 = X.C88754b2.A05
            int r0 = r1.length
            r9.A00(r1, r4, r0)
            goto L_0x0162
        L_0x023c:
            int r14 = -r8
            if (r8 < 0) goto L_0x0067
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96984pD.A6b(X.4eH):void");
    }

    public void A7e(C15060qG r3, AnonymousClass4WV r4) {
        r4.A03();
        this.A04 = r4.A02();
        C32481gS Ah1 = r3.Ah1(r4.A01(), 2);
        this.A02 = Ah1;
        this.A03 = new AnonymousClass4S9(Ah1);
        this.A08.A00(r3, r4);
    }

    public void Aa7() {
    }

    public void Aa8(long j2, int i2) {
        this.A00 = j2;
    }

    public void AdB() {
        boolean A1T = AnonymousClass3K3.A1T(this.A0A);
        C88754b2 r0 = this.A06;
        r0.A03 = A1T;
        r0.A00 = A1T ? 1 : 0;
        r0.A01 = A1T;
        AnonymousClass4S9 r1 = this.A03;
        if (r1 != null) {
            r1.A05 = A1T;
            r1.A04 = A1T;
            r1.A06 = A1T;
            r1.A00 = -1;
        }
        AnonymousClass4WU r12 = this.A07;
        r12.A02 = false;
        r12.A01 = false;
        this.A01 = 0;
    }
}

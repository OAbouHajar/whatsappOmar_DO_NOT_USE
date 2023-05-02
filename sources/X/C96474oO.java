package X;

/* renamed from: X.4oO  reason: invalid class name and case insensitive filesystem */
public final class C96474oO implements C55132it {
    public boolean A00;
    public final C96904p5 A01 = new C96904p5((String) null);
    public final C90504eH A02 = C90504eH.A05(2786);

    public void AHx(C15060qG r6) {
        this.A01.A7e(r6, new AnonymousClass4WV(Integer.MIN_VALUE, 0, 1));
        r6.A8W();
        AnonymousClass3K2.A15(r6, -9223372036854775807L);
    }

    public int AbN(C55142iu r6, AnonymousClass4Bt r7) {
        C90504eH r4 = this.A02;
        int read = r6.read(r4.A02, 0, 2786);
        if (read == -1) {
            return -1;
        }
        r4.A0S(0);
        r4.A0R(read);
        if (!this.A00) {
            this.A01.A04 = 0;
            this.A00 = true;
        }
        this.A01.A6b(r4);
        return 0;
    }

    public void AdC(long j2, long j3) {
        this.A00 = false;
        this.A01.AdB();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        r11.AcS();
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        if ((r7 - r3) >= 8192) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Afz(X.C55142iu r11) {
        /*
            r10 = this;
            r2 = 10
            X.4eH r5 = X.C90504eH.A05(r2)
            r4 = 0
            r3 = 0
        L_0x0008:
            X.C90504eH.A06(r11, r5, r2)
            r5.A0S(r4)
            int r1 = r5.A0D()
            r0 = 4801587(0x494433, float:6.728456E-39)
            if (r1 == r0) goto L_0x007d
            r11.AcS()
            r11.A4m(r3)
            r7 = r3
        L_0x001e:
            r6 = 0
        L_0x001f:
            byte[] r1 = r5.A02
            r0 = 6
            r11.AaL(r1, r4, r0)
            r5.A0S(r4)
            int r1 = r5.A0F()
            r0 = 2935(0xb77, float:4.113E-42)
            if (r1 == r0) goto L_0x003f
            r11.AcS()
            int r7 = r7 + 1
            int r1 = r7 - r3
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r0) goto L_0x008d
            r11.A4m(r7)
            goto L_0x001e
        L_0x003f:
            r0 = 1
            int r6 = r6 + 1
            r9 = 4
            if (r6 < r9) goto L_0x0046
            return r0
        L_0x0046:
            byte[] r8 = r5.A02
            int r1 = r8.length
            r0 = 6
            if (r1 < r0) goto L_0x008d
            r0 = 5
            byte r0 = r8[r0]
            r1 = r0 & 248(0xf8, float:3.48E-43)
            r2 = 3
            int r1 = r1 >> r2
            r0 = 10
            if (r1 <= r0) goto L_0x0070
            r0 = 2
            byte r0 = r8[r0]
            r0 = r0 & 7
            int r1 = r0 << 8
            byte r0 = r8[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            int r0 = r0 + 1
            int r1 = r0 << 1
        L_0x0067:
            r0 = -1
            if (r1 == r0) goto L_0x008d
            int r0 = r1 + -6
            r11.A4m(r0)
            goto L_0x001f
        L_0x0070:
            byte r2 = r8[r9]
            r0 = r2 & 192(0xc0, float:2.69E-43)
            int r1 = r0 >> 6
            r0 = r2 & 63
            int r1 = X.AnonymousClass4ZE.A00(r1, r0)
            goto L_0x0067
        L_0x007d:
            r0 = 3
            r5.A0T(r0)
            int r1 = r5.A0B()
            int r0 = r1 + 10
            int r3 = r3 + r0
            r11.A4m(r1)
            goto L_0x0008
        L_0x008d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96474oO.Afz(X.2iu):boolean");
    }
}

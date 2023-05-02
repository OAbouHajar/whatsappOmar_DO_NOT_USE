package X;

/* renamed from: X.4oP  reason: invalid class name and case insensitive filesystem */
public final class C96484oP implements C55132it {
    public boolean A00;
    public final C96914p6 A01 = new C96914p6((String) null);
    public final C90504eH A02 = C90504eH.A05(16384);

    public void AHx(C15060qG r6) {
        this.A01.A7e(r6, new AnonymousClass4WV(Integer.MIN_VALUE, 0, 1));
        r6.A8W();
        AnonymousClass3K2.A15(r6, -9223372036854775807L);
    }

    public int AbN(C55142iu r6, AnonymousClass4Bt r7) {
        C90504eH r4 = this.A02;
        int read = r6.read(r4.A02, 0, 16384);
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

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if ((r6 - r2) >= 8192) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r12.AcS();
        r6 = r6 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Afz(X.C55142iu r12) {
        /*
            r11 = this;
            r5 = 10
            X.4eH r4 = X.C90504eH.A05(r5)
            r3 = 0
            r2 = 0
        L_0x0008:
            X.C90504eH.A06(r12, r4, r5)
            r4.A0S(r3)
            int r1 = r4.A0D()
            r0 = 4801587(0x494433, float:6.728456E-39)
            if (r1 == r0) goto L_0x0088
            r12.AcS()
            r12.A4m(r2)
            r6 = r2
        L_0x001e:
            r5 = 0
        L_0x001f:
            byte[] r1 = r4.A02
            r0 = 7
            r12.AaL(r1, r3, r0)
            r4.A0S(r3)
            int r8 = r4.A0F()
            r0 = 44096(0xac40, float:6.1792E-41)
            if (r8 == r0) goto L_0x0045
            r0 = 44097(0xac41, float:6.1793E-41)
            if (r8 == r0) goto L_0x0045
            r12.AcS()
            int r6 = r6 + 1
            int r1 = r6 - r2
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r0) goto L_0x0098
            r12.A4m(r6)
            goto L_0x001e
        L_0x0045:
            r0 = 1
            int r5 = r5 + 1
            r10 = 4
            if (r5 < r10) goto L_0x004c
            return r0
        L_0x004c:
            byte[] r9 = r4.A02
            int r0 = r9.length
            r7 = 7
            if (r0 < r7) goto L_0x0098
            r0 = 2
            byte r0 = r9[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 8
            r0 = 3
            byte r0 = r9[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r0) goto L_0x0086
            byte r0 = r9[r10]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 16
            r0 = 5
            int r1 = X.AnonymousClass3K3.A0L(r9, r0, r1)
            r0 = 6
            byte r0 = r9[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
        L_0x0075:
            r0 = 44097(0xac41, float:6.1793E-41)
            if (r8 != r0) goto L_0x007c
            int r7 = r7 + 2
        L_0x007c:
            int r1 = r1 + r7
            r0 = -1
            if (r1 == r0) goto L_0x0098
            int r0 = r1 + -7
            r12.A4m(r0)
            goto L_0x001f
        L_0x0086:
            r7 = 4
            goto L_0x0075
        L_0x0088:
            r0 = 3
            r4.A0T(r0)
            int r1 = r4.A0B()
            int r0 = r1 + 10
            int r2 = r2 + r0
            r12.A4m(r1)
            goto L_0x0008
        L_0x0098:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96484oP.Afz(X.2iu):boolean");
    }
}

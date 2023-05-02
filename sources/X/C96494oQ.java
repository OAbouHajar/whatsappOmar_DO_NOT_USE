package X;

/* renamed from: X.4oQ  reason: invalid class name and case insensitive filesystem */
public final class C96494oQ implements C55132it {
    public long A00 = -1;
    public long A01;
    public C15060qG A02;
    public boolean A03;
    public boolean A04;
    public final C96974pC A05 = new C96974pC((String) null, true);
    public final C90204dh A06;
    public final C90504eH A07 = C90504eH.A05(2048);
    public final C90504eH A08;

    public C96494oQ() {
        C90504eH A052 = C90504eH.A05(10);
        this.A08 = A052;
        byte[] bArr = A052.A02;
        this.A06 = new C90204dh(bArr, bArr.length);
    }

    public void AHx(C15060qG r6) {
        this.A02 = r6;
        this.A05.A7e(r6, new AnonymousClass4WV(Integer.MIN_VALUE, 0, 1));
        r6.A8W();
    }

    public int AbN(C55142iu r10, AnonymousClass4Bt r11) {
        C90524eJ.A01(this.A02);
        C90504eH r6 = this.A07;
        int read = r10.read(r6.A02, 0, 2048);
        boolean A1R = AnonymousClass000.A1R(read, -1);
        if (!this.A03) {
            AnonymousClass3K2.A15(this.A02, -9223372036854775807L);
            this.A03 = true;
        }
        if (A1R) {
            return -1;
        }
        r6.A0S(0);
        r6.A0R(read);
        if (!this.A04) {
            this.A05.A09 = this.A01;
            this.A04 = true;
        }
        this.A05.A6b(r6);
        return 0;
    }

    public void AdC(long j2, long j3) {
        this.A04 = false;
        this.A05.AdB();
        this.A01 = j3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        r10.AcS();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        if ((r3 - r2) >= 8192) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Afz(X.C55142iu r10) {
        /*
            r9 = this;
            r3 = 0
            r2 = 0
        L_0x0002:
            X.4eH r4 = r9.A08
            byte[] r1 = r4.A02
            r0 = 10
            r10.AaL(r1, r3, r0)
            r4.A0S(r3)
            int r1 = r4.A0D()
            r0 = 4801587(0x494433, float:6.728456E-39)
            if (r1 == r0) goto L_0x0076
            r10.AcS()
            r10.A4m(r2)
            long r5 = r9.A00
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0028
            long r0 = (long) r2
            r9.A00 = r0
        L_0x0028:
            r5 = 0
            r3 = r2
        L_0x002a:
            r7 = 0
            r6 = 0
        L_0x002c:
            byte[] r1 = r4.A02
            r0 = 2
            r10.AaL(r1, r5, r0)
            r4.A0S(r5)
            int r1 = r4.A0F()
            r0 = 65526(0xfff6, float:9.1821E-41)
            r1 = r1 & r0
            r0 = 65520(0xfff0, float:9.1813E-41)
            if (r1 != r0) goto L_0x0067
            r8 = 1
            int r7 = r7 + 1
            r1 = 4
            if (r7 < r1) goto L_0x004d
            r0 = 188(0xbc, float:2.63E-43)
            if (r6 <= r0) goto L_0x004d
            return r8
        L_0x004d:
            X.C90504eH.A06(r10, r4, r1)
            X.4dh r1 = r9.A06
            r0 = 14
            r1.A07(r0)
            r0 = 13
            int r1 = r1.A04(r0)
            r0 = 6
            if (r1 <= r0) goto L_0x0086
            int r0 = r1 + -6
            r10.A4m(r0)
            int r6 = r6 + r1
            goto L_0x002c
        L_0x0067:
            r10.AcS()
            int r3 = r3 + 1
            int r1 = r3 - r2
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r0) goto L_0x0086
            r10.A4m(r3)
            goto L_0x002a
        L_0x0076:
            r0 = 3
            r4.A0T(r0)
            int r1 = r4.A0B()
            int r0 = r1 + 10
            int r2 = r2 + r0
            r10.A4m(r1)
            goto L_0x0002
        L_0x0086:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96494oQ.Afz(X.2iu):boolean");
    }
}

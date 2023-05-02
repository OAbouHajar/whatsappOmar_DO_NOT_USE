package X;

/* renamed from: X.4pJ  reason: invalid class name and case insensitive filesystem */
public final class C97044pJ implements AnonymousClass5SN {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public AnonymousClass4X5 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C109595St A09;
    public final C90204dh A0A = new C90204dh(new byte[10], 10);

    public C97044pJ(C109595St r4) {
        this.A09 = r4;
    }

    public final boolean A00(C90504eH r4, byte[] bArr, int i2) {
        int A002 = C90504eH.A00(r4);
        int i3 = this.A00;
        int A062 = AnonymousClass3K4.A06(i2, i3, A002);
        if (A062 <= 0) {
            return true;
        }
        if (bArr == null) {
            r4.A0T(A062);
        } else {
            r4.A0V(bArr, i3, A062);
        }
        int i4 = this.A00 + A062;
        this.A00 = i4;
        return i4 == i2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014c A[SYNTHETIC] */
    public final void A6c(X.C90504eH r13, int r14) {
        /*
            r12 = this;
            X.4X5 r0 = r12.A04
            X.C90524eJ.A01(r0)
            r0 = r14 & 1
            r5 = -1
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0036
            int r0 = r12.A03
            if (r0 == 0) goto L_0x0031
            if (r0 == r3) goto L_0x0031
            java.lang.String r6 = "PesReader"
            if (r0 == r4) goto L_0x0145
            int r2 = r12.A02
            if (r2 == r5) goto L_0x002c
            java.lang.String r0 = "Unexpected start indicator: expected "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r2)
            java.lang.String r0 = " more bytes"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            android.util.Log.w(r6, r0)
        L_0x002c:
            X.5St r0 = r12.A09
            r0.Aa7()
        L_0x0031:
            r12.A03 = r3
        L_0x0033:
            r0 = 0
            r12.A00 = r0
        L_0x0036:
            int r6 = r13.A00
            int r1 = r13.A01
            int r6 = r6 - r1
            if (r6 <= 0) goto L_0x014c
            int r0 = r12.A03
            if (r0 == 0) goto L_0x0140
            r2 = 0
            if (r0 == r3) goto L_0x00d2
            if (r0 == r4) goto L_0x0065
            int r0 = r12.A02
            if (r0 == r5) goto L_0x0053
            int r0 = r6 - r0
            if (r0 <= 0) goto L_0x0053
            int r6 = r6 - r0
            int r1 = r1 + r6
            r13.A0R(r1)
        L_0x0053:
            X.5St r1 = r12.A09
            r1.A6b(r13)
            int r0 = r12.A02
            if (r0 == r5) goto L_0x0036
            int r0 = r0 - r6
            r12.A02 = r0
            if (r0 != 0) goto L_0x0036
            r1.Aa7()
            goto L_0x0031
        L_0x0065:
            r1 = 10
            int r0 = r12.A01
            int r1 = java.lang.Math.min(r1, r0)
            X.4dh r8 = r12.A0A
            byte[] r0 = r8.A03
            boolean r0 = r12.A00(r13, r0, r1)
            if (r0 == 0) goto L_0x0036
            r1 = 0
            int r0 = r12.A01
            boolean r0 = r12.A00(r13, r1, r0)
            if (r0 == 0) goto L_0x0036
            r8.A07(r2)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r6 = r12.A07
            if (r6 == 0) goto L_0x00c2
            r10 = 4
            r8.A08(r10)
            r9 = 3
            int r0 = r8.A04(r9)
            long r0 = (long) r0
            r11 = 30
            long r0 = r0 << r11
            r8.A08(r3)
            long r6 = X.C90204dh.A02(r8, r0)
            boolean r0 = r12.A08
            if (r0 != 0) goto L_0x00bc
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x00bc
            int r0 = X.C90204dh.A01(r8, r10, r9)
            long r0 = (long) r0
            long r0 = r0 << r11
            r8.A08(r3)
            long r0 = X.C90204dh.A02(r8, r0)
            X.4X5 r8 = r12.A04
            r8.A02(r0)
            r12.A08 = r3
        L_0x00bc:
            X.4X5 r0 = r12.A04
            long r0 = r0.A02(r6)
        L_0x00c2:
            boolean r6 = r12.A05
            if (r6 == 0) goto L_0x00c7
            r2 = 4
        L_0x00c7:
            r14 = r14 | r2
            X.5St r2 = r12.A09
            r2.Aa8(r0, r14)
            r0 = 3
            r12.A03 = r0
            goto L_0x0033
        L_0x00d2:
            X.4dh r8 = r12.A0A
            byte[] r1 = r8.A03
            r0 = 9
            boolean r0 = r12.A00(r13, r1, r0)
            if (r0 == 0) goto L_0x0036
            r7 = 0
            r8.A07(r2)
            r0 = 24
            int r1 = r8.A04(r0)
            java.lang.String r6 = "PesReader"
            if (r1 == r3) goto L_0x00fd
            java.lang.String r0 = "Unexpected start code prefix: "
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)
            android.util.Log.w(r6, r0)
            r12.A02 = r5
        L_0x00f7:
            r12.A03 = r2
            r12.A00 = r7
            goto L_0x0036
        L_0x00fd:
            r2 = 8
            r8.A08(r2)
            r0 = 16
            int r1 = r8.A04(r0)
            r0 = 5
            r8.A08(r0)
            boolean r0 = r8.A0C()
            r12.A05 = r0
            r8.A08(r4)
            boolean r0 = r8.A0C()
            r12.A07 = r0
            boolean r0 = r8.A0C()
            r12.A06 = r0
            r0 = 6
            int r2 = X.C90204dh.A01(r8, r0, r2)
            r12.A01 = r2
            if (r1 == 0) goto L_0x013c
            int r0 = r1 + 6
            int r1 = r0 + -9
            int r1 = r1 - r2
            r12.A02 = r1
            if (r1 >= 0) goto L_0x013e
            java.lang.String r0 = "Found negative packet payload size: "
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)
            android.util.Log.w(r6, r0)
        L_0x013c:
            r12.A02 = r5
        L_0x013e:
            r2 = 2
            goto L_0x00f7
        L_0x0140:
            r13.A0T(r6)
            goto L_0x0036
        L_0x0145:
            java.lang.String r0 = "Unexpected start indicator reading extended header"
            android.util.Log.w(r6, r0)
            goto L_0x0031
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97044pJ.A6c(X.4eH, int):void");
    }

    public void AI2(C15060qG r2, AnonymousClass4WV r3, AnonymousClass4X5 r4) {
        this.A04 = r4;
        this.A09.A7e(r2, r3);
    }

    public final void AdB() {
        this.A03 = 0;
        this.A00 = 0;
        this.A08 = false;
        this.A09.AdB();
    }
}

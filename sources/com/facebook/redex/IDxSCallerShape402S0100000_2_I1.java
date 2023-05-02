package com.facebook.redex;

import X.C108315Nm;

public class IDxSCallerShape402S0100000_2_I1 implements C108315Nm {
    public Object A00;
    public final int A01;

    public IDxSCallerShape402S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        if (r11 != 0) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AXM(com.google.android.exoplayer2.Timeline r16, X.AnonymousClass2PW r17) {
        /*
            r15 = this;
            int r0 = r15.A01
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r2 = r15.A00
            X.3VO r2 = (X.AnonymousClass3VO) r2
            boolean r0 = r2 instanceof X.AnonymousClass3VN
            r7 = r16
            if (r0 == 0) goto L_0x00ca
            X.3VN r2 = (X.AnonymousClass3VN) r2
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x003d
            X.3VR r0 = r2.A01
            java.lang.Object r3 = r0.A01
            java.lang.Object r1 = r0.A00
            X.3VR r0 = new X.3VR
            r0.<init>(r7, r3, r1)
            r2.A01 = r0
            X.4ph r0 = r2.A00
            if (r0 == 0) goto L_0x002a
            long r0 = r0.A00
            r2.A06(r0)
        L_0x002a:
            r1 = 0
        L_0x002b:
            r0 = 1
            r2.A02 = r0
            r2.A04 = r0
            X.3VR r0 = r2.A01
            r2.A02(r0)
            if (r1 == 0) goto L_0x003c
            X.4ph r0 = r2.A00
            r0.A00(r1)
        L_0x003c:
            return
        L_0x003d:
            int r0 = r7.A01()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x005e
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0059
            X.3VR r0 = r2.A01
            java.lang.Object r3 = r0.A01
            java.lang.Object r1 = r0.A00
        L_0x0051:
            X.3VR r0 = new X.3VR
            r0.<init>(r7, r3, r1)
            r2.A01 = r0
            goto L_0x002a
        L_0x0059:
            java.lang.Object r3 = X.C89324by.A0F
            java.lang.Object r1 = X.AnonymousClass3VR.A02
            goto L_0x0051
        L_0x005e:
            X.4by r9 = r2.A06
            r10 = 0
            r13 = 0
            r7.A0A(r9, r10, r13)
            java.lang.Object r5 = r9.A09
            X.4ph r3 = r2.A00
            if (r3 == 0) goto L_0x00c7
            long r0 = r3.A04
            X.3VR r6 = r2.A01
            X.1c3 r3 = r3.A05
            java.lang.Object r4 = r3.A04
            X.4XE r3 = r2.A05
            r6.A09(r3, r4)
            long r11 = r3.A02
            long r11 = r11 + r0
            X.3VR r0 = r2.A01
            r0.A0A(r9, r10, r13)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00c7
        L_0x0085:
            X.4XE r8 = r2.A05
            android.util.Pair r0 = r7.A07(r8, r9, r10, r11, r13)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            long r3 = X.C13700nu.A01(r0)
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x009d
            X.3VR r0 = r2.A01
            java.lang.Object r5 = r0.A01
            java.lang.Object r1 = r0.A00
        L_0x009d:
            X.3VR r0 = new X.3VR
            r0.<init>(r7, r5, r1)
            r2.A01 = r0
            X.4ph r0 = r2.A00
            if (r0 == 0) goto L_0x002a
            r2.A06(r3)
            X.1c3 r3 = r0.A05
            java.lang.Object r1 = r3.A04
            X.3VR r0 = r2.A01
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r0 = X.AnonymousClass3VR.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c1
            X.3VR r0 = r2.A01
            java.lang.Object r1 = r0.A00
        L_0x00c1:
            X.1c3 r1 = r3.A01(r1)
            goto L_0x002b
        L_0x00c7:
            r11 = 0
            goto L_0x0085
        L_0x00ca:
            boolean r0 = r2 instanceof X.AnonymousClass3VM
            if (r0 == 0) goto L_0x00e6
            X.3VM r2 = (X.AnonymousClass3VM) r2
            int r1 = r2.A00
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L_0x00e0
            X.3UD r0 = new X.3UD
            r0.<init>(r7, r1)
        L_0x00dc:
            r2.A02(r0)
            return
        L_0x00e0:
            X.3VP r0 = new X.3VP
            r0.<init>(r7)
            goto L_0x00dc
        L_0x00e6:
            r2.A02(r7)
            return
        L_0x00ea:
            java.lang.Object r0 = r15.A00
            X.4XK r0 = (X.AnonymousClass4XK) r0
            X.5L8 r0 = r0.A03
            X.4pg r0 = (X.C97274pg) r0
            X.5La r0 = r0.A0Y
            r1 = 22
            X.4qO r0 = (X.C97684qO) r0
            android.os.Handler r0 = r0.A00
            r0.sendEmptyMessage(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxSCallerShape402S0100000_2_I1.AXM(com.google.android.exoplayer2.Timeline, X.2PW):void");
    }
}

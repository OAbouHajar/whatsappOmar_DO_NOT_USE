package X;

/* renamed from: X.4QB  reason: invalid class name */
public final class AnonymousClass4QB {
    public C75403s6 A00;

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0102, code lost:
        if (r3 > Float.MAX_VALUE) goto L_0x0104;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.app.Activity r10, X.C05370Qr r11, X.C16490t9 r12) {
        /*
            r9 = this;
            r0 = 1
            X.C18450wi.A0H(r12, r0)
            r4 = 2
            X.C18450wi.A0H(r10, r4)
            X.3s6 r2 = new X.3s6
            r2.<init>()
            X.0mV r8 = X.C810046l.A00(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            if (r8 == 0) goto L_0x0058
            r5 = r8
            X.0cl r5 = (X.C07950cl) r5
            X.0UP r1 = r5.A01
            X.0UP r0 = X.AnonymousClass0UP.A01
            boolean r1 = X.C18450wi.A0R(r1, r0)
            r0 = r7
            if (r1 == 0) goto L_0x002a
            r0 = r3
        L_0x002a:
            r2.A04 = r0
            X.0RQ r6 = r5.A00
            int r5 = r6.A02
            int r0 = r6.A01
            int r5 = r5 - r0
            int r1 = r6.A00
            int r0 = r6.A03
            int r1 = r1 - r0
            if (r5 <= r1) goto L_0x0106
            X.0UO r6 = X.AnonymousClass0UO.A01
        L_0x003c:
            X.0UO r5 = X.AnonymousClass0UO.A01
            boolean r1 = X.C18450wi.A0R(r6, r5)
            r0 = r7
            if (r1 == 0) goto L_0x0046
            r0 = r3
        L_0x0046:
            r2.A03 = r0
            boolean r0 = r8.AJg()
            if (r0 == 0) goto L_0x0058
            boolean r1 = X.C18450wi.A0R(r6, r5)
            r0 = r7
            if (r1 == 0) goto L_0x0056
            r0 = r3
        L_0x0056:
            r2.A02 = r0
        L_0x0058:
            boolean r0 = X.C15450qv.A05()
            if (r0 == 0) goto L_0x0068
            boolean r0 = r10.isInMultiWindowMode()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
        L_0x0068:
            android.content.res.Configuration r0 = X.C13700nu.A03(r10)
            int r0 = r0.orientation
            if (r0 == r4) goto L_0x0071
            r3 = r7
        L_0x0071:
            r2.A05 = r3
            boolean r0 = X.C15450qv.A00()
            if (r0 == 0) goto L_0x009f
            android.content.Context r0 = r10.getApplicationContext()
            X.C18450wi.A0B(r0)
            X.2CF r0 = X.C26791Pe.A02(r0)
            if (r0 == 0) goto L_0x009f
            int r1 = r0.A01
            int r0 = r0.A02
            float r3 = (float) r0
            float r0 = (float) r1
            float r3 = r3 / r0
            r1 = 1
            r0 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00f5
            r0 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00f5
        L_0x0099:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A01 = r0
        L_0x009f:
            X.3s6 r4 = r9.A00
            r3 = 0
            java.lang.Integer r1 = r2.A02
            if (r4 != 0) goto L_0x00f2
            r0 = r3
        L_0x00a7:
            boolean r0 = X.C18450wi.A0R(r1, r0)
            if (r0 == 0) goto L_0x010a
            java.lang.Integer r1 = r2.A05
            if (r4 != 0) goto L_0x00ef
            r0 = r3
        L_0x00b2:
            boolean r0 = X.C18450wi.A0R(r1, r0)
            if (r0 == 0) goto L_0x010a
            java.lang.Integer r1 = r2.A01
            if (r4 != 0) goto L_0x00ec
            r0 = r3
        L_0x00bd:
            boolean r0 = X.C18450wi.A0R(r1, r0)
            if (r0 == 0) goto L_0x010a
            java.lang.Integer r1 = r2.A03
            if (r4 != 0) goto L_0x00e9
            r0 = r3
        L_0x00c8:
            boolean r0 = X.C18450wi.A0R(r1, r0)
            if (r0 == 0) goto L_0x010a
            java.lang.Integer r1 = r2.A04
            if (r4 != 0) goto L_0x00e6
            r0 = r3
        L_0x00d3:
            boolean r0 = X.C18450wi.A0R(r1, r0)
            if (r0 == 0) goto L_0x010a
            java.lang.Boolean r0 = r2.A00
            if (r4 == 0) goto L_0x00df
            java.lang.Boolean r3 = r4.A00
        L_0x00df:
            boolean r0 = X.C18450wi.A0R(r0, r3)
            if (r0 == 0) goto L_0x010a
            return
        L_0x00e6:
            java.lang.Integer r0 = r4.A04
            goto L_0x00d3
        L_0x00e9:
            java.lang.Integer r0 = r4.A03
            goto L_0x00c8
        L_0x00ec:
            java.lang.Integer r0 = r4.A01
            goto L_0x00bd
        L_0x00ef:
            java.lang.Integer r0 = r4.A05
            goto L_0x00b2
        L_0x00f2:
            java.lang.Integer r0 = r4.A02
            goto L_0x00a7
        L_0x00f5:
            r0 = 1068121457(0x3faa3d71, float:1.33)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0104
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r1 = 3
            if (r0 <= 0) goto L_0x0099
        L_0x0104:
            r1 = 2
            goto L_0x0099
        L_0x0106:
            X.0UO r6 = X.AnonymousClass0UO.A02
            goto L_0x003c
        L_0x010a:
            r9.A00 = r2
            r12.A06(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4QB.A00(android.app.Activity, X.0Qr, X.0t9):void");
    }
}

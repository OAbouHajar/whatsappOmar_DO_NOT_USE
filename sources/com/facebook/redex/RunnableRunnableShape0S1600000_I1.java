package com.facebook.redex;

public class RunnableRunnableShape0S1600000_I1 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public RunnableRunnableShape0S1600000_I1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i2) {
        this.A06 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0046, code lost:
        r2 = (X.C18100w9) r6.A0H.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.A06
            java.lang.Object r7 = r11.A01
            X.1Vv r7 = (X.C28371Vv) r7
            java.lang.Object r2 = r11.A02
            if (r0 == 0) goto L_0x00b9
            X.4Fd r2 = (X.C83044Fd) r2
            java.lang.Object r6 = r11.A03
            X.0vu r6 = (X.C17950vu) r6
            java.lang.Object r5 = r11.A04
            java.lang.Object r4 = r11.A05
            X.5S1 r4 = (X.AnonymousClass5S1) r4
            r3 = 0
            r1 = 1
            X.0so r9 = r6.A03
            java.lang.String r0 = "iq"
            X.C28371Vv.A06(r7, r0)
            X.1Vv r10 = r2.A00
            r0 = 38
            com.facebook.redex.IDxNFunctionShape137S0100000_2_I1 r2 = new com.facebook.redex.IDxNFunctionShape137S0100000_2_I1
            r2.<init>(r9, r0)
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r0 = "error"
            r1[r3] = r0
            java.lang.Object r8 = X.C32271fx.A03(r7, r2, r1)
            X.4Um r8 = (X.C86874Um) r8
            r0 = 4
        L_0x0035:
            com.facebook.redex.IDxNFunctionShape43S0200000_2_I1 r1 = new com.facebook.redex.IDxNFunctionShape43S0200000_2_I1
            r1.<init>(r9, r10, r0)
            java.lang.String[] r0 = new java.lang.String[r3]
            X.C32271fx.A03(r7, r1, r0)
            X.C18450wi.A0B(r8)
            java.lang.Integer r1 = r6.A01
            if (r1 == 0) goto L_0x00b7
            java.util.Map r0 = r6.A0H
            java.lang.Object r2 = r0.get(r1)
            X.0w9 r2 = (X.C18100w9) r2
            if (r2 == 0) goto L_0x00b7
            java.lang.Long r0 = r8.A01
            long r0 = r0.longValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r9 = r2.ADW(r0)
        L_0x005e:
            java.lang.Long r0 = r8.A01
            X.C18450wi.A0B(r0)
            long r0 = r0.longValue()
            r2 = 0
            X.4W3 r7 = new X.4W3
            r7.<init>(r9, r2, r0)
            java.lang.String r0 = r8.A02
            if (r0 == 0) goto L_0x0088
            X.4an r2 = X.C89844d1.A01(r0)
            X.5OQ[] r1 = new X.AnonymousClass5OQ[r3]
            java.lang.String r0 = "$"
            java.lang.Object r3 = r2.A01(r0, r1)
            java.util.Map r3 = (java.util.Map) r3
            long r0 = r7.A00
            java.lang.String r2 = r7.A01
            X.4W3 r7 = new X.4W3
            r7.<init>(r2, r3, r0)
        L_0x0088:
            int r10 = r5.hashCode()
            java.lang.String r9 = "iqResponse"
            long r0 = r7.A00
            X.0vp r8 = r6.A08
            java.lang.String r3 = "error_code"
            X.1dR r2 = r8.A02
            r2.A03(r10, r9)
            r8.A01(r10, r3, r0)
            X.0vh r0 = r6.A0D
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "session_id"
            r8.A02(r10, r0, r1)
            int r1 = r5.hashCode()
            r0 = 467(0x1d3, float:6.54E-43)
            r2.A05(r1, r0)
            if (r4 == 0) goto L_0x00b6
            r4.AQy(r7)
        L_0x00b6:
            return
        L_0x00b7:
            r9 = 0
            goto L_0x005e
        L_0x00b9:
            X.4Fb r2 = (X.C83024Fb) r2
            java.lang.Object r6 = r11.A03
            X.0vu r6 = (X.C17950vu) r6
            java.lang.Object r5 = r11.A04
            java.lang.Object r4 = r11.A05
            X.5S1 r4 = (X.AnonymousClass5S1) r4
            r3 = 0
            r1 = 1
            X.0so r9 = r6.A03
            java.lang.String r0 = "iq"
            X.C28371Vv.A06(r7, r0)
            X.1Vv r10 = r2.A00
            r0 = 20
            com.facebook.redex.IDxNFunctionShape137S0100000_2_I1 r2 = new com.facebook.redex.IDxNFunctionShape137S0100000_2_I1
            r2.<init>(r9, r0)
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r0 = "error"
            r1[r3] = r0
            java.lang.Object r8 = X.C32271fx.A03(r7, r2, r1)
            X.4Um r8 = (X.C86874Um) r8
            r0 = 1
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S1600000_I1.run():void");
    }
}

package com.facebook.redex;

import X.AnonymousClass1WE;

public class IDxNConsumerShape3S0110000_3_I1 implements AnonymousClass1WE {
    public Object A00;
    public boolean A01;
    public final int A02;

    public IDxNConsumerShape3S0110000_3_I1(Object obj, int i2, boolean z2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0082, code lost:
        if (r0.getStickerIfSelected() == null) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r35) {
        /*
            r34 = this;
            r4 = r35
            r1 = r34
            int r0 = r1.A02
            if (r0 == 0) goto L_0x0022
            java.lang.Object r3 = r1.A00
            X.5ja r3 = (X.C112825ja) r3
            boolean r2 = r1.A01
            X.1cl r4 = (X.C30671cl) r4
            r3.A0B = r4
            X.1m4 r4 = (X.C35521m4) r4
            android.content.Intent r1 = com.obwhatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A02(r3, r4, r2)
            r0 = 1016(0x3f8, float:1.424E-42)
            if (r2 == 0) goto L_0x001e
            r0 = 1017(0x3f9, float:1.425E-42)
        L_0x001e:
            r3.startActivityForResult(r1, r0)
        L_0x0021:
            return
        L_0x0022:
            java.lang.Object r2 = r1.A00
            X.5ja r2 = (X.C112825ja) r2
            boolean r5 = r1.A01
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            X.5hW r0 = r2.A0H
            r0.A0D = r4
            boolean r0 = r2.A47()
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r2.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            X.1cl r1 = r2.A0B
            X.1tF r4 = r1.A08
            X.AnonymousClass00B.A06(r4)
            X.5hR r4 = (X.C111805hR) r4
            if (r0 != 0) goto L_0x0112
            X.5iL r5 = r2.A0N
            java.lang.String r10 = r2.A0m
            X.1Vy r6 = r2.A0A
            X.5hW r0 = r2.A0H
            java.lang.String r11 = r0.A0L
            java.lang.String r12 = r0.A0M
            java.lang.String r13 = r0.A0J
            java.lang.String r14 = r0.A0K
            X.1lh r7 = r4.A06
            java.lang.String r15 = r1.A0A
            X.5wy r0 = r2.A0B
            java.util.HashMap r0 = r0.A08
            r16 = 0
            X.5iD r9 = r2.A09
            X.611 r8 = new X.611
            r8.<init>(r2)
            r17 = r0
            r5.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x006c:
            X.5ix r1 = r2.A0F
            java.lang.String r0 = "send_p2p"
            r7 = 123(0x7b, float:1.72E-43)
            r1.AL3(r0, r7)
            X.5ix r6 = r2.A0F
            com.obwhatsapp.payments.ui.widget.PaymentView r0 = r2.A35()
            if (r0 == 0) goto L_0x0084
            X.1jm r0 = r0.getStickerIfSelected()
            r4 = 1
            if (r0 != 0) goto L_0x0085
        L_0x0084:
            r4 = 0
        L_0x0085:
            java.lang.String r3 = "is_sticker"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.String r0 = "p2p_flow_tag"
            X.1dR r0 = r6.A00(r1, r0)
            if (r0 == 0) goto L_0x009c
            X.17S r1 = r0.A07
            X.1dS r0 = r0.A06
            int r0 = r0.A05
            r1.AKq(r3, r0, r7, r4)
        L_0x009c:
            X.5wy r0 = r2.A0B
            java.util.HashMap r7 = r0.A08
            X.1Vo r3 = r2.A0t
            java.lang.String r0 = "send button clicked and got method: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.1cl r0 = r2.A0B
            r1.append(r0)
            java.lang.String r0 = " cred: "
            r1.append(r0)
            if (r7 == 0) goto L_0x0110
            int r0 = r7.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00bc:
            java.lang.String r0 = X.AnonymousClass000.A0f(r0, r1)
            r3.A04(r0)
            X.1cl r0 = r2.A0B
            if (r0 == 0) goto L_0x0021
            if (r7 == 0) goto L_0x0021
            java.lang.String r0 = "sending payment to: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.0rv r0 = r2.A0E
            r1.append(r0)
            X.C110105dW.A1L(r3, r1)
            X.5hW r6 = r2.A0H
            X.2gP r4 = X.C110105dW.A0L()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r0 = "MPIN"
            java.lang.String r1 = X.C119365wy.A00(r0, r7)
            java.lang.String r0 = "pin"
            X.1lh r0 = X.C110105dW.A0J(r4, r3, r1, r0)
            r6.A0A = r0
            X.5hW r1 = r2.A0H
            java.lang.String r0 = r2.A0i
            r1.A0P = r0
            java.lang.String r0 = r2.A0K
            r1.A0H = r0
            X.1lh r0 = r2.A09
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r1.A0J = r0
            if (r5 == 0) goto L_0x0104
            r2.A3B(r1)
        L_0x0104:
            X.0sq r3 = r2.A05
            r1 = 2
            com.whatsapp.util.IDxATaskShape109S0100000_3_I1 r0 = new com.whatsapp.util.IDxATaskShape109S0100000_3_I1
            r0.<init>(r2, r1)
            X.C13680ns.A1U(r0, r3)
            return
        L_0x0110:
            r0 = 0
            goto L_0x00bc
        L_0x0112:
            X.5hW r5 = r2.A0H
            X.0t3 r3 = r2.A05
            X.0sK r1 = r2.A01
            r0 = 0
            java.lang.String r0 = X.C224718b.A00(r1, r3, r0)
            r5.A0F = r0
            X.5hW r14 = r2.A0H
            java.lang.String r0 = r2.A0i
            r14.A0P = r0
            X.5iF r0 = r2.A0O
            r33 = r0
            X.1lh r0 = r4.A06
            r17 = r0
            X.1cl r0 = r2.A0B
            java.lang.String r0 = r0.A0A
            r16 = r0
            X.1Vy r0 = r2.A0A
            r32 = r0
            X.1Vz r0 = r2.A09
            X.1m1 r0 = (X.C35491m1) r0
            java.lang.String r15 = r0.A04
            X.5wy r0 = r2.A0B
            java.util.HashMap r13 = r0.A08
            X.1lh r12 = r2.A07
            java.lang.String r11 = r2.A0P
            java.lang.String r10 = r2.A0K
            java.lang.String r9 = r2.A0N
            java.lang.String r8 = r2.A0M
            java.lang.String r7 = r2.A0J
            X.5iD r6 = r2.A09
            boolean r31 = X.C112765jH.A23(r2)
            java.lang.String r5 = r2.A0m
            java.lang.String r4 = r2.A0d
            X.1lh r3 = r2.A08
            r1 = 0
            com.facebook.redex.IDxVCallbackShape454S0100000_3_I1 r0 = new com.facebook.redex.IDxVCallbackShape454S0100000_3_I1
            r0.<init>(r2, r1)
            r27 = r7
            r28 = r5
            r29 = r4
            r30 = r13
            r23 = r11
            r24 = r10
            r25 = r9
            r26 = r8
            r19 = r6
            r20 = r0
            r21 = r16
            r22 = r15
            r15 = r17
            r16 = r12
            r17 = r3
            r18 = r14
            r13 = r33
            r14 = r32
            r13.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxNConsumerShape3S0110000_3_I1.accept(java.lang.Object):void");
    }
}

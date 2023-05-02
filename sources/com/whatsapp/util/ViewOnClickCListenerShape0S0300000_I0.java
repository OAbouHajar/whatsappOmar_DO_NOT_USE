package com.whatsapp.util;

import X.C34331k5;

public class ViewOnClickCListenerShape0S0300000_I0 extends C34331k5 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public ViewOnClickCListenerShape0S0300000_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x015d, code lost:
        if (r1 != com.obwhatsapp.R.id.duration_480_min) goto L_0x015f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r27) {
        /*
            r26 = this;
            r4 = r26
            int r0 = r4.A03
            switch(r0) {
                case 0: goto L_0x01b3;
                case 1: goto L_0x002c;
                case 2: goto L_0x0163;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r10 = r4.A00
            X.29S r10 = (X.AnonymousClass29S) r10
            X.01V r0 = r10.A19
            android.location.LocationManager r1 = r0.A0F()
            if (r1 == 0) goto L_0x004f
            java.lang.String r0 = "gps"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "network"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 != 0) goto L_0x004f
            java.lang.Object r1 = r4.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2
        L_0x0028:
            X.AnonymousClass29T.A01(r1, r0)
            return
        L_0x002c:
            java.lang.Object r2 = r4.A00
            X.1bb r2 = (X.C30011bb) r2
            X.01Y r1 = r2.A0V
            java.lang.Object r0 = r4.A02
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vw r0 = r0.A11
            X.0rv r0 = r0.A00
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)
            boolean r1 = r1.A0V(r0)
            android.content.Context r0 = r2.getContext()
            if (r1 == 0) goto L_0x01cf
            android.app.Activity r1 = X.C19980zJ.A00(r0)
            r0 = 106(0x6a, float:1.49E-43)
            goto L_0x0028
        L_0x004f:
            java.lang.Object r0 = r4.A02
            X.4lV r0 = (X.C94804lV) r0
            int r1 = r0.A00
            r0 = 2131363311(0x7f0a05ef, float:1.8346427E38)
            if (r1 != r0) goto L_0x0153
            r8 = 900(0x384, float:1.261E-42)
        L_0x005c:
            android.location.Location r9 = r10.A06
            r7 = 0
            if (r9 == 0) goto L_0x006c
            float r1 = r9.getAccuracy()
            r0 = 1128792064(0x43480000, float:200.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x006c
            r9 = r7
        L_0x006c:
            java.lang.Object r6 = r4.A01
            android.app.Activity r6 = (android.app.Activity) r6
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "quoted_message_row_id"
            r2 = 0
            long r0 = r1.getLongExtra(r0, r2)
            android.content.Intent r5 = r6.getIntent()
            java.lang.String r4 = "quoted_group_jid"
            java.lang.String r4 = r5.getStringExtra(r4)
            X.0sL r5 = X.C16050sL.A05(r4)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0145
            X.0t6 r2 = r10.A1G
            X.0th r2 = r2.A0K
            X.0tZ r7 = r2.A00(r0)
        L_0x0096:
            X.0rv r14 = r10.A0a
            if (r14 == 0) goto L_0x013c
            X.0tb r5 = r10.A15
            X.AnonymousClass00B.A06(r14)
            X.2A5 r0 = r10.A0b
            com.obwhatsapp.mentions.MentionableEntry r0 = r0.A07
            java.lang.String r0 = r0.getStringText()
            java.lang.String r11 = X.C40651uT.A05(r0)
            X.2A5 r0 = r10.A0b
            com.obwhatsapp.mentions.MentionableEntry r0 = r0.A07
            java.util.List r10 = r0.getMentions()
            android.content.Intent r1 = r6.getIntent()
            r4 = 0
            java.lang.String r0 = "has_number_from_url"
            boolean r15 = r1.getBooleanExtra(r0, r4)
            X.17g r3 = r5.A1N
            X.0t3 r12 = r5.A0Q
            long r0 = r12.A00()
            X.18b r13 = r3.A05
            r2 = 1
            X.1Vw r13 = r13.A02(r14, r2)
            X.1rV r2 = new X.1rV
            r2.<init>(r13, r0)
            if (r9 == 0) goto L_0x00e0
            double r0 = r9.getLatitude()
            r2.A00 = r0
            double r0 = r9.getLongitude()
            r2.A01 = r0
        L_0x00e0:
            r0 = 1
            r2.A02 = r0
            r2.A0W(r0)
            r2.A00 = r8
            r2.A03 = r11
            r2.A0u(r10)
            r3.A05(r2, r7)
            if (r15 == 0) goto L_0x00f6
            r0 = 4
            r2.A0S(r0)
        L_0x00f6:
            r5.A0M(r2)
            X.0t6 r11 = r5.A0e
            r0 = 2
            r11.A0d(r2, r0)
            X.0so r15 = r5.A01
            X.0ua r10 = r5.A08
            X.0xq r9 = r5.A0n
            X.0zG r8 = r5.A13
            X.0sj r7 = r5.A0S
            X.16R r3 = r5.A02
            X.16V r0 = r5.A0o
            X.0yQ r1 = r5.A14
            X.12E r14 = r5.A00
            X.2K4 r13 = new X.2K4
            r18 = r12
            r19 = r7
            r20 = r11
            r21 = r9
            r22 = r0
            r23 = r8
            r24 = r1
            r25 = r2
            r16 = r3
            r17 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = 15
            r13.A01 = r0
            X.0tz r0 = r5.A0R
            android.content.Context r0 = r0.A00
            com.obwhatsapp.location.LocationSharingService.A01(r0, r1)
            X.0sq r1 = r5.A1Y
            java.lang.Void[] r0 = new java.lang.Void[r4]
            r1.Ack(r13, r0)
        L_0x013c:
            r0 = 1000(0x3e8, float:1.401E-42)
            r6.setResult(r0)
            r6.finish()
            return
        L_0x0145:
            if (r5 == 0) goto L_0x0096
            X.0t3 r0 = r10.A1A
            long r0 = r0.A00()
            X.1rC r7 = X.C222617g.A00(r5, r7, r7, r0)
            goto L_0x0096
        L_0x0153:
            r0 = 2131363313(0x7f0a05f1, float:1.8346431E38)
            if (r1 == r0) goto L_0x015f
            r0 = 2131363312(0x7f0a05f0, float:1.834643E38)
            r8 = 28800(0x7080, float:4.0357E-41)
            if (r1 == r0) goto L_0x005c
        L_0x015f:
            r8 = 3600(0xe10, float:5.045E-42)
            goto L_0x005c
        L_0x0163:
            java.lang.Object r8 = r4.A02
            X.0tb r8 = (X.C16760tb) r8
            java.lang.Object r7 = r4.A00
            X.0rv r7 = (X.C15830rv) r7
            java.lang.Object r3 = r4.A01
            java.lang.Integer r3 = (java.lang.Integer) r3
            r2 = 0
            java.lang.String r0 = "UserActions/SetChatArchived; jid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = "; archive="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0xS r0 = r8.A0a
            r0.A04(r7, r3, r2)
            r6 = 0
            X.013 r5 = r8.A0T
            r4 = 2131755051(0x7f10002b, float:1.914097E38)
            r2 = 1
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r6] = r0
            java.lang.String r0 = r5.A0J(r1, r4, r2)
            X.0pt r2 = r8.A03
            r2.A0H(r0, r6)
            r1 = 36
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r0.<init>(r7, r1, r8)
            r2.A0K(r0)
            return
        L_0x01b3:
            java.lang.Object r1 = r4.A01
            X.2kR r1 = (X.C55812kR) r1
            java.lang.Runnable r0 = r1.A02
            if (r0 == 0) goto L_0x01be
            r0.run()
        L_0x01be:
            X.2kS r0 = r1.A01
            if (r0 == 0) goto L_0x01c5
            r0.AKG()
        L_0x01c5:
            java.lang.Object r0 = r4.A02
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r1 = r27
            r0.onClick(r1)
            return
        L_0x01cf:
            X.1fu r7 = new X.1fu
            r7.<init>(r0)
            java.lang.Object r6 = r4.A01
            X.4OI r6 = (X.AnonymousClass4OI) r6
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r5 = r0.getResources()
            boolean r0 = r6.A05
            if (r0 != 0) goto L_0x020b
            java.lang.String r0 = ""
        L_0x01e6:
            r7.A06(r0)
            r2 = 2131892273(0x7f121831, float:1.941929E38)
            r1 = 11
            com.facebook.redex.IDxCListenerShape29S0200000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape29S0200000_2_I1
            r0.<init>(r6, r1, r4)
            r7.setPositiveButton(r2, r0)
            r2 = 2131886996(0x7f120394, float:1.9408587E38)
            r1 = 9
            com.facebook.redex.IDxCListenerShape23S0000000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape23S0000000_2_I1
            r0.<init>(r1)
            r7.setNegativeButton(r2, r0)
            X.02l r0 = r7.create()
            r0.show()
            return
        L_0x020b:
            boolean r1 = r6.A06
            X.0tZ r0 = r6.A00
            if (r1 != 0) goto L_0x0251
            if (r0 == 0) goto L_0x021b
            r2 = 2131888208(0x7f120850, float:1.9411045E38)
        L_0x0216:
            java.lang.String r0 = r5.getString(r2)
            goto L_0x01e6
        L_0x021b:
            X.1s3 r0 = r6.A02
            if (r0 == 0) goto L_0x022e
            java.util.List r0 = r0.A05
            boolean r0 = r0.isEmpty()
            r2 = 2131888235(0x7f12086b, float:1.94111E38)
            if (r0 == 0) goto L_0x0216
            r2 = 2131888230(0x7f120866, float:1.941109E38)
            goto L_0x0216
        L_0x022e:
            X.1rv r0 = r6.A03
            r1 = 1
            if (r0 == 0) goto L_0x0242
            r3 = 2131888220(0x7f12085c, float:1.941107E38)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            java.lang.String r0 = r0.A01
            r2[r1] = r0
            java.lang.String r0 = r5.getString(r3, r2)
            goto L_0x01e6
        L_0x0242:
            X.1s4 r0 = r6.A01
            if (r0 == 0) goto L_0x025a
            int r0 = r0.A01
            r2 = 2131889155(0x7f120c03, float:1.9412966E38)
            if (r0 != r1) goto L_0x0216
            r2 = 2131889154(0x7f120c02, float:1.9412964E38)
            goto L_0x0216
        L_0x0251:
            r2 = 2131888178(0x7f120832, float:1.9410984E38)
            if (r0 == 0) goto L_0x0216
            r2 = 2131888205(0x7f12084d, float:1.9411039E38)
            goto L_0x0216
        L_0x025a:
            java.lang.String r1 = "unhandled failed message"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ViewOnClickCListenerShape0S0300000_I0.A06(android.view.View):void");
    }
}

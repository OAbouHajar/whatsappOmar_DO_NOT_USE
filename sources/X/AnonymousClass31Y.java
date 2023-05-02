package X;

/* renamed from: X.31Y  reason: invalid class name */
public final class AnonymousClass31Y extends C101544xU {
    public final C14550pN A00;
    public final AnonymousClass1LZ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass31Y(C50792aS r5, C25771Lb r6, C14550pN r7, AnonymousClass1LZ r8) {
        super(new C101534xT(), new AnonymousClass3FP(r7, r5.A00.A03.A1T()));
        C18450wi.A0H(r6, 1);
        C18450wi.A0H(r5, 2);
        this.A00 = r7;
        this.A01 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01d9, code lost:
        if (X.C38621r6.A0u(r8) != false) goto L_0x01db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A8o(java.util.Map r21, int r22) {
        /*
            r20 = this;
            r5 = 1
            r6 = r21
            X.C18450wi.A0H(r6, r5)
            r8 = r20
            r0 = r22
            switch(r22) {
                case 1: goto L_0x0012;
                case 2: goto L_0x0050;
                case 3: goto L_0x0062;
                case 4: goto L_0x00a5;
                case 5: goto L_0x00db;
                case 6: goto L_0x02ee;
                case 7: goto L_0x00fa;
                case 8: goto L_0x000d;
                case 9: goto L_0x026d;
                case 10: goto L_0x02c1;
                case 11: goto L_0x000d;
                case 12: goto L_0x000d;
                case 13: goto L_0x000d;
                case 14: goto L_0x000d;
                case 15: goto L_0x0340;
                case 16: goto L_0x000d;
                case 17: goto L_0x000d;
                case 18: goto L_0x0357;
                case 19: goto L_0x0368;
                case 20: goto L_0x0379;
                default: goto L_0x000d;
            }
        L_0x000d:
            boolean r0 = super.A8o(r6, r0)
            return r0
        L_0x0012:
            X.1LZ r0 = r8.A01
            X.10D r5 = r0.A0A
            r4 = 0
            java.util.Collection r0 = r6.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x001f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0046
            X.0tZ r2 = X.C13680ns.A0V(r3)
            X.3r2 r1 = new X.3r2
            r1.<init>()
            X.0w2 r0 = r5.A04
            int r0 = X.C18020w1.A02(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.A01 = r0
            X.0t9 r0 = r5.A05
            r0.A06(r1)
            goto L_0x001f
        L_0x0046:
            X.0sq r2 = r5.A06
            r0 = 20
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r1 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r1.<init>(r5, r0, r6)
            goto L_0x005d
        L_0x0050:
            X.1LZ r0 = r8.A01
            X.10I r3 = r0.A0C
            X.0sq r2 = r3.A04
            r0 = 21
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r1 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r1.<init>(r3, r0, r6)
        L_0x005d:
            r2.Acl(r1)
            goto L_0x0355
        L_0x0062:
            X.1LZ r0 = r8.A01
            X.1LO r1 = r0.A04
            java.lang.Object r6 = X.C810246n.A00(r6)
            X.0tZ r6 = (X.C16740tZ) r6
            X.0pN r5 = r8.A00
            r0 = 0
            X.C18450wi.A0H(r6, r0)
            X.0zJ r4 = r1.A00
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity"
            android.content.Intent r3 = r2.setClassName(r1, r0)
            boolean r0 = r6 instanceof X.C39171s2
            if (r0 == 0) goto L_0x0090
            X.1Vw r0 = r6.A11
            X.AnonymousClass1yL.A00(r3, r0)
        L_0x008b:
            r4.A07(r5, r3)
            goto L_0x0355
        L_0x0090:
            X.1Vw r2 = r6.A11
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "key_id"
            r3.putExtra(r0, r1)
            X.0rv r0 = r2.A00
            java.lang.String r1 = X.C16030sJ.A03(r0)
            java.lang.String r0 = "key_remote_jid"
            r3.putExtra(r0, r1)
            goto L_0x008b
        L_0x00a5:
            X.1LZ r0 = r8.A01
            X.0zL r2 = r0.A02
            X.0pN r3 = r8.A00
            java.util.Collection r0 = r6.values()
            java.util.ArrayList r12 = X.C13680ns.A0n(r0)
            r1 = 36
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r0 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0
            r0.<init>(r1)
            java.util.Collections.sort(r12, r0)
            X.0pt r4 = r2.A00
            X.0zK r10 = r2.A06
            X.0sK r5 = r2.A01
            X.0sG r6 = r2.A02
            X.013 r9 = r2.A05
            X.01V r8 = r2.A04
            X.0sP r7 = r2.A03
            X.0u3 r11 = r2.A08
            X.C47612Jr.A05(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.0z4 r1 = r2.A07
            java.lang.Integer r0 = X.C13680ns.A0Z()
            r1.A0A(r0, r12)
            goto L_0x0355
        L_0x00db:
            boolean r2 = com.obwhatsapp.yo.Conversation.checkMultipleMediaSelected(r6)
            if (r2 != 0) goto L_0x0355
            X.1LZ r0 = r8.A01
            X.1LL r4 = r0.A09
            java.lang.Object r3 = X.C810246n.A00(r6)
            X.0tZ r3 = (X.C16740tZ) r3
            X.0pN r2 = r8.A00
            r0 = 0
            X.C18450wi.A0H(r3, r0)
            X.0tb r1 = r4.A01
            X.0zJ r0 = r4.A00
            r1.A04(r2, r0, r3)
            goto L_0x0355
        L_0x00fa:
            X.1LZ r0 = r8.A01
            X.1LP r4 = r0.A05
            X.0pN r2 = r8.A00
            r3 = 0
            java.util.Collection r0 = r6.values()
            java.util.Iterator r9 = r0.iterator()
        L_0x0109:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0188
            X.0tZ r7 = X.C13680ns.A0V(r9)
            boolean r0 = r7 instanceof X.C16730tY
            if (r0 == 0) goto L_0x0173
            r0 = r7
            X.0tY r0 = (X.C16730tY) r0
            X.0ta r0 = r0.A02
            if (r0 == 0) goto L_0x0173
            boolean r0 = r0.A0P
            if (r0 != 0) goto L_0x0173
            r0 = 4
            java.lang.Byte[] r8 = new java.lang.Byte[r0]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r8[r3] = r0
            r0 = 5
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r8[r5] = r0
            r1 = 2
            r0 = 14
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r8[r1] = r0
            r1 = 3
            r0 = 30
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r8[r1] = r0
            java.util.Set r1 = X.AnonymousClass1F9.A03(r8)
            byte r0 = r7.A10
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0173
            X.1Vw r0 = r7.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0173
            X.0s5 r1 = r4.A01
            X.0s8 r0 = X.C15910s6.A0c
            boolean r0 = r1.A05(r0)
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "ForwardSelectionAction/execute unfinished-upload"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0pt r1 = r4.A00
            r0 = 2131889456(0x7f120d30, float:1.9413576E38)
        L_0x016e:
            r1.A09(r0, r3)
            r0 = 0
            return r0
        L_0x0173:
            byte r1 = r7.A10
            r0 = 8
            if (r1 == r0) goto L_0x017d
            r0 = 10
            if (r1 != r0) goto L_0x0109
        L_0x017d:
            java.lang.String r0 = "ForwardSelectionAction/execute failed call"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0pt r1 = r4.A00
            r0 = 2131889455(0x7f120d2f, float:1.9413574E38)
            goto L_0x016e
        L_0x0188:
            java.util.Collection r19 = r6.values()
            java.util.HashSet r4 = X.C13680ns.A0o()
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            java.util.Iterator r18 = r19.iterator()
            r17 = 0
            r6 = 0
            r15 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            r11 = 1
        L_0x01a1:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0224
            X.0tZ r8 = X.C13680ns.A0V(r18)
            byte r9 = r8.A10
            X.C13690nt.A1O(r4, r9)
            X.1Vw r1 = r8.A11
            X.C18450wi.A0A(r1)
            r7.add(r1)
            X.0rv r0 = r1.A00
            java.lang.String r0 = X.C16030sJ.A03(r0)
            if (r6 != 0) goto L_0x021b
            r6 = r0
        L_0x01c1:
            r0 = 3
            if (r9 != r0) goto L_0x01f2
            r0 = r8
            X.0tY r0 = (X.C16730tY) r0
            int r0 = r0.A00
            long r9 = X.C13690nt.A08(r0)
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d2
            r15 = r9
        L_0x01d2:
            if (r14 != 0) goto L_0x01db
            boolean r0 = X.C38621r6.A0u(r8)
            r14 = 0
            if (r0 == 0) goto L_0x01dc
        L_0x01db:
            r14 = 1
        L_0x01dc:
            if (r12 != 0) goto L_0x01f0
            int r1 = r8.A05
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 >= r0) goto L_0x01f0
            r12 = 0
        L_0x01e5:
            if (r13 != 0) goto L_0x01ee
            boolean r0 = r8.A10(r5)
            r13 = 0
            if (r0 == 0) goto L_0x01a1
        L_0x01ee:
            r13 = 1
            goto L_0x01a1
        L_0x01f0:
            r12 = 1
            goto L_0x01e5
        L_0x01f2:
            r0 = 2
            if (r9 != r0) goto L_0x0200
            int r0 = r8.A08
            if (r0 != r5) goto L_0x01fe
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x01fe
            goto L_0x01d2
        L_0x01fe:
            r11 = 0
            goto L_0x01d2
        L_0x0200:
            if (r9 != 0) goto L_0x01d2
            java.lang.String r0 = r8.A0I()
            X.C18450wi.A0F(r0)
            int r0 = r0.length()
            if (r0 <= r3) goto L_0x01d2
            java.lang.String r0 = r8.A0I()
            X.C18450wi.A0F(r0)
            int r3 = r0.length()
            goto L_0x01d2
        L_0x021b:
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x01c1
            java.lang.String r6 = ""
            goto L_0x01c1
        L_0x0224:
            X.391 r1 = new X.391
            r1.<init>(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.A05 = r0
            r1.A0M = r6
            r1.A0S = r7
            if (r14 == 0) goto L_0x0239
            int r17 = r19.size()
        L_0x0239:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r1.A0H = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r1.A08 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r1.A07 = r0
            java.util.ArrayList r0 = X.C13680ns.A0n(r4)
            r1.A0R = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            r1.A0L = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A0J = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r1.A09 = r0
            android.content.Intent r1 = r1.A00()
            r0 = 2
            r2.startActivityForResult(r1, r0)
            goto L_0x0355
        L_0x026d:
            X.1LZ r0 = r8.A01
            X.1LR r7 = r0.A00
            java.lang.Object r0 = X.C810246n.A00(r6)
            X.0tZ r0 = (X.C16740tZ) r0
            X.0pN r4 = r8.A00
            r2 = 0
            X.C18450wi.A0H(r0, r2)
            com.whatsapp.jid.UserJid r6 = X.C17240ul.A00(r0)
            if (r6 != 0) goto L_0x028d
            X.0pt r1 = r7.A00
            r0 = 2131888681(0x7f120a29, float:1.9412004E38)
            r1.A09(r0, r2)
            goto L_0x0355
        L_0x028d:
            X.0sG r0 = r7.A02
            X.0sH r1 = r0.A08(r6)
            X.1Kt r0 = r7.A06     // Catch:{ ActivityNotFoundException -> 0x02ba }
            android.content.Intent r1 = r0.A00(r1, r6, r5)     // Catch:{ ActivityNotFoundException -> 0x02ba }
            r0 = 13
            r4.startActivityForResult(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x02ba }
            X.0zS r3 = r7.A03     // Catch:{ ActivityNotFoundException -> 0x02ba }
            X.0pd r2 = r3.A03     // Catch:{ ActivityNotFoundException -> 0x02ba }
            r1 = 2805(0xaf5, float:3.93E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ ActivityNotFoundException -> 0x02ba }
            boolean r0 = r2.A0E(r0, r1)     // Catch:{ ActivityNotFoundException -> 0x02ba }
            if (r0 == 0) goto L_0x02b2
            r1 = 21
            r0 = 0
            r3.A01(r6, r0, r1)     // Catch:{ ActivityNotFoundException -> 0x02ba }
        L_0x02b2:
            X.1Ks r1 = r7.A05     // Catch:{ ActivityNotFoundException -> 0x02ba }
            r0 = 5
            r1.A02(r5, r0)     // Catch:{ ActivityNotFoundException -> 0x02ba }
            goto L_0x0355
        L_0x02ba:
            r0 = 12
            X.AnonymousClass29T.A01(r4, r0)
            goto L_0x0355
        L_0x02c1:
            X.1LZ r0 = r8.A01
            X.1LW r4 = r0.A07
            java.lang.Object r1 = X.C810246n.A00(r6)
            X.0tZ r1 = (X.C16740tZ) r1
            X.0pN r3 = r8.A00
            r0 = 0
            X.C18450wi.A0H(r1, r0)
            com.whatsapp.jid.UserJid r1 = X.C17240ul.A00(r1)
            if (r1 == 0) goto L_0x032a
            X.0sG r0 = r4.A01
            X.0sH r2 = r0.A0A(r1)
            X.0zJ r1 = r4.A00
            X.0ph r0 = X.C14750ph.A0q()
            android.content.Intent r0 = r0.A0v(r3, r2)
            r1.A07(r3, r0)
            r3.finish()
            goto L_0x0355
        L_0x02ee:
            X.1LZ r0 = r8.A01
            X.1LS r4 = r0.A01
            java.lang.Object r3 = X.C810246n.A00(r6)
            X.0tZ r3 = (X.C16740tZ) r3
            r2 = 0
            X.C18450wi.A0H(r3, r2)
            boolean r0 = r3 instanceof X.C16730tY
            if (r0 == 0) goto L_0x032a
            r1 = r3
            X.0tY r1 = (X.C16730tY) r1
            X.0ta r0 = r1.A02
            if (r0 != 0) goto L_0x032c
            java.lang.String r0 = "CancelTransferSelectionAction/execute mediaDataV2 is null media_wa_type:"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            byte r0 = r3.A10
            r1.append(r0)
            java.lang.String r0 = " status:"
            r1.append(r0)
            int r0 = r3.A0C
            r1.append(r0)
            java.lang.String r0 = " key:"
            r1.append(r0)
            X.1Vw r0 = r3.A11
            java.lang.String r0 = X.AnonymousClass000.A0f(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x032a:
            r0 = 0
            return r0
        L_0x032c:
            int r0 = X.C38621r6.A06(r1)
            if (r0 == 0) goto L_0x033a
            if (r0 != r5) goto L_0x0355
            X.12c r0 = r4.A01
            r0.A0B(r1, r2, r2)
            goto L_0x0355
        L_0x033a:
            X.1HE r0 = r4.A00
            r0.A04(r3, r2)
            goto L_0x0355
        L_0x0340:
            java.lang.Object r2 = X.C810246n.A00(r6)
            X.0tZ r2 = (X.C16740tZ) r2
            X.0pN r1 = r8.A00
            r0 = 0
            X.C18450wi.A0H(r2, r0)
            X.43C r0 = X.AnonymousClass43C.LONG_PRESS
            com.obwhatsapp.conversation.conversationrow.messagerating.MessageRatingFragment r0 = com.obwhatsapp.conversation.conversationrow.messagerating.MessageRatingFragment.A01(r0, r2)
            r1.Afc(r0)
        L_0x0355:
            r0 = 1
            return r0
        L_0x0357:
            X.1LZ r0 = r8.A01
            X.1LT r2 = r0.A06
            java.lang.Object r1 = X.C810246n.A00(r6)
            X.0tZ r1 = (X.C16740tZ) r1
            X.0pN r0 = r8.A00
            boolean r0 = r2.A03(r0, r1)
            return r0
        L_0x0368:
            X.1LZ r0 = r8.A01
            X.1LX r2 = r0.A0B
            java.lang.Object r1 = X.C810246n.A00(r6)
            X.0tZ r1 = (X.C16740tZ) r1
            X.0pN r0 = r8.A00
            boolean r0 = r2.A03(r0, r1)
            return r0
        L_0x0379:
            X.1LZ r0 = r8.A01
            X.1LM r1 = r0.A03
            X.0pN r0 = r8.A00
            boolean r0 = r1.A02(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31Y.A8o(java.util.Map, int):boolean");
    }
}

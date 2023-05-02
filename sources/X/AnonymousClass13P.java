package X;

/* renamed from: X.13P  reason: invalid class name */
public class AnonymousClass13P extends C208111r {
    public final C18080w7 A00;
    public final C18090w8 A01;
    public final C18290wS A02;
    public final AnonymousClass13O A03;
    public final AnonymousClass1Vo A04 = AnonymousClass1Vo.A00("PaymentsMessageHandler", "infra", "COMMON");

    public AnonymousClass13P(C16300so r11, C18080w7 r12, C17190ug r13, C207811o r14, C18090w8 r15, C18290wS r16, AnonymousClass13O r17, C16320sq r18) {
        super(r11, r13, r14, r18, new int[]{247}, true);
        this.A00 = r12;
        this.A02 = r16;
        this.A01 = r15;
        this.A03 = r17;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0283, code lost:
        if (r7 == false) goto L_0x0285;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C28371Vv r18, int r19) {
        /*
            r17 = this;
            r6 = r18
            X.1Vv[] r1 = r6.A03
            if (r1 == 0) goto L_0x031f
            int r3 = r1.length
            if (r3 <= 0) goto L_0x031f
            r0 = 0
        L_0x000a:
            r4 = r1[r0]
            java.lang.String r5 = r4.A00
            java.lang.String r2 = "upi"
            boolean r5 = r5.equals(r2)
            java.lang.String r8 = "from"
            r2 = r17
            if (r5 == 0) goto L_0x0070
            java.lang.Class<com.whatsapp.jid.Jid> r7 = com.whatsapp.jid.Jid.class
            X.0so r5 = r2.A00
            com.whatsapp.jid.Jid r5 = r6.A0F(r5, r7, r8)
            com.whatsapp.jid.UserJid r12 = com.whatsapp.jid.UserJid.of(r5)
            r10 = 3
            java.lang.String r5 = "consumer_status"
            X.1Vv r7 = r4.A0J(r5)
            if (r7 == 0) goto L_0x0087
            java.lang.String r5 = "value"
            r13 = 0
            java.lang.String r9 = r7.A0N(r5, r13)
            java.lang.String r5 = "dhash"
            java.lang.String r8 = r7.A0N(r5, r13)
            if (r12 == 0) goto L_0x0087
            X.0w8 r5 = r2.A01
            boolean r5 = r5.A08()
            if (r5 == 0) goto L_0x0087
            X.1Vo r7 = r2.A04
            java.lang.String r5 = "onPaymentConsumerStatusUpdate"
            r7.A06(r5)
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            X.01Q r5 = new X.01Q
            r5.<init>(r9, r8)
            r15.put(r7, r5)
            X.0wS r5 = r2.A02
            r5.A06()
            X.160 r11 = r5.A09
            monitor-enter(r11)
            r16 = r13
            r14 = r13
            r11.A0J(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x031c }
            monitor-exit(r11)
            goto L_0x0087
        L_0x0070:
            java.lang.String r7 = r4.A00
            java.lang.String r5 = "fbpay"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x00db
            java.lang.Class<com.whatsapp.jid.Jid> r7 = com.whatsapp.jid.Jid.class
            X.0so r5 = r2.A00
            com.whatsapp.jid.Jid r5 = r6.A0F(r5, r7, r8)
            com.whatsapp.jid.UserJid r12 = com.whatsapp.jid.UserJid.of(r5)
            r10 = 1
        L_0x0087:
            java.lang.String r5 = "eligible_offers"
            X.1Vv r8 = r4.A0J(r5)
            if (r8 == 0) goto L_0x00d5
            java.lang.String r4 = "offer"
            X.1Vv r7 = r8.A0J(r4)
            java.lang.String r4 = "dhash"
            r5 = 0
            java.lang.String r9 = r8.A0N(r4, r5)
            if (r7 == 0) goto L_0x00d5
            java.lang.String r4 = "id"
            java.lang.String r8 = r7.A0N(r4, r5)
            if (r12 == 0) goto L_0x00d5
            X.0w8 r4 = r2.A01
            boolean r4 = r4.A08()
            if (r4 == 0) goto L_0x00d5
            X.1Vo r5 = r2.A04
            java.lang.String r4 = "onPaymentConsumerOfferEligibilityUpdate"
            r5.A06(r4)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            X.01Q r4 = new X.01Q
            r4.<init>(r8, r9)
            r7.put(r5, r4)
            X.0wS r2 = r2.A02
            r2.A06()
            X.160 r11 = r2.A09
            r13 = 0
            r15 = r13
            r14 = r13
            r16 = r7
            r11.A0J(r12, r13, r14, r15, r16)
        L_0x00d5:
            int r0 = r0 + 1
            if (r0 >= r3) goto L_0x031f
            goto L_0x000a
        L_0x00db:
            java.lang.String r7 = r4.A00
            java.lang.String r5 = "document_verification_status"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x0134
            X.0w8 r5 = r2.A01
            boolean r5 = r5.A09()
            if (r5 == 0) goto L_0x00d5
            java.lang.String r5 = "request_code"
            X.1Vv r7 = r4.A0J(r5)
            if (r7 == 0) goto L_0x00d5
            java.lang.String r5 = "value"
            r4 = 0
            java.lang.String r5 = r7.A0N(r5, r4)
            java.lang.String r4 = "review_complete_allow"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0126
            X.13O r9 = r2.A03
            r8 = 37
        L_0x010a:
            X.109 r7 = r9.A07
            X.0sq r5 = r7.A08
            r4 = 20
            com.facebook.redex.RunnableRunnableShape0S0101000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0101000_I0
            r2.<init>((java.lang.Object) r7, (int) r8, (int) r4)
            r5.Acl(r2)
            X.0pt r7 = r9.A01
            X.1Tx r5 = r9.A08
        L_0x011c:
            r4 = 5
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11 r2 = new com.facebook.redex.RunnableRunnableShape12S0100000_I0_11
            r2.<init>((java.lang.Object) r5, (int) r4)
            r7.A0K(r2)
            goto L_0x00d5
        L_0x0126:
            java.lang.String r4 = "review_complete_block"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00d5
            X.13O r9 = r2.A03
            r8 = 38
            goto L_0x010a
        L_0x0134:
            java.lang.String r7 = r4.A00
            java.lang.String r5 = "alias"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x01cf
            java.lang.String r11 = "alias_status"
            r7 = 0
            java.lang.String r5 = r4.A0N(r11, r7)
            if (r5 == 0) goto L_0x01cf
            java.lang.String r7 = r4.A0N(r11, r7)
            java.lang.String r5 = "deregistered"
            boolean r5 = r7.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x01cf
            X.13O r8 = r2.A03
            X.0w8 r2 = r8.A0E
            X.0pd r7 = r2.A03
            r5 = 1458(0x5b2, float:2.043E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r2 = r7.A0E(r2, r5)
            if (r2 == 0) goto L_0x00d5
            X.0wU r9 = r8.A0D
            java.lang.String r13 = "upiAlias"
            X.2gP r12 = new X.2gP     // Catch:{ 1W9 -> 0x01a8 }
            r12.<init>()     // Catch:{ 1W9 -> 0x01a8 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            java.lang.String r5 = "alias_value"
            r2 = 0
            java.lang.String r2 = r4.A0N(r5, r2)     // Catch:{ 1W9 -> 0x01a8 }
            X.1lh r10 = new X.1lh     // Catch:{ 1W9 -> 0x01a8 }
            r10.<init>(r12, r7, r2, r13)     // Catch:{ 1W9 -> 0x01a8 }
            java.lang.String r2 = "alias_type"
            java.lang.String r7 = r4.A0M(r2)     // Catch:{ 1W9 -> 0x01a8 }
            java.lang.String r2 = "alias_id"
            java.lang.String r5 = r4.A0M(r2)     // Catch:{ 1W9 -> 0x01a8 }
            java.lang.String r2 = r4.A0M(r11)     // Catch:{ 1W9 -> 0x01a8 }
            X.2gR r4 = new X.2gR     // Catch:{ 1W9 -> 0x01a8 }
            r4.<init>(r10, r7, r5, r2)     // Catch:{ 1W9 -> 0x01a8 }
            X.174 r2 = r9.A0E     // Catch:{ 1W9 -> 0x01a8 }
            X.1cm r2 = r2.A01()     // Catch:{ 1W9 -> 0x01a8 }
            if (r2 == 0) goto L_0x01bc
            X.1Vz r2 = r2.A02     // Catch:{ 1W9 -> 0x01a8 }
            X.19r r2 = r9.A03(r2)     // Catch:{ 1W9 -> 0x01a8 }
            X.19f r2 = r2.AEO()     // Catch:{ 1W9 -> 0x01a8 }
            if (r2 == 0) goto L_0x01bc
            r2.A01(r4)     // Catch:{ 1W9 -> 0x01a8 }
            goto L_0x01bc
        L_0x01a8:
            r7 = move-exception
            X.1Vo r5 = r9.A0I
            java.lang.String r4 = "removeAlias corrupt stream exception: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r5.A05(r2)
        L_0x01bc:
            X.109 r7 = r8.A07
            X.0sq r5 = r7.A08
            r4 = 0
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11 r2 = new com.facebook.redex.RunnableRunnableShape12S0100000_I0_11
            r2.<init>((java.lang.Object) r7, (int) r4)
            r5.Acl(r2)
            X.0pt r7 = r8.A01
            X.1Tx r5 = r8.A08
            goto L_0x011c
        L_0x01cf:
            java.lang.String r7 = r4.A00
            java.lang.String r5 = "account-recovery"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x0239
            java.lang.String r7 = "service"
            java.lang.String r5 = r4.A0M(r7)
            java.lang.String r9 = "UPI"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x02c8
            X.0w8 r7 = r2.A01
            boolean r5 = r7.A09()
            if (r5 == 0) goto L_0x00d5
            X.0pd r8 = r7.A03
            r7 = 1644(0x66c, float:2.304E-42)
            X.0tM r5 = X.C16620tM.A02
            boolean r5 = r8.A0E(r5, r7)
            if (r5 == 0) goto L_0x00d5
            java.lang.String r7 = "recovered"
            r5 = 0
            java.lang.String r5 = r4.A0N(r7, r5)
            X.0wS r4 = r2.A02
            X.AnonymousClass00B.A06(r4)
            X.19r r9 = r4.A04(r9)
            X.AnonymousClass00B.A06(r9)
            r2.A04(r9)
            java.lang.String r4 = "1"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00d5
            X.13O r8 = r2.A03
            X.AnonymousClass00B.A06(r9)
            X.19a r7 = r9.AB3()
            X.AnonymousClass00B.A06(r7)
            r2 = 1
            r4 = 0
            r7.AhN(r4, r2)
            X.0wU r5 = r8.A0D
            X.2gS r4 = new X.2gS
            r4.<init>(r7, r8)
            r2 = 3
            r5.A09(r4, r9, r2)
            goto L_0x00d5
        L_0x0239:
            java.lang.String r5 = "alert"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x00d5
            java.lang.String r5 = "id"
            java.lang.String r10 = r4.A0M(r5)
            java.lang.String r5 = "title"
            java.lang.String r11 = r4.A0M(r5)
            java.lang.String r5 = "description"
            java.lang.String r12 = r4.A0M(r5)
            java.lang.String r5 = "button_text"
            java.lang.String r13 = r4.A0M(r5)
            java.lang.String r5 = "scope"
            java.lang.String r14 = r4.A0M(r5)
            java.lang.String r5 = "type"
            java.lang.String r8 = r4.A0M(r5)
            int r9 = r8.hashCode()
            r7 = 71338169(0x44088b9, float:2.2632272E-36)
            r5 = 1
            if (r9 == r7) goto L_0x02c0
            r7 = 696544730(0x29846dda, float:5.881034E-14)
            if (r9 == r7) goto L_0x0285
            r7 = 1842428796(0x6dd13b7c, float:8.094285E27)
            if (r9 != r7) goto L_0x0285
            java.lang.String r7 = "WARNING"
            boolean r7 = r8.equals(r7)
            r15 = 2
        L_0x0283:
            if (r7 != 0) goto L_0x0286
        L_0x0285:
            r15 = 1
        L_0x0286:
            java.lang.String r7 = "dismissible"
            int r7 = r4.A0A(r7, r5)
            if (r7 == r5) goto L_0x028f
            r5 = 0
        L_0x028f:
            java.lang.String r7 = "phoenix"
            X.1Vv r7 = r4.A0J(r7)
            if (r7 == 0) goto L_0x02be
            java.lang.String r4 = "config"
            java.lang.String r4 = r7.A0M(r4)
            X.2gT r8 = new X.2gT
            r8.<init>(r4)
        L_0x02a2:
            r9 = 0
            X.2KI r7 = new X.2KI
            r16 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.0w7 r4 = r2.A00
            r4.A04(r7)
            X.13O r5 = r2.A03
            java.lang.String r4 = r7.A06
            X.109 r2 = r5.A07
            r2.A01(r4)
            X.0pt r7 = r5.A01
            X.1Tx r5 = r5.A08
            goto L_0x011c
        L_0x02be:
            r8 = 0
            goto L_0x02a2
        L_0x02c0:
            java.lang.String r7 = "ADVISORY"
            boolean r7 = r8.equals(r7)
            r15 = 3
            goto L_0x0283
        L_0x02c8:
            java.lang.String r7 = r4.A0M(r7)
            java.lang.String r5 = "BR"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x00d5
            X.0w8 r7 = r2.A01
            boolean r5 = r7.A09()
            if (r5 == 0) goto L_0x00d5
            X.0pd r8 = r7.A03
            r7 = 2000(0x7d0, float:2.803E-42)
            X.0tM r5 = X.C16620tM.A02
            boolean r5 = r8.A0E(r5, r7)
            if (r5 == 0) goto L_0x00d5
            java.lang.String r5 = "recovered"
            r8 = 0
            java.lang.String r7 = r4.A0N(r5, r8)
            java.lang.String r5 = "1"
            boolean r9 = r5.equals(r7)
            java.lang.String r5 = "suspended-ts"
            java.lang.String r7 = r4.A0N(r5, r8)
            r4 = 0
            long r4 = X.C29501aj.A01(r7, r4)
            X.0wS r8 = r2.A02
            java.lang.String r7 = "FBPAY"
            X.19r r7 = r8.A04(r7)
            X.AnonymousClass00B.A06(r7)
            r2.A04(r7)
            X.19a r2 = r7.AB3()
            X.AnonymousClass00B.A06(r2)
            r2.AhN(r4, r9)
            goto L_0x00d5
        L_0x031c:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x031f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass13P.A01(X.1Vv, int):void");
    }

    public void A04(C228919r r6) {
        C1222969a ACC = r6.ACC();
        if (ACC != null) {
            C53842gO A7M = ACC.A7M();
            A7M.A08 = 3;
            A7M.A0a = "api_event";
            A7M.A0B = 25;
            AnonymousClass1Vo r2 = this.A04;
            StringBuilder sb = new StringBuilder("PaymentUserActionEvent accountRecovery event: ");
            sb.append(A7M.toString());
            r2.A06(sb.toString());
            ACC.AKR(A7M);
        }
    }
}

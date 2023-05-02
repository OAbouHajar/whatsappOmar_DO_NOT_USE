package X;

/* renamed from: X.18M  reason: invalid class name */
public class AnonymousClass18M {
    public final C14870pt A00;
    public final C16460t6 A01;
    public final C16070sO A02;
    public final C16900tq A03;
    public final AnonymousClass192 A04;
    public final C222817i A05;
    public final AnonymousClass18O A06;
    public final AnonymousClass124 A07;

    public AnonymousClass18M(C14870pt r1, C16460t6 r2, C16070sO r3, C16900tq r4, AnonymousClass192 r5, C222817i r6, AnonymousClass18O r7, AnonymousClass124 r8) {
        this.A00 = r1;
        this.A07 = r8;
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = r4;
        this.A06 = r7;
        this.A02 = r3;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r1 == 13) goto L_0x0050;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x009a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C16740tZ r7, int r8) {
        /*
            r6 = this;
            r0 = 1
            if (r8 == r0) goto L_0x00c1
            r0 = 2
            if (r8 == r0) goto L_0x00a3
            r0 = 4
            if (r8 == r0) goto L_0x00a0
            r0 = 7
            if (r8 == r0) goto L_0x0033
            r0 = 8
            if (r8 == r0) goto L_0x0030
            switch(r8) {
                case 3009: goto L_0x0027;
                case 3010: goto L_0x002a;
                case 3011: goto L_0x002d;
                case 3012: goto L_0x00b0;
                case 3013: goto L_0x00a6;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.String r1 = "Unhandled action "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = r0.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0027:
            java.lang.String r0 = "groupactionhandler/handleGroupAction/handle groupchat announcements only change"
            goto L_0x00a8
        L_0x002a:
            java.lang.String r0 = "groupactionhandler/community_link_change"
            goto L_0x00a8
        L_0x002d:
            java.lang.String r0 = "groupactionhandler/sibling_link"
            goto L_0x00a8
        L_0x0030:
            java.lang.String r0 = "groupactionhandler/handle_growth_lock_change"
            goto L_0x00a8
        L_0x0033:
            java.lang.String r0 = "groupactionhandler/handle_user_remove"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = r7
            X.1sE r5 = (X.C39291sE) r5
            X.1Vw r0 = r5.A11
            X.0rv r0 = r0.A00
            com.whatsapp.jid.GroupJid r4 = com.whatsapp.jid.GroupJid.of(r0)
            X.AnonymousClass00B.A06(r4)
            int r1 = r5.A00
            r0 = 5
            if (r1 == r0) goto L_0x0050
            r0 = 13
            r3 = 0
            if (r1 != r0) goto L_0x0051
        L_0x0050:
            r3 = 1
        L_0x0051:
            X.192 r0 = r6.A04
            X.0pd r2 = r0.A02
            r0 = 1613(0x64d, float:2.26E-42)
            X.0tM r1 = X.C16620tM.A02
            boolean r0 = r2.A0E(r1, r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 1527(0x5f7, float:2.14E-42)
            boolean r0 = r2.A0E(r1, r0)
            if (r0 == 0) goto L_0x00ab
            if (r3 == 0) goto L_0x00ab
            X.0sO r3 = r6.A02
            boolean r0 = r3.A0A(r4)
            if (r0 != 0) goto L_0x00ab
            X.0tq r0 = r6.A03
            X.0tf r2 = r0.A02()
            X.1cj r1 = r2.A00()     // Catch:{ all -> 0x009b }
            r3.A08(r5)     // Catch:{ all -> 0x0096 }
            X.17i r0 = r6.A05     // Catch:{ all -> 0x0096 }
            r0.A00(r2, r4)     // Catch:{ all -> 0x0096 }
            r1.A00()     // Catch:{ all -> 0x0096 }
            r1.close()     // Catch:{ all -> 0x009b }
            r2.close()
            X.1ci r1 = r5.A04
            if (r1 == 0) goto L_0x00b0
            X.124 r0 = r6.A07
            r0.A02(r1)
            goto L_0x00b0
        L_0x0096:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x009a }
        L_0x009a:
            throw r0     // Catch:{ all -> 0x009b }
        L_0x009b:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x009f }
        L_0x009f:
            throw r0
        L_0x00a0:
            java.lang.String r0 = "groupactionhandler/handleGroupAction/handle_groupchat_subject_change"
            goto L_0x00a8
        L_0x00a3:
            java.lang.String r0 = "groupactionhandler/handleGroupAction/handle_add_groupchat_msg"
            goto L_0x00a8
        L_0x00a6:
            java.lang.String r0 = "groupactionhandler/handle_group_linked_with_membership_approval_mode"
        L_0x00a8:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00ab:
            X.0t6 r0 = r6.A01
            r0.A0W(r7)
        L_0x00b0:
            X.1Vw r0 = r7.A11
            X.0rv r3 = r0.A00
            X.0pt r2 = r6.A00
            r1 = 26
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r0.<init>(r6, r1, r3)
            r2.A0K(r0)
            return
        L_0x00c1:
            java.lang.String r0 = "groupactionhandler/handleGroupAction/handle-init-group-chat"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0t6 r0 = r6.A01
            r0.A0W(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass18M.A00(X.0tZ, int):void");
    }
}

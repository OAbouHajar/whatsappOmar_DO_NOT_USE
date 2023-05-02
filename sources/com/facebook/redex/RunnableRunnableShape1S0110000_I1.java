package com.facebook.redex;

import X.C57282qe;

public class RunnableRunnableShape1S0110000_I1 implements Runnable {
    public Object A00;
    public boolean A01;
    public final int A02;

    public RunnableRunnableShape1S0110000_I1(C57282qe r2, int i2) {
        this.A02 = i2;
        this.A00 = r2;
        this.A01 = true;
    }

    public RunnableRunnableShape1S0110000_I1(Object obj, int i2, boolean z2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = z2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:134:0x0364 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.A02
            switch(r0) {
                case 0: goto L_0x013b;
                case 1: goto L_0x0147;
                case 2: goto L_0x006b;
                case 3: goto L_0x0151;
                case 4: goto L_0x008b;
                case 5: goto L_0x01df;
                case 6: goto L_0x01f0;
                case 7: goto L_0x00a4;
                case 8: goto L_0x0211;
                case 9: goto L_0x0119;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r13.A00
            com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment r2 = (com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment) r2
            boolean r0 = r13.A01
            if (r0 == 0) goto L_0x0016
            X.13k r5 = r2.A01
            X.1jm r4 = r2.A03
            r3 = 0
        L_0x0012:
            r5.A0F(r3, r4)
        L_0x0015:
            return
        L_0x0016:
            X.13k r1 = r2.A02
            X.1jm r0 = r2.A03
            java.lang.String r0 = r0.A0D
            android.util.Pair r0 = r1.A0A(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r0.second
            long r10 = X.C13700nu.A01(r0)
        L_0x0028:
            X.1jm r0 = r2.A03
            java.lang.String r7 = r0.A0D
            if (r7 == 0) goto L_0x0063
            X.0xU r4 = r2.A00
            X.15h r3 = r4.A0T
            java.lang.String r0 = "removeRecentSticker"
            java.lang.Object r1 = r3.A02(r0)
            X.1j3 r1 = (X.C33721j3) r1
            if (r1 == 0) goto L_0x0063
            boolean r0 = r4.A0X()
            if (r0 == 0) goto L_0x0063
            X.0t3 r0 = r1.A00
            long r8 = r0.A00()
            r5 = 0
            r12 = 0
            X.1oi r4 = new X.1oi
            r6 = r5
            r4.<init>(r5, r6, r7, r8, r10, r12)
            java.util.List r0 = java.util.Collections.singletonList(r4)
            java.util.Set r1 = r3.A04(r0)
        L_0x0058:
            X.13k r5 = r2.A02
            X.1jm r4 = r2.A03
            r0 = 1
            com.facebook.redex.IDxCallbackShape71S0200000_2_I1 r3 = new com.facebook.redex.IDxCallbackShape71S0200000_2_I1
            r3.<init>(r2, r0, r1)
            goto L_0x0012
        L_0x0063:
            java.util.Set r1 = java.util.Collections.emptySet()
            goto L_0x0058
        L_0x0068:
            r10 = 0
            goto L_0x0028
        L_0x006b:
            java.lang.Object r3 = r13.A00
            X.373 r3 = (X.AnonymousClass373) r3
            boolean r2 = r13.A01
            java.lang.ref.WeakReference r0 = r3.A0A
            java.lang.Object r1 = r0.get()
            X.3Q1 r1 = (X.AnonymousClass3Q1) r1
            if (r1 == 0) goto L_0x0015
            boolean r0 = X.C16690tT.A02(r3)
            if (r0 != 0) goto L_0x0015
            X.027 r1 = r1.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A09(r0)
            return
        L_0x008b:
            java.lang.Object r0 = r13.A00
            X.2qe r0 = (X.C57282qe) r0
            X.1DO r0 = r0.A04
            X.0rz r1 = r0.A01
            boolean r0 = r1.A1d()
            if (r0 != 0) goto L_0x0015
            r2 = 1
            android.content.SharedPreferences$Editor r1 = r1.A0K()
            java.lang.String r0 = "companion_reg_opt_in_enabled"
            X.C13680ns.A0z(r1, r0, r2)
            return
        L_0x00a4:
            java.lang.Object r0 = r13.A00
            com.facebook.redex.IDxICallbackShape450S0100000_2_I0 r0 = (com.facebook.redex.IDxICallbackShape450S0100000_2_I0) r0
            boolean r1 = r13.A01
            java.lang.Object r0 = r0.A00
            X.2fj r0 = (X.C53452fj) r0
            X.1GO r5 = r0.A02
            if (r1 == 0) goto L_0x0015
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            X.0sG r0 = r5.A04
            java.util.ArrayList r0 = r0.A0F()
            java.util.Iterator r2 = r0.iterator()
        L_0x00c0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00e0
            X.0sH r1 = X.C13680ns.A0U(r2)
            boolean r0 = r1.A0G()
            if (r0 == 0) goto L_0x00c0
            X.0rv r0 = r1.A0E
            boolean r0 = X.AnonymousClass288.A04(r0)
            if (r0 != 0) goto L_0x00c0
            com.whatsapp.jid.Jid r0 = X.C16010sH.A03(r1)
            r3.add(r0)
            goto L_0x00c0
        L_0x00e0:
            X.0xz r2 = r5.A05
            X.1kz r1 = X.C34861kz.A0C
            X.27w r0 = X.C453027w.A0H
            X.284 r0 = r2.A00(r0, r1, r3)
            boolean r4 = r0.A00()
            if (r4 == 0) goto L_0x0015
            java.util.Iterator r2 = r3.iterator()
        L_0x00f4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010b
            java.lang.Object r1 = r2.next()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.0wS r0 = r5.A0F
            r0.A06()
            X.160 r0 = r0.A09
            r0.A0G(r1)
            goto L_0x00f4
        L_0x010b:
            X.2fU r3 = r5.A02()     // Catch:{ Exception -> 0x0374 }
            X.2fV r0 = r5.A01()     // Catch:{ Exception -> 0x0374 }
            if (r3 == 0) goto L_0x0015
            if (r0 == 0) goto L_0x0015
            goto L_0x036a
        L_0x0119:
            java.lang.Object r0 = r13.A00
            X.2nj r0 = (X.C56482nj) r0
            boolean r1 = r13.A01
            java.lang.ref.WeakReference r0 = r0.A0D
            java.lang.Object r3 = r0.get()
            X.34y r3 = (X.AnonymousClass34y) r3
            if (r3 == 0) goto L_0x0015
            if (r1 == 0) goto L_0x037b
            r0 = 1
            r3.A03 = r0
            X.4Ta r0 = r3.A05
            r0.A01()
            X.1PA r0 = r3.A0B
            boolean r0 = r0.A05
            r3.A0B(r0)
            return
        L_0x013b:
            java.lang.Object r0 = r13.A00
            X.4TD r0 = (X.AnonymousClass4TD) r0
            boolean r1 = r13.A01
            X.5TI r0 = r0.A01
            r0.AXJ(r1)
            return
        L_0x0147:
            java.lang.Object r1 = r13.A00
            X.1aI r1 = (X.C29251aI) r1
            boolean r0 = r13.A01
            r1.A0V(r0)
            return
        L_0x0151:
            java.lang.Object r0 = r13.A00
            com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0 r0 = (com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0) r0
            boolean r4 = r13.A01
            java.lang.Object r6 = r0.A00
            com.obwhatsapp.community.AddGroupsToCommunityActivity r6 = (com.obwhatsapp.community.AddGroupsToCommunityActivity) r6
            X.2qf r0 = r6.A02
            X.2OJ r0 = r0.A07
            java.lang.Object r0 = r0.A01()
            java.util.Set r0 = (java.util.Set) r0
            int r3 = r0.size()
            X.0uk r0 = r6.A03
            X.0pd r2 = r0.A0D
            r1 = 1990(0x7c6, float:2.789E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r2.A03(r0, r1)
            int r5 = r0 + 1
            int r5 = r5 - r3
            if (r5 <= 0) goto L_0x01db
            if (r4 == 0) goto L_0x01c7
            X.2qf r0 = r6.A02
            X.2OJ r0 = r0.A08
            java.lang.Object r2 = r0.A01()
            java.util.Collection r2 = (java.util.Collection) r2
            r1 = 1
            com.facebook.redex.IDxFunctionShape49S0000000_2_I1 r0 = new com.facebook.redex.IDxFunctionShape49S0000000_2_I1
            r0.<init>(r1)
            java.util.Collection r4 = X.C90534eK.transform(r2, r0)
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "extra_community_name"
            java.lang.String r3 = r1.getStringExtra(r0)
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.community.LinkExistingGroups"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "max_groups_allowed_to_link"
            r2.putExtra(r0, r5)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x01bc
            java.util.ArrayList r1 = X.C13680ns.A0n(r4)
            java.lang.String r0 = "selected"
            r2.putExtra(r0, r1)
        L_0x01bc:
            java.lang.String r0 = "community_name"
            r2.putExtra(r0, r3)
            r0 = 10
            r6.Ag3(r2, r0)
            return
        L_0x01c7:
            r8 = 0
            r9 = 2131889651(0x7f120df3, float:1.9413972E38)
            r10 = 2131887633(0x7f120611, float:1.9409879E38)
            r11 = 2131886996(0x7f120394, float:1.9408587E38)
            r0 = 2
            com.facebook.redex.IDxCListenerShape238S0100000_2_I1 r7 = new com.facebook.redex.IDxCListenerShape238S0100000_2_I1
            r7.<init>(r6, r0)
            r6.A2b(r7, r8, r9, r10, r11)
            return
        L_0x01db:
            r6.A38()
            return
        L_0x01df:
            java.lang.Object r3 = r13.A00
            X.2qe r3 = (X.C57282qe) r3
            r2 = 1
            X.027 r1 = r3.A01
            r0 = 0
            r1.A0B(r0)
            X.027 r0 = r3.A02
            X.C13700nu.A0V(r0, r2)
            return
        L_0x01f0:
            java.lang.Object r3 = r13.A00
            com.obwhatsapp.conversation.conversationrow.SecurityNotificationDialogFragment r3 = (com.obwhatsapp.conversation.conversationrow.SecurityNotificationDialogFragment) r3
            boolean r0 = r13.A01
            X.0uj r1 = r3.A06
            if (r0 == 0) goto L_0x020e
            java.lang.String r0 = "26000361"
        L_0x01fc:
            android.net.Uri r0 = r1.A04(r0)
            android.content.Intent r2 = X.C13690nt.A0B(r0)
            X.0zJ r1 = r3.A00
            android.content.Context r0 = r3.A0u()
            r1.A06(r0, r2)
            return
        L_0x020e:
            java.lang.String r0 = "28030014"
            goto L_0x01fc
        L_0x0211:
            java.lang.Object r0 = r13.A00
            com.facebook.redex.IDxCListenerShape338S0100000_2_I0 r0 = (com.facebook.redex.IDxCListenerShape338S0100000_2_I0) r0
            boolean r7 = r13.A01
            java.lang.Object r4 = r0.A00
            com.obwhatsapp.settings.SettingsChatHistoryFragment r4 = (com.obwhatsapp.settings.SettingsChatHistoryFragment) r4
            X.0tb r5 = r4.A03
            X.0rs r0 = r5.A0O
            java.util.List r0 = r0.A05()
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            java.util.HashSet r6 = X.C13680ns.A0o()
            java.util.Iterator r9 = r0.iterator()
        L_0x022f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0279
            X.0rv r8 = X.C13700nu.A0B(r9)
            X.0rt r0 = r5.A0b
            int r0 = r0.A00(r8)
            if (r0 <= 0) goto L_0x0253
            X.0pj r1 = r5.A1I
            r0 = 0
            r1.A0A(r8, r0)
            X.0pt r3 = r5.A03
            r1 = 37
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r0.<init>(r8, r1, r5)
            r3.A0K(r0)
        L_0x0253:
            X.14t r0 = r5.A0c
            X.0sH r1 = r0.A01(r8)
            boolean r0 = r1.A0J()
            if (r0 != 0) goto L_0x0266
            X.1ko r0 = r1.A0D
            if (r0 != 0) goto L_0x0266
            r2.add(r1)
        L_0x0266:
            boolean r0 = r1.A0J()
            if (r0 != 0) goto L_0x026f
            r5.A0C(r8)
        L_0x026f:
            X.0xU r0 = r5.A0I
            java.util.Set r0 = r0.A0E(r8, r7)
            r6.addAll(r0)
            goto L_0x022f
        L_0x0279:
            X.0sG r0 = r5.A0J
            r0.A0X(r2)
            X.0t6 r3 = r5.A0e
            java.lang.String r0 = "msgstore/deleteallmsgs"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Zf r9 = new X.1Zf
            r9.<init>((java.lang.String) r0)
            java.util.Map r0 = r3.A1o
            r0.clear()
            X.0tq r0 = r3.A0v
            X.0tf r8 = r0.A02()
            X.1cj r11 = r8.A00()     // Catch:{ all -> 0x0365 }
            X.0tg r1 = r8.A02     // Catch:{ all -> 0x0360 }
            java.lang.String r0 = "DELETE FROM chat WHERE _id IN  (SELECT c._id FROM chat AS c LEFT JOIN jid AS j ON c.jid_row_id=j._id WHERE j.type != 1)"
            r1.A0B(r0)     // Catch:{ all -> 0x0360 }
            r3.A0k(r9)     // Catch:{ all -> 0x0360 }
            X.0rt r1 = r3.A0O     // Catch:{ all -> 0x0360 }
            monitor-enter(r1)     // Catch:{ all -> 0x0360 }
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0C()     // Catch:{ all -> 0x035d }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x035d }
            monitor-exit(r1)     // Catch:{ all -> 0x0360 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x0360 }
        L_0x02b3:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0360 }
            if (r0 == 0) goto L_0x02dc
            java.util.Map$Entry r0 = X.AnonymousClass000.A0z(r10)     // Catch:{ all -> 0x0360 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x0360 }
            X.0rv r2 = (X.C15830rv) r2     // Catch:{ all -> 0x0360 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0360 }
            X.0rx r1 = (X.C15840rx) r1     // Catch:{ all -> 0x0360 }
            r1.A08()     // Catch:{ all -> 0x0360 }
            boolean r0 = X.C16030sJ.A0N(r2)     // Catch:{ all -> 0x0360 }
            if (r0 == 0) goto L_0x02b3
            int r1 = r1.A00     // Catch:{ all -> 0x0360 }
            r0 = 1
            if (r1 != r0) goto L_0x02b3
            r0 = 0
            r3.A0s(r2, r0)     // Catch:{ all -> 0x0360 }
            goto L_0x02b3
        L_0x02dc:
            r11.A00()     // Catch:{ all -> 0x0360 }
            r11.close()     // Catch:{ all -> 0x0365 }
            r8.close()
            java.lang.String r0 = "msgstore/deleteallmsgs time spent:"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            long r0 = r9.A01()
            r2.append(r0)
            X.C13680ns.A1V(r2)
            X.0sb r0 = r3.A03
            X.1jH r0 = r0.A05()
            java.io.File r0 = r0.A0O
            X.AnonymousClass1XI.A0O(r0)
            if (r7 == 0) goto L_0x0305
            r3.A0J()
        L_0x0305:
            X.17E r0 = r3.A0e
            android.os.Handler r1 = r0.A01
            r0 = 9
            android.os.Message r0 = android.os.Message.obtain(r1, r0)
            r0.sendToTarget()
            X.12G r3 = r5.A0L
            X.23f r0 = r3.A01
            X.11X r0 = r0.A00
            X.0tf r2 = r0.A02()
            java.lang.String r0 = "wa_trusted_contacts"
            r1 = 0
            X.AnonymousClass15L.A02(r2, r0, r1, r1)     // Catch:{ all -> 0x0358 }
            java.lang.String r0 = "wa_trusted_contacts_send"
            X.AnonymousClass15L.A02(r2, r0, r1, r1)     // Catch:{ all -> 0x0358 }
            r2.close()
            java.util.Map r0 = r3.A06()
            r0.clear()
            X.0xU r0 = r5.A0I
            r0.A0V(r6)
            X.0yQ r0 = r5.A14
            r0.A0C()
            X.0pt r3 = r5.A03
            X.0pj r2 = r5.A1I
            r1 = 16
            com.facebook.redex.RunnableRunnableShape2S0100000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape2S0100000_I0_1
            r0.<init>(r2, r1)
            r3.A0K(r0)
            X.18Z r0 = r5.A0C
            r0.A01()
            X.0pt r1 = r4.A00
            r0 = 43
            X.C14870pt.A01(r1, r4, r0)
            return
        L_0x0358:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0369 }
            throw r0
        L_0x035d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0360 }
            throw r0     // Catch:{ all -> 0x0360 }
        L_0x0360:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0364 }
        L_0x0364:
            throw r0     // Catch:{ all -> 0x0365 }
        L_0x0365:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0369 }
        L_0x0369:
            throw r0
        L_0x036a:
            r3.A02 = r4     // Catch:{ Exception -> 0x0374 }
            X.2fS r2 = r5.A0G     // Catch:{ Exception -> 0x0374 }
            long r0 = r0.A01     // Catch:{ Exception -> 0x0374 }
            r2.A02(r3, r0)     // Catch:{ Exception -> 0x0374 }
            return
        L_0x0374:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentIncentiveManager/processUpdateSyncFlag : Error while parsing "
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x037b:
            X.0pt r2 = r3.A01
            r0 = 2131888421(0x7f120925, float:1.9411477E38)
            r1 = 0
            r2.A09(r0, r1)
            X.1PA r0 = r3.A0B
            r0.A02(r3)
            r3.A02 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape1S0110000_I1.run():void");
    }
}

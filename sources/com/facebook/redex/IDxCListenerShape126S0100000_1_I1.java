package com.facebook.redex;

import android.content.DialogInterface;

public class IDxCListenerShape126S0100000_1_I1 implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape126S0100000_1_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        if (r1.A0A() == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (r1.A09() == false) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r15, int r16) {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x004c;
                case 1: goto L_0x00f0;
                case 2: goto L_0x0172;
                case 3: goto L_0x00c9;
                case 4: goto L_0x01f1;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r14.A00
            com.whatsapp.voipcalling.VoipActivityV2$SwitchConfirmationFragment r3 = (com.whatsapp.voipcalling.VoipActivityV2.SwitchConfirmationFragment) r3
            X.0rz r0 = r3.A00
            android.content.SharedPreferences r0 = X.C13680ns.A0B(r0)
            java.lang.String r2 = "switch_to_video_call_confirmation_dialog_count"
            int r0 = X.C13690nt.A01(r0, r2)
            X.0rz r1 = r3.A00
            int r0 = r0 + 1
            X.C13680ns.A1S(r1, r2, r0)
            X.00l r2 = r3.A0C()
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            if (r2 == 0) goto L_0x004b
            com.whatsapp.voipcalling.CallInfo r1 = r2.A3B()
            if (r1 == 0) goto L_0x004b
            boolean r0 = r1.isGroupCall
            if (r0 != 0) goto L_0x004b
            X.1fU r0 = r1.self
            int r0 = r0.A05
            if (r0 != 0) goto L_0x004b
            com.whatsapp.jid.UserJid r1 = r1.getPeerJid()
            X.AnonymousClass00B.A06(r1)
            r0 = 1
            boolean r0 = r2.A42(r1, r0, r0)
            if (r0 == 0) goto L_0x004b
            X.25g r0 = r2.A12
            X.AnonymousClass00B.A06(r0)
            r0.A0J()
        L_0x004b:
            return
        L_0x004c:
            java.lang.Object r1 = r14.A00
            com.obwhatsapp.chatinfo.ViewPhotoOrStatusDialogFragment r1 = (com.obwhatsapp.chatinfo.ViewPhotoOrStatusDialogFragment) r1
            r2 = r16
            if (r16 == 0) goto L_0x00bf
            r0 = 1
            if (r2 != r0) goto L_0x004b
            X.2DN r2 = r1.A00
            if (r2 == 0) goto L_0x004b
            com.obwhatsapp.chatinfo.ContactInfoActivity r2 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r2
            X.1KR r3 = r2.A0O
            com.whatsapp.jid.UserJid r0 = r2.A3N()
            java.lang.String r6 = X.C16030sJ.A03(r0)
            java.lang.Integer r5 = r2.A1U
            X.2Xz r1 = r2.A0J
            if (r1 == 0) goto L_0x0074
            boolean r0 = r1.A0A()
            r8 = 1
            if (r0 != 0) goto L_0x0075
        L_0x0074:
            r8 = 0
        L_0x0075:
            if (r1 == 0) goto L_0x007e
            boolean r0 = r1.A09()
            r9 = 1
            if (r0 != 0) goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            r7 = 17
            r4 = 0
            r3.A05(r4, r5, r6, r7, r8, r9)
            com.whatsapp.jid.UserJid r1 = r2.A3N()
            com.obwhatsapp.status.viewmodels.StatusesViewModel r0 = r2.A1M
            if (r0 == 0) goto L_0x00bc
            X.2XQ r0 = r0.A05(r1)
        L_0x0091:
            if (r0 == 0) goto L_0x02d8
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x02d8
            com.whatsapp.jid.UserJid r3 = r2.A3N()
            com.obwhatsapp.status.viewmodels.StatusesViewModel r0 = r2.A1M
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r2.A3g()
            if (r0 != 0) goto L_0x00b2
            com.obwhatsapp.status.viewmodels.StatusesViewModel r1 = r2.A1M
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A08(r3, r0, r4)
        L_0x00b2:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            android.content.Intent r0 = X.C14750ph.A0K(r2, r3, r0)
            r2.startActivity(r0)
            return
        L_0x00bc:
            X.2XQ r0 = r2.A1L
            goto L_0x0091
        L_0x00bf:
            X.2DN r0 = r1.A00
            if (r0 == 0) goto L_0x004b
            com.obwhatsapp.chatinfo.ContactInfoActivity r0 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r0
            r0.A3R()
            return
        L_0x00c9:
            java.lang.Object r0 = r14.A00
            X.01A r0 = (X.AnonymousClass01A) r0
            X.00l r5 = r0.A0C()
            boolean r0 = r5 instanceof com.obwhatsapp.conversation.conversationrow.message.StarredMessagesActivity
            if (r0 == 0) goto L_0x004b
            com.obwhatsapp.conversation.conversationrow.message.StarredMessagesActivity r5 = (com.obwhatsapp.conversation.conversationrow.message.StarredMessagesActivity) r5
            r0 = 2131891163(0x7f1213db, float:1.9417038E38)
            r5.Afq(r0)
            X.0sq r4 = r5.A05
            X.2DF r0 = r5.A00
            X.0xU r3 = r0.A05
            X.10G r2 = r0.A0T
            X.0rv r1 = r5.A0J
            X.36K r0 = new X.36K
            r0.<init>(r3, r5, r2, r1)
            X.C13680ns.A1U(r0, r4)
            return
        L_0x00f0:
            java.lang.Object r3 = r14.A00
            com.obwhatsapp.community.deactivate.DeactivateCommunityConfirmationFragment r3 = (com.obwhatsapp.community.deactivate.DeactivateCommunityConfirmationFragment) r3
            X.5Mb r2 = r3.A00
            if (r2 != 0) goto L_0x00ff
            java.lang.String r0 = "deactivateClickListener"
        L_0x00fa:
            java.lang.RuntimeException r0 = X.C18450wi.A03(r0)
            throw r0
        L_0x00ff:
            com.obwhatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r2 = (com.obwhatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity) r2
            r0 = 2131887689(0x7f120649, float:1.9409992E38)
            r2.Afq(r0)
            X.4QC r1 = new X.4QC
            r1.<init>(r2)
            X.0ug r0 = r2.A06
            if (r0 == 0) goto L_0x011c
            X.51D r8 = new X.51D
            r8.<init>(r1, r0)
            X.0sL r2 = r2.A05
            if (r2 != 0) goto L_0x011f
            java.lang.String r0 = "parentGroupJid"
            goto L_0x00fa
        L_0x011c:
            java.lang.String r0 = "messageClient"
            goto L_0x00fa
        L_0x011f:
            X.0ug r7 = r8.A01
            java.lang.String r10 = r7.A02()
            X.C18450wi.A0B(r10)
            java.lang.String r1 = "delete_parent"
            r0 = 0
            X.1Vv r5 = new X.1Vv
            r5.<init>(r1, r0)
            r0 = 4
            X.1lL[] r4 = new X.C35081lL[r0]
            java.lang.String r6 = "xmlns"
            java.lang.String r0 = "w:g2"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r6, (java.lang.String) r0)
            r0 = 0
            r4[r0] = r1
            java.lang.String r0 = "id"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r0, (java.lang.String) r10)
            r0 = 1
            r4[r0] = r1
            java.lang.String r1 = "type"
            java.lang.String r0 = "set"
            X.C35081lL.A01(r1, r0, r4)
            java.lang.String r2 = r2.getRawString()
            java.lang.String r0 = "to"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r0, (java.lang.String) r2)
            r0 = 3
            r4[r0] = r1
            X.1Vv r9 = X.C28371Vv.A04(r5, r4)
            r11 = 335(0x14f, float:4.7E-43)
            r12 = 20000(0x4e20, double:9.8813E-320)
            r7.A0G(r8, r9, r10, r11, r12)
            r3.A1C()
            return
        L_0x0172:
            java.lang.Object r4 = r14.A00
            com.obwhatsapp.companionmode.registration.ConvertPrimaryToCompanionActivity r4 = (com.obwhatsapp.companionmode.registration.ConvertPrimaryToCompanionActivity) r4
            X.0ys r1 = r4.A01
            r0 = 1
            r1.A01(r0)
            X.0xc r3 = r4.A00
            X.0yg r0 = r3.A0E
            boolean r0 = r0.A04()
            X.AnonymousClass00B.A0G(r0)
            r3.A02()
            X.12c r0 = r3.A0a
            r0.A05()
            X.0pj r0 = r3.A0d
            r2 = 0
            r0.A0E(r2)
            X.0x1 r0 = r3.A0A
            r0.A09()
            X.0tz r0 = r3.A0K
            android.content.Context r1 = r0.A00
            r3.A05(r1)
            X.0yv r0 = r3.A04
            r0.A01()
            X.124 r0 = r3.A0c
            r0.A00()
            X.0xk r0 = r3.A0b
            r0.A0D(r2)
            r3.A06(r1)
            r3.A03()
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.A0x
            java.util.Iterator r1 = r0.iterator()
        L_0x01bc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01cc
            java.lang.Object r0 = r1.next()
            X.0yV r0 = (X.C19480yV) r0
            r0.ASz()
            goto L_0x01bc
        L_0x01cc:
            java.lang.String r3 = "entry_linked_devices"
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.companionmode.registration.RegisterAsCompanionActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entry_point"
            r2.putExtra(r0, r3)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r0 = r2.setFlags(r0)
            r4.startActivity(r0)
            r4.finish()
            r0 = 0
            java.lang.System.exit(r0)
            return
        L_0x01f1:
            java.lang.Object r0 = r14.A00
            com.obwhatsapp.settings.MultiSelectionDialogFragment r0 = (com.obwhatsapp.settings.MultiSelectionDialogFragment) r0
            X.2Sh r3 = r0.A01
            int r7 = r0.A00
            boolean[] r4 = r0.A04
            com.obwhatsapp.settings.SettingsDataUsageActivity r3 = (com.obwhatsapp.settings.SettingsDataUsageActivity) r3
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            r5 = 0
            r1 = 0
        L_0x0203:
            int r0 = r4.length
            if (r1 >= r0) goto L_0x0214
            boolean r0 = r4[r1]
            if (r0 == 0) goto L_0x0211
            java.lang.String[] r0 = r3.A0W
            r0 = r0[r1]
            r2.add(r0)
        L_0x0211:
            int r1 = r1 + 1
            goto L_0x0203
        L_0x0214:
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r5]
            java.lang.Object[] r6 = r2.toArray(r0)
            java.lang.CharSequence[] r6 = (java.lang.CharSequence[]) r6
            r0 = 2
            if (r7 == r0) goto L_0x025f
            r0 = 3
            if (r7 == r0) goto L_0x0239
            r0 = 4
            if (r7 != r0) goto L_0x02d4
            int r4 = r6.length
            r2 = 0
        L_0x0227:
            if (r2 >= r4) goto L_0x029f
            r0 = r6[r2]
            java.lang.String r0 = r0.toString()
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 1
            int r0 = r0 << r1
            r5 = r5 | r0
            int r2 = r2 + 1
            goto L_0x0227
        L_0x0239:
            int r4 = r6.length
            r2 = 0
        L_0x023b:
            if (r2 >= r4) goto L_0x024d
            r0 = r6[r2]
            java.lang.String r0 = r0.toString()
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 1
            int r0 = r0 << r1
            r5 = r5 | r0
            int r2 = r2 + 1
            goto L_0x023b
        L_0x024d:
            r3.A02 = r5
            X.0rz r0 = r3.A09
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "autodownload_wifi_mask"
            X.C13680ns.A0w(r1, r0, r5)
            android.widget.TextView r1 = r3.A09
            int r0 = r3.A02
            goto L_0x0284
        L_0x025f:
            int r4 = r6.length
            r2 = 0
        L_0x0261:
            if (r2 >= r4) goto L_0x0273
            r0 = r6[r2]
            java.lang.String r0 = r0.toString()
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 1
            int r0 = r0 << r1
            r5 = r5 | r0
            int r2 = r2 + 1
            goto L_0x0261
        L_0x0273:
            r3.A00 = r5
            X.0rz r0 = r3.A09
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "autodownload_cellular_mask"
            X.C13680ns.A0w(r1, r0, r5)
            android.widget.TextView r1 = r3.A07
            int r0 = r3.A00
        L_0x0284:
            java.lang.String r0 = r3.A35(r0)
            r1.setText(r0)
            X.0xv r3 = r3.A0N
            java.lang.String r0 = "mediaautodownload/updatequeue"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sq r2 = r3.A09
            r1 = 31
            com.facebook.redex.RunnableRunnableShape10S0100000_I0_9 r0 = new com.facebook.redex.RunnableRunnableShape10S0100000_I0_9
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Acl(r0)
            goto L_0x02d4
        L_0x029f:
            r3.A01 = r5
            X.0rz r0 = r3.A09
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "autodownload_roaming_mask"
            X.C13680ns.A0w(r1, r0, r5)
            android.widget.TextView r1 = r3.A08
            int r0 = r3.A01
            java.lang.String r0 = r3.A35(r0)
            r1.setText(r0)
            X.0xv r4 = r3.A0N
            java.lang.String r0 = "mediaautodownload/updatequeue"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sq r2 = r4.A09
            r1 = 31
            com.facebook.redex.RunnableRunnableShape10S0100000_I0_9 r0 = new com.facebook.redex.RunnableRunnableShape10S0100000_I0_9
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.Acl(r0)
            int r0 = r3.A01
            r0 = r0 & 4
            if (r0 == 0) goto L_0x02d4
            r0 = 1
            X.AnonymousClass29T.A01(r3, r0)
        L_0x02d4:
            r15.dismiss()
            return
        L_0x02d8:
            X.0pt r2 = r2.A05
            r1 = 2131889679(0x7f120e0f, float:1.9414028E38)
            r0 = 0
            r2.A09(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape126S0100000_1_I1.onClick(android.content.DialogInterface, int):void");
    }
}

package com.whatsapp.util;

import X.C34331k5;

public class ViewOnClickCListenerShape0S0100000_I0 extends C34331k5 {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape0S0100000_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x036a, code lost:
        if (r1.A0A() == false) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0374, code lost:
        if (r1.A09() == false) goto L_0x0376;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r18) {
        /*
            r17 = this;
            r3 = r17
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x01db;
                case 1: goto L_0x06d6;
                case 2: goto L_0x06ce;
                case 3: goto L_0x06c6;
                case 4: goto L_0x0694;
                case 5: goto L_0x0662;
                case 6: goto L_0x0190;
                case 7: goto L_0x064a;
                case 8: goto L_0x062b;
                case 9: goto L_0x014a;
                case 10: goto L_0x0612;
                case 11: goto L_0x05ff;
                case 12: goto L_0x058b;
                case 13: goto L_0x0574;
                case 14: goto L_0x0561;
                case 15: goto L_0x0537;
                case 16: goto L_0x052f;
                case 17: goto L_0x0510;
                case 18: goto L_0x0506;
                case 19: goto L_0x04fe;
                case 20: goto L_0x027c;
                case 21: goto L_0x04c3;
                case 22: goto L_0x0100;
                case 23: goto L_0x049c;
                case 24: goto L_0x046e;
                case 25: goto L_0x0007;
                case 26: goto L_0x0007;
                case 27: goto L_0x0007;
                case 28: goto L_0x0007;
                case 29: goto L_0x045a;
                case 30: goto L_0x00f2;
                case 31: goto L_0x044b;
                case 32: goto L_0x0098;
                case 33: goto L_0x0085;
                case 34: goto L_0x0411;
                case 35: goto L_0x004e;
                case 36: goto L_0x0402;
                case 37: goto L_0x03e6;
                case 38: goto L_0x0011;
                case 39: goto L_0x03cc;
                case 40: goto L_0x03b4;
                case 41: goto L_0x0399;
                case 42: goto L_0x0351;
                case 43: goto L_0x0329;
                case 44: goto L_0x02eb;
                case 45: goto L_0x02c5;
                case 46: goto L_0x02bd;
                case 47: goto L_0x02ac;
                case 48: goto L_0x02a4;
                case 49: goto L_0x0293;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A00
            X.26A r0 = (X.AnonymousClass26A) r0
            X.1a5 r0 = r0.A06
            r0.AOG()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r4 = r3.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r4 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r4
            X.01Y r1 = r4.A0Q
            com.whatsapp.jid.UserJid r0 = r4.A3N()
            boolean r0 = r1.A0V(r0)
            java.lang.String r3 = "account_info"
            if (r0 == 0) goto L_0x06e9
            X.01Y r2 = r4.A0Q
            X.0sH r1 = r4.A0x
            r0 = 1
            r2.A0J(r4, r1, r3, r0)
            X.0zl r1 = r4.A11
            com.whatsapp.jid.UserJid r0 = r4.A3N()
            boolean r0 = X.C40561uK.A01(r1, r0)
            if (r0 == 0) goto L_0x0010
            X.0zl r2 = r4.A11
            X.0sq r5 = r4.A05
            X.0t9 r3 = r4.A12
            X.0yz r1 = r4.A0s
            com.whatsapp.jid.UserJid r4 = r4.A3N()
            r0 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r8 = 2
            r7 = 0
            X.C42601y5.A01(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x004e:
            java.lang.Object r3 = r3.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r3 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r3
            X.2jg r1 = r3.A13
            if (r1 == 0) goto L_0x005a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A07 = r0
        L_0x005a:
            X.0w8 r0 = r3.A0J
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0010
            X.0wS r0 = r3.A0K
            X.19r r0 = r0.A03()
            java.lang.Class r0 = r0.AEZ()
            if (r0 == 0) goto L_0x0010
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r3, r0)
            com.whatsapp.jid.UserJid r0 = r3.A3N()
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "extra_jid"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            r3.startActivity(r0)
            return
        L_0x0085:
            java.lang.Object r2 = r3.A00
            com.obwhatsapp.calling.views.PermissionDialogFragment r2 = (com.obwhatsapp.calling.views.PermissionDialogFragment) r2
            android.app.Dialog r0 = r2.A01
            r0.dismiss()
            X.1ZC r1 = r2.A04
            if (r1 == 0) goto L_0x0010
            int r0 = r2.A00
            r1.AUi(r0)
            return
        L_0x0098:
            java.lang.Object r3 = r3.A00
            X.26G r3 = (X.AnonymousClass26G) r3
            X.26I r2 = r3.A00
            if (r2 == 0) goto L_0x0010
            int r1 = r2.A00
            r0 = 3
            if (r1 == r0) goto L_0x070a
            r0 = 2
            if (r1 == r0) goto L_0x070a
            com.obwhatsapp.calling.controls.viewmodel.ParticipantsListViewModel r0 = r3.A00
            if (r0 == 0) goto L_0x0010
            com.whatsapp.jid.UserJid r7 = r2.A02
            X.2PE r0 = r0.A01
            if (r0 == 0) goto L_0x0010
            com.whatsapp.voipcalling.VoipActivityV2 r6 = r0.A00
            com.whatsapp.voipcalling.CallInfo r1 = r6.A3B()
            if (r1 == 0) goto L_0x0010
            X.01Y r0 = r6.A0k
            boolean r0 = r0.A0V(r7)
            r5 = 0
            if (r0 == 0) goto L_0x06ee
            X.0sG r0 = r6.A1E
            X.0sH r3 = r0.A0A(r7)
            r2 = 2131892956(0x7f121adc, float:1.9420675E38)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.0sP r0 = r6.A1H
            java.lang.String r0 = r0.A08(r3)
            r4 = 0
            r1[r4] = r0
            java.lang.String r3 = r6.getString(r2, r1)
            r2 = 2131886658(0x7f120242, float:1.9407901E38)
            X.01Y r1 = r6.A0k
            com.facebook.redex.IDxUnblockerShape35S0300000_2_I1 r0 = new com.facebook.redex.IDxUnblockerShape35S0300000_2_I1
            r0.<init>(r6, r7, r1, r4)
            com.obwhatsapp.blocklist.UnblockDialogFragment r1 = com.obwhatsapp.blocklist.UnblockDialogFragment.A01(r0, r3, r2, r4)
            X.02C r0 = r6.AGM()
            r1.A1G(r0, r5)
            return
        L_0x00f2:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.calling.callgrid.view.FocusViewContainer r0 = (com.obwhatsapp.calling.callgrid.view.FocusViewContainer) r0
            X.26E r0 = r0.A05
            if (r0 == 0) goto L_0x0010
            android.view.View r0 = r0.A0H
            r0.performClick()
            return
        L_0x0100:
            java.lang.Object r5 = r3.A00
            X.26l r5 = (X.C449726l) r5
            X.2ql r2 = r5.A0b
            int r1 = r5.A00
            X.1mM r0 = r5.A0Q
            boolean r0 = r2.A06(r0, r1)
            if (r0 == 0) goto L_0x0010
            X.0ue r4 = r5.A0S
            r3 = 7
            r0 = 26
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 0
            com.whatsapp.jid.UserJid r0 = r5.A0i
            r4.A04(r0, r2, r1, r3)
            X.1mM r0 = r5.A0Q
            java.lang.String r2 = r0.A0C
            java.lang.String r0 = "https://l.wl.co/l?u="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = android.net.Uri.encode(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.net.Uri r4 = android.net.Uri.parse(r0)
            X.0zJ r3 = r5.A00
            android.content.Context r2 = r18.getContext()
            java.lang.String r1 = "android.intent.action.VIEW"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r4)
            r3.A06(r2, r0)
            return
        L_0x014a:
            java.lang.Object r5 = r3.A00
            X.2Xz r5 = (X.AnonymousClass2Xz) r5
            com.whatsapp.jid.UserJid r3 = r5.A03()
            com.obwhatsapp.pnh.RequestPhoneNumberViewModel r0 = r5.A0v
            X.027 r2 = r0.A01
            java.lang.Object r1 = r2.A01()
            X.2X1 r1 = (X.AnonymousClass2X1) r1
            boolean r0 = r3 instanceof X.AnonymousClass1ZX
            if (r0 == 0) goto L_0x016a
            if (r1 == 0) goto L_0x016a
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x017f
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x017f
        L_0x016a:
            r0 = 10
            r5.A04(r0)
            r0 = 2
            X.AnonymousClass2Xz.A01(r5, r0)
            X.10c r4 = r5.A0c
            X.0sH r3 = r5.A0L
            com.obwhatsapp.chatinfo.ContactInfoActivity r2 = r5.A0d
            r1 = 6
            r0 = 0
            r4.A01(r2, r3, r1, r0)
            return
        L_0x017f:
            java.lang.Object r0 = r2.A01()
            if (r0 == 0) goto L_0x0010
            X.2X0 r1 = r5.A0u
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01(r0)
            return
        L_0x0190:
            java.lang.Object r3 = r3.A00
            X.2Xz r3 = (X.AnonymousClass2Xz) r3
            X.0pd r2 = r3.A0p
            r1 = 543(0x21f, float:7.61E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x01a5
            r0 = 14
            r3.A04(r0)
        L_0x01a5:
            X.0uW r2 = r3.A0T
            com.obwhatsapp.chatinfo.ContactInfoActivity r1 = r3.A0d
            X.1mD r0 = r3.A0K
            java.lang.String r0 = r0.A0D
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.Act(r1, r0)
            X.19m r0 = r3.A10
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0010
            X.3rQ r1 = new X.3rQ
            r1.<init>()
            X.1mD r0 = r3.A0K
            com.whatsapp.jid.UserJid r0 = r0.A04
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = r0.user
            r1.A02 = r0
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            r1.A01 = r0
            X.0t9 r0 = r3.A0r
            r0.A06(r1)
            return
        L_0x01db:
            java.lang.Object r7 = r3.A00
            X.1gU r7 = (X.C32501gU) r7
            boolean r0 = r7 instanceof com.obwhatsapp.status.audienceselector.StatusRecipientsActivity
            if (r0 == 0) goto L_0x070e
            com.obwhatsapp.status.audienceselector.StatusRecipientsActivity r7 = (com.obwhatsapp.status.audienceselector.StatusRecipientsActivity) r7
            boolean r0 = r7 instanceof com.obwhatsapp.status.audienceselector.StatusTemporalRecipientsActivity
            if (r0 == 0) goto L_0x0239
            com.obwhatsapp.status.audienceselector.StatusTemporalRecipientsActivity r7 = (com.obwhatsapp.status.audienceselector.StatusTemporalRecipientsActivity) r7
            boolean r0 = r7.A39()
            if (r0 != 0) goto L_0x0010
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            X.1BU r6 = r7.A01
            boolean r0 = r7.A0K
            if (r0 == 0) goto L_0x0226
            r3 = 2
            X.1m6 r0 = r7.A00
            java.util.List r2 = r0.A01
            java.util.Set r0 = r7.A0T
            java.util.ArrayList r1 = X.AnonymousClass3Bv.newArrayList((java.lang.Iterable) r0)
            X.1m6 r0 = r7.A00
            boolean r0 = r0.A03
            X.1m6 r4 = new X.1m6
            r4.<init>(r2, r1, r3, r0)
        L_0x0210:
            r7.A00 = r4
            r6.A01(r5, r4)
            r0 = -1
            r7.setResult(r0, r5)
            r1 = 2131890954(0x7f12130a, float:1.9416614E38)
            r0 = 2131891163(0x7f1213db, float:1.9417038E38)
            r7.Afr(r1, r0)
            r7.finish()
            return
        L_0x0226:
            r3 = 1
            java.util.Set r0 = r7.A0T
            java.util.ArrayList r2 = X.AnonymousClass3Bv.newArrayList((java.lang.Iterable) r0)
            X.1m6 r0 = r7.A00
            java.util.List r1 = r0.A02
            boolean r0 = r0.A03
            X.1m6 r4 = new X.1m6
            r4.<init>(r2, r1, r3, r0)
            goto L_0x0210
        L_0x0239:
            boolean r0 = r7.A39()
            if (r0 != 0) goto L_0x0010
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r0 = -1
            r7.setResult(r0, r1)
            r1 = 2131890954(0x7f12130a, float:1.9416614E38)
            r0 = 2131891163(0x7f1213db, float:1.9417038E38)
            r7.Afr(r1, r0)
            boolean r0 = r7.A0K
            r9 = 1
            if (r0 == 0) goto L_0x0257
            r9 = 2
        L_0x0257:
            X.0pd r2 = r7.A0C
            X.0tM r1 = X.C16620tM.A01
            r0 = 2531(0x9e3, float:3.547E-42)
            boolean r0 = r2.A0E(r1, r0)
            r13 = 0
            r10 = -1
            if (r0 == 0) goto L_0x0266
            r10 = 0
        L_0x0266:
            X.0sq r2 = r7.A05
            X.2Sp r6 = r7.A00
            java.util.Set r8 = r7.A0T
            r11 = 0
            r15 = 1
            r14 = 0
            r16 = 1
            X.36f r1 = r6.A00(r7, r8, r9, r10, r11, r13, r14, r15, r16)
            java.lang.Void[] r0 = new java.lang.Void[r13]
            r2.Ack(r1, r0)
            return
        L_0x027c:
            java.lang.Object r0 = r3.A00
            X.01A r0 = (X.AnonymousClass01A) r0
            android.os.Bundle r1 = r0.A04()
            java.lang.String r0 = ""
            X.1Vw r0 = X.AnonymousClass1yL.A03(r1, r0)
            X.AnonymousClass00B.A06(r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0293:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.community.JoinGroupBottomSheetFragment r0 = (com.obwhatsapp.community.JoinGroupBottomSheetFragment) r0
            X.2Uo r0 = r0.A0T
            X.2OJ r1 = r0.A0W
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B(r0)
            return
        L_0x02a4:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.community.AddGroupsToCommunityActivity r0 = (com.obwhatsapp.community.AddGroupsToCommunityActivity) r0
            r0.A35()
            return
        L_0x02ac:
            java.lang.Object r0 = r3.A00
            X.0pP r0 = (X.C14570pP) r0
            X.0sq r2 = r0.A05
            r1 = 37
            com.facebook.redex.RunnableRunnableShape17S0100000_I1 r0 = new com.facebook.redex.RunnableRunnableShape17S0100000_I1
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Acl(r0)
            return
        L_0x02bd:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.community.AddGroupsToCommunityActivity r0 = (com.obwhatsapp.community.AddGroupsToCommunityActivity) r0
            r0.A36()
            return
        L_0x02c5:
            java.lang.Object r5 = r3.A00
            com.obwhatsapp.community.AboutCommunityBottomSheetFragment r5 = (com.obwhatsapp.community.AboutCommunityBottomSheetFragment) r5
            r5.A1C()
            X.1L3 r4 = r5.A02
            android.content.Context r1 = r5.A0u()
            java.lang.Class<X.00k> r0 = X.C000900k.class
            android.app.Activity r3 = X.C19980zJ.A01(r1, r0)
            X.00k r3 = (X.C000900k) r3
            X.0sL r2 = r5.A05
            X.00l r1 = r5.A0D()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r1.findViewById(r0)
            r4.A01(r0, r3, r2)
            return
        L_0x02eb:
            java.lang.Object r3 = r3.A00
            com.obwhatsapp.chatinfo.ListChatInfoActivity r3 = (com.obwhatsapp.chatinfo.ListChatInfoActivity) r3
            X.1kx r1 = r3.A3M()
            X.0sO r0 = r3.A0C
            boolean r0 = r0.A0C(r1)
            if (r0 != 0) goto L_0x0318
            X.0pd r2 = r3.A0C
            r1 = 1071(0x42f, float:1.501E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0318
            r0 = 5
            com.obwhatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r1 = com.obwhatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A01(r0)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            r3.Afb(r1, r0)
            return
        L_0x0318:
            X.1kx r0 = r3.A3M()
            r2 = 0
            com.obwhatsapp.chatinfo.ChatInfoActivity$EncryptionExplanationDialogFragment r1 = com.obwhatsapp.chatinfo.ChatInfoActivity$EncryptionExplanationDialogFragment.A01(r0)
            X.02C r0 = r3.AGM()
            r1.A1G(r0, r2)
            return
        L_0x0329:
            java.lang.Object r4 = r3.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r4 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r4
            X.38l r1 = r4.A1Q
            com.whatsapp.jid.UserJid r0 = r4.A3N()
            java.util.ArrayList r3 = r1.A00(r0)
            r3.size()
            java.lang.Class<com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity> r0 = com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.class
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r4, r0)
            java.lang.String r1 = "edit_mode"
            r0 = 0
            r2.putExtra(r1, r0)
            java.lang.String r0 = "vcard_sender_infos"
            r2.putParcelableArrayListExtra(r0, r3)
            r4.startActivity(r2)
            return
        L_0x0351:
            java.lang.Object r4 = r3.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r4 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r4
            X.1KR r5 = r4.A0O
            com.whatsapp.jid.UserJid r0 = r4.A3N()
            java.lang.String r8 = X.C16030sJ.A03(r0)
            java.lang.Integer r7 = r4.A1U
            X.2Xz r1 = r4.A0J
            if (r1 == 0) goto L_0x036c
            boolean r0 = r1.A0A()
            r10 = 1
            if (r0 != 0) goto L_0x036d
        L_0x036c:
            r10 = 0
        L_0x036d:
            if (r1 == 0) goto L_0x0376
            boolean r0 = r1.A09()
            r11 = 1
            if (r0 != 0) goto L_0x0377
        L_0x0376:
            r11 = 0
        L_0x0377:
            r9 = 7
            r6 = 0
            r5.A05(r6, r7, r8, r9, r10, r11)
            r0 = 12
            r4.A3a(r0)
            com.whatsapp.jid.UserJid r3 = r4.A3N()
            boolean r0 = r3 instanceof X.AnonymousClass1ZX
            if (r0 == 0) goto L_0x0395
            X.0sq r2 = r4.A05
            r1 = 3
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r4, r1, r3)
            r2.Acl(r0)
            return
        L_0x0395:
            r4.A3c(r3)
            return
        L_0x0399:
            java.lang.Object r2 = r3.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r2 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r2
            X.2jg r1 = r2.A13
            if (r1 == 0) goto L_0x03a5
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A05 = r0
        L_0x03a5:
            X.0uP r1 = r2.A0e
            com.whatsapp.jid.UserJid r0 = r2.A3N()
            com.obwhatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r1 = com.obwhatsapp.conversation.conversationrow.EncryptionChangeDialogFragment.A01(r1, r0)
            r0 = 0
            r2.Afb(r1, r0)
            return
        L_0x03b4:
            java.lang.Object r2 = r3.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r2 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r2
            X.2jg r1 = r2.A13
            if (r1 == 0) goto L_0x03c0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A05 = r0
        L_0x03c0:
            com.whatsapp.jid.UserJid r0 = r2.A3N()
            android.content.Intent r0 = X.C14750ph.A0X(r2, r0)
            r2.startActivity(r0)
            return
        L_0x03cc:
            java.lang.Object r2 = r3.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r2 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r2
            X.2jg r1 = r2.A13
            if (r1 == 0) goto L_0x03d8
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A05 = r0
        L_0x03d8:
            com.whatsapp.jid.UserJid r1 = r2.A3N()
            r0 = 0
            com.obwhatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r1 = com.obwhatsapp.conversation.conversationrow.EncryptionChangeDialogFragment.A03(r1, r0)
            r0 = 0
            r2.Afb(r1, r0)
            return
        L_0x03e6:
            java.lang.Object r2 = r3.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r2 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r2
            X.2jg r1 = r2.A13
            if (r1 == 0) goto L_0x03f2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A08 = r0
        L_0x03f2:
            X.0yO r0 = r2.A0z
            X.1WD r2 = r0.A04()
            r1 = 0
            com.facebook.redex.IDxNConsumerShape154S0100000_2_I1 r0 = new com.facebook.redex.IDxNConsumerShape154S0100000_2_I1
            r0.<init>(r3, r1)
            r2.A00(r0)
            return
        L_0x0402:
            java.lang.Object r3 = r3.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r3 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r3
            X.1P7 r2 = r3.A1A
            com.whatsapp.jid.UserJid r1 = r3.A3N()
            r0 = 0
            r2.A07(r3, r1, r0)
            return
        L_0x0411:
            java.lang.Object r1 = r3.A00
            com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment r1 = (com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r1
            X.0qW r0 = r1.A0b
            java.lang.Object r0 = r0.getValue()
            com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r0 = (com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r0
            com.whatsapp.jid.UserJid r3 = r1.A0P
            if (r3 != 0) goto L_0x042e
            java.lang.String r0 = "bizJid"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x042e:
            X.1PR r2 = r0.A03
            r0 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r5 = 0
            r7 = r5
            r6 = r5
            r2.A00(r3, r4, r5, r6, r7)
            X.0qW r0 = r1.A0Y
            java.lang.Object r0 = r0.getValue()
            X.2Xa r0 = (X.C49982Xa) r0
            X.1cy r1 = r0.A05
            X.2Xd r0 = X.AnonymousClass2Xd.A00
            r1.A0B(r0)
            return
        L_0x044b:
            java.lang.Object r1 = r3.A00
            com.obwhatsapp.calling.callhistory.CallsHistoryFragment r1 = (com.obwhatsapp.calling.callhistory.CallsHistoryFragment) r1
            X.00l r0 = r1.A0C()
            X.AnonymousClass1yL.A05(r0)
            r0 = 1
            r1.A0j = r0
            return
        L_0x045a:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment r0 = (com.obwhatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment) r0
            X.0qW r0 = r0.A0J
            java.lang.Object r0 = r0.getValue()
            X.3Po r0 = (X.C64433Po) r0
            X.1cy r1 = r0.A04
            X.4YZ r0 = X.AnonymousClass4YZ.A00
            r1.A0B(r0)
            return
        L_0x046e:
            java.lang.Object r5 = r3.A00
            X.26l r5 = (X.C449726l) r5
            X.0ue r4 = r5.A0S
            r0 = 51
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.1mM r0 = r5.A0Q
            if (r0 != 0) goto L_0x0499
            r2 = 0
        L_0x047f:
            com.whatsapp.jid.UserJid r1 = r5.A0i
            r0 = 33
            r4.A04(r1, r3, r2, r0)
            X.2ql r0 = r5.A0b
            java.lang.String r3 = r5.A0p
            com.whatsapp.jid.UserJid r2 = r0.A0G
            r1 = 1
            r0 = 0
            X.C18450wi.A0H(r2, r0)
            com.obwhatsapp.biz.cart.view.fragment.CartFragment r0 = com.obwhatsapp.biz.cart.view.fragment.CartFragment.A01(r2, r3, r1)
            r5.Afc(r0)
            return
        L_0x0499:
            java.lang.String r2 = r0.A0D
            goto L_0x047f
        L_0x049c:
            java.lang.Object r5 = r3.A00
            X.26l r5 = (X.C449726l) r5
            X.0ue r4 = r5.A0S
            r0 = 50
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            com.whatsapp.jid.UserJid r2 = r5.A0i
            r1 = 32
            r0 = 0
            r4.A04(r2, r3, r0, r1)
            X.2ql r0 = r5.A0b
            java.lang.String r3 = r5.A0p
            com.whatsapp.jid.UserJid r2 = r0.A0G
            r1 = 1
            r0 = 0
            X.C18450wi.A0H(r2, r0)
            com.obwhatsapp.biz.cart.view.fragment.CartFragment r0 = com.obwhatsapp.biz.cart.view.fragment.CartFragment.A01(r2, r3, r1)
            r5.Afc(r0)
            return
        L_0x04c3:
            java.lang.Object r5 = r3.A00
            X.26l r5 = (X.C449726l) r5
            X.1mM r1 = r5.A0Q
            if (r1 == 0) goto L_0x04dc
            X.0ue r4 = r5.A0S
            r3 = 27
            r0 = 47
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r1.A0D
            com.whatsapp.jid.UserJid r0 = r5.A0i
            r4.A04(r0, r2, r1, r3)
        L_0x04dc:
            X.15I r2 = r5.A0g
            com.whatsapp.jid.UserJid r1 = r5.A0i
            r10 = 2
            X.4ln r0 = new X.4ln
            r0.<init>(r10)
            r2.A07(r0, r1)
            X.1KX r4 = r5.A0N
            X.2Yq r6 = r5.A0V
            com.whatsapp.jid.UserJid r8 = r5.A0i
            X.1mM r0 = r5.A0Q
            java.util.List r9 = java.util.Collections.singletonList(r0)
            com.whatsapp.jid.UserJid r7 = r5.A0i
            r12 = 0
            r11 = 0
            r4.A02(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x04fe:
            java.lang.Object r0 = r3.A00
            X.25q r0 = (X.C448125q) r0
            r0.A00()
            return
        L_0x0506:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.biz.catalog.view.activity.ProductListActivity r0 = (com.obwhatsapp.biz.catalog.view.activity.ProductListActivity) r0
            X.2Sb r0 = r0.A0E
            r0.A06()
            return
        L_0x0510:
            java.lang.Object r4 = r3.A00
            com.obwhatsapp.biz.catalog.view.activity.ProductListActivity r4 = (com.obwhatsapp.biz.catalog.view.activity.ProductListActivity) r4
            X.0ue r2 = r4.A0A
            com.whatsapp.jid.UserJid r1 = r4.A0H
            r3 = 0
            r0 = 40
            r2.A04(r1, r3, r3, r0)
            X.2Sb r0 = r4.A0E
            com.whatsapp.jid.UserJid r2 = r0.A08
            r1 = 3
            r0 = 0
            X.C18450wi.A0H(r2, r0)
            com.obwhatsapp.biz.cart.view.fragment.CartFragment r0 = com.obwhatsapp.biz.cart.view.fragment.CartFragment.A01(r2, r3, r1)
            r4.Afc(r0)
            return
        L_0x052f:
            java.lang.Object r0 = r3.A00
            X.1fh r0 = (X.C32131fh) r0
            r0.A35()
            return
        L_0x0537:
            java.lang.Object r4 = r3.A00
            X.1fh r4 = (X.C32131fh) r4
            android.content.Context r0 = r18.getContext()
            com.whatsapp.jid.UserJid r3 = r4.A0K
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.ShareCatalogLinkActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "android.intent.action.VIEW"
            r2.setAction(r0)
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "jid"
            r2.putExtra(r0, r1)
            r4.startActivity(r2)
            return
        L_0x0561:
            java.lang.Object r4 = r3.A00
            com.obwhatsapp.biz.cart.view.fragment.CartFragment r4 = (com.obwhatsapp.biz.cart.view.fragment.CartFragment) r4
            X.2RP r3 = r4.A0R
            int r2 = r4.A00
            r1 = 1
            if (r2 == r1) goto L_0x0570
            r0 = 4
            if (r2 == r0) goto L_0x0570
            r1 = 0
        L_0x0570:
            r3.A06(r4, r1)
            return
        L_0x0574:
            java.lang.Object r2 = r3.A00
            com.obwhatsapp.biz.cart.view.fragment.CartFragment r2 = (com.obwhatsapp.biz.cart.view.fragment.CartFragment) r2
            com.obwhatsapp.KeyboardPopupLayout r0 = r2.A0F
            boolean r0 = X.C23061Ai.A00(r0)
            if (r0 == 0) goto L_0x0587
            X.1Ai r1 = r2.A0v
            com.obwhatsapp.KeyboardPopupLayout r0 = r2.A0F
            r1.A01(r0)
        L_0x0587:
            r2.A1C()
            return
        L_0x058b:
            java.lang.Object r4 = r3.A00
            com.obwhatsapp.biz.cart.view.fragment.CartFragment r4 = (com.obwhatsapp.biz.cart.view.fragment.CartFragment) r4
            X.01Y r1 = r4.A0Z
            com.whatsapp.jid.UserJid r0 = r4.A0m
            boolean r0 = r1.A0V(r0)
            if (r0 == 0) goto L_0x05a3
            X.00l r1 = r4.A0D()
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass29T.A01(r1, r0)
            return
        L_0x05a3:
            X.0x0 r2 = r4.A0q
            r1 = 774777518(0x2e2e2aae, float:3.9600927E-11)
            java.lang.String r6 = "order_creates_tag"
            java.lang.String r0 = "CartFragment"
            r2.A00(r1, r6, r0)
            r0 = 1
            r4.A0y = r0
            X.00l r1 = r4.A0D()
            X.0pN r1 = (X.C14550pN) r1
            r0 = 2131887040(0x7f1203c0, float:1.9408676E38)
            r1.Afq(r0)
            X.2RP r1 = r4.A0R
            X.2W6 r0 = r4.A0Q
            java.util.List r3 = r0.A0F()
            X.2W6 r0 = r4.A0Q
            java.util.Date r2 = r0.A00
            X.2RR r1 = r1.A0I
            X.26W r5 = r1.A0H
            com.whatsapp.jid.UserJid r0 = r1.A0I
            X.26j r4 = new X.26j
            r4.<init>(r0, r3, r2)
            X.26Y r1 = r1.A0J
            X.0x0 r0 = r5.A08
            r0.A02(r6)
            r5.A01 = r1
            com.whatsapp.jid.UserJid r3 = r4.A00
            X.2RQ r0 = r5.A03
            X.0pd r2 = r0.A01
            r1 = 1867(0x74b, float:2.616E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 != 0) goto L_0x05f2
            r5.A02(r4)
            return
        L_0x05f2:
            X.0sq r2 = r5.A0A
            r1 = 20
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0
            r0.<init>(r5, r4, r3, r1)
            r2.Acl(r0)
            return
        L_0x05ff:
            java.lang.Object r1 = r3.A00
            X.2Xz r1 = (X.AnonymousClass2Xz) r1
            r0 = 12
            r1.A04(r0)
            r0 = 5
            X.AnonymousClass2Xz.A01(r1, r0)
            com.obwhatsapp.chatinfo.ContactInfoActivity r0 = r1.A0d
            r0.A3O()
            return
        L_0x0612:
            java.lang.Object r3 = r3.A00
            X.2Xz r3 = (X.AnonymousClass2Xz) r3
            r0 = 14
            r3.A04(r0)
            X.0uW r2 = r3.A0T
            com.obwhatsapp.chatinfo.ContactInfoActivity r1 = r3.A0d
            X.1mD r0 = r3.A0K
            java.lang.String r0 = r0.A0D
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.Act(r1, r0)
            return
        L_0x062b:
            java.lang.Object r4 = r3.A00
            X.2Xz r4 = (X.AnonymousClass2Xz) r4
            X.4TP r2 = r4.A0b
            X.0sH r1 = r4.A0L
            com.obwhatsapp.chatinfo.ContactInfoActivity r0 = r4.A0d
            r2.A00(r0, r1)
            X.1KR r3 = r4.A0Z
            X.0sH r0 = r4.A0L
            X.1ko r0 = r0.A0D
            r2 = 0
            if (r0 == 0) goto L_0x0642
            r2 = 1
        L_0x0642:
            X.1mI r1 = r4.A0J
            r0 = 15
            r3.A03(r1, r0, r2)
            return
        L_0x064a:
            java.lang.Object r0 = r3.A00
            X.2Xz r0 = (X.AnonymousClass2Xz) r0
            com.obwhatsapp.chatinfo.ContactInfoActivity r3 = r0.A0d
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.businessupsell.BusinessProfileEducation"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x0662:
            java.lang.Object r3 = r3.A00
            com.obwhatsapp.backup.google.SettingsGoogleDrive r3 = (com.obwhatsapp.backup.google.SettingsGoogleDrive) r3
            X.0rz r0 = r3.A09
            boolean r0 = X.AnonymousClass2GK.A0H(r0)
            if (r0 == 0) goto L_0x067b
            java.lang.String r0 = "settings-gdrive/change-backup-encryption/media restore is running"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 2131891580(0x7f12157c, float:1.9417884E38)
            r3.Afg(r0)
            return
        L_0x067b:
            android.content.Context r2 = r18.getContext()
            X.0sd r0 = r3.A0T
            X.0rz r0 = r0.A03
            boolean r1 = r0.A1f()
            r0 = 3
            if (r1 != 0) goto L_0x068b
            r0 = 1
        L_0x068b:
            android.content.Intent r1 = X.C14750ph.A09(r2, r0)
            r0 = 0
            r3.startActivityForResult(r1, r0)
            return
        L_0x0694:
            java.lang.Object r3 = r3.A00
            X.2YL r3 = (X.AnonymousClass2YL) r3
            X.0rz r0 = r3.A09
            boolean r0 = X.AnonymousClass2GK.A0H(r0)
            if (r0 == 0) goto L_0x06ad
            java.lang.String r0 = "settings-gdrive/change-backup-encryption/media restore is running"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 2131891580(0x7f12157c, float:1.9417884E38)
            r3.Afg(r0)
            return
        L_0x06ad:
            android.content.Context r2 = r18.getContext()
            X.0sd r0 = r3.A0D
            X.0rz r0 = r0.A03
            boolean r1 = r0.A1f()
            r0 = 3
            if (r1 != 0) goto L_0x06bd
            r0 = 1
        L_0x06bd:
            android.content.Intent r1 = X.C14750ph.A09(r2, r0)
            r0 = 0
            r3.startActivityForResult(r1, r0)
            return
        L_0x06c6:
            java.lang.Object r0 = r3.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x06ce:
            java.lang.Object r0 = r3.A00
            android.app.Activity r0 = (android.app.Activity) r0
            X.AnonymousClass1yL.A05(r0)
            return
        L_0x06d6:
            java.lang.Object r3 = r3.A00
            com.obwhatsapp.RequestPermissionActivity r3 = (com.obwhatsapp.RequestPermissionActivity) r3
            java.lang.String r2 = r3.A07
            if (r2 == 0) goto L_0x06e5
            X.1BN r1 = r3.A06
            java.lang.String r0 = "not_now"
            r1.A04(r2, r0)
        L_0x06e5:
            r3.finish()
            return
        L_0x06e9:
            r0 = 0
            r4.A3d(r3, r0)
            return
        L_0x06ee:
            boolean r0 = r1.isCallFull()
            if (r0 == 0) goto L_0x0706
            r1 = 6
            X.2dW r0 = new X.2dW
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A02(r0, r1)
            X.02C r0 = r6.AGM()
            r1.A1G(r0, r5)
            return
        L_0x0706:
            com.whatsapp.voipcalling.VoipActivityV2.A0T(r7, r6)
            return
        L_0x070a:
            r3.A0A()
            return
        L_0x070e:
            boolean r0 = r7 instanceof com.obwhatsapp.profile.ProfilePhotoBlockListPickerActivity
            if (r0 == 0) goto L_0x0730
            com.obwhatsapp.profile.ProfilePhotoBlockListPickerActivity r7 = (com.obwhatsapp.profile.ProfilePhotoBlockListPickerActivity) r7
            X.0pt r2 = r7.A05
            r1 = 2131889017(0x7f120b79, float:1.9412686E38)
            r0 = 0
            r2.A08(r0, r1)
            X.2ZL r1 = r7.A00
            java.util.Set r0 = r7.A0T
            X.1cy r2 = r1.A01(r0)
            r1 = 126(0x7e, float:1.77E-43)
            com.facebook.redex.IDxObserverShape116S0100000_2_I1 r0 = new com.facebook.redex.IDxObserverShape116S0100000_2_I1
            r0.<init>(r7, r1)
            r2.A0A(r7, r0)
            return
        L_0x0730:
            boolean r0 = r7 instanceof com.obwhatsapp.profile.AboutStatusBlockListPickerActivity
            if (r0 == 0) goto L_0x0752
            com.obwhatsapp.profile.AboutStatusBlockListPickerActivity r7 = (com.obwhatsapp.profile.AboutStatusBlockListPickerActivity) r7
            X.0pt r2 = r7.A05
            r1 = 2131889017(0x7f120b79, float:1.9412686E38)
            r0 = 0
            r2.A08(r0, r1)
            X.2Ys r1 = r7.A00
            java.util.Set r0 = r7.A0T
            X.1cy r2 = r1.A01(r0)
            r1 = 124(0x7c, float:1.74E-43)
            com.facebook.redex.IDxObserverShape116S0100000_2_I1 r0 = new com.facebook.redex.IDxObserverShape116S0100000_2_I1
            r0.<init>(r7, r1)
            r2.A0A(r7, r0)
            return
        L_0x0752:
            boolean r0 = r7 instanceof com.obwhatsapp.lastseen.LastSeenBlockListPickerActivity
            if (r0 == 0) goto L_0x0774
            com.obwhatsapp.lastseen.LastSeenBlockListPickerActivity r7 = (com.obwhatsapp.lastseen.LastSeenBlockListPickerActivity) r7
            X.0pt r2 = r7.A05
            r1 = 2131889017(0x7f120b79, float:1.9412686E38)
            r0 = 0
            r2.A08(r0, r1)
            X.2ZA r1 = r7.A00
            java.util.Set r0 = r7.A0T
            X.1cy r2 = r1.A01(r0)
            r1 = 99
            com.facebook.redex.IDxObserverShape116S0100000_2_I1 r0 = new com.facebook.redex.IDxObserverShape116S0100000_2_I1
            r0.<init>(r7, r1)
            r2.A0A(r7, r0)
            return
        L_0x0774:
            com.obwhatsapp.group.GroupAddBlacklistPickerActivity r7 = (com.obwhatsapp.group.GroupAddBlacklistPickerActivity) r7
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0783
            com.obwhatsapp.invites.NobodyDeprecatedDialogFragment r0 = new com.obwhatsapp.invites.NobodyDeprecatedDialogFragment
            r0.<init>()
            r7.Afc(r0)
            return
        L_0x0783:
            X.0pt r2 = r7.A05
            r1 = 2131889017(0x7f120b79, float:1.9412686E38)
            r0 = 0
            r2.A08(r0, r1)
            X.1Mk r1 = r7.A00
            java.util.Set r0 = r7.A0T
            X.1cy r2 = r1.A01(r0)
            r1 = 92
            com.facebook.redex.IDxObserverShape116S0100000_2_I1 r0 = new com.facebook.redex.IDxObserverShape116S0100000_2_I1
            r0.<init>(r7, r1)
            r2.A0A(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0.A06(android.view.View):void");
    }
}

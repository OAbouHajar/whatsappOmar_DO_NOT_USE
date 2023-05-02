package com.facebook.redex;

import android.content.DialogInterface;

public class IDxCListenerShape29S0200000_2_I1 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape29S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01a3, code lost:
        X.C13680ns.A1O(r1, r0);
        r17.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b0, code lost:
        throw X.C18450wi.A03("viewModel");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r4.A14.execute(new com.facebook.redex.RunnableRunnableShape0S0210000_I0(r4, r5, 3, r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.content.DialogInterface r17, int r18) {
        /*
            r16 = this;
            r4 = r16
            int r0 = r4.A02
            r6 = r18
            switch(r0) {
                case 0: goto L_0x0020;
                case 1: goto L_0x00f7;
                case 2: goto L_0x0181;
                case 3: goto L_0x0195;
                case 4: goto L_0x01b1;
                case 5: goto L_0x01d0;
                case 6: goto L_0x01fa;
                case 7: goto L_0x0206;
                case 8: goto L_0x0107;
                case 9: goto L_0x0210;
                case 10: goto L_0x0229;
                case 11: goto L_0x023b;
                case 12: goto L_0x0268;
                case 13: goto L_0x0288;
                case 14: goto L_0x02b1;
                case 15: goto L_0x02be;
                case 16: goto L_0x012d;
                case 17: goto L_0x02e6;
                case 18: goto L_0x02f2;
                case 19: goto L_0x02fe;
                case 20: goto L_0x030a;
                case 21: goto L_0x0316;
                case 22: goto L_0x0346;
                case 23: goto L_0x035d;
                case 24: goto L_0x0161;
                case 25: goto L_0x036d;
                case 26: goto L_0x0384;
                case 27: goto L_0x03b6;
                case 28: goto L_0x03c2;
                case 29: goto L_0x03ed;
                case 30: goto L_0x03f9;
                case 31: goto L_0x0405;
                case 32: goto L_0x042f;
                case 33: goto L_0x043b;
                case 34: goto L_0x0447;
                case 35: goto L_0x0174;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r4.A00
            com.whatsapp.voipcalling.VoipActivityV2$RemoveUserConfirmationDialogFragment r0 = (com.whatsapp.voipcalling.VoipActivityV2.RemoveUserConfirmationDialogFragment) r0
            java.lang.Object r5 = r4.A01
            X.25g r4 = r0.A00
            if (r4 == 0) goto L_0x001f
            r3 = 0
        L_0x0014:
            java.util.concurrent.ScheduledExecutorService r2 = r4.A14
            r1 = 3
            com.facebook.redex.RunnableRunnableShape0S0210000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0210000_I0
            r0.<init>(r4, r5, r1, r3)
            r2.execute(r0)
        L_0x001f:
            return
        L_0x0020:
            java.lang.Object r3 = r4.A01
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r3.get(r6)
            X.4Qg r0 = (X.C85854Qg) r0
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x007f
            java.lang.Object r4 = r4.A00
            com.obwhatsapp.PhoneHyperLinkDialogFragment r4 = (com.obwhatsapp.PhoneHyperLinkDialogFragment) r4
            X.1MY r1 = r4.A07
            r0 = 6
            X.AnonymousClass3K3.A1F(r4, r1, r0)
            X.0sG r1 = r4.A05
            com.whatsapp.jid.UserJid r0 = r4.A08
            X.AnonymousClass00B.A06(r0)
            X.0sH r2 = r1.A0A(r0)
            X.0ph r1 = new X.0ph
            r1.<init>()
            android.content.Context r0 = r4.A02()
            android.content.Intent r3 = r1.A0v(r0, r2)
            r1 = 7
            java.lang.String r0 = "args_conversation_screen_entry_point"
            r3.putExtra(r0, r1)
            boolean r1 = r4.A0E
            java.lang.String r0 = "isWAAccount"
            r3.putExtra(r0, r1)
            boolean r1 = r4.A0C
            java.lang.String r0 = "isPhoneNumberOwner"
            r3.putExtra(r0, r1)
            java.lang.String r1 = "entry_point_conversion_source"
            java.lang.String r0 = "phone_number_hyperlink"
            r3.putExtra(r1, r0)
            java.lang.String r1 = "entry_point_conversion_app"
            java.lang.String r0 = "whatsapp"
            r3.putExtra(r1, r0)
            X.0zJ r2 = r4.A00
            android.content.Context r1 = r4.A02()
            java.lang.String r0 = "PhoneHyperLinkDialogFragment"
            r2.A08(r1, r3, r0)
            return
        L_0x007f:
            java.lang.Object r0 = r3.get(r6)
            X.4Qg r0 = (X.C85854Qg) r0
            int r0 = r0.A00
            r5 = 0
            r2 = 4
            if (r0 != r2) goto L_0x00ad
            java.lang.Object r4 = r4.A00
            com.obwhatsapp.PhoneHyperLinkDialogFragment r4 = (com.obwhatsapp.PhoneHyperLinkDialogFragment) r4
            X.1MY r1 = r4.A07
            r0 = 10
            X.AnonymousClass3K3.A1F(r4, r1, r0)
            X.0sG r1 = r4.A05
            com.whatsapp.jid.UserJid r0 = r4.A08
            X.AnonymousClass00B.A06(r0)
            X.0sH r3 = r1.A0A(r0)
            X.10c r2 = r4.A04
            android.content.Context r1 = r4.A02()
            r0 = 33
            r2.A01(r1, r3, r0, r5)
            return
        L_0x00ad:
            java.lang.Object r0 = r3.get(r6)
            X.4Qg r0 = (X.C85854Qg) r0
            int r1 = r0.A00
            r0 = 2
            if (r1 != r0) goto L_0x00d1
            java.lang.Object r3 = r4.A00
            com.obwhatsapp.PhoneHyperLinkDialogFragment r3 = (com.obwhatsapp.PhoneHyperLinkDialogFragment) r3
            X.1MY r0 = r3.A07
            X.AnonymousClass3K3.A1F(r3, r0, r2)
            X.0uW r2 = r3.A02
            android.content.Context r1 = r3.A02()
            java.lang.String r0 = r3.A0B
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.Act(r1, r0)
            return
        L_0x00d1:
            java.lang.Object r0 = r3.get(r6)
            X.4Qg r0 = (X.C85854Qg) r0
            int r1 = r0.A00
            r0 = 3
            if (r1 != r0) goto L_0x001f
            java.lang.Object r4 = r4.A00
            com.obwhatsapp.PhoneHyperLinkDialogFragment r4 = (com.obwhatsapp.PhoneHyperLinkDialogFragment) r4
            X.1MY r1 = r4.A07
            r0 = 5
            X.AnonymousClass3K3.A1F(r4, r1, r0)
            X.1Kt r3 = r4.A09
            java.lang.String r1 = r4.A0A
            r0 = 0
            r2 = 1
            android.content.Intent r1 = r3.A01(r1, r0, r2, r5)
            java.lang.String r0 = "finishActivityOnSaveCompleted"
            r1.putExtra(r0, r2)
            goto L_0x0463
        L_0x00f7:
            java.lang.Object r0 = r4.A00
            com.obwhatsapp.blocklist.UnblockDialogFragment r0 = (com.obwhatsapp.blocklist.UnblockDialogFragment) r0
            java.lang.Object r1 = r4.A01
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x001f
            r1.finish()
            return
        L_0x0107:
            java.lang.Object r1 = r4.A00
            X.01A r1 = (X.AnonymousClass01A) r1
            java.lang.Object r0 = r4.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            X.01A r3 = r1.A0D
            if (r3 == 0) goto L_0x001f
            com.obwhatsapp.contact.picker.ContactPickerFragment r3 = (com.obwhatsapp.contact.picker.ContactPickerFragment) r3
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "contact"
            r2.putExtra(r0, r1)
            X.4uj r0 = r3.A0x
            r0.A01(r2)
            X.4uj r0 = r3.A0x
            r0.A00()
            return
        L_0x012d:
            java.lang.Object r5 = r4.A00
            com.obwhatsapp.base.WaDialogFragment r5 = (com.obwhatsapp.base.WaDialogFragment) r5
            java.lang.Object r3 = r4.A01
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            X.00l r2 = r5.A0C()
            if (r2 == 0) goto L_0x001f
            X.0pd r1 = r5.A04
            r0 = 1750(0x6d6, float:2.452E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0473
            int r1 = r3.size()
            r0 = 1
            if (r1 != r0) goto L_0x0473
            boolean r0 = r2 instanceof com.obwhatsapp.documentpicker.DocumentPickerActivity
            if (r0 == 0) goto L_0x0473
            X.00l r1 = r5.A0C()
            com.obwhatsapp.documentpicker.DocumentPickerActivity r1 = (com.obwhatsapp.documentpicker.DocumentPickerActivity) r1
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r1.A38(r0)
            return
        L_0x0161:
            java.lang.Object r2 = r4.A00
            com.obwhatsapp.invites.RevokeInviteDialogFragment r2 = (com.obwhatsapp.invites.RevokeInviteDialogFragment) r2
            java.lang.Object r1 = r4.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r0 = -1
            if (r6 != r0) goto L_0x001f
            X.2Oo r0 = r2.A02
            if (r0 == 0) goto L_0x001f
            r0.AWc(r1)
            return
        L_0x0174:
            java.lang.Object r0 = r4.A00
            com.whatsapp.voipcalling.VoipActivityV2$RemoveUserConfirmationDialogFragment r0 = (com.whatsapp.voipcalling.VoipActivityV2.RemoveUserConfirmationDialogFragment) r0
            java.lang.Object r5 = r4.A01
            X.25g r4 = r0.A00
            if (r4 == 0) goto L_0x001f
            r3 = 1
            goto L_0x0014
        L_0x0181:
            java.lang.Object r0 = r4.A01
            com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            X.269 r2 = r0.A0M
            if (r2 == 0) goto L_0x01aa
            X.027 r1 = r2.A0M
            r0 = 1
            X.C13680ns.A1O(r1, r0)
            r2.A0L = r0
            X.027 r1 = r2.A0O
            r0 = 3
            goto L_0x01a3
        L_0x0195:
            java.lang.Object r0 = r4.A01
            com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            X.269 r0 = r0.A0M
            if (r0 == 0) goto L_0x01aa
            r0.A0A()
            X.027 r1 = r0.A0M
            r0 = 1
        L_0x01a3:
            X.C13680ns.A1O(r1, r0)
            r17.dismiss()
            return
        L_0x01aa:
            java.lang.String r0 = "viewModel"
            java.lang.RuntimeException r0 = X.C18450wi.A03(r0)
            throw r0
        L_0x01b1:
            java.lang.Object r2 = r4.A00
            X.01A r2 = (X.AnonymousClass01A) r2
            java.lang.Object r0 = r4.A01
            X.0sH r0 = (X.C16010sH) r0
            android.content.Context r1 = r2.A02()
            X.0rv r0 = r0.A07()
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = r0.getRawString()
            android.content.Intent r0 = X.C14750ph.A0e(r1, r0)
            r2.A0r(r0)
            return
        L_0x01d0:
            java.lang.Object r5 = r4.A00
            com.obwhatsapp.community.CommunityDeleteDialogFragment r5 = (com.obwhatsapp.community.CommunityDeleteDialogFragment) r5
            java.lang.Object r7 = r4.A01
            java.util.List r7 = (java.util.List) r7
            X.00l r4 = r5.A0D()
            X.0pN r4 = (X.C14550pN) r4
            r0 = 2131891163(0x7f1213db, float:1.9417038E38)
            r4.Afq(r0)
            long r8 = android.os.SystemClock.elapsedRealtime()
            java.lang.ref.WeakReference r6 = X.C13690nt.A0h(r4)
            X.0sq r1 = r5.A07
            X.3yu r3 = new X.3yu
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.Ack(r3, r0)
            return
        L_0x01fa:
            java.lang.Object r1 = r4.A00
            com.obwhatsapp.community.ManageGroupsInCommunityActivity r1 = (com.obwhatsapp.community.ManageGroupsInCommunityActivity) r1
            java.lang.Object r0 = r4.A01
            X.1sW r0 = (X.C39461sW) r0
            r1.A35(r0)
            return
        L_0x0206:
            java.lang.Object r0 = r4.A00
            com.obwhatsapp.companiondevice.optin.ui.ForcedOptInActivity r0 = (com.obwhatsapp.companiondevice.optin.ui.ForcedOptInActivity) r0
            X.2qe r0 = r0.A05
            r0.A05()
            return
        L_0x0210:
            java.lang.Object r3 = r4.A00
            X.01A r3 = (X.AnonymousClass01A) r3
            java.lang.Object r2 = r4.A01
            X.0sH r2 = (X.C16010sH) r2
            X.0ph r1 = new X.0ph
            r1.<init>()
            X.00l r0 = r3.A0C()
            android.content.Intent r0 = r1.A0v(r0, r2)
            X.C54472hZ.A00(r0, r3)
            return
        L_0x0229:
            java.lang.Object r3 = r4.A00
            X.4v1 r3 = (X.C100054v1) r3
            java.lang.Object r2 = r4.A01
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            android.app.Activity r1 = r3.A02
            r0 = 1
            X.AnonymousClass29T.A00(r1, r0)
            r3.A00(r2)
            return
        L_0x023b:
            java.lang.Object r6 = r4.A00
            com.whatsapp.util.ViewOnClickCListenerShape0S0300000_I0 r6 = (com.whatsapp.util.ViewOnClickCListenerShape0S0300000_I0) r6
            java.lang.Object r0 = r4.A01
            X.4OI r0 = (X.AnonymousClass4OI) r0
            java.util.List r0 = r0.A04
            java.util.Iterator r5 = r0.iterator()
        L_0x0249:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0264
            java.lang.Object r4 = r5.next()
            java.lang.Object r3 = r6.A00
            X.1bb r3 = (X.C30011bb) r3
            X.0sq r2 = r3.A1e
            r1 = 15
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r0.<init>(r3, r1, r4)
            r2.Acl(r0)
            goto L_0x0249
        L_0x0264:
            r17.dismiss()
            return
        L_0x0268:
            java.lang.Object r3 = r4.A00
            com.whatsapp.util.ViewOnClickCListenerShape5S0100000_I1_1 r3 = (com.whatsapp.util.ViewOnClickCListenerShape5S0100000_I1_1) r3
            java.lang.Object r2 = r4.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r3.A00
            X.30a r0 = (X.C600930a) r0
            java.util.ArrayList r0 = r0.A0S
            int r1 = r0.size()
            java.lang.String r0 = X.AnonymousClass000.A0n(r2, r6)
            if (r6 >= r1) goto L_0x0284
            r3.A08(r0)
            return
        L_0x0284:
            r3.A07(r0)
            return
        L_0x0288:
            java.lang.Object r3 = r4.A00
            com.obwhatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r3 = (com.obwhatsapp.conversation.conversationrow.EncryptionChangeDialogFragment) r3
            java.lang.Object r2 = r4.A01
            android.net.Uri r2 = (android.net.Uri) r2
            r0 = 2
            X.3rZ r1 = r3.A0A
            if (r1 == 0) goto L_0x02a0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.0t9 r0 = r3.A09
            r0.A06(r1)
        L_0x02a0:
            android.content.Intent r2 = X.C13690nt.A0B(r2)
            X.0zJ r1 = r3.A00
            android.content.Context r0 = r3.A0u()
            r1.A06(r0, r2)
            r3.A1D()
            return
        L_0x02b1:
            java.lang.Object r3 = r4.A00
            com.obwhatsapp.conversation.conversationrow.IdentityChangeDialogFragment r3 = (com.obwhatsapp.conversation.conversationrow.IdentityChangeDialogFragment) r3
            java.lang.Object r2 = r4.A01
            X.0sq r1 = r3.A02
            r0 = 7
            X.AnonymousClass3K4.A0u(r1, r3, r2, r0)
            return
        L_0x02be:
            java.lang.Object r7 = r4.A00
            com.obwhatsapp.dialogs.CreateOrAddToContactsDialog r7 = (com.obwhatsapp.dialogs.CreateOrAddToContactsDialog) r7
            java.lang.Object r1 = r4.A01
            java.util.List r1 = (java.util.List) r1
            X.1yb r0 = r7.A01
            X.AnonymousClass00B.A06(r0)
            java.lang.Object r0 = r1.get(r6)
            X.4Qq r0 = (X.C85954Qq) r0
            int r5 = r0.A00
            r4 = 2131364596(0x7f0a0af4, float:1.8349034E38)
            X.1yb r3 = r7.A01
            long r1 = r7.A00
            boolean r0 = r7.A02
            if (r5 != r4) goto L_0x02e2
            r3.APD(r1, r0)
            return
        L_0x02e2:
            r3.AMB(r1, r0)
            return
        L_0x02e6:
            java.lang.Object r1 = r4.A00
            com.obwhatsapp.group.ConfirmApproveAllPendingRequestsDialogFragment r1 = (com.obwhatsapp.group.ConfirmApproveAllPendingRequestsDialogFragment) r1
            java.lang.Object r0 = r4.A01
            android.os.Bundle r0 = (android.os.Bundle) r0
            com.obwhatsapp.group.ConfirmApproveAllPendingRequestsDialogFragment.A02(r0, r1)
            return
        L_0x02f2:
            java.lang.Object r1 = r4.A00
            com.obwhatsapp.group.ConfirmApproveAllPendingRequestsDialogFragment r1 = (com.obwhatsapp.group.ConfirmApproveAllPendingRequestsDialogFragment) r1
            java.lang.Object r0 = r4.A01
            android.os.Bundle r0 = (android.os.Bundle) r0
            com.obwhatsapp.group.ConfirmApproveAllPendingRequestsDialogFragment.A01(r0, r1)
            return
        L_0x02fe:
            java.lang.Object r1 = r4.A00
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r0 = r4.A01
            com.obwhatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog r0 = (com.obwhatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog) r0
            com.obwhatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog.A02(r1, r0)
            return
        L_0x030a:
            java.lang.Object r1 = r4.A00
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r0 = r4.A01
            com.obwhatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog r0 = (com.obwhatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog) r0
            com.obwhatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog.A01(r1, r0)
            return
        L_0x0316:
            java.lang.Object r3 = r4.A00
            X.3z8 r3 = (X.C79063z8) r3
            java.lang.Object r8 = r4.A01
            com.obwhatsapp.group.GroupChatInfoActivity r8 = (com.obwhatsapp.group.GroupChatInfoActivity) r8
            r0 = 2131887369(0x7f120509, float:1.9409343E38)
            r8.Afq(r0)
            X.0sq r2 = r3.A07
            X.0sH r1 = r3.A05
            java.lang.Class<X.0sL> r0 = X.C16050sL.class
            com.whatsapp.jid.Jid r9 = r1.A08(r0)
            X.AnonymousClass00B.A06(r9)
            X.0sL r9 = (X.C16050sL) r9
            X.0pt r5 = r3.A01
            X.0so r4 = r3.A00
            X.0ug r10 = r3.A06
            X.127 r6 = r3.A02
            X.0uk r7 = r3.A03
            com.facebook.redex.RunnableRunnableShape1S0700000_I1 r3 = new com.facebook.redex.RunnableRunnableShape1S0700000_I1
            r3.<init>((X.C16300so) r4, (X.C14870pt) r5, (X.AnonymousClass127) r6, (X.C17230uk) r7, (com.obwhatsapp.group.GroupChatInfoActivity) r8, (X.C16050sL) r9, (X.C17190ug) r10)
            r2.Acl(r3)
            return
        L_0x0346:
            java.lang.Object r3 = r4.A00
            com.obwhatsapp.groupsuspend.CreateGroupSuspendDialog r3 = (com.obwhatsapp.groupsuspend.CreateGroupSuspendDialog) r3
            java.lang.Object r2 = r4.A01
            X.00l r2 = (X.C001000l) r2
            X.1BZ r1 = r3.A01
            java.lang.String r0 = "group-no-longer-available"
            r1.A00(r2, r0)
            android.app.Dialog r0 = r3.A1A()
            r0.dismiss()
            return
        L_0x035d:
            java.lang.Object r0 = r4.A00
            com.obwhatsapp.growthlock.InviteLinkUnavailableDialogFragment r0 = (com.obwhatsapp.growthlock.InviteLinkUnavailableDialogFragment) r0
            java.lang.Object r2 = r4.A01
            X.00l r2 = (X.C001000l) r2
            X.1BZ r1 = r0.A00
            java.lang.String r0 = "invite-via-link-unavailable"
            r1.A00(r2, r0)
            return
        L_0x036d:
            java.lang.Object r2 = r4.A00
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r1 = r4.A01
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1
            java.lang.String r0 = "disable wifi radio"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r1 == 0) goto L_0x0380
            r0 = 0
            r1.setWifiEnabled(r0)
        L_0x0380:
            r2.finish()
            return
        L_0x0384:
            java.lang.Object r0 = r4.A00
            X.4QK r0 = (X.AnonymousClass4QK) r0
            java.lang.Object r3 = r4.A01
            android.content.Context r3 = (android.content.Context) r3
            android.content.pm.PackageManager r2 = r3.getPackageManager()
            X.0xQ r0 = r0.A00
            android.net.Uri r0 = r0.A00()
            android.content.Intent r1 = X.C13690nt.A0B(r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r2.queryIntentActivities(r1, r0)
            X.C18450wi.A0B(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03ae
            r3.startActivity(r1)
        L_0x03ae:
            android.app.Activity r0 = X.C19980zJ.A00(r3)
            r0.finish()
            return
        L_0x03b6:
            java.lang.Object r1 = r4.A00
            com.obwhatsapp.payments.ui.BusinessHubActivity r1 = (com.obwhatsapp.payments.ui.BusinessHubActivity) r1
            java.lang.Object r0 = r4.A01
            X.2Ta r0 = (X.C49402Ta) r0
            com.obwhatsapp.payments.ui.BusinessHubActivity.A03(r0, r1)
            return
        L_0x03c2:
            java.lang.Object r0 = r4.A00
            com.obwhatsapp.phonematching.ConnectionUnavailableDialogFragment r0 = (com.obwhatsapp.phonematching.ConnectionUnavailableDialogFragment) r0
            java.lang.Object r4 = r4.A01
            X.0pN r4 = (X.C14550pN) r4
            r0.A1C()
            X.0sq r1 = r0.A06
            X.1KO r5 = r0.A00
            X.01V r7 = r0.A02
            X.15W r10 = r0.A04
            X.0sj r8 = r0.A03
            X.1KP r11 = r0.A05
            X.0wP r6 = r0.A01
            r13 = 1
            r15 = 0
            java.lang.String r12 = ""
            r3 = 0
            r14 = 1
            X.379 r2 = new X.379
            r9 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String[] r0 = new java.lang.String[r15]
            r1.Ack(r2, r0)
            return
        L_0x03ed:
            java.lang.Object r1 = r4.A00
            X.37W r1 = (X.AnonymousClass37W) r1
            java.lang.Object r0 = r4.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.AnonymousClass37W.A04(r0, r1)
            return
        L_0x03f9:
            java.lang.Object r1 = r4.A00
            X.37W r1 = (X.AnonymousClass37W) r1
            java.lang.Object r0 = r4.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.AnonymousClass37W.A05(r0, r1)
            return
        L_0x0405:
            java.lang.Object r5 = r4.A00
            X.0pP r5 = (X.C14570pP) r5
            java.lang.Object r3 = r4.A01
            android.widget.EditText r3 = (android.widget.EditText) r3
            android.text.Editable r0 = r3.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            X.0sq r2 = r5.A05
            if (r0 == 0) goto L_0x0424
            r1 = 35
            com.facebook.redex.RunnableRunnableShape14S0100000_I0_13 r0 = new com.facebook.redex.RunnableRunnableShape14S0100000_I0_13
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.Acl(r0)
            return
        L_0x0424:
            r1 = 29
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8
            r0.<init>(r5, r1, r3)
            r2.Acl(r0)
            return
        L_0x042f:
            java.lang.Object r1 = r4.A00
            com.obwhatsapp.status.StatusConfirmMuteDialogFragment r1 = (com.obwhatsapp.status.StatusConfirmMuteDialogFragment) r1
            java.lang.Object r0 = r4.A01
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            com.obwhatsapp.status.StatusConfirmMuteDialogFragment.A02(r0, r1)
            return
        L_0x043b:
            java.lang.Object r1 = r4.A00
            com.obwhatsapp.status.StatusConfirmUnmuteDialogFragment r1 = (com.obwhatsapp.status.StatusConfirmUnmuteDialogFragment) r1
            java.lang.Object r0 = r4.A01
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            com.obwhatsapp.status.StatusConfirmUnmuteDialogFragment.A02(r0, r1)
            return
        L_0x0447:
            java.lang.Object r0 = r4.A00
            X.367 r0 = (X.AnonymousClass367) r0
            java.lang.Object r3 = r4.A01
            X.1WD r3 = (X.AnonymousClass1WD) r3
            X.1Kw r0 = r0.A02
            X.0rz r0 = r0.A02
            android.content.SharedPreferences$Editor r2 = r0.A0K()
            java.lang.String r1 = "delete_chat_clear_chat_nux_accepted"
            r0 = 1
            X.C13680ns.A0z(r2, r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.A02(r0)
            return
        L_0x0463:
            r0 = 1000(0x3e8, float:1.401E-42)
            r4.startActivityForResult(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x0469 }
            goto L_0x0472
        L_0x0469:
            X.0pt r1 = r4.A01
            r0 = 2131886240(0x7f1200a0, float:1.9407053E38)
            r1.A09(r0, r5)
            return
        L_0x0472:
            return
        L_0x0473:
            android.content.Intent r1 = X.C13680ns.A09()
            java.lang.String r0 = "android.intent.extra.STREAM"
            r1.putParcelableArrayListExtra(r0, r3)
            X.C13680ns.A0r(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape29S0200000_2_I1.onClick(android.content.DialogInterface, int):void");
    }
}

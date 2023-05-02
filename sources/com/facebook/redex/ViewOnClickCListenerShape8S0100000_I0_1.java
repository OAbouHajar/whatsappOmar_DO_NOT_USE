package com.facebook.redex;

import android.view.View;

public class ViewOnClickCListenerShape8S0100000_I0_1 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape8S0100000_I0_1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x031b, code lost:
        r2.A01(r1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0323, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0165, code lost:
        r1.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0168, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x027b, code lost:
        r4.A3a(3);
        r4.A0U.A01(r4, r4.A0x, 6, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0288, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r12) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x0525;
                case 1: goto L_0x0510;
                case 2: goto L_0x04c8;
                case 3: goto L_0x04ba;
                case 4: goto L_0x04aa;
                case 5: goto L_0x0495;
                case 6: goto L_0x0474;
                case 7: goto L_0x045a;
                case 8: goto L_0x041f;
                case 9: goto L_0x03d2;
                case 10: goto L_0x0371;
                case 11: goto L_0x0360;
                case 12: goto L_0x0358;
                case 13: goto L_0x0350;
                case 14: goto L_0x0324;
                case 15: goto L_0x0311;
                case 16: goto L_0x0305;
                case 17: goto L_0x02fa;
                case 18: goto L_0x02f1;
                case 19: goto L_0x0105;
                case 20: goto L_0x00e2;
                case 21: goto L_0x00d2;
                case 22: goto L_0x02e6;
                case 23: goto L_0x00ba;
                case 24: goto L_0x02de;
                case 25: goto L_0x02ca;
                case 26: goto L_0x02c1;
                case 27: goto L_0x0295;
                case 28: goto L_0x00a4;
                case 29: goto L_0x0289;
                case 30: goto L_0x0277;
                case 31: goto L_0x026d;
                case 32: goto L_0x0265;
                case 33: goto L_0x023b;
                case 34: goto L_0x0224;
                case 35: goto L_0x0208;
                case 36: goto L_0x01d6;
                case 37: goto L_0x01ad;
                case 38: goto L_0x008d;
                case 39: goto L_0x0195;
                case 40: goto L_0x006a;
                case 41: goto L_0x0181;
                case 42: goto L_0x0171;
                case 43: goto L_0x0169;
                case 44: goto L_0x0160;
                case 45: goto L_0x015a;
                case 46: goto L_0x004d;
                case 47: goto L_0x011e;
                case 48: goto L_0x0026;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r11.A00
            com.obwhatsapp.chatinfo.view.custom.ContactDetailsCard r1 = (com.obwhatsapp.chatinfo.view.custom.ContactDetailsCard) r1
            com.obwhatsapp.pnh.RequestPhoneNumberViewModel r0 = r1.A0V
            if (r0 == 0) goto L_0x0025
            X.2X0 r2 = r1.A0U
            if (r2 == 0) goto L_0x0025
            X.0sH r0 = r1.A0O
            if (r0 == 0) goto L_0x0025
            X.0rv r1 = r0.A0E
            boolean r0 = r1 instanceof X.AnonymousClass1ZX
            if (r0 == 0) goto L_0x0025
            X.1ZX r1 = (X.AnonymousClass1ZX) r1
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00(r1, r0)
        L_0x0025:
            return
        L_0x0026:
            java.lang.Object r1 = r11.A00
            com.obwhatsapp.chatinfo.view.custom.ContactDetailsCard r1 = (com.obwhatsapp.chatinfo.view.custom.ContactDetailsCard) r1
            X.0sH r0 = r1.A0O
            if (r0 == 0) goto L_0x0025
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.obwhatsapp.dialogs.AudioVideoBottomSheetDialogFragment r2 = new com.obwhatsapp.dialogs.AudioVideoBottomSheetDialogFragment
            r2.<init>()
            r2.A0T(r0)
            android.content.Context r1 = r1.getContext()
            java.lang.Class<X.0pL> r0 = X.C14530pL.class
            android.app.Activity r0 = X.C19980zJ.A01(r1, r0)
            X.0pN r0 = (X.C14550pN) r0
            if (r0 == 0) goto L_0x0025
            r0.Afc(r2)
            return
        L_0x004d:
            java.lang.Object r1 = r11.A00
            com.obwhatsapp.chatinfo.view.custom.ContactDetailsCard r1 = (com.obwhatsapp.chatinfo.view.custom.ContactDetailsCard) r1
            X.1VN r2 = r1.A0R
            if (r2 == 0) goto L_0x0025
            X.0sH r0 = r1.A0O
            if (r0 == 0) goto L_0x0025
            X.0rv r0 = r0.A0E
            com.whatsapp.jid.UserJid r3 = com.whatsapp.jid.UserJid.of(r0)
            r4 = 0
            int r7 = r1.A00
            r8 = 1
            java.lang.String r6 = "contact_card"
            r5 = r4
            r2.A00(r3, r4, r5, r6, r7, r8)
            return
        L_0x006a:
            java.lang.Object r2 = r11.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r2 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r2
            X.0sK r0 = r2.A01
            r0.A0B()
            X.1Zb r0 = r0.A01
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = X.C24561Gk.A01(r0)
            if (r1 == 0) goto L_0x0025
            X.0sH r0 = r2.A0x
            boolean r0 = r0.A0H()
            com.obwhatsapp.chatinfo.view.custom.PhoneNumberSharedBottomSheet r1 = X.AnonymousClass46K.A00(r1, r0)
            java.lang.String r0 = "SharePhoneNumberBottomSheet"
            r2.Afb(r1, r0)
            return
        L_0x008d:
            java.lang.Object r2 = r11.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r2 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r2
            X.0sH r0 = r2.A0x
            if (r0 == 0) goto L_0x0025
            X.0rv r1 = r0.A0E
            if (r1 == 0) goto L_0x0025
            r0 = 7
            com.obwhatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet r1 = X.AnonymousClass46L.A00(r1, r0)
            java.lang.String r0 = "SharePhoneNumberBottomSheet"
            r2.Afb(r1, r0)
            return
        L_0x00a4:
            java.lang.Object r1 = r11.A00
            com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment r1 = (com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r1
            r0 = 1
            r1.A1G(r0)
            X.00l r1 = r1.A0D()
            boolean r0 = r1 instanceof X.C447325i
            if (r0 == 0) goto L_0x0025
            X.25i r1 = (X.C447325i) r1
            r1.AOD()
            return
        L_0x00ba:
            java.lang.Object r0 = r11.A00
            X.01A r0 = (X.AnonymousClass01A) r0
            X.00l r1 = r0.A0C()
            boolean r0 = r1 instanceof X.C14640pW
            if (r0 == 0) goto L_0x0025
            X.0pW r1 = (X.C14640pW) r1
            X.1aI r0 = r1.AAQ()
            if (r0 == 0) goto L_0x0025
            r0.A0Y()
            return
        L_0x00d2:
            java.lang.Object r1 = r11.A00
            X.1aI r1 = (X.C29251aI) r1
            boolean r0 = r1.A0X()
            if (r0 != 0) goto L_0x0025
            X.0pN r0 = r1.A0A
            r0.onBackPressed()
            return
        L_0x00e2:
            java.lang.Object r1 = r11.A00
            X.1aI r1 = (X.C29251aI) r1
            boolean r0 = r1.A0X()
            if (r0 != 0) goto L_0x0025
            X.2V7 r3 = r1.A0G
            com.obwhatsapp.camera.CameraBottomSheetBehavior r2 = r3.A0B
            r0 = 3
            r2.A0M(r0)
            r1 = 1
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x00fb
            r2.A00 = r1
        L_0x00fb:
            android.view.View r1 = r3.A08
            r0 = 0
            r1.setVisibility(r0)
            r3.A01()
            return
        L_0x0105:
            java.lang.Object r2 = r11.A00
            X.1aI r2 = (X.C29251aI) r2
            boolean r0 = r2.A0X()
            if (r0 != 0) goto L_0x0025
            X.2V5 r1 = r2.A0F
            X.2Qt r0 = r2.A0C
            java.lang.String r0 = r0.ALn()
            r1.A05(r0)
            r2.A0C()
            return
        L_0x011e:
            java.lang.Object r6 = r11.A00
            com.obwhatsapp.chatinfo.view.custom.ContactDetailsCard r6 = (com.obwhatsapp.chatinfo.view.custom.ContactDetailsCard) r6
            X.2jg r1 = r6.A0Q
            if (r1 == 0) goto L_0x012a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A09 = r0
        L_0x012a:
            X.0zJ r5 = r6.A0A
            android.content.Context r4 = r6.getContext()
            X.0ph r3 = new X.0ph
            r3.<init>()
            android.content.Context r2 = r6.getContext()
            X.0sH r1 = r6.A0O
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)
            X.0rv r0 = (X.C15830rv) r0
            android.content.Intent r1 = r3.A0x(r2, r0)
            java.lang.String r0 = "args_conversation_screen_entry_point"
            r2 = 1
            android.content.Intent r1 = r1.putExtra(r0, r2)
            java.lang.String r0 = "extra_show_search_on_create"
            android.content.Intent r1 = r1.putExtra(r0, r2)
            java.lang.String r0 = "ContactInfo"
            r5.A08(r4, r1, r0)
            return
        L_0x015a:
            java.lang.Object r1 = r11.A00
            com.obwhatsapp.chatinfo.view.custom.ContactDetailsCard r1 = (com.obwhatsapp.chatinfo.view.custom.ContactDetailsCard) r1
            r0 = 0
            goto L_0x0165
        L_0x0160:
            java.lang.Object r1 = r11.A00
            com.obwhatsapp.chatinfo.view.custom.ContactDetailsCard r1 = (com.obwhatsapp.chatinfo.view.custom.ContactDetailsCard) r1
            r0 = 1
        L_0x0165:
            r1.A02(r0)
            return
        L_0x0169:
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.chatinfo.ListChatInfoActivity r0 = (com.obwhatsapp.chatinfo.ListChatInfoActivity) r0
            r0.A3N()
            return
        L_0x0171:
            java.lang.Object r1 = r11.A00
            com.obwhatsapp.chatinfo.ListChatInfoActivity r1 = (com.obwhatsapp.chatinfo.ListChatInfoActivity) r1
            X.1kx r0 = r1.A3M()
            android.content.Intent r0 = X.C14750ph.A0S(r1, r0)
            r1.startActivity(r0)
            return
        L_0x0181:
            java.lang.Object r3 = r11.A00
            X.2DL r3 = (X.AnonymousClass2DL) r3
            X.1Kw r0 = r3.A0O
            X.1WD r2 = r0.A07(r3)
            r1 = 1
            com.facebook.redex.IDxNConsumerShape154S0100000_2_I1 r0 = new com.facebook.redex.IDxNConsumerShape154S0100000_2_I1
            r0.<init>(r3, r1)
            r2.A00(r0)
            return
        L_0x0195:
            java.lang.Object r2 = r11.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r2 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r2
            X.2jg r1 = r2.A13
            if (r1 == 0) goto L_0x01a1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0B = r0
        L_0x01a1:
            com.whatsapp.jid.UserJid r0 = r2.A3N()
            android.content.Intent r0 = X.C14750ph.A0S(r2, r0)
            r2.startActivity(r0)
            return
        L_0x01ad:
            java.lang.Object r4 = r11.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r4 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r4
            android.content.Context r0 = r4.getApplicationContext()
            com.whatsapp.jid.UserJid r3 = r4.A3N()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.settings.SettingsJidNotificationActivity"
            r2.setClassName(r1, r0)
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "jid"
            r2.putExtra(r0, r1)
            r0 = 12
            r4.startActivityForResult(r2, r0)
            return
        L_0x01d6:
            java.lang.Object r3 = r11.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r3 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r3
            r0 = 9
            r3.A3Z(r0)
            r0 = 1
            r3.A3a(r0)
            android.content.Context r1 = r3.getApplicationContext()
            r0 = 0
            android.content.Intent r2 = X.C14750ph.A08(r1, r0)
            com.whatsapp.jid.UserJid r0 = r3.A3N()
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "jid"
            android.content.Intent r1 = r2.putExtra(r0, r1)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            android.content.Intent r2 = r1.addFlags(r0)
            X.0zJ r1 = r3.A00
            java.lang.String r0 = "ContactInfoActivity"
            r1.A08(r3, r2, r0)
            return
        L_0x0208:
            java.lang.Object r4 = r11.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r4 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r4
            com.whatsapp.jid.UserJid r3 = r4.A3N()
            boolean r0 = r3 instanceof X.AnonymousClass1ZX
            if (r0 == 0) goto L_0x0220
            X.0sq r2 = r4.A05
            r1 = 2
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r4, r1, r3)
            r2.Acl(r0)
            return
        L_0x0220:
            r4.A3b(r3)
            return
        L_0x0224:
            java.lang.Object r4 = r11.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r4 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r4
            r0 = 10
            r4.A3Z(r0)
            r0 = 2
            r4.A3a(r0)
            X.10c r3 = r4.A0U
            X.0sH r2 = r4.A0x
            r1 = 6
            r0 = 0
            r3.A01(r4, r2, r1, r0)
            return
        L_0x023b:
            java.lang.Object r6 = r11.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r6 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r6
            com.whatsapp.jid.UserJid r5 = r6.A3N()
            long r2 = r6.A00
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.conversation.conversationrow.message.KeptMessagesActivity"
            r4.setClassName(r1, r0)
            java.lang.String r1 = X.C16030sJ.A03(r5)
            java.lang.String r0 = "jid"
            r4.putExtra(r0, r1)
            java.lang.String r0 = "keptMessageCount"
            r4.putExtra(r0, r2)
            r6.startActivity(r4)
            return
        L_0x0265:
            java.lang.Object r0 = r11.A00
            X.2DL r0 = (X.AnonymousClass2DL) r0
            r0.A39()
            return
        L_0x026d:
            java.lang.Object r4 = r11.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r4 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r4
            r0 = 11
            r4.A3Z(r0)
            goto L_0x027b
        L_0x0277:
            java.lang.Object r4 = r11.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r4 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r4
        L_0x027b:
            r0 = 3
            r4.A3a(r0)
            X.10c r3 = r4.A0U
            X.0sH r2 = r4.A0x
            r1 = 6
            r0 = 1
            r3.A01(r4, r2, r1, r0)
            return
        L_0x0289:
            java.lang.Object r1 = r11.A00
            com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment r1 = (com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r1
            java.lang.String r0 = r1.A1B()
            r1.A1F(r0)
            return
        L_0x0295:
            java.lang.Object r1 = r11.A00
            com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment r1 = (com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r1
            r1.A1C()
            X.0qW r0 = r1.A0b
            java.lang.Object r3 = r0.getValue()
            com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r3 = (com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r3
            java.lang.String r2 = r1.A1B()
            com.whatsapp.jid.UserJid r1 = r1.A0P
            if (r1 != 0) goto L_0x02b9
            java.lang.String r0 = "bizJid"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x02b9:
            r0 = 0
            X.C18450wi.A0H(r2, r0)
            r3.A08(r1, r2)
            return
        L_0x02c1:
            java.lang.Object r1 = r11.A00
            X.0rI r1 = (X.C15540rI) r1
            r0 = 3
            r1.A04(r0)
            return
        L_0x02ca:
            java.lang.Object r0 = r11.A00
            X.2SL r0 = (X.AnonymousClass2SL) r0
            X.0qW r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.3Ps r0 = (X.C64443Ps) r0
            X.1cy r1 = r0.A05
            X.2Vt r0 = X.C49792Vt.A00
            r1.A0B(r0)
            return
        L_0x02de:
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.camera.bottomsheet.CameraMediaPickerFragment r0 = (com.obwhatsapp.camera.bottomsheet.CameraMediaPickerFragment) r0
            r0.A1O()
            return
        L_0x02e6:
            java.lang.Object r0 = r11.A00
            X.1aI r0 = (X.C29251aI) r0
            r0.A0E()
            r0.A0C()
            return
        L_0x02f1:
            java.lang.Object r1 = r11.A00
            com.obwhatsapp.calling.videoparticipant.MaximizedParticipantVideoDialogFragment r1 = (com.obwhatsapp.calling.videoparticipant.MaximizedParticipantVideoDialogFragment) r1
            r0 = 1
            r1.A1O(r0)
            return
        L_0x02fa:
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r0 = (com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2) r0
            X.1BJ r2 = r0.A0B
            X.00l r1 = r0.A0D()
            goto L_0x031b
        L_0x0305:
            java.lang.Object r0 = r11.A00
            X.01A r0 = (X.AnonymousClass01A) r0
            X.00l r0 = r0.A0C()
            X.AnonymousClass1yL.A05(r0)
            return
        L_0x0311:
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.calling.callhistory.CallsHistoryFragment r0 = (com.obwhatsapp.calling.callhistory.CallsHistoryFragment) r0
            X.1BJ r2 = r0.A08
            X.00l r1 = r0.A0C()
        L_0x031b:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01(r1, r0)
            return
        L_0x0324:
            java.lang.Object r3 = r11.A00
            com.obwhatsapp.calling.callhistory.CallsHistoryFragment r3 = (com.obwhatsapp.calling.callhistory.CallsHistoryFragment) r3
            X.0wP r0 = r3.A0H
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x0346
            android.content.Context r0 = r3.A02()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.calling.calllink.view.CallLinkActivity"
            r2.setClassName(r1, r0)
            r3.A0r(r2)
            return
        L_0x0346:
            X.0pt r2 = r3.A05
            r1 = 2131886931(0x7f120353, float:1.9408455E38)
            r0 = 0
            r2.A09(r1, r0)
            return
        L_0x0350:
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner r0 = (com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner) r0
            r0.A01()
            return
        L_0x0358:
            java.lang.Object r0 = r11.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1C()
            return
        L_0x0360:
            java.lang.Object r2 = r11.A00
            com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r2 = (com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r2
            java.lang.String r1 = r2.A07()
            if (r1 != 0) goto L_0x036c
            java.lang.String r1 = ""
        L_0x036c:
            r0 = 2
            r2.A0O(r1, r0)
            return
        L_0x0371:
            java.lang.Object r2 = r11.A00
            com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r2 = (com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r2
            X.0sj r3 = r2.A0A
            r5 = 2131890647(0x7f1211d7, float:1.9415992E38)
            r6 = 2131890638(0x7f1211ce, float:1.9415973E38)
            r7 = 34
            java.lang.String[] r4 = X.AnonymousClass1GE.A07
            r8 = 0
            boolean r0 = com.obwhatsapp.RequestPermissionActivity.A0U(r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x03a0
            X.2R7 r1 = r2.A09
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x03a0
            r1.A01()
            X.2R7 r0 = r2.A09
            android.view.View r0 = r0.A03
            if (r0 == 0) goto L_0x039a
            r0.setVisibility(r8)
        L_0x039a:
            X.2jz r0 = r2.A0C
            r0.A09()
            return
        L_0x03a0:
            X.0sj r0 = r2.A0A
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x03b7
            X.2R7 r1 = r2.A09
            boolean r0 = r1.A0D
            if (r0 != 0) goto L_0x03b7
            X.4DM r0 = new X.4DM
            r0.<init>(r2)
            r1.A02(r0)
            return
        L_0x03b7:
            X.2R7 r0 = r2.A09
            r2 = 1
            r0.A0E = r2
            X.1Kb r0 = r0.A0J
            X.1I2 r0 = r0.A02
            android.content.SharedPreferences r0 = r0.A00()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "DIRECTORY_LOCATION_INFO_SHOWN"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
            return
        L_0x03d2:
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            X.269 r3 = r0.A0M
            if (r3 != 0) goto L_0x03e8
            java.lang.String r0 = "viewModel"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x03e8:
            X.2ry r0 = r3.A07
            r3.A0D(r0)
            X.2rx r0 = r3.A08
            r3.A0F(r0)
            X.0ui r2 = r3.A0U
            r0 = 79
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.1a7 r0 = new X.1a7
            r0.<init>()
            r0.A0B = r1
            r2.A06(r0)
            X.027 r2 = r3.A0O
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A0B(r0)
            r3.A0L = r1
            java.lang.String r0 = "map_view"
            r3.A0B = r0
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0A = r0
            r3.A0A()
            return
        L_0x041f:
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            X.269 r4 = r0.A0M
            if (r4 != 0) goto L_0x0435
            java.lang.String r0 = "viewModel"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0435:
            X.0ui r3 = r4.A0U
            r2 = 1
            X.1a7 r1 = new X.1a7
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A07 = r0
            r3.A06(r1)
            r4.A0K = r2
            boolean r2 = r4.A0L()
            X.1cy r1 = r4.A0f
            r0 = 7
            if (r2 == 0) goto L_0x0452
            r0 = 2
        L_0x0452:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B(r0)
            return
        L_0x045a:
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            X.269 r0 = r0.A0M
            if (r0 != 0) goto L_0x0470
            java.lang.String r0 = "viewModel"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0470:
            r0.A07()
            return
        L_0x0474:
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            X.269 r1 = r0.A0M
            if (r1 != 0) goto L_0x048a
            java.lang.String r0 = "viewModel"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x048a:
            X.2ry r0 = r1.A07
            r1.A0D(r0)
            X.2rx r0 = r1.A08
            r1.A0F(r0)
            return
        L_0x0495:
            java.lang.Object r2 = r11.A00
            com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r2 = (com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryActivity) r2
            java.util.TimerTask r0 = r2.A0E
            if (r0 == 0) goto L_0x04a0
            r0.cancel()
        L_0x04a0:
            X.266 r1 = r2.A08
            r0 = 1
            r1.A05(r0)
            r2.onBackPressed()
            return
        L_0x04aa:
            java.lang.Object r1 = r11.A00
            com.obwhatsapp.businessapisearch.view.activity.BusinessApiSearchActivity r1 = (com.obwhatsapp.businessapisearch.view.activity.BusinessApiSearchActivity) r1
            com.obwhatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment r0 = r1.A03
            if (r0 == 0) goto L_0x04b6
            r0.A1C()
            return
        L_0x04b6:
            r1.onBackPressed()
            return
        L_0x04ba:
            java.lang.Object r1 = r11.A00
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
        L_0x04c8:
            java.lang.Object r3 = r11.A00
            X.26l r3 = (X.C449726l) r3
            X.0x0 r2 = r3.A0k
            r1 = 774774794(0x2e2e200a, float:3.9591476E-11)
            java.lang.String r4 = "cart_add_tag"
            java.lang.String r0 = "ProductBaseActivity"
            r2.A00(r1, r4, r0)
            X.0x0 r2 = r3.A0k
            X.0sK r1 = r3.A01
            com.whatsapp.jid.UserJid r0 = r3.A0i
            boolean r0 = r1.A0I(r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "IsConsumer"
            r2.A04(r4, r0, r1)
            X.0x0 r2 = r3.A0k
            java.lang.String r1 = "EntryPoint"
            java.lang.String r0 = "Product"
            r2.A03(r4, r1, r0)
            X.2ql r0 = r3.A0b
            X.1mM r4 = r3.A0Q
            com.whatsapp.jid.UserJid r5 = r3.A0i
            java.lang.String r6 = r3.A0o
            java.lang.String r7 = r3.A0q
            java.lang.String r8 = r3.A0n
            r9 = 1
            if (r4 != 0) goto L_0x050a
            X.027 r1 = r0.A06
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A09(r0)
            return
        L_0x050a:
            X.2Xb r3 = r0.A0C
            r3.A01(r4, r5, r6, r7, r8, r9)
            return
        L_0x0510:
            java.lang.Object r4 = r11.A00
            X.26l r4 = (X.C449726l) r4
            com.whatsapp.jid.UserJid r3 = r4.A0i
            java.lang.String r2 = r4.A0p
            r1 = 1
            r0 = 0
            X.C18450wi.A0H(r3, r0)
            com.obwhatsapp.biz.cart.view.fragment.CartFragment r0 = com.obwhatsapp.biz.cart.view.fragment.CartFragment.A01(r3, r2, r1)
            r4.Afc(r0)
            return
        L_0x0525:
            java.lang.Object r3 = r11.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.report.ReportActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1.onClick(android.view.View):void");
    }
}

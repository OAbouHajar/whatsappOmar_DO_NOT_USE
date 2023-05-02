package com.whatsapp.util;

import X.C34331k5;

public class ViewOnClickCListenerShape1S0200000_I1 extends C34331k5 {
    public Object A00;
    public Object A01;
    public final int A02;

    public ViewOnClickCListenerShape1S0200000_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (r3.A01(r5, r2, r1, r0) != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0607, code lost:
        if (r1 != false) goto L_0x0628;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0628, code lost:
        if (r0 != false) goto L_0x0645;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        r5.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x062a, code lost:
        r1 = r3.A03;
        r0 = 203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x062e, code lost:
        r2 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0632, code lost:
        r1.A0B(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0635, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x063e, code lost:
        if (r0 != false) goto L_0x0645;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0640, code lost:
        r1 = r3.A03;
        r0 = 202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0645, code lost:
        r1 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0655, code lost:
        r1.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0658, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r17) {
        /*
            r16 = this;
            r4 = r16
            int r0 = r4.A02
            r5 = r17
            switch(r0) {
                case 0: goto L_0x008b;
                case 1: goto L_0x067a;
                case 2: goto L_0x0672;
                case 3: goto L_0x0009;
                case 4: goto L_0x067a;
                case 5: goto L_0x066a;
                case 6: goto L_0x0009;
                case 7: goto L_0x0659;
                case 8: goto L_0x064f;
                case 9: goto L_0x0648;
                case 10: goto L_0x060a;
                case 11: goto L_0x05eb;
                case 12: goto L_0x05e4;
                case 13: goto L_0x05a2;
                case 14: goto L_0x058f;
                case 15: goto L_0x056f;
                case 16: goto L_0x0549;
                case 17: goto L_0x0535;
                case 18: goto L_0x0520;
                case 19: goto L_0x04d1;
                case 20: goto L_0x007a;
                case 21: goto L_0x04b7;
                case 22: goto L_0x04a1;
                case 23: goto L_0x0685;
                case 24: goto L_0x0061;
                case 25: goto L_0x0051;
                case 26: goto L_0x0478;
                case 27: goto L_0x0461;
                case 28: goto L_0x03fd;
                case 29: goto L_0x03e6;
                case 30: goto L_0x030d;
                case 31: goto L_0x0304;
                case 32: goto L_0x02fb;
                case 33: goto L_0x02df;
                case 34: goto L_0x02c3;
                case 35: goto L_0x0289;
                case 36: goto L_0x026c;
                case 37: goto L_0x0236;
                case 38: goto L_0x0208;
                case 39: goto L_0x01fc;
                case 40: goto L_0x0014;
                case 41: goto L_0x01d9;
                case 42: goto L_0x01b6;
                case 43: goto L_0x0193;
                case 44: goto L_0x0185;
                case 45: goto L_0x0172;
                case 46: goto L_0x015a;
                case 47: goto L_0x0152;
                case 48: goto L_0x0144;
                case 49: goto L_0x013c;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r4.A01
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r0 = (com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel) r0
            r1 = 0
            X.027 r0 = r0.A07
            X.C13680ns.A1O(r0, r1)
        L_0x0013:
            return
        L_0x0014:
            java.lang.Object r2 = r4.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            if (r2 == 0) goto L_0x0013
            java.lang.Object r0 = r4.A00
            X.32R r0 = (X.AnonymousClass32R) r0
            X.4EJ r0 = r0.A07
            com.obwhatsapp.group.GroupChatInfoActivity r4 = r0.A00
            X.0rv r3 = X.C15830rv.A00(r2)
            com.obwhatsapp.status.viewmodels.StatusesViewModel r0 = r4.A1Y
            if (r0 == 0) goto L_0x068c
            if (r3 == 0) goto L_0x068c
            X.2XQ r1 = r0.A05(r2)
            if (r1 == 0) goto L_0x068c
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x068c
            int r0 = r1.A01
            if (r0 <= 0) goto L_0x068c
            com.obwhatsapp.status.viewmodels.StatusesViewModel r2 = r4.A1Y
            r0 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            r2.A08(r3, r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            android.content.Intent r0 = X.C14750ph.A0K(r4, r3, r0)
            r4.startActivity(r0)
            return
        L_0x0051:
            java.lang.Object r0 = r4.A00
            X.2rI r0 = (X.C57512rI) r0
            com.obwhatsapp.calling.callhistory.group.GroupCallLogActivity r5 = r0.A01
            X.10c r3 = r5.A02
            java.lang.Object r2 = r4.A01
            X.0sH r2 = (X.C16010sH) r2
            r1 = 20
            r0 = 1
            goto L_0x0070
        L_0x0061:
            java.lang.Object r0 = r4.A00
            X.2rI r0 = (X.C57512rI) r0
            com.obwhatsapp.calling.callhistory.group.GroupCallLogActivity r5 = r0.A01
            X.10c r3 = r5.A02
            java.lang.Object r2 = r4.A01
            X.0sH r2 = (X.C16010sH) r2
            r1 = 20
            r0 = 0
        L_0x0070:
            int r0 = r3.A01(r5, r2, r1, r0)
            if (r0 != 0) goto L_0x0013
            r5.finish()
            return
        L_0x007a:
            java.lang.Object r0 = r4.A01
            X.3lO r0 = (X.C71993lO) r0
            com.obwhatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel r1 = r0.A01
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0013
            X.1cy r1 = r1.A07
            r0 = 3
            X.C13680ns.A1P(r1, r0)
            return
        L_0x008b:
            java.lang.Object r4 = r4.A01
            com.obwhatsapp.phonematching.CountryAndPhoneNumberFragment r4 = (com.obwhatsapp.phonematching.CountryAndPhoneNumberFragment) r4
            android.widget.EditText r0 = r4.A02
            java.lang.String r0 = X.C13680ns.A0f(r0)
            java.lang.String r7 = r0.trim()
            android.widget.EditText r0 = r4.A03
            java.lang.String r3 = X.C13680ns.A0f(r0)
            X.1G1 r0 = r4.A07
            int r0 = X.AnonymousClass2JO.A00(r0, r7, r3)
            java.lang.String r2 = ""
            r6 = 0
            r5 = 1
            switch(r0) {
                case 2: goto L_0x06f4;
                case 3: goto L_0x06e4;
                case 4: goto L_0x06d9;
                case 5: goto L_0x06c2;
                case 6: goto L_0x06bc;
                case 7: goto L_0x06b6;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            int r1 = java.lang.Integer.parseInt(r7)
            java.lang.String r0 = "\\D"
            java.lang.String r6 = r3.replaceAll(r0, r2)
            X.1G1 r0 = r4.A07     // Catch:{ IOException -> 0x00bd }
            java.lang.String r6 = r0.A02(r1, r6)     // Catch:{ IOException -> 0x00bd }
            goto L_0x00c3
        L_0x00bd:
            r1 = move-exception
            java.lang.String r0 = "CountryAndPhoneNumberFragment/phone failed trimLeadingZero from CountryPhoneInfo"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00c3:
            java.lang.String r0 = "CountryAndPhoneNumberFragment/phone/cc="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r7)
            java.lang.String r0 = "/number="
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r6, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A0E = r7
            com.obwhatsapp.phonematching.MatchPhoneNumberFragment r4 = r4.A0C
            if (r4 == 0) goto L_0x0013
            java.lang.String r0 = "MatchPhoneNumberFragment/submit/cc "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r7)
            java.lang.String r0 = " ph="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " jid="
            r1.append(r0)
            X.0sK r0 = r4.A00
            r0.A0B()
            X.1ZT r0 = r0.A05
            java.lang.String r0 = X.AnonymousClass000.A0f(r0, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0pL r1 = r4.A01
            android.os.Bundle r0 = X.C13690nt.A0D()
            com.obwhatsapp.phonematching.ConnectionProgressDialogFragment r2 = new com.obwhatsapp.phonematching.ConnectionProgressDialogFragment
            r2.<init>()
            r2.A0T(r0)
            X.02C r1 = r1.AGM()
            java.lang.String r0 = "PROGRESS"
            r2.A1G(r1, r0)
            X.2ng r3 = r4.A03
            r2 = 4
            r0 = 30000(0x7530, double:1.4822E-319)
            r3.sendEmptyMessageDelayed(r2, r0)
            X.124 r1 = r4.A02
            X.0tK r0 = r1.A01
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0695
            X.0ug r4 = r1.A02
            X.2c5 r3 = new X.2c5
            r3.<init>(r7, r6)
            r2 = 0
            r1 = 0
            r0 = 36
            android.os.Message r0 = android.os.Message.obtain(r2, r1, r0, r1, r3)
            r4.A09(r0, r1)
            return
        L_0x013c:
            java.lang.Object r0 = r4.A01
            X.29x r0 = (X.C456529x) r0
            r0.AWy()
            return
        L_0x0144:
            java.lang.Object r0 = r4.A01
            X.29G r0 = (X.AnonymousClass29G) r0
            X.29w r0 = (X.C456429w) r0
            X.29L r0 = r0.A00
            com.obwhatsapp.mediacomposer.MediaComposerActivity r0 = (com.obwhatsapp.mediacomposer.MediaComposerActivity) r0
            r0.A3G()
            return
        L_0x0152:
            java.lang.Object r0 = r4.A01
            X.29G r0 = (X.AnonymousClass29G) r0
            r0.AM7()
            return
        L_0x015a:
            java.lang.Object r0 = r4.A00
            X.2pB r0 = (X.AnonymousClass2pB) r0
            X.0rz r0 = r0.A00
            r2 = 1
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "dismissed_invite_member_row"
            X.C13680ns.A0z(r1, r0, r2)
            java.lang.Object r0 = r4.A01
            X.2AT r0 = (X.AnonymousClass2AT) r0
            r0.ASM()
            return
        L_0x0172:
            r2 = 0
            java.lang.Object r1 = r4.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r4.A00
            X.2pB r0 = (X.AnonymousClass2pB) r0
            com.whatsapp.jid.GroupJid r0 = r0.A03
            android.content.Intent r0 = X.C14750ph.A0H(r1, r0)
            r1.startActivity(r0, r2)
            return
        L_0x0185:
            java.lang.Object r0 = r4.A00
            X.2pA r0 = (X.C56932pA) r0
            X.2AP r1 = r0.A05
            java.lang.Object r0 = r4.A01
            X.0tZ r0 = (X.C16740tZ) r0
            r1.AM5(r0)
            return
        L_0x0193:
            java.lang.Object r5 = r4.A00
            X.2p7 r5 = (X.C56912p7) r5
            android.content.Context r1 = r5.getContext()
            java.lang.Class<X.0pN> r0 = X.C14550pN.class
            android.app.Activity r3 = X.C19980zJ.A01(r1, r0)
            X.0pN r3 = (X.C14550pN) r3
            X.0sL r2 = r5.A05
            java.lang.Object r0 = r4.A01
            X.0sH r0 = (X.C16010sH) r0
            boolean r1 = r0.A0j
            X.5Pj r0 = r5.A04
            com.obwhatsapp.group.GroupSettingsLayoutV1$RestrictFrequentlyForwardedDialogFragment r1 = com.obwhatsapp.group.GroupSettingsLayoutV1$RestrictFrequentlyForwardedDialogFragment.A01(r0, r2, r1)
            r0 = 0
            r3.Afb(r1, r0)
            return
        L_0x01b6:
            java.lang.Object r5 = r4.A00
            X.2p7 r5 = (X.C56912p7) r5
            android.content.Context r1 = r5.getContext()
            java.lang.Class<X.0pN> r0 = X.C14550pN.class
            android.app.Activity r3 = X.C19980zJ.A01(r1, r0)
            X.0pN r3 = (X.C14550pN) r3
            X.0sL r2 = r5.A05
            java.lang.Object r0 = r4.A01
            X.0sH r0 = (X.C16010sH) r0
            boolean r1 = r0.A0Y
            X.5Pj r0 = r5.A04
            com.obwhatsapp.group.GroupSettingsLayoutV1$SendMessagesDialogFragment r1 = com.obwhatsapp.group.GroupSettingsLayoutV1$SendMessagesDialogFragment.A01(r0, r2, r1)
            r0 = 0
            r3.Afb(r1, r0)
            return
        L_0x01d9:
            java.lang.Object r5 = r4.A00
            X.2p7 r5 = (X.C56912p7) r5
            android.content.Context r1 = r5.getContext()
            java.lang.Class<X.0pN> r0 = X.C14550pN.class
            android.app.Activity r3 = X.C19980zJ.A01(r1, r0)
            X.0pN r3 = (X.C14550pN) r3
            X.0sL r2 = r5.A05
            java.lang.Object r0 = r4.A01
            X.0sH r0 = (X.C16010sH) r0
            boolean r1 = r0.A0l
            X.5Pj r0 = r5.A04
            com.obwhatsapp.group.GroupSettingsLayoutV1$EditGroupInfoDialogFragment r1 = com.obwhatsapp.group.GroupSettingsLayoutV1$EditGroupInfoDialogFragment.A01(r0, r2, r1)
            r0 = 0
            r3.Afb(r1, r0)
            return
        L_0x01fc:
            java.lang.Object r1 = r4.A00
            X.4SE r1 = (X.AnonymousClass4SE) r1
            java.lang.Object r0 = r4.A01
            X.3R7 r0 = (X.AnonymousClass3R7) r0
            r1.A00(r0)
            return
        L_0x0208:
            java.lang.Object r6 = r4.A00
            X.3pG r6 = (X.C73893pG) r6
            X.17m r5 = r6.A00
            java.lang.Object r2 = r4.A01
            X.0rv r2 = (X.C15830rv) r2
            r1 = 1
            X.0rt r0 = r5.A06
            X.0rx r3 = r0.A06(r2)
            if (r3 == 0) goto L_0x022e
            int r0 = r3.A09
            if (r0 == r1) goto L_0x022e
            r3.A09 = r1
            X.126 r2 = r5.A04
            r0 = 3
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r1 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r1.<init>(r5, r0, r3)
            r0 = 44
            r2.A01(r1, r0)
        L_0x022e:
            android.view.ViewGroup r1 = r6.A00
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0236:
            java.lang.Object r3 = r4.A00
            com.obwhatsapp.conversation.conversationrow.messagerating.MessageRatingFragment r3 = (com.obwhatsapp.conversation.conversationrow.messagerating.MessageRatingFragment) r3
            java.lang.Object r0 = r4.A01
            com.obwhatsapp.StarRatingBar r0 = (com.obwhatsapp.StarRatingBar) r0
            int r0 = r0.A00
            com.obwhatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel r5 = r3.A02
            X.0rv r6 = r3.A03
            java.lang.String r9 = r3.A04
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            X.43C r8 = r3.A01
            X.0sq r0 = r5.A05
            r10 = 2
            com.facebook.redex.RunnableRunnableShape1S1400000_I1 r4 = new com.facebook.redex.RunnableRunnableShape1S1400000_I1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.Acl(r4)
            X.027 r0 = r5.A01
            r0.A0B(r7)
            r0 = 1
            r5.A00 = r0
            X.0pt r2 = r3.A00
            r1 = 2131889467(0x7f120d3b, float:1.9413598E38)
            r0 = 0
            r2.A09(r1, r0)
            r3.A1C()
            return
        L_0x026c:
            java.lang.Object r0 = r4.A00
            X.1bd r0 = (X.C30031bd) r0
            X.1P7 r1 = r0.A0N
            X.AnonymousClass00B.A06(r1)
            android.content.Context r2 = r0.getContext()
            java.lang.Object r0 = r4.A01
            X.1rM r0 = (X.C38751rM) r0
            double r5 = r0.A00
            double r7 = r0.A01
            java.lang.String r3 = r0.A01
            java.lang.String r4 = r0.A00
            r1.A08(r2, r3, r4, r5, r7)
            return
        L_0x0289:
            java.lang.Object r6 = r4.A00
            android.view.View r6 = (android.view.View) r6
            android.content.Context r1 = r6.getContext()
            java.lang.Object r0 = r4.A01
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vw r0 = r0.A11
            java.lang.String r5 = r0.A01
            X.0rv r4 = r0.A00
            boolean r3 = r0.A02
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.invites.ViewGroupInviteActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "key_id"
            r2.putExtra(r0, r5)
            if (r4 == 0) goto L_0x02ba
            java.lang.String r1 = "key_remote_jid"
            java.lang.String r0 = r4.getRawString()
            r2.putExtra(r1, r0)
        L_0x02ba:
            java.lang.String r0 = "from_me"
            r2.putExtra(r0, r3)
            X.C13690nt.A0u(r2, r6)
            return
        L_0x02c3:
            java.lang.Object r2 = r4.A00
            X.307 r2 = (X.AnonymousClass307) r2
            java.lang.Integer r0 = X.C13680ns.A0a()
            X.3qY r1 = new X.3qY
            r1.<init>()
            r1.A00 = r0
            X.0t9 r0 = r2.A08
            r0.A06(r1)
            java.lang.Object r0 = r4.A01
            X.3MG r0 = (X.AnonymousClass3MG) r0
            r0.onClick(r5)
            return
        L_0x02df:
            java.lang.Object r0 = r4.A01
            com.obwhatsapp.contact.picker.statusprivacy.StatusPrivacyBottomSheetDialogFragment r0 = (com.obwhatsapp.contact.picker.statusprivacy.StatusPrivacyBottomSheetDialogFragment) r0
            X.05i r3 = r0.A0C
            android.content.Context r0 = r0.A02()
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.status.audienceselector.StatusPrivacyActivity"
            r2.setClassName(r1, r0)
            r0 = 0
            r3.A00(r0, r2)
            return
        L_0x02fb:
            java.lang.Object r1 = r4.A01
            com.obwhatsapp.contact.picker.statusprivacy.StatusPrivacyBottomSheetDialogFragment r1 = (com.obwhatsapp.contact.picker.statusprivacy.StatusPrivacyBottomSheetDialogFragment) r1
            r0 = 0
            r1.A1O(r0)
            return
        L_0x0304:
            java.lang.Object r1 = r4.A01
            com.obwhatsapp.contact.picker.statusprivacy.StatusPrivacyBottomSheetDialogFragment r1 = (com.obwhatsapp.contact.picker.statusprivacy.StatusPrivacyBottomSheetDialogFragment) r1
            r0 = 1
            r1.A1O(r0)
            return
        L_0x030d:
            java.lang.Object r1 = r4.A01
            com.obwhatsapp.contact.picker.statusprivacy.StatusPrivacyBottomSheetDialogFragment r1 = (com.obwhatsapp.contact.picker.statusprivacy.StatusPrivacyBottomSheetDialogFragment) r1
            X.0vx r0 = r1.A08
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0351
            X.1L1 r0 = r1.A09
            X.1m6 r3 = r1.A04
            X.1Su r5 = r0.A0D
            X.0vx r0 = r5.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0351
            X.2Jb r4 = r5.A01()
            r0 = 26
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A03 = r0
            X.2JY r2 = r5.A05
            java.lang.Integer r0 = r2.A01
            r4.A02 = r0
            java.lang.Integer r0 = r2.A00
            r4.A01 = r0
            int r3 = r3.A00
            r2 = 1
            if (r3 == 0) goto L_0x03e0
            r0 = 1
            r2 = 3
            if (r3 == r0) goto L_0x03e0
            r2 = 2
            if (r3 == r2) goto L_0x03e0
            r0 = 0
        L_0x034a:
            r4.A04 = r0
            X.0t9 r0 = r5.A02
            r0.A05(r4)
        L_0x0351:
            X.2Rr r0 = r1.A01
            if (r0 == 0) goto L_0x03c4
            X.1m6 r2 = r1.A04
            com.obwhatsapp.contact.picker.ContactPicker r0 = (com.obwhatsapp.contact.picker.ContactPicker) r0
            com.obwhatsapp.contact.picker.ContactPickerFragment r4 = r0.A05
            if (r4 == 0) goto L_0x03c4
            java.lang.String r0 = "contactpicker/onStatusPrivacyBottomSheetDismissedSuccessful"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1m6 r0 = r4.A1U
            boolean r0 = r2.equals(r0)
            r3 = r0 ^ 1
            r4.A1U = r2
            java.util.Map r0 = r4.A2w
            X.1kq r2 = X.C34771kq.A00
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L_0x03d5
            android.view.View r0 = r4.A0C
            if (r0 == 0) goto L_0x03d5
            X.0sG r0 = r4.A0m
            X.0sH r2 = r0.A08(r2)
            android.view.View r0 = r4.A0C
            r4.A1Z(r0, r2)
        L_0x0385:
            r4.A1Q()
            if (r3 == 0) goto L_0x03c4
            X.0pd r2 = r4.A1d
            X.0tM r3 = X.C16620tM.A01
            r0 = 2509(0x9cd, float:3.516E-42)
            boolean r0 = r2.A0E(r3, r0)
            if (r0 == 0) goto L_0x03c4
            X.0pd r2 = r4.A1d
            r0 = 2531(0x9e3, float:3.547E-42)
            boolean r0 = r2.A0E(r3, r0)
            r12 = 0
            r9 = -1
            if (r0 == 0) goto L_0x03a3
            r9 = 0
        L_0x03a3:
            X.1m6 r3 = r4.A1U
            int r2 = r3.A00
            if (r2 != 0) goto L_0x03c8
            r7 = 0
        L_0x03aa:
            X.0sq r2 = r4.A24
            X.2Sp r5 = r4.A0N
            X.00l r6 = r4.A0C()
            X.0pN r6 = (X.C14550pN) r6
            X.1m6 r0 = r4.A1U
            int r8 = r0.A00
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            X.36f r0 = r5.A00(r6, r7, r8, r9, r10, r12, r13, r14, r15)
            X.C13700nu.A0W(r0, r2)
        L_0x03c4:
            r1.A1C()
            return
        L_0x03c8:
            r0 = 1
            if (r2 != r0) goto L_0x03d2
            java.util.List r0 = r3.A01
        L_0x03cd:
            java.util.ArrayList r7 = X.C13680ns.A0n(r0)
            goto L_0x03aa
        L_0x03d2:
            java.util.List r0 = r3.A02
            goto L_0x03cd
        L_0x03d5:
            java.lang.String r0 = "contactpicker/notifyAdapter"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2Rm r0 = r4.A0w
            r0.notifyDataSetChanged()
            goto L_0x0385
        L_0x03e0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x034a
        L_0x03e6:
            com.obwhatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment r1 = new com.obwhatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment
            r1.<init>()
            r0 = 0
            r1.A0I = r0
            java.lang.Object r0 = r4.A01
            android.os.Bundle r0 = (android.os.Bundle) r0
            r1.A0T(r0)
            java.lang.Object r0 = r4.A00
            X.00l r0 = (X.C001000l) r0
            X.C13680ns.A1J(r1, r0)
            return
        L_0x03fd:
            java.lang.Object r3 = r4.A00
            com.obwhatsapp.calling.spam.CallSpamActivity r3 = (com.obwhatsapp.calling.spam.CallSpamActivity) r3
            X.14s r1 = r3.A03
            java.lang.Object r6 = r4.A01
            X.0rv r6 = (X.C15830rv) r6
            r0 = 1
            boolean r0 = r1.A05(r6, r0)
            if (r0 != 0) goto L_0x0448
            X.14s r5 = r3.A03
            java.util.List r0 = r5.A01()
            if (r0 != 0) goto L_0x045c
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
        L_0x041a:
            boolean r0 = r4.contains(r6)
            r2 = 0
            if (r0 != 0) goto L_0x044c
            int r0 = r4.size()
            int r1 = r0 + 1
            r0 = 50
            if (r1 <= r0) goto L_0x042e
            r4.remove(r2)
        L_0x042e:
            r4.add(r6)
            java.lang.String r0 = ","
            java.lang.String r2 = android.text.TextUtils.join(r0, r4)
            X.11I r1 = r5.A05
            java.lang.String r0 = "call_not_spam_jids"
            r1.A06(r0, r2)
            java.lang.String r0 = "spamManager/setCallNotSpamProp/true: "
            java.lang.String r0 = X.C13680ns.A0h(r0, r2)
        L_0x0445:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0448:
            r3.finish()
            return
        L_0x044c:
            java.lang.String r0 = "spamManager/setCallNotSpamProp/false/already contains jid in size: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            int r0 = r4.size()
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)
            goto L_0x0445
        L_0x045c:
            java.util.ArrayList r4 = X.C13680ns.A0n(r0)
            goto L_0x041a
        L_0x0461:
            com.obwhatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment r1 = new com.obwhatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment
            r1.<init>()
            r0 = 1
            r1.A0I = r0
            java.lang.Object r0 = r4.A01
            android.os.Bundle r0 = (android.os.Bundle) r0
            r1.A0T(r0)
            java.lang.Object r0 = r4.A00
            X.00l r0 = (X.C001000l) r0
            X.C13680ns.A1J(r1, r0)
            return
        L_0x0478:
            java.lang.Object r1 = r4.A01
            X.3Se r1 = (X.C64923Se) r1
            X.4DZ r0 = r1.A04
            if (r0 != 0) goto L_0x0486
            java.lang.String r0 = "CallsHistoryContactItemViewHolder/onContactPhotoClicked event listener is null"
        L_0x0482:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0486:
            java.lang.Object r3 = r4.A00
            X.0rv r3 = (X.C15830rv) r3
            com.obwhatsapp.components.button.ThumbnailButton r2 = r1.A06
            com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r0 = r0.A00
            X.00l r1 = r0.A0C()
            if (r1 != 0) goto L_0x0498
            java.lang.String r0 = "voip/CallsFragment no activity registered to open contact"
            goto L_0x0482
        L_0x0498:
            r0 = 6
            X.3AW r0 = X.AnonymousClass3AW.A00(r2, r3, r0)
            r0.A02(r1)
            return
        L_0x04a1:
            java.lang.Object r0 = r4.A01
            X.4HO r0 = (X.AnonymousClass4HO) r0
            X.3FI r3 = r0.A01
            java.lang.Class<X.3FI> r2 = X.AnonymousClass3FI.class
            monitor-enter(r2)
            X.4N7 r1 = r3.A07     // Catch:{ all -> 0x04b4 }
            r0 = 3
            r1.A01 = r0     // Catch:{ all -> 0x04b4 }
            r3.A02()     // Catch:{ all -> 0x04b4 }
            monitor-exit(r2)     // Catch:{ all -> 0x04b4 }
            return
        L_0x04b4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x04b4 }
            throw r0
        L_0x04b7:
            java.lang.Object r0 = r4.A01
            X.3lx r0 = (X.C72333lx) r0
            X.3FI r4 = r0.A01
            X.3oM r3 = r0.A00
            java.lang.Class<X.3FI> r2 = X.AnonymousClass3FI.class
            monitor-enter(r2)
            X.4N7 r1 = r4.A07     // Catch:{ all -> 0x04ce }
            r0 = 2
            r1.A01 = r0     // Catch:{ all -> 0x04ce }
            r1.A03 = r3     // Catch:{ all -> 0x04ce }
            r4.A02()     // Catch:{ all -> 0x04ce }
            monitor-exit(r2)     // Catch:{ all -> 0x04ce }
            return
        L_0x04ce:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x04ce }
            throw r0
        L_0x04d1:
            java.lang.Object r0 = r4.A01
            X.3lO r0 = (X.C71993lO) r0
            com.obwhatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel r4 = r0.A01
            int r1 = r0.A00
            if (r1 == 0) goto L_0x04e5
            r0 = 2
            if (r1 != r0) goto L_0x0515
            X.1cy r1 = r4.A07
            r0 = 4
        L_0x04e1:
            X.C13680ns.A1P(r1, r0)
            return
        L_0x04e5:
            X.0ui r3 = r4.A02
            X.1Ko r0 = r4.A04
            java.lang.Integer r2 = r0.A02()
            X.1a7 r1 = new X.1a7
            r1.<init>()
            r0 = 36
            X.C29151a7.A00(r1, r0)
            r1.A06 = r2
            r3.A06(r1)
            X.1Kb r0 = r4.A03
            X.1I2 r0 = r0.A02
            android.content.SharedPreferences r2 = r0.A00()
            java.lang.String r1 = "location_access_granted"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x0511
            r4.A05()
            return
        L_0x0511:
            X.1cy r1 = r4.A07
            r0 = 0
            goto L_0x04e1
        L_0x0515:
            java.lang.String r0 = "LocationOptionPickerViewModel/onLocationOptionClicked option not handled: "
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0520:
            java.lang.Object r2 = r4.A00
            X.4Lx r2 = (X.C84794Lx) r2
            X.4N8 r1 = r2.A01
            r0 = 3
            r1.A01 = r0
            java.lang.Object r0 = r4.A01
            X.1dn r0 = (X.C31241dn) r0
            r1.A03 = r0
            X.027 r0 = r2.A00
            r0.A0B(r1)
            return
        L_0x0535:
            java.lang.Object r0 = r4.A01
            X.3l1 r0 = (X.C71773l1) r0
            X.5Ot r1 = r0.A00
            java.lang.Object r0 = r4.A00
            X.02k r0 = (X.C005602k) r0
            android.view.View r0 = r0.A0H
            android.content.Context r0 = r0.getContext()
            r1.AWe(r0)
            return
        L_0x0549:
            r1 = 0
            java.lang.Object r0 = r4.A01
            X.0sH r0 = (X.C16010sH) r0
            com.whatsapp.jid.Jid r0 = X.C16010sH.A03(r0)
            X.0rv r0 = (X.C15830rv) r0
            X.3AW r2 = new X.3AW
            r2.<init>((android.view.View) r5, (X.C15830rv) r0, (java.lang.Integer) r1)
            java.lang.Object r1 = r4.A00
            X.3F6 r1 = (X.AnonymousClass3F6) r1
            android.widget.ImageView r0 = r1.A01
            java.lang.String r0 = X.C004601z.A0L(r0)
            r2.A04 = r0
            android.content.Context r0 = r1.A00
            android.app.Activity r0 = X.C19980zJ.A00(r0)
            r2.A02(r0)
            return
        L_0x056f:
            X.0ph r2 = X.C14750ph.A0q()
            android.content.Context r1 = r5.getContext()
            java.lang.Object r0 = r4.A01
            X.0sH r0 = (X.C16010sH) r0
            android.content.Intent r3 = r2.A0v(r1, r0)
            java.lang.Object r0 = r4.A00
            X.2yj r0 = (X.C59672yj) r0
            X.0zJ r2 = r0.A04
            android.content.Context r1 = r5.getContext()
            java.lang.String r0 = "CatalogListAdapterFooterViewHolder"
            r2.A08(r1, r3, r0)
            return
        L_0x058f:
            java.lang.Object r4 = r4.A01
            com.obwhatsapp.biz.cart.view.fragment.CartFragment r4 = (com.obwhatsapp.biz.cart.view.fragment.CartFragment) r4
            X.2RP r3 = r4.A0R
            int r2 = r4.A00
            r1 = 1
            if (r2 == r1) goto L_0x059e
            r0 = 4
            if (r2 == r0) goto L_0x059e
            r1 = 0
        L_0x059e:
            r3.A06(r4, r1)
            return
        L_0x05a2:
            java.lang.Object r2 = r4.A00
            X.01A r2 = (X.AnonymousClass01A) r2
            X.00l r0 = r2.A0D()
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131558919(0x7f0d0207, float:1.8743167E38)
            r5 = 0
            android.view.View r1 = r1.inflate(r0, r5)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131888026(0x7f12079a, float:1.9410676E38)
            r1.setText(r0)
            X.00l r0 = r2.A0D()
            X.1fu r3 = X.C32241fu.A00(r0)
            X.0PG r0 = r3.A01
            r0.A0B = r1
            r0 = 2131888025(0x7f120799, float:1.9410674E38)
            r3.A01(r0)
            r2 = 2131888027(0x7f12079b, float:1.9410678E38)
            java.lang.Object r1 = r4.A01
            r0 = 19
            X.C13680ns.A1H(r3, r1, r0, r2)
            r0 = 2131888024(0x7f120798, float:1.9410672E38)
            r3.setNegativeButton(r0, r5)
            X.C13690nt.A1G(r3)
            return
        L_0x05e4:
            java.lang.Object r1 = r4.A01
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r1 = (com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel) r1
            r0 = 202(0xca, float:2.83E-43)
            goto L_0x0655
        L_0x05eb:
            java.lang.Object r3 = r4.A01
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r3 = (com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel) r3
            r0 = 3
            r3.A0A(r0)
            r0 = 4
            r3.A0D(r0)
            X.0rz r0 = r3.A0D
            boolean r1 = r0.A1g()
            r0 = 302(0x12e, float:4.23E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r0 = r3.A0G()
            if (r1 == 0) goto L_0x063e
            goto L_0x0628
        L_0x060a:
            java.lang.Object r3 = r4.A01
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r3 = (com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel) r3
            r0 = 2
            r3.A0A(r0)
            X.0rz r0 = r3.A0D
            boolean r1 = r0.A1g()
            r0 = 300(0x12c, float:4.2E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L_0x0636
            r0 = 6
            r3.A0D(r0)
            boolean r0 = r3.A0G()
        L_0x0628:
            if (r0 != 0) goto L_0x0645
            X.027 r1 = r3.A03
            r0 = 203(0xcb, float:2.84E-43)
        L_0x062e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x0632:
            r1.A0B(r2)
            return
        L_0x0636:
            r0 = 5
            r3.A0D(r0)
            boolean r0 = r3.A0G()
        L_0x063e:
            if (r0 != 0) goto L_0x0645
            X.027 r1 = r3.A03
            r0 = 202(0xca, float:2.83E-43)
            goto L_0x062e
        L_0x0645:
            X.027 r1 = r3.A03
            goto L_0x0632
        L_0x0648:
            java.lang.Object r1 = r4.A01
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r1 = (com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel) r1
            r0 = 200(0xc8, float:2.8E-43)
            goto L_0x0655
        L_0x064f:
            java.lang.Object r1 = r4.A01
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r1 = (com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel) r1
            r0 = 300(0x12c, float:4.2E-43)
        L_0x0655:
            r1.A0C(r0)
            return
        L_0x0659:
            java.lang.Object r3 = r4.A01
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r3 = (com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel) r3
            X.0sq r2 = r3.A0I
            r1 = 48
            com.facebook.redex.RunnableRunnableShape2S0100000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape2S0100000_I0_1
            r0.<init>(r3, r1)
            r2.Acl(r0)
            return
        L_0x066a:
            java.lang.Object r0 = r4.A01
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r0 = (com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel) r0
            r0.A07()
            return
        L_0x0672:
            java.lang.Object r0 = r4.A01
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r0 = (com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel) r0
            r0.A06()
            return
        L_0x067a:
            java.lang.Object r0 = r4.A01
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r0 = (com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel) r0
            r1 = -1
            X.027 r0 = r0.A07
            X.C13680ns.A1O(r0, r1)
            return
        L_0x0685:
            java.lang.String r0 = "listener"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        L_0x068c:
            r0 = 4
            X.3AW r0 = X.AnonymousClass3AW.A00(r5, r2, r0)
            r0.A02(r4)
            return
        L_0x0695:
            X.2ng r0 = r4.A03
            r0.removeMessages(r2)
            X.0pL r0 = r4.A01
            com.obwhatsapp.phonematching.MatchPhoneNumberFragment.A01(r0)
            X.0pL r4 = r4.A01
            r3 = 2131891058(0x7f121372, float:1.9416825E38)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r1 = 0
            r0 = 2131887419(0x7f12053b, float:1.9409445E38)
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r0 = X.C13680ns.A0d(r4, r0, r2, r1, r3)
            r4.Afh(r0)
            return
        L_0x06b6:
            X.0pL r3 = r4.A08
            r2 = 2131891054(0x7f12136e, float:1.9416817E38)
            goto L_0x06c7
        L_0x06bc:
            X.0pL r3 = r4.A08
            r2 = 2131891055(0x7f12136f, float:1.941682E38)
            goto L_0x06c7
        L_0x06c2:
            X.0pL r3 = r4.A08
            r2 = 2131891056(0x7f121370, float:1.9416821E38)
        L_0x06c7:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            android.widget.TextView r0 = r4.A06
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = X.C13690nt.A0c(r4, r0, r1, r6, r2)
            r3.Afh(r0)
            android.widget.EditText r0 = r4.A03
            goto L_0x070d
        L_0x06d9:
            X.0pL r1 = r4.A08
            r0 = 2131891065(0x7f121379, float:1.941684E38)
            r1.Afg(r0)
            android.widget.EditText r0 = r4.A03
            goto L_0x070d
        L_0x06e4:
            X.0pL r1 = r4.A08
            r0 = 2131891051(0x7f12136b, float:1.9416811E38)
            r1.Afg(r0)
            android.widget.EditText r0 = r4.A02
            r0.setText(r2)
            android.widget.EditText r0 = r4.A02
            goto L_0x070d
        L_0x06f4:
            X.0pL r3 = r4.A08
            r2 = 2131891050(0x7f12136a, float:1.941681E38)
            java.lang.Object[] r1 = X.C13690nt.A1Z()
            X.AnonymousClass000.A1M(r1, r5, r6)
            r0 = 3
            X.AnonymousClass000.A1M(r1, r0, r5)
            java.lang.String r0 = r3.getString(r2, r1)
            r3.Afh(r0)
            android.widget.EditText r0 = r4.A02
        L_0x070d:
            r0.requestFocus()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ViewOnClickCListenerShape1S0200000_I1.A06(android.view.View):void");
    }
}

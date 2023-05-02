package com.whatsapp.util;

import X.C34331k5;
import X.C57712rd;
import X.C82504Db;
import android.view.View;

public class ViewOnClickCListenerShape4S0100000_I1 extends C34331k5 {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape4S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:169:0x046b, code lost:
        if (r4 != false) goto L_0x0454;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x07a9, code lost:
        r0.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x07ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x07e2, code lost:
        r1.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x07e5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0808, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x080b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r16) {
        /*
            r15 = this;
            int r0 = r15.A01
            switch(r0) {
                case 0: goto L_0x07ee;
                case 1: goto L_0x07e6;
                case 2: goto L_0x07d2;
                case 3: goto L_0x07c5;
                case 4: goto L_0x07bd;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x07b4;
                case 8: goto L_0x0793;
                case 9: goto L_0x0773;
                case 10: goto L_0x0769;
                case 11: goto L_0x0761;
                case 12: goto L_0x0741;
                case 13: goto L_0x0737;
                case 14: goto L_0x071d;
                case 15: goto L_0x070e;
                case 16: goto L_0x0703;
                case 17: goto L_0x06fb;
                case 18: goto L_0x06ec;
                case 19: goto L_0x06d1;
                case 20: goto L_0x06bf;
                case 21: goto L_0x023a;
                case 22: goto L_0x07e6;
                case 23: goto L_0x062a;
                case 24: goto L_0x0605;
                case 25: goto L_0x0207;
                case 26: goto L_0x05f6;
                case 27: goto L_0x05ec;
                case 28: goto L_0x05ec;
                case 29: goto L_0x05e4;
                case 30: goto L_0x05ca;
                case 31: goto L_0x00fc;
                case 32: goto L_0x05c2;
                case 33: goto L_0x05a8;
                case 34: goto L_0x00a9;
                case 35: goto L_0x0502;
                case 36: goto L_0x05e4;
                case 37: goto L_0x048e;
                case 38: goto L_0x0478;
                case 39: goto L_0x046e;
                case 40: goto L_0x03ed;
                case 41: goto L_0x008a;
                case 42: goto L_0x003a;
                case 43: goto L_0x0351;
                case 44: goto L_0x0345;
                case 45: goto L_0x0334;
                case 46: goto L_0x02ed;
                case 47: goto L_0x02e5;
                case 48: goto L_0x02c0;
                case 49: goto L_0x02b2;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r15.A00
            com.obwhatsapp.backup.encryptedbackup.EncryptionKeyInfoFragment r2 = (com.obwhatsapp.backup.encryptedbackup.EncryptionKeyInfoFragment) r2
            android.widget.Button r1 = r2.A01
            r0 = 8
            r1.setVisibility(r0)
            android.widget.Button r1 = r2.A00
            r0 = 2131888062(0x7f1207be, float:1.9410749E38)
            r1.setText(r0)
            android.widget.Button r1 = r2.A00
            r0 = 7
            X.C34331k5.A01(r1, r2, r0)
            android.widget.FrameLayout r1 = r2.A02
            r0 = 0
            r1.setVisibility(r0)
            android.widget.RelativeLayout r1 = r2.A00
            r0 = 2131231205(0x7f0801e5, float:1.8078484E38)
            r1.setBackgroundResource(r0)
            android.widget.TextView r1 = r2.A03
            r0 = 2131888065(0x7f1207c1, float:1.9410755E38)
            r1.setText(r0)
            android.widget.RelativeLayout r0 = r2.A00
            r0.setOnCreateContextMenuListener(r2)
        L_0x0039:
            return
        L_0x003a:
            java.lang.Object r5 = r15.A00
            com.obwhatsapp.community.ManageGroupsInCommunityActivity r5 = (com.obwhatsapp.community.ManageGroupsInCommunityActivity) r5
            boolean r0 = com.obwhatsapp.community.ManageGroupsInCommunityActivity.A03(r5)
            if (r0 != 0) goto L_0x0039
            r6 = 0
            X.0uk r0 = r5.A05
            X.0pd r2 = r0.A0D
            r1 = 1238(0x4d6, float:1.735E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r2.A03(r0, r1)
            int r4 = r0 + 1
            X.2AS r0 = r5.A07
            X.2OJ r0 = r0.A0n
            java.lang.Object r0 = r0.A01()
            int r0 = X.AnonymousClass000.A0D(r0)
            int r4 = r4 - r0
            X.0sL r3 = r5.A0F
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.community.LinkExistingGroups"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "max_groups_allowed_to_link"
            r2.putExtra(r0, r4)
            if (r3 == 0) goto L_0x007f
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "parent_group_jid"
            r2.putExtra(r0, r1)
        L_0x007f:
            java.lang.String r0 = "community_name"
            r2.putExtra(r0, r6)
            r0 = 10
            r5.Ag3(r2, r0)
            return
        L_0x008a:
            java.lang.Object r4 = r15.A00
            com.obwhatsapp.community.ManageGroupsInCommunityActivity r4 = (com.obwhatsapp.community.ManageGroupsInCommunityActivity) r4
            boolean r0 = com.obwhatsapp.community.ManageGroupsInCommunityActivity.A03(r4)
            if (r0 != 0) goto L_0x0039
            X.0sL r3 = r4.A0F
            r1 = 3
            r0 = 0
            android.content.Intent r2 = X.C14750ph.A0m(r4, r0, r1)
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "parent_group_jid_to_link"
            r2.putExtra(r0, r1)
            r4.startActivity(r2)
            return
        L_0x00a9:
            java.lang.Object r4 = r15.A00
            X.2rd r4 = (X.C57712rd) r4
            X.4wk r1 = r4.A00
            if (r1 == 0) goto L_0x07fd
            X.4Db r0 = r4.A09
            if (r0 == 0) goto L_0x07fd
            com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r3 = r0.A00
            X.05J r0 = r3.A06
            if (r0 == 0) goto L_0x00bf
            com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A01(r4, r3)
            return
        L_0x00bf:
            X.39v r1 = r1.A01
            X.0sH r0 = r1.A03()
            if (r0 != 0) goto L_0x00f5
            r0 = 0
        L_0x00c8:
            java.util.ArrayList r2 = r1.A04
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00f2
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            java.lang.Object r1 = X.C13690nt.A0Z(r1)
            X.1po r1 = (X.C37831po) r1
            com.whatsapp.jid.GroupJid r1 = r1.A04
            if (r1 == 0) goto L_0x00f2
            r0 = r1
        L_0x00e3:
            com.obwhatsapp.components.button.ThumbnailButton r2 = r4.A0B
            r1 = 6
            X.3AW r1 = X.AnonymousClass3AW.A00(r2, r0, r1)
            X.00l r0 = r3.A0C()
            r1.A02(r0)
            return
        L_0x00f2:
            if (r0 == 0) goto L_0x0039
            goto L_0x00e3
        L_0x00f5:
            com.whatsapp.jid.Jid r0 = X.C16010sH.A03(r0)
            X.0rv r0 = (X.C15830rv) r0
            goto L_0x00c8
        L_0x00fc:
            java.lang.Object r0 = r16.getTag()
            X.4QA r0 = (X.AnonymousClass4QA) r0
            if (r0 == 0) goto L_0x0039
            X.5Rk r0 = r0.A00
            X.4wc r0 = (X.C101044wc) r0
            X.39v r7 = r0.A00
            java.lang.Object r3 = r15.A00
            X.2zL r3 = (X.C59912zL) r3
            com.obwhatsapp.calling.callhistory.CallsHistoryFragment r5 = r3.A0B
            X.05J r0 = r5.A03
            if (r0 == 0) goto L_0x0118
            r5.A1J(r7, r3)
            return
        L_0x0118:
            java.util.ArrayList r0 = r7.A04
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            X.1po r0 = (X.C37831po) r0
            com.whatsapp.jid.GroupJid r6 = r0.A04
            X.0sG r4 = r3.A0E
            X.14s r1 = r3.A0O
            X.0ul r0 = r3.A0N
            X.0sH r8 = X.C30341cC.A02(r4, r0, r6, r1)
            java.util.ArrayList r6 = r7.A04
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x016f
            java.lang.Object r0 = r6.get(r2)
            X.1po r0 = (X.C37831po) r0
            X.1r2 r1 = r0.A0G
            if (r1 == 0) goto L_0x016f
            X.00l r0 = r5.A0C()
            boolean r0 = r0 instanceof X.C14550pN
            if (r0 == 0) goto L_0x0039
            java.lang.String r1 = r1.A02
            boolean r0 = r7.A08()
            java.lang.String r0 = X.C62043Bk.A02(r1, r0)
            android.net.Uri r6 = android.net.Uri.parse(r0)
            X.0pd r12 = r3.A0M
            X.0sK r9 = r5.A06
            X.10c r11 = r3.A0C
            X.00l r7 = r5.A0C()
            X.0pN r7 = (X.C14550pN) r7
            X.0xQ r10 = r5.A09
            X.0pt r8 = r5.A05
            r13 = 12
            X.C30341cC.A0H(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x016f:
            boolean r0 = r7.A06()
            if (r0 == 0) goto L_0x01b2
            if (r8 != 0) goto L_0x01b2
            X.00l r0 = r5.A0C()
            if (r0 == 0) goto L_0x019e
            X.01V r0 = r3.A0J
            android.view.inputmethod.InputMethodManager r1 = r0.A0Q()
            if (r1 == 0) goto L_0x019e
            X.00l r0 = r5.A0C()
            android.view.View r0 = r0.getCurrentFocus()
            if (r0 == 0) goto L_0x019e
            X.00l r0 = r5.A0C()
            android.view.View r0 = r0.getCurrentFocus()
            android.os.IBinder r0 = r0.getWindowToken()
            r1.hideSoftInputFromWindow(r0, r2)
        L_0x019e:
            java.util.List r0 = java.util.Collections.unmodifiableList(r6)
            java.lang.Object r2 = r0.get(r2)
            X.1po r2 = (X.C37831po) r2
            X.00l r1 = r5.A0C()
            r0 = 21
            X.C30341cC.A0F(r1, r4, r2, r0)
            return
        L_0x01b2:
            X.0sH r6 = r7.A03()
            int r2 = r7.A00()
            r1 = 2
            if (r2 == 0) goto L_0x01e2
            r0 = 1
            if (r2 == r0) goto L_0x01db
            if (r2 == r1) goto L_0x01dd
            r4 = 0
        L_0x01c3:
            boolean r0 = r7.A06()
            if (r0 != 0) goto L_0x01e7
            X.10c r3 = r3.A0C
            X.00l r2 = r5.A0C()
            int r1 = r4.intValue()
            boolean r0 = r7.A08()
            r3.A01(r2, r6, r1, r0)
            return
        L_0x01db:
            r0 = 9
        L_0x01dd:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L_0x01c3
        L_0x01e2:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            goto L_0x01c3
        L_0x01e7:
            if (r8 == 0) goto L_0x0039
            if (r4 == 0) goto L_0x0039
            X.00l r0 = r5.A0C()
            boolean r0 = r0 instanceof X.C14550pN
            if (r0 == 0) goto L_0x0039
            boolean r2 = r7.A08()
            X.00l r1 = r5.A0C()
            X.0pN r1 = (X.C14550pN) r1
            boolean r0 = r8.A0J()
            if (r0 == 0) goto L_0x0039
            X.C30341cC.A0G(r1, r8, r4, r2)
            return
        L_0x0207:
            int r1 = r16.getId()
            r0 = 2131362331(0x7f0a021b, float:1.834444E38)
            if (r1 != r0) goto L_0x0222
            java.lang.Object r2 = r15.A00
            com.obwhatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment r2 = (com.obwhatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment) r2
            X.5Rf r1 = r2.A02
            if (r1 == 0) goto L_0x021f
            X.2qV r0 = r2.A03
            java.util.Set r0 = r0.A03
            r1.ATp(r0)
        L_0x021f:
            r2.A1C()
        L_0x0222:
            int r1 = r16.getId()
            r0 = 2131362332(0x7f0a021c, float:1.8344442E38)
            if (r1 != r0) goto L_0x0039
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment r0 = (com.obwhatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment) r0
            X.2qV r1 = r0.A03
            java.util.Set r0 = r1.A03
            r0.clear()
            r1.A05()
            return
        L_0x023a:
            java.lang.Object r4 = r15.A00
            X.2yh r4 = (X.C59652yh) r4
            int r6 = r4.A06
            r0 = -1
            if (r6 != r0) goto L_0x0245
            int r6 = r4.A05
        L_0x0245:
            if (r6 == r0) goto L_0x0039
            X.1fn r0 = r4.A0A
            X.1mM r5 = r0.AFE(r6)
            android.view.View r2 = r4.A0H
            android.content.Context r1 = r2.getContext()
            r0 = 0
            android.content.Intent r7 = X.C14750ph.A0o(r1, r0)
            X.1fo r0 = r4.A03
            if (r0 == 0) goto L_0x0277
            X.4K6 r3 = r0.AAj(r6)
            if (r3 == 0) goto L_0x0277
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "collection_index"
            r7.putExtra(r0, r1)
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "product_index"
            r7.putExtra(r0, r1)
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "collection_id"
            r7.putExtra(r0, r1)
        L_0x0277:
            android.widget.ImageView r3 = r4.A04
            r0 = 2131364379(0x7f0a0a1b, float:1.8348593E38)
            java.lang.Object r0 = r3.getTag(r0)
            if (r0 != 0) goto L_0x0288
            r1 = 1
            java.lang.String r0 = "partial_loaded"
            r7.putExtra(r0, r1)
        L_0x0288:
            X.5Oo r0 = r4.A05
            if (r0 == 0) goto L_0x028f
            r0.AVH(r5, r6)
        L_0x028f:
            com.whatsapp.jid.UserJid r8 = r4.A0C
            java.lang.String r11 = r5.A0D
            X.0sK r0 = r4.A01
            boolean r13 = r0.A0I(r8)
            int r0 = r3.getWidth()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            int r0 = r3.getHeight()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            android.content.Context r6 = r2.getContext()
            r12 = 3
            X.C61843Ap.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x02b2:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.conversation.ConversationAttachmentContentView r0 = (com.obwhatsapp.conversation.ConversationAttachmentContentView) r0
            X.2jf r2 = r0.A0D
            int r1 = r0.A06
            java.lang.String r0 = "chat"
            r2.A09(r1, r0)
            return
        L_0x02c0:
            java.lang.Object r3 = r15.A00
            X.307 r3 = (X.AnonymousClass307) r3
            X.0rz r0 = r3.A06
            android.content.SharedPreferences$Editor r2 = r0.A0K()
            java.lang.String r1 = "pnh_cag_future_proof_banner_closed"
            r0 = 1
            X.C13680ns.A0z(r2, r1, r0)
            java.lang.Integer r0 = X.C13680ns.A0Z()
            X.3qY r1 = new X.3qY
            r1.<init>()
            r1.A00 = r0
            X.0t9 r0 = r3.A08
            r0.A06(r1)
            r0 = 1
            r3.A02(r0)
            return
        L_0x02e5:
            java.lang.Object r0 = r15.A00
            android.app.Activity r0 = (android.app.Activity) r0
            X.AnonymousClass1yL.A05(r0)
            return
        L_0x02ed:
            java.lang.Object r5 = r15.A00
            com.obwhatsapp.contact.picker.PhoneContactsSelector r5 = (com.obwhatsapp.contact.picker.PhoneContactsSelector) r5
            java.util.List r9 = r5.A0b
            int r0 = r9.size()
            r1 = 1
            if (r0 >= r1) goto L_0x0311
            X.0pt r6 = r5.A05
            X.013 r5 = r5.A0P
            r4 = 2131755225(0x7f1000d9, float:1.9141323E38)
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            boolean r1 = X.C13690nt.A1W(r0, r1)
            java.lang.String r0 = r5.A0J(r0, r4, r2)
            r6.A0H(r0, r1)
            return
        L_0x0311:
            X.19Y r0 = r5.A0B
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x031d
            java.lang.String r0 = "conversation/actresult/read_contacts permission denied"
            goto L_0x0808
        L_0x031d:
            X.0sq r0 = r5.A05
            X.0tz r6 = r5.A0N
            X.0sG r4 = r5.A0D
            X.013 r7 = r5.A0P
            X.1G1 r2 = r5.A07
            X.0uc r3 = r5.A0A
            X.0rv r8 = r5.A0Q
            X.371 r1 = new X.371
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            X.C13680ns.A1U(r1, r0)
            return
        L_0x0334:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.contact.picker.AddGroupParticipantsSelector r0 = (com.obwhatsapp.contact.picker.AddGroupParticipantsSelector) r0
            X.0pd r2 = r0.A0C
            X.0pt r1 = r0.A05
            X.1Ks r3 = r0.A08
            r4 = 1
            r5 = 12
            X.AnonymousClass46S.A00(r0, r1, r2, r3, r4, r5)
            return
        L_0x0345:
            java.lang.Object r2 = r15.A00
            com.obwhatsapp.contact.picker.AddGroupParticipantsSelector r2 = (com.obwhatsapp.contact.picker.AddGroupParticipantsSelector) r2
            X.0sL r1 = r2.A06
            X.0rt r0 = r2.A03
            X.AnonymousClass2BW.A00(r2, r0, r1)
            return
        L_0x0351:
            java.lang.Object r5 = r15.A00
            com.obwhatsapp.community.NewCommunityActivity r5 = (com.obwhatsapp.community.NewCommunityActivity) r5
            com.obwhatsapp.WaEditText r0 = r5.A02
            android.text.Editable r0 = r0.getText()
            boolean r0 = X.AnonymousClass1ZW.A0E(r0)
            if (r0 == 0) goto L_0x036b
            X.0pt r2 = r5.A05
            r1 = 2131889615(0x7f120dcf, float:1.9413899E38)
            r0 = 0
            r2.A09(r1, r0)
            return
        L_0x036b:
            X.1L4 r0 = r5.A03
            java.lang.String r2 = r0.A00()
            X.0va r1 = r5.A04
            java.lang.Integer r0 = X.C13690nt.A0T()
            r6 = 0
            r1.A01(r0, r0, r6, r2)
            X.120 r1 = r5.A05
            X.0sH r0 = r5.A00
            java.io.File r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0389
            android.net.Uri r6 = android.net.Uri.fromFile(r0)
        L_0x0389:
            com.obwhatsapp.WaEditText r0 = r5.A02
            android.text.Editable r0 = r0.getText()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0394
            r0 = r1
        L_0x0394:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = r0.trim()
            com.obwhatsapp.WaEditText r0 = r5.A01
            android.text.Editable r0 = r0.getText()
            if (r0 != 0) goto L_0x03a7
            r0 = r1
        L_0x03a7:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = r0.trim()
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "NewCommunityActivity_groups_to_be_added"
            java.util.ArrayList r3 = r1.getStringArrayListExtra(r0)
            if (r3 != 0) goto L_0x03c1
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
        L_0x03c1:
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.community.AddGroupsToCommunityActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "extra_community_name"
            r2.putExtra(r0, r7)
            java.lang.String r0 = "extra_community_description"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "extra_community_photo_uri"
            r2.putExtra(r0, r6)
            java.util.ArrayList r1 = X.C13680ns.A0n(r3)
            java.lang.String r0 = "extra_groups_to_be_added"
            r2.putExtra(r0, r1)
            r0 = 16436756(0xface14, float:2.3032801E-38)
            r5.Ag3(r2, r0)
            return
        L_0x03ed:
            java.lang.Object r2 = r15.A00
            com.obwhatsapp.community.EditCommunityActivity r2 = (com.obwhatsapp.community.EditCommunityActivity) r2
            com.obwhatsapp.WaEditText r0 = r2.A02
            android.text.Editable r0 = r0.getText()
            java.lang.String r6 = ""
            if (r0 != 0) goto L_0x03fc
            r0 = r6
        L_0x03fc:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = r0.trim()
            boolean r0 = X.AnonymousClass1ZW.A0E(r5)
            r4 = 0
            if (r0 == 0) goto L_0x0416
            X.0pt r1 = r2.A05
            r0 = 2131889615(0x7f120dcf, float:1.9413899E38)
            r1.A09(r0, r4)
            return
        L_0x0416:
            android.content.Intent r3 = X.C13680ns.A09()
            X.0sP r1 = r2.A02
            X.0sH r0 = r2.A06
            java.lang.String r0 = r1.A08(r0)
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x042e
            java.lang.String r0 = "extra_community_name"
            r3.putExtra(r0, r5)
            r4 = 1
        L_0x042e:
            com.obwhatsapp.WaEditText r0 = r2.A01
            android.text.Editable r0 = r0.getText()
            if (r0 != 0) goto L_0x0437
            r0 = r6
        L_0x0437:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r0.trim()
            X.0sH r0 = r2.A06
            X.1cF r0 = r0.A0H
            if (r0 == 0) goto L_0x046b
            java.lang.String r0 = r0.A02
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x046b
            java.lang.String r0 = "extra_community_description"
            r3.putExtra(r0, r1)
        L_0x0454:
            r0 = -1
            r2.setResult(r0, r3)
        L_0x0458:
            android.view.View r0 = r2.A00
            boolean r0 = X.C23061Ai.A00(r0)
            if (r0 == 0) goto L_0x0467
            X.1Ai r1 = r2.A0B
            android.view.View r0 = r2.A00
            r1.A01(r0)
        L_0x0467:
            r2.finish()
            return
        L_0x046b:
            if (r4 == 0) goto L_0x0458
            goto L_0x0454
        L_0x046e:
            java.lang.Object r0 = r15.A00
            X.3o5 r0 = (X.C73443o5) r0
            java.lang.Runnable r0 = r0.A00
            r0.run()
            return
        L_0x0478:
            java.lang.Object r2 = r15.A00
            com.obwhatsapp.community.CommunityMembersActivity r2 = (com.obwhatsapp.community.CommunityMembersActivity) r2
            X.0uj r1 = r2.A0G
            java.lang.String r0 = "507914914497920"
            android.net.Uri r0 = r1.A03(r0)
            android.content.Intent r1 = X.C13690nt.A0B(r0)
            X.0zJ r0 = r2.A00
            r0.A06(r2, r1)
            return
        L_0x048e:
            java.lang.Object r3 = r15.A00
            com.obwhatsapp.calling.callrating.CallRatingActivity r3 = (com.obwhatsapp.calling.callrating.CallRatingActivity) r3
            com.whatsapp.fieldstats.events.WamCall r1 = r3.A0D
            if (r1 == 0) goto L_0x04a0
            com.obwhatsapp.StarRatingBar r0 = r3.A05
            int r0 = r0.A00
            java.lang.Long r0 = X.C13690nt.A0W(r0)
            r1.userRating = r0
        L_0x04a0:
            com.obwhatsapp.StarRatingBar r0 = r3.A05
            int r0 = r0.A00
            double r4 = (double) r0
            r1 = 4616189618054758400(0x4010000000000000, double:4.0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x04d4
            android.widget.LinearLayout r0 = r3.A02
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x04d4
            android.widget.LinearLayout r1 = r3.A03
            r0 = 8
            r1.setVisibility(r0)
            android.widget.LinearLayout r0 = r3.A02
            r2 = 0
            r0.setVisibility(r2)
            r0 = 2131362526(0x7f0a02de, float:1.8344835E38)
            android.widget.TextView r1 = X.C13680ns.A0N(r3, r0)
            r0 = 2131886962(0x7f120372, float:1.9408518E38)
            r1.setText(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.A0F = r0
            return
        L_0x04d4:
            com.whatsapp.fieldstats.events.WamCall r2 = r3.A0D
            if (r2 == 0) goto L_0x04f5
            java.lang.Integer r0 = r3.A0F
            r4 = 0
            if (r0 != 0) goto L_0x04f9
            r0 = r4
        L_0x04de:
            r2.userProblems = r0
            android.widget.EditText r0 = r3.A01
            java.lang.String r0 = X.C13680ns.A0f(r0)
            java.lang.String r2 = r0.trim()
            com.whatsapp.fieldstats.events.WamCall r1 = r3.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x04f3
            r4 = r2
        L_0x04f3:
            r1.userDescription = r4
        L_0x04f5:
            r3.finish()
            return
        L_0x04f9:
            long r0 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x04de
        L_0x0502:
            java.lang.Object r1 = r15.A00
            X.2rd r1 = (X.C57712rd) r1
            X.4wk r2 = r1.A00
            if (r2 == 0) goto L_0x05a4
            X.4Db r0 = r1.A09
            if (r0 == 0) goto L_0x05a4
            com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r4 = r0.A00
            X.05J r0 = r4.A06
            if (r0 == 0) goto L_0x0518
            com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A01(r1, r4)
            return
        L_0x0518:
            android.content.Context r7 = r4.A0u()
            if (r7 != 0) goto L_0x0522
            java.lang.String r0 = "CallsHistoryFragmentV2/callItemViewHolderEventListener/onViewHolderClicked context null"
            goto L_0x0808
        L_0x0522:
            X.39v r6 = r2.A01
            java.util.ArrayList r0 = r6.A04
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0534
            java.lang.String r0 = "CallsHistoryFragmentV2/callItemViewHolderEventListener/onViewHolderClicked no calls registered for item"
            goto L_0x0808
        L_0x0534:
            java.lang.Object r1 = X.C13690nt.A0Z(r3)
            X.1po r1 = (X.C37831po) r1
            X.0sH r2 = r2.A02
            boolean r0 = r6.A06()
            if (r0 == 0) goto L_0x055e
            if (r2 != 0) goto L_0x055e
            X.1lE r2 = r1.A03()
            android.content.Intent r3 = X.C13680ns.A09()
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.calling.callhistory.group.GroupCallLogActivity"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "call_log_key"
            r3.putExtra(r0, r2)
        L_0x055a:
            r4.A0r(r3)
            return
        L_0x055e:
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            java.util.Iterator r1 = r3.iterator()
        L_0x0566:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x057a
            java.lang.Object r0 = r1.next()
            X.1po r0 = (X.C37831po) r0
            X.1lE r0 = r0.A03()
            r5.add(r0)
            goto L_0x0566
        L_0x057a:
            if (r2 != 0) goto L_0x0586
            X.0sH r2 = r6.A03()
            if (r2 != 0) goto L_0x0586
            java.lang.String r0 = "CallsHistoryFragmentV2/callItemViewHolderEventListener/onViewHolderClicked no contact registered for call group"
            goto L_0x0808
        L_0x0586:
            X.0rv r2 = r2.A0E
            android.content.Intent r3 = X.C13680ns.A09()
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.calling.callhistory.CallLogActivity"
            r3.setClassName(r1, r0)
            java.lang.String r1 = X.C16030sJ.A03(r2)
            java.lang.String r0 = "jid"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "calls"
            r3.putExtra(r0, r5)
            goto L_0x055a
        L_0x05a4:
            java.lang.String r0 = "CallsHistoryCallItemViewHolder/viewHolderClicked call item/event listener is null"
            goto L_0x0808
        L_0x05a8:
            java.lang.Object r3 = r15.A00
            X.2rd r3 = (X.C57712rd) r3
            X.4wk r2 = r3.A00
            if (r2 == 0) goto L_0x05be
            X.4Db r0 = r3.A09
            if (r0 == 0) goto L_0x05be
            com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r1 = r0.A00
            X.05J r0 = r1.A06
            if (r0 == 0) goto L_0x0800
            com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A01(r3, r1)
            return
        L_0x05be:
            java.lang.String r0 = "CallsHistoryCallItemViewHolder/onMultiContactPhotoClicked call item/event listener is null"
            goto L_0x0808
        L_0x05c2:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet r0 = (com.obwhatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet) r0
            r0.A3g()
            return
        L_0x05ca:
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r2 = X.C13700nu.A02(r0)
            java.lang.Object r1 = r15.A00
            com.obwhatsapp.calling.VoipAppUpdateActivity r1 = (com.obwhatsapp.calling.VoipAppUpdateActivity) r1
            X.0xQ r0 = r1.A00
            android.net.Uri r0 = r0.A00()
            r2.setData(r0)
            r1.startActivity(r2)
            r1.finish()
            return
        L_0x05e4:
            java.lang.Object r0 = r15.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x05ec:
            java.lang.Object r0 = r15.A00
            X.02k r0 = (X.C005602k) r0
            android.view.View r0 = r0.A0H
            r0.callOnClick()
            return
        L_0x05f6:
            java.lang.Object r2 = r15.A00
            X.4Lx r2 = (X.C84794Lx) r2
            X.4N8 r1 = r2.A01
            r0 = 4
            r1.A01 = r0
            X.027 r0 = r2.A00
            r0.A0B(r1)
            return
        L_0x0605:
            java.lang.Object r5 = r15.A00
            X.2yn r5 = (X.C59692yn) r5
            X.0ue r4 = r5.A0A
            r0 = 50
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            com.whatsapp.jid.UserJid r1 = r5.A0K
            r0 = 32
            r3 = 0
            r4.A04(r1, r2, r3, r0)
            X.3PX r0 = r5.A0D
            com.whatsapp.jid.UserJid r2 = r0.A04
            r1 = 2
            r0 = 0
            X.C18450wi.A0H(r2, r0)
            com.obwhatsapp.biz.cart.view.fragment.CartFragment r0 = com.obwhatsapp.biz.cart.view.fragment.CartFragment.A01(r2, r3, r1)
            r5.Afc(r0)
            return
        L_0x062a:
            java.lang.Object r1 = r15.A00
            com.obwhatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment r1 = (com.obwhatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment) r1
            int r2 = r1.A00
            r0 = -1
            if (r2 != r0) goto L_0x063d
            X.0pt r2 = r1.A01
            r1 = 2131887073(0x7f1203e1, float:1.9408743E38)
            r0 = 1
            r2.A09(r1, r0)
            return
        L_0x063d:
            X.00l r0 = r1.A0D()
            X.26l r0 = (X.C449726l) r0
            X.4KA[] r3 = r1.A02
            int r2 = r1.A00
            r2 = r3[r2]
            java.lang.String r10 = r2.A01
            X.1mM r2 = r0.A0Q
            if (r2 == 0) goto L_0x06ac
            java.lang.String r9 = r2.A0D
            X.0ue r2 = r0.A0S
            java.lang.String r11 = r2.A00
            com.whatsapp.jid.UserJid r8 = r0.A0i
            java.util.concurrent.atomic.AtomicInteger r2 = r2.A09
            int r2 = r2.getAndIncrement()
            long r13 = (long) r2
            X.0ue r2 = r0.A0S
            java.util.concurrent.atomic.AtomicInteger r2 = r2.A08
            int r12 = r2.get()
            X.2TJ r7 = new X.2TJ
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.1KA r6 = r0.A0T
            X.0x0 r5 = r6.A0K
            r4 = 774782053(0x2e2e3c65, float:3.961666E-11)
            java.lang.String r3 = "report_product_tag"
            java.lang.String r2 = "CatalogManager"
            r5.A00(r4, r3, r2)
            X.0vZ r2 = r6.A08
            X.4Q5 r6 = r6.A0E
            X.0vY r2 = r2.A03
            X.0un r2 = r2.A00
            X.0sX r3 = r2.A01
            X.01J r2 = r3.A1m
            java.lang.Object r10 = r2.get()
            X.0x0 r10 = (X.C18630x0) r10
            X.0ug r9 = X.C16150sX.A0t(r3)
            X.0uc r5 = X.C16150sX.A09(r3)
            X.01J r2 = r3.AB0
            java.lang.Object r8 = r2.get()
            X.0x9 r8 = (X.C18720x9) r8
            X.2yM r4 = new X.2yM
            r4.<init>(r5, r6, r7, r8, r9, r10)
            boolean r2 = r4.A02()
            if (r2 == 0) goto L_0x06b0
            r2 = 2131887074(0x7f1203e2, float:1.9408745E38)
            r0.Afq(r2)
        L_0x06ac:
            r1.A1D()
            return
        L_0x06b0:
            X.1KA r5 = r0.A0T
            r4 = 0
            X.0pt r3 = r5.A06
            r2 = 2
            com.facebook.redex.RunnableRunnableShape0S0210000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0210000_I0
            r0.<init>(r5, r7, r2, r4)
            r3.A0K(r0)
            goto L_0x06ac
        L_0x06bf:
            java.lang.Object r0 = r15.A00
            X.26l r0 = (X.C449726l) r0
            X.2ql r2 = r0.A0b
            X.0wP r0 = r2.A0E
            boolean r1 = r0.A0A()
            X.027 r0 = r2.A07
            X.C13700nu.A0V(r0, r1)
            return
        L_0x06d1:
            android.content.Context r4 = r16.getContext()
            java.lang.Object r3 = r15.A00
            X.26l r3 = (X.C449726l) r3
            com.whatsapp.jid.UserJid r2 = r3.A0i
            r0 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1
            android.content.Intent r1 = X.C14750ph.A0Z(r4, r2, r1, r0)
            X.0zJ r0 = r3.A00
            r0.A06(r4, r1)
            return
        L_0x06ec:
            java.lang.Object r0 = r15.A00
            X.3GB r0 = (X.AnonymousClass3GB) r0
            com.obwhatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment r2 = r0.A00
            boolean r0 = r2.A0G
            r1 = r0 ^ 1
            r0 = 1
            r2.A1P(r1, r0)
            return
        L_0x06fb:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.biz.compliance.view.BusinessComplianceDetailActivity r0 = (com.obwhatsapp.biz.compliance.view.BusinessComplianceDetailActivity) r0
            r0.A35()
            return
        L_0x0703:
            java.lang.Object r1 = r15.A00
            X.25k r1 = (X.C447525k) r1
            com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity r1 = (com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity) r1
            r0 = 1
            r1.A3A(r0)
            return
        L_0x070e:
            java.lang.Object r0 = r15.A00
            X.3GA r0 = (X.AnonymousClass3GA) r0
            com.obwhatsapp.biz.catalog.CatalogMediaViewFragment r2 = r0.A00
            boolean r0 = r2.A0G
            r1 = r0 ^ 1
            r0 = 1
            r2.A1P(r1, r0)
            return
        L_0x071d:
            java.lang.Object r2 = r15.A00
            com.obwhatsapp.backup.encryptedbackup.VerifyPasswordFragment r2 = (com.obwhatsapp.backup.encryptedbackup.VerifyPasswordFragment) r2
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r2.A07
            r0 = 5
            r1.A0A(r0)
            com.obwhatsapp.deviceauth.BiometricAuthPlugin r0 = r2.A02
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0732
            com.obwhatsapp.deviceauth.BiometricAuthPlugin r0 = r2.A02
            goto L_0x07a9
        L_0x0732:
            r0 = -1
            r2.A1H(r0)
            return
        L_0x0737:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.backup.encryptedbackup.PasswordInputFragment r0 = (com.obwhatsapp.backup.encryptedbackup.PasswordInputFragment) r0
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r0.A07
            r0 = 203(0xcb, float:2.84E-43)
            goto L_0x07e2
        L_0x0741:
            java.lang.Object r3 = r15.A00
            com.obwhatsapp.backup.encryptedbackup.RestorePasswordInputFragment r3 = (com.obwhatsapp.backup.encryptedbackup.RestorePasswordInputFragment) r3
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r3.A07
            r0 = 3
            r1.A0B(r0)
            X.1Aj r1 = r3.A01
            java.lang.String r0 = "https://faq.whatsapp.com/general/chats/cant-remember-password-for-encrypted-backup"
            android.net.Uri r0 = r1.A00(r0)
            android.content.Intent r2 = X.C13690nt.A0B(r0)
            X.0zJ r1 = r3.A00
            X.00l r0 = r3.A0D()
            r1.A06(r0, r2)
            return
        L_0x0761:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.backup.encryptedbackup.PasswordInputFragment r0 = (com.obwhatsapp.backup.encryptedbackup.PasswordInputFragment) r0
            r0.A1B()
            return
        L_0x0769:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.backup.encryptedbackup.EncryptionKeyInputFragment r0 = (com.obwhatsapp.backup.encryptedbackup.EncryptionKeyInputFragment) r0
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r0.A06
            r0.A08()
            return
        L_0x0773:
            java.lang.Object r3 = r15.A00
            com.obwhatsapp.backup.encryptedbackup.EncryptionKeyInputFragment r3 = (com.obwhatsapp.backup.encryptedbackup.EncryptionKeyInputFragment) r3
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r3.A06
            r0 = 3
            r1.A0B(r0)
            X.1Aj r1 = r3.A05
            java.lang.String r0 = "https://faq.whatsapp.com/general/chats/cant-remember-password-for-encrypted-backup"
            android.net.Uri r0 = r1.A00(r0)
            android.content.Intent r2 = X.C13690nt.A0B(r0)
            X.0zJ r1 = r3.A02
            X.00l r0 = r3.A0D()
            r1.A06(r0, r2)
            return
        L_0x0793:
            java.lang.Object r2 = r15.A00
            com.obwhatsapp.backup.encryptedbackup.EncryptionKeyInputFragment r2 = (com.obwhatsapp.backup.encryptedbackup.EncryptionKeyInputFragment) r2
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r2.A06
            r0 = 5
            r1.A0A(r0)
            com.obwhatsapp.deviceauth.BiometricAuthPlugin r0 = r2.A09
            if (r0 == 0) goto L_0x07ad
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x07ad
            com.obwhatsapp.deviceauth.BiometricAuthPlugin r0 = r2.A09
        L_0x07a9:
            r0.A02()
            return
        L_0x07ad:
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r2.A06
            r0 = 1
            r1.A0F(r0)
            return
        L_0x07b4:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.backup.encryptedbackup.EncryptionKeyDisplayFragment r0 = (com.obwhatsapp.backup.encryptedbackup.EncryptionKeyDisplayFragment) r0
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r0.A01
            r0 = 401(0x191, float:5.62E-43)
            goto L_0x07e2
        L_0x07bd:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.backup.encryptedbackup.EncBackupMainActivity r0 = (com.obwhatsapp.backup.encryptedbackup.EncBackupMainActivity) r0
            com.obwhatsapp.backup.encryptedbackup.EncBackupMainActivity.A02(r0)
            return
        L_0x07c5:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.backup.encryptedbackup.EncryptionKeyDisplayFragment r0 = (com.obwhatsapp.backup.encryptedbackup.EncryptionKeyDisplayFragment) r0
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r0.A01
            r1 = 0
            X.027 r0 = r0.A07
            X.C13680ns.A1O(r0, r1)
            return
        L_0x07d2:
            java.lang.Object r2 = r15.A00
            com.obwhatsapp.backup.encryptedbackup.EncryptionKeyDisplayFragment r2 = (com.obwhatsapp.backup.encryptedbackup.EncryptionKeyDisplayFragment) r2
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r2.A01
            r1 = 1
            X.027 r0 = r0.A01
            X.C13700nu.A0V(r0, r1)
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r2.A01
            r0 = 500(0x1f4, float:7.0E-43)
        L_0x07e2:
            r1.A0C(r0)
            return
        L_0x07e6:
            java.lang.Object r0 = r15.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1C()
            return
        L_0x07ee:
            java.lang.Object r2 = r15.A00
            X.2pZ r2 = (X.C56982pZ) r2
            int[] r1 = r2.A0B
            X.5Pb r0 = r2.A09
            r0.AXI(r1)
            r2.dismiss()
            return
        L_0x07fd:
            java.lang.String r0 = "CallsHistoryCallItemViewHolder/onSingleContactPhotoClicked call item/event listener is null"
            goto L_0x0808
        L_0x0800:
            android.content.Context r4 = r1.A0u()
            if (r4 != 0) goto L_0x080c
            java.lang.String r0 = "CallsHistoryFragmentV2/callItemViewHolderEventListener/onMultiContactPhotoClicked context null"
        L_0x0808:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x080c:
            X.39v r0 = r2.A01
            java.util.ArrayList r0 = r0.A04
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Object r0 = X.C13690nt.A0Z(r0)
            X.1po r0 = (X.C37831po) r0
            X.1lE r3 = r0.A03()
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.calling.callhistory.group.GroupCallLogActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "call_log_key"
            r2.putExtra(r0, r3)
            r4.startActivity(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ViewOnClickCListenerShape4S0100000_I1.A06(android.view.View):void");
    }

    public void onClick(View view) {
        if (35 - this.A01 == 0) {
            C82504Db r0 = ((C57712rd) this.A00).A09;
            if (r0 == null) {
                Log.w("CallsHistoryCallItemViewHolder/viewHolderClicked event listener is null");
                return;
            } else if (r0.A00.A06 != null) {
                A06(view);
                return;
            }
        }
        super.onClick(view);
    }
}

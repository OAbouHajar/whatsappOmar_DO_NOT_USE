package com.obwhatsapp.contact;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass1V8;
import X.AnonymousClass2VT;
import X.C13680ns;
import X.C15830rv;
import X.C16000sG;
import X.C16010sH;
import X.C16030sJ;
import X.C33481ie;
import X.C34881l1;
import X.C34901l3;
import com.obwhatsapp.chatinfo.ContactInfoActivity;
import com.obwhatsapp.chatinfo.ListChatInfoActivity;
import com.obwhatsapp.group.GroupAdminPickerActivity;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.obwhatsapp.profile.ViewProfilePhoto;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Collection;

public class IDxCObserverShape66S0100000_1_I0 extends C33481ie {
    public Object A00;
    public final int A01;

    public IDxCObserverShape66S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0140, code lost:
        if (r4.A04 != -1) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0147, code lost:
        if (r4.A04 == 0) goto L_0x0149;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C15830rv r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 1: goto L_0x0006;
                case 2: goto L_0x0035;
                case 3: goto L_0x0055;
                case 4: goto L_0x01bb;
                case 5: goto L_0x007d;
                case 6: goto L_0x00a9;
                case 7: goto L_0x00cf;
                case 8: goto L_0x0176;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r2 = r8.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r2 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r2
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.getNullable(r2.getIntent().getStringExtra("jid"))
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0018
            r2.A3T()
            return
        L_0x0018:
            X.0sG r0 = r2.A06
            X.0sH r0 = r0.A0A(r9)
            X.1l2 r1 = new X.1l2
            r1.<init>(r0)
            X.2oQ r0 = r2.A0W
            if (r0 == 0) goto L_0x0005
            java.util.List r0 = r0.A02
            boolean r0 = X.C16010sH.A04(r1, r0)
            if (r0 == 0) goto L_0x0005
            X.2oQ r0 = r2.A0W
            r0.notifyDataSetChanged()
            return
        L_0x0035:
            boolean r0 = X.C16030sJ.A0L(r9)
            if (r0 != 0) goto L_0x0005
            java.lang.Object r2 = r8.A00
            com.obwhatsapp.chatinfo.ListChatInfoActivity r2 = (com.obwhatsapp.chatinfo.ListChatInfoActivity) r2
            X.0sG r0 = r2.A06
            X.0sH r0 = r0.A0A(r9)
            X.1l2 r1 = new X.1l2
            r1.<init>(r0)
            java.util.ArrayList r0 = r2.A0b
            X.C16010sH.A04(r1, r0)
            X.2oH r0 = r2.A06
            r0.notifyDataSetChanged()
            return
        L_0x0055:
            boolean r0 = X.C16030sJ.A0L(r9)
            if (r0 != 0) goto L_0x0005
            java.lang.Object r2 = r8.A00
            X.1V8 r2 = (X.AnonymousClass1V8) r2
            X.0sG r0 = r2.A0J
            X.0sH r0 = r0.A0A(r9)
            X.1l2 r1 = new X.1l2
            r1.<init>(r0)
            java.util.List r0 = r2.A0Y
            boolean r0 = X.C16010sH.A04(r1, r0)
            if (r0 == 0) goto L_0x0005
            X.3Nk r0 = r2.A0P
            r0.notifyDataSetChanged()
            X.28C r0 = r2.A0e
            r0.A01()
            return
        L_0x007d:
            if (r9 == 0) goto L_0x0005
            boolean r0 = X.C16030sJ.A0L(r9)
            if (r0 != 0) goto L_0x0005
            java.lang.Object r2 = r8.A00
            com.obwhatsapp.group.GroupAdminPickerActivity r2 = (com.obwhatsapp.group.GroupAdminPickerActivity) r2
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r9)
            boolean r0 = com.obwhatsapp.group.GroupAdminPickerActivity.A02(r2, r0)
            if (r0 == 0) goto L_0x0005
            X.0sG r0 = r2.A08
            X.0sH r0 = r0.A0A(r9)
            X.1l2 r1 = new X.1l2
            r1.<init>(r0)
            java.util.List r0 = r2.A0R
            X.C16010sH.A04(r1, r0)
            X.2r5 r0 = r2.A0I
            r0.A01()
            return
        L_0x00a9:
            boolean r0 = X.C16030sJ.A0L(r9)
            java.lang.Object r2 = r8.A00
            com.obwhatsapp.group.GroupChatInfoActivity r2 = (com.obwhatsapp.group.GroupChatInfoActivity) r2
            if (r0 == 0) goto L_0x01d2
            X.0sL r0 = r2.A1M
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0005
            android.view.View r1 = r2.A0A
            r0 = 8
            r1.setVisibility(r0)
            X.12A r0 = r2.A0g
            X.0sH r1 = r2.A0w
            X.120 r0 = r0.A05
            r0.A04(r1)
            r2.A3e()
            return
        L_0x00cf:
            java.lang.Object r7 = r8.A00
            com.obwhatsapp.profile.ViewProfilePhoto r7 = (com.obwhatsapp.profile.ViewProfilePhoto) r7
            X.0sG r2 = r7.A02
            X.0sH r0 = r7.A0A
            java.lang.Class<X.0rv> r1 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r0.A08(r1)
            X.AnonymousClass00B.A06(r0)
            X.0rv r0 = (X.C15830rv) r0
            X.0sH r0 = r2.A0A(r0)
            r7.A0A = r0
            com.whatsapp.jid.Jid r0 = r0.A08(r1)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0005
            java.lang.String r0 = "viewprofilephoto/onprofilephotochanged photo_full_id:"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            X.0sH r1 = r7.A0A
            int r0 = r1.A04
            r2.append(r0)
            java.lang.String r0 = " thumb_full_id:"
            r2.append(r0)
            int r0 = r1.A05
            r2.append(r0)
            X.C13680ns.A1V(r2)
            X.0sj r1 = r7.A08
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            boolean r0 = r1.A0F(r0)
            android.os.Handler r2 = r7.A0O
            r5 = 0
            r2.removeMessages(r5)
            r6 = 1
            if (r0 == 0) goto L_0x0130
            X.0sH r0 = r7.A0A
            int r1 = r0.A04
            if (r1 != 0) goto L_0x0130
            X.12B r0 = r7.A0H
            r0.A01(r9, r1, r6)
            r0 = 32000(0x7d00, double:1.581E-319)
            r2.sendEmptyMessageDelayed(r5, r0)
        L_0x0130:
            r7.A35()
            r7.invalidateOptionsMenu()
            X.0sH r4 = r7.A0A
            int r3 = r4.A05
            r0 = -1
            if (r3 != r0) goto L_0x0142
            int r2 = r4.A04
            r1 = 1
            if (r2 == r0) goto L_0x0174
        L_0x0142:
            r1 = 0
            if (r3 != 0) goto L_0x0174
            int r0 = r4.A04
            if (r0 != 0) goto L_0x0174
        L_0x0149:
            boolean r0 = r7.A0N
            if (r0 == 0) goto L_0x0005
            r7.A0N = r5
            if (r1 == 0) goto L_0x0163
            X.0pt r2 = r7.A05
            boolean r0 = r4.A0J()
            r1 = 2131890970(0x7f12131a, float:1.9416647E38)
            if (r0 == 0) goto L_0x015f
            r1 = 2131888792(0x7f120a98, float:1.941223E38)
        L_0x015f:
            r2.A09(r1, r5)
            return
        L_0x0163:
            if (r6 == 0) goto L_0x0005
            X.0pt r2 = r7.A05
            boolean r0 = r4.A0J()
            r1 = 2131890971(0x7f12131b, float:1.9416649E38)
            if (r0 == 0) goto L_0x015f
            r1 = 2131888793(0x7f120a99, float:1.9412231E38)
            goto L_0x015f
        L_0x0174:
            r6 = 0
            goto L_0x0149
        L_0x0176:
            java.lang.Object r4 = r8.A00
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            com.whatsapp.voipcalling.CallInfo r3 = r4.A3B()
            if (r3 == 0) goto L_0x0005
            com.whatsapp.jid.GroupJid r1 = com.whatsapp.jid.GroupJid.of(r9)
            if (r1 == 0) goto L_0x0194
            com.whatsapp.jid.GroupJid r0 = r3.groupJid
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0194
            com.obwhatsapp.calling.CallDetailsLayout r0 = r4.A0l
            r0.A02(r1)
            return
        L_0x0194:
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.of(r9)
            if (r2 == 0) goto L_0x0005
            java.util.Map r0 = r3.participants
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0005
            boolean r0 = r3.isGroupCall
            if (r0 != 0) goto L_0x01af
            com.obwhatsapp.calling.CallDetailsLayout r1 = r4.A0l
            java.util.List r0 = com.whatsapp.voipcalling.VoipActivityV2.A03(r3)
            r1.A06(r0)
        L_0x01af:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r4.A1d
            if (r0 == 0) goto L_0x0005
            X.2Tw r0 = r0.A0I
            if (r0 == 0) goto L_0x0005
            r0.A0J(r2)
            return
        L_0x01bb:
            java.lang.Object r1 = r8.A00
            X.2VT r1 = (X.AnonymousClass2VT) r1
            X.0rv r0 = r1.A01
            boolean r0 = X.C34901l3.A00(r9, r0)
            if (r0 == 0) goto L_0x01ca
            r1.A06()
        L_0x01ca:
            X.1cy r1 = r1.A0V
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0B(r0)
            return
        L_0x01d2:
            X.0sG r0 = r2.A06
            X.0sH r0 = r0.A0A(r9)
            X.1l2 r1 = new X.1l2
            r1.<init>(r0)
            X.2O9 r0 = r2.A1A
            r0.A05(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contact.IDxCObserverShape66S0100000_1_I0.A00(X.0rv):void");
    }

    public void A01(C15830rv r5) {
        switch (this.A01) {
            case 6:
                if (C16030sJ.A0L(r5)) {
                    GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                    if (r5.equals(groupChatInfoActivity.A1M)) {
                        groupChatInfoActivity.A0A.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ViewProfilePhoto viewProfilePhoto = (ViewProfilePhoto) this.A00;
                C16000sG r2 = viewProfilePhoto.A02;
                Class<C15830rv> cls = C15830rv.class;
                Jid A08 = viewProfilePhoto.A0A.A08(cls);
                AnonymousClass00B.A06(A08);
                C16010sH A0A = r2.A0A((C15830rv) A08);
                viewProfilePhoto.A0A = A0A;
                if (r5.equals(A0A.A08(cls))) {
                    StringBuilder A0r = AnonymousClass000.A0r("viewprofilephoto/onProfilePhotoStartChanging photo_full_id:");
                    C16010sH r1 = viewProfilePhoto.A0A;
                    A0r.append(r1.A04);
                    A0r.append(" thumb_full_id:");
                    A0r.append(r1.A05);
                    C13680ns.A1V(A0r);
                    if (viewProfilePhoto.A0M) {
                        viewProfilePhoto.A0M = false;
                        return;
                    } else {
                        viewProfilePhoto.A0N = true;
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    public void A02(UserJid userJid) {
        switch (this.A01) {
            case 1:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (userJid.equals(UserJid.getNullable(contactInfoActivity.getIntent().getStringExtra("jid")))) {
                    contactInfoActivity.A3T();
                    return;
                }
                return;
            case 2:
                ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A00;
                if (!listChatInfoActivity.A01.A0I(userJid)) {
                    C16010sH.A04(new C34881l1(listChatInfoActivity.A06.A0A(userJid)), listChatInfoActivity.A0b);
                    listChatInfoActivity.A06.notifyDataSetChanged();
                    return;
                }
                return;
            case 3:
                AnonymousClass1V8 r2 = (AnonymousClass1V8) this.A00;
                if (C16010sH.A04(new C34881l1(r2.A0J.A0A(userJid)), r2.A0Y)) {
                    r2.A0P.notifyDataSetChanged();
                    return;
                }
                return;
            case 4:
                AnonymousClass2VT r1 = (AnonymousClass2VT) this.A00;
                if (C34901l3.A00(userJid, r1.A01)) {
                    r1.A06();
                    return;
                }
                return;
            case 5:
                if (userJid != null && !C16030sJ.A0L(userJid)) {
                    GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A00;
                    if (GroupAdminPickerActivity.A02(groupAdminPickerActivity, userJid)) {
                        C16010sH.A04(new C34881l1(groupAdminPickerActivity.A08.A0A(userJid)), groupAdminPickerActivity.A0R);
                        groupAdminPickerActivity.A0I.A01();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                if (userJid != null) {
                    GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                    if (groupChatInfoActivity.A01.A0I(userJid)) {
                        groupChatInfoActivity.A16.notifyDataSetChanged();
                        return;
                    }
                    groupChatInfoActivity.A1A.A05(new C34881l1(groupChatInfoActivity.A06.A0A(userJid)));
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (r10.equals(r3.A0P) == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(com.whatsapp.jid.UserJid r10) {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x0055;
                case 2: goto L_0x0084;
                case 3: goto L_0x00a4;
                case 4: goto L_0x00c6;
                case 5: goto L_0x00fd;
                case 6: goto L_0x0125;
                case 7: goto L_0x0140;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r1 = r9.A00
            com.obwhatsapp.biz.cart.view.fragment.CartFragment r1 = (com.obwhatsapp.biz.cart.view.fragment.CartFragment) r1
            r1.A1P()
            boolean r0 = r1.A0y
            if (r0 == 0) goto L_0x0005
            com.obwhatsapp.mentions.MentionableEntry r0 = r1.A0n
            java.lang.String r0 = r0.getStringText()
            java.lang.String r7 = r0.trim()
            X.2RP r3 = r1.A0R
            X.2W6 r5 = r1.A0Q
            X.00l r4 = r1.A0D()
            X.00k r4 = (X.C000900k) r4
            X.2Yq r6 = r1.A0W
            if (r10 == 0) goto L_0x0032
            com.whatsapp.jid.UserJid r0 = r3.A0P
            boolean r1 = r10.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            if (r5 == 0) goto L_0x0005
            if (r6 == 0) goto L_0x0005
            if (r0 == 0) goto L_0x0005
            X.0uP r0 = r3.A0L
            com.whatsapp.jid.UserJid r2 = r3.A0P
            X.1Vq r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x0049
            java.lang.String r8 = r0.A08
        L_0x0045:
            r3.A05(r4, r5, r6, r7, r8)
            return
        L_0x0049:
            X.0sP r1 = r3.A0M
            X.0sH r0 = new X.0sH
            r0.<init>(r2)
            java.lang.String r8 = r1.A08(r0)
            goto L_0x0045
        L_0x0055:
            java.lang.Object r2 = r9.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r2 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r2
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.getNullable(r2.getIntent().getStringExtra("jid"))
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0067
            r2.A3T()
            return
        L_0x0067:
            X.0sG r0 = r2.A06
            X.0sH r0 = r0.A0A(r10)
            X.2Ai r1 = new X.2Ai
            r1.<init>(r0)
            X.2oQ r0 = r2.A0W
            if (r0 == 0) goto L_0x0005
            java.util.List r0 = r0.A02
            boolean r0 = X.C16010sH.A04(r1, r0)
            if (r0 == 0) goto L_0x0005
            X.2oQ r0 = r2.A0W
            r0.notifyDataSetChanged()
            return
        L_0x0084:
            boolean r0 = X.C16030sJ.A0L(r10)
            if (r0 != 0) goto L_0x0005
            java.lang.Object r2 = r9.A00
            com.obwhatsapp.chatinfo.ListChatInfoActivity r2 = (com.obwhatsapp.chatinfo.ListChatInfoActivity) r2
            X.0sG r0 = r2.A06
            X.0sH r0 = r0.A0A(r10)
            X.2Ai r1 = new X.2Ai
            r1.<init>(r0)
            java.util.ArrayList r0 = r2.A0b
            X.C16010sH.A04(r1, r0)
            X.2oH r0 = r2.A06
            r0.notifyDataSetChanged()
            return
        L_0x00a4:
            java.lang.Object r2 = r9.A00
            X.1V8 r2 = (X.AnonymousClass1V8) r2
            X.0sG r0 = r2.A0J
            X.0sH r0 = r0.A0A(r10)
            X.2Ai r1 = new X.2Ai
            r1.<init>(r0)
            java.util.List r0 = r2.A0Y
            boolean r0 = X.C16010sH.A04(r1, r0)
            if (r0 == 0) goto L_0x0005
            X.3Nk r0 = r2.A0P
            r0.notifyDataSetChanged()
            X.28C r0 = r2.A0e
            r0.A01()
            return
        L_0x00c6:
            java.lang.Object r1 = r9.A00
            X.2VT r1 = (X.AnonymousClass2VT) r1
            X.0rv r0 = r1.A01
            boolean r0 = X.C34901l3.A00(r10, r0)
            if (r0 == 0) goto L_0x00d5
            r1.A06()
        L_0x00d5:
            X.1wN r2 = r1.A0B
            X.1ZR r1 = r2.A01
            boolean r0 = r1 instanceof X.C41691wO
            if (r0 == 0) goto L_0x0005
            if (r10 == 0) goto L_0x0005
            X.1wO r1 = (X.C41691wO) r1
            com.whatsapp.jid.UserJid r0 = r1.A00
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0005
            X.0uP r0 = r2.A0N
            X.1Vq r0 = r0.A00(r10)
            if (r0 == 0) goto L_0x0005
            X.1ZR r1 = r2.A01
            java.lang.String r0 = r0.A08
            r1.A0K = r0
            X.027 r0 = r2.A0B
            r0.A09(r1)
            return
        L_0x00fd:
            if (r10 == 0) goto L_0x0005
            boolean r0 = X.C16030sJ.A0L(r10)
            if (r0 != 0) goto L_0x0005
            java.lang.Object r2 = r9.A00
            com.obwhatsapp.group.GroupAdminPickerActivity r2 = (com.obwhatsapp.group.GroupAdminPickerActivity) r2
            boolean r0 = com.obwhatsapp.group.GroupAdminPickerActivity.A02(r2, r10)
            if (r0 == 0) goto L_0x0005
            X.0sG r0 = r2.A08
            X.0sH r0 = r0.A0A(r10)
            X.2Ai r1 = new X.2Ai
            r1.<init>(r0)
            java.util.List r0 = r2.A0R
            X.C16010sH.A04(r1, r0)
            java.lang.String r0 = r2.A0N
            r2.A38(r0)
            return
        L_0x0125:
            boolean r0 = X.C16030sJ.A0L(r10)
            if (r0 != 0) goto L_0x0005
            java.lang.Object r2 = r9.A00
            com.obwhatsapp.group.GroupChatInfoActivity r2 = (com.obwhatsapp.group.GroupChatInfoActivity) r2
            X.0sG r0 = r2.A06
            X.0sH r0 = r0.A0A(r10)
            X.2Ai r1 = new X.2Ai
            r1.<init>(r0)
            X.2O9 r0 = r2.A1A
            r0.A05(r1)
            return
        L_0x0140:
            java.lang.Object r2 = r9.A00
            com.obwhatsapp.profile.ViewProfilePhoto r2 = (com.obwhatsapp.profile.ViewProfilePhoto) r2
            X.0sG r1 = r2.A02
            X.0sH r0 = r2.A0A
            X.0rv r0 = X.C16010sH.A01(r0)
            X.0sH r0 = r1.A0A(r0)
            r2.A0A = r0
            boolean r0 = r0.A0J()
            if (r0 != 0) goto L_0x0005
            X.0sP r1 = r2.A04
            X.0sH r0 = r2.A0A
            java.lang.String r0 = r1.A08(r0)
            r2.A2g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contact.IDxCObserverShape66S0100000_1_I0.A03(com.whatsapp.jid.UserJid):void");
    }

    public void A04(Collection collection) {
        switch (this.A01) {
            case 1:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                contactInfoActivity.A3S();
                contactInfoActivity.A3V();
                return;
            case 3:
                ((AnonymousClass1V8) this.A00).A0P.notifyDataSetChanged();
                return;
            case 4:
                for (Object next : collection) {
                    AnonymousClass2VT r1 = (AnonymousClass2VT) this.A00;
                    if (C34901l3.A00(next, r1.A01)) {
                        r1.A0T.A0B(Boolean.TRUE);
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r4 = (com.whatsapp.voipcalling.VoipActivityV2) r5.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(java.util.Collection r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            int r0 = 8 - r0
            if (r0 != 0) goto L_0x0039
            java.lang.Object r4 = r5.A00
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            com.whatsapp.voipcalling.CallInfo r3 = r4.A3B()
            if (r3 == 0) goto L_0x0039
            java.util.Iterator r2 = r6.iterator()
        L_0x0014:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0039
            X.0sH r0 = X.C13680ns.A0U(r2)
            X.0rv r1 = r0.A0E
            if (r1 == 0) goto L_0x0014
            com.whatsapp.jid.GroupJid r0 = r3.groupJid
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0014
            r4.A3q(r3)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r4.A1d
            if (r0 == 0) goto L_0x0014
            X.2Tw r0 = r0.A0I
            if (r0 == 0) goto L_0x0014
            r0.A0G()
            goto L_0x0014
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contact.IDxCObserverShape66S0100000_1_I0.A05(java.util.Collection):void");
    }

    public void A06(Collection collection) {
        switch (this.A01) {
            case 1:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                contactInfoActivity.A3T();
                contactInfoActivity.A0a();
                contactInfoActivity.A3f(true, false);
                return;
            case 2:
                ListChatInfoActivity.A02((ListChatInfoActivity) this.A00);
                return;
            case 3:
                ((AnonymousClass1V8) this.A00).A3J();
                return;
            case 4:
                AnonymousClass2VT r0 = (AnonymousClass2VT) this.A00;
                r0.A06();
                r0.A0U.A0B(Boolean.TRUE);
                return;
            case 5:
                GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A00;
                groupAdminPickerActivity.A38(groupAdminPickerActivity.A0N);
                return;
            case 6:
                GroupChatInfoActivity.A03((GroupChatInfoActivity) this.A00);
                return;
            case 7:
                ViewProfilePhoto.A02((ViewProfilePhoto) this.A00);
                return;
            default:
                return;
        }
    }
}

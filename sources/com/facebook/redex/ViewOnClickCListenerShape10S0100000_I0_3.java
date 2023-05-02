package com.facebook.redex;

import android.view.View;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.group.view.custom.GroupDetailsCard;

public class ViewOnClickCListenerShape10S0100000_I0_3 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape10S0100000_I0_3(GroupDetailsCard groupDetailsCard, int i2) {
        this.A01 = i2;
        switch (i2) {
            case 20:
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                this.A00 = groupDetailsCard;
                return;
            default:
                this.A00 = groupDetailsCard;
                return;
        }
    }

    public ViewOnClickCListenerShape10S0100000_I0_3(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a0, code lost:
        if (r2.A01() == false) goto L_0x01a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r29) {
        /*
            r28 = this;
            r1 = r28
            int r0 = r1.A01
            r4 = r29
            switch(r0) {
                case 0: goto L_0x06a1;
                case 1: goto L_0x066e;
                case 2: goto L_0x065c;
                case 3: goto L_0x01c8;
                case 4: goto L_0x062b;
                case 5: goto L_0x0193;
                case 6: goto L_0x04af;
                case 7: goto L_0x015f;
                case 8: goto L_0x04a7;
                case 9: goto L_0x047d;
                case 10: goto L_0x0475;
                case 11: goto L_0x0442;
                case 12: goto L_0x043a;
                case 13: goto L_0x0415;
                case 14: goto L_0x011e;
                case 15: goto L_0x040d;
                case 16: goto L_0x00fe;
                case 17: goto L_0x0402;
                case 18: goto L_0x03f8;
                case 19: goto L_0x03e7;
                case 20: goto L_0x00d5;
                case 21: goto L_0x03ab;
                case 22: goto L_0x007a;
                case 23: goto L_0x039a;
                case 24: goto L_0x0392;
                case 25: goto L_0x038a;
                case 26: goto L_0x04b9;
                case 27: goto L_0x037a;
                case 28: goto L_0x032b;
                case 29: goto L_0x0323;
                case 30: goto L_0x0009;
                case 31: goto L_0x0009;
                case 32: goto L_0x0009;
                case 33: goto L_0x0314;
                case 34: goto L_0x0305;
                case 35: goto L_0x02fd;
                case 36: goto L_0x02f3;
                case 37: goto L_0x02ea;
                case 38: goto L_0x02d6;
                case 39: goto L_0x02ce;
                case 40: goto L_0x02bb;
                case 41: goto L_0x0228;
                case 42: goto L_0x0059;
                case 43: goto L_0x0220;
                case 44: goto L_0x003e;
                case 45: goto L_0x0030;
                case 46: goto L_0x020f;
                case 47: goto L_0x01fe;
                case 48: goto L_0x01ed;
                case 49: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r0 = r1.A00
            X.2Ut r0 = (X.AnonymousClass2Ut) r0
            X.2X3 r1 = r0.A0C
            X.2OJ r0 = r1.A02
            java.lang.Object r0 = r0.A01()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0010
            r0 = 0
            X.2OJ r1 = r1.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0B(r0)
            return
        L_0x0030:
            java.lang.Object r1 = r1.A00
            X.2gD r1 = (X.C53742gD) r1
            X.39Y r0 = r1.A0G
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0010
            r1.dismiss()
            return
        L_0x003e:
            java.lang.Object r0 = r1.A00
            X.2gD r0 = (X.C53742gD) r0
            X.39Y r1 = r0.A0G
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0010
            X.4ET r0 = r1.A08
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = r0.A00
            r0.invalidate()
            X.4Qt r0 = r1.A0B
            r0.A00()
            r0 = 1
            r1.A02(r0)
            return
        L_0x0059:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.mediacomposer.VideoComposerFragment r3 = (com.obwhatsapp.mediacomposer.VideoComposerFragment) r3
            boolean r0 = r3.A0Q
            if (r0 != 0) goto L_0x0010
            boolean r0 = r3.A0O
            r2 = r0 ^ 1
            r3.A0O = r2
            X.00l r0 = r3.A0C()
            X.29K r0 = (X.AnonymousClass29K) r0
            android.net.Uri r1 = r3.A00
            com.obwhatsapp.mediacomposer.MediaComposerActivity r0 = (com.obwhatsapp.mediacomposer.MediaComposerActivity) r0
            X.29Q r0 = r0.A1S
            X.20I r1 = r0.A00(r1)
            monitor-enter(r1)
            goto L_0x06af
        L_0x007a:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.group.view.custom.GroupDetailsCard r3 = (com.obwhatsapp.group.view.custom.GroupDetailsCard) r3
            X.0sH r4 = r3.A0G
            if (r4 == 0) goto L_0x0010
            com.obwhatsapp.group.GroupCallButtonController r0 = r3.A0K
            if (r0 == 0) goto L_0x0010
            X.3st r1 = r3.A0I
            if (r1 == 0) goto L_0x008e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A02 = r0
        L_0x008e:
            X.41r r0 = r3.A0J
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x06c3;
                case 2: goto L_0x00c3;
                case 3: goto L_0x0098;
                default: goto L_0x0097;
            }
        L_0x0097:
            return
        L_0x0098:
            android.content.Context r0 = r3.getContext()
            boolean r0 = r0 instanceof X.C001000l
            if (r0 == 0) goto L_0x00c3
            X.0sL r0 = r3.A0N
            if (r0 == 0) goto L_0x00c3
            android.content.Context r1 = r3.getContext()
            java.lang.Class<X.00l> r0 = X.C001000l.class
            android.app.Activity r4 = X.C19980zJ.A01(r1, r0)
            X.00l r4 = (X.C001000l) r4
            X.0sG r5 = r3.A08
            X.0sL r6 = r3.A0N
            X.0sO r1 = r3.A0F
            X.0sK r0 = r3.A04
            java.util.List r7 = X.C30341cC.A0D(r0, r1, r6)
            r8 = 0
            r10 = 1
            r9 = 24
            X.C30341cC.A0E(r4, r5, r6, r7, r8, r9, r10)
        L_0x00c3:
            com.obwhatsapp.group.GroupCallButtonController r0 = r3.A0K
            X.1po r4 = r0.A06
            if (r4 == 0) goto L_0x0010
            X.10c r2 = r3.A07
            android.content.Context r1 = r3.getContext()
            r0 = 11
            r2.A06(r1, r4, r0)
            return
        L_0x00d5:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.group.view.custom.GroupDetailsCard r4 = (com.obwhatsapp.group.view.custom.GroupDetailsCard) r4
            X.0sH r3 = r4.A0G
            if (r3 == 0) goto L_0x0010
            X.3st r1 = r4.A0I
            if (r1 == 0) goto L_0x00e5
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0A = r0
        L_0x00e5:
            X.10c r5 = r4.A07
            X.0sO r2 = r4.A0F
            X.0sK r1 = r4.A04
            X.0sG r0 = r4.A08
            java.util.List r8 = X.C30341cC.A0C(r1, r0, r2, r3)
            android.content.Context r6 = r4.getContext()
            r9 = 10
            r10 = 1
            X.0sL r7 = r4.A0N
            r5.A03(r6, r7, r8, r9, r10)
            return
        L_0x00fe:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.group.GroupSettingMembershipApprovalRowV1 r3 = (com.obwhatsapp.group.GroupSettingMembershipApprovalRowV1) r3
            android.content.Context r1 = r3.getContext()
            java.lang.Class<X.0pN> r0 = X.C14550pN.class
            android.app.Activity r2 = X.C19980zJ.A01(r1, r0)
            X.0pN r2 = (X.C14550pN) r2
            if (r2 == 0) goto L_0x0010
            X.5Pi r1 = r3.A03
            boolean r0 = r3.A06
            com.obwhatsapp.group.GroupSettingMembershipApprovalRowV1$MembershipApprovalModeDialogFragment r1 = com.obwhatsapp.group.GroupSettingMembershipApprovalRowV1.MembershipApprovalModeDialogFragment.A01(r1, r0)
            java.lang.String r0 = "membership_approval_setting"
            r2.Afb(r1, r0)
            return
        L_0x011e:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.group.GroupChatInfoActivity r2 = (com.obwhatsapp.group.GroupChatInfoActivity) r2
            X.3st r1 = r2.A14
            if (r1 == 0) goto L_0x012a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A03 = r0
        L_0x012a:
            X.0sO r1 = r2.A0C
            X.0sL r0 = r2.A1M
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0010
            X.0ul r1 = r2.A0H
            X.0sH r0 = r2.A0w
            boolean r0 = r1.A0f(r0)
            if (r0 != 0) goto L_0x0010
            X.15l r1 = r2.A1J
            X.0sH r0 = r2.A0w
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x0010
            X.0sO r1 = r2.A0C
            X.0sL r0 = r2.A1M
            boolean r0 = r1.A0A(r0)
            if (r0 != 0) goto L_0x06dc
            X.0sH r0 = r2.A0w
            boolean r0 = r0.A0l
            if (r0 == 0) goto L_0x06dc
            r0 = 2131888338(0x7f1208d2, float:1.9411309E38)
            r2.Afg(r0)
            return
        L_0x015f:
            java.lang.Object r6 = r1.A00
            com.obwhatsapp.group.GroupAdminPickerActivity r6 = (com.obwhatsapp.group.GroupAdminPickerActivity) r6
            java.lang.Object r0 = r4.getTag()
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0010
            java.lang.Object r5 = r4.getTag()
            X.0rv r5 = (X.C15830rv) r5
            java.lang.String r0 = r6.A0Q
            if (r0 == 0) goto L_0x06e8
            java.lang.String r0 = r6.A0O
            if (r0 == 0) goto L_0x06e8
            java.lang.Class<X.0pN> r0 = X.C14550pN.class
            android.app.Activity r4 = X.C19980zJ.A01(r6, r0)
            X.0pN r4 = (X.C14550pN) r4
            java.lang.String r3 = r6.A0P
            X.0sL r2 = r6.A0L
            java.lang.String r1 = r6.A0Q
            java.lang.String r0 = r6.A0O
            com.obwhatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment r1 = X.C810646r.A00(r5, r2, r3, r1, r0)
            java.lang.String r0 = "join_request_reason"
            r4.Afb(r1, r0)
            return
        L_0x0193:
            java.lang.Object r3 = r1.A00
            X.2Jn r3 = (X.C47572Jn) r3
            X.39R r2 = r3.A0D
            if (r2 == 0) goto L_0x01a2
            boolean r0 = r2.A01()
            r1 = 1
            if (r0 != 0) goto L_0x01a3
        L_0x01a2:
            r1 = 0
        L_0x01a3:
            boolean r0 = r3.isShowing()
            if (r0 == 0) goto L_0x01c0
            int r0 = r3.A00
            if (r0 != 0) goto L_0x01c0
            if (r1 == 0) goto L_0x01c0
            r3.A0B()
            java.lang.String r0 = "contextual_suggestion"
            r3.A0K(r0)
        L_0x01b7:
            X.1MG r0 = r2.A0G
            X.0rz r4 = r0.A01
            java.lang.Object r3 = r4.A04
            monitor-enter(r3)
            goto L_0x06fe
        L_0x01c0:
            android.view.View$OnClickListener r0 = r3.A0F
            r0.onClick(r4)
            if (r1 == 0) goto L_0x0010
            goto L_0x01b7
        L_0x01c8:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.gallery.GalleryTabHostFragment r2 = (com.obwhatsapp.gallery.GalleryTabHostFragment) r2
            X.2hK r0 = r2.A1F()
            r1 = 1
            if (r0 == 0) goto L_0x01e3
            X.0qW r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            com.obwhatsapp.gallery.GalleryRecentsFragment r0 = (com.obwhatsapp.gallery.GalleryRecentsFragment) r0
            boolean r0 = r0.A05
            if (r0 != r1) goto L_0x01e3
            r2.A1G()
            return
        L_0x01e3:
            X.00l r0 = r2.A0C()
            if (r0 == 0) goto L_0x0010
            r0.onBackPressed()
            return
        L_0x01ed:
            java.lang.Object r0 = r1.A00
            X.2Ut r0 = (X.AnonymousClass2Ut) r0
            X.2X3 r1 = r0.A0C
            r0 = 1
            X.2OJ r1 = r1.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0B(r0)
            return
        L_0x01fe:
            java.lang.Object r0 = r1.A00
            X.2Ut r0 = (X.AnonymousClass2Ut) r0
            X.2X3 r1 = r0.A0C
            r0 = 0
            X.2OJ r1 = r1.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B(r0)
            return
        L_0x020f:
            java.lang.Object r0 = r1.A00
            X.2Ut r0 = (X.AnonymousClass2Ut) r0
            X.2X3 r1 = r0.A0C
            r0 = 1
            X.2OJ r1 = r1.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B(r0)
            return
        L_0x0220:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.mediacomposer.VideoComposerFragment r0 = (com.obwhatsapp.mediacomposer.VideoComposerFragment) r0
            r0.A1L()
            return
        L_0x0228:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.mediacomposer.VideoComposerFragment r4 = (com.obwhatsapp.mediacomposer.VideoComposerFragment) r4
            boolean r0 = r4.A0Q
            r3 = r0 ^ 1
            r4.A0Q = r3
            X.00l r0 = r4.A0C()
            X.29K r0 = (X.AnonymousClass29K) r0
            com.obwhatsapp.mediacomposer.MediaComposerActivity r0 = (com.obwhatsapp.mediacomposer.MediaComposerActivity) r0
            X.29P r2 = r0.A0l
            android.net.Uri r1 = r2.A02()
            if (r1 == 0) goto L_0x0253
            X.29Q r0 = r2.A08
            X.20I r1 = r0.A00(r1)
            monitor-enter(r1)
            r1.A0F = r3     // Catch:{ all -> 0x06c0 }
            monitor-exit(r1)
            int r0 = r2.A01()
            r2.A06(r0)
        L_0x0253:
            boolean r0 = r4.A0Q
            android.widget.ImageView r1 = r4.A0B
            if (r0 == 0) goto L_0x0292
            r0 = 2131231669(0x7f0803b5, float:1.8079426E38)
            r1.setImageResource(r0)
            com.obwhatsapp.mediacomposer.VideoTimelineView r2 = r4.A0I
            r0 = 7000(0x1b58, double:3.4585E-320)
            r2.A0E = r0
            X.29D r0 = r4.A0M
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0270
            r4.A1I()
        L_0x0270:
            X.29D r3 = r4.A0M
            long r1 = r4.A02
            int r0 = (int) r1
            r3.A0A(r0)
            r4.A1D()
            X.00l r2 = r4.A0D()
            X.01V r1 = r4.A05
            r0 = 2131888583(0x7f1209c7, float:1.9411805E38)
        L_0x0284:
            java.lang.String r0 = r4.A0J(r0)
            X.AnonymousClass2JP.A00(r2, r1, r0)
            r4.A1M()
            r4.A1K()
            return
        L_0x0292:
            r0 = 2131231668(0x7f0803b4, float:1.8079424E38)
            r1.setImageResource(r0)
            com.obwhatsapp.mediacomposer.VideoTimelineView r2 = r4.A0I
            long r0 = r4.A00
            r2.A0E = r0
            X.29D r0 = r4.A0M
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x02a9
            r4.A1I()
        L_0x02a9:
            X.29D r3 = r4.A0M
            long r1 = r4.A02
            int r0 = (int) r1
            r3.A0A(r0)
            X.00l r2 = r4.A0D()
            X.01V r1 = r4.A05
            r0 = 2131892683(0x7f1219cb, float:1.9420121E38)
            goto L_0x0284
        L_0x02bb:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.mediacomposer.VideoComposerFragment r2 = (com.obwhatsapp.mediacomposer.VideoComposerFragment) r2
            X.2Ra r1 = r2.A0D
            X.2Rb r0 = r1.A0J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x02ca
            r1.A01()
        L_0x02ca:
            r2.A1L()
            return
        L_0x02ce:
            java.lang.Object r0 = r1.A00
            X.29S r0 = (X.AnonymousClass29S) r0
            r0.A05()
            return
        L_0x02d6:
            java.lang.Object r0 = r1.A00
            X.29S r0 = (X.AnonymousClass29S) r0
            X.00k r1 = r0.A0Y
            X.0sj r2 = r0.A1C
            boolean r7 = r0.A0q
            r6 = 10
            r4 = 0
            java.lang.String[] r3 = X.AnonymousClass1GE.A07
            r5 = 0
            com.obwhatsapp.RequestPermissionActivity.A0U(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x02ea:
            java.lang.Object r1 = r1.A00
            X.29S r1 = (X.AnonymousClass29S) r1
            r0 = 1
            r1.A0V(r0)
            return
        L_0x02f3:
            java.lang.Object r1 = r1.A00
            X.29S r1 = (X.AnonymousClass29S) r1
            com.obwhatsapp.location.PlaceInfo r0 = r1.A1O
            r1.A0P(r0)
            return
        L_0x02fd:
            java.lang.Object r0 = r1.A00
            X.29S r0 = (X.AnonymousClass29S) r0
            r0.A08()
            return
        L_0x0305:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.location.GroupChatLiveLocationsActivity2 r1 = (com.obwhatsapp.location.GroupChatLiveLocationsActivity2) r1
            X.291 r0 = r1.A0N
            r0.A0B()
            X.2jz r0 = r1.A0M
            r0.A09()
            return
        L_0x0314:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.location.GroupChatLiveLocationsActivity r1 = (com.obwhatsapp.location.GroupChatLiveLocationsActivity) r1
            X.291 r0 = r1.A0M
            r0.A0B()
            X.2jx r0 = r1.A0L
            r0.A0L()
            return
        L_0x0323:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.inappsupport.ui.ContactUsActivity r0 = (com.obwhatsapp.inappsupport.ui.ContactUsActivity) r0
            r0.onBackPressed()
            return
        L_0x032b:
            java.lang.Object r6 = r1.A00
            com.obwhatsapp.inappsupport.ui.ContactUsActivity r6 = (com.obwhatsapp.inappsupport.ui.ContactUsActivity) r6
            X.0wP r0 = r6.A07
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0373
            r0 = 1
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r0 = 2131887419(0x7f12053b, float:1.9409445E38)
            java.lang.String r0 = r6.getString(r0)
            r12 = 0
            r7[r12] = r0
            java.lang.Object[] r5 = new java.lang.Object[r12]
            X.4fz r4 = X.C91484fz.A00
            com.obwhatsapp.LegacyMessageDialogFragment r3 = new com.obwhatsapp.LegacyMessageDialogFragment
            r3.<init>()
            r8 = -1
            r9 = 2131889656(0x7f120df8, float:1.9413982E38)
            r10 = 2131891080(0x7f121388, float:1.941687E38)
            r11 = 2131889799(0x7f120e87, float:1.9414272E38)
            r13 = -1
            android.os.Bundle r2 = X.C87584Xn.A00(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r1 = "title_params_values"
            java.lang.String r0 = "title_params_types"
            X.C87584Xn.A01(r2, r1, r0, r5)
            r3.A00 = r4
            r3.A0T(r2)
            X.02C r1 = r6.AGM()
            r0 = 0
            r3.A1G(r1, r0)
            return
        L_0x0373:
            X.2Nw r1 = r6.A0G
            r0 = 1
            r1.A02(r0)
            return
        L_0x037a:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.inappsupport.ui.ContactUsActivity r0 = (com.obwhatsapp.inappsupport.ui.ContactUsActivity) r0
            androidx.appcompat.widget.AppCompatCheckBox r1 = r0.A02
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
        L_0x038a:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.identity.IdentityVerificationActivity r0 = (com.obwhatsapp.identity.IdentityVerificationActivity) r0
            r0.A38()
            return
        L_0x0392:
            java.lang.Object r0 = r1.A00
            X.0pN r0 = (X.C14550pN) r0
            r0.onBackPressed()
            return
        L_0x039a:
            java.lang.Object r3 = r1.A00
            X.0pN r3 = (X.C14550pN) r3
            X.0pt r2 = r3.A05
            r1 = 41
            com.facebook.redex.RunnableRunnableShape9S0100000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape9S0100000_I0_8
            r0.<init>(r3, r1)
            r2.A0K(r0)
            return
        L_0x03ab:
            java.lang.Object r6 = r1.A00
            com.obwhatsapp.group.view.custom.GroupDetailsCard r6 = (com.obwhatsapp.group.view.custom.GroupDetailsCard) r6
            X.3st r1 = r6.A0I
            if (r1 == 0) goto L_0x03b7
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A08 = r0
        L_0x03b7:
            X.0zJ r5 = r6.A03
            android.content.Context r4 = r6.getContext()
            X.0ph r3 = new X.0ph
            r3.<init>()
            android.content.Context r2 = r6.getContext()
            X.0sH r1 = r6.A0G
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)
            X.0rv r0 = (X.C15830rv) r0
            android.content.Intent r1 = r3.A0x(r2, r0)
            java.lang.String r0 = "args_conversation_screen_entry_point"
            r2 = 1
            android.content.Intent r1 = r1.putExtra(r0, r2)
            java.lang.String r0 = "extra_show_search_on_create"
            android.content.Intent r1 = r1.putExtra(r0, r2)
            java.lang.String r0 = "GroupChatInfoActivity"
            r5.A08(r4, r1, r0)
            return
        L_0x03e7:
            java.lang.Object r0 = r1.A00
            X.2OT r0 = (X.AnonymousClass2OT) r0
            X.2AS r0 = r0.A0J
            X.1cy r1 = r0.A0t
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A09(r0)
            return
        L_0x03f8:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.group.GroupSettingsLayoutV1$AdminSettingsDialogFragment r0 = (com.obwhatsapp.group.GroupSettingsLayoutV1$AdminSettingsDialogFragment) r0
            boolean[] r1 = r0.A0D
            r0 = 0
            r1[r0] = r0
            return
        L_0x0402:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.group.GroupSettingsLayoutV1$AdminSettingsDialogFragment r0 = (com.obwhatsapp.group.GroupSettingsLayoutV1$AdminSettingsDialogFragment) r0
            boolean[] r2 = r0.A0D
            r1 = 0
            r0 = 1
            r2[r1] = r0
            return
        L_0x040d:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1C()
            return
        L_0x0415:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.group.GroupChatInfoActivity r4 = (com.obwhatsapp.group.GroupChatInfoActivity) r4
            android.content.Context r0 = r4.getApplicationContext()
            X.0sL r3 = r4.A1M
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.group.GroupPendingParticipantsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "gid"
            r2.putExtra(r0, r1)
            r4.startActivity(r2)
            return
        L_0x043a:
            java.lang.Object r0 = r1.A00
            X.2DL r0 = (X.AnonymousClass2DL) r0
            r0.A39()
            return
        L_0x0442:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.group.GroupChatInfoActivity r3 = (com.obwhatsapp.group.GroupChatInfoActivity) r3
            X.3st r1 = r3.A14
            if (r1 == 0) goto L_0x044e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A04 = r0
        L_0x044e:
            X.0ul r2 = r3.A0H
            X.0sL r1 = r3.A1M
            X.0sH r0 = r3.A0w
            boolean r0 = r2.A0h(r0, r1)
            if (r0 == 0) goto L_0x0469
            X.0sL r2 = r3.A1M
            X.0sH r0 = r3.A0w
            int r1 = r0.A01
            r0 = 1
            android.content.Intent r0 = X.C14750ph.A0J(r3, r2, r1, r0)
            r3.startActivity(r0)
            return
        L_0x0469:
            r1 = 2131888175(0x7f12082f, float:1.9410978E38)
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r1, r0)
            r0.show()
            return
        L_0x0475:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.group.GroupChatInfoActivity r0 = (com.obwhatsapp.group.GroupChatInfoActivity) r0
            r0.A3P()
            return
        L_0x047d:
            java.lang.Object r6 = r1.A00
            com.obwhatsapp.group.GroupChatInfoActivity r6 = (com.obwhatsapp.group.GroupChatInfoActivity) r6
            X.0sL r5 = r6.A3M()
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
        L_0x04a7:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.group.GroupAdminPickerActivity r0 = (com.obwhatsapp.group.GroupAdminPickerActivity) r0
            r0.A36()
            return
        L_0x04af:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.gifsearch.GifSearchContainer r0 = (com.obwhatsapp.gifsearch.GifSearchContainer) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A06
            r0.A0S()
            return
        L_0x04b9:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.inappbugreporting.InAppBugReportingActivity r3 = (com.obwhatsapp.inappbugreporting.InAppBugReportingActivity) r3
            r0 = 6
            r3.A35(r0)
            X.01V r0 = r3.A08
            android.view.inputmethod.InputMethodManager r2 = r0.A0Q()
            if (r2 == 0) goto L_0x04da
            android.view.View r0 = r3.getCurrentFocus()
            if (r0 == 0) goto L_0x04da
            android.view.View r0 = r3.getCurrentFocus()
            if (r0 != 0) goto L_0x04f3
            r1 = 0
        L_0x04d6:
            r0 = 0
            r2.hideSoftInputFromWindow(r1, r0)
        L_0x04da:
            X.0qW r0 = r3.A0I
            java.lang.Object r10 = r0.getValue()
            com.obwhatsapp.inappbugreporting.InAppBugReportingViewModel r10 = (com.obwhatsapp.inappbugreporting.InAppBugReportingViewModel) r10
            com.obwhatsapp.WaEditText r0 = r3.A07
            if (r0 != 0) goto L_0x04f8
            java.lang.String r0 = "describeBugField"
            X.C18450wi.A0O(r0)
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x04f3:
            android.os.IBinder r1 = r0.getWindowToken()
            goto L_0x04d6
        L_0x04f8:
            android.text.Editable r0 = r0.getText()
            java.lang.String r9 = java.lang.String.valueOf(r0)
            android.net.Uri[] r11 = r3.A0H
            r8 = 0
            X.C18450wi.A0H(r9, r8)
            r7 = 1
            X.C18450wi.A0H(r11, r7)
            java.lang.String r0 = "[^\\p{L}\\p{N}\\p{P}\\p{Z}]"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r0)
            java.lang.CharSequence r0 = X.C008603x.A04(r9)
            java.lang.String r0 = r0.toString()
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.lang.String r0 = ""
            java.lang.String r0 = r1.replaceAll(r0)
            X.C18450wi.A0B(r0)
            int r2 = r0.length()
            r0 = 10
            X.027 r1 = r10.A03
            if (r2 >= r0) goto L_0x0535
            X.3uF r0 = X.C76553uF.A00
            r1.A0B(r0)
            return
        L_0x0535:
            X.3uG r0 = X.C76563uG.A00
            r1.A0B(r0)
            X.027 r1 = r10.A04
            X.3uI r0 = X.C76583uI.A00
            r1.A0B(r0)
            X.4Oc r3 = r10.A06
            X.1WD r6 = new X.1WD
            r6.<init>()
            X.0sq r2 = r3.A08
            r1 = 28
            com.facebook.redex.RunnableRunnableShape14S0200000_I1_2 r0 = new com.facebook.redex.RunnableRunnableShape14S0200000_I1_2
            r0.<init>(r3, r1, r6)
            r2.Acl(r0)
            X.4MK r5 = r10.A08
            X.1WD r4 = new X.1WD
            r4.<init>()
            java.util.List r0 = X.C11330iZ.A04(r11)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x059e
            X.22l r1 = X.C440222l.A00
            X.3uL r0 = new X.3uL
            r0.<init>(r1)
            r4.A02(r0)
        L_0x056f:
            X.4Kl r5 = r10.A07
            X.1WD r3 = new X.1WD
            r3.<init>()
            X.0sq r2 = r5.A02
            r1 = 29
            com.facebook.redex.RunnableRunnableShape14S0200000_I1_2 r0 = new com.facebook.redex.RunnableRunnableShape14S0200000_I1_2
            r0.<init>(r5, r1, r3)
            r2.Acl(r0)
            r0 = 3
            X.1WD[] r1 = new X.AnonymousClass1WD[r0]
            r1[r8] = r6
            r1[r7] = r4
            r0 = 2
            r1[r0] = r3
            java.util.List r0 = X.AnonymousClass1JA.A0R(r1)
            X.1XU r1 = new X.1XU
            r1.<init>(r0)
            X.52r r0 = new X.52r
            r0.<init>(r10, r9)
            r1.A00(r0)
            return
        L_0x059e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r0 = X.C11330iZ.A04(r11)
            java.util.Iterator r16 = r0.iterator()
        L_0x05ab:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x061b
            java.lang.Object r2 = r16.next()
            android.net.Uri r2 = (android.net.Uri) r2
            X.1WD r1 = new X.1WD
            r1.<init>()
            X.1XJ r12 = new X.1XJ
            r12.<init>(r7, r8, r7)
            X.0pd r15 = r5.A01
            r0 = 2477(0x9ad, float:3.471E-42)
            X.0tM r11 = X.C16620tM.A02
            int r14 = r15.A03(r11, r0)
            r0 = 2475(0x9ab, float:3.468E-42)
            int r13 = r15.A03(r11, r0)
            r0 = 2476(0x9ac, float:3.47E-42)
            int r0 = r15.A03(r11, r0)
            X.1XN r11 = new X.1XN
            r11.<init>(r14, r13, r0, r0)
            X.1XK r21 = X.AnonymousClass1XK.A0B
            r0 = 0
            r23 = r0
            r24 = 0
            r25 = 0
            r26 = 1
            r27 = 1
            r18 = r0
            r19 = r11
            r20 = r12
            r22 = r0
            r17 = r2
            X.1XL r11 = X.AnonymousClass1XL.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.0wL r2 = r5.A02
            X.1XP r13 = r2.A03(r11, r7)
            java.lang.String r2 = "mms"
            r13.A0U = r2
            X.0sq r12 = r5.A03
            r11 = 30
            com.facebook.redex.RunnableRunnableShape14S0200000_I1_2 r2 = new com.facebook.redex.RunnableRunnableShape14S0200000_I1_2
            r2.<init>(r5, r11, r13)
            r12.Acl(r2)
            com.facebook.redex.IDxNConsumerShape16S0300000_1_I1 r11 = new com.facebook.redex.IDxNConsumerShape16S0300000_1_I1
            r11.<init>(r1, r5, r13, r8)
            X.1XS r2 = r13.A0A
            r2.A03(r11, r0)
            r3.add(r1)
            goto L_0x05ab
        L_0x061b:
            X.1XU r2 = new X.1XU
            r2.<init>(r3)
            r1 = 6
            com.facebook.redex.IDxNConsumerShape154S0100000_2_I1 r0 = new com.facebook.redex.IDxNConsumerShape154S0100000_2_I1
            r0.<init>(r4, r1)
            r2.A00(r0)
            goto L_0x056f
        L_0x062b:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.gallery.NewMediaPickerFragment r3 = (com.obwhatsapp.gallery.NewMediaPickerFragment) r3
            java.util.Set r1 = r3.A05
            r0 = 10
            int r0 = X.AnonymousClass1J9.A0M(r1, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0640:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0654
            java.lang.Object r0 = r1.next()
            X.2BF r0 = (X.AnonymousClass2BF) r0
            android.net.Uri r0 = r0.A9L()
            r2.add(r0)
            goto L_0x0640
        L_0x0654:
            java.util.Set r0 = X.C003101j.A0F(r2)
            r3.A1P(r0)
            return
        L_0x065c:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.gallery.GalleryTabHostFragment r1 = (com.obwhatsapp.gallery.GalleryTabHostFragment) r1
            X.0qW r0 = r1.A0E
            java.lang.Object r0 = r0.getValue()
            X.2hJ r0 = (X.C54362hJ) r0
            java.util.List r0 = r0.A02
            r1.A1I(r0)
            return
        L_0x066e:
            java.lang.Object r2 = r1.A00
            X.2JH r2 = (X.AnonymousClass2JH) r2
            boolean r0 = r2.isShowing()
            if (r0 == 0) goto L_0x067e
            com.obwhatsapp.WaEditText r0 = r2.A0K
            r2.A08(r0)
            return
        L_0x067e:
            X.29I r0 = r2.A0C
            if (r0 == 0) goto L_0x068e
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x068e
            X.29I r0 = r2.A0C
            r0.A02()
            return
        L_0x068e:
            java.lang.Runnable r0 = r2.A0E
            if (r0 == 0) goto L_0x0695
            r0.run()
        L_0x0695:
            X.1M4 r1 = r2.A0D
            if (r1 == 0) goto L_0x069d
            r0 = 5
            r1.A00(r0)
        L_0x069d:
            r2.A06()
            return
        L_0x06a1:
            java.lang.Object r1 = r1.A00
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
        L_0x06af:
            r1.A0E = r2     // Catch:{ all -> 0x06c0 }
            monitor-exit(r1)
            r3.A1M()
            X.29D r1 = r3.A0M
            boolean r0 = r3.A0O
            r1.A0B(r0)
            r3.A1K()
            return
        L_0x06c0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x06c3:
            X.10c r5 = r3.A07
            X.0sO r2 = r3.A0F
            X.0sK r1 = r3.A04
            X.0sG r0 = r3.A08
            java.util.List r8 = X.C30341cC.A0C(r1, r0, r2, r4)
            android.content.Context r6 = r3.getContext()
            r9 = 10
            r10 = 0
            X.0sL r7 = r3.A0N
            r5.A03(r6, r7, r8, r9, r10)
            return
        L_0x06dc:
            r0 = 7
            X.AnonymousClass29T.A01(r2, r0)
            X.0xS r1 = r2.A0p
            X.0sL r0 = r2.A1M
            r1.A02(r0)
            return
        L_0x06e8:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r5.getRawString()
            java.lang.String r0 = "contact"
            r2.putExtra(r0, r1)
            r0 = -1
            r6.setResult(r0, r2)
            r6.finish()
            return
        L_0x06fe:
            X.01D r0 = r4.A01     // Catch:{ all -> 0x071d }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x071d }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x071d }
            java.lang.String r2 = "sticker_suggestion_icon_clicked_count"
            r0 = 0
            int r0 = r1.getInt(r2, r0)     // Catch:{ all -> 0x071d }
            android.content.SharedPreferences$Editor r1 = r4.A0K()     // Catch:{ all -> 0x071d }
            int r0 = r0 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r2, r0)     // Catch:{ all -> 0x071d }
            r0.apply()     // Catch:{ all -> 0x071d }
            monitor-exit(r3)     // Catch:{ all -> 0x071d }
            return
        L_0x071d:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x071d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3.onClick(android.view.View):void");
    }
}

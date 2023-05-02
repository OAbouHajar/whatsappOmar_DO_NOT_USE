package com.facebook.redex;

import com.mod.bomfab.R$styleable;
import com.obwhatsapp.chatinfo.ContactInfoActivity;

public class RunnableRunnableShape5S0100000_I0_4 implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableRunnableShape5S0100000_I0_4(ContactInfoActivity contactInfoActivity, int i2) {
        this.A01 = i2;
        switch (i2) {
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                this.A00 = contactInfoActivity;
                return;
            default:
                this.A00 = contactInfoActivity;
                return;
        }
    }

    public RunnableRunnableShape5S0100000_I0_4(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:209:0x0580 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            int r0 = r15.A01
            switch(r0) {
                case 0: goto L_0x0605;
                case 1: goto L_0x05fb;
                case 2: goto L_0x05f0;
                case 3: goto L_0x0187;
                case 4: goto L_0x05cb;
                case 5: goto L_0x05c1;
                case 6: goto L_0x0158;
                case 7: goto L_0x05b9;
                case 8: goto L_0x05b1;
                case 9: goto L_0x05a9;
                case 10: goto L_0x04cb;
                case 11: goto L_0x0141;
                case 12: goto L_0x0131;
                case 13: goto L_0x04b8;
                case 14: goto L_0x0492;
                case 15: goto L_0x03ef;
                case 16: goto L_0x03dd;
                case 17: goto L_0x03d5;
                case 18: goto L_0x03cd;
                case 19: goto L_0x010d;
                case 20: goto L_0x03c2;
                case 21: goto L_0x03b8;
                case 22: goto L_0x03a9;
                case 23: goto L_0x00f7;
                case 24: goto L_0x00df;
                case 25: goto L_0x0398;
                case 26: goto L_0x0390;
                case 27: goto L_0x00d1;
                case 28: goto L_0x037f;
                case 29: goto L_0x00a1;
                case 30: goto L_0x035f;
                case 31: goto L_0x035f;
                case 32: goto L_0x0005;
                case 33: goto L_0x0005;
                case 34: goto L_0x0352;
                case 35: goto L_0x032b;
                case 36: goto L_0x0312;
                case 37: goto L_0x02e4;
                case 38: goto L_0x02bb;
                case 39: goto L_0x02a8;
                case 40: goto L_0x0215;
                case 41: goto L_0x0209;
                case 42: goto L_0x0087;
                case 43: goto L_0x01cc;
                case 44: goto L_0x01b4;
                case 45: goto L_0x0053;
                case 46: goto L_0x0040;
                case 47: goto L_0x0021;
                case 48: goto L_0x01ac;
                case 49: goto L_0x019b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.community.CommunityHomeActivity r0 = (com.obwhatsapp.community.CommunityHomeActivity) r0
            X.2AS r4 = r0.A0O
            X.0sH r3 = r0.A0f
            X.2OJ r1 = r4.A0p
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A09(r0)
            X.0sq r2 = r4.A0z
            r1 = 12
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r4, r1, r3)
            r2.Acl(r0)
        L_0x0020:
            return
        L_0x0021:
            java.lang.Object r3 = r15.A00
            X.2AS r3 = (X.AnonymousClass2AS) r3
            X.0uk r2 = r3.A0J
            X.0sL r1 = r3.A0j
            boolean r0 = r2.A0D(r1)
            if (r0 == 0) goto L_0x0034
            X.1cy r0 = r3.A0y
            r0.A09(r1)
        L_0x0034:
            boolean r0 = r2.A0B(r1)
            if (r0 == 0) goto L_0x0020
            X.1cy r0 = r3.A0x
            r0.A09(r1)
            return
        L_0x0040:
            java.lang.Object r2 = r15.A00
            X.2AS r2 = (X.AnonymousClass2AS) r2
            X.0rt r1 = r2.A0U
            X.0sL r0 = r2.A0j
            X.0rx r3 = r1.A06(r0)
            r2.A04 = r3
            if (r3 == 0) goto L_0x0020
            monitor-enter(r3)
            goto L_0x0622
        L_0x0053:
            java.lang.Object r4 = r15.A00
            X.2AS r4 = (X.AnonymousClass2AS) r4
            X.0sG r1 = r4.A0O
            X.0sL r0 = r4.A0j
            X.0sH r3 = r1.A08(r0)
            r4.A05 = r3
            if (r3 == 0) goto L_0x0072
            X.0rv r0 = r3.A0E
            boolean r0 = r0 instanceof X.C16050sL
            if (r0 == 0) goto L_0x0072
            r2 = 1
            r1 = 0
            X.1l4 r0 = new X.1l4
            r0.<init>(r1, r2)
            r3.A0G = r0
        L_0x0072:
            X.027 r0 = r4.A0D
            r0.A09(r3)
            X.0sH r2 = r4.A05
            if (r2 == 0) goto L_0x0020
            X.027 r1 = r4.A0B
            X.0sP r0 = r4.A0R
            java.lang.String r0 = r0.A08(r2)
            r1.A09(r0)
            return
        L_0x0087:
            java.lang.Object r4 = r15.A00
            X.2AS r4 = (X.AnonymousClass2AS) r4
            X.0rx r0 = r4.A04
            if (r0 == 0) goto L_0x0020
            long r0 = r4.A01
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            X.0t6 r5 = r4.A0X
            X.0sL r6 = r4.A0j
            long r7 = r5.A08(r6, r0)
            X.0rx r3 = r4.A04
            monitor-enter(r3)
            goto L_0x0649
        L_0x00a1:
            java.lang.Object r5 = r15.A00
            com.obwhatsapp.community.CommunityExitDialogFragment r5 = (com.obwhatsapp.community.CommunityExitDialogFragment) r5
            android.content.Context r4 = r5.A0u()
            if (r4 == 0) goto L_0x0020
            X.0uj r1 = r5.A06
            java.lang.String r0 = "3114626665494175"
            android.net.Uri r3 = r1.A03(r0)
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0, r3)
            java.lang.String r1 = "CommunityExitDialogFragment intent: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0zJ r0 = r5.A00
            r0.A06(r4, r2)
            return
        L_0x00d1:
            java.lang.Object r2 = r15.A00
            com.obwhatsapp.chatinfo.view.custom.ContactDetailsCard r2 = (com.obwhatsapp.chatinfo.view.custom.ContactDetailsCard) r2
            X.0sH r1 = r2.A0O
            if (r1 == 0) goto L_0x0020
            X.15p r0 = r2.A0T
            r0.A0Z(r2, r1)
            return
        L_0x00df:
            java.lang.Object r3 = r15.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r3 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r3
            X.0pd r2 = r3.A0C
            r1 = 1071(0x42f, float:1.501E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0020
            X.1BL r2 = r3.A1F
            r1 = 3
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x00f7:
            java.lang.Object r2 = r15.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r2 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r2
            X.0sH r1 = r2.A0x
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r1.A08(r0)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r1 == 0) goto L_0x0020
            X.1L0 r0 = r2.A10
            r0.A01(r1)
            return
        L_0x010d:
            java.lang.Object r3 = r15.A00
            com.obwhatsapp.camera.overlays.AutofocusOverlay r3 = (com.obwhatsapp.camera.overlays.AutofocusOverlay) r3
            int r1 = r3.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0020
            r3.setVisibility(r0)
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x0020
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r1, r0)
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            r3.startAnimation(r2)
            return
        L_0x0131:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.calling.views.PermissionDialogFragment r0 = (com.obwhatsapp.calling.views.PermissionDialogFragment) r0
            X.1ZC r2 = r0.A04
            if (r2 == 0) goto L_0x0020
            int r1 = r0.A00
            java.lang.String[] r0 = r0.A0D
            r2.AUj(r0, r1)
            return
        L_0x0141:
            java.lang.Object r2 = r15.A00
            com.obwhatsapp.calling.videoparticipant.MaximizedParticipantVideoDialogFragment r2 = (com.obwhatsapp.calling.videoparticipant.MaximizedParticipantVideoDialogFragment) r2
            boolean r0 = r2.A0c()
            if (r0 == 0) goto L_0x0020
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView r1 = r2.A07
            if (r1 == 0) goto L_0x0154
            r0 = 8
            r1.setVisibility(r0)
        L_0x0154:
            r2.A1D()
            return
        L_0x0158:
            java.lang.Object r3 = r15.A00
            X.25g r3 = (X.C447225g) r3
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r1 == 0) goto L_0x0020
            X.1fU r0 = r1.self
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.A0D
            r0 = r0 ^ 1
            com.whatsapp.voipcalling.Voip.muteCall(r0)
            if (r0 != 0) goto L_0x0020
            X.1fU r0 = r1.self
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x0020
            X.0pd r2 = r3.A2O
            r1 = 2657(0xa61, float:3.723E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0020
            X.26Z r0 = r3.A1k
            r0.A03()
            return
        L_0x0187:
            java.lang.Object r2 = r15.A00
            X.26G r2 = (X.AnonymousClass26G) r2
            r2.A08()
            X.26I r0 = r2.A00
            if (r0 == 0) goto L_0x0020
            int r1 = r0.A00
            r0 = 1
            if (r1 == r0) goto L_0x0020
            r2.A09()
            return
        L_0x019b:
            java.lang.Object r3 = r15.A00
            X.2AS r3 = (X.AnonymousClass2AS) r3
            X.1WA r2 = r3.A0s
            r1 = 48
            com.facebook.redex.RunnableRunnableShape5S0100000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape5S0100000_I0_4
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.execute(r0)
            return
        L_0x01ac:
            java.lang.Object r0 = r15.A00
            X.2AS r0 = (X.AnonymousClass2AS) r0
            r0.A07()
            return
        L_0x01b4:
            java.lang.Object r0 = r15.A00
            X.2AS r0 = (X.AnonymousClass2AS) r0
            X.18T r1 = r0.A0h
            X.0so r2 = r0.A0F
            X.0ug r6 = r0.A0k
            X.0ul r4 = r0.A0Z
            X.0sL r5 = r0.A0j
            X.2Up r3 = new X.2Up
            r3.<init>(r0)
            r7 = 0
            r1.A00(r2, r3, r4, r5, r6, r7)
            return
        L_0x01cc:
            java.lang.Object r6 = r15.A00
            X.2AS r6 = (X.AnonymousClass2AS) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.0uk r0 = r6.A0J
            X.0sL r4 = r6.A0j
            X.28n r3 = r0.A03
            java.util.List r0 = r3.A00(r4)
            java.util.Iterator r2 = r0.iterator()
        L_0x01e3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01f9
            java.lang.Object r0 = r2.next()
            X.1sW r0 = (X.C39461sW) r0
            com.whatsapp.jid.GroupJid r1 = r0.A02
            boolean r0 = r1 instanceof X.C16050sL
            if (r0 == 0) goto L_0x01e3
            r5.add(r1)
            goto L_0x01e3
        L_0x01f9:
            X.15k r1 = r3.A04
            java.util.List r0 = java.util.Collections.emptyList()
            r1.A03(r4, r0)
            X.0ul r1 = r6.A0Z
            r0 = 0
            r1.A0a(r5, r0)
            return
        L_0x0209:
            java.lang.Object r0 = r15.A00
            X.2AS r0 = (X.AnonymousClass2AS) r0
            X.0uk r1 = r0.A0J
            X.0sL r0 = r0.A0j
            r1.A06(r0)
            return
        L_0x0215:
            java.lang.Object r3 = r15.A00
            X.2AS r3 = (X.AnonymousClass2AS) r3
            java.util.List r4 = r3.A13
            r4.clear()
            java.util.List r2 = r3.A12
            r2.clear()
            X.15l r1 = r3.A0i
            X.0sH r0 = r3.A05
            boolean r6 = r1.A00(r0)
            X.0uk r5 = r3.A0J
            X.0sL r1 = r3.A0j
            X.28n r0 = r5.A03
            if (r6 == 0) goto L_0x0282
            X.15k r0 = r0.A04
            java.util.List r0 = r0.A01(r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r10 = r0.iterator()
        L_0x0242:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0291
            java.lang.Object r8 = r10.next()
            X.1sW r8 = (X.C39461sW) r8
            X.15l r9 = r5.A0F
            if (r8 == 0) goto L_0x026e
            int r7 = r8.A00
            r1 = 1
            r0 = 3
            if (r7 == r0) goto L_0x025a
            if (r7 != r1) goto L_0x026e
        L_0x025a:
            X.0sG r1 = r9.A00
            com.whatsapp.jid.GroupJid r0 = r8.A02
            X.0sH r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x026e
            boolean r0 = r9.A00(r0)
            if (r0 == 0) goto L_0x026e
            r6.add(r8)
            goto L_0x0242
        L_0x026e:
            java.lang.String r0 = "CommunityChatManager/getTerminatedLinkedSubgroups - unexpected subgroup: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            com.whatsapp.jid.GroupJid r0 = r8.A02
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0242
        L_0x0282:
            java.util.List r0 = r0.A00(r1)
            r4.addAll(r0)
            java.util.List r0 = r5.A03(r1)
            r2.addAll(r0)
            goto L_0x0294
        L_0x0291:
            r4.addAll(r6)
        L_0x0294:
            java.util.List r1 = r3.A10
            r1.clear()
            r1.addAll(r4)
            r1.addAll(r2)
            X.2OJ r0 = r3.A0o
            r0.A09(r1)
            r3.A07()
            return
        L_0x02a8:
            java.lang.Object r2 = r15.A00
            X.2AS r2 = (X.AnonymousClass2AS) r2
            X.1cy r1 = r2.A0w
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A09(r0)
            X.1cy r1 = r2.A0u
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A09(r0)
            return
        L_0x02bb:
            java.lang.Object r0 = r15.A00
            X.2jH r0 = (X.C55302jH) r0
            com.obwhatsapp.community.CommunitySubgroupsBottomSheet r4 = r0.A01
            X.0sL r3 = r0.A00
            X.0va r1 = r4.A0D
            r0 = 3
            r1.A00(r3, r0)
            r2 = 0
            X.00l r0 = r4.A0D()
            android.content.Intent r1 = X.C14750ph.A0O(r0, r3)
            android.content.Context r0 = r4.A02()
            r0.startActivity(r1, r2)
            r4.A1C()
            X.00l r0 = r4.A0D()
            r0.finish()
            return
        L_0x02e4:
            java.lang.Object r0 = r15.A00
            X.2jH r0 = (X.C55302jH) r0
            com.obwhatsapp.community.CommunitySubgroupsBottomSheet r5 = r0.A01
            X.0sL r4 = r0.A00
            X.0va r1 = r5.A0D
            r0 = 4
            r1.A00(r4, r0)
            r5.A1C()
            X.1L3 r3 = r5.A0B
            android.content.Context r1 = r5.A0u()
            java.lang.Class<X.00k> r0 = X.C000900k.class
            android.app.Activity r2 = X.C19980zJ.A01(r1, r0)
            X.00k r2 = (X.C000900k) r2
            X.00l r1 = r5.A0D()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r1.findViewById(r0)
            r3.A01(r0, r2, r4)
            return
        L_0x0312:
            java.lang.Object r3 = r15.A00
            com.obwhatsapp.community.CommunityNUXActivity r3 = (com.obwhatsapp.community.CommunityNUXActivity) r3
            X.0uj r1 = r3.A05
            java.lang.String r0 = "625069579217642"
            android.net.Uri r2 = r1.A03(r0)
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r2)
            X.0zJ r0 = r3.A00
            r0.A06(r3, r1)
            return
        L_0x032b:
            java.lang.Object r4 = r15.A00
            X.2AF r4 = (X.AnonymousClass2AF) r4
            X.1L5 r1 = r4.A05
            X.0sL r0 = r4.A0H
            java.util.Map r0 = r1.A00(r0)
            r4.A06(r0)
            java.util.List r3 = r4.A0M
            X.0sK r2 = r4.A02
            X.0sP r1 = r4.A0B
            X.2Uq r0 = new X.2Uq
            r0.<init>(r2, r1)
            java.util.Collections.sort(r3, r0)
            X.2OJ r1 = r4.A0I
            X.1kb r0 = X.C34641kb.copyOf((java.util.Collection) r3)
            r1.A09(r0)
            return
        L_0x0352:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.community.CommunityHomeActivity r0 = (com.obwhatsapp.community.CommunityHomeActivity) r0
            X.0uk r2 = r0.A0M
            X.0sL r1 = r0.A0s
            r0 = 0
            r2.A05(r1, r0)
            return
        L_0x035f:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.community.CommunityHomeActivity r0 = (com.obwhatsapp.community.CommunityHomeActivity) r0
            X.2AS r2 = r0.A0O
            X.0sL r5 = r0.A0s
            X.2OJ r1 = r2.A0q
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A09(r0)
            X.0vd r0 = r2.A0e
            X.0ul r4 = r2.A0Z
            X.11A r3 = r2.A0W
            java.lang.String r6 = r2.A07
            X.2Us r1 = new X.2Us
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A06(r1)
            return
        L_0x037f:
            java.lang.Object r0 = r15.A00
            X.2jF r0 = (X.C55292jF) r0
            com.obwhatsapp.community.AddGroupsToCommunityActivity r1 = r0.A00
            r1.Ac1()
            r0 = -1
            r1.setResult(r0)
            r1.finish()
            return
        L_0x0390:
            java.lang.Object r0 = r15.A00
            X.2Uu r0 = (X.C49662Uu) r0
            r0.A0H.setSelectionFromTop(0, 0)
            return
        L_0x0398:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r0 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r0
            r0.A3Y()
            android.os.Handler r2 = r0.A1a
            long r0 = r0.A3M()
            r2.postDelayed(r15, r0)
            return
        L_0x03a9:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r0 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r0
            X.0tb r2 = r0.A01
            com.whatsapp.jid.UserJid r1 = r0.A3N()
            r0 = 2
            r2.A0D(r1, r0)
            return
        L_0x03b8:
            java.lang.Object r1 = r15.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x03c2:
            java.lang.Object r1 = r15.A00
            com.obwhatsapp.camera.overlays.ShutterOverlay r1 = (com.obwhatsapp.camera.overlays.ShutterOverlay) r1
            r0 = 0
            r1.A02 = r0
            r1.invalidate()
            return
        L_0x03cd:
            java.lang.Object r0 = r15.A00
            X.2Qp r0 = (X.C49062Qp) r0
            X.C49062Qp.A03(r0)
            return
        L_0x03d5:
            java.lang.Object r0 = r15.A00
            X.2Qp r0 = (X.C49062Qp) r0
            r0.A07()
            return
        L_0x03dd:
            java.lang.Object r0 = r15.A00
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            r0.forceLayout()
            android.view.View r0 = r0.getRootView()
            r0.requestLayout()
            return
        L_0x03ef:
            java.lang.Object r0 = r15.A00
            X.2V2 r0 = (X.AnonymousClass2V2) r0
            X.1aI r3 = r0.A00
            boolean r0 = r3.A0X()
            if (r0 != 0) goto L_0x046a
            X.2V5 r7 = r3.A0F
            boolean r0 = r3.A0S
            boolean r6 = r3.A0Z()
            r5 = 1
            r7.A07(r5)
            com.obwhatsapp.WaImageView r1 = r7.A0I
            r1.setEnabled(r5)
            if (r0 == 0) goto L_0x0413
            r0 = 8
            r1.sendAccessibilityEvent(r0)
        L_0x0413:
            com.obwhatsapp.WaImageView r4 = r7.A0J
            r4.setEnabled(r5)
            boolean r2 = r7.A0M
            r1 = 0
            r0 = 8
            if (r2 == 0) goto L_0x0420
            r0 = 0
        L_0x0420:
            r4.setVisibility(r0)
            com.obwhatsapp.WaImageView r0 = r7.A0G
            r0.setEnabled(r5)
            r7.A01()
            com.obwhatsapp.WaImageView r0 = r7.A0H
            r0.setVisibility(r1)
            com.obwhatsapp.WaImageView r0 = r7.A0F
            r0.setVisibility(r1)
            r2 = r6 ^ 1
            boolean r0 = r7.A0L
            if (r0 != 0) goto L_0x0444
            android.widget.TextView r1 = r7.A0E
            r0 = 4
            if (r2 == 0) goto L_0x0441
            r0 = 0
        L_0x0441:
            r1.setVisibility(r0)
        L_0x0444:
            X.2V7 r0 = r3.A0G
            com.obwhatsapp.camera.CameraBottomSheetBehavior r0 = r0.A0B
            int r2 = r0.A0B
            r1 = 3
            r0 = 0
            if (r2 != r1) goto L_0x044f
            r0 = 1
        L_0x044f:
            r5 = 0
            if (r0 != 0) goto L_0x0457
            X.2V9 r0 = r3.A0H
            r0.A01(r5)
        L_0x0457:
            X.2V5 r0 = r3.A0F
            r0.A00()
            X.2DG r4 = r3.A0J
            X.1aJ r0 = r3.A0D
            int r2 = r0.A00
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x0467
            r0 = 1
        L_0x0467:
            r4.A01(r0, r5, r5)
        L_0x046a:
            android.view.View r0 = r3.A07
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x048b
            android.view.View r1 = r3.A07
            r0 = 8
            r1.setVisibility(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r1, r0)
            r0 = 400(0x190, double:1.976E-321)
            r2.setDuration(r0)
            android.view.View r0 = r3.A07
            r0.startAnimation(r2)
        L_0x048b:
            X.2VA r1 = r3.A0B
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A00 = r0
            return
        L_0x0492:
            java.lang.Object r0 = r15.A00
            X.2VC r0 = (X.AnonymousClass2VC) r0
            X.1aI r4 = r0.A00
            boolean r0 = r4.A0w
            if (r0 != 0) goto L_0x04b2
            X.2VD r0 = r4.A0I
            com.obwhatsapp.camera.overlays.ShutterOverlay r3 = r0.A04
            r0 = 1
            r3.A02 = r0
            r3.invalidate()
            r0 = 20
            com.facebook.redex.RunnableRunnableShape5S0100000_I0_4 r2 = new com.facebook.redex.RunnableRunnableShape5S0100000_I0_4
            r2.<init>((java.lang.Object) r3, (int) r0)
            r0 = 50
            r3.postDelayed(r2, r0)
        L_0x04b2:
            X.01V r0 = r4.A0k
            X.C41631wI.A02(r0)
            return
        L_0x04b8:
            java.lang.Object r2 = r15.A00
            X.2AN r2 = (X.AnonymousClass2AN) r2
            X.0vQ r0 = r2.A00
            boolean r1 = r0.A00()
            r0 = 8
            if (r1 == 0) goto L_0x04c7
            r0 = 0
        L_0x04c7:
            r2.setVisibility(r0)
            return
        L_0x04cb:
            java.lang.Object r4 = r15.A00
            X.1OK r4 = (X.AnonymousClass1OK) r4
            java.lang.String r0 = "options.wa_call_dummy_size"
            java.lang.Integer r14 = com.whatsapp.voipcalling.Voip.A01(r0)
            r8 = 0
            r7 = 0
            java.lang.String r3 = "voip-time-series-upload-fail"
            if (r14 != 0) goto L_0x04e4
            X.0so r1 = r4.A01
            java.lang.String r0 = ":dummyFileSizeUndefined:"
            r1.AcB(r3, r0, r7)
            return
        L_0x04e4:
            X.0tz r0 = r4.A03
            android.content.Context r0 = r0.A00
            java.io.File r10 = X.C30341cC.A08(r0)
            r2 = 1024(0x400, float:1.435E-42)
            if (r10 != 0) goto L_0x0511
            X.0so r2 = r4.A01
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r0 = r14.intValue()
            int r0 = r0 << 10
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            java.lang.String r0 = ":voipDirectoryError:"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.AcB(r3, r0, r7)
            return
        L_0x0511:
            java.lang.String r0 = "dummy_"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r0)
            r13 = 6
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r9 = 0
        L_0x051f:
            double r5 = java.lang.Math.random()
            r0 = 62
            double r0 = (double) r0
            double r5 = r5 * r0
            int r1 = (int) r5
            java.lang.String r0 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
            char r0 = r0.charAt(r1)
            r11.append(r0)
            int r9 = r9 + 1
            if (r9 < r13) goto L_0x051f
            java.lang.String r0 = r11.toString()
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            java.io.File r5 = new java.io.File
            r5.<init>(r10, r0)
            java.lang.String r0 = "app/VoiceService: putting dummy time series at "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r5.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            byte[] r2 = new byte[r2]
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r0.nextBytes(r2)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0581 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0581 }
        L_0x0569:
            int r0 = r14.intValue()     // Catch:{ all -> 0x057c }
            if (r7 >= r0) goto L_0x0575
            r1.write(r2)     // Catch:{ all -> 0x057c }
            int r7 = r7 + 1
            goto L_0x0569
        L_0x0575:
            r1.close()     // Catch:{ IOException -> 0x0581 }
            r4.A03(r8, r5)
            return
        L_0x057c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0580 }
        L_0x0580:
            throw r0     // Catch:{ IOException -> 0x0581 }
        L_0x0581:
            r1 = move-exception
            java.lang.String r0 = "app/VoiceService: could not create dummy time series"
            com.whatsapp.util.Log.w(r0, r1)
            X.0so r2 = r4.A01
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r0 = r14.intValue()
            int r0 = r0 << 10
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            java.lang.String r0 = ":fileCreationError:"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = 1
            r2.AcB(r3, r1, r0)
            return
        L_0x05a9:
            java.lang.Object r0 = r15.A00
            X.11A r0 = (X.AnonymousClass11A) r0
            r0.A04()
            return
        L_0x05b1:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.calling.service.VoiceService$VoiceServiceEventCallback r0 = (com.obwhatsapp.calling.service.VoiceService$VoiceServiceEventCallback) r0
            r0.lambda$linkCreateNacked$2()
            return
        L_0x05b9:
            java.lang.Object r0 = r15.A00
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            com.whatsapp.voipcalling.Voip.cancelInviteToGroupCall(r0)
            return
        L_0x05c1:
            java.lang.Object r0 = r15.A00
            X.25g r0 = (X.C447225g) r0
            short r0 = r0.A15
            com.whatsapp.voipcalling.Voip.adjustAudioLevel(r0)
            return
        L_0x05cb:
            java.lang.Object r2 = r15.A00
            X.26g r2 = (X.C449226g) r2
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            com.obwhatsapp.TextEmojiLabel r0 = r2.A00
            r0.getGlobalVisibleRect(r3)
            com.obwhatsapp.WaTextView r2 = r2.A01
            r2.getGlobalVisibleRect(r1)
            boolean r1 = r3.intersect(r1)
            r0 = 0
            if (r1 == 0) goto L_0x05ec
            r0 = 8
        L_0x05ec:
            r2.setVisibility(r0)
            return
        L_0x05f0:
            java.lang.Object r0 = r15.A00
            X.26G r0 = (X.AnonymousClass26G) r0
            r0.A08()
            r0.A09()
            return
        L_0x05fb:
            java.lang.Object r1 = r15.A00
            com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r1 = (com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2) r1
            X.26f r0 = r1.A0N
            r0.A02(r1)
            return
        L_0x0605:
            java.lang.Object r3 = r15.A00
            com.obwhatsapp.calling.callhistory.CallsHistoryFragment r3 = (com.obwhatsapp.calling.callhistory.CallsHistoryFragment) r3
            X.1fq r0 = r3.A0B
            r0.notifyDataSetChanged()
            android.view.View r2 = r3.A02
            java.util.ArrayList r0 = r3.A0g
            boolean r1 = r0.isEmpty()
            r0 = 8
            if (r1 == 0) goto L_0x061b
            r0 = 0
        L_0x061b:
            r2.setVisibility(r0)
            r3.A1I()
            return
        L_0x0622:
            long r0 = r3.A0H     // Catch:{ all -> 0x0677 }
            monitor-exit(r3)
            r2.A01 = r0
            X.0uk r6 = r2.A0J
            X.0rx r3 = r2.A04
            X.0t3 r0 = r6.A05
            long r4 = r0.A00()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r0
            monitor-enter(r3)
            r3.A0H = r4     // Catch:{ all -> 0x0677 }
            monitor-exit(r3)
            X.15m r0 = r6.A07
            r0.A00(r3)
            X.0pt r2 = r6.A00
            r1 = 5
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r6, r1, r3)
            r2.A0K(r0)
            return
        L_0x0649:
            long r9 = r3.A0L     // Catch:{ all -> 0x0677 }
            monitor-exit(r3)
            long r11 = java.lang.System.currentTimeMillis()
            android.database.Cursor r3 = r5.A0A(r6, r7, r9, r11)
            if (r3 != 0) goto L_0x0657
            return
        L_0x0657:
            boolean r2 = r3.moveToNext()     // Catch:{ all -> 0x0672 }
            if (r2 == 0) goto L_0x0665
            X.0tZ r2 = r5.A0G(r3, r6)     // Catch:{ all -> 0x0672 }
            r4.A0A(r2, r0)     // Catch:{ all -> 0x0672 }
            goto L_0x0657
        L_0x0665:
            r3.close()
            X.0th r2 = r5.A0K
            X.0tZ r2 = r2.A00(r9)
            r4.A0A(r2, r0)
            return
        L_0x0672:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0676 }
        L_0x0676:
            throw r0
        L_0x0677:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape5S0100000_I0_4.run():void");
    }
}

package com.facebook.redex;

import X.AnonymousClass023;

public class IDxObserverShape36S0200000_2_I0 implements AnonymousClass023 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxObserverShape36S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x020a, code lost:
        if (r1.A05 == null) goto L_0x020c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AOH(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A02
            switch(r0) {
                case 0: goto L_0x01f9;
                case 1: goto L_0x01a6;
                case 2: goto L_0x0101;
                case 3: goto L_0x00cf;
                case 4: goto L_0x00bc;
                case 5: goto L_0x00a9;
                case 6: goto L_0x0063;
                case 7: goto L_0x0198;
                case 8: goto L_0x0136;
                case 9: goto L_0x002e;
                case 10: goto L_0x0018;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r11.A00
            X.2ku r3 = (X.C56072ku) r3
            java.lang.Object r2 = r11.A01
            X.028 r2 = (X.AnonymousClass028) r2
            X.2WZ r12 = (X.AnonymousClass2WZ) r12
            int r1 = r12.A00
            r0 = 5
            if (r1 == r0) goto L_0x0132
            r3.A05(r12)
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r0 = r11.A00
            X.1cy r0 = (X.C30801cy) r0
            java.lang.Object r3 = r11.A01
            X.023 r3 = (X.AnonymousClass023) r3
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.A00
            r1 = 1
            r0 = 0
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x0017
            r3.AOH(r12)
            return
        L_0x002e:
            java.lang.Object r1 = r11.A00
            com.obwhatsapp.search.SearchViewModel r1 = (com.obwhatsapp.search.SearchViewModel) r1
            java.lang.Object r5 = r11.A01
            X.07u r5 = (X.C016407u) r5
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x003c
            java.lang.String r12 = ""
        L_0x003c:
            java.lang.String r0 = r1.A0D()
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0017
            X.2cV r4 = r1.A0O
            r3 = 3
            int r0 = r1.A06()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            com.whatsapp.jid.UserJid r1 = r1.A09()
            X.2cW r0 = new X.2cW
            r0.<init>(r1, r2, r12, r3)
            r4.A00(r0)
            java.lang.String r0 = "query_text"
            r5.A06(r0, r12)
            return
        L_0x0063:
            java.lang.Object r2 = r11.A00
            X.2OT r2 = (X.AnonymousClass2OT) r2
            java.lang.Object r4 = r11.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0017
            X.0pt r0 = r2.A01
            r0.A05()
            X.0sP r1 = r2.A04
            X.0sL r0 = r2.A08
            java.lang.String r0 = r1.A0J(r0)
            if (r0 != 0) goto L_0x009d
            r0 = 2131888266(0x7f12088a, float:1.9411162E38)
            java.lang.String r3 = r4.getString(r0)
        L_0x0089:
            X.0zJ r2 = r2.A00
            android.content.Intent r1 = X.C14750ph.A02(r4)
            java.lang.String r0 = "snackbar_message"
            r1.putExtra(r0, r3)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1.setFlags(r0)
            r2.A06(r4, r1)
            return
        L_0x009d:
            r1 = 2131888265(0x7f120889, float:1.941116E38)
            java.lang.Object[] r0 = X.AnonymousClass000.A1a(r0)
            java.lang.String r3 = r4.getString(r1, r0)
            goto L_0x0089
        L_0x00a9:
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.group.GroupChatInfoActivity r0 = (com.obwhatsapp.group.GroupChatInfoActivity) r0
            java.lang.Object r2 = r11.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.4Rt r0 = r0.A0W
            if (r0 == 0) goto L_0x0017
            r1 = 0
            X.39X r0 = r0.A05
            r0.A01(r2, r1)
            return
        L_0x00bc:
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.group.GroupChatInfoActivity r0 = (com.obwhatsapp.group.GroupChatInfoActivity) r0
            java.lang.Object r2 = r11.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.4Rt r0 = r0.A0W
            if (r0 == 0) goto L_0x0017
            r1 = 0
            X.39X r0 = r0.A05
            r0.A00(r2, r1)
            return
        L_0x00cf:
            java.lang.Object r4 = r11.A00
            X.2DF r4 = (X.AnonymousClass2DF) r4
            java.lang.Object r1 = r11.A01
            com.obwhatsapp.reactions.ReactionsTrayViewModel r1 = (com.obwhatsapp.reactions.ReactionsTrayViewModel) r1
            X.2kw r12 = (X.C56082kw) r12
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x0017
            X.0tZ r3 = r1.A02
            X.AnonymousClass00B.A06(r3)
            r4.Agy(r3)
            java.lang.String r0 = r12.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = r0 ^ 1
            X.0tb r1 = r4.A03
            java.lang.String r0 = r12.A00
            boolean r0 = r1.A0X(r3, r0, r2)
            if (r0 != 0) goto L_0x0017
            X.1yT r1 = r4.A0G
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass29T.A01(r1, r0)
            return
        L_0x0101:
            java.lang.Object r3 = r11.A00
            com.obwhatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity r3 = (com.obwhatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity) r3
            java.lang.Object r4 = r11.A01
            android.view.View r4 = (android.view.View) r4
            int r2 = X.AnonymousClass000.A0D(r12)
            if (r2 == 0) goto L_0x0236
            r0 = 1
            r1 = 8
            if (r2 == r0) goto L_0x0229
            r0 = 2
            if (r2 == r0) goto L_0x0211
            r0 = 3
            if (r2 != r0) goto L_0x0017
            r4.setVisibility(r1)
            android.widget.ListView r1 = r3.ADA()
            int r0 = r1.getFooterViewsCount()
            if (r0 != 0) goto L_0x012c
            android.view.View r0 = r3.A02
            r1.addFooterView(r0)
        L_0x012c:
            android.view.View r0 = r3.A03
            r1.removeHeaderView(r0)
            return
        L_0x0132:
            r2.A0B(r12)
            return
        L_0x0136:
            java.lang.Object r6 = r11.A00
            com.obwhatsapp.reactions.ReactionsBottomSheetDialogFragment r6 = (com.obwhatsapp.reactions.ReactionsBottomSheetDialogFragment) r6
            java.lang.Object r2 = r11.A01
            android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2
            java.util.List r12 = (java.util.List) r12
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x014a
            r6.A1D()
            return
        L_0x014a:
            r5 = 0
            X.013 r10 = r6.A0D
            int r8 = r12.size()
            android.content.Context r9 = r2.getContext()
            r1 = 2131559663(0x7f0d04ef, float:1.8744676E38)
            r0 = 0
            android.view.View r7 = r2.inflate(r1, r0)
            r0 = 2131365654(0x7f0a0f16, float:1.835118E38)
            android.widget.TextView r4 = X.C13680ns.A0L(r7, r0)
            android.content.res.Resources r3 = r9.getResources()
            r2 = 2131755298(0x7f100122, float:1.9141471E38)
            java.lang.Object[] r1 = X.C13680ns.A1b()
            java.lang.String r0 = X.C56092kx.A02(r9, r10, r8)
            r1[r5] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r8, r1)
            r4.setText(r0)
            java.lang.String r3 = X.C56092kx.A02(r9, r10, r8)
            android.content.res.Resources r2 = r9.getResources()
            r1 = 2131755296(0x7f100120, float:1.9141467E38)
            java.lang.Object[] r0 = X.C13680ns.A1b()
            r0[r5] = r3
            java.lang.String r0 = r2.getQuantityString(r1, r8, r0)
            r7.setContentDescription(r0)
            r6.A1N(r7, r5)
            return
        L_0x0198:
            java.lang.Object r2 = r11.A00
            X.2X2 r2 = (X.AnonymousClass2X2) r2
            java.lang.Object r1 = r11.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "chat"
            r2.A00(r1, r0)
            return
        L_0x01a6:
            java.lang.Object r6 = r11.A00
            com.obwhatsapp.community.CommunitySubgroupsBottomSheet r6 = (com.obwhatsapp.community.CommunitySubgroupsBottomSheet) r6
            java.lang.Object r1 = r11.A01
            X.0sL r1 = (X.C16050sL) r1
            java.util.List r12 = (java.util.List) r12
            java.util.HashSet r5 = X.C13680ns.A0o()
            X.0uk r0 = r6.A0A
            boolean r0 = r0.A0C(r1)
            r4 = 0
            if (r0 == 0) goto L_0x01c6
            r1 = 0
            X.2ky r0 = new X.2ky
            r0.<init>(r1, r4)
            r5.add(r0)
        L_0x01c6:
            java.util.Iterator r3 = r12.iterator()
        L_0x01ca:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01ea
            java.lang.Object r2 = r3.next()
            X.1sW r2 = (X.C39461sW) r2
            X.0sO r1 = r6.A0P
            com.whatsapp.jid.GroupJid r0 = r2.A02
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x01ca
            r1 = 1
            X.2ky r0 = new X.2ky
            r0.<init>(r1, r2)
            r5.add(r0)
            goto L_0x01ca
        L_0x01ea:
            r1 = 2
            X.2ky r0 = new X.2ky
            r0.<init>(r1, r4)
            r5.add(r0)
            X.09i r0 = r6.A00
            r0.A04(r5)
            return
        L_0x01f9:
            java.lang.Object r1 = r11.A00
            X.2SL r1 = (X.AnonymousClass2SL) r1
            java.lang.Object r2 = r11.A01
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            boolean r0 = X.AnonymousClass000.A1X(r12)
            if (r0 == 0) goto L_0x020c
            java.lang.String r1 = r1.A05
            r0 = 1
            if (r1 != 0) goto L_0x020d
        L_0x020c:
            r0 = 0
        L_0x020d:
            r2.setVisible(r0)
            return
        L_0x0211:
            r4.setVisibility(r1)
            android.widget.ListView r1 = r3.ADA()
            int r0 = r1.getHeaderViewsCount()
            if (r0 != 0) goto L_0x0223
            android.view.View r0 = r3.A03
            r1.addHeaderView(r0)
        L_0x0223:
            android.view.View r0 = r3.A02
            r1.removeFooterView(r0)
            return
        L_0x0229:
            r4.setVisibility(r1)
            X.19Y r0 = r3.A0B
            boolean r0 = r0.A00()
            r3.A38(r0)
            return
        L_0x0236:
            r0 = 0
            r4.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObserverShape36S0200000_2_I0.AOH(java.lang.Object):void");
    }
}

package com.whatsapp.util;

import X.C34331k5;

public class ViewOnClickCListenerShape1S0300000_I1 extends C34331k5 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public ViewOnClickCListenerShape1S0300000_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A03
            switch(r0) {
                case 0: goto L_0x0165;
                case 1: goto L_0x0015;
                case 2: goto L_0x017e;
                case 3: goto L_0x0038;
                case 4: goto L_0x009b;
                case 5: goto L_0x0199;
                case 6: goto L_0x01be;
                case 7: goto L_0x00ed;
                case 8: goto L_0x01e4;
                case 9: goto L_0x012a;
                case 10: goto L_0x0214;
                case 11: goto L_0x0232;
                case 12: goto L_0x0266;
                case 13: goto L_0x02d6;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r10.A02
            X.2hd r2 = (X.C54502hd) r2
            X.2BF r1 = r2.A05
            if (r1 == 0) goto L_0x0014
            java.lang.Object r0 = r10.A01
            com.obwhatsapp.gallery.MediaGalleryFragmentBase r0 = (com.obwhatsapp.gallery.MediaGalleryFragmentBase) r0
            r0.A1H(r1, r2)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r0 = r10.A00
            X.02k r0 = (X.C005602k) r0
            int r1 = r0.A00()
            r0 = -1
            if (r1 == r0) goto L_0x0014
            java.lang.Object r0 = r10.A02
            X.2W7 r0 = (X.AnonymousClass2W7) r0
            X.2W8 r0 = r0.ABo(r1)
            X.2Xx r0 = (X.C50092Xx) r0
            X.2Xy r0 = r0.A00
            java.lang.Object r1 = r10.A01
            com.obwhatsapp.biz.cart.view.fragment.CartFragment r1 = (com.obwhatsapp.biz.cart.view.fragment.CartFragment) r1
            X.1mM r0 = r0.A01
            java.lang.String r0 = r0.A0D
            r1.A1Q(r0)
            return
        L_0x0038:
            java.lang.Object r0 = r10.A00
            X.02k r0 = (X.C005602k) r0
            int r1 = r0.A00()
            r0 = -1
            if (r1 == r0) goto L_0x0014
            java.lang.Object r0 = r10.A01
            X.2W7 r0 = (X.AnonymousClass2W7) r0
            X.2W8 r0 = r0.ABo(r1)
            X.3kE r0 = (X.C71353kE) r0
            X.1mJ r0 = r0.A00
            java.lang.Object r3 = r10.A02
            com.obwhatsapp.biz.order.view.fragment.OrderDetailFragment r3 = (com.obwhatsapp.biz.order.view.fragment.OrderDetailFragment) r3
            java.lang.String r6 = r0.A06
            X.0ue r2 = r3.A06
            X.1eG r1 = X.C17170ue.A00(r2)
            X.0ue r0 = r3.A06
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A09
            int r0 = r0.getAndIncrement()
            java.lang.Long r0 = X.C13690nt.A0W(r0)
            r1.A08 = r0
            r0 = 39
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05 = r0
            r0 = 46
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
            r1.A0D = r6
            com.whatsapp.jid.UserJid r0 = r3.A0L
            r1.A00 = r0
            java.lang.String r0 = r3.A0R
            r1.A0C = r0
            r2.A03(r1)
            X.3Q2 r0 = r3.A0D
            android.content.Context r1 = r3.A02()
            com.whatsapp.jid.UserJid r3 = r0.A08
            r4 = 0
            r8 = 0
            android.content.Intent r2 = X.C14750ph.A0o(r1, r8)
            r7 = 9
            r5 = r4
            X.C61843Ap.A00(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x009b:
            java.lang.Object r4 = r10.A01
            X.5Rk r4 = (X.C109275Rk) r4
            com.whatsapp.jid.UserJid r3 = r4.ACy()
            int r2 = r4.ACu()
            r1 = 2
            java.lang.Object r0 = r10.A02
            X.4QA r0 = (X.AnonymousClass4QA) r0
            if (r2 != r1) goto L_0x00df
            X.2zL r0 = (X.C59912zL) r0
            android.view.View r1 = r0.A01
            r0 = 2131362889(0x7f0a0449, float:1.8345571E38)
            android.view.View r1 = r1.findViewById(r0)
            X.4wc r4 = (X.C101044wc) r4
            X.39v r0 = r4.A00
            java.util.ArrayList r0 = r0.A04
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Object r0 = X.C13690nt.A0Z(r0)
            X.1po r0 = (X.C37831po) r0
            com.whatsapp.jid.GroupJid r0 = r0.A04
            if (r0 == 0) goto L_0x00ea
            r3 = r0
        L_0x00ce:
            r0 = 6
            X.3AW r1 = X.AnonymousClass3AW.A00(r1, r3, r0)
            java.lang.Object r0 = r10.A00
            X.01A r0 = (X.AnonymousClass01A) r0
            X.00l r0 = r0.A0C()
            r1.A02(r0)
            return
        L_0x00df:
            X.2zJ r0 = (X.C59892zJ) r0
            android.view.View r1 = r0.A00
            r0 = 2131362889(0x7f0a0449, float:1.8345571E38)
            android.view.View r1 = r1.findViewById(r0)
        L_0x00ea:
            if (r3 == 0) goto L_0x0014
            goto L_0x00ce
        L_0x00ed:
            java.lang.Object r0 = r10.A01
            X.4Do r0 = (X.C82634Do) r0
            java.lang.Object r3 = r10.A02
            X.0sH r3 = (X.C16010sH) r3
            com.obwhatsapp.community.AddGroupsToCommunityActivity r0 = r0.A00
            X.2qf r2 = r0.A02
            java.lang.Class<X.1WP> r0 = X.AnonymousClass1WP.class
            com.whatsapp.jid.Jid r0 = r3.A08(r0)
            if (r0 == 0) goto L_0x0112
            java.util.Set r1 = r2.A0C
            boolean r0 = r1.remove(r3)
            if (r0 == 0) goto L_0x0014
            X.2OJ r0 = r2.A09
            r0.A09(r1)
        L_0x010e:
            r2.A05()
            return
        L_0x0112:
            java.lang.Class<X.0sN> r0 = X.C16060sN.class
            com.whatsapp.jid.Jid r0 = r3.A08(r0)
            if (r0 == 0) goto L_0x0014
            java.util.Set r0 = r2.A01
            boolean r0 = r0.remove(r3)
            if (r0 == 0) goto L_0x0014
            X.2OJ r1 = r2.A08
            java.util.Set r0 = r2.A01
            r1.A09(r0)
            goto L_0x010e
        L_0x012a:
            java.lang.Object r5 = r10.A00
            X.31K r5 = (X.AnonymousClass31K) r5
            r0 = 1
            com.whatsapp.jid.UserJid[] r1 = new com.whatsapp.jid.UserJid[r0]
            java.lang.Object r0 = r10.A01
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vw r0 = r0.A11
            X.0rv r0 = r0.A00
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)
            r2 = 0
            r1[r2] = r0
            java.util.List r9 = java.util.Arrays.asList(r1)
            java.lang.Object r8 = r10.A02
            X.0sL r8 = (X.C16050sL) r8
            android.content.Context r0 = r5.getContext()
            X.0pN r3 = X.C14550pN.A0t(r0)
            if (r8 == 0) goto L_0x0014
            if (r3 == 0) goto L_0x0014
            X.0wP r0 = r5.A0Z
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0306
            X.0pt r1 = r5.A0J
            r0 = 2131886350(0x7f12010e, float:1.9407276E38)
            r1.A09(r0, r2)
            return
        L_0x0165:
            java.lang.Object r2 = r10.A00
            X.2pZ r2 = (X.C56982pZ) r2
            java.lang.Object r1 = r10.A01
            int[] r1 = (int[]) r1
            X.5Pb r0 = r2.A09
            r0.AXI(r1)
            r2.dismiss()
            java.lang.Object r1 = r10.A02
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            r1.setSelected(r0)
            return
        L_0x017e:
            android.content.Context r3 = r11.getContext()
            java.lang.Object r2 = r10.A02
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            r0 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1
            android.content.Intent r1 = X.C14750ph.A0Z(r3, r2, r1, r0)
            java.lang.Object r0 = r10.A01
            X.0zJ r0 = (X.C19980zJ) r0
            r0.A06(r3, r1)
            return
        L_0x0199:
            r2 = 0
            java.lang.Object r1 = r10.A01
            X.0sH r1 = (X.C16010sH) r1
            java.lang.Class<X.0sL> r0 = X.C16050sL.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)
            X.0rv r0 = (X.C15830rv) r0
            X.3AW r1 = new X.3AW
            r1.<init>((android.view.View) r11, (X.C15830rv) r0, (java.lang.Integer) r2)
            java.lang.Object r0 = r10.A02
            X.4M3 r0 = (X.AnonymousClass4M3) r0
            android.widget.ImageView r0 = r0.A01
            java.lang.String r0 = X.C004601z.A0L(r0)
            r1.A04 = r0
            java.lang.Object r0 = r10.A00
            X.2oQ r0 = (X.C56732oQ) r0
            android.app.Activity r0 = r0.A05
            goto L_0x01e0
        L_0x01be:
            r2 = 0
            java.lang.Object r0 = r10.A01
            X.0sH r0 = (X.C16010sH) r0
            com.whatsapp.jid.Jid r0 = X.C16010sH.A03(r0)
            X.0rv r0 = (X.C15830rv) r0
            X.3AW r1 = new X.3AW
            r1.<init>((android.view.View) r11, (X.C15830rv) r0, (java.lang.Integer) r2)
            java.lang.Object r0 = r10.A02
            X.4M4 r0 = (X.AnonymousClass4M4) r0
            android.widget.ImageView r0 = r0.A00
            java.lang.String r0 = X.C004601z.A0L(r0)
            r1.A04 = r0
            java.lang.Object r0 = r10.A00
            X.2oH r0 = (X.C56652oH) r0
            com.obwhatsapp.chatinfo.ListChatInfoActivity r0 = r0.A00
        L_0x01e0:
            r1.A02(r0)
            return
        L_0x01e4:
            java.lang.Object r4 = r10.A00
            X.30c r4 = (X.C601130c) r4
            X.01Y r1 = r4.A0V
            java.lang.Object r0 = r10.A01
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A0V(r0)
            if (r0 == 0) goto L_0x020c
            X.0pN r3 = r4.A02
            r0 = 3
            com.facebook.redex.IDxUnblockerShape77S0200000_2_I1 r2 = new com.facebook.redex.IDxUnblockerShape77S0200000_2_I1
            r2.<init>(r3, r0, r4)
            r0 = 2131890888(0x7f1212c8, float:1.941648E38)
            java.lang.String r1 = r3.getString(r0)
            r0 = 0
            com.obwhatsapp.blocklist.UnblockDialogFragment r0 = com.obwhatsapp.blocklist.UnblockDialogFragment.A01(r2, r1, r0, r0)
            r3.Afc(r0)
            return
        L_0x020c:
            java.lang.Object r0 = r10.A02
            X.0rv r0 = (X.C15830rv) r0
            X.C601130c.A0c(r4, r0)
            return
        L_0x0214:
            java.lang.Object r0 = r10.A00
            X.1bb r0 = (X.C30011bb) r0
            X.0uW r3 = r0.A0K
            android.content.Context r2 = r0.getContext()
            java.lang.Object r0 = r10.A01
            X.1xL r0 = (X.C42171xL) r0
            java.lang.String r0 = r0.A03
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.Object r0 = r10.A02
            X.1cc r0 = (X.C30581cc) r0
            int r0 = r0.A00
            r3.Acu(r2, r1, r0)
            return
        L_0x0232:
            java.lang.Object r4 = r10.A00
            X.39f r4 = (X.C615139f) r4
            java.lang.Object r1 = r10.A02
            X.0tZ r1 = (X.C16740tZ) r1
            boolean r0 = r1 instanceof X.C30581cc
            if (r0 == 0) goto L_0x0254
            X.1cc r1 = (X.C30581cc) r1
            int r3 = r1.A00
            X.0uW r2 = r4.A04
            android.content.Context r1 = r4.A03
            java.lang.Object r0 = r10.A01
            X.1xL r0 = (X.C42171xL) r0
            java.lang.String r0 = r0.A03
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.Acu(r1, r0, r3)
            return
        L_0x0254:
            X.0uW r2 = r4.A04
            android.content.Context r1 = r4.A03
            java.lang.Object r0 = r10.A01
            X.1xL r0 = (X.C42171xL) r0
            java.lang.String r0 = r0.A03
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.Act(r1, r0)
            return
        L_0x0266:
            java.lang.Object r3 = r10.A00
            X.3pF r3 = (X.C73883pF) r3
            X.0sK r0 = r3.A01
            r0.A0B()
            X.1ZT r5 = r0.A05
            X.AnonymousClass00B.A06(r5)
            X.0sK r0 = r3.A01
            java.lang.String r1 = r0.A07()
            X.1sv r4 = new X.1sv
            r4.<init>()
            X.4SC r0 = r4.A08
            r0.A01 = r1
            java.lang.String r6 = X.C24561Gk.A04(r5)
            r8 = 2
            r7 = 0
            r9 = 1
            r4.A03(r5, r6, r7, r8, r9)
            X.013 r2 = r3.A04
            X.1G1 r1 = r3.A00
            X.25O r0 = new X.25O
            r0.<init>(r1, r2)
            java.lang.String r5 = r0.A00(r4)     // Catch:{ 25G -> 0x02c8 }
            android.content.Context r0 = r3.getContext()     // Catch:{ 25G -> 0x02c8 }
            java.lang.Object r4 = r10.A01     // Catch:{ 25G -> 0x02c8 }
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4     // Catch:{ 25G -> 0x02c8 }
            android.content.Intent r2 = X.C13680ns.A09()     // Catch:{ 25G -> 0x02c8 }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ 25G -> 0x02c8 }
            java.lang.String r0 = "com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity"
            android.content.Intent r2 = r2.setClassName(r1, r0)     // Catch:{ 25G -> 0x02c8 }
            java.lang.String r0 = "edit_mode"
            r2.putExtra(r0, r9)     // Catch:{ 25G -> 0x02c8 }
            java.lang.String r1 = r4.getRawString()     // Catch:{ 25G -> 0x02c8 }
            java.lang.String r0 = "jid"
            r2.putExtra(r0, r1)     // Catch:{ 25G -> 0x02c8 }
            java.lang.String r0 = "vcard"
            r2.putExtra(r0, r5)     // Catch:{ 25G -> 0x02c8 }
            X.C13690nt.A0u(r2, r3)     // Catch:{ 25G -> 0x02c8 }
            goto L_0x02ce
        L_0x02c8:
            r1 = move-exception
            java.lang.String r0 = "ReciprocalShare"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x02ce:
            java.lang.Object r0 = r10.A02
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x02d6:
            java.lang.Object r4 = r10.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r0 = r10.A00
            X.3pG r0 = (X.C73893pG) r0
            X.38l r1 = r0.A01
            java.lang.Object r0 = r10.A02
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)
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
        L_0x0306:
            r1 = 2131889952(0x7f120f20, float:1.9414582E38)
            r0 = 2131891163(0x7f1213db, float:1.9417038E38)
            r3.Afr(r1, r0)
            X.0ul r7 = r5.A1B
            X.11A r6 = r5.A0C
            X.32Q r4 = new X.32Q
            r4.<init>(r5, r6, r7, r8, r9)
            X.1cy r2 = r4.A03
            r1 = 1
            com.facebook.redex.IDxObserverShape23S0300000_1_I1 r0 = new com.facebook.redex.IDxObserverShape23S0300000_1_I1
            r0.<init>(r3, r8, r5, r1)
            r2.A0A(r3, r0)
            X.1cy r2 = r4.A02
            r1 = 3
            com.facebook.redex.IDxObserverShape23S0300000_1_I1 r0 = new com.facebook.redex.IDxObserverShape23S0300000_1_I1
            r0.<init>(r3, r8, r5, r1)
            r2.A0A(r3, r0)
            X.1cy r2 = r4.A01
            r1 = 2
            com.facebook.redex.IDxObserverShape23S0300000_1_I1 r0 = new com.facebook.redex.IDxObserverShape23S0300000_1_I1
            r0.<init>(r3, r8, r5, r1)
            r2.A0A(r3, r0)
            X.1cy r1 = r4.A00
            r0 = 83
            X.C13680ns.A1L(r3, r1, r0)
            X.0vd r0 = r5.A0D
            r0.A04(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ViewOnClickCListenerShape1S0300000_I1.A06(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r1 = (X.C54502hd) r4.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r5) {
        /*
            r4 = this;
            int r0 = r4.A03
            switch(r0) {
                case 4: goto L_0x001f;
                case 14: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onClick(r5)
            return
        L_0x0009:
            java.lang.Object r2 = r4.A01
            com.obwhatsapp.gallery.MediaGalleryFragmentBase r2 = (com.obwhatsapp.gallery.MediaGalleryFragmentBase) r2
            boolean r0 = r2.A1K()
            if (r0 == 0) goto L_0x0005
            java.lang.Object r1 = r4.A02
            X.2hd r1 = (X.C54502hd) r1
            X.2BF r0 = r1.A05
            if (r0 == 0) goto L_0x0005
            r2.A1H(r0, r1)
            return
        L_0x001f:
            java.lang.Object r3 = r4.A00
            com.obwhatsapp.calling.callhistory.CallsHistoryFragment r3 = (com.obwhatsapp.calling.callhistory.CallsHistoryFragment) r3
            X.05J r0 = r3.A03
            if (r0 == 0) goto L_0x0005
            java.lang.Object r2 = r4.A01
            X.5Rk r2 = (X.C109275Rk) r2
            int r1 = r2.ACu()
            r0 = 2
            if (r1 != r0) goto L_0x0005
            X.4wc r2 = (X.C101044wc) r2
            X.39v r1 = r2.A00
            java.lang.Object r0 = r4.A02
            X.4QA r0 = (X.AnonymousClass4QA) r0
            X.2zL r0 = (X.C59912zL) r0
            r3.A1J(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ViewOnClickCListenerShape1S0300000_I1.onClick(android.view.View):void");
    }
}

package com.facebook.redex;

import X.AnonymousClass023;

public class IDxObserverShape34S0200000_1_I0 implements AnonymousClass023 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxObserverShape34S0200000_1_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0099, code lost:
        if (r4.A0O == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00fd, code lost:
        if (r4.A0L == null) goto L_0x00ff;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AOH(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A02
            switch(r0) {
                case 0: goto L_0x0088;
                case 1: goto L_0x00ea;
                case 2: goto L_0x014f;
                case 3: goto L_0x02dd;
                case 4: goto L_0x0388;
                case 5: goto L_0x0418;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r12.A00
            com.obwhatsapp.status.StatusesFragment r5 = (com.obwhatsapp.status.StatusesFragment) r5
            java.lang.Object r4 = r12.A01
            android.widget.ListView r4 = (android.widget.ListView) r4
            boolean r0 = X.AnonymousClass000.A1X(r13)
            if (r0 != 0) goto L_0x0087
            android.view.View r0 = r5.A03
            r6 = 0
            if (r0 != 0) goto L_0x007f
            r5.A19()
            android.widget.ListView r7 = r5.A04
            X.00l r0 = r5.A0D()
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131559790(0x7f0d056e, float:1.8744934E38)
            android.view.View r1 = r1.inflate(r0, r7, r6)
            r5.A03 = r1
            r0 = 2131366587(0x7f0a12bb, float:1.8353072E38)
            android.widget.TextView r8 = X.C13680ns.A0M(r1, r0)
            r2 = 2131891843(0x7f121683, float:1.9418417E38)
            r3 = 1
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 24
            X.AnonymousClass000.A1M(r1, r0, r6)
            java.lang.String r0 = r5.A0K(r2, r1)
            r8.setText(r0)
            android.view.View r1 = r5.A03
            r0 = 2131362567(0x7f0a0307, float:1.8344918E38)
            android.view.View r2 = r1.findViewById(r0)
            r1 = 9
            com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6 r0 = new com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6
            r0.<init>(r5, r1)
            r2.setOnClickListener(r0)
            android.view.View r1 = r5.A03
            r0 = 2131365478(0x7f0a0e66, float:1.8350822E38)
            android.view.View r2 = r1.findViewById(r0)
            r1 = 10
            com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6 r0 = new com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6
            r0.<init>(r5, r1)
            r2.setOnClickListener(r0)
            android.content.Context r0 = r5.A02()
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r0)
            android.view.View r0 = r5.A03
            r1.addView(r0)
            r0 = 0
            r7.addHeaderView(r1, r0, r3)
        L_0x007f:
            android.view.View r0 = r5.A03
            r0.setVisibility(r6)
            r5.A1L(r4)
        L_0x0087:
            return
        L_0x0088:
            java.lang.Object r4 = r12.A00
            X.1fh r4 = (X.C32131fh) r4
            java.lang.Object r2 = r12.A01
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            boolean r0 = X.AnonymousClass000.A1X(r13)
            if (r0 == 0) goto L_0x009b
            java.lang.String r1 = r4.A0O
            r0 = 1
            if (r1 != 0) goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            r2.setVisible(r0)
            boolean r0 = r4.A0Q
            if (r0 != 0) goto L_0x0087
            X.2Kp r0 = r4.A0A
            if (r0 == 0) goto L_0x0087
            r0 = 1
            r4.A0Q = r0
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "source"
            java.io.Serializable r3 = r1.getSerializableExtra(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            X.0ue r2 = r4.A0B
            X.1eG r1 = new X.1eG
            r1.<init>()
            X.2Kp r0 = r4.A0A
            X.C31481eG.A00(r1, r0)
            java.lang.Integer r0 = X.C13690nt.A0T()
            r1.A05 = r0
            r0 = 23
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
            com.whatsapp.jid.UserJid r0 = r4.A0K
            r1.A00 = r0
            r1.A06 = r3
            X.2XA r0 = r4.A06
            X.027 r0 = r0.A00
            java.lang.Object r0 = r0.A01()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1.A01 = r0
            r2.A03(r1)
            r0 = 0
            r4.A0A = r0
            return
        L_0x00ea:
            java.lang.Object r4 = r12.A00
            com.obwhatsapp.biz.catalog.view.activity.ProductListActivity r4 = (com.obwhatsapp.biz.catalog.view.activity.ProductListActivity) r4
            java.lang.Object r2 = r12.A01
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r0 = r13.booleanValue()
            if (r0 == 0) goto L_0x00ff
            java.lang.String r1 = r4.A0L
            r0 = 1
            if (r1 != 0) goto L_0x0100
        L_0x00ff:
            r0 = 0
        L_0x0100:
            r2.setVisible(r0)
            X.2rL r1 = r4.A0D
            java.lang.Boolean r0 = r1.A01
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0112
            r1.A01 = r13
            r1.A01()
        L_0x0112:
            r4.A36()
            boolean r0 = r4.A0P
            if (r0 != 0) goto L_0x0087
            X.2Kp r3 = r4.A09
            if (r3 == 0) goto L_0x0087
            r0 = 1
            r4.A0P = r0
            X.0ue r2 = r4.A0A
            X.1eG r1 = new X.1eG
            r1.<init>()
            X.C31481eG.A00(r1, r3)
            java.lang.Integer r0 = X.C13690nt.A0T()
            r1.A05 = r0
            r0 = 23
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
            com.whatsapp.jid.UserJid r0 = r4.A0H
            r1.A00 = r0
            X.2XA r0 = r4.A08
            X.027 r0 = r0.A00
            java.lang.Object r0 = r0.A01()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r1.A01 = r0
            r2.A03(r1)
            r0 = 0
            r4.A09 = r0
            return
        L_0x014f:
            java.lang.Object r3 = r12.A00
            X.1yj r3 = (X.C42821yj) r3
            java.lang.Object r5 = r12.A01
            X.4NG r5 = (X.AnonymousClass4NG) r5
            X.4KT r13 = (X.AnonymousClass4KT) r13
            boolean r0 = r13.A02
            r6 = 1
            if (r0 == 0) goto L_0x046c
            X.1Ma r4 = r3.A2W
            boolean r1 = r5.A03
            if (r1 == 0) goto L_0x02b8
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x02b8
        L_0x0168:
            java.lang.String r2 = "preview_load_success"
            if (r6 == 0) goto L_0x0172
            java.lang.String r0 = "icebreaker_"
            java.lang.String r2 = X.C18450wi.A06(r0, r2)
        L_0x0172:
            r4.A00(r2)
            X.4OW r2 = r13.A00
            X.AnonymousClass00B.A06(r2)
            X.0zS r8 = r3.A2U
            X.0rv r0 = r3.A33
            com.whatsapp.jid.UserJid r7 = com.whatsapp.jid.UserJid.of(r0)
            X.4KY r0 = r2.A00
            java.lang.String r6 = r0.A00
            r4 = 1
            X.C18450wi.A0H(r6, r4)
            if (r7 == 0) goto L_0x0192
            X.4bp r0 = r8.A00(r7)
            r0.A00 = r6
        L_0x0192:
            X.0zS r8 = r3.A2U
            X.0rv r0 = r3.A33
            com.whatsapp.jid.UserJid r7 = com.whatsapp.jid.UserJid.of(r0)
            r0 = 0
            r6 = 3
            r8.A01(r7, r0, r6)
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0087
            java.lang.String r9 = r2.A06
            if (r9 == 0) goto L_0x02bb
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x02bb
            X.39b r10 = r3.A2S
            boolean r0 = r10.A0F
            if (r0 == 0) goto L_0x0256
            java.util.List r5 = r2.A07
            if (r1 == 0) goto L_0x02b5
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x02b5
        L_0x01bd:
            int r1 = r10.A0I
            r0 = 2
            if (r1 != r0) goto L_0x0268
            X.1Lf r0 = r10.A0S
            X.0pd r2 = r0.A00
            r1 = 2087(0x827, float:2.925E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x01e1
            X.3T3 r0 = r10.A0A
            if (r0 == 0) goto L_0x01e1
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r1 = 6
            com.facebook.redex.IDxLListenerShape145S0100000_2_I1 r0 = new com.facebook.redex.IDxLListenerShape145S0100000_2_I1
            r0.<init>(r10, r1)
            r2.addOnGlobalLayoutListener(r0)
        L_0x01e1:
            X.4Nk r0 = r10.A07
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r0.A05
            android.view.View r1 = r0.A01
            r0 = 8
            r1.setVisibility(r0)
            X.3T3 r1 = r10.A0A
            X.AnonymousClass00B.A04(r1)
            X.4xt r0 = new X.4xt
            r0.<init>(r10)
            r1.setData(r9, r5, r0)
            boolean r0 = r10.A0D
            if (r0 != 0) goto L_0x0237
            r0 = 1
            r10.A0D = r0
            r0 = 0
            r10.A0G = r0
            android.view.ViewGroup r0 = r10.A02
            int r1 = r0.getHeight()
            X.4Nk r0 = r10.A07
            com.obwhatsapp.webpagepreview.WebPagePreviewView r8 = r0.A05
            X.3T3 r11 = r10.A0A
            X.AnonymousClass00B.A04(r11)
            android.view.View r7 = r10.A01
            X.AnonymousClass00B.A04(r7)
            X.4l3 r9 = new X.4l3
            r9.<init>(r10, r11, r1)
            X.3KL r6 = new X.3KL
            r6.<init>(r7, r8, r9, r10, r11)
            android.view.ViewPropertyAnimator r1 = r7.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            r0 = 100
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            android.view.ViewPropertyAnimator r0 = r0.setListener(r6)
            r0.start()
        L_0x0237:
            X.1MU r6 = r10.A0R
            X.0rv r0 = r10.A0B
            java.lang.String r5 = r0.getRawString()
            java.util.Map r2 = r6.A02
            boolean r0 = r2.containsKey(r5)
            if (r0 != 0) goto L_0x0256
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r5, r0)
            r0 = 0
            r6.A00(r0, r5, r4)
        L_0x0256:
            X.0zS r2 = r3.A2U
            X.0rv r0 = r3.A33
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0087
            X.4bp r0 = r2.A00(r0)
            r0.A02 = r1
            return
        L_0x0268:
            com.obwhatsapp.ctwa.icebreaker.ui.IcebreakerBubbleView r7 = r10.A09
            X.AnonymousClass00B.A04(r7)
            r0 = 22
            com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1 r6 = new com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1
            r6.<init>(r10, r0, r2)
            r7.removeAllViews()
            android.view.LayoutInflater r2 = X.C13680ns.A0G(r7)
            r1 = 2131558758(0x7f0d0166, float:1.874284E38)
            r0 = 1
            android.view.View r8 = r2.inflate(r1, r7, r0)
            r0 = 2131364694(0x7f0a0b56, float:1.8349232E38)
            android.widget.TextView r5 = X.C13680ns.A0L(r8, r0)
            r5.setText(r9)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131166268(0x7f07043c, float:1.7946777E38)
            float r0 = r1.getDimension(r0)
            int r0 = (int) r0
            r2 = 0
            if (r4 == 0) goto L_0x029d
            r0 = 0
        L_0x029d:
            r5.setPadding(r2, r2, r2, r0)
            r0 = 2131364064(0x7f0a08e0, float:1.8347955E38)
            android.view.View r1 = X.C004601z.A0E(r8, r0)
            int r0 = X.C13680ns.A02(r4)
            r1.setVisibility(r0)
            r1.setOnClickListener(r6)
            r7.setVisibility(r2)
            goto L_0x0237
        L_0x02b5:
            r4 = 0
            goto L_0x01bd
        L_0x02b8:
            r6 = 0
            goto L_0x0168
        L_0x02bb:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x0087
            X.1Ma r1 = r3.A2W
            java.lang.String r0 = "no_welcome_message"
            r1.A02(r0, r6)
            X.39b r0 = r3.A2S
            X.1MU r2 = r0.A0R
            X.3rm r1 = new X.3rm
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.A03 = r0
            X.0t9 r0 = r2.A01
            r0.A06(r1)
            return
        L_0x02dd:
            java.lang.Object r4 = r12.A00
            X.2OT r4 = (X.AnonymousClass2OT) r4
            java.lang.Object r3 = r12.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Number r13 = (java.lang.Number) r13
            if (r13 == 0) goto L_0x0087
            int r1 = r13.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0370
            r0 = 2
            if (r1 == r0) goto L_0x031e
            r0 = 3
            if (r1 == r0) goto L_0x034c
            r0 = 4
            if (r1 == r0) goto L_0x0306
            r0 = 5
            if (r1 != r0) goto L_0x0087
            X.2AS r0 = r4.A0J
            X.2Uk r0 = r0.A0L
            X.2VO r0 = r0.A03
            X.AnonymousClass2VP.A00(r3, r0)
            return
        L_0x0306:
            android.content.Context r1 = r4.getContext()
            r0 = 2131888262(0x7f120886, float:1.9411154E38)
            java.lang.String r0 = r1.getString(r0)
            X.2T3 r5 = new X.2T3
            r5.<init>()
            r5.A08 = r0
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 62
            goto L_0x0363
        L_0x031e:
            android.content.Context r1 = r4.getContext()
            r0 = 2131888263(0x7f120887, float:1.9411156E38)
            java.lang.String r0 = r1.getString(r0)
            X.2T3 r5 = new X.2T3
            r5.<init>()
            r5.A08 = r0
            r2 = 2131891306(0x7f12146a, float:1.9417328E38)
            r1 = 63
            com.facebook.redex.IDxCListenerShape128S0100000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape128S0100000_2_I1
            r0.<init>(r4, r1)
            r5.A01(r0, r2)
            r0 = 61
            com.facebook.redex.IDxCListenerShape128S0100000_2_I1 r1 = new com.facebook.redex.IDxCListenerShape128S0100000_2_I1
            r1.<init>(r4, r0)
            r0 = 2131886996(0x7f120394, float:1.9408587E38)
            r5.A04 = r0
            r5.A07 = r1
            goto L_0x036b
        L_0x034c:
            android.content.Context r1 = r4.getContext()
            r0 = 2131888264(0x7f120888, float:1.9411158E38)
            java.lang.String r0 = r1.getString(r0)
            X.2T3 r5 = new X.2T3
            r5.<init>()
            r5.A08 = r0
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 64
        L_0x0363:
            com.facebook.redex.IDxCListenerShape128S0100000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape128S0100000_2_I1
            r0.<init>(r4, r1)
            r5.A01(r0, r2)
        L_0x036b:
            androidx.fragment.app.DialogFragment r2 = r5.A00()
            goto L_0x037a
        L_0x0370:
            java.util.List r1 = r4.A0B
            if (r1 == 0) goto L_0x0087
            X.0sL r0 = r4.A08
            com.obwhatsapp.community.CommunityExitDialogFragment r2 = com.obwhatsapp.community.CommunityExitDialogFragment.A01(r0, r1)
        L_0x037a:
            android.app.Activity r1 = X.C19980zJ.A00(r3)
            X.0pN r1 = (X.C14550pN) r1
            java.lang.String r0 = r13.toString()
            r1.Afb(r2, r0)
            return
        L_0x0388:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.reactions.ReactionsBottomSheetDialogFragment r2 = (com.obwhatsapp.reactions.ReactionsBottomSheetDialogFragment) r2
            java.lang.Object r0 = r12.A01
            X.2kM r0 = (X.C55782kM) r0
            int r1 = r0.A00
            com.obwhatsapp.WaTabLayout r3 = r2.A05
            java.util.ArrayList r0 = r3.A0c
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0087
            if (r1 < 0) goto L_0x0087
            java.util.ArrayList r4 = r3.A0c
            int r0 = r4.size()
            if (r1 >= r0) goto L_0x0087
            r5 = 0
            int r6 = r3.A0I(r1, r5)
            X.2Kr r0 = r3.A0O
            if (r0 == 0) goto L_0x03fc
            int r7 = r0.A00
        L_0x03b1:
            X.2oy r0 = r3.A0a
            android.view.View r1 = r0.getChildAt(r6)
            X.2Ks r1 = (X.C47822Ks) r1
            r0.removeViewAt(r6)
            if (r1 == 0) goto L_0x03ca
            r0 = 0
            r1.setTab(r0)
            r1.setSelected(r5)
            X.0lK r0 = r3.A0Z
            r0.Abi(r1)
        L_0x03ca:
            r3.requestLayout()
            java.lang.Object r2 = r4.remove(r6)
            X.2Kr r2 = (X.C47812Kr) r2
            if (r2 == 0) goto L_0x03ea
            r1 = 0
            r2.A03 = r1
            r2.A02 = r1
            r2.A06 = r1
            r2.A05 = r1
            r2.A04 = r1
            r0 = -1
            r2.A00 = r0
            r2.A01 = r1
            X.0lK r0 = com.google.android.material.tabs.TabLayout.A0d
            r0.Abi(r2)
        L_0x03ea:
            int r2 = r4.size()
            r1 = r6
        L_0x03ef:
            if (r1 >= r2) goto L_0x03fe
            java.lang.Object r0 = r4.get(r1)
            X.2Kr r0 = (X.C47812Kr) r0
            r0.A00 = r1
            int r1 = r1 + 1
            goto L_0x03ef
        L_0x03fc:
            r7 = 0
            goto L_0x03b1
        L_0x03fe:
            if (r7 != r6) goto L_0x0087
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0413
            int r0 = r6 + -1
            int r0 = java.lang.Math.max(r5, r0)
            java.lang.Object r1 = r4.get(r0)
            X.2Kr r1 = (X.C47812Kr) r1
        L_0x0413:
            r0 = 1
            r3.A0G(r1, r0)
            return
        L_0x0418:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.search.SearchFragment r0 = (com.obwhatsapp.search.SearchFragment) r0
            java.lang.Object r5 = r12.A01
            X.2AU r5 = (X.AnonymousClass2AU) r5
            java.util.Map r13 = (java.util.Map) r13
            com.obwhatsapp.status.viewmodels.StatusesViewModel r0 = r0.A1S
            java.util.Set r1 = r0.A0G
            monitor-enter(r1)
            java.util.ArrayList r0 = X.C13680ns.A0n(r1)     // Catch:{ all -> 0x04b3 }
            r1.clear()     // Catch:{ all -> 0x04b3 }
            monitor-exit(r1)     // Catch:{ all -> 0x04b3 }
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r0)
            r5.A03 = r13
            r3 = 0
        L_0x0437:
            X.2UX r1 = r5.A0t
            int r0 = r1.size()
            if (r3 >= r0) goto L_0x0087
            java.lang.Object r2 = r1.get(r3)
            X.2UZ r2 = (X.AnonymousClass2UZ) r2
            int r1 = r2.A00
            r0 = 3
            if (r1 != r0) goto L_0x0462
            java.lang.Object r1 = r2.A01
            boolean r0 = r1 instanceof X.C16010sH
            if (r0 == 0) goto L_0x045f
            X.0sH r1 = (X.C16010sH) r1
            X.0rv r1 = r1.A0E
        L_0x0454:
            if (r1 == 0) goto L_0x045f
            boolean r0 = r4.contains(r1)
            if (r0 == 0) goto L_0x045f
            r5.A02(r3)
        L_0x045f:
            int r3 = r3 + 1
            goto L_0x0437
        L_0x0462:
            r0 = 2
            if (r1 != r0) goto L_0x045f
            java.lang.Object r1 = r2.A01
            boolean r0 = r1 instanceof X.AnonymousClass1ZT
            if (r0 == 0) goto L_0x045f
            goto L_0x0454
        L_0x046c:
            r3.A0H()
            X.0zS r4 = r3.A2U
            X.0rv r0 = r3.A33
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.of(r0)
            r1 = 0
            r0 = 12
            r4.A01(r2, r1, r0)
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0495
            X.39b r0 = r3.A2S
            X.1MU r2 = r0.A0R
            X.3rm r1 = new X.3rm
            r1.<init>()
            java.lang.Integer r0 = X.C13680ns.A0X()
            r1.A03 = r0
            X.0t9 r0 = r2.A01
            r0.A06(r1)
        L_0x0495:
            X.1Ma r4 = r3.A2W
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x049c
            r6 = 0
        L_0x049c:
            java.lang.String r3 = "preview_load_fail"
            r2 = 1029386189(0x3d5b2fcd, float:0.053512383)
            r1 = 3
            if (r6 == 0) goto L_0x04aa
            java.lang.String r0 = "icebreaker_"
            java.lang.String r3 = X.C18450wi.A06(r0, r3)
        L_0x04aa:
            r4.A02(r3, r1)
            X.17S r0 = r4.A01
            r0.AL5(r2, r3)
            return
        L_0x04b3:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x04b3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObserverShape34S0200000_1_I0.AOH(java.lang.Object):void");
    }
}

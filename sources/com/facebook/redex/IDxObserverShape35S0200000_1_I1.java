package com.facebook.redex;

import X.AnonymousClass023;

public class IDxObserverShape35S0200000_1_I1 implements AnonymousClass023 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxObserverShape35S0200000_1_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003f, code lost:
        if (r1 != 2) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AOH(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A02
            java.lang.Object r4 = r9.A00
            com.obwhatsapp.community.CommunityMembersActivity r4 = (com.obwhatsapp.community.CommunityMembersActivity) r4
            if (r0 == 0) goto L_0x0149
            java.lang.Object r2 = r9.A01
            X.0rv r2 = (X.C15830rv) r2
            X.46N r10 = (X.AnonymousClass46N) r10
            r4.Ac1()
            boolean r0 = r10 instanceof X.C73473oB
            if (r0 == 0) goto L_0x00f0
            X.3oB r10 = (X.C73473oB) r10
            X.0sG r1 = r4.A07
            com.whatsapp.jid.UserJid r0 = r10.A00
            X.0sH r8 = r1.A0A(r0)
            X.0sG r0 = r4.A07
            X.0sH r5 = r0.A0A(r2)
            X.2AF r0 = r4.A05
            X.027 r0 = r0.A01
            java.lang.Object r0 = r0.A01()
            if (r0 == 0) goto L_0x0041
            X.2AF r0 = r4.A05
            X.027 r0 = r0.A01
            java.lang.Object r0 = r0.A01()
            X.4Uu r0 = (X.C86954Uu) r0
            int r1 = r0.A01
            r0 = 2
            r3 = 2131891200(0x7f121400, float:1.9417113E38)
            if (r1 == r0) goto L_0x0044
        L_0x0041:
            r3 = 2131891198(0x7f1213fe, float:1.941711E38)
        L_0x0044:
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            X.0sP r0 = r4.A08
            java.lang.String r1 = r0.A0C(r8)
            r0 = 0
            r2[r0] = r1
            X.0sP r0 = r4.A08
            java.lang.String r1 = r0.A08(r5)
            r0 = 1
            r2[r0] = r1
            X.0uj r1 = r4.A0G
            java.lang.String r0 = "507914914497920"
            android.net.Uri r1 = r1.A03(r0)
            r0 = 2
            java.lang.String r1 = X.C13680ns.A0d(r4, r1, r2, r0, r3)
            X.0uY r0 = r4.A0J
            android.text.SpannableString r3 = r0.A04(r1)
            r1 = 2131558952(0x7f0d0228, float:1.8743234E38)
            r0 = 0
            android.view.View r7 = android.view.View.inflate(r4, r1, r0)
            r0 = 2131363195(0x7f0a057b, float:1.8346192E38)
            com.obwhatsapp.TextEmojiLabel r2 = X.C13680ns.A0Q(r7, r0)
            r2.setText(r3)
            X.3MF r0 = new X.3MF
            r0.<init>()
            r2.A07 = r0
            r2.setMovementMethod(r0)
            X.01V r0 = r4.A08
            X.C30531cW.A03(r2, r0)
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L_0x00a4
            r0 = 38
            X.C34331k5.A01(r2, r4, r0)
        L_0x00a4:
            X.1fu r6 = X.C32241fu.A00(r4)
            r2 = 2131891172(0x7f1213e4, float:1.9417057E38)
            r1 = 67
            com.facebook.redex.IDxObserverShape116S0100000_2_I1 r0 = new com.facebook.redex.IDxObserverShape116S0100000_2_I1
            r0.<init>(r10, r1)
            r6.A0F(r4, r0, r2)
            r2 = 2131886996(0x7f120394, float:1.9408587E38)
            r1 = 66
            com.facebook.redex.IDxObserverShape116S0100000_2_I1 r0 = new com.facebook.redex.IDxObserverShape116S0100000_2_I1
            r0.<init>(r10, r1)
            r6.A0E(r4, r0, r2)
            r1 = 68
            com.facebook.redex.IDxObserverShape116S0100000_2_I1 r0 = new com.facebook.redex.IDxObserverShape116S0100000_2_I1
            r0.<init>(r10, r1)
            r6.A0D(r4, r0)
            android.content.res.Resources r5 = r4.getResources()
            r3 = 2131891199(0x7f1213ff, float:1.9417111E38)
            java.lang.Object[] r2 = X.C13680ns.A1b()
            r1 = 0
            X.0sP r0 = r4.A08
            java.lang.String r0 = r0.A0C(r8)
            java.lang.String r0 = X.C13700nu.A0F(r5, r0, r2, r1, r3)
            r6.setTitle(r0)
            r6.setView(r7)
            X.02l r0 = r6.create()
        L_0x00ec:
            r0.show()
        L_0x00ef:
            return
        L_0x00f0:
            boolean r0 = r10 instanceof X.C73493oD
            if (r0 == 0) goto L_0x00fe
            r1 = 2131889954(0x7f120f22, float:1.9414586E38)
            r0 = 2131891163(0x7f1213db, float:1.9417038E38)
            r4.Afr(r1, r0)
            return
        L_0x00fe:
            boolean r0 = r10 instanceof X.C73453o9
            if (r0 == 0) goto L_0x011c
            X.3o9 r10 = (X.C73453o9) r10
            X.0pt r2 = r4.A05
            boolean r0 = X.C18260wP.A02(r4)
            r1 = 2131889602(0x7f120dc2, float:1.9413872E38)
            if (r0 == 0) goto L_0x0112
            r1 = 2131889603(0x7f120dc3, float:1.9413874E38)
        L_0x0112:
            r0 = 0
            r2.A09(r1, r0)
            X.1DU r0 = r10.A00
            r0.AIT()
            return
        L_0x011c:
            boolean r0 = r10 instanceof X.C73463oA
            if (r0 == 0) goto L_0x00ef
            X.1fu r3 = X.C32241fu.A00(r4)
            r2 = 2131891306(0x7f12146a, float:1.9417328E38)
            r1 = 64
            com.facebook.redex.IDxObserverShape116S0100000_2_I1 r0 = new com.facebook.redex.IDxObserverShape116S0100000_2_I1
            r0.<init>(r10, r1)
            r3.A0F(r4, r0, r2)
            r2 = 2131886996(0x7f120394, float:1.9408587E38)
            r1 = 65
            com.facebook.redex.IDxObserverShape116S0100000_2_I1 r0 = new com.facebook.redex.IDxObserverShape116S0100000_2_I1
            r0.<init>(r10, r1)
            r3.A0E(r4, r0, r2)
            r0 = 2131888222(0x7f12085e, float:1.9411073E38)
            r3.A01(r0)
            X.02l r0 = r3.create()
            goto L_0x00ec
        L_0x0149:
            java.lang.Object r8 = r9.A01
            X.3R6 r8 = (X.AnonymousClass3R6) r8
            X.1kb r10 = (X.C34641kb) r10
            java.lang.String r0 = "load_community_member"
            r4.AKv(r0)
            java.util.List r1 = r8.A0D
            int r0 = r1.size()
            r7 = 0
            if (r0 == 0) goto L_0x016e
            int r1 = r1.size()
            r0 = 1
            if (r1 != r0) goto L_0x0195
            long r5 = r8.A0D(r7)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0195
        L_0x016e:
            java.lang.String r0 = "render_community_member"
            r4.AKw(r0)
            r8.A0E(r10)
            r4.AKv(r0)
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x00ef
            X.2Kc r3 = r4.A01
            int r0 = r10.size()
            java.lang.String r2 = java.lang.Integer.toString(r0)
            java.lang.String r1 = "member_count"
            X.1dR r0 = r3.A01
            r0.A0A(r1, r2, r7)
            r0 = 2
            r4.AL0(r0)
            return
        L_0x0195:
            X.0pt r1 = r4.A05
            java.lang.Runnable r0 = r4.A0K
            r1.A0J(r0)
            r0 = 25
            com.facebook.redex.RunnableRunnableShape13S0200000_I1_1 r3 = new com.facebook.redex.RunnableRunnableShape13S0200000_I1_1
            r3.<init>(r8, r0, r10)
            r4.A0K = r3
            X.0pt r2 = r4.A05
            r0 = 500(0x1f4, double:2.47E-321)
            r2.A0L(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObserverShape35S0200000_1_I1.AOH(java.lang.Object):void");
    }
}

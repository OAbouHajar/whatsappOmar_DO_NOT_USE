package X;

import com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity;

/* renamed from: X.3Es  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62733Es implements AnonymousClass23B {
    public final /* synthetic */ CatalogListActivity A00;

    public /* synthetic */ C62733Es(CatalogListActivity catalogListActivity) {
        this.A00 = catalogListActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ANn(X.C35611mD r8) {
        /*
            r7 = this;
            com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity r4 = r7.A00
            if (r8 == 0) goto L_0x00b1
            boolean r0 = r8.A0K
            if (r0 == 0) goto L_0x00b1
            java.lang.String r5 = r8.A09
            if (r5 == 0) goto L_0x0021
            X.0rz r1 = r4.A09
            com.whatsapp.jid.UserJid r0 = r4.A0K
            java.lang.String r2 = r0.getRawString()
            android.content.SharedPreferences$Editor r1 = r1.A0K()
            java.lang.String r0 = "dc_default_postcode_"
            java.lang.String r0 = X.C13680ns.A0h(r0, r2)
            X.C13680ns.A0y(r1, r0, r5)
        L_0x0021:
            X.2qY r2 = r4.A0G
            X.0rz r1 = r2.A0K
            com.whatsapp.jid.UserJid r0 = r2.A0M
            java.lang.String r0 = r0.getRawString()
            java.lang.String r1 = r1.A0R(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00f2
            r1 = r5
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x00f2
            X.027 r0 = r2.A0A
            java.lang.String r1 = ""
        L_0x0040:
            r0.A0B(r1)
            android.view.View r1 = r4.A00
            r0 = 2131362366(0x7f0a023e, float:1.834451E38)
            android.view.View r3 = X.C004601z.A0E(r1, r0)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            X.1fj r2 = r4.A0F
            X.4D6 r1 = new X.4D6
            r1.<init>(r4)
            X.2rQ r0 = new X.2rQ
            r0.<init>(r4, r3, r2, r1)
            r3.A0m(r0)
            X.1fj r2 = r4.A0F
            java.lang.String r0 = r8.A08
            r1 = 1
            if (r5 == 0) goto L_0x0068
            if (r0 == 0) goto L_0x0068
            r2.A01 = r5
        L_0x0068:
            boolean r0 = r2.A04
            if (r0 == r1) goto L_0x0081
            r2.A04 = r1
            java.util.List r0 = r2.A00
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0081
            com.whatsapp.jid.UserJid r0 = r2.A05
            r2.A0P(r0)
            r2.A0L()
            r2.A01()
        L_0x0081:
            r0 = 2131362637(0x7f0a034d, float:1.834506E38)
            android.view.View r2 = r4.findViewById(r0)
            X.013 r1 = r4.A01
            X.25l r0 = new X.25l
            r0.<init>(r2, r1)
            r4.A06 = r0
            X.2qY r1 = r4.A0G
            com.whatsapp.jid.UserJid r0 = r4.A0K
            X.0rz r1 = r1.A0K
            java.lang.String r0 = r0.getRawString()
            java.lang.String r0 = r1.A0R(r0)
            if (r0 != 0) goto L_0x00b1
            X.0pd r2 = r4.A0C
            r1 = 1534(0x5fe, float:2.15E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x00b2
            r0 = 0
            r4.A3A(r0)
        L_0x00b1:
            return
        L_0x00b2:
            X.0rz r0 = r4.A09
            android.content.SharedPreferences r0 = X.C13680ns.A0B(r0)
            java.lang.String r6 = "product_share_tool_tip_show_count"
            r5 = 0
            int r1 = r0.getInt(r6, r5)
            r0 = 5
            if (r1 >= r0) goto L_0x00b1
            X.25l r0 = r4.A06
            if (r0 == 0) goto L_0x00b1
            X.0pt r3 = r4.A05
            r0 = 3
            com.facebook.redex.RunnableRunnableShape4S0100000_I0_3 r2 = new com.facebook.redex.RunnableRunnableShape4S0100000_I0_3
            r2.<init>(r4, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.A0L(r2, r0)
            X.0rz r1 = r4.A09
            android.content.SharedPreferences r0 = X.C13680ns.A0B(r1)
            int r0 = r0.getInt(r6, r5)
            int r0 = r0 + 1
            if (r0 < 0) goto L_0x00f6
            X.C13680ns.A1S(r1, r6, r0)
            X.0pt r3 = r4.A05
            r0 = 2
            com.facebook.redex.RunnableRunnableShape4S0100000_I0_3 r2 = new com.facebook.redex.RunnableRunnableShape4S0100000_I0_3
            r2.<init>(r4, r0)
            r0 = 4500(0x1194, double:2.2233E-320)
            r3.A0L(r2, r0)
            return
        L_0x00f2:
            X.027 r0 = r2.A0A
            goto L_0x0040
        L_0x00f6:
            java.lang.String r0 = "Show count must be greater than or equal to 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62733Es.ANn(X.1mD):void");
    }
}

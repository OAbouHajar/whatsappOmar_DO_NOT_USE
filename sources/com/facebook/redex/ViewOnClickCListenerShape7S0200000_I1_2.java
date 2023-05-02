package com.facebook.redex;

import android.view.View;

public class ViewOnClickCListenerShape7S0200000_I1_2 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public ViewOnClickCListenerShape7S0200000_I1_2(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00db, code lost:
        r1 = r1.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fd, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ff, code lost:
        r1.A01(r2, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0103, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0141, code lost:
        r1.A0Y(false);
        r1.A0W.A0B(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x014a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x016b, code lost:
        r0.A0T(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x016e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            int r0 = r6.A02
            switch(r0) {
                case 0: goto L_0x0104;
                case 1: goto L_0x010f;
                case 2: goto L_0x0118;
                case 3: goto L_0x0123;
                case 4: goto L_0x012e;
                case 5: goto L_0x0139;
                case 6: goto L_0x014b;
                case 7: goto L_0x0156;
                case 8: goto L_0x0161;
                case 9: goto L_0x0013;
                case 10: goto L_0x0042;
                case 11: goto L_0x0078;
                case 12: goto L_0x00af;
                case 13: goto L_0x00be;
                case 14: goto L_0x00de;
                case 15: goto L_0x00cd;
                case 16: goto L_0x00de;
                case 17: goto L_0x00ed;
                case 18: goto L_0x016f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A00
            X.2oE r0 = (X.C56622oE) r0
            java.lang.Object r1 = r6.A01
            X.4Mg r1 = (X.C84884Mg) r1
            com.obwhatsapp.support.faq.SearchFAQ r0 = r0.A00
            r0.A37(r1)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r5 = r6.A00
            com.obwhatsapp.settings.Settings r5 = (com.obwhatsapp.settings.Settings) r5
            java.lang.Object r1 = r6.A01
            com.obwhatsapp.Me r1 = (com.obwhatsapp.Me) r1
            r5.A35()
            X.013 r0 = r5.A01
            java.lang.String r4 = r1.cc
            java.lang.String r3 = r1.number
            java.util.Locale r2 = r0.A05
            java.util.Locale r1 = r0.A04
            X.3AM r0 = new X.3AM
            r0.<init>(r4, r3, r2, r1)
            java.lang.String r2 = r0.A02
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0012
            X.3qS r1 = new X.3qS
            r1.<init>()
            r1.A00 = r2
            X.0t9 r0 = r5.A0N
            r0.A06(r1)
            return
        L_0x0042:
            java.lang.Object r3 = r6.A00
            com.obwhatsapp.settings.SettingsHelpV2 r3 = (com.obwhatsapp.settings.SettingsHelpV2) r3
            java.lang.Object r2 = r6.A01
            X.4NQ r2 = (X.AnonymousClass4NQ) r2
            X.1Aj r1 = r3.A02
            java.lang.String r0 = r2.A02
            android.net.Uri r0 = r1.A00(r0)
            android.content.Intent r1 = X.C13690nt.A0B(r0)
            X.0zJ r0 = r3.A00
            r0.A06(r3, r1)
            X.1DN r5 = r3.A04
            if (r5 == 0) goto L_0x0194
            int r4 = r2.A00
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x0012
            X.13K r3 = r5.A07
            r1 = 0
            r0 = 5
            r3.A00(r4, r1, r0)
            r1 = 22
            com.facebook.redex.RunnableRunnableShape0S0101000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0101000_I0
            r0.<init>((java.lang.Object) r5, (int) r4, (int) r1)
            r5.A05(r0)
            return
        L_0x0078:
            java.lang.Object r0 = r6.A00
            X.3Gw r0 = (X.C63293Gw) r0
            java.lang.Object r4 = r6.A01
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            com.obwhatsapp.status.StatusesFragment r3 = r0.A01
            android.animation.AnimatorSet r0 = r3.A00
            if (r0 != 0) goto L_0x0012
            boolean r0 = r3.A15
            r2 = r0 ^ 1
            r3.A15 = r2
            android.content.res.Resources r1 = r3.A03()
            r0 = 2131231588(0x7f080364, float:1.8079261E38)
            if (r2 == 0) goto L_0x0098
            r0 = 2131231587(0x7f080363, float:1.807926E38)
        L_0x0098:
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r4.setImageDrawable(r0)
            boolean r0 = r3.A15
            if (r0 == 0) goto L_0x019b
            r0 = 13
            com.facebook.redex.IDxLAdapterShape4S0100000_2_I1 r1 = new com.facebook.redex.IDxLAdapterShape4S0100000_2_I1
            r1.<init>(r3, r0)
            r0 = 0
            r3.A1K(r1, r0)
            return
        L_0x00af:
            java.lang.Object r1 = r6.A00
            X.2rG r1 = (X.C57492rG) r1
            java.lang.Object r0 = r6.A01
            X.4aq r0 = (X.C88634aq) r0
            X.3GN r1 = r1.A02
            int r0 = r0.A00
            int r2 = r0 + 3
            goto L_0x00db
        L_0x00be:
            java.lang.Object r1 = r6.A00
            X.2rG r1 = (X.C57492rG) r1
            java.lang.Object r0 = r6.A01
            X.4aq r0 = (X.C88634aq) r0
            X.3GN r1 = r1.A02
            int r0 = r0.A00
            int r2 = r0 + 1
            goto L_0x00db
        L_0x00cd:
            java.lang.Object r1 = r6.A00
            X.2rG r1 = (X.C57492rG) r1
            java.lang.Object r0 = r6.A01
            X.4aq r0 = (X.C88634aq) r0
            X.3GN r1 = r1.A02
            int r0 = r0.A00
            int r2 = r0 + 2
        L_0x00db:
            X.04t r1 = r1.A04
            goto L_0x00fd
        L_0x00de:
            java.lang.Object r0 = r6.A00
            X.2rG r0 = (X.C57492rG) r0
            java.lang.Object r1 = r6.A01
            X.4aq r1 = (X.C88634aq) r1
            X.3GN r0 = r0.A02
            int r2 = r1.A00
            X.04t r1 = r0.A04
            goto L_0x00fd
        L_0x00ed:
            java.lang.Object r0 = r6.A00
            X.2rC r0 = (X.C57452rC) r0
            java.lang.Object r1 = r6.A01
            X.4SV r1 = (X.AnonymousClass4SV) r1
            X.3GM r0 = r0.A01
            int r2 = r1.A00()
            X.04t r1 = r0.A01
        L_0x00fd:
            if (r1 == 0) goto L_0x0012
            r0 = 1
            r1.A01(r2, r0)
            return
        L_0x0104:
            java.lang.Object r0 = r6.A00
            X.3tU r0 = (X.C76173tU) r0
            java.lang.Object r1 = r6.A01
            X.0tZ r1 = (X.C16740tZ) r1
            com.obwhatsapp.search.SearchViewModel r0 = r0.A00
            goto L_0x016b
        L_0x010f:
            java.lang.Object r0 = r6.A00
            X.3tc r0 = (X.C76253tc) r0
            java.lang.Object r2 = r6.A01
            com.obwhatsapp.search.SearchViewModel r1 = r0.A00
            goto L_0x0141
        L_0x0118:
            java.lang.Object r0 = r6.A00
            X.3ta r0 = (X.C76233ta) r0
            java.lang.Object r1 = r6.A01
            X.0tZ r1 = (X.C16740tZ) r1
            com.obwhatsapp.search.SearchViewModel r0 = r0.A02
            goto L_0x016b
        L_0x0123:
            java.lang.Object r0 = r6.A00
            X.3tV r0 = (X.C76183tV) r0
            java.lang.Object r1 = r6.A01
            X.0tZ r1 = (X.C16740tZ) r1
            com.obwhatsapp.search.SearchViewModel r0 = r0.A00
            goto L_0x016b
        L_0x012e:
            java.lang.Object r0 = r6.A00
            X.3tW r0 = (X.C76193tW) r0
            java.lang.Object r1 = r6.A01
            X.0tZ r1 = (X.C16740tZ) r1
            com.obwhatsapp.search.SearchViewModel r0 = r0.A00
            goto L_0x016b
        L_0x0139:
            java.lang.Object r0 = r6.A00
            X.3tW r0 = (X.C76193tW) r0
            java.lang.Object r2 = r6.A01
            com.obwhatsapp.search.SearchViewModel r1 = r0.A00
        L_0x0141:
            r0 = 0
            r1.A0Y(r0)
            X.1cy r0 = r1.A0W
            r0.A0B(r2)
            return
        L_0x014b:
            java.lang.Object r0 = r6.A00
            X.3tX r0 = (X.C76203tX) r0
            java.lang.Object r1 = r6.A01
            X.0tZ r1 = (X.C16740tZ) r1
            com.obwhatsapp.search.SearchViewModel r0 = r0.A00
            goto L_0x016b
        L_0x0156:
            java.lang.Object r0 = r6.A00
            X.3tY r0 = (X.C76213tY) r0
            java.lang.Object r1 = r6.A01
            X.0tZ r1 = (X.C16740tZ) r1
            com.obwhatsapp.search.SearchViewModel r0 = r0.A00
            goto L_0x016b
        L_0x0161:
            java.lang.Object r0 = r6.A00
            X.3tZ r0 = (X.C76223tZ) r0
            java.lang.Object r1 = r6.A01
            X.0tZ r1 = (X.C16740tZ) r1
            com.obwhatsapp.search.SearchViewModel r0 = r0.A00
        L_0x016b:
            r0.A0T(r1)
            return
        L_0x016f:
            java.lang.Object r0 = r6.A00
            X.02k r0 = (X.C005602k) r0
            java.lang.Object r4 = r6.A01
            X.028 r4 = (X.AnonymousClass028) r4
            android.view.View r0 = r0.A0H
            android.content.Context r0 = r0.getContext()
            android.content.Intent r3 = X.C13680ns.A09()
            r2 = 6
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.dmsetting.DisappearingMessagesSettingActivity"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "entry_point"
            r3.putExtra(r0, r2)
            r4.A0B(r3)
            return
        L_0x0194:
            java.lang.String r0 = "noticeBadgeManager"
            java.lang.RuntimeException r0 = X.C18450wi.A03(r0)
            throw r0
        L_0x019b:
            java.util.List r1 = r3.A12
            java.util.List r0 = r3.A13
            r1.addAll(r0)
            X.2Ab r0 = r3.A0i
            r0.notifyDataSetChanged()
            r3.A19()
            android.widget.ListView r0 = r3.A04
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r1 = 4
            com.facebook.redex.IDxDListenerShape191S0100000_2_I1 r0 = new com.facebook.redex.IDxDListenerShape191S0100000_2_I1
            r0.<init>(r3, r1)
            r2.addOnPreDrawListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.ViewOnClickCListenerShape7S0200000_I1_2.onClick(android.view.View):void");
    }
}

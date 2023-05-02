package com.facebook.redex;

import android.view.ViewTreeObserver;

public class IDxLListenerShape145S0100000_2_I1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public final int A01;

    public IDxLListenerShape145S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0141, code lost:
        if ((!r3.A02.canScrollVertically(1)) != false) goto L_0x0143;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x004a;
                case 1: goto L_0x0076;
                case 2: goto L_0x0113;
                case 3: goto L_0x012a;
                case 4: goto L_0x014d;
                case 5: goto L_0x0163;
                case 6: goto L_0x0090;
                case 7: goto L_0x01bc;
                case 8: goto L_0x01c9;
                case 9: goto L_0x00ab;
                case 10: goto L_0x00bf;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r7 = r9.A00
            X.3Cm r7 = (X.C62233Cm) r7
            android.view.View r8 = r7.A01
            int[] r6 = r7.A05
            r8.getLocationOnScreen(r6)
            int[] r5 = r7.A06
            r4 = 0
            r0 = r5[r4]
            r3 = r6[r4]
            r2 = 1
            if (r0 != r3) goto L_0x0020
            r1 = r5[r2]
            r0 = r6[r2]
            if (r1 == r0) goto L_0x0049
        L_0x0020:
            r5[r4] = r3
            r0 = r6[r2]
            r5[r2] = r0
            X.0Pu r1 = r7.A03
            X.0Rr r0 = r1.A05
            r0.A01()
            r1.A00()
            android.view.ViewTreeObserver r0 = r7.A00
            if (r0 != 0) goto L_0x0042
            android.view.ViewTreeObserver r1 = r8.getViewTreeObserver()
            X.AnonymousClass00B.A06(r1)
            r7.A00 = r1
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r7.A02
            r1.addOnGlobalLayoutListener(r0)
        L_0x0042:
            com.obwhatsapp.status.playback.fragment.StatusPlaybackBaseFragment r0 = r7.A04
            r0.A07 = r2
            r0.A1A()
        L_0x0049:
            return
        L_0x004a:
            java.lang.Object r3 = r9.A00
            X.3BH r3 = (X.AnonymousClass3BH) r3
            androidx.viewpager.widget.ViewPager r0 = r3.A0K
            int r2 = r0.getWidth()
            android.content.res.Resources r1 = X.C13680ns.A0D(r0)
            r0 = 2131166043(0x7f07035b, float:1.794632E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 / r0
            int r0 = r3.A01
            if (r0 == r2) goto L_0x0049
            r3.A01 = r2
            X.2oM[] r3 = r3.A0R
            int r2 = r3.length
            r1 = 0
        L_0x006a:
            if (r1 >= r2) goto L_0x0049
            r0 = r3[r1]
            if (r0 == 0) goto L_0x0073
            r0.notifyDataSetChanged()
        L_0x0073:
            int r1 = r1 + 1
            goto L_0x006a
        L_0x0076:
            java.lang.Object r0 = r9.A00
            X.3mW r0 = (X.C72673mW) r0
            X.02W r2 = r0.A00
            androidx.recyclerview.widget.GridLayoutManager r2 = (androidx.recyclerview.widget.GridLayoutManager) r2
            android.view.View r1 = r0.A0H
            android.content.res.Resources r0 = r1.getResources()
            int r1 = X.AnonymousClass3K3.A0F(r0, r1)
            int r0 = r2.A00
            if (r1 == r0) goto L_0x0049
            r2.A1g(r1)
            return
        L_0x0090:
            java.lang.Object r3 = r9.A00
            X.39b r3 = (X.C614739b) r3
            X.1Ma r2 = r3.A0T
            if (r2 == 0) goto L_0x0049
            X.3T3 r0 = r3.A0A
            if (r0 == 0) goto L_0x0049
            java.lang.String r1 = "ice_breaker_recycler_view_render_complete"
            r2.A00(r1)
            r0 = 2
            r2.A02(r1, r0)
            X.3T3 r0 = r3.A0A
            X.AnonymousClass3K2.A0z(r0, r9)
            return
        L_0x00ab:
            java.lang.Object r1 = r9.A00
            X.1bo r1 = (X.C30141bo) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.A0N
            X.AnonymousClass3K3.A16(r0, r9)
            X.C30141bo.A00(r1)
            X.1bp r0 = r1.A0A
            if (r0 == 0) goto L_0x0049
            r0.A01()
            return
        L_0x00bf:
            java.lang.Object r3 = r9.A00
            X.4Om r3 = (X.AnonymousClass4Om) r3
            androidx.recyclerview.widget.RecyclerView r6 = r3.A05
            int r5 = r6.getHeight()
            int r0 = r3.A03
            if (r5 == r0) goto L_0x00ec
            r3.A03 = r5
            int r4 = r3.A01
            int r2 = r4 >> 2
            int r0 = r4 * 3
            int r1 = r0 >> 2
            int r0 = r5 % r4
            if (r0 < r2) goto L_0x00de
            if (r0 > r1) goto L_0x00de
            r1 = r0
        L_0x00de:
            r0 = 0
            int r5 = r5 - r1
            int r1 = java.lang.Math.max(r0, r5)
            int r0 = r1 / r4
            int r1 = r1 % r4
            int r0 = r0 + 1
            int r1 = r1 / r0
            r3.A02 = r1
        L_0x00ec:
            int r1 = r6.getWidth()
            int r0 = r3.A04
            if (r0 == r1) goto L_0x0049
            r3.A04 = r1
            int r0 = r3.A01
            int r1 = r1 / r0
            int r0 = r3.A00
            if (r0 == r1) goto L_0x010b
            r3.A00 = r1
            androidx.recyclerview.widget.GridLayoutManager r0 = r3.A08
            r0.A1g(r1)
            X.2rF r0 = r3.A06
            if (r0 == 0) goto L_0x010b
            r0.A01()
        L_0x010b:
            X.2rF r0 = r3.A06
            if (r0 == 0) goto L_0x0049
            r0.A01()
            return
        L_0x0113:
            java.lang.Object r2 = r9.A00
            com.obwhatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet r2 = (com.obwhatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet) r2
            android.view.View r0 = r2.A03
            X.AnonymousClass3K3.A16(r0, r9)
            boolean r0 = r2.A0A
            if (r0 != 0) goto L_0x0126
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r2.A08
            r0 = 4
            r1.A0M(r0)
        L_0x0126:
            r0 = 0
            r2.A0A = r0
            return
        L_0x012a:
            java.lang.Object r3 = r9.A00
            com.obwhatsapp.companiondevice.optin.ui.ForcedOptInActivity r3 = (com.obwhatsapp.companiondevice.optin.ui.ForcedOptInActivity) r3
            android.widget.ScrollView r0 = r3.A02
            boolean r0 = X.C49732Vm.A01(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0143
            android.widget.ScrollView r1 = r3.A02
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            r0 = r0 ^ 1
            r1 = 1
            if (r0 == 0) goto L_0x0144
        L_0x0143:
            r1 = 0
        L_0x0144:
            android.view.View r0 = r3.A01
            if (r1 != 0) goto L_0x0149
            r2 = 4
        L_0x0149:
            r0.setVisibility(r2)
            return
        L_0x014d:
            java.lang.Object r1 = r9.A00
            com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0 r1 = (com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0) r1
            java.lang.Object r0 = r1.A00
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass3K3.A16(r0, r9)
            java.lang.Object r1 = r1.A01
            X.3LF r1 = (X.AnonymousClass3LF) r1
            r0 = -1
            r1.A00 = r0
            r1.invalidateSelf()
            return
        L_0x0163:
            java.lang.Object r4 = r9.A00
            X.3gV r4 = (X.C70343gV) r4
            X.1yj r2 = r4.A03
            android.view.View r0 = r2.A08
            X.AnonymousClass3K3.A16(r0, r9)
            android.view.View r0 = r2.A08
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            boolean r0 = r1 instanceof X.AnonymousClass3LG
            if (r0 == 0) goto L_0x0181
            X.3LG r1 = (X.AnonymousClass3LG) r1
            android.graphics.drawable.Drawable r1 = r1.A01
            android.view.View r0 = r2.A08
            X.AnonymousClass3LG.A00(r1, r0)
        L_0x0181:
            r0 = 0
            android.view.animation.TranslateAnimation r3 = new android.view.animation.TranslateAnimation
            r3.<init>(r0, r0, r0, r0)
            r0 = 0
            r3.setDuration(r0)
            android.view.View r0 = r4.A01
            r0.startAnimation(r3)
            android.view.ViewGroup r1 = r4.A02
            android.view.ViewGroup r0 = r2.A0N
            if (r1 != r0) goto L_0x01a4
            android.view.ViewGroup r0 = r2.A0K
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x01a4
            android.view.ViewGroup r0 = r2.A0K
            r0.startAnimation(r3)
        L_0x01a4:
            com.obwhatsapp.mentions.MentionableEntry r0 = r2.A37
            boolean r0 = r0.A0H
            if (r0 == 0) goto L_0x01af
            android.widget.FrameLayout r0 = r2.A0O
            r0.startAnimation(r3)
        L_0x01af:
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x01b8
            com.obwhatsapp.conversation.ConversationListView r0 = r2.A1n
            r0.startAnimation(r3)
        L_0x01b8:
            r0 = 0
            r2.A01 = r0
            return
        L_0x01bc:
            java.lang.Object r1 = r9.A00
            com.obwhatsapp.greenalert.GreenAlertActivity r1 = (com.obwhatsapp.greenalert.GreenAlertActivity) r1
            com.obwhatsapp.WaViewPager r0 = r1.A06
            X.AnonymousClass3K2.A0z(r0, r9)
            r1.A36()
            return
        L_0x01c9:
            java.lang.Object r1 = r9.A00
            com.obwhatsapp.group.GroupProfileEmojiEditor r1 = (com.obwhatsapp.group.GroupProfileEmojiEditor) r1
            com.obwhatsapp.KeyboardPopupLayout r0 = r1.A03
            X.AnonymousClass3K2.A0z(r0, r9)
            X.1Mp r0 = r1.A07
            X.2Jn r0 = r0.A02
            X.AnonymousClass00B.A06(r0)
            r0.A06()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxLListenerShape145S0100000_2_I1.onGlobalLayout():void");
    }
}

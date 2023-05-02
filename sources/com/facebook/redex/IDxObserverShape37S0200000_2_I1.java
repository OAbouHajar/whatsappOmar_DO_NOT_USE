package com.facebook.redex;

import X.AnonymousClass023;

public class IDxObserverShape37S0200000_2_I1 implements AnonymousClass023 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxObserverShape37S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r8.booleanValue() == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009c, code lost:
        if (r8.booleanValue() == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00df, code lost:
        if (r3.A0N == null) goto L_0x00e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AOH(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A02
            switch(r0) {
                case 0: goto L_0x0089;
                case 1: goto L_0x00be;
                case 2: goto L_0x00cc;
                case 3: goto L_0x00ee;
                case 4: goto L_0x00fc;
                case 5: goto L_0x003e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r7.A00
            X.4Wh r3 = (X.C87324Wh) r3
            java.lang.Object r2 = r7.A01
            androidx.fragment.app.DialogFragment r2 = (androidx.fragment.app.DialogFragment) r2
            int r1 = X.AnonymousClass000.A0D(r8)
            r0 = 1
            if (r1 == r0) goto L_0x0023
            r0 = 2
            if (r1 == r0) goto L_0x002e
            r0 = 3
            if (r1 == r0) goto L_0x0080
            r0 = 4
            if (r1 == r0) goto L_0x0085
            java.lang.String r0 = "None event received"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0022:
            return
        L_0x0023:
            java.lang.String r0 = "Start pay flow event received"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A1C()
            java.lang.Runnable r0 = r3.A06
            goto L_0x0038
        L_0x002e:
            java.lang.String r0 = "Invite sent event received"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A1C()
            java.lang.Runnable r0 = r3.A05
        L_0x0038:
            if (r0 == 0) goto L_0x0022
            r0.run()
            return
        L_0x003e:
            java.lang.Object r6 = r7.A00
            com.obwhatsapp.mediaview.MediaViewFragment r6 = (com.obwhatsapp.mediaview.MediaViewFragment) r6
            java.lang.Object r5 = r7.A01
            android.view.View r5 = (android.view.View) r5
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto L_0x0051
            boolean r0 = r8.booleanValue()
            r4 = 1
            if (r0 != 0) goto L_0x0052
        L_0x0051:
            r4 = 0
        L_0x0052:
            r6.A1g = r4
            android.view.ViewGroup$MarginLayoutParams r3 = X.AnonymousClass000.A0O(r5)
            r2 = 0
            if (r4 == 0) goto L_0x007b
            android.content.res.Resources r1 = r6.A03()
            r0 = 2131165278(0x7f07005e, float:1.7944769E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.topMargin = r0
        L_0x0068:
            r5.setLayoutParams(r3)
            X.29C r0 = r6.A1c
            if (r0 == 0) goto L_0x0022
            com.obwhatsapp.videoplayback.ExoPlaybackControlView r1 = r0.A0C
            if (r1 == 0) goto L_0x0022
            if (r4 == 0) goto L_0x012c
            r1.A08 = r2
            r1.A01()
            return
        L_0x007b:
            r3.topMargin = r2
            r3.bottomMargin = r2
            goto L_0x0068
        L_0x0080:
            java.lang.String r0 = "Dismiss event received"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0085:
            r2.A1C()
            return
        L_0x0089:
            java.lang.Object r0 = r7.A00
            X.3GB r0 = (X.AnonymousClass3GB) r0
            java.lang.Object r4 = r7.A01
            android.view.View r4 = (android.view.View) r4
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            com.obwhatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment r3 = r0.A00
            if (r8 == 0) goto L_0x009e
            boolean r1 = r8.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x009f
        L_0x009e:
            r0 = 0
        L_0x009f:
            r3.A0B = r0
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass000.A0O(r4)
            if (r0 == 0) goto L_0x00b8
            android.content.res.Resources r1 = r3.A03()
            r0 = 2131165278(0x7f07005e, float:1.7944769E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.topMargin = r0
        L_0x00b4:
            r4.setLayoutParams(r2)
            return
        L_0x00b8:
            r0 = 0
            r2.topMargin = r0
            r2.bottomMargin = r0
            goto L_0x00b4
        L_0x00be:
            java.lang.Object r1 = r7.A00
            com.obwhatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment r1 = (com.obwhatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment) r1
            java.lang.Object r0 = r7.A01
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.util.List r8 = (java.util.List) r8
            com.obwhatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment.A01(r0, r1, r8)
            return
        L_0x00cc:
            java.lang.Object r3 = r7.A00
            X.2yn r3 = (X.C59692yn) r3
            java.lang.Object r2 = r7.A01
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            if (r0 == 0) goto L_0x00e1
            java.lang.String r1 = r3.A0N
            r0 = 1
            if (r1 != 0) goto L_0x00e2
        L_0x00e1:
            r0 = 0
        L_0x00e2:
            r2.setVisible(r0)
            X.2XU r0 = r3.A0E
            r0.A0O(r8)
            X.C59692yn.A03(r3)
            return
        L_0x00ee:
            java.lang.Object r1 = r7.A00
            X.2QC r1 = (X.AnonymousClass2QC) r1
            java.lang.Object r0 = r7.A01
            X.00k r0 = (X.C000900k) r0
            X.46Y r8 = (X.AnonymousClass46Y) r8
            X.AnonymousClass2QC.A0c(r0, r1, r8)
            return
        L_0x00fc:
            java.lang.Object r4 = r7.A00
            com.obwhatsapp.group.GroupProfileEmojiEditor r4 = (com.obwhatsapp.group.GroupProfileEmojiEditor) r4
            java.lang.Object r3 = r7.A01
            X.2Vq r3 = (X.C49762Vq) r3
            java.lang.Number r8 = (java.lang.Number) r8
            X.15n r1 = r4.A05
            int r0 = r8.intValue()
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r0)
            X.0pd r1 = r1.A00
            r0 = 1257(0x4e9, float:1.761E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0126
            X.2Vr r1 = new X.2Vr
            r1.<init>(r2, r3)
        L_0x0120:
            android.widget.ImageView r0 = r4.A02
            r0.setBackground(r1)
            return
        L_0x0126:
            X.2Vs r1 = new X.2Vs
            r1.<init>(r2, r3)
            goto L_0x0120
        L_0x012c:
            r0 = 1
            r1.A08 = r0
            r0 = 3000(0xbb8, float:4.204E-42)
            r1.A06(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObserverShape37S0200000_2_I1.AOH(java.lang.Object):void");
    }
}

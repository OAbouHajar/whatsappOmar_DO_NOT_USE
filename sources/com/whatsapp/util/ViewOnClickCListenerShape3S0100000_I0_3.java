package com.whatsapp.util;

import X.C34331k5;

public class ViewOnClickCListenerShape3S0100000_I0_3 extends C34331k5 {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape3S0100000_I0_3(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b8, code lost:
        if (r2.A01() == false) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r17) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x01b2;
                case 1: goto L_0x01a2;
                case 2: goto L_0x0180;
                case 3: goto L_0x00ff;
                case 4: goto L_0x008f;
                case 5: goto L_0x0076;
                case 6: goto L_0x00e7;
                case 7: goto L_0x00c7;
                case 8: goto L_0x0052;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r12 = r1.A00
            com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r12 = (com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity) r12
            X.0sq r1 = r12.A05
            X.0t3 r6 = r12.A05
            X.0tb r5 = r12.A01
            X.013 r7 = r12.A0A
            X.0t6 r8 = r12.A0C
            X.1G1 r4 = r12.A00
            X.0rv r9 = r12.A0E
            X.AnonymousClass00B.A06(r9)
            java.util.ArrayList r13 = r12.A0M
            java.util.ArrayList r14 = r12.A0N
            android.content.Intent r3 = r12.getIntent()
            java.lang.String r0 = "has_number_from_url"
            r2 = 0
            boolean r15 = r3.getBooleanExtra(r0, r2)
            android.content.Intent r3 = r12.getIntent()
            java.lang.String r0 = "quoted_message"
            android.os.Bundle r0 = r3.getBundleExtra(r0)
            X.1Vw r11 = X.C38621r6.A0E(r0)
            android.content.Intent r3 = r12.getIntent()
            java.lang.String r0 = "quoted_group_jid"
            java.lang.String r0 = r3.getStringExtra(r0)
            X.0sL r10 = X.C16050sL.A05(r0)
            X.375 r3 = new X.375
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Void[] r0 = new java.lang.Void[r2]
            r1.Ack(r3, r0)
        L_0x0051:
            return
        L_0x0052:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.twofactor.SetEmailFragment r2 = (com.obwhatsapp.twofactor.SetEmailFragment) r2
            java.lang.String r0 = "setemailfragment/submit"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = r2.A00
            r0 = 1
            r3 = 2
            if (r1 == r0) goto L_0x01c5
            if (r1 != r3) goto L_0x0051
            com.obwhatsapp.twofactor.TwoFactorAuthActivity r0 = r2.A06
            java.lang.String r1 = r0.A04
            java.lang.String r0 = r0.A05
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x01bf
            com.obwhatsapp.twofactor.TwoFactorAuthActivity r0 = r2.A06
            r0.A35()
            return
        L_0x0076:
            java.lang.Object r2 = r1.A00
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r2 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r2
            X.1pi r1 = r2.A0N
            X.AnonymousClass00B.A06(r1)
            boolean r0 = r1.A0R
            if (r0 != 0) goto L_0x0087
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x0051
        L_0x0087:
            com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment r0 = com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment.A01(r1)
            r2.Afc(r0)
            return
        L_0x008f:
            java.lang.Object r1 = r1.A00
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r1 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r1
            X.1pi r2 = r1.A0N
            if (r2 == 0) goto L_0x0051
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x0051
        L_0x00a1:
            r0 = 1
            r2.A05 = r0
            r1.A35()
            boolean r0 = r1.A0Z
            if (r0 == 0) goto L_0x00c0
            r5 = 5
        L_0x00ac:
            X.14f r1 = r1.A0R
            r3 = 0
            java.lang.String r0 = r2.A02
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r2.A01()
            r6 = 1
            if (r0 != 0) goto L_0x00bb
        L_0x00ba:
            r6 = 0
        L_0x00bb:
            r4 = r3
            r1.A00(r2, r3, r4, r5, r6)
            return
        L_0x00c0:
            boolean r0 = r1.A0a
            r5 = 2
            if (r0 == 0) goto L_0x00ac
            r5 = 1
            goto L_0x00ac
        L_0x00c7:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r3 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r3
            X.1wN r2 = r3.A0L
            java.lang.String r1 = r2.A05
            r3.A0h = r1
            X.1wL r0 = r3.A0c
            r0.A03 = r1
            r2.A0B(r1)
            r0 = 0
            r3.A0J = r0
            r3.A36()
            com.obwhatsapp.status.playback.widget.StatusEditText r1 = r3.A0a
            r0 = 0
            r1.A01 = r0
            r1.A0F()
            return
        L_0x00e7:
            java.lang.Object r3 = r1.A00
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r3 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r3
            X.13a r1 = r3.A0J
            r0 = 5
            r1.A02(r0)
            X.1ML r2 = r3.A0H
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            java.lang.String r0 = "sticker_store_pack_preview"
            X.AnonymousClass1ML.A01(r2, r0, r1)
            return
        L_0x00ff:
            java.lang.Object r1 = r1.A00
            X.2B3 r1 = (X.AnonymousClass2B3) r1
            X.4L6 r0 = r1.A0R
            X.0tZ r7 = r1.A0B
            com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment r4 = r0.A02
            X.0pd r1 = r4.A0P
            X.0s5 r0 = r4.A08
            boolean r0 = X.C38621r6.A0W(r0, r1, r7)
            r2 = 1
            if (r0 == 0) goto L_0x0177
            r4.A0T = r7
            android.content.Context r0 = r4.A0u()
            X.391 r5 = new X.391
            r5.<init>(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r5.A05 = r0
            X.1Vw r0 = r7.A11
            X.0rv r0 = r0.A00
            r5.A01 = r0
            byte r6 = r7.A10
            java.lang.Byte r0 = java.lang.Byte.valueOf(r6)
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.Set r1 = java.util.Collections.singleton(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r5.A0R = r0
            r0 = 3
            if (r6 != r0) goto L_0x0174
            r0 = r7
            X.0tY r0 = (X.C16730tY) r0
            int r0 = r0.A00
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
        L_0x0150:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.A0L = r0
            if (r6 != 0) goto L_0x0172
            java.lang.String r0 = r7.A0I()
            X.AnonymousClass00B.A06(r0)
            int r0 = r0.length()
        L_0x0163:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0J = r0
            android.content.Intent r1 = r5.A00()
            r0 = 2
            r4.startActivityForResult(r1, r0)
            return
        L_0x0172:
            r0 = 0
            goto L_0x0163
        L_0x0174:
            r2 = 0
            goto L_0x0150
        L_0x0177:
            X.0pt r1 = r4.A00
            r0 = 2131889466(0x7f120d3a, float:1.9413596E38)
            r1.A07(r0, r2)
            return
        L_0x0180:
            java.lang.Object r0 = r1.A00
            X.2B3 r0 = (X.AnonymousClass2B3) r0
            X.4L6 r1 = r0.A0R
            X.0tZ r0 = r0.A0B
            com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment r4 = r1.A02
            X.1Vw r3 = r0.A11
            com.obwhatsapp.status.StatusDeleteDialogFragment r2 = new com.obwhatsapp.status.StatusDeleteDialogFragment
            r2.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = ""
            X.AnonymousClass1yL.A09(r1, r3, r0)
            r2.A0T(r1)
            X.C54472hZ.A01(r2, r4)
            return
        L_0x01a2:
            java.lang.Object r0 = r1.A00
            X.1wh r0 = (X.C41811wh) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r0.A00
            int r1 = r2.A0B
            r0 = 3
            if (r1 != r0) goto L_0x01ae
            r0 = 4
        L_0x01ae:
            r2.A0M(r0)
            return
        L_0x01b2:
            java.lang.Object r0 = r1.A00
            X.2B3 r0 = (X.AnonymousClass2B3) r0
            X.1HE r2 = r0.A0A
            X.0tZ r1 = r0.A0B
            r0 = 1
            r2.A04(r1, r0)
            return
        L_0x01bf:
            android.widget.TextView r1 = r2.A04
            r0 = 2131892294(0x7f121846, float:1.9419332E38)
            goto L_0x01e5
        L_0x01c5:
            java.util.regex.Pattern r1 = android.util.Patterns.EMAIL_ADDRESS
            com.obwhatsapp.twofactor.TwoFactorAuthActivity r0 = r2.A06
            java.lang.String r0 = r0.A04
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x01e0
            com.obwhatsapp.twofactor.TwoFactorAuthActivity r2 = r2.A06
            com.obwhatsapp.twofactor.SetEmailFragment r1 = com.obwhatsapp.twofactor.SetEmailFragment.A01(r3)
            r0 = 1
            r2.A37(r1, r0)
            return
        L_0x01e0:
            android.widget.TextView r1 = r2.A04
            r0 = 2131892291(0x7f121843, float:1.9419326E38)
        L_0x01e5:
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ViewOnClickCListenerShape3S0100000_I0_3.A06(android.view.View):void");
    }
}

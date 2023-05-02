package com.facebook.redex;

import android.content.DialogInterface;

public class IDxCListenerShape1S0110000_2_I1 implements DialogInterface.OnClickListener {
    public Object A00;
    public boolean A01;
    public final int A02;

    public IDxCListenerShape1S0110000_2_I1(Object obj, int i2, boolean z2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        r2.A00((X.AnonymousClass09N) null, X.AnonymousClass1GE.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
        X.AnonymousClass1yL.A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x002f;
                case 1: goto L_0x0099;
                case 2: goto L_0x008e;
                case 3: goto L_0x006d;
                case 4: goto L_0x001d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r5.A00
            com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment r4 = (com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment) r4
            boolean r1 = r5.A01
            r0 = -3
            if (r7 == r0) goto L_0x0052
            r0 = -1
            if (r7 != r0) goto L_0x001c
            X.1CX r1 = r4.A04
            X.1jm r0 = r4.A03
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r1.A0F(r0)
        L_0x001c:
            return
        L_0x001d:
            java.lang.Object r1 = r5.A00
            X.01A r1 = (X.AnonymousClass01A) r1
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x001c
            X.00l r0 = r1.A0C()
            if (r0 == 0) goto L_0x001c
            r0.finish()
            return
        L_0x002f:
            java.lang.Object r4 = r5.A00
            com.obwhatsapp.WaInAppBrowsingActivity r4 = (com.obwhatsapp.WaInAppBrowsingActivity) r4
            boolean r0 = r5.A01
            r6.dismiss()
            if (r0 == 0) goto L_0x001c
            r3 = 0
            android.content.Intent r2 = X.C13680ns.A09()
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "webview_callback"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 == 0) goto L_0x004e
            r2.putExtra(r1, r0)
        L_0x004e:
            r4.A36(r3, r2)
            return
        L_0x0052:
            X.0sq r3 = r4.A05
            r0 = 10
            com.facebook.redex.RunnableRunnableShape1S0110000_I1 r2 = new com.facebook.redex.RunnableRunnableShape1S0110000_I1
            r2.<init>(r4, r0, r1)
            java.lang.String r0 = "remove_recent_sticker"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.1jm r0 = r4.A03
            java.lang.String r0 = r0.A0D
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            r3.Acm(r2, r0)
            return
        L_0x006d:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.conversation.conversationrow.SecurityNotificationDialogFragment r3 = (com.obwhatsapp.conversation.conversationrow.SecurityNotificationDialogFragment) r3
            boolean r0 = r5.A01
            X.0uj r1 = r3.A06
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = "seeing-your-security-code-could-not-be-verified"
        L_0x0079:
            android.net.Uri r0 = r1.A04(r0)
            android.content.Intent r2 = X.C13690nt.A0B(r0)
            X.0zJ r1 = r3.A00
            android.content.Context r0 = r3.A0u()
            r1.A06(r0, r2)
            return
        L_0x008b:
            java.lang.String r0 = "26000361"
            goto L_0x0079
        L_0x008e:
            java.lang.Object r1 = r5.A00
            com.obwhatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment r1 = (com.obwhatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment) r1
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x00aa
            X.05i r2 = r1.A06
            goto L_0x00a3
        L_0x0099:
            boolean r1 = r5.A01
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            if (r1 == 0) goto L_0x00ae
            X.05i r2 = r0.A0U
        L_0x00a3:
            java.lang.String[] r1 = X.AnonymousClass1GE.A07
            r0 = 0
            r2.A00(r0, r1)
            return
        L_0x00aa:
            X.00l r0 = r1.A0D()
        L_0x00ae:
            X.AnonymousClass1yL.A05(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape1S0110000_2_I1.onClick(android.content.DialogInterface, int):void");
    }
}

package com.facebook.redex;

import android.view.View;

public class IDxCListenerShape178S0100000_2_I1 implements View.OnLongClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape178S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e0, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e4, code lost:
        r1 = r2.A09.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ea, code lost:
        if (r1.A0W != false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ec, code lost:
        com.whatsapp.util.Log.i("callsHistoryFragmentV2/callItemViewHolderEventListener/onSingleContactPhotoLongClicked Ignoring long click");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f2, code lost:
        com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A01(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x012a;
                case 1: goto L_0x00ff;
                case 2: goto L_0x00f6;
                case 3: goto L_0x00d6;
                case 4: goto L_0x00b8;
                case 5: goto L_0x0023;
                case 6: goto L_0x0097;
                case 7: goto L_0x006c;
                case 8: goto L_0x002f;
                case 9: goto L_0x0012;
                case 10: goto L_0x005a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A00
            X.3Sf r0 = (X.C64933Sf) r0
            android.view.View$OnLongClickListener r0 = r0.A00
            if (r0 == 0) goto L_0x0141
            boolean r0 = r0.onLongClick(r7)
            return r0
        L_0x0012:
            java.lang.Object r1 = r6.A00
            X.4zb r1 = (X.C102834zb) r1
            X.4MW r0 = r1.A04
            int r0 = r0.A02
            int r0 = r0 + -1
            int r0 = r0 % 4
            r1.A00(r0)
            goto L_0x00fd
        L_0x0023:
            java.lang.Object r2 = r6.A00
            X.2rd r2 = (X.C57712rd) r2
            X.4wk r0 = r2.A00
            if (r0 != 0) goto L_0x00e4
            java.lang.String r0 = "CallsHistoryCallItemViewHolder/onMultiContactPhotoLongClicked call item is null"
            goto L_0x00e0
        L_0x002f:
            java.lang.Object r0 = r6.A00
            X.2re r0 = (X.C57722re) r0
            X.0tZ r4 = r0.A01
            if (r4 == 0) goto L_0x0141
            com.obwhatsapp.gallery.LinksGalleryFragment r3 = r0.A0A
            X.00l r2 = r3.A0C()
            X.AnonymousClass00B.A06(r2)
            r1 = r2
            X.1YG r1 = (X.AnonymousClass1YG) r1
            boolean r0 = r1.AHi()
            X.AnonymousClass00B.A06(r2)
            if (r0 == 0) goto L_0x0056
            r1.Agy(r4)
        L_0x004f:
            X.3R5 r0 = r3.A0A
            r0.A01()
            r0 = 1
            return r0
        L_0x0056:
            r1.Ag8(r4)
            goto L_0x004f
        L_0x005a:
            java.lang.Object r0 = r6.A00
            X.34v r0 = (X.C606734v) r0
            r0.A05()
            java.lang.String r2 = r0.A0H
            X.01V r1 = r0.A02
            X.0pt r0 = r0.A01
            boolean r0 = X.AnonymousClass3B1.A00(r0, r1, r2)
            return r0
        L_0x006c:
            java.lang.Object r0 = r6.A00
            X.3Sl r0 = (X.C64993Sl) r0
            X.1rA r4 = r0.A00
            if (r4 == 0) goto L_0x0141
            com.obwhatsapp.gallery.DocumentsGalleryFragment r3 = r0.A0B
            X.00l r2 = r3.A0C()
            X.AnonymousClass00B.A06(r2)
            r1 = r2
            X.1YG r1 = (X.AnonymousClass1YG) r1
            boolean r0 = r1.AHi()
            X.AnonymousClass00B.A06(r2)
            if (r0 == 0) goto L_0x0093
            r1.Agy(r4)
        L_0x008c:
            X.3R5 r0 = r3.A0A
            r0.A01()
            r0 = 1
            return r0
        L_0x0093:
            r1.Ag8(r4)
            goto L_0x008c
        L_0x0097:
            java.lang.Object r5 = r6.A00
            X.2rf r5 = (X.C57732rf) r5
            r0 = 0
            com.facebook.redex.IDxSListenerShape437S0100000_2_I1 r4 = new com.facebook.redex.IDxSListenerShape437S0100000_2_I1
            r4.<init>(r5, r0)
            X.0um r3 = r5.A04
            android.widget.ImageView r2 = r5.A02
            X.1pj r0 = r5.A01
            int[] r0 = r0.A00
            X.2pZ r1 = new X.2pZ
            r1.<init>(r2, r4, r3, r0)
            com.obwhatsapp.emoji.EmojiContainerView r0 = r5.A03
            android.view.View r0 = r0.getRootView()
            X.C37941pz.A01(r2, r0, r1)
            goto L_0x00fd
        L_0x00b8:
            java.lang.Object r2 = r6.A00
            X.2rd r2 = (X.C57712rd) r2
            X.4wk r0 = r2.A00
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = "CallsHistoryCallItemViewHolder/onViewHolderLongClicked call item is null"
            goto L_0x00e0
        L_0x00c3:
            X.4Db r0 = r2.A09
            com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r1 = r0.A00
            boolean r0 = r1.A0W
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = "CallsHistoryFragmentV2/callItemViewHolderEventListener/onViewHolderLongClicked action not supported in the middle of a search"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0141
        L_0x00d1:
            com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A01(r2, r1)
            r0 = 1
            return r0
        L_0x00d6:
            java.lang.Object r2 = r6.A00
            X.2rd r2 = (X.C57712rd) r2
            X.4wk r0 = r2.A00
            if (r0 != 0) goto L_0x00e4
            java.lang.String r0 = "CallsHistoryCallItemViewHolder/onContactPhotoLongClicked call item is null"
        L_0x00e0:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0141
        L_0x00e4:
            X.4Db r0 = r2.A09
            com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r1 = r0.A00
            boolean r0 = r1.A0W
            if (r0 != 0) goto L_0x00f2
            java.lang.String r0 = "callsHistoryFragmentV2/callItemViewHolderEventListener/onSingleContactPhotoLongClicked Ignoring long click"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00fd
        L_0x00f2:
            com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A01(r2, r1)
            goto L_0x00fd
        L_0x00f6:
            java.lang.Object r0 = r6.A00
            X.39l r0 = (X.C615739l) r0
            r0.A02(r7)
        L_0x00fd:
            r0 = 1
            return r0
        L_0x00ff:
            java.lang.Object r0 = r6.A00
            X.2oM r0 = (X.C56702oM) r0
            X.3BH r4 = r0.A03
            X.0rz r0 = r4.A0M
            r2 = 1
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "skin_emoji_tip"
            X.C13680ns.A0w(r1, r0, r2)
            X.2nu r7 = (X.C56562nu) r7
            r0 = 0
            com.facebook.redex.IDxSListenerShape99S0200000_2_I1 r3 = new com.facebook.redex.IDxSListenerShape99S0200000_2_I1
            r3.<init>(r7, r4, r0)
            X.0um r2 = r4.A0O
            int[] r0 = r7.A07
            X.2pY r1 = new X.2pY
            r1.<init>(r7, r3, r2, r0)
            r4.A04 = r1
            android.view.View r0 = r4.A0E
            X.C37941pz.A01(r7, r0, r1)
            goto L_0x0141
        L_0x012a:
            java.lang.Object r0 = r6.A00
            X.2oM r0 = (X.C56702oM) r0
            X.3BH r3 = r0.A03
            X.0rz r0 = r3.A0M
            r2 = 1
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "skin_emoji_tip"
            X.C13680ns.A0w(r1, r0, r2)
            X.2nu r7 = (X.C56562nu) r7
            r3.A01(r7)
        L_0x0141:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape178S0100000_2_I1.onLongClick(android.view.View):boolean");
    }
}

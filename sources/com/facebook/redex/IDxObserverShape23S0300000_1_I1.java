package com.facebook.redex;

import X.AnonymousClass023;

public class IDxObserverShape23S0300000_1_I1 implements AnonymousClass023 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxObserverShape23S0300000_1_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0158, code lost:
        if (r9 != null) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015f, code lost:
        if (r9 != null) goto L_0x0161;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AOH(java.lang.Object r15) {
        /*
            r14 = this;
            r9 = r15
            int r0 = r14.A03
            switch(r0) {
                case 0: goto L_0x0076;
                case 1: goto L_0x016b;
                case 2: goto L_0x01be;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r5 = r14.A01
            X.0pN r5 = (X.C14550pN) r5
            java.lang.Object r8 = r14.A02
            com.whatsapp.jid.GroupJid r8 = (com.whatsapp.jid.GroupJid) r8
            java.util.Map r9 = (java.util.Map) r9
            if (r9 == 0) goto L_0x0217
            int r1 = r9.size()
            r0 = 1
            if (r1 < r0) goto L_0x0217
            r1 = 0
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()
            java.util.Iterator r4 = X.AnonymousClass000.A0y(r9)
        L_0x0026:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0053
            java.util.Map$Entry r3 = X.AnonymousClass000.A0z(r4)
            java.lang.Object r2 = r3.getValue()
            X.4I1 r2 = (X.AnonymousClass4I1) r2
            if (r2 == 0) goto L_0x0026
            if (r1 != 0) goto L_0x0040
            long r0 = r2.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0040:
            java.lang.Object r0 = r3.getKey()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.String r0 = r0.getRawString()
            r7.add(r0)
            java.lang.String r0 = r2.A01
            r6.add(r0)
            goto L_0x0026
        L_0x0053:
            java.util.Set r0 = r9.keySet()
            android.content.Intent r4 = X.C14750ph.A0P(r5, r8, r1, r7, r6)
            r3 = -1
            android.os.Bundle r2 = X.C13690nt.A0D()
            java.util.ArrayList r1 = X.C16030sJ.A06(r0)
            java.lang.String r0 = "jids"
            r2.putStringArrayList(r0, r1)
            java.lang.String r0 = "invite_intent"
            r2.putParcelable(r0, r4)
            com.obwhatsapp.invites.PromptSendGroupInviteDialogFragment r0 = com.obwhatsapp.invites.PromptSendGroupInviteDialogFragment.A01(r2, r3)
            r5.Afc(r0)
            return
        L_0x0076:
            java.lang.Object r2 = r14.A00
            X.26l r2 = (X.C449726l) r2
            java.lang.Object r1 = r14.A01
            java.lang.Object r3 = r14.A02
            X.1mD r9 = (X.C35611mD) r9
            X.2ql r5 = r2.A0b
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x015f
            if (r9 != 0) goto L_0x0161
            X.26k r4 = r5.A0D
            X.23A r0 = r4.A02
            r0.A00(r4)
            r0 = 1
            r5.A00 = r0
        L_0x0092:
            com.obwhatsapp.biz.catalog.view.CatalogMediaCard r7 = r2.A0X
            r5 = 8
            r4 = 0
            if (r7 == 0) goto L_0x00ef
            X.2ql r8 = r2.A0b
            r13 = 1
            if (r9 == 0) goto L_0x015b
            boolean r0 = r9.A0L
            if (r0 == 0) goto L_0x015b
            int r6 = r8.A02
            if (r6 == r13) goto L_0x00b5
            r0 = 9
            if (r6 == r0) goto L_0x00b5
            if (r6 == r5) goto L_0x00b5
            r0 = 5
            if (r6 == r0) goto L_0x00b5
            r0 = 6
            if (r6 == r0) goto L_0x00b5
            r0 = 7
            if (r6 != r0) goto L_0x015b
        L_0x00b5:
            boolean r0 = r8.A01
            if (r0 != 0) goto L_0x015b
            r7.setVisibility(r4)
            com.obwhatsapp.biz.catalog.view.CatalogMediaCard r8 = r2.A0X
            com.whatsapp.jid.UserJid r10 = r2.A0i
            boolean r12 = X.AnonymousClass000.A1V(r1)
            java.lang.String r11 = r2.A0p
            r8.A02(r9, r10, r11, r12, r13)
            r0 = 2131364275(0x7f0a09b3, float:1.8348382E38)
            android.view.View r7 = r2.findViewById(r0)
            r0 = 2131365494(0x7f0a0e76, float:1.8350855E38)
            android.view.View r6 = r2.findViewById(r0)
            r0 = 2131099973(0x7f060145, float:1.7812314E38)
            int r1 = X.AnonymousClass00T.A00(r2, r0)
            r7.setBackgroundColor(r1)
            r0 = 2131363227(0x7f0a059b, float:1.8346257E38)
            X.C13680ns.A1I(r2, r0, r4)
            com.obwhatsapp.biz.catalog.view.CatalogMediaCard r0 = r2.A0X
            r0.setBackgroundColor(r1)
            r6.setBackgroundColor(r1)
        L_0x00ef:
            if (r3 == 0) goto L_0x0158
            X.0sK r1 = r2.A01
            com.whatsapp.jid.UserJid r0 = r2.A0i
            boolean r0 = r1.A0I(r0)
            if (r0 != 0) goto L_0x0158
            r0 = 2131362868(0x7f0a0434, float:1.8345529E38)
            android.view.View r3 = r2.findViewById(r0)
            com.obwhatsapp.TextEmojiLabel r3 = (com.obwhatsapp.TextEmojiLabel) r3
            if (r9 == 0) goto L_0x0143
            if (r3 == 0) goto L_0x0113
            java.lang.String r1 = r9.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0150
            r3.setVisibility(r5)
        L_0x0113:
            boolean r0 = r9.A0K
            if (r0 == 0) goto L_0x0143
            X.2ql r0 = r2.A0b
            X.027 r1 = r0.A0A
            r0 = 12
            X.C13680ns.A1L(r2, r1, r0)
            X.2ql r3 = r2.A0b
            X.0rz r1 = r3.A0F
            com.whatsapp.jid.UserJid r0 = r3.A0G
            java.lang.String r0 = r0.getRawString()
            java.lang.String r1 = r1.A0R(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x014d
            java.lang.String r1 = r9.A09
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x014d
            X.027 r0 = r3.A0A
            java.lang.String r1 = ""
        L_0x0140:
            r0.A0B(r1)
        L_0x0143:
            X.2ql r0 = r2.A0b
            X.1cy r1 = r0.A0I
            r0 = 13
            X.C13680ns.A1L(r2, r1, r0)
            return
        L_0x014d:
            X.027 r0 = r3.A0A
            goto L_0x0140
        L_0x0150:
            r0 = 0
            r3.A0I(r0, r1)
            r3.setVisibility(r4)
            goto L_0x0113
        L_0x0158:
            if (r9 == 0) goto L_0x0143
            goto L_0x0113
        L_0x015b:
            r7.setVisibility(r5)
            goto L_0x00ef
        L_0x015f:
            if (r9 == 0) goto L_0x0092
        L_0x0161:
            r2.A35()
            X.2XA r0 = r2.A0M
            r0.A06()
            goto L_0x0092
        L_0x016b:
            java.lang.Object r3 = r14.A00
            X.1bb r3 = (X.C30011bb) r3
            java.lang.Object r4 = r14.A01
            X.0pN r4 = (X.C14550pN) r4
            java.lang.Object r2 = r14.A02
            X.0rv r2 = (X.C15830rv) r2
            X.0rv r9 = (X.C15830rv) r9
            if (r9 == 0) goto L_0x0217
            X.0sP r1 = r3.A0d
            X.0sG r0 = r3.A0a
            X.0sH r0 = r0.A0A(r9)
            java.lang.String r5 = r1.A08(r0)
            X.0rt r0 = r3.A0u
            java.lang.String r3 = r0.A09(r2)
            if (r5 == 0) goto L_0x0217
            r2 = 2131886347(0x7f12010b, float:1.940727E38)
            java.lang.Object[] r1 = X.C13690nt.A1Z()
            r0 = 0
            r1[r0] = r5
            r0 = 1
            java.lang.String r2 = X.C13680ns.A0d(r4, r3, r1, r0, r2)
            android.view.View r1 = r4.A00
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r0)
            if (r1 != 0) goto L_0x01ab
            android.view.View r1 = r4.A00
        L_0x01ab:
            r0 = -1
            X.1fz r1 = X.C32291fz.A01(r1, r2, r0)
            r0 = 2131101493(0x7f060735, float:1.7815397E38)
            int r0 = X.AnonymousClass00T.A00(r4, r0)
            r1.A07(r0)
            r1.A03()
            return
        L_0x01be:
            java.lang.Object r5 = r14.A00
            X.1bb r5 = (X.C30011bb) r5
            java.lang.Object r6 = r14.A01
            java.lang.Object r4 = r14.A02
            X.0rv r4 = (X.C15830rv) r4
            java.util.Map r9 = (java.util.Map) r9
            if (r9 == 0) goto L_0x0217
            int r1 = r9.size()
            r0 = 1
            if (r1 < r0) goto L_0x0217
            java.util.Iterator r0 = X.AnonymousClass000.A0y(r9)
            java.util.Map$Entry r3 = X.AnonymousClass000.A0z(r0)
            X.0sP r2 = r5.A0d
            X.0sG r1 = r5.A0a
            java.lang.Object r0 = r3.getKey()
            X.0rv r0 = (X.C15830rv) r0
            X.0sH r0 = r1.A0A(r0)
            java.lang.String r7 = r2.A08(r0)
            X.0rt r0 = r5.A0u
            java.lang.String r8 = r0.A09(r4)
            java.lang.Object r0 = r3.getValue()
            int r1 = X.AnonymousClass000.A0D(r0)
            r0 = 409(0x199, float:5.73E-43)
            if (r1 != r0) goto L_0x020b
            X.0pt r0 = r5.A0J
            r9 = 0
            com.facebook.redex.RunnableRunnableShape1S2200000_I1 r4 = new com.facebook.redex.RunnableRunnableShape1S2200000_I1
            r4.<init>(r5, r6, r7, r8, r9)
            r0.A0K(r4)
            return
        L_0x020b:
            int r0 = r9.size()
            if (r0 <= 0) goto L_0x0217
            r0 = 3001(0xbb9, float:4.205E-42)
            X.C17240ul.A01(r0, r9)
            return
        L_0x0217:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObserverShape23S0300000_1_I1.AOH(java.lang.Object):void");
    }
}

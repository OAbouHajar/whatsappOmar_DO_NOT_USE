package com.facebook.redex;

import X.AnonymousClass23B;

public class IDxPCallbackShape80S0200000_2_I1 implements AnonymousClass23B {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxPCallbackShape80S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        r0 = r2.A00;
        r2 = r2.A01;
        r0.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007b, code lost:
        r1 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0084, code lost:
        r0 = r2.A00;
        r2 = r2.A01;
        r0.A02 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ANn(X.C35611mD r5) {
        /*
            r4 = this;
            int r0 = r4.A02
            if (r0 == 0) goto L_0x0028
            java.lang.Object r3 = r4.A00
            com.obwhatsapp.biz.catalog.view.CatalogHeader r3 = (com.obwhatsapp.biz.catalog.view.CatalogHeader) r3
            java.lang.Object r2 = r4.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            boolean r0 = r3.A0I
            if (r0 != 0) goto L_0x001c
            if (r5 != 0) goto L_0x001e
            X.0uc r1 = r3.A06
            r0 = 0
            r1.A05(r3, r2, r0)
            r0 = 1
            r3.A0I = r0
        L_0x001b:
            return
        L_0x001c:
            if (r5 == 0) goto L_0x001b
        L_0x001e:
            com.obwhatsapp.TextEmojiLabel r1 = r3.A04
            if (r1 == 0) goto L_0x001b
            java.lang.String r0 = r5.A0A
            r1.A0G(r0)
            return
        L_0x0028:
            java.lang.Object r0 = r4.A00
            X.0uc r0 = (X.C17150uc) r0
            java.lang.Object r1 = r4.A01
            X.5RS r1 = (X.AnonymousClass5RS) r1
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x005c
            if (r5 == 0) goto L_0x005c
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x005c
            com.facebook.redex.IDxSListenerShape362S0100000_2_I1 r1 = (com.facebook.redex.IDxSListenerShape362S0100000_2_I1) r1
            int r0 = r1.A01
            java.lang.Object r2 = r1.A00
            switch(r0) {
                case 0: goto L_0x0057;
                case 1: goto L_0x0053;
                default: goto L_0x0045;
            }
        L_0x0045:
            X.4IW r2 = (X.AnonymousClass4IW) r2
            java.lang.String r1 = "api_dc"
        L_0x0049:
            X.0zF r0 = r2.A00
            java.util.concurrent.CountDownLatch r2 = r2.A01
            r0.A01 = r1
        L_0x004f:
            r2.countDown()
            return
        L_0x0053:
            X.4H4 r2 = (X.AnonymousClass4H4) r2
            r0 = 2
            goto L_0x007b
        L_0x0057:
            X.4IX r2 = (X.AnonymousClass4IX) r2
            java.lang.String r1 = "direct_connection"
            goto L_0x0084
        L_0x005c:
            com.facebook.redex.IDxSListenerShape362S0100000_2_I1 r1 = (com.facebook.redex.IDxSListenerShape362S0100000_2_I1) r1
            int r0 = r1.A01
            java.lang.Object r2 = r1.A00
            switch(r0) {
                case 0: goto L_0x0080;
                case 1: goto L_0x006e;
                default: goto L_0x0065;
            }
        L_0x0065:
            X.4IW r2 = (X.AnonymousClass4IW) r2
            if (r5 != 0) goto L_0x006b
            r1 = 0
            goto L_0x0049
        L_0x006b:
            java.lang.String r1 = "api"
            goto L_0x0049
        L_0x006e:
            X.4H4 r2 = (X.AnonymousClass4H4) r2
            if (r5 != 0) goto L_0x007a
            r1 = 0
        L_0x0073:
            X.3rr r0 = r2.A00
            java.util.concurrent.CountDownLatch r2 = r2.A01
            r0.A00 = r1
            goto L_0x004f
        L_0x007a:
            r0 = 3
        L_0x007b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L_0x0073
        L_0x0080:
            X.4IX r2 = (X.AnonymousClass4IX) r2
            java.lang.String r1 = "non_direct_connection"
        L_0x0084:
            X.0zF r0 = r2.A00
            java.util.concurrent.CountDownLatch r2 = r2.A01
            r0.A02 = r1
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxPCallbackShape80S0200000_2_I1.ANn(X.1mD):void");
    }
}

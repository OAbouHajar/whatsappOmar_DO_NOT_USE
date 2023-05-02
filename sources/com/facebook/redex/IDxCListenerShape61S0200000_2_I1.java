package com.facebook.redex;

import android.view.MenuItem;

public class IDxCListenerShape61S0200000_2_I1 implements MenuItem.OnMenuItemClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape61S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r5.A04.startActivityForResult(r5.A09.A00(r5.A06.A0A(r2), r2, r4), 10);
        r5.A08.A02(r4, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0092, code lost:
        r5.A01.A09(com.obwhatsapp.R.string.str00a0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r2.startActivity(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onMenuItemClick(android.view.MenuItem r7) {
        /*
            r6 = this;
            int r0 = r6.A02
            switch(r0) {
                case 0: goto L_0x0018;
                case 1: goto L_0x002c;
                case 2: goto L_0x0044;
                case 3: goto L_0x0052;
                case 4: goto L_0x0063;
                case 5: goto L_0x006d;
                case 6: goto L_0x009c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r6.A00
            X.4SD r1 = (X.AnonymousClass4SD) r1
            java.lang.Object r0 = r6.A01
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            com.obwhatsapp.community.CommunityMembersActivity r2 = r1.A04
            android.content.Intent r0 = X.C14750ph.A0X(r2, r0)
        L_0x0013:
            r2.startActivity(r0)
        L_0x0016:
            r0 = 1
            return r0
        L_0x0018:
            java.lang.Object r0 = r6.A00
            X.4SD r0 = (X.AnonymousClass4SD) r0
            java.lang.Object r1 = r6.A01
            X.0sH r1 = (X.C16010sH) r1
            com.obwhatsapp.community.CommunityMembersActivity r2 = r0.A04
            X.0ph r0 = new X.0ph
            r0.<init>()
            android.content.Intent r0 = r0.A0v(r2, r1)
            goto L_0x0013
        L_0x002c:
            java.lang.Object r2 = r6.A00
            X.4SD r2 = (X.AnonymousClass4SD) r2
            java.lang.Object r1 = r6.A01
            X.0sH r1 = (X.C16010sH) r1
            X.1ko r0 = r1.A0D
            if (r0 == 0) goto L_0x0016
            com.obwhatsapp.community.CommunityMembersActivity r2 = r2.A04
            X.0ph r0 = new X.0ph
            r0.<init>()
            android.content.Intent r0 = r0.A0u(r2, r1)
            goto L_0x0013
        L_0x0044:
            java.lang.Object r0 = r6.A00
            X.4SD r0 = (X.AnonymousClass4SD) r0
            java.lang.Object r1 = r6.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.4Rt r0 = r0.A03
            r0.A00(r1)
            goto L_0x0016
        L_0x0052:
            java.lang.Object r0 = r6.A00
            X.4SD r0 = (X.AnonymousClass4SD) r0
            java.lang.Object r2 = r6.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.4Rt r0 = r0.A03
            r1 = 0
            X.39X r0 = r0.A05
            r0.A01(r2, r1)
            goto L_0x0016
        L_0x0063:
            java.lang.Object r5 = r6.A00
            X.4SD r5 = (X.AnonymousClass4SD) r5
            java.lang.Object r2 = r6.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            r4 = 0
            goto L_0x0076
        L_0x006d:
            java.lang.Object r5 = r6.A00
            X.4SD r5 = (X.AnonymousClass4SD) r5
            java.lang.Object r2 = r6.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            r4 = 1
        L_0x0076:
            r3 = 0
            X.0sG r0 = r5.A06
            X.0sH r1 = r0.A0A(r2)
            X.1Kt r0 = r5.A09
            android.content.Intent r2 = r0.A00(r1, r2, r4)
            com.obwhatsapp.community.CommunityMembersActivity r1 = r5.A04     // Catch:{ ActivityNotFoundException -> 0x0092 }
            r0 = 10
            r1.startActivityForResult(r2, r0)     // Catch:{ ActivityNotFoundException -> 0x0092 }
            X.1Ks r1 = r5.A08     // Catch:{ ActivityNotFoundException -> 0x0092 }
            r0 = 8
            r1.A02(r4, r0)     // Catch:{ ActivityNotFoundException -> 0x0092 }
            goto L_0x0016
        L_0x0092:
            X.0pt r1 = r5.A01
            r0 = 2131886240(0x7f1200a0, float:1.9407053E38)
            r1.A09(r0, r3)
            goto L_0x0016
        L_0x009c:
            java.lang.Object r0 = r6.A00
            X.4SD r0 = (X.AnonymousClass4SD) r0
            java.lang.Object r5 = r6.A01
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            X.2AF r4 = r0.A05
            X.0wP r0 = r4.A07
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x00c6
            X.2OJ r3 = r4.A0J
            r0 = 1
            com.facebook.redex.IDxObjectShape332S0100000_2_I1 r2 = new com.facebook.redex.IDxObjectShape332S0100000_2_I1
            r2.<init>(r4, r0)
            r0 = 3
            com.facebook.redex.IDxObjectShape261S0100000_2_I1 r1 = new com.facebook.redex.IDxObjectShape261S0100000_2_I1
            r1.<init>(r4, r0)
            X.3oB r0 = new X.3oB
            r0.<init>(r5, r1, r2)
            r3.A0B(r0)
            goto L_0x0016
        L_0x00c6:
            X.2OJ r2 = r4.A0J
            r0 = 4
            com.facebook.redex.IDxObjectShape261S0100000_2_I1 r1 = new com.facebook.redex.IDxObjectShape261S0100000_2_I1
            r1.<init>(r4, r0)
            X.3o9 r0 = new X.3o9
            r0.<init>(r1)
            r2.A0B(r0)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape61S0200000_2_I1.onMenuItemClick(android.view.MenuItem):boolean");
    }
}

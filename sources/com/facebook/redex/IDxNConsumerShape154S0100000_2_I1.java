package com.facebook.redex;

import X.AnonymousClass1WE;

public class IDxNConsumerShape154S0100000_2_I1 implements AnonymousClass1WE {
    public Object A00;
    public final int A01;

    public IDxNConsumerShape154S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x0010;
                case 1: goto L_0x00d2;
                case 2: goto L_0x00db;
                case 3: goto L_0x003a;
                case 4: goto L_0x0130;
                case 5: goto L_0x0062;
                case 6: goto L_0x013d;
                case 7: goto L_0x016d;
                case 8: goto L_0x0095;
                case 9: goto L_0x0177;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A00
            com.obwhatsapp.WaPreferenceFragment r0 = (com.obwhatsapp.WaPreferenceFragment) r0
            X.2KO r1 = r0.A00
            r0 = 4
            X.AnonymousClass29T.A01(r1, r0)
        L_0x000f:
            return
        L_0x0010:
            r3 = 0
            java.lang.Object r0 = r14.A00
            com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0 r0 = (com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0) r0
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            java.lang.Object r1 = r0.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r1 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r1
            boolean r0 = r1.AIm()
            if (r0 != 0) goto L_0x000f
            com.whatsapp.jid.UserJid r2 = r1.A3N()
            boolean r7 = r15.booleanValue()
            java.lang.String r5 = "account_info_report"
            r6 = 1
            r12 = 0
            r8 = 1
            r9 = 1
            r10 = 1
            r11 = 1
            r4 = r3
            com.obwhatsapp.support.ReportSpamDialogFragment r0 = com.obwhatsapp.support.ReportSpamDialogFragment.A01(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.Afc(r0)
            return
        L_0x003a:
            java.lang.Object r3 = r14.A00
            X.30W r3 = (X.AnonymousClass30W) r3
            X.4Mi r15 = (X.C84904Mi) r15
            X.0tZ r0 = r15.A01
            X.1Vw r1 = r0.A11
            android.widget.TextView r0 = r3.A04
            java.lang.Object r0 = r0.getTag()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            int r2 = r15.A00
            X.1sv r0 = r15.A03
            if (r0 != 0) goto L_0x005d
            r1 = 0
        L_0x0057:
            java.util.List r0 = r15.A02
            r3.A1N(r0, r2, r1)
            return
        L_0x005d:
            java.lang.String r1 = r0.A02()
            goto L_0x0057
        L_0x0062:
            r4 = 0
            java.lang.Object r0 = r14.A00
            com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2 r0 = (com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2) r0
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            java.lang.Object r2 = r0.A00
            com.obwhatsapp.group.GroupChatInfoActivity r2 = (com.obwhatsapp.group.GroupChatInfoActivity) r2
            boolean r0 = r2.AIm()
            if (r0 != 0) goto L_0x000f
            X.0sH r1 = r2.A0w
            java.lang.Class<X.0sL> r0 = X.C16050sL.class
            com.whatsapp.jid.Jid r3 = r1.A08(r0)
            X.AnonymousClass00B.A06(r3)
            X.0rv r3 = (X.C15830rv) r3
            boolean r8 = r15.booleanValue()
            java.lang.String r6 = "group_info_report"
            r7 = 1
            r13 = 0
            r9 = 1
            r10 = 1
            r11 = 1
            r12 = 1
            r5 = r4
            com.obwhatsapp.support.ReportSpamDialogFragment r0 = com.obwhatsapp.support.ReportSpamDialogFragment.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2.Afc(r0)
            return
        L_0x0095:
            java.lang.Object r10 = r14.A00
            X.3Ic r10 = (X.C63423Ic) r10
            long r6 = X.C13700nu.A01(r15)
            long r4 = r10.A01
            long r4 = r4 + r6
            r10.A01 = r4
            long r8 = r10.A02
            r11 = 100
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00ca
            r1 = 100
        L_0x00ae:
            int r0 = r10.A00
            int r0 = r0 + 5
            if (r1 >= r0) goto L_0x00b6
            if (r1 != r11) goto L_0x00bd
        L_0x00b6:
            r10.A00 = r1
            X.1qb r0 = r10.A09
            r0.AQ2(r4)
        L_0x00bd:
            X.1cs r4 = r10.A07
            if (r4 == 0) goto L_0x000f
            long r2 = r10.A01
            long r0 = r10.A03
            long r2 = r2 - r0
            r4.A0A(r2, r6)
            return
        L_0x00ca:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = (double) r4
            double r2 = r2 * r0
            double r0 = (double) r8
            double r2 = r2 / r0
            int r1 = (int) r2
            goto L_0x00ae
        L_0x00d2:
            java.lang.Object r1 = r14.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2
            X.AnonymousClass29T.A01(r1, r0)
            return
        L_0x00db:
            java.lang.Object r3 = r14.A00
            X.1Wc r3 = (X.C28441Wc) r3
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            java.lang.String r0 = "sync-request-handler/sendRequest preparing request failed - "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r15.getMessage()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.util.ArrayList r1 = X.AnonymousClass000.A0u()
            boolean r0 = r15 instanceof X.C803643o
            if (r0 == 0) goto L_0x0124
            r0 = r15
            X.43o r0 = (X.C803643o) r0
            java.util.List r0 = r0.throwables
            r1.addAll(r0)
        L_0x0102:
            java.util.Iterator r2 = r1.iterator()
        L_0x0106:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0128
            java.lang.Object r1 = r2.next()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            boolean r0 = r1 instanceof X.AnonymousClass1XT
            if (r0 != 0) goto L_0x011e
            boolean r0 = r1 instanceof X.AnonymousClass259
            if (r0 != 0) goto L_0x011e
            boolean r0 = r1 instanceof X.AnonymousClass1X9
            if (r0 == 0) goto L_0x0106
        L_0x011e:
            X.1Wd r0 = r3.A02
            r0.A05(r1)
            return
        L_0x0124:
            r1.add(r15)
            goto L_0x0102
        L_0x0128:
            java.lang.String r1 = "sync-request-handler/sendRequest unexpected exception was caught! Only SyncdFailedException, SyncdRetriableException and SyncdFatalException are allowed here."
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r15)
            throw r0
        L_0x0130:
            java.lang.Object r0 = r14.A00
            com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1 r0 = (com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1) r0
            java.lang.Object r1 = r0.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 1
            X.AnonymousClass29T.A01(r1, r0)
            return
        L_0x013d:
            java.lang.Object r4 = r14.A00
            X.1WD r4 = (X.AnonymousClass1WD) r4
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            r0 = 1
            X.C18450wi.A0H(r15, r0)
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            java.util.Iterator r2 = r15.iterator()
        L_0x014f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0164
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.4WM r0 = (X.AnonymousClass4WM) r0
            int r0 = r0.A00
            if (r0 != 0) goto L_0x014f
            r3.add(r1)
            goto L_0x014f
        L_0x0164:
            X.3uL r0 = new X.3uL
            r0.<init>(r3)
            r4.accept(r0)
            return
        L_0x016d:
            java.lang.Object r0 = r14.A00
            X.1XP r0 = (X.AnonymousClass1XP) r0
            X.1XS r0 = r0.A0E
            r0.A04(r15)
            return
        L_0x0177:
            java.lang.Object r0 = r14.A00
            com.obwhatsapp.WaPreferenceFragment r0 = (com.obwhatsapp.WaPreferenceFragment) r0
            X.2KO r1 = r0.A00
            r0 = 3
            X.AnonymousClass29T.A01(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxNConsumerShape154S0100000_2_I1.accept(java.lang.Object):void");
    }
}

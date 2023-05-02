package com.facebook.redex;

public class RunnableRunnableShape0S1400000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public RunnableRunnableShape0S1400000_I0(Object obj, Object obj2, Object obj3, Object obj4, String str, int i2) {
        this.A05 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A04 = str;
        this.A03 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        if (r5.A0A.A0A(r1) == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.A05
            switch(r0) {
                case 0: goto L_0x005f;
                case 1: goto L_0x0069;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r8.A00
            com.obwhatsapp.support.ReportSpamDialogFragment r5 = (com.obwhatsapp.support.ReportSpamDialogFragment) r5
            java.lang.Object r0 = r8.A01
            X.0sH r0 = (X.C16010sH) r0
            java.lang.String r7 = r8.A04
            java.lang.Object r4 = r8.A02
            java.lang.Object r3 = r8.A03
            X.0rv r6 = r0.A0E
            X.0sL r6 = (X.C16050sL) r6
            X.0rt r0 = r5.A09
            int r1 = r0.A02(r6)
            r0 = 3
            if (r1 != r0) goto L_0x0055
            X.0uk r0 = r5.A03
            X.0sL r1 = r0.A02(r6)
            if (r1 != 0) goto L_0x0056
            java.lang.String r1 = "reportSpamDialogFragment/nullParent/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0so r2 = r5.A00
            r1 = 1
            java.lang.String r0 = "reportSpamDialogFragment/nullParent"
            r2.AcB(r0, r7, r1)
        L_0x0041:
            X.0sO r0 = r5.A0A
            boolean r0 = r0.A0A(r6)
            if (r0 == 0) goto L_0x0055
        L_0x0049:
            X.0pt r2 = r5.A01
            r1 = 11
            com.facebook.redex.RunnableRunnableShape11S0200000_I0_9 r0 = new com.facebook.redex.RunnableRunnableShape11S0200000_I0_9
            r0.<init>(r4, r1, r3)
            r2.A0K(r0)
        L_0x0055:
            return
        L_0x0056:
            X.0sO r0 = r5.A0A
            boolean r0 = r0.A0A(r1)
            if (r0 != 0) goto L_0x0049
            goto L_0x0041
        L_0x005f:
            java.lang.Object r0 = r8.A00
            X.0y8 r0 = (X.C19260y8) r0
            X.1GG r0 = r0.A00
            r0.A00()
            return
        L_0x0069:
            java.lang.Object r4 = r8.A00
            com.obwhatsapp.notification.DirectReplyService r4 = (com.obwhatsapp.notification.DirectReplyService) r4
            java.lang.Object r3 = r8.A01
            X.3pe r3 = (X.C74043pe) r3
            java.lang.String r2 = r8.A04
            java.lang.Object r1 = r8.A02
            X.0sH r1 = (X.C16010sH) r1
            java.lang.Object r0 = r8.A03
            android.content.Intent r0 = (android.content.Intent) r0
            com.obwhatsapp.notification.DirectReplyService.A01(r0, r1, r3, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S1400000_I0.run():void");
    }
}

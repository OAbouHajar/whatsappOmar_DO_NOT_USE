package com.facebook.redex;

import X.AnonymousClass68X;

public class IDxPCallbackShape69S0200000_3_I1 implements AnonymousClass68X {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxPCallbackShape69S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        ((X.C112785jQ) r0).A07.setChecked(r1);
        r2.A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        r5 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        if (r5 != 1440) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        r2.A1P(r7.A01, com.obwhatsapp.R.plurals.plurals0102);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        if (r5 != 1441) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        X.C110115dX.A12(r2, r7.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r1 = (X.C118515uo) r1.A00;
        r4 = new com.facebook.redex.IDxDListenerShape160S0100000_3_I1(r2, 23);
        r3 = new com.facebook.redex.IDxDListenerShape160S0100000_3_I1(r2, 24);
        r2 = r1.A03;
        r1 = r1.A01;
        r0 = r2.A03(r1, r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bc, code lost:
        if (r0 != null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00be, code lost:
        r0 = r2.A02(r1, r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c2, code lost:
        if (r0 != null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c4, code lost:
        r0 = X.AnonymousClass5xE.A00(r1, r3, r1.getString(com.obwhatsapp.R.string.str1031));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cf, code lost:
        r0.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AWL(X.AnonymousClass2HJ r7) {
        /*
            r6 = this;
            int r0 = r6.A02
            switch(r0) {
                case 2: goto L_0x0018;
                case 3: goto L_0x0005;
                case 4: goto L_0x0055;
                case 5: goto L_0x006a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r6.A01
            X.1Z7 r2 = (X.AnonymousClass1Z7) r2
            if (r7 != 0) goto L_0x0011
            java.lang.String r0 = "on_success"
            r2.A00(r0)
            return
        L_0x0011:
            r1 = 0
            int r0 = r7.A00
            X.C112855jo.A09(r2, r1, r0)
            return
        L_0x0018:
            java.lang.Object r3 = r6.A01
            X.1Z7 r3 = (X.AnonymousClass1Z7) r3
            if (r7 == 0) goto L_0x004f
            java.util.HashMap r2 = X.AnonymousClass000.A0x()
            int r1 = r7.A00
            r0 = 1440(0x5a0, float:2.018E-42)
            if (r1 != r0) goto L_0x0039
            int r0 = r7.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "remaining_retries"
            r2.put(r0, r1)
            java.lang.String r0 = "pin_incorrect"
        L_0x0035:
            r3.A01(r0, r2)
            return
        L_0x0039:
            r0 = 1441(0x5a1, float:2.019E-42)
            if (r1 != r0) goto L_0x004b
            long r0 = r7.A02
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "next_retry_ts"
            r2.put(r0, r1)
            java.lang.String r0 = "pin_rate_limited"
            goto L_0x0035
        L_0x004b:
            X.C112855jo.A09(r3, r2, r1)
            return
        L_0x004f:
            java.lang.String r0 = "on_success"
            r3.A00(r0)
            return
        L_0x0055:
            java.lang.Object r1 = r6.A00
            com.facebook.redex.IDxPListenerShape115S0200000_3_I1 r1 = (com.facebook.redex.IDxPListenerShape115S0200000_3_I1) r1
            java.lang.Object r2 = r6.A01
            com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment r2 = (com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment) r2
            r2.A1N()
            if (r7 != 0) goto L_0x0089
            java.lang.Object r0 = r1.A00
            X.5uo r0 = (X.C118515uo) r0
            X.682 r0 = r0.A08
            r1 = 1
            goto L_0x007e
        L_0x006a:
            java.lang.Object r1 = r6.A00
            com.facebook.redex.IDxPListenerShape115S0200000_3_I1 r1 = (com.facebook.redex.IDxPListenerShape115S0200000_3_I1) r1
            java.lang.Object r2 = r6.A01
            com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment r2 = (com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment) r2
            r2.A1N()
            if (r7 != 0) goto L_0x0089
            java.lang.Object r0 = r1.A00
            X.5uo r0 = (X.C118515uo) r0
            X.682 r0 = r0.A08
            r1 = 0
        L_0x007e:
            X.5jQ r0 = (X.C112785jQ) r0
            androidx.appcompat.widget.SwitchCompat r0 = r0.A07
            r0.setChecked(r1)
            r2.A1C()
            return
        L_0x0089:
            int r5 = r7.A00
            r0 = 1440(0x5a0, float:2.018E-42)
            if (r5 != r0) goto L_0x0098
            int r1 = r7.A01
            r0 = 2131755266(0x7f100102, float:1.9141406E38)
            r2.A1P(r1, r0)
            return
        L_0x0098:
            r0 = 1441(0x5a1, float:2.019E-42)
            if (r5 != r0) goto L_0x00a2
            long r0 = r7.A02
            X.C110115dX.A12(r2, r0)
            return
        L_0x00a2:
            java.lang.Object r1 = r1.A00
            X.5uo r1 = (X.C118515uo) r1
            r0 = 23
            com.facebook.redex.IDxDListenerShape160S0100000_3_I1 r4 = new com.facebook.redex.IDxDListenerShape160S0100000_3_I1
            r4.<init>(r2, r0)
            r0 = 24
            com.facebook.redex.IDxDListenerShape160S0100000_3_I1 r3 = new com.facebook.redex.IDxDListenerShape160S0100000_3_I1
            r3.<init>(r2, r0)
            X.5xE r2 = r1.A03
            X.0pL r1 = r1.A01
            X.02l r0 = r2.A03(r1, r4, r3, r5)
            if (r0 != 0) goto L_0x00cf
            X.02l r0 = r2.A02(r1, r4, r3, r5)
            if (r0 != 0) goto L_0x00cf
            r0 = 2131890225(0x7f121031, float:1.9415136E38)
            java.lang.String r0 = r1.getString(r0)
            X.02l r0 = X.AnonymousClass5xE.A00(r1, r3, r0)
        L_0x00cf:
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxPCallbackShape69S0200000_3_I1.AWL(X.2HJ):void");
    }
}

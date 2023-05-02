package com.facebook.redex;

import X.AnonymousClass1Vt;
import X.C112015ho;
import android.content.Context;
import android.view.View;

public class IDxCListenerShape0S1300000_3_I1 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public IDxCListenerShape0S1300000_3_I1(Context context, AnonymousClass1Vt r2, C112015ho r3, String str, int i2) {
        this.A04 = i2;
        this.A00 = r3;
        this.A01 = context;
        this.A02 = r2;
        this.A03 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x008b, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0092, code lost:
        if (r10.A08.A0D() != false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0094, code lost:
        r1 = X.C110105dW.A04(r8, com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.class);
        r1.putExtra("extra_setup_mode", 1);
        X.AnonymousClass22U.A00(r1, "mandateRequest");
        r8.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a7, code lost:
        r1 = r10.A0E;
        r2 = 1;
        r3 = 104;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b6, code lost:
        r10.A0A.A01(r8, r9, new X.C1201660o(r8, r9, r10, r4, r12), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        r3 = java.lang.Integer.valueOf(r0);
        r5 = null;
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0029, code lost:
        r1.AKT(r2, r3, r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            int r0 = r13.A04
            switch(r0) {
                case 0: goto L_0x002d;
                case 1: goto L_0x00c3;
                case 2: goto L_0x004c;
                case 3: goto L_0x006b;
                case 4: goto L_0x007b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r13.A00
            X.5ho r3 = (X.C112015ho) r3
            java.lang.Object r2 = r13.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r13.A02
            X.1Vt r1 = (X.AnonymousClass1Vt) r1
            java.lang.String r4 = r13.A03
            r0 = 5
            android.content.Intent r0 = com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A02(r2, r1, r4, r0)
            r2.startActivity(r0)
            X.61W r1 = r3.A0E
            java.lang.Integer r2 = X.C13680ns.A0Y()
            r0 = 117(0x75, float:1.64E-43)
        L_0x0023:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r5 = 0
            r6 = 1
        L_0x0029:
            r1.AKT(r2, r3, r4, r5, r6)
            return
        L_0x002d:
            java.lang.Object r3 = r13.A00
            X.5ho r3 = (X.C112015ho) r3
            java.lang.Object r2 = r13.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r13.A02
            X.1Vt r1 = (X.AnonymousClass1Vt) r1
            java.lang.String r4 = r13.A03
            r0 = 2
            android.content.Intent r0 = com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A02(r2, r1, r4, r0)
            r2.startActivity(r0)
            X.61W r1 = r3.A0E
            java.lang.Integer r2 = X.C13680ns.A0Y()
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x0023
        L_0x004c:
            java.lang.Object r3 = r13.A00
            X.5ho r3 = (X.C112015ho) r3
            java.lang.Object r2 = r13.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r13.A02
            X.1Vt r1 = (X.AnonymousClass1Vt) r1
            java.lang.String r4 = r13.A03
            r0 = 6
            android.content.Intent r0 = com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A02(r2, r1, r4, r0)
            r2.startActivity(r0)
            X.61W r1 = r3.A0E
            java.lang.Integer r2 = X.C13680ns.A0Y()
            r0 = 118(0x76, float:1.65E-43)
            goto L_0x0023
        L_0x006b:
            java.lang.Object r10 = r13.A00
            X.5ho r10 = (X.C112015ho) r10
            java.lang.Object r8 = r13.A01
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r9 = r13.A02
            X.1Vt r9 = (X.AnonymousClass1Vt) r9
            java.lang.String r4 = r13.A03
            r12 = 1
            goto L_0x008b
        L_0x007b:
            java.lang.Object r10 = r13.A00
            X.5ho r10 = (X.C112015ho) r10
            java.lang.Object r8 = r13.A01
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r9 = r13.A02
            X.1Vt r9 = (X.AnonymousClass1Vt) r9
            java.lang.String r4 = r13.A03
            r12 = 8
        L_0x008b:
            X.175 r0 = r10.A08
            boolean r0 = r0.A0D()
            r6 = 1
            if (r0 != 0) goto L_0x00b6
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.class
            android.content.Intent r1 = X.C110105dW.A04(r8, r0)
            java.lang.String r0 = "extra_setup_mode"
            r1.putExtra(r0, r6)
            java.lang.String r0 = "mandateRequest"
            X.AnonymousClass22U.A00(r1, r0)
            r8.startActivity(r1)
        L_0x00a7:
            X.61W r1 = r10.A0E
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r0 = 104(0x68, float:1.46E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r5 = 0
            goto L_0x0029
        L_0x00b6:
            X.19i r1 = r10.A0A
            X.60o r7 = new X.60o
            r11 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = 0
            r1.A01(r8, r9, r7, r0)
            goto L_0x00a7
        L_0x00c3:
            java.lang.Object r3 = r13.A00
            X.5ho r3 = (X.C112015ho) r3
            java.lang.Object r2 = r13.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r13.A02
            X.1Vt r0 = (X.AnonymousClass1Vt) r0
            java.lang.String r5 = r13.A03
            r1 = 3
            android.content.Intent r0 = com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity.A02(r2, r0, r5, r1)
            r2.startActivity(r0)
            X.61W r2 = r3.A0E
            r7 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r6 = 0
            r2.AKT(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape0S1300000_3_I1.onClick(android.view.View):void");
    }
}

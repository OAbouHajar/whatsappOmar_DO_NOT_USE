package com.facebook.redex;

import X.AnonymousClass1Vt;
import X.AnonymousClass60S;
import X.C110715ei;
import X.C110755em;
import X.C41411vk;
import com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity;

public class IDxTObserverShape253S0100000_3_I1 implements C41411vk {
    public Object A00;
    public final int A01;

    public IDxTObserverShape253S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AUe(AnonymousClass1Vt r4) {
        switch (this.A01) {
            case 2:
                ((PaymentTransactionHistoryActivity) this.A00).A36();
                return;
            case 3:
                C110715ei.A01(r4, (C110715ei) this.A00);
                return;
            case 4:
                ((AnonymousClass60S) this.A00).A00(false);
                return;
            case 5:
            case 8:
                ((C110755em) this.A00).A0E(r4);
                return;
            case 7:
                C110755em r2 = (C110755em) this.A00;
                r2.A0f.A06("IN- HANDLE_SEND_AGAIN IndiaUpiPaymentTransactionDetailsViewModel#getPaymentTransactionObserver() trying to load the added txn");
                r2.A0E(r4);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r2 != 421) goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AUf(X.AnonymousClass1Vt r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x00a0;
                case 2: goto L_0x00b8;
                case 3: goto L_0x00c0;
                case 4: goto L_0x00cc;
                case 5: goto L_0x0040;
                case 6: goto L_0x0069;
                case 7: goto L_0x00d5;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A00
            X.5em r0 = (X.C110755em) r0
            r0.A0E(r6)
        L_0x000c:
            return
        L_0x000d:
            int r1 = r6.A02
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x000c
            boolean r0 = r6.A0F()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r4 = r5.A00
            com.obwhatsapp.payments.ui.BrazilPaymentActivity r4 = (com.obwhatsapp.payments.ui.BrazilPaymentActivity) r4
            X.5iw r3 = r4.A0O
            r2 = 2
        L_0x0020:
            int r0 = r4.A00
            r3.A06(r0, r2)
            r0 = 0
            r4.A0f = r0
            X.17Y r1 = r4.A0F
            X.1vk r0 = r4.A0h
            r1.A03(r0)
            return
        L_0x0030:
            int r1 = r6.A02
            r0 = 402(0x192, float:5.63E-43)
            java.lang.Object r4 = r5.A00
            com.obwhatsapp.payments.ui.BrazilPaymentActivity r4 = (com.obwhatsapp.payments.ui.BrazilPaymentActivity) r4
            X.5iw r3 = r4.A0O
            r2 = 3
            if (r1 != r0) goto L_0x0020
            r2 = 49
            goto L_0x0020
        L_0x0040:
            int r2 = r6.A02
            r1 = 402(0x192, float:5.63E-43)
            if (r2 == r1) goto L_0x0053
            r0 = 409(0x199, float:5.73E-43)
            if (r2 == r0) goto L_0x0060
            r0 = 411(0x19b, float:5.76E-43)
            if (r2 == r0) goto L_0x0060
            r0 = 421(0x1a5, float:5.9E-43)
            if (r2 == r0) goto L_0x0060
            goto L_0x0005
        L_0x0053:
            java.lang.Object r0 = r5.A00
            X.5em r0 = (X.C110755em) r0
            X.5sx r0 = r0.A07
            X.1Vt r0 = r0.A01
            int r0 = r0.A02
            if (r0 != r1) goto L_0x0060
            return
        L_0x0060:
            java.lang.Object r1 = r5.A00
            X.5em r1 = (X.C110755em) r1
            r0 = 0
            r1.A0S(r0)
            goto L_0x0005
        L_0x0069:
            int[] r1 = X.C115505pr.A00
            X.1yE r0 = X.C218315p.A05(r6)
            int r0 = X.C110115dX.A01(r0, r1)
            r4 = 3
            r3 = 1
            if (r0 == r3) goto L_0x0095
            r2 = 2
            if (r0 == r2) goto L_0x008a
            if (r0 != r4) goto L_0x000c
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationViewModel r0 = (com.obwhatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationViewModel) r0
            X.027 r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L_0x0086:
            r1.A09(r0)
            return
        L_0x008a:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationViewModel r0 = (com.obwhatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationViewModel) r0
            X.027 r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x0086
        L_0x0095:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationViewModel r0 = (com.obwhatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationViewModel) r0
            X.027 r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x0086
        L_0x00a0:
            java.lang.Object r2 = r5.A00
            com.obwhatsapp.payments.ui.IndiaUpiMandateHistoryActivity r2 = (com.obwhatsapp.payments.ui.IndiaUpiMandateHistoryActivity) r2
            X.1Vo r1 = r2.A06
            java.lang.String r0 = "payment transaction updated"
            r1.A04(r0)
            X.5el r2 = r2.A03
            X.0sq r1 = r2.A07
            X.64n r0 = new X.64n
            r0.<init>(r2)
            r1.Acl(r0)
            return
        L_0x00b8:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            r0.A36()
            return
        L_0x00c0:
            r0 = 0
            X.C18450wi.A0H(r6, r0)
            java.lang.Object r0 = r5.A00
            X.5ei r0 = (X.C110715ei) r0
            X.C110715ei.A01(r6, r0)
            return
        L_0x00cc:
            java.lang.Object r1 = r5.A00
            X.60S r1 = (X.AnonymousClass60S) r1
            r0 = 0
            r1.A00(r0)
            return
        L_0x00d5:
            java.lang.Object r3 = r5.A00
            X.5nF r3 = (X.C114175nF) r3
            X.1Vo r1 = r3.A0f
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN IndiaUpiPaymentTransactionDetailsViewModel#getPaymentTransactionObserver() txn update event is called"
            r1.A06(r0)
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x011c
            if (r6 == 0) goto L_0x011c
            boolean r0 = r6.A0A()
            if (r0 == 0) goto L_0x011c
            r0 = 101(0x65, float:1.42E-43)
            X.5nA r2 = new X.5nA
            r2.<init>(r0)
            java.lang.String r0 = r6.A0L
            r2.A02 = r0
            java.lang.String r0 = r3.A0D
            r2.A05 = r0
            boolean r0 = r6.A0F()
            if (r0 == 0) goto L_0x0119
            java.lang.String r0 = "SUCCESS"
        L_0x0103:
            r2.A04 = r0
            java.lang.String r1 = r6.A0J
            r0 = 0
            int r0 = X.C29501aj.A00(r1, r0)
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = "U13"
        L_0x0110:
            r2.A03 = r0
            X.C110755em.A01(r3, r2)
            return
        L_0x0116:
            java.lang.String r0 = "00"
            goto L_0x0110
        L_0x0119:
            java.lang.String r0 = "FAILURE"
            goto L_0x0103
        L_0x011c:
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN IndiaUpiPaymentTransactionDetailsViewModel#getPaymentTransactionObserver() trying to reload the updated txn"
            r1.A06(r0)
            r3.A0E(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxTObserverShape253S0100000_3_I1.AUf(X.1Vt):void");
    }
}

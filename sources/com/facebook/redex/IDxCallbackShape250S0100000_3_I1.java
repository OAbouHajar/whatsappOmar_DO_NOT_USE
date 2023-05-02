package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1TV;
import X.AnonymousClass2HJ;
import X.AnonymousClass5kl;
import X.AnonymousClass5xE;
import X.AnonymousClass5yB;
import X.C001000l;
import X.C005702l;
import X.C110115dX;
import X.C110655eb;
import X.C110755em;
import X.C112815jT;
import X.C114195nH;
import X.C117655tL;
import X.C117725tS;
import X.C119255wn;
import X.C1210163w;
import X.C1210363y;
import X.C13680ns;
import X.C14550pN;
import X.C30801cy;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.ReTosFragment;
import com.whatsapp.util.Log;

public class IDxCallbackShape250S0100000_3_I1 implements AnonymousClass1TV {
    public Object A00;
    public final int A01;

    public IDxCallbackShape250S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void A00(AnonymousClass2HJ r7) {
        ReTosFragment reTosFragment = (ReTosFragment) this.A00;
        reTosFragment.A1H(true);
        reTosFragment.A00.setVisibility(0);
        reTosFragment.A01.setVisibility(8);
        C001000l A0C = reTosFragment.A0C();
        if (A0C != null) {
            IDxDListenerShape160S0100000_3_I1 iDxDListenerShape160S0100000_3_I1 = new IDxDListenerShape160S0100000_3_I1(this, 22);
            AnonymousClass5yB r2 = new AnonymousClass5yB();
            C005702l A02 = reTosFragment.A05.A02(A0C, iDxDListenerShape160S0100000_3_I1, r2, r7.A00);
            if (A02 == null) {
                A02 = AnonymousClass5xE.A00(A0C, r2, reTosFragment.A0J(R.string.str1031));
            }
            A02.show();
        }
    }

    public void AWC(AnonymousClass2HJ r5) {
        switch (this.A01) {
            case 0:
                ((C14550pN) this.A00).A05.A0K(new C1210163w(this));
                return;
            case 1:
                AnonymousClass5kl r1 = (AnonymousClass5kl) this.A00;
                r1.Ac1();
                r1.A3n(r1.A08);
                return;
            case 2:
                C112815jT r3 = (C112815jT) this.A00;
                r3.A07.A0A(AnonymousClass000.A0g("incorrect format retry: get-methods request error: ", r5), (Throwable) null);
                r3.A3b();
                return;
            case 3:
                return;
            case 4:
                A00(r5);
                return;
            case 5:
                ((C110755em) this.A00).A09.A0B(C117725tS.A00(24));
                return;
            case 6:
                C30801cy A012 = C110655eb.A01((C110655eb) this.A00);
                Log.w(AnonymousClass000.A0g("PAY: BrazilMerchantDetailsViewModel removePayment/onRequestError. paymentNetworkError: ", r5));
                C117655tL r0 = new C117655tL(6);
                r0.A00 = R.string.str14e4;
                A012.A0B(r0);
                return;
            default:
                Log.i("DyiViewModel/delete-report/on-error");
                int i2 = r5.A00;
                C114195nH r02 = (C114195nH) this.A00;
                if (i2 == 404) {
                    C119255wn r2 = r02.A07;
                    String str = r02.A09;
                    synchronized (r2) {
                        r2.A05(str);
                    }
                    C119255wn.A01(r02.A02, r2, str);
                    return;
                }
                C110115dX.A0x(r02.A03, C13680ns.A0Y(), r5);
                return;
        }
    }

    public void AWI(AnonymousClass2HJ r5) {
        switch (this.A01) {
            case 0:
                ((C14550pN) this.A00).A05.A0K(new C1210363y(this));
                return;
            case 1:
                AnonymousClass5kl r1 = (AnonymousClass5kl) this.A00;
                r1.Ac1();
                r1.A3n(r1.A08);
                return;
            case 2:
                C112815jT r3 = (C112815jT) this.A00;
                r3.A07.A0A(AnonymousClass000.A0g("incorrect format retry: get-methods response error: ", r5), (Throwable) null);
                r3.A3b();
                return;
            case 3:
                ((C14550pN) this.A00).Ac1();
                return;
            case 4:
                A00(r5);
                return;
            case 5:
                ((C110755em) this.A00).A09.A0B(C117725tS.A00(24));
                return;
            case 6:
                C30801cy A012 = C110655eb.A01((C110655eb) this.A00);
                Log.i(AnonymousClass000.A0g("PAY: BrazilMerchantDetailsViewModel removePayment/onResponseError. paymentNetworkError: ", r5));
                C117655tL r0 = new C117655tL(6);
                r0.A00 = R.string.str14e4;
                A012.A0B(r0);
                return;
            default:
                Log.i("DyiViewModel/delete-report/on-error");
                C110115dX.A0x(((C114195nH) this.A00).A03, C13680ns.A0Y(), r5);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x015f, code lost:
        r10 = (X.C77583w1) r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AWJ(X.AnonymousClass2HK r10) {
        /*
            r9 = this;
            r4 = r9
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x0055;
                case 2: goto L_0x0088;
                case 3: goto L_0x009a;
                case 4: goto L_0x0124;
                case 5: goto L_0x015b;
                case 6: goto L_0x01b2;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.String r0 = "DyiViewModel/delete-report/on-success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r9.A00
            X.5nH r0 = (X.C114195nH) r0
            X.5wn r2 = r0.A07
            java.lang.String r1 = r0.A09
            monitor-enter(r2)
            r2.A05(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x0193
        L_0x0019:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x001c:
            java.lang.Object r2 = r9.A00
            X.5jS r2 = (X.C112805jS) r2
            r2.Ac1()
            X.3w0 r10 = (X.AnonymousClass3w0) r10
            java.util.List r1 = r10.A00
            if (r1 == 0) goto L_0x004a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x004a
            int r0 = X.C119405xi.A01(r1)
            X.1cl r0 = X.C110115dX.A0G(r1, r0)
            X.1tF r1 = r0.A08
            boolean r0 = r1 instanceof X.C111805hR
            if (r0 == 0) goto L_0x004a
            X.5hR r1 = (X.C111805hR) r1
            if (r1 == 0) goto L_0x004a
            X.60V r0 = r2.A0C
            r0.AhX(r1)
            r2.A3U(r1)
            return
        L_0x004a:
            X.0pt r1 = r2.A05
            X.63x r0 = new X.63x
            r0.<init>(r9)
            r1.A0K(r0)
            return
        L_0x0055:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0109
            java.lang.Object r3 = r9.A00
            X.5kl r3 = (X.AnonymousClass5kl) r3
            X.60V r0 = r3.A0C
            X.0wT r2 = r0.A03     // Catch:{ JSONException -> 0x0073 }
            org.json.JSONObject r1 = X.C110105dW.A0k(r2)     // Catch:{ JSONException -> 0x0073 }
            java.lang.String r0 = "smsVerifDataSentToPsp"
            r1.remove(r0)     // Catch:{ JSONException -> 0x0073 }
            java.lang.String r0 = "smsVerifData"
            r1.remove(r0)     // Catch:{ JSONException -> 0x0073 }
            X.C110105dW.A1J(r2, r1)     // Catch:{ JSONException -> 0x0073 }
            goto L_0x0079
        L_0x0073:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs deleteSmsVerificationData threw: "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0079:
            r3.A3H()
            r3.Ac1()
            android.content.Intent r1 = r3.A3j()
            r0 = 1
            r3.A2X(r1, r0)
            return
        L_0x0088:
            java.lang.Object r0 = r9.A00
            X.0pP r0 = (X.C14570pP) r0
            X.0sq r2 = r0.A05
            r0 = 0
            com.whatsapp.util.IDxATaskShape109S0100000_3_I1 r1 = new com.whatsapp.util.IDxATaskShape109S0100000_3_I1
            r1.<init>(r9, r0)
            java.lang.String[] r0 = new java.lang.String[r0]
            r2.Ack(r1, r0)
            return
        L_0x009a:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0109
            java.lang.Object r3 = r9.A00
            X.5ja r3 = (X.C112825ja) r3
            X.60V r1 = r3.A0C
            java.lang.String r0 = r1.A08()
            r4 = 1
            r1.A7n(r0, r4)
            r3.A3H()
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.class
            android.content.Intent r2 = X.C110105dW.A04(r3, r0)
            com.obwhatsapp.payments.ui.widget.PaymentView r0 = r3.A0X
            if (r0 == 0) goto L_0x00d5
            java.lang.String r0 = r0.getPaymentNote()
            r3.A0h = r0
            com.obwhatsapp.payments.ui.widget.PaymentView r0 = r3.A0X
            X.1lo r0 = r0.getPaymentBackground()
            r3.A0C = r0
            com.obwhatsapp.payments.ui.widget.PaymentView r1 = r3.A0X
            X.1jm r0 = r1.getStickerIfSelected()
            r3.A0c = r0
            java.lang.Integer r0 = r1.getStickerSendOrigin()
            r3.A0e = r0
        L_0x00d5:
            r3.A3M(r2)
            java.lang.String r1 = r3.A0g
            java.lang.String r0 = "payment_composer_icon"
            boolean r0 = r0.equals(r1)
            r1 = 3
            if (r0 == 0) goto L_0x00e5
            r1 = 10
        L_0x00e5:
            java.lang.String r0 = "extra_payments_entry_type"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "extra_is_first_payment_method"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "extra_skip_value_props_display"
            r2.putExtra(r0, r4)
            com.whatsapp.jid.UserJid r0 = r3.A0C
            java.lang.String r1 = X.C16030sJ.A03(r0)
            java.lang.String r0 = "extra_receiver_jid"
            r2.putExtra(r0, r1)
            r3.startActivity(r2)
            r3.finish()
            r3.Ac1()
            return
        L_0x0109:
            r2 = 2131889975(0x7f120f37, float:1.9414629E38)
            java.lang.Object r1 = r9.A00
            X.0pN r1 = (X.C14550pN) r1
            r0 = 2131366798(0x7f0a138e, float:1.83535E38)
            android.widget.TextView r0 = X.C13680ns.A0N(r1, r0)
            r0.setText(r2)
            r0 = 2131366797(0x7f0a138d, float:1.8353498E38)
            X.C13690nt.A1I(r1, r0)
            r1.Afg(r2)
            return
        L_0x0124:
            java.lang.Object r3 = r9.A00
            com.obwhatsapp.payments.ui.ReTosFragment r3 = (com.obwhatsapp.payments.ui.ReTosFragment) r3
            X.1Vo r2 = r3.A07
            java.lang.String r0 = "accept-tos/result="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            boolean r0 = r10.A02
            r1.append(r0)
            X.C110105dW.A1L(r2, r1)
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0151
            r0 = 1
            r3.A1H(r0)
            android.widget.Button r1 = r3.A00
            r0 = 0
            r1.setVisibility(r0)
            android.widget.ProgressBar r1 = r3.A01
            r0 = 8
            r1.setVisibility(r0)
            r3.A1C()
            return
        L_0x0151:
            r1 = 0
            X.2HJ r0 = new X.2HJ
            r0.<init>((int) r1)
            r9.A00(r0)
            return
        L_0x015b:
            boolean r0 = r10 instanceof X.C77583w1
            if (r0 == 0) goto L_0x01a2
            X.3w1 r10 = (X.C77583w1) r10
            java.util.List r0 = r10.A01
            if (r0 == 0) goto L_0x01a2
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01a2
            java.lang.Object r2 = r9.A00
            X.5em r2 = (X.C110755em) r2
            X.1Vo r1 = r2.A0f
            java.lang.String r0 = "BrazilConsumer/getTransactions/onResponseSuccess"
            r1.A04(r0)
            X.1lq r1 = r10.A00
            if (r1 == 0) goto L_0x019a
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0199
            java.lang.String r0 = r1.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0199
            X.1MA r3 = r2.A0d
            X.1lq r0 = r10.A00
            java.lang.String r7 = r0.A00
            r5 = 0
            r8 = r5
            r6 = r5
            r3.A01(r4, r5, r6, r7, r8)
            return
        L_0x0193:
            monitor-exit(r2)
            X.027 r0 = r0.A02
            X.C119255wn.A01(r0, r2, r1)
        L_0x0199:
            return
        L_0x019a:
            r0 = 0
            r2.A0S(r0)
            r2.A0T(r0)
            return
        L_0x01a2:
            java.lang.Object r0 = r9.A00
            X.5em r0 = (X.C110755em) r0
            X.1cy r1 = r0.A09
            r0 = 24
            X.5tS r0 = X.C117725tS.A00(r0)
            r1.A0B(r0)
            return
        L_0x01b2:
            java.lang.Object r0 = r9.A00
            X.5eb r0 = (X.C110655eb) r0
            X.1cy r3 = X.C110655eb.A01(r0)
            java.lang.String r0 = "PAY: BrazilMerchantDetailsViewModel removePayment Success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 2131891429(0x7f1214e5, float:1.9417578E38)
            r1 = 6
            X.5tL r0 = new X.5tL
            r0.<init>(r1)
            r0.A00 = r2
            r3.A0B(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCallbackShape250S0100000_3_I1.AWJ(X.2HK):void");
    }
}

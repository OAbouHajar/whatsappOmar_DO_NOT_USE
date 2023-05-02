package X;

import com.obwhatsapp.payments.actions.IDxNCallbackShape9S0300000_3_I1;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.util.Log;

/* renamed from: X.64R  reason: invalid class name */
public final /* synthetic */ class AnonymousClass64R implements Runnable {
    public final /* synthetic */ IndiaUpiSendPaymentActivity A00;

    public /* synthetic */ AnonymousClass64R(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        this.A00 = indiaUpiSendPaymentActivity;
    }

    public final void run() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A0t.A04("Getting PLE encryption key in background...");
        C14870pt r7 = indiaUpiSendPaymentActivity.A05;
        C112195i6 r4 = new C112195i6(indiaUpiSendPaymentActivity, indiaUpiSendPaymentActivity.A03, r7, indiaUpiSendPaymentActivity.A0H, indiaUpiSendPaymentActivity.A0B, indiaUpiSendPaymentActivity.A0K, indiaUpiSendPaymentActivity.A0M);
        C116215r0 r11 = new C116215r0(indiaUpiSendPaymentActivity);
        Log.i("PAY: getPleServerPublicKey called");
        C17190ug r3 = r4.A03;
        String A02 = r3.A02();
        C116455rP r12 = new C116455rP(new C118015tv(A02));
        C110105dW.A1H(r3, new IDxNCallbackShape9S0300000_3_I1(r4.A00, r4.A02, r4.A04, r4.A00, r4, r11, r12), r12.A00, A02);
    }
}

package X;

import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.obwhatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.64T  reason: invalid class name */
public final /* synthetic */ class AnonymousClass64T implements Runnable {
    public final /* synthetic */ AnonymousClass62O A00;

    public /* synthetic */ AnonymousClass64T(AnonymousClass62O r1) {
        this.A00 = r1;
    }

    public final void run() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00.A00;
        C18310wU r4 = indiaUpiSendPaymentActivity.A0M;
        PaymentView paymentView = indiaUpiSendPaymentActivity.A0X;
        String paymentNote = paymentView != null ? paymentView.getPaymentNote() : "";
        PaymentView paymentView2 = indiaUpiSendPaymentActivity.A0X;
        C30581cc A36 = indiaUpiSendPaymentActivity.A36(paymentNote, paymentView2 != null ? paymentView2.getMentionedJids() : null);
        UserJid userJid = indiaUpiSendPaymentActivity.A0C;
        AnonymousClass00B.A06(userJid);
        C28401Vy r1 = indiaUpiSendPaymentActivity.A0A;
        PaymentView paymentView3 = indiaUpiSendPaymentActivity.A0X;
        r4.A07(r1, paymentView3 != null ? paymentView3.getPaymentBackground() : null, userJid, A36);
    }
}

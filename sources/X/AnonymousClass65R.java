package X;

import android.os.Bundle;
import com.obwhatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.65R  reason: invalid class name */
public final /* synthetic */ class AnonymousClass65R implements Runnable {
    public final /* synthetic */ C35391lr A00;
    public final /* synthetic */ BrazilPaymentActivity A01;

    public /* synthetic */ AnonymousClass65R(C35391lr r1, BrazilPaymentActivity brazilPaymentActivity) {
        this.A01 = brazilPaymentActivity;
        this.A00 = r1;
    }

    public final void run() {
        BrazilPaymentActivity brazilPaymentActivity = this.A01;
        C35391lr r4 = this.A00;
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = new BrazilConfirmReceivePaymentFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putParcelable("args_payment_method", r4);
        brazilConfirmReceivePaymentFragment.A0T(A0D);
        paymentBottomSheet.A01 = brazilConfirmReceivePaymentFragment;
        brazilPaymentActivity.Afc(paymentBottomSheet);
    }
}

package X;

import android.os.Bundle;
import com.obwhatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.65M  reason: invalid class name */
public final /* synthetic */ class AnonymousClass65M implements Runnable {
    public final /* synthetic */ C14600pS A00;
    public final /* synthetic */ C35391lr A01;

    public /* synthetic */ AnonymousClass65M(C14600pS r1, C35391lr r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C35391lr r5 = this.A01;
        C14600pS r4 = this.A00;
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = new BrazilConfirmReceivePaymentFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putParcelable("args_payment_method", r5);
        brazilConfirmReceivePaymentFragment.A0T(A0D);
        paymentBottomSheet.A01 = brazilConfirmReceivePaymentFragment;
        r4.Afc(paymentBottomSheet);
    }
}

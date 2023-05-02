package X;

import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import com.obwhatsapp.payments.ui.ConfirmPaymentFragment;

/* renamed from: X.65S  reason: invalid class name */
public final /* synthetic */ class AnonymousClass65S implements Runnable {
    public final /* synthetic */ BrazilPaymentActivity A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass65S(BrazilPaymentActivity brazilPaymentActivity, String str) {
        this.A00 = brazilPaymentActivity;
        this.A01 = str;
    }

    public final void run() {
        BrazilPaymentActivity brazilPaymentActivity = this.A00;
        C30671cl A08 = C110115dX.A0H(brazilPaymentActivity.A0P).A08(this.A01);
        brazilPaymentActivity.Ac1();
        ConfirmPaymentFragment confirmPaymentFragment = brazilPaymentActivity.A0U;
        if (confirmPaymentFragment != null && A08 != null) {
            confirmPaymentFragment.AUY(A08);
        }
    }
}

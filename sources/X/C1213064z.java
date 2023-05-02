package X;

import android.widget.TextView;
import com.obwhatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.64z  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1213064z implements Runnable {
    public final /* synthetic */ PaymentView A00;

    public /* synthetic */ C1213064z(PaymentView paymentView) {
        this.A00 = paymentView;
    }

    public final void run() {
        PaymentView paymentView = this.A00;
        TextView textView = paymentView.A0I;
        if (textView != null) {
            textView.startAnimation(paymentView.A04);
        }
    }
}

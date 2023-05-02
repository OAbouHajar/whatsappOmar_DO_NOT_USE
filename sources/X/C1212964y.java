package X;

import android.widget.TextView;
import com.obwhatsapp.payments.ui.widget.PaymentAmountInputField;

/* renamed from: X.64y  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1212964y implements Runnable {
    public final /* synthetic */ PaymentAmountInputField A00;

    public /* synthetic */ C1212964y(PaymentAmountInputField paymentAmountInputField) {
        this.A00 = paymentAmountInputField;
    }

    public final void run() {
        PaymentAmountInputField paymentAmountInputField = this.A00;
        TextView textView = paymentAmountInputField.A0A;
        if (textView != null) {
            textView.startAnimation(paymentAmountInputField.A09);
        }
    }
}

package X;

import android.view.animation.Animation;
import android.widget.TextView;
import com.obwhatsapp.payments.ui.widget.PaymentAmountInputField;

/* renamed from: X.5fd  reason: invalid class name and case insensitive filesystem */
public class C111265fd extends C30551cZ {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ PaymentAmountInputField A01;

    public C111265fd(TextView textView, PaymentAmountInputField paymentAmountInputField) {
        this.A01 = paymentAmountInputField;
        this.A00 = textView;
    }

    public void onAnimationEnd(Animation animation) {
        this.A00.setVisibility(8);
    }
}

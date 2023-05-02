package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.5yj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119595yj implements View.OnClickListener {
    public final /* synthetic */ PaymentView A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C119595yj(PaymentView paymentView, boolean z2) {
        this.A00 = paymentView;
        this.A01 = z2;
    }

    public final void onClick(View view) {
        PaymentView paymentView = this.A00;
        boolean z2 = this.A01;
        C14870pt r1 = paymentView.A0R;
        int i2 = R.string.str0fea;
        if (z2) {
            i2 = R.string.str0fe9;
        }
        r1.A06(i2);
    }
}

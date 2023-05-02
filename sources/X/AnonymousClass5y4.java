package X;

import android.content.DialogInterface;
import com.obwhatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.5y4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5y4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ PaymentView A00;
    public final /* synthetic */ C34151jm A01;
    public final /* synthetic */ Integer A02;

    public /* synthetic */ AnonymousClass5y4(PaymentView paymentView, C34151jm r2, Integer num) {
        this.A00 = paymentView;
        this.A01 = r2;
        this.A02 = num;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        PaymentView paymentView = this.A00;
        C34151jm r2 = this.A01;
        Integer num = this.A02;
        C1205762e r0 = paymentView.A0u;
        if (r0 != null) {
            r0.A00(r2, num);
        }
    }
}

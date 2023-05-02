package X;

import com.obwhatsapp.payments.ui.PaymentContactPickerFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.65j  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1214065j implements Runnable {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ PaymentContactPickerFragment A01;

    public /* synthetic */ C1214065j(UserJid userJid, PaymentContactPickerFragment paymentContactPickerFragment) {
        this.A01 = paymentContactPickerFragment;
        this.A00 = userJid;
    }

    public final void run() {
        this.A01.A1y(this.A00);
    }
}

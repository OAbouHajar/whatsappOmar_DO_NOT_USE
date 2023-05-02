package X;

import com.obwhatsapp.payments.ui.PaymentContactPickerFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.65k  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1214165k implements Runnable {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ PaymentContactPickerFragment A01;

    public /* synthetic */ C1214165k(UserJid userJid, PaymentContactPickerFragment paymentContactPickerFragment) {
        this.A01 = paymentContactPickerFragment;
        this.A00 = userJid;
    }

    public final void run() {
        PaymentContactPickerFragment paymentContactPickerFragment = this.A01;
        UserJid userJid = this.A00;
        C001000l A0C = paymentContactPickerFragment.A0C();
        if (A0C != null) {
            A0C.setResult(-1, C13680ns.A09().putExtra("extra_invitee_jid", userJid.getRawString()));
            A0C.finish();
        }
    }
}

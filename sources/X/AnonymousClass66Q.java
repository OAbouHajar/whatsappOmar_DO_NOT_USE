package X;

import android.content.Intent;
import com.obwhatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.66Q  reason: invalid class name */
public final /* synthetic */ class AnonymousClass66Q implements Runnable {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A02;

    public /* synthetic */ AnonymousClass66Q(Intent intent, UserJid userJid, PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity) {
        this.A02 = paymentGroupParticipantPickerActivity;
        this.A01 = userJid;
        this.A00 = intent;
    }

    public final void run() {
        this.A02.A35(this.A00, this.A01);
    }
}

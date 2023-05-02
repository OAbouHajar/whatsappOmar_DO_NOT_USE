package X;

import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.66R  reason: invalid class name */
public final /* synthetic */ class AnonymousClass66R implements Runnable {
    public final /* synthetic */ C16010sH A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A02;

    public /* synthetic */ AnonymousClass66R(C16010sH r1, UserJid userJid, PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity) {
        this.A02 = paymentGroupParticipantPickerActivity;
        this.A01 = userJid;
        this.A00 = r1;
    }

    public final void run() {
        C14750ph r0;
        Intent A0v;
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A02;
        UserJid userJid = this.A01;
        C16010sH r7 = this.A00;
        paymentGroupParticipantPickerActivity.A05.A0H(C13700nu.A0F(paymentGroupParticipantPickerActivity.getResources(), paymentGroupParticipantPickerActivity.A05.A0E(paymentGroupParticipantPickerActivity.A03.A0A(userJid)), C13680ns.A1b(), 0, R.string.str105c), 0);
        paymentGroupParticipantPickerActivity.finish();
        if (C13690nt.A0E(paymentGroupParticipantPickerActivity) != null) {
            Bundle A0E = C13690nt.A0E(paymentGroupParticipantPickerActivity);
            A0v = r0.A0v(paymentGroupParticipantPickerActivity, r7);
            A0v.putExtras(A0E);
        } else {
            r0 = new C14750ph();
            A0v = r0.A0v(paymentGroupParticipantPickerActivity, r7);
        }
        paymentGroupParticipantPickerActivity.startActivity(A0v);
    }
}

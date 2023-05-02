package X;

import com.obwhatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.66L  reason: invalid class name */
public final /* synthetic */ class AnonymousClass66L implements Runnable {
    public final /* synthetic */ C28401Vy A00;
    public final /* synthetic */ C112765jH A01;
    public final /* synthetic */ PaymentView A02;

    public /* synthetic */ AnonymousClass66L(C28401Vy r1, C112765jH r2, PaymentView paymentView) {
        this.A01 = r2;
        this.A02 = paymentView;
        this.A00 = r1;
    }

    public final void run() {
        C112765jH r5 = this.A01;
        PaymentView paymentView = this.A02;
        C28401Vy r4 = this.A00;
        C18310wU r3 = r5.A0M;
        C30581cc A36 = r5.A36(paymentView.getPaymentNote(), paymentView.getMentionedJids());
        C15830rv r1 = r5.A0E;
        r3.A07(r4, (C35361lo) null, C16030sJ.A0L(r1) ? r5.A0G : UserJid.of(r1), A36);
    }
}

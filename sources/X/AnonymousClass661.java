package X;

import com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.661  reason: invalid class name */
public final /* synthetic */ class AnonymousClass661 implements Runnable {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ PaymentIncentiveViewModel A01;

    public /* synthetic */ AnonymousClass661(UserJid userJid, PaymentIncentiveViewModel paymentIncentiveViewModel) {
        this.A01 = paymentIncentiveViewModel;
        this.A00 = userJid;
    }

    public final void run() {
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A01;
        int A05 = paymentIncentiveViewModel.A05(this.A00);
        AnonymousClass027 r3 = paymentIncentiveViewModel.A02;
        AnonymousClass1GO r0 = paymentIncentiveViewModel.A06;
        r3.A09(AnonymousClass5xI.A01(new C53322fW(r0.A02(), r0.A03(), A05)));
    }
}

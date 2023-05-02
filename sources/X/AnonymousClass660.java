package X;

import com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.660  reason: invalid class name */
public final /* synthetic */ class AnonymousClass660 implements Runnable {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ PaymentIncentiveViewModel A01;

    public /* synthetic */ AnonymousClass660(UserJid userJid, PaymentIncentiveViewModel paymentIncentiveViewModel) {
        this.A01 = paymentIncentiveViewModel;
        this.A00 = userJid;
    }

    public final void run() {
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A01;
        UserJid userJid = this.A00;
        C42711yJ A0L = C110115dX.A0L(paymentIncentiveViewModel.A05);
        if (A0L != null && C110115dX.A18(A0L.A07)) {
            AnonymousClass1GO r3 = paymentIncentiveViewModel.A06;
            C53322fW A002 = r3.A00();
            paymentIncentiveViewModel.A00.A09(AnonymousClass5xI.A00(A002));
            r3.A07(new C53342fY(new C1201160j(userJid, paymentIncentiveViewModel), r3, A0L.A0A(A002.A01, A002.A02)), false);
        }
    }
}

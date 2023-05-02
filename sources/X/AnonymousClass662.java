package X;

import com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;

/* renamed from: X.662  reason: invalid class name */
public final /* synthetic */ class AnonymousClass662 implements Runnable {
    public final /* synthetic */ PaymentIncentiveViewModel A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ AnonymousClass662(PaymentIncentiveViewModel paymentIncentiveViewModel, boolean z2) {
        this.A00 = paymentIncentiveViewModel;
        this.A01 = z2;
    }

    public final void run() {
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A00;
        boolean z2 = this.A01;
        C42711yJ A0L = C110115dX.A0L(paymentIncentiveViewModel.A05);
        if (A0L != null && C110115dX.A18(A0L.A07)) {
            AnonymousClass1GO r3 = paymentIncentiveViewModel.A06;
            C53322fW A002 = r3.A00();
            if (z2) {
                paymentIncentiveViewModel.A01.A09(AnonymousClass5xI.A00(A002));
            }
            r3.A07(new C53342fY(new C1201260k(paymentIncentiveViewModel, z2), r3, A0L.A0A(A002.A01, A002.A02)), false);
        }
    }
}

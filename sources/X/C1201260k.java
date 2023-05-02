package X;

import com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.60k  reason: invalid class name and case insensitive filesystem */
public class C1201260k implements C53432fh {
    public final /* synthetic */ PaymentIncentiveViewModel A00;
    public final /* synthetic */ boolean A01;

    public C1201260k(PaymentIncentiveViewModel paymentIncentiveViewModel, boolean z2) {
        this.A00 = paymentIncentiveViewModel;
        this.A01 = z2;
    }

    public void AQQ() {
        Log.e("PAY: PaymentIncentiveViewModel/syncIncentiveData/on-error");
        if (this.A01) {
            PaymentIncentiveViewModel paymentIncentiveViewModel = this.A00;
            paymentIncentiveViewModel.A01.A09(AnonymousClass5xI.A02(paymentIncentiveViewModel.A06.A00(), AnonymousClass000.A0a("Failed syncing incentive")));
        }
    }

    public void AY6(C53322fW r3) {
        if (this.A01) {
            this.A00.A01.A09(AnonymousClass5xI.A01(r3));
        }
    }
}

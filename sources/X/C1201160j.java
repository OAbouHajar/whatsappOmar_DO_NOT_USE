package X;

import com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.60j  reason: invalid class name and case insensitive filesystem */
public class C1201160j implements C53432fh {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ PaymentIncentiveViewModel A01;

    public C1201160j(UserJid userJid, PaymentIncentiveViewModel paymentIncentiveViewModel) {
        this.A01 = paymentIncentiveViewModel;
        this.A00 = userJid;
    }

    public void AQQ() {
        Log.e("PAY: PaymentIncentiveViewModel/syncIncentiveData/on-error");
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A01;
        paymentIncentiveViewModel.A00.A09(AnonymousClass5xI.A02(paymentIncentiveViewModel.A06.A00(), AnonymousClass000.A0a("Failed syncing incentive")));
    }

    public void AY6(C53322fW r6) {
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A01;
        UserJid userJid = this.A00;
        AnonymousClass027 r4 = paymentIncentiveViewModel.A00;
        int A05 = paymentIncentiveViewModel.A05(userJid);
        AnonymousClass1GO r0 = paymentIncentiveViewModel.A06;
        r4.A09(AnonymousClass5xI.A01(new C53322fW(r0.A02(), r0.A03(), A05)));
    }
}

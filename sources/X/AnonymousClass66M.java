package X;

import com.facebook.redex.IDxNConsumerShape42S0200000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.AddPaymentMethodBottomSheet;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.66M  reason: invalid class name */
public final /* synthetic */ class AnonymousClass66M implements Runnable {
    public final /* synthetic */ C28401Vy A00;
    public final /* synthetic */ AddPaymentMethodBottomSheet A01;
    public final /* synthetic */ BrazilPaymentActivity A02;

    public /* synthetic */ AnonymousClass66M(C28401Vy r1, AddPaymentMethodBottomSheet addPaymentMethodBottomSheet, BrazilPaymentActivity brazilPaymentActivity) {
        this.A02 = brazilPaymentActivity;
        this.A01 = addPaymentMethodBottomSheet;
        this.A00 = r1;
    }

    public final void run() {
        C16010sH r0;
        BrazilPaymentActivity brazilPaymentActivity = this.A02;
        AddPaymentMethodBottomSheet addPaymentMethodBottomSheet = this.A01;
        C28401Vy r3 = this.A00;
        addPaymentMethodBottomSheet.A1C();
        if (!brazilPaymentActivity.A0O.A04() || (r0 = brazilPaymentActivity.A0A) == null || !r0.A0H()) {
            brazilPaymentActivity.A3M(r3, false);
            return;
        }
        brazilPaymentActivity.Afq(R.string.str13db);
        brazilPaymentActivity.A04.A01(new IDxNConsumerShape42S0200000_3_I1(r3, 2, brazilPaymentActivity), brazilPaymentActivity.A05.A06);
    }
}

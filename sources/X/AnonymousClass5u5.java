package X;

import android.content.Intent;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.5u5  reason: invalid class name */
public class AnonymousClass5u5 {
    public final /* synthetic */ IndiaUpiPaymentSettingsActivity A00;
    public final /* synthetic */ PaymentBottomSheet A01;

    public AnonymousClass5u5(IndiaUpiPaymentSettingsActivity indiaUpiPaymentSettingsActivity, PaymentBottomSheet paymentBottomSheet) {
        this.A00 = indiaUpiPaymentSettingsActivity;
        this.A01 = paymentBottomSheet;
    }

    public void A00(String str) {
        IndiaUpiPaymentSettingsActivity indiaUpiPaymentSettingsActivity = this.A00;
        indiaUpiPaymentSettingsActivity.A2e("IndiaUpiPaymentTransactionConfirmationFragment");
        Intent A04 = C110105dW.A04(indiaUpiPaymentSettingsActivity, IndiaUpiPaymentTransactionDetailsActivity.class);
        A04.putExtra("extra_transaction_id", str);
        A04.putExtra("referral_screen", "payments_transaction_confirmation");
        A04.putExtra("extra_payment_flow_entry_point", "qr_code_scan_prompt");
        A04.putExtra("extra_open_transaction_confirmation_fragment", false);
        A04.setFlags(67108864);
        indiaUpiPaymentSettingsActivity.startActivity(A04);
    }
}

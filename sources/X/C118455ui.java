package X;

import android.app.Activity;
import android.content.Context;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.5ui  reason: invalid class name and case insensitive filesystem */
public class C118455ui {
    public IndiaUpiSendPaymentToVpaFragment A00;
    public PaymentBottomSheet A01;
    public final Activity A02;
    public final Context A03;
    public final C14600pS A04;
    public final C227919h A05;
    public final C227819g A06;
    public final String A07;

    public C118455ui(Activity activity, C14600pS r2, C227919h r3, C227819g r4, String str) {
        this.A02 = activity;
        this.A03 = activity;
        this.A07 = str;
        this.A04 = r2;
        this.A06 = r4;
        this.A05 = r3;
    }

    public void A00(PaymentBottomSheet paymentBottomSheet) {
        IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment = this.A00;
        if (indiaUpiSendPaymentToVpaFragment == null) {
            indiaUpiSendPaymentToVpaFragment = new IndiaUpiSendPaymentToVpaFragment();
            this.A00 = indiaUpiSendPaymentToVpaFragment;
        }
        indiaUpiSendPaymentToVpaFragment.A0O = this;
        if (paymentBottomSheet != null) {
            this.A01 = paymentBottomSheet;
            paymentBottomSheet.A1O(indiaUpiSendPaymentToVpaFragment);
            return;
        }
        PaymentBottomSheet paymentBottomSheet2 = new PaymentBottomSheet();
        this.A01 = paymentBottomSheet2;
        paymentBottomSheet2.A01 = this.A00;
        this.A04.Afc(paymentBottomSheet2);
    }
}

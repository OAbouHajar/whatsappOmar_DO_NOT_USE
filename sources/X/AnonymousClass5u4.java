package X;

import android.text.TextUtils;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.5u4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5u4 {
    public final /* synthetic */ C35431lv A00;
    public final /* synthetic */ IndiaUpiCheckOrderDetailsActivity A01;

    public /* synthetic */ AnonymousClass5u4(C35431lv r1, IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity) {
        this.A01 = indiaUpiCheckOrderDetailsActivity;
        this.A00 = r1;
    }

    public final void A00(AnonymousClass2HJ r6, String str, String str2, String str3, String str4) {
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = this.A01;
        C35431lv r3 = this.A00;
        Class<String> cls = String.class;
        indiaUpiCheckOrderDetailsActivity.Ac1();
        if (r6 == null) {
            indiaUpiCheckOrderDetailsActivity.A0K = str;
            indiaUpiCheckOrderDetailsActivity.A0M = str4;
            indiaUpiCheckOrderDetailsActivity.A09 = C110105dW.A0J(C110105dW.A0L(), cls, str2, "upiHandle");
            if (!TextUtils.isEmpty(str3)) {
                indiaUpiCheckOrderDetailsActivity.A07 = C110105dW.A0J(C110105dW.A0L(), cls, str3, "accountHolderName");
            }
            if (indiaUpiCheckOrderDetailsActivity.A0C == null || !indiaUpiCheckOrderDetailsActivity.A0C.A0C(1916)) {
                PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
                paymentBottomSheet.A01 = indiaUpiCheckOrderDetailsActivity.A3m(r3.A02, paymentBottomSheet);
                indiaUpiCheckOrderDetailsActivity.Afc(paymentBottomSheet);
                indiaUpiCheckOrderDetailsActivity.A3w(paymentBottomSheet);
                return;
            }
            C28401Vy r0 = r3.A02;
            indiaUpiCheckOrderDetailsActivity.A0A = r0;
            indiaUpiCheckOrderDetailsActivity.A4B(r0, str2);
            return;
        }
        indiaUpiCheckOrderDetailsActivity.Afg(R.string.str1031);
    }
}

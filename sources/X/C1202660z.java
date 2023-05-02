package X;

import android.content.Intent;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.60z  reason: invalid class name and case insensitive filesystem */
public class C1202660z implements C1222468v {
    public final /* synthetic */ BrazilPaymentCardDetailsActivity A00;

    public C1202660z(BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity) {
        this.A00 = brazilPaymentCardDetailsActivity;
    }

    public void AOB(C35391lr r3) {
        Log.i("PAY: BrazilPaymentCardDetailsActivity BrazilGetVerificationMethods - onCardVerified");
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A00;
        brazilPaymentCardDetailsActivity.Ac1();
        C110115dX.A0z(brazilPaymentCardDetailsActivity.A0C.A01(), r3, this, 13);
    }

    public void AWW(AnonymousClass2HJ r9, List list) {
        int i2;
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A00;
        brazilPaymentCardDetailsActivity.Ac1();
        if (r9 == null) {
            if (list != null && !list.isEmpty()) {
                int A002 = C110115dX.A00(brazilPaymentCardDetailsActivity, list);
                JSONArray A02 = brazilPaymentCardDetailsActivity.A03.A02(list);
                if (A02 != null && !AnonymousClass5x7.A01(list)) {
                    int A0A = BrazilPayBloksActivity.A0A(list);
                    Intent A01 = brazilPaymentCardDetailsActivity.A0D.A01(brazilPaymentCardDetailsActivity, (C35391lr) brazilPaymentCardDetailsActivity.A08, C110105dW.A0M(brazilPaymentCardDetailsActivity.A0C, list, A002, A0A), A02.toString(), A0A);
                    C111675hA.A03(A01, "referral_screen", "payment_method_details");
                    brazilPaymentCardDetailsActivity.Ag3(A01, 1);
                    return;
                }
            }
            i2 = 0;
        } else {
            int i3 = r9.A00;
            i2 = (i3 == 443 || i3 == 10229 || (list != null && !list.isEmpty())) ? r9.A00 : -233;
        }
        Log.i(C13680ns.A0c(i2, "PAY: BrazilGetVerificationMethods Error: "));
        brazilPaymentCardDetailsActivity.A04.A01(brazilPaymentCardDetailsActivity, brazilPaymentCardDetailsActivity.A0C, brazilPaymentCardDetailsActivity.A02, i2, R.string.str0fd1).show();
    }
}

package X;

import android.content.Intent;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import java.util.HashMap;

/* renamed from: X.5l0  reason: invalid class name and case insensitive filesystem */
public class C112985l0 extends AnonymousClass62A {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass626 A01;

    public C112985l0(AnonymousClass626 r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public void AM8() {
        BrazilPaymentActivity brazilPaymentActivity = this.A01.A03;
        String A02 = brazilPaymentActivity.A0T.A02(true);
        Intent A04 = C110105dW.A04(brazilPaymentActivity, BrazilPayBloksActivity.class);
        if (A02 == null) {
            A02 = "brpay_p_add_card";
        }
        A04.putExtra("screen_name", A02);
        C111675hA.A03(A04, "referral_screen", "payment_method_picker");
        if (this.A00 == 1) {
            HashMap A0x = AnonymousClass000.A0x();
            A0x.put("add_debit_only", "1");
            A04.putExtra("screen_params", A0x);
        }
        brazilPaymentActivity.startActivity(A04);
    }
}

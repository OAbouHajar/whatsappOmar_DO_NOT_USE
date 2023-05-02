package X;

import android.content.Intent;
import com.facebook.redex.IDxSListenerShape310S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.610  reason: invalid class name */
public class AnonymousClass610 implements C1222468v {
    public final /* synthetic */ BrazilPaymentActivity A00;
    public final /* synthetic */ String A01;

    public AnonymousClass610(BrazilPaymentActivity brazilPaymentActivity, String str) {
        this.A00 = brazilPaymentActivity;
        this.A01 = str;
    }

    public void AOB(C35391lr r4) {
        Log.i("PAY: BrazilPaymentActivity BrazilGetVerificationMethods - onCardVerified");
        this.A00.A0P.A01().A02(new IDxSListenerShape310S0100000_3_I1(this, 1), r4);
    }

    public void AWW(AnonymousClass2HJ r12, List list) {
        int i2;
        C14710pd r7;
        C1200860g r5;
        BrazilPaymentActivity brazilPaymentActivity = this.A00;
        brazilPaymentActivity.Ac1();
        if (r12 == null) {
            if (list == null || list.isEmpty()) {
                brazilPaymentActivity.A0O.A05(brazilPaymentActivity.A00, "error_code", (long) 0);
                r5 = brazilPaymentActivity.A08;
                r7 = brazilPaymentActivity.A0C;
                i2 = R.string.str0f44;
                r5.A01(brazilPaymentActivity, r7, brazilPaymentActivity.A0B, 0, i2).show();
            }
            int A002 = C110115dX.A00(brazilPaymentActivity, list);
            JSONArray A02 = brazilPaymentActivity.A07.A02(list);
            if (A02 != null && !AnonymousClass5x7.A01(list)) {
                int A0A = BrazilPayBloksActivity.A0A(list);
                AnonymousClass638 A0M = C110105dW.A0M(brazilPaymentActivity.A0C, list, A002, A0A);
                String str = this.A01;
                String obj = A02.toString();
                C35391lr r72 = (C35391lr) C110115dX.A0H(brazilPaymentActivity.A0P).A08(str);
                if (r72 != null) {
                    Intent A012 = brazilPaymentActivity.A0T.A01(brazilPaymentActivity, r72, A0M, obj, A0A);
                    C111675hA.A03(A012, "referral_screen", "verify_to_pay");
                    brazilPaymentActivity.Ag3(A012, 1);
                    return;
                }
                return;
            }
        }
        Log.i(C13680ns.A0c(0, "PAY: BrazilGetVerificationMethods Error: "));
        brazilPaymentActivity.A0O.A05(brazilPaymentActivity.A00, "error_code", (long) 0);
        r5 = brazilPaymentActivity.A08;
        r7 = brazilPaymentActivity.A0C;
        i2 = R.string.str0fd1;
        r5.A01(brazilPaymentActivity, r7, brazilPaymentActivity.A0B, 0, i2).show();
    }
}

package X;

import android.text.TextUtils;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiCheckBalanceActivity;

/* renamed from: X.649  reason: invalid class name */
public final /* synthetic */ class AnonymousClass649 implements Runnable {
    public final /* synthetic */ IndiaUpiCheckBalanceActivity A00;

    public /* synthetic */ AnonymousClass649(IndiaUpiCheckBalanceActivity indiaUpiCheckBalanceActivity) {
        this.A00 = indiaUpiCheckBalanceActivity;
    }

    public final void run() {
        IndiaUpiCheckBalanceActivity indiaUpiCheckBalanceActivity = this.A00;
        AnonymousClass29T.A00(indiaUpiCheckBalanceActivity, 10);
        String A0C = indiaUpiCheckBalanceActivity.A0C.A0C();
        if (!TextUtils.isEmpty(A0C)) {
            indiaUpiCheckBalanceActivity.A01 = C110105dW.A0J(C110105dW.A0L(), String.class, C111345g2.A1b(indiaUpiCheckBalanceActivity), "upiSequenceNumber");
            indiaUpiCheckBalanceActivity.A3j(A0C);
            indiaUpiCheckBalanceActivity.A02.A00 = indiaUpiCheckBalanceActivity.A01;
            return;
        }
        indiaUpiCheckBalanceActivity.A2h(indiaUpiCheckBalanceActivity.getString(R.string.str13db));
        indiaUpiCheckBalanceActivity.A0A.A00();
    }
}

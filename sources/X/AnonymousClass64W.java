package X;

import android.text.TextUtils;
import com.obwhatsapp.payments.ui.IndiaUpiStepUpActivity;

/* renamed from: X.64W  reason: invalid class name */
public final /* synthetic */ class AnonymousClass64W implements Runnable {
    public final /* synthetic */ IndiaUpiStepUpActivity A00;

    public /* synthetic */ AnonymousClass64W(IndiaUpiStepUpActivity indiaUpiStepUpActivity) {
        this.A00 = indiaUpiStepUpActivity;
    }

    public final void run() {
        IndiaUpiStepUpActivity indiaUpiStepUpActivity = this.A00;
        AnonymousClass29T.A00(indiaUpiStepUpActivity, 10);
        String A0C = indiaUpiStepUpActivity.A0C.A0C();
        if (!TextUtils.isEmpty(A0C)) {
            String A1b = C111345g2.A1b(indiaUpiStepUpActivity);
            indiaUpiStepUpActivity.A05 = A1b;
            C35521m4 r0 = indiaUpiStepUpActivity.A00;
            indiaUpiStepUpActivity.A3g((C111805hR) r0.A08, A0C, r0.A0B, A1b, (String) C110105dW.A0d(r0.A09), 3);
            indiaUpiStepUpActivity.A04.A02 = indiaUpiStepUpActivity.A05;
            return;
        }
        indiaUpiStepUpActivity.A02.A00();
    }
}

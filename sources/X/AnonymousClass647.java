package X;

import android.text.TextUtils;
import com.obwhatsapp.payments.ui.IndiaUpiChangePinActivity;

/* renamed from: X.647  reason: invalid class name */
public final /* synthetic */ class AnonymousClass647 implements Runnable {
    public final /* synthetic */ IndiaUpiChangePinActivity A00;

    public /* synthetic */ AnonymousClass647(IndiaUpiChangePinActivity indiaUpiChangePinActivity) {
        this.A00 = indiaUpiChangePinActivity;
    }

    public final void run() {
        IndiaUpiChangePinActivity indiaUpiChangePinActivity = this.A00;
        indiaUpiChangePinActivity.A01.setVisibility(0);
        indiaUpiChangePinActivity.A00.setVisibility(0);
        String A0C = indiaUpiChangePinActivity.A0C.A0C();
        if (!TextUtils.isEmpty(A0C)) {
            String A1b = C111345g2.A1b(indiaUpiChangePinActivity);
            indiaUpiChangePinActivity.A03 = A1b;
            C35521m4 r0 = indiaUpiChangePinActivity.A02;
            indiaUpiChangePinActivity.A3g((C111805hR) r0.A08, A0C, r0.A0B, A1b, (String) C39841t9.A02(r0.A09), 2);
            return;
        }
        indiaUpiChangePinActivity.A0A.A00();
    }
}

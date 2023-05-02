package X;

import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;

/* renamed from: X.64A  reason: invalid class name */
public final /* synthetic */ class AnonymousClass64A implements Runnable {
    public final /* synthetic */ IndiaUpiDeviceBindStepActivity A00;

    public /* synthetic */ AnonymousClass64A(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        this.A00 = indiaUpiDeviceBindStepActivity;
    }

    public final void run() {
        IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = this.A00;
        indiaUpiDeviceBindStepActivity.A0T = "2";
        indiaUpiDeviceBindStepActivity.markStepDone(indiaUpiDeviceBindStepActivity.A06);
        indiaUpiDeviceBindStepActivity.markStepProcessing(indiaUpiDeviceBindStepActivity.A04);
        indiaUpiDeviceBindStepActivity.markStepDisabled(indiaUpiDeviceBindStepActivity.A05);
        C13700nu.A0L(indiaUpiDeviceBindStepActivity, indiaUpiDeviceBindStepActivity.A07, R.drawable.ic_verify_bank);
    }
}

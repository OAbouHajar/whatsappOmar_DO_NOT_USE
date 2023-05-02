package X;

import com.obwhatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;

/* renamed from: X.64C  reason: invalid class name */
public final /* synthetic */ class AnonymousClass64C implements Runnable {
    public final /* synthetic */ IndiaUpiDeviceBindStepActivity A00;

    public /* synthetic */ AnonymousClass64C(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        this.A00 = indiaUpiDeviceBindStepActivity;
    }

    public final void run() {
        IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = this.A00;
        if (!indiaUpiDeviceBindStepActivity.A0c) {
            indiaUpiDeviceBindStepActivity.A0e.A06("IndiaUpiDeviceBindActivity: device binding canceled");
            indiaUpiDeviceBindStepActivity.A0E.AKS(1, 117, "device_binding", (String) null);
            indiaUpiDeviceBindStepActivity.A0c = true;
            indiaUpiDeviceBindStepActivity.A0F.A02 = null;
            C111345g2.A1w(indiaUpiDeviceBindStepActivity);
            indiaUpiDeviceBindStepActivity.A0T = false;
        }
    }
}

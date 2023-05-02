package X;

import android.hardware.camera2.CaptureFailure;

/* renamed from: X.5uy  reason: invalid class name and case insensitive filesystem */
public class C118615uy {
    public CaptureFailure A00;

    public int A00() {
        CaptureFailure captureFailure = this.A00;
        if (captureFailure != null) {
            return captureFailure.getReason();
        }
        return -1;
    }

    public void A01(CaptureFailure captureFailure) {
        this.A00 = captureFailure;
    }
}

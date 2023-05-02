package X;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.5uz  reason: invalid class name and case insensitive filesystem */
public class C118625uz {
    public TotalCaptureResult A00;

    public Object A00(CaptureResult.Key key) {
        TotalCaptureResult totalCaptureResult = this.A00;
        if (totalCaptureResult != null) {
            return totalCaptureResult.get(key);
        }
        return null;
    }

    public void A01(TotalCaptureResult totalCaptureResult) {
        this.A00 = totalCaptureResult;
    }
}

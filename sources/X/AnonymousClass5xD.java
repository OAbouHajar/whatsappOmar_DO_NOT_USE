package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;

/* renamed from: X.5xD  reason: invalid class name */
public class AnonymousClass5xD {
    public final CameraCaptureSession A00;

    public AnonymousClass5xD(CameraCaptureSession cameraCaptureSession) {
        this.A00 = cameraCaptureSession;
    }

    public static void A01(CameraDevice cameraDevice, AnonymousClass5zO r3, List list) {
        cameraDevice.createCaptureSession(list, new C110205dg(r3), (Handler) null);
    }

    public void A02() {
        this.A00.abortCaptures();
    }

    public void A03() {
        this.A00.close();
    }

    public void A04(CaptureRequest captureRequest, AnonymousClass69K r5) {
        this.A00.capture(captureRequest, r5 != null ? new C110195df(this, r5) : null, (Handler) null);
    }

    public void A05(CaptureRequest captureRequest, AnonymousClass69K r5) {
        this.A00.setRepeatingRequest(captureRequest, r5 != null ? new C110195df(this, r5) : null, (Handler) null);
    }
}

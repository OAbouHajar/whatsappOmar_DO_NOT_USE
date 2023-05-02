package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.5df  reason: invalid class name and case insensitive filesystem */
public class C110195df extends CameraCaptureSession.CaptureCallback {
    public final C118615uy A00 = new C118615uy();
    public final C118625uz A01 = new C118625uz();
    public final AnonymousClass69K A02;
    public final /* synthetic */ AnonymousClass5xD A03;

    public C110195df(AnonymousClass5xD r2, AnonymousClass69K r3) {
        this.A03 = r2;
        this.A02 = r3;
    }

    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        C118625uz r2 = this.A01;
        r2.A01(totalCaptureResult);
        this.A02.AO8(this.A03, r2);
    }

    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        C118615uy r2 = this.A00;
        r2.A01(captureFailure);
        this.A02.AO9(r2, this.A03);
    }

    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j2, long j3) {
        CaptureRequest captureRequest2 = captureRequest;
        long j4 = j2;
        long j5 = j3;
        super.onCaptureStarted(cameraCaptureSession, captureRequest2, j4, j5);
        this.A02.AOA(captureRequest2, this.A03, j4, j5);
    }
}

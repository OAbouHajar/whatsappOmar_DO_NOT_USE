package X;

import android.hardware.camera2.CameraDevice;
import com.whatsapp.util.Log;

/* renamed from: X.3LK  reason: invalid class name */
public class AnonymousClass3LK extends CameraDevice.StateCallback {
    public final /* synthetic */ AnonymousClass2P8 A00;

    public AnonymousClass3LK(AnonymousClass2P8 r1) {
        this.A00 = r1;
    }

    public void onClosed(CameraDevice cameraDevice) {
        AnonymousClass2P8 r1 = this.A00;
        r1.A00 = 0;
        Log.i("voip/video/VoipCamera/ cameraDevice closed");
        if (r1.A07) {
            r1.A07 = false;
            if (r1.startOnCameraThread() != 0) {
                r1.cameraEventsDispatcher.A02();
            }
        }
    }

    public void onDisconnected(CameraDevice cameraDevice) {
        AnonymousClass2P8 r1 = this.A00;
        if (cameraDevice == r1.A02) {
            Log.i("voip/video/VoipCamera/ cameraDevice disconnected");
            r1.stopPeriodicCameraCallbackCheck();
            r1.cameraEventsDispatcher.A01();
        }
    }

    public void onError(CameraDevice cameraDevice, int i2) {
        Log.i(C13680ns.A0c(i2, "voip/video/VoipCamera/ cameraDevice error "));
        this.A00.cameraEventsDispatcher.A02();
    }

    public void onOpened(CameraDevice cameraDevice) {
        Log.i("voip/video/VoipCamera/ camera opened");
        AnonymousClass2P8 r1 = this.A00;
        r1.A00 = 2;
        r1.A02 = cameraDevice;
        if (r1.videoPort != null && r1.A09() != 0) {
            r1.cameraEventsDispatcher.A02();
        }
    }
}

package com.whatsapp.voipcalling.camera;

import X.AnonymousClass2P8;
import android.hardware.camera2.CameraDevice;

public class VoipCameraApi2$StopCameraRunnable implements Runnable {
    public final CameraDevice closingCameraDevice;
    public final /* synthetic */ AnonymousClass2P8 this$0;

    public VoipCameraApi2$StopCameraRunnable(AnonymousClass2P8 r1, CameraDevice cameraDevice) {
        this.this$0 = r1;
        this.closingCameraDevice = cameraDevice;
    }

    public void run() {
        this.closingCameraDevice.close();
        AnonymousClass2P8.A0I.set(false);
    }
}

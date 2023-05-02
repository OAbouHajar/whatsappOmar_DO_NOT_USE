package com.mod2.flash;

import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import com.mod2.libs.TService;

public class FlashLampService extends TService {
    private Camera camera;

    public void onServiceBind(Intent intent) {
    }

    public void onServiceCreate(Context context) {
    }

    public void onStart(Intent intent, int i2, int i3) {
        if (this.camera == null) {
            this.camera = Camera.open();
            Camera.Parameters parameters = this.camera.getParameters();
            parameters.setFlashMode("torch");
            this.camera.setParameters(parameters);
            return;
        }
        this.camera.release();
        this.camera = null;
        stopService(intent);
    }
}

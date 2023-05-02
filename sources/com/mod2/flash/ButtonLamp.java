package com.mod2.flash;

import android.content.Context;
import android.hardware.Camera;
import android.util.AttributeSet;
import com.mod2.libs.TImageMod;

public class ButtonLamp extends TImageMod {
    private Camera.Parameters CamParam;
    private Camera vCamera;

    public ButtonLamp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onClick(String str) {
    }

    public void onPushOFF(String str) {
        try {
            this.CamParam.setFlashMode("off");
            this.vCamera.setParameters(this.CamParam);
            this.vCamera.release();
            DoPushOFF();
        } catch (Exception e2) {
        }
    }

    public void onPushON(String str) {
        try {
            this.vCamera = Camera.open();
            this.CamParam = this.vCamera.getParameters();
            this.CamParam.setFlashMode("torch");
            this.vCamera.setParameters(this.CamParam);
            this.vCamera.startPreview();
            DoPushON();
        } catch (Exception e2) {
        }
    }
}

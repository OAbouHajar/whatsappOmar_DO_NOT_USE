package com.obwhatsapp.calling.camera;

import X.C448926b;
import X.C51932cX;
import android.os.Handler;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import org.pjsip.PjCamera;

public class IDxEListenerShape62S0100000_2_I0 extends C51932cX {
    public Object A00;
    public final int A01;

    public IDxEListenerShape62S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AO2(VoipPhysicalCamera voipPhysicalCamera, int i2) {
        if (2 - this.A01 != 0) {
            super.AO2(voipPhysicalCamera, i2);
            return;
        }
        VoipCameraManager voipCameraManager = (VoipCameraManager) this.A00;
        int i3 = 2;
        if (voipPhysicalCamera instanceof PjCamera) {
            i3 = 1;
        }
        voipCameraManager.clearStoredRawCameraInfo(i2, i3);
    }

    public void AOi(VoipPhysicalCamera voipPhysicalCamera) {
        if (2 - this.A01 != 0) {
            super.AOi(voipPhysicalCamera);
        } else {
            ((VoipCameraManager) this.A00).closeCurrentCamera(voipPhysicalCamera);
        }
    }

    public void AQl(VoipPhysicalCamera voipPhysicalCamera) {
        Handler handler;
        int i2;
        switch (this.A01) {
            case 0:
                handler = ((C448926b) this.A00).A02;
                i2 = 1;
                break;
            case 1:
                handler = ((VoipActivityV2) this.A00).A0F;
                i2 = 11;
                break;
            default:
                super.AQl(voipPhysicalCamera);
                return;
        }
        handler.sendEmptyMessage(i2);
    }

    public void AX4(VoipPhysicalCamera voipPhysicalCamera) {
        Handler handler;
        int i2;
        switch (this.A01) {
            case 0:
                handler = ((C448926b) this.A00).A02;
                i2 = 2;
                break;
            case 1:
                handler = ((VoipActivityV2) this.A00).A0F;
                i2 = 12;
                break;
            default:
                super.AX4(voipPhysicalCamera);
                return;
        }
        handler.sendEmptyMessage(i2);
    }

    public void AZM(VoipPhysicalCamera voipPhysicalCamera) {
        Handler handler;
        int i2;
        switch (this.A01) {
            case 0:
                handler = ((C448926b) this.A00).A02;
                i2 = 2;
                break;
            case 1:
                handler = ((VoipActivityV2) this.A00).A0F;
                i2 = 12;
                break;
            default:
                super.AZM(voipPhysicalCamera);
                return;
        }
        handler.sendEmptyMessage(i2);
    }
}

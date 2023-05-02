package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass2V3;
import X.C13680ns;
import X.C49062Qp;
import android.hardware.Camera;
import com.whatsapp.util.Log;
import org.pjsip.PjCamera;

public class IDxECallbackShape319S0100000_2_I0 implements Camera.ErrorCallback {
    public Object A00;
    public final int A01;

    public IDxECallbackShape319S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onError(int i2, Camera camera) {
        if (this.A01 != 0) {
            ((PjCamera) this.A00).lambda$startOnCameraThread$0(i2, camera);
            return;
        }
        C49062Qp r3 = (C49062Qp) this.A00;
        synchronized (r3) {
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append("cameraview/start-camera camera error:");
            A0o.append(i2);
            A0o.append(" takingpicture:");
            A0o.append(r3.A0R);
            A0o.append(" recording:");
            A0o.append(r3.A0P);
            A0o.append(" inpreview:");
            A0o.append(r3.A0M);
            Log.w(A0o.toString());
            if (i2 == 100) {
                r3.A07();
                r3.A09.post(new RunnableRunnableShape5S0100000_I0_4((Object) r3, 18));
            } else if (i2 == 2) {
                Camera camera2 = r3.A07;
                if (camera2 != null) {
                    camera2.release();
                }
                r3.A07 = null;
                Exception exc = new Exception("CameraCustomException: Camera error evicted");
                Log.i(C13680ns.A0c(2, "cameraview/on-error "));
                AnonymousClass2V3 r0 = r3.A0F;
                if (r0 != null) {
                    r0.AO0(exc, 2);
                }
            }
        }
    }
}

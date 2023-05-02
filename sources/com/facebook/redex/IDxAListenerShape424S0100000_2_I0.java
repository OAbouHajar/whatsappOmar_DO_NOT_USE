package com.facebook.redex;

import X.AnonymousClass0S9;
import X.AnonymousClass0X0;
import X.C49062Qp;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;

public class IDxAListenerShape424S0100000_2_I0 implements SurfaceTexture.OnFrameAvailableListener {
    public Object A00;
    public final int A01;

    public IDxAListenerShape424S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.A01 != 0) {
            ((VoipPhysicalCamera) this.A00).notifyFrameAvailable();
            return;
        }
        C49062Qp r3 = (C49062Qp) this.A00;
        AnonymousClass0S9 r1 = r3.A0D;
        if (r1 != null && r3.A03 != null && r3.A0E != null && r3.A0C != null && r3.A0P) {
            r1.A02();
            r3.A03.updateTexImage();
            SurfaceTexture surfaceTexture2 = r3.A03;
            float[] fArr = r3.A0Z;
            surfaceTexture2.getTransformMatrix(fArr);
            GLES20.glViewport(0, 0, r3.getWidth(), r3.getHeight());
            r3.A0C.A00(r3.A02, fArr);
            r3.A0D.A04();
            r3.A0E.A02();
            GLES20.glViewport(0, 0, r3.A0E.A01(), r3.A0E.A00());
            r3.A0C.A00(r3.A02, AnonymousClass0X0.A00);
            r3.A0E.A04();
        }
    }
}

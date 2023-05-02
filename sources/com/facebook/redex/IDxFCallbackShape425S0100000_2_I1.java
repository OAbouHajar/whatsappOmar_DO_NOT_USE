package com.facebook.redex;

import X.C49062Qp;
import X.C56542np;
import android.hardware.Camera;
import android.os.Handler;

public class IDxFCallbackShape425S0100000_2_I1 implements Camera.AutoFocusCallback {
    public Object A00;
    public final int A01;

    public IDxFCallbackShape425S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onAutoFocus(boolean z2, Camera camera) {
        if (this.A01 != 0) {
            C56542np r4 = (C56542np) this.A00;
            Handler handler = r4.A04;
            Runnable runnable = r4.A0L;
            if (handler != null) {
                handler.postDelayed(runnable, 2000);
            } else {
                r4.postDelayed(runnable, 2000);
            }
        } else {
            ((C49062Qp) this.A00).A0F.AN1(z2);
        }
    }
}

package com.facebook.redex;

import com.facebook.msys.mci.Execution;
import com.whatsapp.voipcalling.Voip;

public class RunnableRunnableShape0S0001000_I0 implements Runnable {
    public int A00;
    public final int A01;

    public RunnableRunnableShape0S0001000_I0(int i2, int i3) {
        this.A01 = i3;
        if (i3 != 0) {
            this.A00 = i2;
        } else {
            this.A00 = i2;
        }
    }

    public void run() {
        int i2 = this.A01;
        int i3 = this.A00;
        switch (i2) {
            case 0:
                Execution.nativeStartExecutor(i3);
                return;
            case 1:
                Voip.notifyAudioRouteChange(i3);
                return;
            case 2:
                Voip.cancelVideoUpgrade(i3);
                return;
            default:
                Voip.rejectVideoUpgrade(i3);
                return;
        }
    }
}

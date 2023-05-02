package com.facebook.redex;

import android.os.Process;
import com.whatsapp.aborthooks.AbortHooks;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;

public class RunnableRunnableShape0S0000000_I0 implements Runnable {
    public final int A00;

    public RunnableRunnableShape0S0000000_I0(int i2) {
        this.A00 = i2;
    }

    public final void run() {
        switch (this.A00) {
            case 0:
                AbortHooks.init();
                return;
            case 1:
                Log.rotate();
                return;
            case 3:
                Voip.acceptVideoUpgrade();
                return;
            case 4:
                Voip.joinCallLink();
                return;
            case 5:
                Voip.requestVideoUpgrade();
                return;
            case 6:
                Voip.turnCameraOff();
                return;
            case 7:
                Voip.turnCameraOn();
                return;
            case 8:
                Voip.groupCallBufferProcessMessages();
                return;
            case 13:
                Process.killProcess(Process.myPid());
                return;
            default:
                return;
        }
    }
}

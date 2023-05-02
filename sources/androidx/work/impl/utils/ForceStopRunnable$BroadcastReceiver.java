package androidx.work.impl.utils;

import X.C06530Wm;
import X.C10610hP;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    public static final String A00 = C06530Wm.A01("ForceStopRunnable$Rcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            C06530Wm A002 = C06530Wm.A00();
            String str = A00;
            if (A002.A00 <= 2) {
                Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
            }
            C10610hP.A00(context);
        }
    }
}

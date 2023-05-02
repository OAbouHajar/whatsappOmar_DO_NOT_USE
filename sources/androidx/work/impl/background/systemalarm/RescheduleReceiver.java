package androidx.work.impl.background.systemalarm;

import X.AnonymousClass000;
import X.AnonymousClass022;
import X.C06530Wm;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

public class RescheduleReceiver extends BroadcastReceiver {
    public static final String A00 = C06530Wm.A01("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        C06530Wm A002 = C06530Wm.A00();
        String str = A00;
        A002.A02(str, AnonymousClass000.A0g("Received intent ", intent));
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                AnonymousClass022 A01 = AnonymousClass022.A01(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                synchronized (AnonymousClass022.A0D) {
                    A01.A00 = goAsync;
                    if (A01.A08) {
                        goAsync.finish();
                        A01.A00 = null;
                    }
                }
            } catch (IllegalStateException e2) {
                C06530Wm.A00();
                Log.e(str, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
        } else {
            Intent intent2 = new Intent(context, SystemAlarmService.class);
            intent2.setAction("ACTION_RESCHEDULE");
            context.startService(intent2);
        }
    }
}

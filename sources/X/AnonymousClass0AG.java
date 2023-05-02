package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.0AG  reason: invalid class name */
public abstract class AnonymousClass0AG extends BroadcastReceiver {
    public static final String A00 = C06530Wm.A01("ConstraintProxy");

    public void onReceive(Context context, Intent intent) {
        C06530Wm.A00().A02(A00, AnonymousClass000.A0g("onReceive : ", intent));
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}

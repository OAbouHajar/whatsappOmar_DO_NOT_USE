package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.0Wc  reason: invalid class name */
public class AnonymousClass0Wc {
    public static final String A00 = C06530Wm.A01("Alarms");

    public static void A00(Context context, WorkDatabase workDatabase, AnonymousClass0R5 r7, long j2) {
        C13140lX A0G = workDatabase.A0G();
        AnonymousClass0RF AGO = A0G.AGO(r7);
        if (AGO != null) {
            int i2 = AGO.A01;
            A01(context, r7, i2);
            A02(context, r7, i2, j2);
            return;
        }
        int A002 = new AnonymousClass0QA(workDatabase).A00();
        A0G.AIQ(new AnonymousClass0RF(r7.A00, r7.A01, A002));
        A02(context, r7, A002, j2);
    }

    public static void A01(Context context, AnonymousClass0R5 r7, int i2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        C08050cx.A00(intent, r7);
        int i3 = 536870912;
        if (Build.VERSION.SDK_INT >= 23) {
            i3 = 603979776;
        }
        PendingIntent service = PendingIntent.getService(context, i2, intent, i3);
        if (service != null && alarmManager != null) {
            C06530Wm A002 = C06530Wm.A00();
            String str = A00;
            StringBuilder A0r = AnonymousClass000.A0r("Cancelling existing alarm with (workSpecId, systemId) (");
            AnonymousClass000.A1H(r7, A0r);
            A0r.append(i2);
            A002.A02(str, AnonymousClass000.A0h(")", A0r));
            alarmManager.cancel(service);
        }
    }

    public static void A02(Context context, AnonymousClass0R5 r6, int i2, long j2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i3 = Build.VERSION.SDK_INT;
        int i4 = 134217728;
        if (i3 >= 23) {
            i4 = 201326592;
        }
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        C08050cx.A00(intent, r6);
        PendingIntent service = PendingIntent.getService(context, i2, intent, i4);
        if (alarmManager == null) {
            return;
        }
        if (i3 >= 19) {
            AnonymousClass0MK.A00(alarmManager, service, 0, j2);
        } else {
            alarmManager.set(0, j2, service);
        }
    }
}

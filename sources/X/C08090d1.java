package X;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.0d1  reason: invalid class name and case insensitive filesystem */
public class C08090d1 implements C13220lf {
    public static final String A01 = C06530Wm.A01("SystemAlarmScheduler");
    public final Context A00;

    public C08090d1(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public void A61(String str) {
        Context context = this.A00;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        context.startService(intent);
    }

    public boolean AHZ() {
        return true;
    }

    public void Ad3(C007303i... r8) {
        for (C007303i r4 : r8) {
            C06530Wm.A00().A02(A01, AnonymousClass000.A0h(r4.A0J, AnonymousClass000.A0r("Scheduling work with workSpecId ")));
            Context context = this.A00;
            AnonymousClass0R5 A002 = AnonymousClass0MO.A00(r4);
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            C08050cx.A00(intent, A002);
            context.startService(intent);
        }
    }
}

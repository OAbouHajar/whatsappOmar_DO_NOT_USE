package X;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.concurrent.Executor;

/* renamed from: X.0fj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C09570fj implements Runnable {
    public final /* synthetic */ AnonymousClass0d5 A00;

    public /* synthetic */ C09570fj(AnonymousClass0d5 r1) {
        this.A00 = r1;
    }

    public final void run() {
        String str;
        C06530Wm r2;
        StringBuilder sb;
        AnonymousClass0d5 r22 = this.A00;
        AnonymousClass0R5 r9 = r22.A08;
        String str2 = r9.A01;
        if (r22.A00 < 2) {
            r22.A00 = 2;
            C06530Wm A002 = C06530Wm.A00();
            str = AnonymousClass0d5.A0C;
            A002.A02(str, AnonymousClass000.A0h(str2, AnonymousClass000.A0r("Stopping work for WorkSpec ")));
            Context context = r22.A04;
            Class<SystemAlarmService> cls = SystemAlarmService.class;
            Intent intent = new Intent(context, cls);
            intent.setAction("ACTION_STOP_WORK");
            C08050cx.A00(intent, r9);
            Executor executor = r22.A0A;
            C08060cy r4 = r22.A06;
            int i2 = r22.A03;
            C10330gx.A00(intent, r4, executor, i2);
            boolean A05 = r4.A04.A05(str2);
            r2 = C06530Wm.A00();
            if (A05) {
                StringBuilder A0r = AnonymousClass000.A0r("WorkSpec ");
                A0r.append(str2);
                r2.A02(str, AnonymousClass000.A0h(" needs to be rescheduled", A0r));
                Intent intent2 = new Intent(context, cls);
                intent2.setAction("ACTION_SCHEDULE_WORK");
                C08050cx.A00(intent2, r9);
                C10330gx.A00(intent2, r4, executor, i2);
                return;
            }
            sb = AnonymousClass000.A0r("Processor does not have WorkSpec ");
            sb.append(str2);
            str2 = ". No need to reschedule";
        } else {
            r2 = C06530Wm.A00();
            str = AnonymousClass0d5.A0C;
            sb = AnonymousClass000.A0r("Already stopped work for ");
        }
        r2.A02(str, AnonymousClass000.A0h(str2, sb));
    }
}

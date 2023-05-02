package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import com.obwhatsapp.AlarmBroadcastReceiver;
import com.whatsapp.util.Log;

/* renamed from: X.4X3  reason: invalid class name */
public abstract class AnonymousClass4X3 {
    public final Context A00;

    public AnonymousClass4X3(Context context) {
        this.A00 = context;
    }

    public PendingIntent A00(String str, int i2) {
        Context context = this.A00;
        return C42341xd.A01(context, 0, new Intent(str, (Uri) null, context, AlarmBroadcastReceiver.class), i2);
    }

    public void A01() {
        if (this instanceof AnonymousClass3hY) {
            AnonymousClass3hY r2 = (AnonymousClass3hY) this;
            Log.i("HourlyCronAction; setting hourly cron using alarms");
            if (r2.A00("com.obwhatsapp.action.HOURLY_CRON", 536870912) == null) {
                AlarmManager A04 = r2.A00.A04();
                if (A04 != null) {
                    A04.setInexactRepeating(3, 3600000 + SystemClock.elapsedRealtime(), 3600000, r2.A00("com.obwhatsapp.action.HOURLY_CRON", 0));
                    return;
                }
                Log.w("HourlyCronAction; setup skipped, AlarmManager is null");
            }
        }
    }

    public void A02(Intent intent) {
        if (this instanceof AnonymousClass3hY) {
            AnonymousClass3hY r5 = (AnonymousClass3hY) this;
            if (SystemClock.elapsedRealtime() - AnonymousClass3hY.A02 < 1800000) {
                Log.i("HourlyCronAction; too soon, skipping...");
                return;
            }
            Log.i("HourlyCronAction; executing hourly cron");
            for (C19170xs AS4 : r5.A01.A00) {
                AS4.AS4();
            }
            AnonymousClass3hY.A02 = SystemClock.elapsedRealtime();
            return;
        }
        throw C13680ns.A0m();
    }

    public boolean A03() {
        return true;
    }

    public boolean A04(Intent intent) {
        if (this instanceof AnonymousClass3hY) {
            return "com.obwhatsapp.action.HOURLY_CRON".equals(intent.getAction());
        }
        return false;
    }
}

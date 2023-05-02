package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.PowerManager;
import android.os.SystemClock;
import com.obwhatsapp.workers.ntp.NtpSyncWorker;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2wy  reason: invalid class name */
public class AnonymousClass2wy extends AnonymousClass4X3 {
    public final AnonymousClass01V A00;
    public final C16440t3 A01;
    public final C16980tz A02;
    public final C24361Fp A03;
    public final C14710pd A04;
    public final C23051Ah A05;

    public AnonymousClass2wy(Context context, AnonymousClass01V r2, C16440t3 r3, C16980tz r4, C24361Fp r5, C14710pd r6, C23051Ah r7) {
        super(context);
        this.A01 = r3;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r2;
        this.A05 = r7;
    }

    public void A01() {
        long j2;
        if (this.A04.A0E(C16620tM.A02, 170)) {
            Log.i("NtpAction; cancelling ntp sync using alarm manager.");
            PendingIntent A002 = A00("com.obwhatsapp.action.UPDATE_NTP", 536870912);
            if (A002 != null) {
                AlarmManager A042 = this.A00.A04();
                if (A042 != null) {
                    A042.cancel(A002);
                }
                A002.cancel();
            }
            Log.i("NtpAction; setting ntp sync using work manager.");
            C23051Ah r3 = this.A05;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C02940Gi r2 = new C02940Gi(NtpSyncWorker.class, timeUnit, timeUnit);
            r2.A03.add("tag.whatsapp.time.ntp");
            AnonymousClass03k A003 = r2.A00();
            AnonymousClass12P r4 = r3.A02;
            new AnonymousClass04Q(AnonymousClass03z.KEEP, (AnonymousClass022) r4.get(), "name.whatsapp.time.ntp", Collections.singletonList(A003), (List) null).A03();
            SharedPreferences.Editor edit = r3.A01.A00("ntp-scheduler").edit();
            synchronized (r4) {
                j2 = r4.A00;
            }
            C13680ns.A0x(edit, "/ntp/work_manager_init", j2);
        } else {
            Log.i("NtpAction; cancelling ntp sync using work manager.");
            AnonymousClass12P r22 = this.A05.A02;
            ((AnonymousClass022) r22.get()).A0A("name.whatsapp.time.ntp");
            ((AnonymousClass022) r22.get()).A09("tag.whatsapp.time.ntp");
            Log.i("NtpAction; setting up ntp sync using alarm manager.");
            PendingIntent A004 = A00("com.obwhatsapp.action.UPDATE_NTP", 134217728);
            AlarmManager A043 = this.A00.A04();
            if (A043 != null) {
                A043.setInexactRepeating(3, 43200000 + SystemClock.elapsedRealtime(), 43200000, A004);
            } else {
                Log.w("NtpAction/setupUpdateNtpAlarm AlarmManager is null");
            }
        }
        A05((Intent) null);
    }

    public void A02(Intent intent) {
        A05(intent);
    }

    public boolean A04(Intent intent) {
        return "com.obwhatsapp.action.UPDATE_NTP".equals(intent.getAction());
    }

    public final void A05(Intent intent) {
        PowerManager.WakeLock wakeLock;
        Log.i(AnonymousClass000.A0g("NtpAction#updateNtp; intent=", intent));
        PowerManager A0I = this.A00.A0I();
        if (A0I == null) {
            Log.w("NtpAction/updateNtp pm=null");
            wakeLock = null;
        } else {
            wakeLock = C43421zy.A00(A0I, "NtpAction#updateNtp", 1);
            wakeLock.setReferenceCounted(false);
            wakeLock.acquire(300000);
        }
        try {
            NtpSyncWorker.A00(this.A02.A00, this.A01, this.A03, this.A04, this.A05);
        } finally {
            if (wakeLock != null) {
                wakeLock.release();
            }
        }
    }
}

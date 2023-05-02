package X;

import android.content.SharedPreferences;

/* renamed from: X.1OQ  reason: invalid class name */
public class AnonymousClass1OQ implements C23541Cj {
    public final C23051Ah A00;

    public AnonymousClass1OQ(C23051Ah r1) {
        this.A00 = r1;
    }

    public void APJ() {
        long j2;
        long j3;
        long j4;
        long j5;
        C23051Ah r14 = this.A00;
        SharedPreferences A002 = r14.A01.A00("ntp-scheduler");
        long j6 = A002.getLong("/ntp/last_event_timestamp", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (j6 == 0) {
            synchronized (r14) {
                A002.edit().putLong("/ntp/last_event_timestamp", currentTimeMillis).apply();
            }
            return;
        }
        long j7 = currentTimeMillis - j6;
        synchronized (r14) {
            j2 = (long) A002.getInt("/ntp/started", 0);
            j3 = (long) A002.getInt("/ntp/succeeded", 0);
            j4 = (long) A002.getInt("/ntp/failed", 0);
            j5 = A002.getLong("/ntp/work_manager_init", -1);
            A002.edit().remove("/ntp/started").remove("/ntp/succeeded").remove("/ntp/failed").putLong("/ntp/last_event_timestamp", currentTimeMillis).apply();
        }
        C75183rk r1 = new C75183rk();
        r1.A02 = Long.valueOf(j2);
        r1.A03 = Long.valueOf(j3);
        r1.A01 = Long.valueOf(j4);
        r1.A00 = Long.valueOf(j7);
        r1.A04 = Long.valueOf(j5);
        r14.A00.A06(r1);
    }

    public /* synthetic */ void APK() {
    }
}

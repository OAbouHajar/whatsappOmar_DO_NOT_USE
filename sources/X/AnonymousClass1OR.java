package X;

import android.content.SharedPreferences;

/* renamed from: X.1OR  reason: invalid class name */
public final class AnonymousClass1OR implements C23541Cj {
    public final C16490t9 A00;
    public final AnonymousClass1FS A01;

    public AnonymousClass1OR(C16490t9 r2, AnonymousClass1FS r3) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void APJ() {
        C75653sV r7 = new C75653sV();
        AnonymousClass1FS r6 = this.A01;
        SharedPreferences A002 = r6.A00();
        long A003 = (((r6.A01.A00() / 1000) / 60) / 10) * 10;
        r7.A01 = Long.valueOf((long) A002.getInt("total_cold_start_count_pref", 0));
        r7.A02 = Long.valueOf((long) A002.getInt("fg_cold_start_count_pref", 0));
        r7.A00 = Long.valueOf((long) A002.getInt("bg_cold_start_count_pref", 0));
        r7.A05 = Long.valueOf(A003 - ((long) A002.getInt("last_cold_start_time_min", 0)));
        r7.A04 = Long.valueOf((long) A002.getInt("warm_start_count_pref", 0));
        r7.A08 = Long.valueOf(A003 - ((long) A002.getInt("last_warm_start_time_min", 0)));
        r7.A03 = Long.valueOf((long) A002.getInt("lukewarm_start_count_pref", 0));
        r7.A07 = Long.valueOf(A003 - ((long) A002.getInt("last_lukewarm_start_time_min", 0)));
        r7.A06 = Long.valueOf(A003 - ((long) A002.getInt("last_health_event_time_min", 0)));
        SharedPreferences.Editor edit = r6.A00().edit();
        edit.putInt("last_health_event_time_min", (int) A003);
        edit.apply();
        this.A00.A04(r7);
        synchronized (r6) {
            SharedPreferences.Editor edit2 = r6.A00().edit();
            edit2.putInt("fg_cold_start_count_pref", 0);
            edit2.putInt("bg_cold_start_count_pref", 0);
            edit2.putInt("total_cold_start_count_pref", 0);
            edit2.putInt("warm_start_count_pref", 0);
            edit2.putInt("lukewarm_start_count_pref", 0);
            edit2.apply();
        }
    }

    public /* synthetic */ void APK() {
    }
}

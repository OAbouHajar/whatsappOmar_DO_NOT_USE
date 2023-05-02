package X;

import android.content.SharedPreferences;

/* renamed from: X.1FT  reason: invalid class name */
public final class AnonymousClass1FT implements C19400yN {
    public final AnonymousClass1FS A00;
    public final AnonymousClass01D A01;
    public final AnonymousClass01D A02;
    public final AnonymousClass01D A03;
    public final AnonymousClass01D A04;

    public AnonymousClass1FT(AnonymousClass1FS r2, AnonymousClass01D r3, AnonymousClass01D r4, AnonymousClass01D r5, AnonymousClass01D r6) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r4, 2);
        C18450wi.A0H(r2, 3);
        C18450wi.A0H(r5, 4);
        C18450wi.A0H(r6, 5);
        this.A04 = r3;
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r5;
        this.A03 = r6;
    }

    public String AGT() {
        return "PerfAsyncInit";
    }

    public void AMc() {
        AnonymousClass1FS r5 = this.A00;
        synchronized (r5) {
            SharedPreferences.Editor edit = r5.A00().edit();
            edit.putInt("total_cold_start_count_pref", r5.A00().getInt("total_cold_start_count_pref", 0) + 1);
            if (C32701gz.A00()) {
                edit.putInt("bg_cold_start_count_pref", r5.A00().getInt("bg_cold_start_count_pref", 0) + 1);
            }
            edit.putInt("last_cold_start_time_min", (int) ((((r5.A01.A00() / 1000) / 60) / 10) * 10));
            edit.apply();
        }
    }
}

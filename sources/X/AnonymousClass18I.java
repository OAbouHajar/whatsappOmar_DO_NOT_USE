package X;

import android.content.SharedPreferences;

/* renamed from: X.18I  reason: invalid class name */
public class AnonymousClass18I {
    public SharedPreferences A00;
    public final C17020u3 A01;

    public AnonymousClass18I(C17020u3 r1) {
        this.A01 = r1;
    }

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A00("tos_gating_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public void A01(String str, int i2) {
        SharedPreferences.Editor edit = A00().edit();
        StringBuilder sb = new StringBuilder("tos_acceptance_state_");
        sb.append(str);
        edit.putInt(sb.toString(), i2).apply();
    }

    public void A02(String str, long j2) {
        SharedPreferences.Editor edit = A00().edit();
        StringBuilder sb = new StringBuilder("tos_last_refresh_timestamp_");
        sb.append(str);
        edit.putLong(sb.toString(), j2).apply();
    }
}

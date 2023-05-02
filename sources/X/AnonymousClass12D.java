package X;

import android.content.SharedPreferences;

/* renamed from: X.12D  reason: invalid class name */
public class AnonymousClass12D {
    public SharedPreferences A00;
    public final C17020u3 A01;

    public AnonymousClass12D(C17020u3 r1) {
        this.A01 = r1;
    }

    public long A00() {
        return A01().getLong("contact_full_sync_wait", 86400000);
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A00("contact_sync_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public void A02() {
        A01().edit().putLong("contact_sync_backoff", -1).apply();
        A03(-1);
        A01().edit().putLong("status_sync_backoff", -1).apply();
        A01().edit().putLong("picture_sync_backoff", -1).apply();
        A01().edit().putLong("business_sync_backoff", -1).apply();
        A01().edit().putLong("devices_sync_backoff", -1).apply();
        A01().edit().putLong("payment_sync_backoff", -1).apply();
        A01().edit().putLong("delta_sync_backoff", -1).apply();
        A01().edit().putLong("disappearing_mode_sync_backoff", -1).apply();
        A01().edit().putLong("lid_sync_backoff", -1).apply();
        A01().edit().putLong("global_backoff_time", -1).apply();
    }

    public void A03(long j2) {
        A01().edit().putLong("sidelist_sync_backoff", j2).apply();
    }
}

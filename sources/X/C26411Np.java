package X;

import android.content.SharedPreferences;

/* renamed from: X.1Np  reason: invalid class name and case insensitive filesystem */
public class C26411Np implements C23541Cj {
    public final C17120uZ A00;
    public final C15860rz A01;

    public C26411Np(C17120uZ r1, C15860rz r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void APJ() {
        SharedPreferences.Editor A0K = this.A01.A0K();
        A0K.remove("pref_revoke_nux").remove("prefs_migration_version").remove("in_log_del_on_upgrade_new").remove("wamsys_features_started").remove("md_seamless_status").remove("seamless_migration_in_progress").remove("md_opt_in_awareness_period_deadline").remove("new_archive_nux_shown_count");
        A0K.apply();
    }

    public /* synthetic */ void APK() {
    }
}

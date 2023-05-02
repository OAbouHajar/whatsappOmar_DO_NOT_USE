package X;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.139  reason: invalid class name */
public class AnonymousClass139 {
    public static final Set A03;
    public SharedPreferences A00;
    public final C16040sK A01;
    public final C17020u3 A02;

    static {
        HashSet hashSet = new HashSet();
        A03 = hashSet;
        hashSet.add("first_transient_server_failure_timestamp");
        Set set = A03;
        set.add("syncd_dirty");
        set.add("syncd_dirty_reason");
        set.add("syncd_last_companion_dereg_time");
        set.add("syncd_last_companion_dereg_logging_time");
        set.add("syncd_first_companion_reg_logging_time");
        set.add("syncd_bootstrap_state");
        set.add("syncd_bootstrapped_mutations");
        set.add("syncd_last_lthash_consistency_check_time");
        set.add("syncd_one_time_cleanup_for_non_md_user");
        set.add("syncd_has_logged_snapshot_mac_mismatch_in_patch");
    }

    public AnonymousClass139(C16040sK r1, C17020u3 r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public synchronized long A00(String str) {
        long j2;
        j2 = A01().getLong(str, 0);
        A01().edit().remove(str).apply();
        return j2;
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A00("syncd_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public Set A02() {
        Set<String> stringSet;
        synchronized ("syncd_bootstrapped_mutations") {
            stringSet = A01().getStringSet("syncd_bootstrapped_mutations", Collections.emptySet());
            AnonymousClass00B.A06(stringSet);
        }
        return stringSet;
    }

    public void A03(int i2) {
        if (A01().getInt("syncd_dirty", -1) == -1) {
            A05(0);
            A01().edit().remove("syncd_last_companion_dereg_time").apply();
            A01().edit().putInt("syncd_dirty_reason", i2).apply();
        }
    }

    public void A04(int i2) {
        A01().edit().putInt("syncd_bootstrap_state", i2).apply();
    }

    public void A05(int i2) {
        if (this.A01.A0G()) {
            AnonymousClass00B.A08("SyncdSharedPreferences/ should not be setting SyncD dirty state in companion mode");
        } else {
            A01().edit().putInt("syncd_dirty", i2).apply();
        }
    }

    public synchronized void A06(String str, long j2) {
        A01().edit().putLong(str, A01().getLong(str, 0) + j2).apply();
    }

    public void A07(Set set) {
        synchronized ("syncd_bootstrapped_mutations") {
            set.addAll(A02());
            A01().edit().putStringSet("syncd_bootstrapped_mutations", set).apply();
        }
    }

    public void A08(boolean z2) {
        A01().edit().putBoolean("syncd_one_time_cleanup_for_non_md_user", z2).apply();
    }
}

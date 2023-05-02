package X;

import android.content.SharedPreferences;

/* renamed from: X.28h  reason: invalid class name and case insensitive filesystem */
public final class C453828h implements C453728e {
    public final C15860rz A00;

    public C453828h(C15860rz r1) {
        this.A00 = r1;
    }

    public String AE0() {
        return "community";
    }

    public /* bridge */ /* synthetic */ boolean AHa(Object obj) {
        return ((SharedPreferences) this.A00.A01.get()).getBoolean("create_community_nux_threshold_reached", false);
    }

    public void ALs(boolean z2) {
        C15860rz r2 = this.A00;
        r2.A0K().putBoolean("create_community_nux_threshold_reached", z2).apply();
        if (!z2) {
            r2.A0K().remove("pref_create_community_nux_times_displayed").apply();
        }
    }

    public /* bridge */ /* synthetic */ void AeB(Object obj) {
        if (obj == null) {
            C15860rz r3 = this.A00;
            int i2 = ((SharedPreferences) r3.A01.get()).getInt("pref_create_community_nux_times_displayed", 0) + 1;
            r3.A0K().putInt("pref_create_community_nux_times_displayed", i2).apply();
            if (i2 < 1) {
                return;
            }
        }
        this.A00.A0K().putBoolean("create_community_nux_threshold_reached", true).apply();
    }
}

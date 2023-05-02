package X;

import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: X.13f  reason: invalid class name and case insensitive filesystem */
public final class C212113f implements C211813c {
    public final C212013e A00;
    public final C17330uu A01;

    public C212113f(C212013e r2, C17330uu r3) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void AN2() {
        C15220qW r4 = this.A00.A01;
        boolean z2 = ((SharedPreferences) r4.getValue()).getBoolean("pref_avatar_user_local_deletion", false);
        SharedPreferences.Editor remove = ((SharedPreferences) r4.getValue()).edit().remove("pref_has_avatar_config").remove("pref_has_dismissed_sticker_upsell").remove("pref_avatar_profile_photo_poses");
        (z2 ? remove.remove("pref_avatar_sticker_onboarding_shown") : remove.remove("pref_avatar_sticker_onboarding_shown").remove("pref_avatar_user_local_deletion")).remove("pref_avatar_user_remote_deletion").apply();
    }

    public void AN3() {
        C15220qW r3 = this.A00.A01;
        if (((SharedPreferences) r3.getValue()).getBoolean("pref_avatar_user_local_deletion", false)) {
            this.A01.A01();
            ((SharedPreferences) r3.getValue()).edit().remove("pref_avatar_user_local_deletion").apply();
        }
    }

    public void AN4(String str) {
        if (C18450wi.A0R(str, "will_delete")) {
            ((SharedPreferences) this.A00.A01.getValue()).edit().putBoolean("pref_avatar_user_local_deletion", true).apply();
        }
    }

    public /* synthetic */ void AN5(String str, Map map) {
    }

    public void AN6(boolean z2) {
        C15220qW r2 = this.A00.A01;
        ((SharedPreferences) r2.getValue()).edit().putBoolean("pref_has_avatar_config", true).apply();
        ((SharedPreferences) r2.getValue()).edit().putString("pref_avatar_profile_photo_poses", (String) null).apply();
    }
}

package X;

import android.content.SharedPreferences;

/* renamed from: X.13e  reason: invalid class name and case insensitive filesystem */
public final class C212013e {
    public final C17020u3 A00;
    public final C15220qW A01 = new AnonymousClass1DV(new C106495Eb(this));

    public C212013e(C17020u3 r3) {
        C18450wi.A0H(r3, 1);
        this.A00 = r3;
    }

    public final Boolean A00() {
        C15220qW r1 = this.A01;
        if (!((SharedPreferences) r1.getValue()).contains("pref_has_avatar_config")) {
            return null;
        }
        return Boolean.valueOf(((SharedPreferences) r1.getValue()).getBoolean("pref_has_avatar_config", false));
    }
}

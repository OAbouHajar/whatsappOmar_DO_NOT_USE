package X;

import android.content.SharedPreferences;

/* renamed from: X.18a  reason: invalid class name and case insensitive filesystem */
public class C224618a {
    public SharedPreferences A00;
    public final C17020u3 A01;

    public C224618a(C17020u3 r1) {
        this.A01 = r1;
    }

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A00("disappearing_mode_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }
}

package X;

import android.content.SharedPreferences;

/* renamed from: X.15e  reason: invalid class name and case insensitive filesystem */
public class C217215e {
    public SharedPreferences A00;
    public final C17020u3 A01;

    public C217215e(C17020u3 r1) {
        this.A01 = r1;
    }

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A00("daily_metrics_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }
}

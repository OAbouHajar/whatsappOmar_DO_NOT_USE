package X;

import android.content.SharedPreferences;

/* renamed from: X.1NM  reason: invalid class name */
public class AnonymousClass1NM {
    public SharedPreferences A00;
    public final C17020u3 A01;

    public AnonymousClass1NM(C17020u3 r1) {
        this.A01 = r1;
    }

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A00("google_migrate_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }
}

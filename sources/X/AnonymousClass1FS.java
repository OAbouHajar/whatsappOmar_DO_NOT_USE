package X;

import android.content.SharedPreferences;

/* renamed from: X.1FS  reason: invalid class name */
public class AnonymousClass1FS {
    public SharedPreferences A00;
    public final C16440t3 A01;
    public final C17020u3 A02;

    public AnonymousClass1FS(C16440t3 r1, C17020u3 r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A00("core_health_event_pref_file");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }
}

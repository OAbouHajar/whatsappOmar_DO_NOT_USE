package X;

import android.content.SharedPreferences;

/* renamed from: X.1DF  reason: invalid class name */
public class AnonymousClass1DF implements AnonymousClass1D6 {
    public final C15910s6 A00;

    public AnonymousClass1DF(C15910s6 r1) {
        this.A00 = r1;
    }

    public void AMX() {
        C15910s6 r0 = this.A00;
        synchronized (C15910s6.class) {
            SharedPreferences.Editor edit = r0.A00.edit();
            edit.putBoolean("server_props:one_time_unlocked", true).apply();
            edit.remove("server_props:config_hash").apply();
        }
    }
}

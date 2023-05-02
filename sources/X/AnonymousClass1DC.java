package X;

import android.content.SharedPreferences;

/* renamed from: X.1DC  reason: invalid class name */
public class AnonymousClass1DC implements AnonymousClass1D6 {
    public final C19070xi A00;

    public AnonymousClass1DC(C19070xi r1) {
        this.A00 = r1;
    }

    public void AMX() {
        C19070xi r2 = this.A00;
        synchronized (r2) {
            SharedPreferences.Editor edit = r2.A01.edit();
            edit.remove("ab_props:sys:config_hash");
            edit.remove("ab_props:sys:last_refresh_time");
            edit.apply();
        }
    }
}

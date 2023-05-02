package X;

import android.content.SharedPreferences;

/* renamed from: X.1Cy  reason: invalid class name and case insensitive filesystem */
public class C23681Cy implements C23691Cz {
    public final SharedPreferences A00;
    public final C15910s6 A01;

    public C23681Cy(C15910s6 r2, C17020u3 r3) {
        this.A01 = r2;
        this.A00 = r3.A00(AnonymousClass01S.A07);
    }

    public void AMa() {
        SharedPreferences sharedPreferences = this.A00;
        if (!(!sharedPreferences.contains("server_props:last_version"))) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove("groups_server_props_last_refresh_time");
            edit.remove("server_props:refresh");
            edit.remove("server_props:last_version");
            edit.remove("server_props:config_hash");
            edit.remove("server_props:config_key");
            edit.remove("server_props:one_time_unlocked");
            for (C15930s9 r0 : C15910s6.A2E) {
                edit.remove(r0.A00);
            }
            edit.apply();
        }
    }

    public /* synthetic */ void AMb() {
    }
}

package X;

import android.content.SharedPreferences;

/* renamed from: X.12J  reason: invalid class name */
public final class AnonymousClass12J {
    public final C15860rz A00;

    public AnonymousClass12J(C15860rz r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public final C28951Zk A00() {
        AnonymousClass01D r8 = this.A00.A01;
        long j2 = ((SharedPreferences) r8.get()).getLong("account_logout_request_attempt_timestamp", -1);
        String string = ((SharedPreferences) r8.get()).getString("account_logout_request_server_token", (String) null);
        if (j2 < 0 || string == null) {
            return null;
        }
        return new C28951Zk(((SharedPreferences) r8.get()).getString("account_logout_request_new_device_name", (String) null), string, j2);
    }

    public final void A01(C28951Zk r8) {
        long j2;
        String str;
        String str2;
        if (r8 == null) {
            j2 = -1;
            str2 = null;
            str = null;
        } else {
            j2 = r8.A00;
            str = r8.A02;
            str2 = r8.A01;
        }
        C15860rz r4 = this.A00;
        r4.A0K().putLong("account_logout_request_attempt_timestamp", j2).apply();
        SharedPreferences.Editor A0K = r4.A0K();
        if (str != null) {
            A0K.putString("account_logout_request_server_token", str);
        } else {
            A0K.remove("account_logout_request_server_token");
        }
        A0K.apply();
        SharedPreferences.Editor A0K2 = r4.A0K();
        if (str2 != null) {
            A0K2.putString("account_logout_request_new_device_name", str2);
        } else {
            A0K2.remove("account_logout_request_new_device_name");
        }
        A0K2.apply();
    }
}

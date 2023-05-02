package X;

import android.content.SharedPreferences;

/* renamed from: X.0tE  reason: invalid class name and case insensitive filesystem */
public class C16540tE {
    public SharedPreferences A00;
    public final C17020u3 A01;
    public final String A02;

    public C16540tE(C17020u3 r3, String str) {
        this.A01 = r3;
        StringBuilder sb = new StringBuilder("acs_token_");
        sb.append(str);
        this.A02 = sb.toString();
    }

    public final SharedPreferences A00() {
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = this.A01.A00(this.A02);
            }
        }
        return this.A00;
    }

    public void A01(int i2) {
        SharedPreferences.Editor edit = A00().edit();
        (i2 > 0 ? edit.putInt("token_not_ready_reason", i2) : edit.remove("token_not_ready_reason")).apply();
    }

    public final void A02(String str, int i2) {
        SharedPreferences.Editor edit = A00().edit();
        (i2 >= 0 ? edit.putInt(str, i2) : edit.remove(str)).apply();
    }

    public final void A03(String str, long j2) {
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        SharedPreferences.Editor edit = A00().edit();
        (i2 > 0 ? edit.putLong(str, j2) : edit.remove(str)).apply();
    }

    public final void A04(String str, String str2) {
        SharedPreferences.Editor edit = A00().edit();
        (str2 != null ? edit.putString(str, str2) : edit.remove(str)).apply();
    }
}

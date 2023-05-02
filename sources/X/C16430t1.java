package X;

import android.content.SharedPreferences;

/* renamed from: X.0t1  reason: invalid class name and case insensitive filesystem */
public class C16430t1 {
    public SharedPreferences A00;
    public final C17020u3 A01;

    public C16430t1(C17020u3 r1) {
        this.A01 = r1;
    }

    public final SharedPreferences A00() {
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = this.A01.A00("privatestats_props");
            }
        }
        return this.A00;
    }

    public void A01(int i2) {
        A00().edit().putInt("first_token_stage", i2).apply();
    }

    public void A02(int i2) {
        SharedPreferences.Editor edit = A00().edit();
        (i2 >= 0 ? edit.putInt("redeem_count", i2) : edit.remove("redeem_count")).apply();
    }

    public void A03(int i2) {
        SharedPreferences.Editor edit = A00().edit();
        (i2 > 0 ? edit.putInt("token_not_ready_reason", i2) : edit.remove("token_not_ready_reason")).apply();
    }

    public final void A04(String str, long j2) {
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        SharedPreferences.Editor edit = A00().edit();
        (i2 > 0 ? edit.putLong(str, j2) : edit.remove(str)).apply();
    }

    public final void A05(String str, String str2) {
        SharedPreferences.Editor edit = A00().edit();
        (str2 != null ? edit.putString(str, str2) : edit.remove(str)).apply();
    }
}

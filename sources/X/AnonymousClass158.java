package X;

import android.content.SharedPreferences;

/* renamed from: X.158  reason: invalid class name */
public class AnonymousClass158 {
    public SharedPreferences A00;
    public SharedPreferences A01;
    public final C16440t3 A02;
    public final C16460t6 A03;
    public final C17020u3 A04;

    public AnonymousClass158(C16440t3 r1, C16460t6 r2, C17020u3 r3) {
        this.A02 = r1;
        this.A03 = r2;
        this.A04 = r3;
    }

    public static final String A00(C15830rv r2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(r2.getRawString());
        sb.append(",");
        sb.append(str);
        return sb.toString();
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A04.A00("msg_attribute_pref_file");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public final synchronized SharedPreferences A02() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A01;
        if (sharedPreferences == null) {
            sharedPreferences = this.A04.A00("in_app_msg_source_pref_file");
            this.A01 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public void A03(C28381Vw r4, int i2) {
        C15830rv r2 = r4.A00;
        if (r2 != null) {
            A02().edit().putInt(A00(r2, r4.A01), i2).apply();
        }
    }
}

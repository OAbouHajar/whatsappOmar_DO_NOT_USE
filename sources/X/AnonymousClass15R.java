package X;

import android.content.SharedPreferences;

/* renamed from: X.15R  reason: invalid class name */
public class AnonymousClass15R {
    public static final String A02;
    public SharedPreferences A00;
    public final C17020u3 A01;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass01S.A07);
        sb.append("_daily_events");
        A02 = sb.toString();
    }

    public AnonymousClass15R(C17020u3 r1) {
        this.A01 = r1;
    }

    public long A00(String str) {
        SharedPreferences A012 = A01();
        StringBuilder sb = new StringBuilder();
        sb.append("KeepInChatNotif");
        sb.append("::");
        sb.append(str);
        return A012.getLong(sb.toString(), 0);
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A00(A02);
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }
}

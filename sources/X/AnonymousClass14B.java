package X;

import android.content.SharedPreferences;

/* renamed from: X.14B  reason: invalid class name */
public class AnonymousClass14B {
    public final C17020u3 A00;
    public volatile SharedPreferences A01;

    public AnonymousClass14B(C17020u3 r1) {
        this.A00 = r1;
    }

    public final SharedPreferences A00() {
        if (this.A01 == null) {
            synchronized (AnonymousClass14B.class) {
                if (this.A01 == null) {
                    this.A01 = this.A00.A00("fb_credentials_prefs");
                }
            }
        }
        return this.A01;
    }

    public void A01(String str) {
        synchronized (AnonymousClass14B.class) {
            A00().edit().putString("pref_fb_user_credentials_encrypted", str).apply();
        }
    }
}

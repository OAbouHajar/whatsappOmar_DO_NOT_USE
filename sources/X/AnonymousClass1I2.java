package X;

import android.content.SharedPreferences;

/* renamed from: X.1I2  reason: invalid class name */
public class AnonymousClass1I2 {
    public SharedPreferences A00;
    public final C17020u3 A01;

    public AnonymousClass1I2(C17020u3 r1) {
        this.A01 = r1;
    }

    public synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A00("com.obwhatsapp_business_directory");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }
}

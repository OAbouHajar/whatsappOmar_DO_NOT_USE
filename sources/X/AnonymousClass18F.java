package X;

import android.content.SharedPreferences;

/* renamed from: X.18F  reason: invalid class name */
public class AnonymousClass18F {
    public SharedPreferences A00;
    public final C17020u3 A01;
    public final Object A02 = new Object();
    public final Object A03 = new Object();
    public final Object A04 = new Object();
    public final Object A05 = new Object();

    public AnonymousClass18F(C17020u3 r2) {
        this.A01 = r2;
    }

    public final SharedPreferences A00() {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences A002 = this.A01.A00("stickers");
        this.A00 = A002;
        return A002;
    }
}

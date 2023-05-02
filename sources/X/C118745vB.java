package X;

import android.content.SharedPreferences;

/* renamed from: X.5vB  reason: invalid class name and case insensitive filesystem */
public class C118745vB {
    public SharedPreferences A00;
    public final AnonymousClass1Vo A01 = C110105dW.A0Q("PaymentProviderKeySharedPrefs", "infra");
    public final C17020u3 A02;

    public C118745vB(C17020u3 r3) {
        this.A02 = r3;
    }

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A00("com.obwhatsapp_payment_provider_key_preferences");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public void A01(String str, String str2) {
        SharedPreferences.Editor edit = A00().edit();
        StringBuilder A0q = AnonymousClass000.A0q(str);
        A0q.append("::");
        edit.remove(AnonymousClass000.A0h(str2, A0q)).apply();
    }
}

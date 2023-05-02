package X;

import android.content.SharedPreferences;
import java.util.Collections;

/* renamed from: X.1TT  reason: invalid class name */
public class AnonymousClass1TT {
    public SharedPreferences A00;
    public final C17020u3 A01;

    public AnonymousClass1TT(C17020u3 r1) {
        this.A01 = r1;
    }

    public void A00(AnonymousClass2HC r4, String str) {
        SharedPreferences sharedPreferences;
        synchronized (this) {
            sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A01.A00("com.obwhatsapp_payment_sync_preferences");
                this.A00 = sharedPreferences;
            }
        }
        sharedPreferences.edit().putString(r4.A01.A00(), str).apply();
        for (AnonymousClass2HC A002 : Collections.unmodifiableList(r4.A00)) {
            A00(A002, str);
        }
    }
}

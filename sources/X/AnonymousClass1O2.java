package X;

import android.content.SharedPreferences;

/* renamed from: X.1O2  reason: invalid class name */
public final class AnonymousClass1O2 implements C23541Cj {
    public final C15860rz A00;
    public final C16490t9 A01;

    public AnonymousClass1O2(C15860rz r2, C16490t9 r3) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public void APJ() {
        C15860rz r4 = this.A00;
        int i2 = ((SharedPreferences) r4.A01.get()).getInt("decryption_failure_views", 0);
        if (i2 > 0) {
            AnonymousClass3qK r2 = new AnonymousClass3qK();
            r2.A00 = Long.valueOf((long) i2);
            this.A01.A04(r2);
            r4.A0K().remove("decryption_failure_views").apply();
        }
    }

    public /* synthetic */ void APK() {
    }
}

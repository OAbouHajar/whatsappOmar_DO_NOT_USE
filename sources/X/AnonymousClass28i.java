package X;

import android.content.SharedPreferences;

/* renamed from: X.28i  reason: invalid class name */
public final class AnonymousClass28i implements C453728e {
    public final C15860rz A00;

    public AnonymousClass28i(C15860rz r1) {
        this.A00 = r1;
    }

    public String AE0() {
        return "ephemeral";
    }

    public /* bridge */ /* synthetic */ boolean AHa(Object obj) {
        return ((SharedPreferences) this.A00.A01.get()).getBoolean("ephemeral_nux", false);
    }

    public void ALs(boolean z2) {
        this.A00.A0K().putBoolean("ephemeral_nux", z2).apply();
    }

    public /* bridge */ /* synthetic */ void AeB(Object obj) {
        this.A00.A0K().putBoolean("ephemeral_nux", true).apply();
    }
}

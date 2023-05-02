package X;

import android.content.SharedPreferences;

/* renamed from: X.28j  reason: invalid class name */
public final class AnonymousClass28j implements C453728e {
    public final C15860rz A00;

    public AnonymousClass28j(C15860rz r1) {
        this.A00 = r1;
    }

    public String AE0() {
        return "ephemeral_view_once";
    }

    public /* bridge */ /* synthetic */ boolean AHa(Object obj) {
        return ((SharedPreferences) this.A00.A01.get()).getBoolean("view_once_nux", false);
    }

    public void ALs(boolean z2) {
        this.A00.A0K().putBoolean("view_once_nux", z2).apply();
    }

    public /* bridge */ /* synthetic */ void AeB(Object obj) {
        this.A00.A0K().putBoolean("view_once_nux", true).apply();
    }
}

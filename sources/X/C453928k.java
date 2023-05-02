package X;

import android.content.SharedPreferences;

/* renamed from: X.28k  reason: invalid class name and case insensitive filesystem */
public final class C453928k implements C453728e {
    public final C15860rz A00;

    public C453928k(C15860rz r1) {
        this.A00 = r1;
    }

    public String AE0() {
        return "ephemeral_view_once_receiver";
    }

    public /* bridge */ /* synthetic */ boolean AHa(Object obj) {
        return ((SharedPreferences) this.A00.A01.get()).getBoolean("view_once_receiver_nux", false);
    }

    public void ALs(boolean z2) {
        this.A00.A0K().putBoolean("view_once_receiver_nux", z2).apply();
    }

    public /* bridge */ /* synthetic */ void AeB(Object obj) {
        this.A00.A0K().putBoolean("view_once_receiver_nux", true).apply();
    }
}

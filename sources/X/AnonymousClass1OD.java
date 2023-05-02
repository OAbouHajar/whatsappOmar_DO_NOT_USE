package X;

import android.content.SharedPreferences;

/* renamed from: X.1OD  reason: invalid class name */
public class AnonymousClass1OD implements C23541Cj {
    public final C224618a A00;

    public AnonymousClass1OD(C224618a r1) {
        this.A00 = r1;
    }

    public void APJ() {
        SharedPreferences.Editor edit = this.A00.A00().edit();
        edit.remove("disappearing_mode_duration");
        edit.apply();
    }

    public /* synthetic */ void APK() {
    }
}

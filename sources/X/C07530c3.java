package X;

import android.os.Handler;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;

/* renamed from: X.0c3  reason: invalid class name and case insensitive filesystem */
public class C07530c3 implements C12450kQ {
    public final /* synthetic */ PreferenceGroup A00;
    public final /* synthetic */ AnonymousClass0Fb A01;

    public C07530c3(PreferenceGroup preferenceGroup, AnonymousClass0Fb r2) {
        this.A01 = r2;
        this.A00 = preferenceGroup;
    }

    public boolean AV6(Preference preference) {
        this.A00.A01 = Integer.MAX_VALUE;
        AnonymousClass0Fb r0 = this.A01;
        Handler handler = r0.A00;
        Runnable runnable = r0.A02;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
        return true;
    }
}

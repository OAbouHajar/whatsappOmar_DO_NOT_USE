package X;

import android.content.Context;

/* renamed from: X.0G0  reason: invalid class name */
public final class AnonymousClass0G0 extends AnonymousClass0PS {
    public final Context A00;

    public AnonymousClass0G0(Context context, int i2, int i3) {
        super(i2, i3);
        this.A00 = context;
    }

    public void A00(C13620mg r7) {
        C18450wi.A0H(r7, 0);
        if (this.A00 >= 10) {
            ((C07700cK) r7).A00.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            return;
        }
        this.A00.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
    }
}

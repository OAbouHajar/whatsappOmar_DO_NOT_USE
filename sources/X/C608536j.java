package X;

import com.obwhatsapp.settings.SettingsDataUsageActivity;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.36j  reason: invalid class name and case insensitive filesystem */
public class C608536j extends C16690tT {
    public final AtomicBoolean A00 = new AtomicBoolean(false);
    public final /* synthetic */ SettingsDataUsageActivity A01;

    public C608536j(SettingsDataUsageActivity settingsDataUsageActivity) {
        this.A01 = settingsDataUsageActivity;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Log.i("settings-data-usage-activity/load storage size task/background");
        if (this.A00.get()) {
            return null;
        }
        SettingsDataUsageActivity settingsDataUsageActivity = this.A01;
        return Long.valueOf(C14740pg.A00(settingsDataUsageActivity.A04, settingsDataUsageActivity.A0Q));
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Number number = (Number) obj;
        Log.i("settings-data-usage-activity/load storage size task/fetch completed");
        if (number != null) {
            SettingsDataUsageActivity settingsDataUsageActivity = this.A01;
            long longValue = number.longValue();
            settingsDataUsageActivity.A03 = longValue;
            settingsDataUsageActivity.A0C.setText(AnonymousClass2GQ.A04(settingsDataUsageActivity.A01, longValue));
        }
    }
}

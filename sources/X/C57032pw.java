package X;

import com.obwhatsapp.R;
import com.obwhatsapp.authentication.AppAuthSettingsActivity;
import com.obwhatsapp.yo.shp;
import com.whatsapp.util.Log;

/* renamed from: X.2pw  reason: invalid class name and case insensitive filesystem */
public class C57032pw extends C05340Qi {
    public final /* synthetic */ AppAuthSettingsActivity A00;

    public C57032pw(AppAuthSettingsActivity appAuthSettingsActivity) {
        this.A00 = appAuthSettingsActivity;
    }

    public void A01(int i2, CharSequence charSequence) {
        if (i2 == 7) {
            AppAuthSettingsActivity appAuthSettingsActivity = this.A00;
            C14870pt r5 = appAuthSettingsActivity.A05;
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, 30, 0);
            r5.A0H(appAuthSettingsActivity.getString(R.string.str00f4, objArr), 1);
        }
        Log.i("AppAuthSettingsActivity/error");
        this.A00.A35();
    }

    public void A02(C04730Nr r5) {
        Log.i("AppAuthSettingsActivity/success");
        AppAuthSettingsActivity appAuthSettingsActivity = this.A00;
        appAuthSettingsActivity.A03.A02(false);
        C13680ns.A0z(appAuthSettingsActivity.A09.A0K(), "privacy_fingerprint_enabled", true);
        shp.setFingerprintEnabled(true);
        appAuthSettingsActivity.A0C.A08();
        appAuthSettingsActivity.A36(true);
        appAuthSettingsActivity.A05.setChecked(true);
        appAuthSettingsActivity.A09.A01();
        appAuthSettingsActivity.A03.A00(appAuthSettingsActivity);
    }
}

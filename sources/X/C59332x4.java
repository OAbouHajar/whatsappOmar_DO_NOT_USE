package X;

import com.obwhatsapp.authentication.AppAuthSettingsActivity;
import com.obwhatsapp.authentication.FingerprintBottomSheet;
import com.obwhatsapp.yo.shp;
import com.whatsapp.util.Log;

/* renamed from: X.2x4  reason: invalid class name and case insensitive filesystem */
public class C59332x4 extends C70783hi {
    public final /* synthetic */ AppAuthSettingsActivity A00;

    public C59332x4(AppAuthSettingsActivity appAuthSettingsActivity) {
        this.A00 = appAuthSettingsActivity;
    }

    public void A00() {
        Log.i("AppAuthSettingsActivity/fingerprint-success-animation-end");
        AppAuthSettingsActivity appAuthSettingsActivity = this.A00;
        FingerprintBottomSheet fingerprintBottomSheet = appAuthSettingsActivity.A0A;
        if (fingerprintBottomSheet != null && fingerprintBottomSheet.A0e()) {
            appAuthSettingsActivity.A0A.A1D();
        }
        appAuthSettingsActivity.A05.setChecked(true);
        appAuthSettingsActivity.A36(true);
    }

    public void A02(int i2) {
        Log.i("AppAuthSettingsActivity/fingerprint-error");
        this.A00.A35();
    }

    public void A03(AnonymousClass024 r3, AnonymousClass2J2 r4) {
        Log.i("AppAuthSettingsActivity/authenticate");
        AnonymousClass15P r1 = this.A00.A03;
        AnonymousClass00B.A0G(r1.A05());
        r1.A01.A5H(r3, r4);
    }

    public void A04(byte[] bArr) {
        Log.i("AppAuthSettingsActivity/fingerprint-success");
        AppAuthSettingsActivity appAuthSettingsActivity = this.A00;
        C13680ns.A0z(appAuthSettingsActivity.A09.A0K(), "privacy_fingerprint_enabled", true);
        shp.setFingerprintEnabled(true);
        appAuthSettingsActivity.A03.A02(false);
        appAuthSettingsActivity.A0C.A08();
        appAuthSettingsActivity.A09.A01();
    }
}

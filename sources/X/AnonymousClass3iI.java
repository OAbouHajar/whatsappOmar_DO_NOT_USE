package X;

import com.facebook.redex.RunnableRunnableShape3S0100000_I0_2;
import com.obwhatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.util.Log;

/* renamed from: X.3iI  reason: invalid class name */
public class AnonymousClass3iI extends C47162Hv {
    public final /* synthetic */ SettingsGoogleDrive A00;

    public AnonymousClass3iI(SettingsGoogleDrive settingsGoogleDrive) {
        this.A00 = settingsGoogleDrive;
    }

    public void ALz(boolean z2) {
        Log.i(AnonymousClass000.A0h(z2 ? "success" : "failed", AnonymousClass000.A0r("settings-gdrive/gdrive-backup-deletion-finished/")));
        SettingsGoogleDrive settingsGoogleDrive = this.A00;
        ((AnonymousClass022) settingsGoogleDrive.A0j.get()).A0A("com.obwhatsapp.backup.google.google-encrypted-re-upload-worker");
        settingsGoogleDrive.A0h.A0G();
        settingsGoogleDrive.A05.A0K(new RunnableRunnableShape3S0100000_I0_2(settingsGoogleDrive, 29));
    }
}

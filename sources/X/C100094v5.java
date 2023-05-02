package X;

import com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;

/* renamed from: X.4v5  reason: invalid class name and case insensitive filesystem */
public class C100094v5 implements AnonymousClass5RR {
    public final /* synthetic */ SettingsGoogleDriveViewModel A00;

    public C100094v5(SettingsGoogleDriveViewModel settingsGoogleDriveViewModel) {
        this.A00 = settingsGoogleDriveViewModel;
    }

    public void AML(int i2, long j2) {
        SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = this.A00;
        settingsGoogleDriveViewModel.A0Q.A01.A03(this);
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 0) {
                    i3 = 3;
                } else {
                    return;
                }
            }
        }
        settingsGoogleDriveViewModel.A0b.A09(new AnonymousClass3ih(i3, j2));
    }

    public void ANc() {
        this.A00.A0b.A09(new AnonymousClass3ih(0, -1));
    }
}

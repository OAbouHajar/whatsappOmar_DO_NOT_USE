package com.facebook.redex;

import X.C14750ph;
import X.C34121jj;
import android.view.View;
import com.obwhatsapp.backup.google.RestoreFromBackupActivity;
import com.obwhatsapp.settings.SettingsPrivacy;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

public class ViewOnClickCListenerShape2S0110000_I0 implements View.OnClickListener {
    public Object A00;
    public boolean A01;
    public final int A02;

    public ViewOnClickCListenerShape2S0110000_I0(Object obj, int i2, boolean z2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = z2;
    }

    public final void onClick(View view) {
        switch (this.A02) {
            case 0:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A00;
                boolean z2 = this.A01;
                restoreFromBackupActivity.A0c.A04("backup_found", "restore");
                if (restoreFromBackupActivity.A3X()) {
                    return;
                }
                if (z2) {
                    restoreFromBackupActivity.A3J(2);
                    restoreFromBackupActivity.startActivityForResult(C14750ph.A09(restoreFromBackupActivity, 2), 0);
                    return;
                }
                restoreFromBackupActivity.A3O((C34121jj) null, 27);
                restoreFromBackupActivity.A3C();
                restoreFromBackupActivity.A3P(true);
                return;
            case 1:
                SettingsPrivacy settingsPrivacy = (SettingsPrivacy) this.A00;
                boolean z3 = this.A01;
                settingsPrivacy.A3C(9, 0);
                C14750ph r1 = new C14750ph();
                int i2 = 1;
                if (z3) {
                    i2 = 7;
                }
                settingsPrivacy.startActivity(r1.A0s(settingsPrivacy, i2, z3));
                return;
            default:
                VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = (VoipCallControlBottomSheetV2) this.A00;
                int i3 = 0;
                if (this.A01) {
                    i3 = 2;
                }
                voipCallControlBottomSheetV2.A1Q(i3);
                return;
        }
    }
}

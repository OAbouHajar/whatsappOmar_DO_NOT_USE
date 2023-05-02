package X;

import android.widget.RadioGroup;
import com.obwhatsapp.ephemeral.ChangeEphemeralSettingsDialog;

/* renamed from: X.5yz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119755yz implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ ChangeEphemeralSettingsDialog A00;

    public /* synthetic */ C119755yz(ChangeEphemeralSettingsDialog changeEphemeralSettingsDialog) {
        this.A00 = changeEphemeralSettingsDialog;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
        ChangeEphemeralSettingsDialog changeEphemeralSettingsDialog = this.A00;
        C001000l A0C = changeEphemeralSettingsDialog.A0C();
        if (A0C instanceof AnonymousClass68J) {
            ((AnonymousClass68J) A0C).AQP(AnonymousClass000.A0D(C004601z.A0E(radioGroup, i2).getTag()));
        }
        changeEphemeralSettingsDialog.A1C();
    }
}

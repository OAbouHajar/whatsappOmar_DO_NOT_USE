package X;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;

/* renamed from: X.0Z7  reason: invalid class name */
public class AnonymousClass0Z7 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ SwitchPreference A00;

    public AnonymousClass0Z7(SwitchPreference switchPreference) {
        this.A00 = switchPreference;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        SwitchPreference switchPreference = this.A00;
        AnonymousClass000.A15(switchPreference, switchPreference, z2);
    }
}

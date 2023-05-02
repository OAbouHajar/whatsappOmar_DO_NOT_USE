package X;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreferenceCompat;

/* renamed from: X.0Z8  reason: invalid class name */
public class AnonymousClass0Z8 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ SwitchPreferenceCompat A00;

    public AnonymousClass0Z8(SwitchPreferenceCompat switchPreferenceCompat) {
        this.A00 = switchPreferenceCompat;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        SwitchPreferenceCompat switchPreferenceCompat = this.A00;
        AnonymousClass000.A15(switchPreferenceCompat, switchPreferenceCompat, z2);
    }
}

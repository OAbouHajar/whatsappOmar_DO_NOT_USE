package X;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;

/* renamed from: X.0Z6  reason: invalid class name */
public class AnonymousClass0Z6 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ CheckBoxPreference A00;

    public AnonymousClass0Z6(CheckBoxPreference checkBoxPreference) {
        this.A00 = checkBoxPreference;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        CheckBoxPreference checkBoxPreference = this.A00;
        AnonymousClass000.A15(checkBoxPreference, checkBoxPreference, z2);
    }
}

package X;

import android.widget.CompoundButton;
import com.google.android.material.chip.ChipGroup;

/* renamed from: X.4lN  reason: invalid class name and case insensitive filesystem */
public class C94724lN implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ChipGroup A00;

    public C94724lN(ChipGroup chipGroup) {
        this.A00 = chipGroup;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        ChipGroup chipGroup = this.A00;
        if (!chipGroup.A05) {
            int id = compoundButton.getId();
            int i2 = chipGroup.A00;
            if (z2) {
                if (!(i2 == -1 || i2 == id || !chipGroup.A06)) {
                    chipGroup.A00(i2, false);
                }
                chipGroup.A00 = id;
            } else if (i2 == id) {
                chipGroup.A00 = -1;
            }
        }
    }
}

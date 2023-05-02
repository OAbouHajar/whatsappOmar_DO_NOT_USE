package X;

import android.content.Context;
import android.content.res.ColorStateList;
import com.google.android.material.chip.Chip;
import com.obwhatsapp.R;

/* renamed from: X.3me  reason: invalid class name and case insensitive filesystem */
public class C72753me extends C65083Su {
    public final Chip A00;

    public C72753me(Chip chip, C29101a2 r2) {
        super(chip, r2);
        this.A00 = chip;
    }

    public void A07(AnonymousClass4PT r5) {
        Chip chip = this.A00;
        Context context = chip.getContext();
        boolean A002 = r5.A00();
        int i2 = R.color.color06c2;
        if (A002) {
            i2 = R.color.color090b;
        }
        C13680ns.A0v(context, chip, i2);
        int i3 = R.color.color06b1;
        if (A002) {
            i3 = R.color.color06b8;
        }
        chip.setChipBackgroundColorResource(i3);
        int i4 = R.color.color06c2;
        if (A002) {
            i4 = R.color.color090b;
        }
        chip.setCloseIconTintResource(i4);
        chip.setCloseIconVisible(false);
        chip.A04.A0A((ColorStateList) null);
        chip.setChipIconTintResource(i4);
        chip.setChipIconSize((float) C13680ns.A0D(chip).getDimensionPixelSize(R.dimen.dimen03c6));
    }
}

package X;

import com.google.android.material.chip.Chip;
import com.obwhatsapp.R;

/* renamed from: X.3mb  reason: invalid class name and case insensitive filesystem */
public class C72723mb extends C72753me {
    public C72723mb(Chip chip, C29101a2 r2) {
        super(chip, r2);
    }

    public void A07(AnonymousClass4PT r4) {
        Chip chip = this.A00;
        chip.setChipIconResource(R.drawable.ic_business_hours);
        chip.setChipIconVisible(true);
        super.A07(r4);
        C13690nt.A0s(chip.getContext(), chip, R.string.str01b5);
        C13680ns.A0t(chip.getContext(), chip, R.string.str01b5);
        C13680ns.A1B(chip, this, r4, 20);
    }
}

package X;

import android.content.Context;
import com.google.android.material.chip.Chip;
import com.obwhatsapp.R;

/* renamed from: X.3mc  reason: invalid class name and case insensitive filesystem */
public class C72733mc extends C72753me {
    public final AnonymousClass013 A00;

    public C72733mc(Chip chip, C29101a2 r2, AnonymousClass013 r3) {
        super(chip, r2);
        this.A00 = r3;
    }

    public void A07(AnonymousClass4PT r5) {
        Chip chip = this.A00;
        chip.setChipIconResource(R.drawable.ic_business_location);
        chip.setChipIconVisible(true);
        super.A07(r5);
        boolean A03 = AnonymousClass2RK.A03(C13690nt.A0m(this.A00));
        Context context = chip.getContext();
        int i2 = R.string.str01b0;
        if (A03) {
            i2 = R.string.str01af;
        }
        C13690nt.A0s(context, chip, i2);
        C13680ns.A0t(chip.getContext(), chip, i2);
        C13680ns.A1B(chip, this, r5, 18);
    }
}

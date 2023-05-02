package X;

import android.content.Context;
import com.facebook.redex.ViewOnClickCListenerShape16S0100000_I1_1;
import com.google.android.material.chip.Chip;
import com.obwhatsapp.R;
import java.util.Set;

/* renamed from: X.3mZ  reason: invalid class name and case insensitive filesystem */
public class C72703mZ extends C72753me {
    public C72703mZ(Chip chip, C29101a2 r2) {
        super(chip, r2);
    }

    public void A07(AnonymousClass4PT r9) {
        String string;
        Chip chip = this.A00;
        chip.setChipIconResource(R.drawable.ic_business_cat);
        super.A07(r9);
        Set set = ((C72263lq) r9).A00;
        if (set.size() == 0) {
            string = chip.getContext().getString(R.string.str01a5);
        } else if (set.size() == 1) {
            string = ((C31241dn) set.iterator().next()).A01;
        } else {
            Context context = chip.getContext();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, set.size(), 0);
            string = context.getString(R.string.str01c5, objArr);
        }
        chip.setText(string);
        chip.setCloseIconVisible(true);
        C13680ns.A0t(chip.getContext(), chip, R.string.str01a5);
        C13680ns.A18(chip, this, 11);
        chip.A02 = new ViewOnClickCListenerShape16S0100000_I1_1(this, 10);
    }
}

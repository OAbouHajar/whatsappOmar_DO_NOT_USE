package X;

import android.content.res.Resources;
import android.view.View;
import com.google.android.material.chip.Chip;
import com.obwhatsapp.R;

/* renamed from: X.3SP  reason: invalid class name */
public final class AnonymousClass3SP extends C005602k {
    public final float A00;
    public final Resources A01;
    public final Chip A02;
    public final C50302Yu A03;

    public AnonymousClass3SP(View view, C50302Yu r4) {
        super(view);
        this.A03 = r4;
        Chip chip = (Chip) view;
        this.A02 = chip;
        Resources A0D = C13680ns.A0D(chip);
        this.A01 = A0D;
        float dimensionPixelSize = (float) A0D.getDimensionPixelSize(R.dimen.dimen03c6);
        this.A00 = dimensionPixelSize;
        chip.setChipIconSize(dimensionPixelSize);
    }
}

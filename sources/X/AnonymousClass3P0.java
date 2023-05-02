package X;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* renamed from: X.3P0  reason: invalid class name */
public class AnonymousClass3P0 extends C017508g {
    public final /* synthetic */ Chip A00;

    public AnonymousClass3P0(Chip chip) {
        this.A00 = chip;
    }

    public void A01(int i2) {
    }

    public void A02(Typeface typeface) {
        Chip chip = this.A00;
        chip.setText(chip.getText());
        chip.requestLayout();
        chip.invalidate();
    }
}

package X;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;

/* renamed from: X.34J  reason: invalid class name */
public class AnonymousClass34J extends C78223xR {
    public boolean A00;

    public AnonymousClass34J(Context context) {
        super(context);
        A01();
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
    }

    public static void A00(Context context, Chip chip, int i2, int i3) {
        chip.setChipIcon(AnonymousClass2SR.A04(context, C13690nt.A0C(context, i2), i3));
        chip.setChipIconSize((float) C87594Xo.A00(context, 18.0f));
        chip.setChipStartPadding((float) C87594Xo.A00(context, 1.0f));
        chip.setTextStartPadding((float) C87594Xo.A00(context, 1.0f));
        chip.setIconStartPadding((float) C87594Xo.A00(context, 8.0f));
        chip.setIconEndPadding((float) C87594Xo.A00(context, 4.0f));
    }

    public void A01() {
        if (!this.A00) {
            this.A00 = true;
            this.A00 = C16150sX.A0Z(C52652eD.A00(generatedComponent()));
        }
    }
}

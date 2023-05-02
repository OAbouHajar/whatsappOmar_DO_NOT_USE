package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.5fY  reason: invalid class name and case insensitive filesystem */
public class C111235fY extends C54882iQ {
    public final /* synthetic */ BottomSheetBehavior A00;
    public final /* synthetic */ PinBottomSheetDialogFragment A01;

    public C111235fY(BottomSheetBehavior bottomSheetBehavior, PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        this.A01 = pinBottomSheetDialogFragment;
        this.A00 = bottomSheetBehavior;
    }

    public void A01(View view, float f2) {
    }

    public void A02(View view, int i2) {
        if (i2 == 1) {
            this.A00.A0M(3);
        }
    }
}

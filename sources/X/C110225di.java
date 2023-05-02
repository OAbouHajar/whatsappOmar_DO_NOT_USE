package X;

import android.os.CountDownTimer;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.5di  reason: invalid class name and case insensitive filesystem */
public class C110225di extends CountDownTimer {
    public final /* synthetic */ PinBottomSheetDialogFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110225di(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, long j2) {
        super(j2, 1000);
        this.A00 = pinBottomSheetDialogFragment;
    }

    public void onFinish() {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        pinBottomSheetDialogFragment.A01 = null;
        pinBottomSheetDialogFragment.A05.setVisibility(4);
        pinBottomSheetDialogFragment.A06.setErrorState(false);
        pinBottomSheetDialogFragment.A06.setEnabled(true);
    }

    public void onTick(long j2) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        C110115dX.A0t(pinBottomSheetDialogFragment.A05, pinBottomSheetDialogFragment, C28961Zl.A04(pinBottomSheetDialogFragment.A09, j2 / 1000), C13680ns.A1b(), R.string.str0f8f);
    }
}

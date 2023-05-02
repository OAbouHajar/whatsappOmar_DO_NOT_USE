package X;

import com.obwhatsapp.R;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.util.Log;

/* renamed from: X.61N  reason: invalid class name */
public class AnonymousClass61N implements AnonymousClass693 {
    public final /* synthetic */ PinBottomSheetDialogFragment A00;
    public final /* synthetic */ C119345ww A01;

    public AnonymousClass61N(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C119345ww r2) {
        this.A01 = r2;
        this.A00 = pinBottomSheetDialogFragment;
    }

    public void AQW(AnonymousClass2HJ r6) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1N();
        }
        Log.e(AnonymousClass000.A0g("PAY: FbPayHubActivity/PaymentStepUpWebviewAction onError: ", r6));
        int i2 = r6.A00;
        if (i2 == 1441) {
            C119345ww r3 = this.A01;
            C118915vc r2 = r3.A0K;
            long j2 = r6.A02;
            r2.A02(j2);
            if (pinBottomSheetDialogFragment != null) {
                C110115dX.A12(pinBottomSheetDialogFragment, j2);
            } else {
                r3.A02();
            }
        } else {
            if (i2 == 1440) {
                if (pinBottomSheetDialogFragment != null) {
                    pinBottomSheetDialogFragment.A1P(r6.A01, R.plurals.plurals0102);
                    return;
                }
            } else if (i2 == 455) {
                if (pinBottomSheetDialogFragment != null) {
                    pinBottomSheetDialogFragment.A1D();
                }
                this.A01.A01();
                return;
            } else {
                if (i2 == 1448) {
                    this.A01.A0H.A03(r6, "FB", "PIN");
                }
                if (pinBottomSheetDialogFragment != null) {
                    pinBottomSheetDialogFragment.A1D();
                }
            }
            this.A01.A02();
        }
    }

    public void AYD(String str, String str2) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1D();
        }
        AnonymousClass01A r2 = (AnonymousClass01A) this.A01.A0L;
        C001000l A0D = r2.A0D();
        AnonymousClass00B.A05(str);
        r2.startActivityForResult(C14750ph.A0k(A0D, str, str2, true, true), 1);
    }
}

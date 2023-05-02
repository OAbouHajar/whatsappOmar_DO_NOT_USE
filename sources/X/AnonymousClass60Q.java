package X;

import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.util.Log;

/* renamed from: X.60Q  reason: invalid class name */
public class AnonymousClass60Q implements AnonymousClass1TV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C14530pL A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ C114185nG A03;
    public final /* synthetic */ String A04;

    public AnonymousClass60Q(C14530pL r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C114185nG r3, String str, int i2) {
        this.A03 = r3;
        this.A00 = i2;
        this.A01 = r1;
        this.A02 = pinBottomSheetDialogFragment;
        this.A04 = str;
    }

    public void AWC(AnonymousClass2HJ r3) {
        Log.i(AnonymousClass000.A0g("PAY: BrazilPaymentCardDetailsViewModel/createCallbackForRemovePaymentMethod/onRequestError. paymentNetworkError: ", r3));
        C110115dX.A0x(this.A03.A01, C13680ns.A0X(), r3);
    }

    public void AWI(AnonymousClass2HJ r6) {
        Log.i(AnonymousClass000.A0g("PAY: BrazilPaymentCardDetailsViewModel/createCallbackForRemovePaymentMethod/onResponseError. paymentNetworkError: ", r6));
        C114185nG r4 = this.A03;
        String str = this.A04;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A02;
        if (!r4.A07(r6, pinBottomSheetDialogFragment, str)) {
            int i2 = this.A00;
            C14530pL r1 = this.A01;
            if (i2 != 1) {
                r1.Ac1();
            } else if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A1N();
                pinBottomSheetDialogFragment.A1D();
            }
            C110115dX.A0x(r4.A01, C13680ns.A0X(), r6);
        }
    }

    public void AWJ(AnonymousClass2HK r7) {
        C114185nG r3 = this.A03;
        int i2 = this.A00;
        C14530pL r4 = this.A01;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A02;
        if (i2 != 1) {
            r4.Ac1();
        } else if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1D();
        }
        if (this.A04.equals("FB") && C110115dX.A0H(r3.A03).A0A().size() < 1) {
            AnonymousClass175 r1 = r3.A01;
            r1.A07(r1.A01("add_card"));
        }
        r3.A02.A09(0);
    }
}

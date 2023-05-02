package X;

import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.util.Log;

/* renamed from: X.5uX  reason: invalid class name and case insensitive filesystem */
public class C118345uX {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C14530pL A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ C114195nH A03;
    public final /* synthetic */ String A04;

    public C118345uX(C14530pL r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C114195nH r3, String str, int i2) {
        this.A03 = r3;
        this.A00 = i2;
        this.A02 = pinBottomSheetDialogFragment;
        this.A01 = r1;
        this.A04 = str;
    }

    public void A00(AnonymousClass2HJ r4) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment;
        Log.i("DyiViewModel/request-report/on-error");
        int i2 = r4.A00;
        if (i2 == 1440 || i2 == 444 || i2 == 478 || i2 == 1441 || i2 == 445 || i2 == 1448 || i2 == 10718) {
            C114195nH r2 = this.A03;
            String str = this.A04;
            AnonymousClass00B.A06(str);
            r2.A07(r4, this.A02, str);
            return;
        }
        if (this.A00 == 1 && (pinBottomSheetDialogFragment = this.A02) != null) {
            pinBottomSheetDialogFragment.A1N();
            pinBottomSheetDialogFragment.A1C();
        }
        C114195nH r22 = this.A03;
        AnonymousClass027 r0 = r22.A02;
        Integer A0X = C13680ns.A0X();
        r0.A09(A0X);
        C110115dX.A0x(r22.A03, A0X, r4);
    }
}

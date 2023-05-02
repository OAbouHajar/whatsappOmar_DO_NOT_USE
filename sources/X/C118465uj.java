package X;

import com.obwhatsapp.R;
import com.obwhatsapp.authentication.FingerprintBottomSheet;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.util.Log;

/* renamed from: X.5uj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C118465uj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C14530pL A01;
    public final /* synthetic */ FingerprintBottomSheet A02;
    public final /* synthetic */ PinBottomSheetDialogFragment A03;
    public final /* synthetic */ C110675ee A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public /* synthetic */ C118465uj(C14530pL r1, FingerprintBottomSheet fingerprintBottomSheet, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C110675ee r4, String str, String str2, String str3, int i2) {
        this.A04 = r4;
        this.A00 = i2;
        this.A03 = pinBottomSheetDialogFragment;
        this.A02 = fingerprintBottomSheet;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = r1;
        this.A07 = str3;
    }

    public final void A00(AnonymousClass2HJ r17, C28371Vv r18) {
        C110675ee r5 = this.A04;
        int i2 = this.A00;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A03;
        FingerprintBottomSheet fingerprintBottomSheet = this.A02;
        String str = this.A05;
        String str2 = this.A06;
        C14530pL r3 = this.A01;
        String str3 = this.A07;
        AnonymousClass2HJ r1 = r17;
        if (r17 != null) {
            if (i2 == 1 && pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A1N();
            }
            r5.A03.A09(r1);
            return;
        }
        if (i2 == 0 && fingerprintBottomSheet != null) {
            fingerprintBottomSheet.A1D();
        }
        C28371Vv r6 = r18;
        if (r5 instanceof C114195nH) {
            C114195nH r52 = (C114195nH) r5;
            Log.i("DyiViewModel/request-report/on-pin-node-ready");
            if (!str2.equals("DYIREPORT")) {
                Log.e("DyiViewModel/request-report/on-pin-node-ready :: no matching actions");
                return;
            }
            if (i2 == 0) {
                r3.Afq(R.string.str13db);
            }
            r52.A0A(new C118345uX(r3, pinBottomSheetDialogFragment, r52, str3, i2), r6, str);
            return;
        }
        C114185nG r53 = (C114185nG) r5;
        if (i2 == 0) {
            r3.Afq(R.string.str13db);
        }
        r53.A04.Acl(new C1217566s(r3, pinBottomSheetDialogFragment, r53, r6, str3, str, i2));
    }
}

package X;

import android.view.View;
import com.facebook.redex.IDxKCallbackShape0S2200000_3_I1;
import com.facebook.redex.IDxPCallbackShape451S0100000_3_I1;
import com.obwhatsapp.authentication.FingerprintBottomSheet;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.61y  reason: invalid class name and case insensitive filesystem */
public class C1205161y implements AnonymousClass698 {
    public final /* synthetic */ C14530pL A00;
    public final /* synthetic */ PinBottomSheetDialogFragment A01;
    public final /* synthetic */ C110675ee A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C1205161y(C14530pL r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C110675ee r3, String str, String str2, String str3) {
        this.A02 = r3;
        this.A01 = pinBottomSheetDialogFragment;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = r1;
    }

    public void AOu(String str) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A01;
        pinBottomSheetDialogFragment.A1O();
        C110675ee r5 = this.A02;
        AnonymousClass5wV r12 = r5.A07;
        String str2 = this.A03;
        String str3 = this.A05;
        C118465uj r1 = new C118465uj(this.A00, (FingerprintBottomSheet) null, pinBottomSheetDialogFragment, r5, this.A04, str2, str3, 1);
        r12.A01(new IDxKCallbackShape0S2200000_3_I1(r1, r12, str, str2, 1), new IDxPCallbackShape451S0100000_3_I1(r1, 1), str3);
    }

    public void ARW(View view) {
        this.A02.A00.A09(Boolean.TRUE);
    }
}

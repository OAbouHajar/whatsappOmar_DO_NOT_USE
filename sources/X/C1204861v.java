package X;

import com.facebook.redex.IDxPCallbackShape451S0100000_3_I1;
import com.obwhatsapp.authentication.FingerprintBottomSheet;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.61v  reason: invalid class name and case insensitive filesystem */
public class C1204861v implements AnonymousClass697 {
    public final /* synthetic */ C14530pL A00;
    public final /* synthetic */ FingerprintBottomSheet A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ C110675ee A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C1204861v(C14530pL r1, FingerprintBottomSheet fingerprintBottomSheet, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C110675ee r4, String str, String str2, String str3) {
        this.A03 = r4;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = r1;
        this.A06 = str3;
        this.A02 = pinBottomSheetDialogFragment;
        this.A01 = fingerprintBottomSheet;
    }

    public void AXD() {
        C110675ee r3 = this.A03;
        String str = this.A05;
        String str2 = this.A04;
        C14530pL r1 = this.A00;
        String str3 = this.A06;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A02;
        pinBottomSheetDialogFragment.A0C = new C1205161y(r1, pinBottomSheetDialogFragment, r3, str2, str3, str);
        r1.Afc(pinBottomSheetDialogFragment);
    }

    public void AYE(byte[] bArr) {
        C110675ee r7 = this.A03;
        AnonymousClass5wV r2 = r7.A07;
        String str = this.A06;
        C118465uj r3 = new C118465uj(this.A00, this.A01, (PinBottomSheetDialogFragment) null, r7, this.A05, this.A04, str, 0);
        r2.A01(new C1204961w(r3, bArr), new IDxPCallbackShape451S0100000_3_I1(r3, 0), str);
    }
}

package X;

import com.facebook.redex.IDxKCallbackShape73S0200000_3_I1;
import com.facebook.redex.IDxPListenerShape115S0200000_3_I1;
import com.obwhatsapp.authentication.FingerprintBottomSheet;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.61u  reason: invalid class name and case insensitive filesystem */
public class C1204761u implements AnonymousClass697 {
    public final /* synthetic */ FingerprintBottomSheet A00;
    public final /* synthetic */ C119345ww A01;

    public C1204761u(FingerprintBottomSheet fingerprintBottomSheet, C119345ww r2) {
        this.A01 = r2;
        this.A00 = fingerprintBottomSheet;
    }

    public void AXD() {
        C119345ww r3 = this.A01;
        PinBottomSheetDialogFragment A002 = C118605ux.A00();
        A002.A0C = new IDxPListenerShape115S0200000_3_I1(A002, 1, r3);
        r3.A06.Afc(A002);
    }

    public void AYE(byte[] bArr) {
        FingerprintBottomSheet fingerprintBottomSheet = this.A00;
        fingerprintBottomSheet.A1D();
        C119345ww r3 = this.A01;
        C14530pL r6 = r3.A06;
        C14870pt r7 = r3.A04;
        C18310wU r9 = r3.A0E;
        C18340wX r8 = r3.A0C;
        C119285wq r10 = r3.A0H;
        C118435ug r5 = new C118435ug(r6, r7, r8, r9, r10, "PIN");
        AnonymousClass50C A0R = C110115dX.A0R(r10, "FB", "PIN");
        if (A0R != null) {
            C28371Vv A012 = new C117915tl(A0R).A01(bArr);
            fingerprintBottomSheet.A1D();
            r3.A06((PinBottomSheetDialogFragment) null, A012);
            return;
        }
        r5.A00(new IDxKCallbackShape73S0200000_3_I1(bArr, 3, this), "FB");
    }
}

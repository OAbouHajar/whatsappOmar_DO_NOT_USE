package X;

import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxPListenerShape115S0200000_3_I1;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.61K  reason: invalid class name */
public class AnonymousClass61K implements AnonymousClass692 {
    public final /* synthetic */ IDxPListenerShape115S0200000_3_I1 A00;
    public final /* synthetic */ String A01;

    public AnonymousClass61K(IDxPListenerShape115S0200000_3_I1 iDxPListenerShape115S0200000_3_I1, String str) {
        this.A00 = iDxPListenerShape115S0200000_3_I1;
        this.A01 = str;
    }

    public void AVP(AnonymousClass2HJ r3) {
        IDxPListenerShape115S0200000_3_I1 iDxPListenerShape115S0200000_3_I1 = this.A00;
        ((DialogFragment) iDxPListenerShape115S0200000_3_I1.A01).A1D();
        ((C119345ww) iDxPListenerShape115S0200000_3_I1.A00).A02();
    }

    public void AVQ(AnonymousClass50C r5) {
        IDxPListenerShape115S0200000_3_I1 iDxPListenerShape115S0200000_3_I1 = this.A00;
        C117915tl r2 = new C117915tl(r5);
        String str = this.A01;
        C119345ww.A00(r2, (PinBottomSheetDialogFragment) iDxPListenerShape115S0200000_3_I1.A01, (C119345ww) iDxPListenerShape115S0200000_3_I1.A00, str);
    }
}

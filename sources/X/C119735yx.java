package X;

import android.widget.CompoundButton;
import com.obwhatsapp.payments.ui.BrazilPaymentDPOActivity;

/* renamed from: X.5yx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119735yx implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ BrazilPaymentDPOActivity A00;

    public /* synthetic */ C119735yx(BrazilPaymentDPOActivity brazilPaymentDPOActivity) {
        this.A00 = brazilPaymentDPOActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        C114035n1 r3 = this.A00.A00;
        String charSequence = compoundButton.getText().toString();
        AnonymousClass2St A0N = C110105dW.A0N();
        A0N.A01("product_flow", "p2m");
        A0N.A01("checkbox_text", charSequence);
        C1222969a r32 = r3.A07;
        Integer A0Y = C13680ns.A0Y();
        int i2 = 123;
        if (z2) {
            i2 = 122;
        }
        r32.AKU(A0N, A0Y, Integer.valueOf(i2), "restore_payment", (String) null);
    }
}

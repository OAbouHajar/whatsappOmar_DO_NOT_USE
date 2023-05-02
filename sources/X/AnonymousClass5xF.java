package X;

import android.content.Intent;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;

/* renamed from: X.5xF  reason: invalid class name */
public class AnonymousClass5xF {
    public C14870pt A00;
    public C16040sK A01;
    public C18260wP A02;
    public C16440t3 A03;
    public C16460t6 A04;
    public AnonymousClass175 A05;
    public C18340wX A06;
    public C18300wT A07;
    public C18310wU A08;
    public AnonymousClass5xE A09;
    public C18320wV A0A;
    public C18290wS A0B;
    public C118365uZ A0C;
    public C118495um A0D;
    public C119285wq A0E;
    public C1222969a A0F;
    public AnonymousClass5xG A0G;
    public C118915vc A0H;
    public C18280wR A0I;
    public C16320sq A0J;

    public static /* synthetic */ void A00(C14530pL r6, AnonymousClass5xF r7, String str, boolean z2, boolean z3) {
        if (!z3) {
            r6.finish();
            return;
        }
        Intent A042 = C110105dW.A04(r6, BrazilPayBloksActivity.class);
        HashMap A0x = AnonymousClass000.A0x();
        if (!r7.A0G.A05() || r7.A0G.A01() == 1) {
            A042.putExtra("screen_name", "brpay_p_add_card");
        } else {
            A042.putExtra("screen_name", "brpay_p_add_biometric");
            A0x.put("pin", str);
            A0x.put("show_add_card", "1");
        }
        A0x.put("verification_needed", "1");
        A042.putExtra("screen_params", A0x);
        r6.A2X(A042, z2);
    }

    public final void A01(C14530pL r14) {
        C110105dW.A06(this.A07).remove("payment_account_recovered").remove("payment_account_recoverable").remove("payment_account_recoverable_time_ms").apply();
        C14870pt r3 = this.A00;
        C16320sq r12 = this.A0J;
        C18280wR r11 = this.A0I;
        C18290wS r10 = this.A0B;
        C14530pL r2 = r14;
        new AnonymousClass5vZ(r2, r3, this.A02, this.A04, this.A06, this.A07, this.A08, this.A0A, r10, r11, r12).A00((AnonymousClass1TV) null);
    }

    public void A02(C14530pL r5, String str) {
        C1222969a r3 = this.A0F;
        AnonymousClass00B.A06(r3);
        r3.AKS(0, (Integer) null, "prompt_warn_setup_without_recover", str);
        C005302h r2 = new C005302h(r5);
        r2.setTitle(r5.getString(R.string.str0081));
        boolean equals = "receive_flow".equals(str);
        int i2 = R.string.str007f;
        if (equals) {
            i2 = R.string.str007e;
        }
        C110115dX.A0m(r5, r2, i2);
        r2.A09(new AnonymousClass5y5(r5, this, str), r5.getString(R.string.str0080));
        r2.A08(new AnonymousClass5y0(this, str), r5.getString(R.string.str0fb5));
        r2.A00();
    }

    public void A03(C14530pL r7, boolean z2) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = new PinBottomSheetDialogFragment();
        pinBottomSheetDialogFragment.A0B = new C112695iv();
        pinBottomSheetDialogFragment.A0D = true;
        C13680ns.A13(pinBottomSheetDialogFragment.A07);
        pinBottomSheetDialogFragment.A0C = new C1205061x(r7, pinBottomSheetDialogFragment, this, z2, true);
        r7.Afc(pinBottomSheetDialogFragment);
    }
}

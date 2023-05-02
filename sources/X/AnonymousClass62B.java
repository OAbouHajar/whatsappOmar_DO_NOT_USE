package X;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.redex.IDxRCallbackShape249S0100000_3_I1;
import com.facebook.redex.IDxTCallbackShape262S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentMethodSelectionActivity;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.obwhatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.obwhatsapp.payments.ui.widget.PaymentMethodRow;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.62B  reason: invalid class name */
public class AnonymousClass62B implements C1223069b {
    public final /* synthetic */ C112825ja A00;
    public final /* synthetic */ PaymentMethodsListPickerFragment A01;

    public AnonymousClass62B(C112825ja r1, PaymentMethodsListPickerFragment paymentMethodsListPickerFragment) {
        this.A00 = r1;
        this.A01 = paymentMethodsListPickerFragment;
    }

    public List A91(List list) {
        return null;
    }

    public View A9o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C112825ja r1 = this.A00;
        if (r1.A0j.size() == 0) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.layout0331, (ViewGroup) null);
        C110105dW.A0q(inflate, R.id.check_balance_icon, AnonymousClass00T.A00(r1, R.color.color070f));
        return inflate;
    }

    public View ACM(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        return C13680ns.A0H(layoutInflater, frameLayout, R.layout.layout04aa);
    }

    public int ADe(C30671cl r4) {
        C112825ja r2 = this.A00;
        if (C111345g2.A20(r4, r2) || !r4.equals(r2.A0B)) {
            return 0;
        }
        return R.drawable.countrypicker_checkmark;
    }

    public String ADh(C30671cl r3) {
        C112825ja r1 = this.A00;
        if (C111345g2.A20(r3, r1)) {
            return r1.getString(R.string.str0f7f);
        }
        return null;
    }

    public String ADi(C30671cl r4) {
        C112825ja r2 = this.A00;
        return C119405xi.A05(r2, r4, r2.A0P, false);
    }

    public View AEi(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C112825ja r0 = this.A00;
        r0.A0E.AKS(C13680ns.A0X(), (Integer) null, "available_payment_methods_prompt", r0.A0g);
        return null;
    }

    public void AM8() {
        C112825ja r2 = this.A00;
        r2.A3t(57, "available_payment_methods_prompt");
        r2.A3r();
    }

    public void AMC() {
        Intent intent;
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A01.A0A();
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A1N();
        }
        C112825ja r2 = this.A00;
        if (r2.A0j.size() == 1) {
            C111805hR r0 = (C111805hR) C110115dX.A0G(r2.A0j, 0).A08;
            if (r0 != null && !AnonymousClass000.A1X(r0.A05.A00)) {
                AnonymousClass29T.A01(r2, 29);
                return;
            } else if (r2.A0C.A0C(1969)) {
                AnonymousClass4W4 r6 = new AnonymousClass4W4((Map) null, "upi_p2p_check_balance", (String) null);
                HashMap A0x = AnonymousClass000.A0x();
                A0x.put("credential_id", C110115dX.A0G(r2.A0j, 0).A0A);
                r2.A05.A08(0, R.string.str13db);
                ((AnonymousClass1JN) r2.A0k.get()).A00(new IDxRCallbackShape249S0100000_3_I1(this, 3), new IDxTCallbackShape262S0100000_3_I1(this, 1), r6, "available_payment_methods_prompt", A0x);
                r2.A3t(62, "available_payment_methods_prompt");
            } else {
                C30671cl A0G = C110115dX.A0G(r2.A0j, 0);
                intent = C110105dW.A04(r2, IndiaUpiCheckBalanceActivity.class);
                C110115dX.A0o(intent, A0G);
            }
        } else {
            List list = r2.A0j;
            intent = C110105dW.A04(r2, IndiaUpiPaymentMethodSelectionActivity.class);
            intent.putExtra("bank_accounts", (Serializable) list);
        }
        r2.startActivityForResult(intent, 1015);
        r2.A3t(62, "available_payment_methods_prompt");
    }

    public void ANA() {
        this.A00.A3t(1, "available_payment_methods_prompt");
    }

    public boolean AfB(C30671cl r2) {
        return C111345g2.A20(r2, this.A00);
    }

    public boolean AfL() {
        return false;
    }

    public boolean AfP() {
        return false;
    }

    public void AfY(C30671cl r1, PaymentMethodRow paymentMethodRow) {
    }
}

package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.AnonymousClass1GP;
import X.AnonymousClass1WD;
import X.AnonymousClass4PY;
import X.AnonymousClass68Z;
import X.C110105dW;
import X.C119405xi;
import X.C13680ns;
import X.C13690nt;
import X.C18290wS;
import X.C30671cl;
import X.C39901tF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.IDxAObserverShape92S0100000_3_I1;
import com.obwhatsapp.payments.ui.widget.PaymentMethodRow;

public abstract class ConfirmReceivePaymentFragment extends Hilt_ConfirmReceivePaymentFragment implements AnonymousClass68Z {
    public Button A00;
    public AnonymousClass1WD A01;
    public C30671cl A02;
    public AnonymousClass1GP A03;
    public C18290wS A04;
    public PaymentMethodRow A05;
    public final AnonymousClass4PY A06 = new IDxAObserverShape92S0100000_3_I1(this, 1);

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0124);
        this.A05 = (PaymentMethodRow) A0H.findViewById(R.id.payment_method_row);
        this.A00 = (Button) A0H.findViewById(R.id.confirm_payment);
        View findViewById = A0H.findViewById(R.id.add_another_method);
        A0H.findViewById(R.id.account_number_divider).setVisibility(8);
        C13690nt.A13(A0H, R.id.payment_method_account_id, 8);
        C30671cl r0 = this.A02;
        AnonymousClass00B.A06(r0);
        AUY(r0);
        AnonymousClass01A r1 = this.A0D;
        if (r1 != null) {
            C110105dW.A0s(A0H.findViewById(R.id.payment_method_container), r1, this, 8);
            C110105dW.A0s(findViewById, r1, this, 9);
        }
        return A0H;
    }

    public void A12() {
        super.A12();
        this.A03.A03(this.A06);
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        AnonymousClass1WD r0 = this.A01;
        if (r0 != null) {
            r0.A04();
        }
        this.A01 = this.A04.A01().A00();
        Parcelable parcelable = A04().getParcelable("args_payment_method");
        AnonymousClass00B.A06(parcelable);
        this.A02 = (C30671cl) parcelable;
        this.A03.A02(this.A06);
    }

    public void AUY(C30671cl r6) {
        this.A02 = r6;
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) this;
        brazilConfirmReceivePaymentFragment.A05.A02.setVisibility(0);
        PaymentMethodRow paymentMethodRow = brazilConfirmReceivePaymentFragment.A05;
        paymentMethodRow.A05.setText(C119405xi.A05(brazilConfirmReceivePaymentFragment.A02(), r6, brazilConfirmReceivePaymentFragment.A04, true));
        C39901tF r0 = r6.A08;
        AnonymousClass00B.A06(r0);
        if (!r0.A09()) {
            brazilConfirmReceivePaymentFragment.A05.A01(brazilConfirmReceivePaymentFragment.A0J(R.string.str0f80));
        }
        PaymentMethodRow paymentMethodRow2 = brazilConfirmReceivePaymentFragment.A05;
        if (C119405xi.A09(r6)) {
            brazilConfirmReceivePaymentFragment.A0H.A02(r6, paymentMethodRow2);
        }
        brazilConfirmReceivePaymentFragment.A05.A02(true);
        C110105dW.A0s(this.A00, r6, this, 7);
    }
}

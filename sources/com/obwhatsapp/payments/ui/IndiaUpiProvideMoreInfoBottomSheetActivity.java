package com.obwhatsapp.payments.ui;

import X.C001000l;
import X.C004601z;
import X.C110105dW;
import X.C110115dX;
import X.C111345g2;
import X.C112805jS;
import X.C1200960h;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C49132Rg;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.RoundedBottomSheetDialogFragment;

public class IndiaUpiProvideMoreInfoBottomSheetActivity extends C112805jS {
    public boolean A00;

    public class BottomSheetProvideMoreInfoFragment extends RoundedBottomSheetDialogFragment {
        public void A0k() {
            super.A0k();
            C110115dX.A0v(this);
        }

        public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0309);
            C001000l A0C = A0C();
            if (A0C != null) {
                C110105dW.A0r(C004601z.A0E(A0H, R.id.close), this, 76);
                C110105dW.A0r(C004601z.A0E(A0H, R.id.account_recovery_info_continue), A0C, 77);
            }
            return A0H;
        }
    }

    public IndiaUpiProvideMoreInfoBottomSheetActivity() {
        this(0);
    }

    public IndiaUpiProvideMoreInfoBottomSheetActivity(int i2) {
        this.A00 = false;
        C110105dW.A0t(this, 73);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            this.A04 = (C1200960h) r1.ACB.get();
            this.A00 = C110115dX.A0D(r1);
            this.A02 = C16150sX.A0z(r1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A01 = new BottomSheetProvideMoreInfoFragment();
        Afc(paymentBottomSheet);
    }
}

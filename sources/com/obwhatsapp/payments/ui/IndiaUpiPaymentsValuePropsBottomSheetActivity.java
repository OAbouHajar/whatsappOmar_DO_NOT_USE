package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass61W;
import X.C001000l;
import X.C004601z;
import X.C110105dW;
import X.C110115dX;
import X.C112795jR;
import X.C112905kS;
import X.C13680ns;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.RoundedBottomSheetDialogFragment;

public class IndiaUpiPaymentsValuePropsBottomSheetActivity extends C112905kS {

    public class BottomSheetValuePropsFragment extends RoundedBottomSheetDialogFragment {
        public void A0k() {
            super.A0k();
            C001000l A0C = A0C();
            if (A0C instanceof IndiaUpiPaymentsValuePropsBottomSheetActivity) {
                ((C112795jR) A0C).A3U();
            }
            C110115dX.A0v(this);
        }

        public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View inflate = layoutInflater.inflate(R.layout.layout033e, viewGroup, false);
            View A0E = C004601z.A0E(inflate, R.id.close);
            C112795jR r2 = (C112795jR) A0C();
            if (r2 != null) {
                C110105dW.A0s(A0E, r2, this, 15);
                TextView A0L = C13680ns.A0L(inflate, R.id.value_props_sub_title);
                View A0E2 = C004601z.A0E(inflate, R.id.value_props_contact_img);
                TextSwitcher textSwitcher = (TextSwitcher) C004601z.A0E(inflate, R.id.value_props_desc);
                TextView A0L2 = C13680ns.A0L(inflate, R.id.value_props_continue);
                if (r2.A02 == 2) {
                    A0L2.setText(R.string.str02ac);
                    A0E2.setVisibility(8);
                    C13680ns.A1F(A0L, this, R.string.str1185);
                    textSwitcher.setText(A0J(R.string.str1184));
                    r2.A3W((Long) null);
                    if (r2.A0F != null) {
                        AnonymousClass61W r5 = r2.A0E;
                        r5.A02.A06(r5.A04(C13680ns.A0Y(), 55, "chat", r2.A02, r2.A0g, r2.A0f, AnonymousClass000.A1R(r2.A02, 11)));
                    }
                } else {
                    r2.A3V(textSwitcher);
                    if (r2.A02 == 11) {
                        C13680ns.A1F(A0L, this, R.string.str1186);
                        C004601z.A0E(inflate, R.id.value_props_sub_title_2).setVisibility(0);
                    }
                }
                C110105dW.A0r(A0L2, r2, 68);
            }
            return inflate;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A01 = new BottomSheetValuePropsFragment();
        Afc(paymentBottomSheet);
    }
}

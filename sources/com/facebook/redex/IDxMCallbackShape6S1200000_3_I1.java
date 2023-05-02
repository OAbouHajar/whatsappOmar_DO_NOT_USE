package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1Z7;
import X.AnonymousClass2HJ;
import X.AnonymousClass5x7;
import X.AnonymousClass638;
import X.C110105dW;
import X.C110115dX;
import X.C112855jo;
import X.C1222468v;
import X.C35391lr;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import com.obwhatsapp.payments.ui.ConfirmReceivePaymentFragment;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public class IDxMCallbackShape6S1200000_3_I1 implements C1222468v {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxMCallbackShape6S1200000_3_I1(Object obj, String str, Object obj2, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = str;
    }

    public void AOB(C35391lr r5) {
        if (this.A03 != 0) {
            Log.i("PAY: BrazilPayBloksActivity BrazilGetVerificationMethods - onCardVerified");
            ((C112855jo) this.A00).A0G.A01().A02(new IDxSListenerShape50S0200000_3_I1(this.A01, 12, this), r5);
            return;
        }
        Log.i("PAY: BrazilConfirmReceivePayment BrazilGetVerificationMethods - onCardVerified");
        ((ConfirmReceivePaymentFragment) this.A00).A04.A01().A02(new IDxSListenerShape43S0300000_3_I1(r5, this, this.A01, 1), r5);
    }

    public void AWW(AnonymousClass2HJ r9, List list) {
        int i2;
        if (this.A03 != 0) {
            if (r9 != null) {
                i2 = r9.A00;
            } else if (list != null && !list.isEmpty()) {
                BrazilPayBloksActivity brazilPayBloksActivity = (BrazilPayBloksActivity) this.A00;
                if (AnonymousClass5x7.A01(list)) {
                    i2 = -233;
                } else {
                    int A002 = C110115dX.A00(brazilPayBloksActivity, list);
                    JSONArray A022 = brazilPayBloksActivity.A07.A02(list);
                    int A0A = BrazilPayBloksActivity.A0A(list);
                    AnonymousClass638 A0M = C110105dW.A0M(brazilPayBloksActivity.A0C, list, A002, A0A);
                    C35391lr r3 = (C35391lr) brazilPayBloksActivity.A05.A08(this.A02);
                    if (A022 != null) {
                        ((AnonymousClass1Z7) this.A01).A01("on_success", brazilPayBloksActivity.A0L.A03(r3, A0M, A022.toString(), A0A));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            C112855jo.A09((AnonymousClass1Z7) this.A01, (Map) null, i2);
            return;
        }
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) this.A00;
        brazilConfirmReceivePaymentFragment.A00.A05();
        if (r9 == null && list != null && !list.isEmpty()) {
            if (brazilConfirmReceivePaymentFragment.A06.A0C(2443)) {
                Collections.sort(list);
            }
            JSONArray A023 = brazilConfirmReceivePaymentFragment.A08.A02(list);
            int A0A2 = BrazilPayBloksActivity.A0A(list);
            if (A023 != null && !AnonymousClass5x7.A01(list)) {
                AnonymousClass638 A0M2 = C110105dW.A0M(brazilConfirmReceivePaymentFragment.A06, list, 2443, A0A2);
                String str = this.A02;
                String obj = A023.toString();
                C35391lr r4 = (C35391lr) C110115dX.A0H(brazilConfirmReceivePaymentFragment.A04).A08(str);
                if (r4 != null) {
                    brazilConfirmReceivePaymentFragment.A0r(brazilConfirmReceivePaymentFragment.A0I.A01(brazilConfirmReceivePaymentFragment.A0C(), r4, A0M2, obj, A0A2));
                }
                DialogFragment dialogFragment = (DialogFragment) this.A01;
                if (dialogFragment != null) {
                    dialogFragment.A1C();
                    return;
                }
                return;
            }
        }
        Log.i(AnonymousClass000.A0l(AnonymousClass000.A0r("PAY: BrazilConfirmReceivePayment GetVerificationMethods Error: "), 0));
        brazilConfirmReceivePaymentFragment.A09.A01(brazilConfirmReceivePaymentFragment.A0u(), brazilConfirmReceivePaymentFragment.A06, brazilConfirmReceivePaymentFragment.A0B, 0, R.string.str0fd1).show();
    }
}

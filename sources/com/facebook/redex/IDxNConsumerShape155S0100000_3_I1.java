package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1WE;
import X.AnonymousClass2HJ;
import X.AnonymousClass5wX;
import X.AnonymousClass5xE;
import X.AnonymousClass61C;
import X.C110105dW;
import X.C110115dX;
import X.C110335du;
import X.C111815hS;
import X.C112825ja;
import X.C112885jv;
import X.C116305rA;
import X.C118425uf;
import X.C1209663r;
import X.C1223069b;
import X.C13680ns;
import X.C16010sH;
import X.C18300wT;
import X.C30671cl;
import X.C53842gO;
import X.C73583oO;
import android.text.TextUtils;
import com.obwhatsapp.payments.IDxAObserverShape92S0100000_3_I1;
import com.obwhatsapp.payments.IndiaUpiPaymentInvitePickerActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.obwhatsapp.payments.ui.PaymentMethodsListPickerFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IDxNConsumerShape155S0100000_3_I1 implements AnonymousClass1WE {
    public Object A00;
    public final int A01;

    public IDxNConsumerShape155S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void accept(Object obj) {
        switch (this.A01) {
            case 0:
                C13680ns.A0z(C110105dW.A06((C18300wT) this.A00), "payment_is_first_send", AnonymousClass000.A1X(obj));
                return;
            case 1:
                IndiaUpiPaymentInvitePickerActivity indiaUpiPaymentInvitePickerActivity = (IndiaUpiPaymentInvitePickerActivity) this.A00;
                AnonymousClass2HJ r12 = (AnonymousClass2HJ) obj;
                indiaUpiPaymentInvitePickerActivity.A0B = false;
                if (!indiaUpiPaymentInvitePickerActivity.isFinishing()) {
                    AnonymousClass5xE r4 = indiaUpiPaymentInvitePickerActivity.A05;
                    int i2 = r12.A00;
                    IDxDListenerShape160S0100000_3_I1 iDxDListenerShape160S0100000_3_I1 = new IDxDListenerShape160S0100000_3_I1(indiaUpiPaymentInvitePickerActivity, 1);
                    r4.A04(indiaUpiPaymentInvitePickerActivity, iDxDListenerShape160S0100000_3_I1, iDxDListenerShape160S0100000_3_I1, iDxDListenerShape160S0100000_3_I1, (String) null, i2).show();
                    C53842gO A03 = indiaUpiPaymentInvitePickerActivity.A07.A03(4, 51, "payment_home", C110115dX.A0a(indiaUpiPaymentInvitePickerActivity));
                    A03.A0S = String.valueOf(r12.A00);
                    indiaUpiPaymentInvitePickerActivity.A07.AKR(A03);
                    return;
                }
                return;
            case 2:
                IndiaUpiPaymentInvitePickerActivity indiaUpiPaymentInvitePickerActivity2 = (IndiaUpiPaymentInvitePickerActivity) this.A00;
                List<C16010sH> list = (List) obj;
                C116305rA r5 = indiaUpiPaymentInvitePickerActivity2.A09;
                ArrayList A0u = AnonymousClass000.A0u();
                if (list != null) {
                    for (C16010sH r2 : list) {
                        if (!r5.A00.A0V(C110115dX.A0I(r2))) {
                            A0u.add(r2);
                        }
                    }
                }
                Collections.sort(A0u, new C73583oO(indiaUpiPaymentInvitePickerActivity2.A0L, indiaUpiPaymentInvitePickerActivity2.A0S));
                indiaUpiPaymentInvitePickerActivity2.A3b(A0u);
                indiaUpiPaymentInvitePickerActivity2.A0B = false;
                return;
            case 3:
                AnonymousClass5wX r3 = (AnonymousClass5wX) this.A00;
                C30671cl r122 = (C30671cl) obj;
                C111815hS r22 = (C111815hS) r122.A08;
                if (r22 != null && "VISA".equals(r22.A03) && TextUtils.isEmpty(r22.A06)) {
                    new C118425uf(r3.A00, r3.A01, r3.A03, r3.A0B, r3.A0C, new AnonymousClass61C(r122, r3, r22)).A00(r3.A0R);
                    return;
                }
                return;
            case 4:
                BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = (BrazilPaymentCardDetailsActivity) this.A00;
                if (AnonymousClass000.A1X(obj)) {
                    brazilPaymentCardDetailsActivity.A0G.Acl(new C1209663r(brazilPaymentCardDetailsActivity));
                    return;
                }
                return;
            case 5:
                C112825ja r1 = (C112825ja) this.A00;
                r1.A0H.A0D = (Boolean) obj;
                r1.A40((AnonymousClass2HJ) null);
                return;
            case 6:
                ((C112885jv) this.A00).A38((C30671cl) obj, true);
                return;
            default:
                List list2 = (List) obj;
                PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = (PaymentMethodsListPickerFragment) ((IDxAObserverShape92S0100000_3_I1) this.A00).A00;
                C110335du r13 = paymentMethodsListPickerFragment.A07;
                C1223069b r0 = paymentMethodsListPickerFragment.A08;
                if (r0 != null) {
                    list2 = r0.A91(list2);
                }
                r13.A02 = list2;
                r13.notifyDataSetChanged();
                return;
        }
    }
}

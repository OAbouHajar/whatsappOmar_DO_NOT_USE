package com.facebook.redex;

import X.AnonymousClass2HJ;
import X.AnonymousClass5Q9;
import X.AnonymousClass62B;
import X.C110105dW;
import X.C110115dX;
import X.C112825ja;
import X.C112885jv;
import X.C119265wo;
import X.C13690nt;
import X.C14550pN;
import X.C14870pt;
import X.C30671cl;
import android.content.Intent;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import java.util.Map;

public class IDxTCallbackShape262S0100000_3_I1 implements AnonymousClass5Q9 {
    public Object A00;
    public final int A01;

    public IDxTCallbackShape262S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void ARR(Map map) {
        Number number;
        C14870pt r0;
        switch (this.A01) {
            case 0:
                r0 = ((C112885jv) this.A00).A04;
                break;
            case 1:
                C112825ja r1 = ((AnonymousClass62B) this.A00).A00;
                r1.A05.A05();
                r1.A3p();
                return;
            case 3:
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this.A00;
                if (map != null) {
                    String A0e = C13690nt.A0e("action", map);
                    if (A0e != null) {
                        String A0e2 = C13690nt.A0e("credential_id", map);
                        switch (A0e.hashCode()) {
                            case -1240788020:
                                if (A0e.equals("accept_success")) {
                                    indiaUpiSendPaymentActivity.A0Y.A01(A0e2);
                                    indiaUpiSendPaymentActivity.A0m = true;
                                    indiaUpiSendPaymentActivity.A0E.A00.A00(new IDxNConsumerShape155S0100000_3_I1(indiaUpiSendPaymentActivity, 5));
                                    return;
                                }
                                return;
                            case -716333109:
                                if (A0e.equals("create_new_account")) {
                                    indiaUpiSendPaymentActivity.A3r();
                                    return;
                                }
                                return;
                            case -460192429:
                                if (A0e.equals("accept_failure")) {
                                    indiaUpiSendPaymentActivity.A0Y.A01(A0e2);
                                    indiaUpiSendPaymentActivity.A0m = true;
                                    Map map2 = (Map) map.get("error");
                                    if (!(map2 == null || (number = (Number) map2.get("code")) == null)) {
                                        indiaUpiSendPaymentActivity.A40(new AnonymousClass2HJ(number.intValue()));
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            case 74085029:
                                if (A0e.equals("check_balance")) {
                                    C30671cl r2 = indiaUpiSendPaymentActivity.A0B;
                                    Intent A04 = C110105dW.A04(indiaUpiSendPaymentActivity, IndiaUpiCheckBalanceActivity.class);
                                    C110115dX.A0o(A04, r2);
                                    indiaUpiSendPaymentActivity.Ag3(A04, 1015);
                                    return;
                                }
                                return;
                            case 1476662760:
                                if (A0e.equals("forgot_upi_pin")) {
                                    indiaUpiSendPaymentActivity.A4E(A0e2, true);
                                    return;
                                }
                                return;
                            case 1558549715:
                                if (A0e.equals("setup_pin")) {
                                    indiaUpiSendPaymentActivity.A4E(A0e2, false);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    }
                    indiaUpiSendPaymentActivity.A05.A05();
                    indiaUpiSendPaymentActivity.A46(new C119265wo(R.string.str1031), (String) null, new Object[0]);
                    return;
                }
                return;
            default:
                r0 = ((C14550pN) this.A00).A05;
                break;
        }
        r0.A05();
    }
}

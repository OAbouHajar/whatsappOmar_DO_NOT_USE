package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.AnonymousClass1WD;
import X.AnonymousClass1WE;
import X.AnonymousClass5xV;
import X.AnonymousClass62I;
import X.AnonymousClass62O;
import X.AnonymousClass65R;
import X.C110115dX;
import X.C119405xi;
import X.C15830rv;
import X.C28401Vy;
import X.C30671cl;
import X.C35391lr;
import X.C47222Ic;
import android.content.Intent;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import com.obwhatsapp.payments.ui.IDxUExtensionShape96S0100000_3_I1;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.obwhatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

public class IDxNConsumerShape42S0200000_3_I1 implements AnonymousClass1WE {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxNConsumerShape42S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void accept(Object obj) {
        AnonymousClass1WD r0;
        BrazilPaymentActivity brazilPaymentActivity;
        C28401Vy r1;
        boolean z2;
        Object obj2 = obj;
        switch (this.A02) {
            case 0:
                AnonymousClass01A r4 = (AnonymousClass01A) this.A00;
                List list = (List) obj2;
                AnonymousClass00B.A06(list);
                PaymentMethodsListPickerFragment A012 = PaymentMethodsListPickerFragment.A01(list);
                A012.A0W(r4, 0);
                A012.A08 = new IDxUExtensionShape96S0100000_3_I1(r4, 0);
                ((PaymentBottomSheet) this.A01).A1O(A012);
                return;
            case 1:
                BrazilPaymentActivity brazilPaymentActivity2 = (BrazilPaymentActivity) this.A00;
                Intent intent = (Intent) this.A01;
                List list2 = (List) obj2;
                if (brazilPaymentActivity2.A0U != null) {
                    String stringExtra = intent.getStringExtra("payment_method_credential_id");
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C30671cl A0F = C110115dX.A0F(it);
                            if (A0F.A0A.equals(stringExtra)) {
                                brazilPaymentActivity2.A0U.AUY(A0F);
                            }
                        }
                    }
                }
                r0 = brazilPaymentActivity2.A02;
                break;
            case 2:
                brazilPaymentActivity = (BrazilPaymentActivity) this.A00;
                r1 = (C28401Vy) this.A01;
                z2 = AnonymousClass000.A1X(obj);
                brazilPaymentActivity.A0e = z2;
                brazilPaymentActivity.Ac1();
                break;
            case 3:
                brazilPaymentActivity = (BrazilPaymentActivity) this.A00;
                r1 = (C28401Vy) this.A01;
                brazilPaymentActivity.Ac1();
                z2 = ((Boolean) obj2).booleanValue();
                brazilPaymentActivity.A0e = z2;
                break;
            case 4:
                BrazilPaymentActivity brazilPaymentActivity3 = (BrazilPaymentActivity) this.A00;
                C28401Vy r3 = (C28401Vy) this.A01;
                List list3 = (List) obj2;
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    C30671cl A0F2 = C110115dX.A0F(it2);
                    if (C119405xi.A09(A0F2) && A0F2.A08 != null && A0F2.A00 == 2) {
                        brazilPaymentActivity3.A3A(r3);
                        return;
                    }
                }
                if (list3.size() > 0) {
                    brazilPaymentActivity3.A05.A0K(new AnonymousClass65R((C35391lr) list3.get(C119405xi.A01(list3)), brazilPaymentActivity3));
                    return;
                } else {
                    Log.e("PAY: BrazilPaymentActivity/onRequestPayment: Can't launch ConfirmReceiveFragment");
                    return;
                }
            default:
                AnonymousClass62O r12 = (AnonymousClass62O) this.A00;
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = r12.A00;
                AnonymousClass5xV r2 = indiaUpiSendPaymentActivity.A0V;
                C15830rv r6 = indiaUpiSendPaymentActivity.A0E;
                AnonymousClass00B.A06(r6);
                UserJid userJid = indiaUpiSendPaymentActivity.A0G;
                long j2 = indiaUpiSendPaymentActivity.A02;
                String paymentNote = indiaUpiSendPaymentActivity.A0X.getPaymentNote();
                List mentionedJids = indiaUpiSendPaymentActivity.A0X.getMentionedJids();
                r2.A04(indiaUpiSendPaymentActivity, (C28401Vy) this.A01, indiaUpiSendPaymentActivity.A0X.getPaymentBackground(), r6, userJid, (C47222Ic) obj2, new AnonymousClass62I(r12), paymentNote, mentionedJids, j2);
                return;
        }
        brazilPaymentActivity.A3M(r1, z2);
        r0 = brazilPaymentActivity.A04;
        r0.A04();
    }
}

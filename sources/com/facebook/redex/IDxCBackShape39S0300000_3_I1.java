package com.facebook.redex;

import X.AnonymousClass013;
import X.AnonymousClass65P;
import X.C005402i;
import X.C109295Rm;
import X.C110105dW;
import X.C117735tT;
import X.C13680ns;
import X.C13690nt;
import X.C16840tj;
import X.C16880tn;
import X.C35251lc;
import X.C35431lv;
import X.C797441c;
import android.content.res.Resources;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import com.obwhatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IDxCBackShape39S0300000_3_I1 implements C109295Rm {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCBackShape39S0300000_3_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public void AXg() {
        if (this.A03 != 0) {
            BrazilOrderDetailsActivity brazilOrderDetailsActivity = (BrazilOrderDetailsActivity) this.A00;
            C005402i AGK = brazilOrderDetailsActivity.AGK();
            if (AGK != null) {
                int i2 = ((C117735tT) this.A02).A00;
                int i3 = R.string.str0edc;
                if (i2 == 1) {
                    i3 = R.string.str146c;
                }
                AGK.A0J(brazilOrderDetailsActivity.getResources().getString(i3));
            }
            PaymentCheckoutOrderDetailsViewV2 paymentCheckoutOrderDetailsViewV2 = brazilOrderDetailsActivity.A07;
            C797441c r7 = (C797441c) this.A01;
            C117735tT r8 = (C117735tT) this.A02;
            int i4 = r8.A00;
            brazilOrderDetailsActivity.A0F.A02(brazilOrderDetailsActivity.A0E, (String) null, 4, true, paymentCheckoutOrderDetailsViewV2.A01(r7, r8, "WhatsappPay", 3, i4));
            brazilOrderDetailsActivity.A07.A00(brazilOrderDetailsActivity, brazilOrderDetailsActivity.A01, r7, r8, "WhatsappPay", 3, i4);
            return;
        }
        BrazilOrderDetailsActivity brazilOrderDetailsActivity2 = (BrazilOrderDetailsActivity) this.A00;
        brazilOrderDetailsActivity2.Ac1();
        String str = brazilOrderDetailsActivity2.A0m;
        if (str == null) {
            brazilOrderDetailsActivity2.AWz(((C35431lv) this.A02).A02);
        } else {
            brazilOrderDetailsActivity2.A06.A00(new AnonymousClass65P(this, (C35431lv) this.A02), str);
        }
    }

    public void AXi() {
        C35251lc r0;
        if (this.A03 == 0) {
            BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) this.A00;
            brazilPaymentActivity.Ac1();
            C16840tj r1 = (C16840tj) this.A01;
            C16880tn AAt = r1.AAt();
            if (AAt != null && (r0 = AAt.A01) != null && r0.A05.A02 != null) {
                Resources resources = brazilPaymentActivity.getResources();
                Object[] A1b = C13680ns.A1b();
                long j2 = r1.AAt().A01.A05.A02.A00;
                AnonymousClass013 r6 = brazilPaymentActivity.A04;
                C110105dW.A0n(brazilPaymentActivity, resources, new SimpleDateFormat("HH:mm", C13690nt.A0m(r6)).format(new Date(j2 * 1000)), A1b);
            }
        }
    }
}

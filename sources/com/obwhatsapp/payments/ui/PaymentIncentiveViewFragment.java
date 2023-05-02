package com.obwhatsapp.payments.ui;

import X.AnonymousClass01V;
import X.AnonymousClass5xP;
import X.C110105dW;
import X.C116125qr;
import X.C1210564a;
import X.C1222969a;
import X.C13690nt;
import X.C16440t3;
import X.C17110uY;
import X.C23071Aj;
import X.C28401Vy;
import X.C30531cW;
import X.C53302fU;
import X.C53322fW;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class PaymentIncentiveViewFragment extends Hilt_PaymentIncentiveViewFragment {
    public C23071Aj A00;
    public AnonymousClass01V A01;
    public C16440t3 A02;
    public C116125qr A03;
    public C17110uY A04;
    public final C1222969a A05;
    public final C53322fW A06;

    public PaymentIncentiveViewFragment(C1222969a r1, C53322fW r2) {
        this.A06 = r2;
        this.A05 = r1;
    }

    public void A0k() {
        super.A0k();
        this.A03 = null;
    }

    public void A18(Bundle bundle, View view) {
        super.A18(bundle, view);
        C53322fW r2 = this.A06;
        C53302fU r4 = r2.A01;
        AnonymousClass5xP.A02(AnonymousClass5xP.A00(this.A02, (C28401Vy) null, r2, (String) null, true), this.A05, "incentive_details", "new_payment");
        if (r4 == null) {
            Log.e("PAY: PaymentIncentiveViewFragment/PaymentIncentiveOfferInfo is null or has null items in it");
            return;
        }
        this.A02.setText(r4.A0F);
        String str = r4.A0C;
        if (!TextUtils.isEmpty(str)) {
            C17110uY r6 = this.A04;
            Object[] A1Z = C13690nt.A1Z();
            A1Z[0] = r4.A0B;
            String[] strArr = new String[1];
            C110105dW.A1E(this.A00, str, strArr, 0);
            Runnable[] runnableArr = {new C1210564a(this)};
            SpannableString A052 = r6.A05(C13690nt.A0c(this, "learn-more", A1Z, 1, R.string.str0b5d), runnableArr, new String[]{"learn-more"}, strArr);
            C30531cW.A03(this.A00, this.A01);
            C30531cW.A02(this.A00);
            this.A00.setText(A052);
            return;
        }
        this.A00.setText(r4.A0B);
    }
}

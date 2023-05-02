package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass174;
import X.AnonymousClass1KO;
import X.AnonymousClass1Vt;
import X.AnonymousClass5o4;
import X.C005402i;
import X.C110105dW;
import X.C113005lC;
import X.C116135qs;
import X.C1222969a;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C16000sG;
import X.C16150sX;
import X.C17130ua;
import X.C30671cl;
import X.C49132Rg;
import android.os.Bundle;
import android.widget.TextView;
import com.obwhatsapp.R;

public class BrazilPaymentCareTransactionSelectorActivity extends PaymentTransactionHistoryActivity {
    public AnonymousClass1KO A00;
    public C17130ua A01;
    public C16000sG A02;
    public AnonymousClass174 A03;
    public C1222969a A04;
    public AnonymousClass5o4 A05;
    public boolean A06;

    public BrazilPaymentCareTransactionSelectorActivity() {
        this(0);
    }

    public BrazilPaymentCareTransactionSelectorActivity(int i2) {
        this.A06 = false;
        C110105dW.A0t(this, 20);
    }

    public void A1q() {
        if (!this.A06) {
            this.A06 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C113005lC.A02(r1, this);
            this.A02 = (C16000sG) r1.A4x.get();
            this.A03 = (AnonymousClass174) r1.AI3.get();
            this.A00 = (AnonymousClass1KO) r1.ALY.get();
            this.A01 = (C17130ua) r1.AN9.get();
            this.A04 = (C1222969a) r1.A2U.get();
        }
    }

    public final AnonymousClass5o4 A3A() {
        AnonymousClass5o4 r0 = this.A05;
        if (r0 != null && r0.A03() == 1) {
            this.A05.A06(false);
        }
        Bundle A0D = C13690nt.A0D();
        A0D.putString("com.obwhatsapp.support.DescribeProblemActivity.from", "payments:settings");
        C17130ua r5 = this.A01;
        AnonymousClass5o4 r02 = new AnonymousClass5o4(A0D, this, this.A00, this.A06, r5, this.A05, (C30671cl) null, (AnonymousClass1Vt) null, this.A0D, this.A03, "payments:settings");
        this.A05 = r02;
        return r02;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0B(R.string.str03b7);
        this.A0G.A00 = new C116135qs(this);
        TextView textView = (TextView) AnonymousClass00T.A05(this, R.id.bottom_button);
        textView.setVisibility(0);
        textView.setText(R.string.str03b6);
        C110105dW.A0r(textView, this, 15);
    }
}

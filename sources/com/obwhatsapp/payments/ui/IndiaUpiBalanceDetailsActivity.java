package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass1Vo;
import X.AnonymousClass5ko;
import X.C005402i;
import X.C110105dW;
import X.C111345g2;
import X.C111805hR;
import X.C119405xi;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C30671cl;
import X.C49132Rg;
import android.os.Bundle;
import android.widget.TextView;
import com.obwhatsapp.R;

public class IndiaUpiBalanceDetailsActivity extends AnonymousClass5ko {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public boolean A03;
    public final AnonymousClass1Vo A04;

    public IndiaUpiBalanceDetailsActivity() {
        this(0);
        this.A04 = C110105dW.A0P("IndiaUpiBalanceDetailsActivity");
    }

    public IndiaUpiBalanceDetailsActivity(int i2) {
        this.A03 = false;
        C110105dW.A0t(this, 36);
    }

    public void A1q() {
        if (!this.A03) {
            this.A03 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C110105dW.A0m(this);
        setContentView((int) R.layout.layout0305);
        if (getIntent() == null || C13690nt.A0E(this) == null || C13690nt.A0E(this).get("payment_bank_account") == null || C13690nt.A0E(this).get("balance") == null) {
            this.A04.A04("got null bank account or balance; finishing");
            finish();
            return;
        }
        C005402i x2 = x();
        if (x2 != null) {
            C110105dW.A0u(x2, R.string.str004c);
        }
        this.A04.A06("onCreate");
        this.A02 = C13680ns.A0N(this, R.id.balance_text);
        this.A00 = C13680ns.A0N(this, R.id.account_name_text);
        this.A01 = C13680ns.A0N(this, R.id.account_type_text);
        C30671cl r4 = (C30671cl) C13690nt.A0E(this).get("payment_bank_account");
        String A06 = C119405xi.A06(r4);
        TextView textView = this.A00;
        StringBuilder A0q = AnonymousClass000.A0q(r4.A0B);
        A0q.append(" ");
        A0q.append("•");
        A0q.append("•");
        textView.setText(AnonymousClass000.A0h(A06, A0q));
        C111805hR r2 = (C111805hR) r4.A08;
        this.A01.setText(r2 == null ? R.string.str044b : r2.A0C());
        this.A02.setText(getIntent().getStringExtra("balance"));
        if (r2 != null) {
            String str = r2.A0B;
            if ("OD_UNSECURED".equals(str) || "OD_SECURED".equals(str)) {
                C13680ns.A0N(this, R.id.balance).setText(R.string.str004d);
                findViewById(R.id.available_balance_layout).setVisibility(0);
                C13680ns.A1I(this, R.id.divider_above_available_balance, 0);
                C13680ns.A0N(this, R.id.available_balance_text).setText(getIntent().getStringExtra("usable_balance"));
            }
        }
    }
}

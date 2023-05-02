package com.obwhatsapp.payments.ui;

import X.AnonymousClass5ko;
import X.C005402i;
import X.C110105dW;
import X.C111345g2;
import X.C111805hR;
import X.C119405xi;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C30671cl;
import X.C39901tF;
import X.C49132Rg;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class IndiaUpiPinSetUpCompletedActivity extends AnonymousClass5ko {
    public boolean A00;

    public IndiaUpiPinSetUpCompletedActivity() {
        this(0);
    }

    public IndiaUpiPinSetUpCompletedActivity(int i2) {
        this.A00 = false;
        C110105dW.A0t(this, 70);
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
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A0E.AKS(C13680ns.A0Y(), C13680ns.A0a(), "pin_created", (String) null);
    }

    public void onCreate(Bundle bundle) {
        C39901tF r4;
        getWindow().addFlags(8192);
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0343);
        C30671cl r5 = (C30671cl) getIntent().getParcelableExtra("extra_bank_account");
        C005402i A0r = C111345g2.A0r(this);
        if (A0r != null) {
            C110105dW.A0u(A0r, R.string.str0fdf);
        }
        if (r5 == null || (r4 = r5.A08) == null) {
            Log.e("Screen called without valid account, finishing");
            finish();
            return;
        }
        C111805hR r42 = (C111805hR) r4;
        View A0p = C111345g2.A0p(this);
        C111345g2.A1h(A0p, r5);
        C13680ns.A0L(A0p, R.id.account_number).setText(C119405xi.A05(this, r5, this.A0P, false));
        C13680ns.A0L(A0p, R.id.account_name).setText((CharSequence) C110105dW.A0d(r42.A03));
        C13680ns.A0L(A0p, R.id.account_type).setText(r42.A0C());
        if (getIntent().getBooleanExtra("on_settings_page", false)) {
            C13680ns.A0N(this, R.id.continue_button).setText(R.string.str072c);
        }
        C110105dW.A0r(findViewById(R.id.continue_button), this, 72);
        this.A0E.AKS(0, (Integer) null, "pin_created", (String) null);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.A0E.AKS(C13680ns.A0Y(), C13680ns.A0a(), "pin_created", (String) null);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

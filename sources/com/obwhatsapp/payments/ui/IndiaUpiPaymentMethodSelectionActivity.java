package com.obwhatsapp.payments.ui;

import X.AnonymousClass01D;
import X.AnonymousClass1Vo;
import X.AnonymousClass5ko;
import X.C005402i;
import X.C110105dW;
import X.C110115dX;
import X.C110335du;
import X.C111345g2;
import X.C119405xi;
import X.C1223669h;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C17270uo;
import X.C30671cl;
import X.C32241fu;
import X.C49132Rg;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.AbsListView;
import com.facebook.redex.IDxCListenerShape196S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.List;

public class IndiaUpiPaymentMethodSelectionActivity extends AnonymousClass5ko implements C1223669h {
    public C110335du A00;
    public AnonymousClass01D A01;
    public boolean A02;
    public final AnonymousClass1Vo A03;

    public IndiaUpiPaymentMethodSelectionActivity() {
        this(0);
        this.A03 = C110105dW.A0P("IndiaUpiPaymentMethodSelectionActivity");
    }

    public IndiaUpiPaymentMethodSelectionActivity(int i2) {
        this.A02 = false;
        C110105dW.A0t(this, 60);
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            this.A01 = C17270uo.A00(r1.AI5);
        }
    }

    public int ADe(C30671cl r2) {
        return 0;
    }

    public String ADf(C30671cl r2) {
        return null;
    }

    public String ADh(C30671cl r2) {
        return null;
    }

    public String ADi(C30671cl r3) {
        return C119405xi.A05(this, r3, this.A0P, false);
    }

    public /* synthetic */ boolean AfB(C30671cl r2) {
        return false;
    }

    public boolean AfI() {
        return false;
    }

    public boolean AfL() {
        return false;
    }

    public void AfY(C30671cl r1, PaymentMethodRow paymentMethodRow) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout034a);
        if (getIntent() == null) {
            this.A03.A04("got null bank account or balance; finishing");
            finish();
            return;
        }
        C005402i x2 = x();
        if (x2 != null) {
            C110115dX.A0u(x2, "Select bank account");
        }
        this.A03.A06("onCreate");
        AbsListView absListView = (AbsListView) findViewById(R.id.payment_methods_list);
        C110335du r0 = new C110335du(this, this.A01, this.A0P, this);
        this.A00 = r0;
        r0.A02 = (List) getIntent().getSerializableExtra("bank_accounts");
        r0.notifyDataSetChanged();
        absListView.setAdapter(this.A00);
        absListView.setOnItemClickListener(new IDxCListenerShape196S0100000_3_I1(this, 1));
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 != 29) {
            return super.onCreateDialog(i2);
        }
        C32241fu A002 = C32241fu.A00(this);
        A002.A02(R.string.str18c1);
        A002.A01(R.string.str18c0);
        C110105dW.A0w(A002, this, 43, R.string.str1cf6);
        C110105dW.A0v(A002, this, 42, R.string.str0e87);
        return A002.create();
    }
}

package com.obwhatsapp.payments.ui;

import X.AnonymousClass5u5;
import X.AnonymousClass5x9;
import X.C110105dW;
import X.C111865hX;
import X.C112895jy;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C32241fu;
import X.C49132Rg;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxSDetectorShape311S0100000_3_I1;
import com.obwhatsapp.R;

public final class IndiaUpiPaymentSettingsActivity extends C112895jy {
    public C111865hX A00;
    public PaymentBottomSheet A01;
    public AnonymousClass5x9 A02;
    public boolean A03;

    public IndiaUpiPaymentSettingsActivity() {
        this(0);
        this.A01 = new PaymentBottomSheet();
    }

    public IndiaUpiPaymentSettingsActivity(int i2) {
        this.A03 = false;
        C110105dW.A0t(this, 61);
    }

    public void A1q() {
        if (!this.A03) {
            this.A03 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            this.A00 = C16150sX.A10(r1);
            this.A02 = (AnonymousClass5x9) r1.A1y.get();
            this.A00 = (C111865hX) r1.AHU.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.A00.A03.A0C(698)) {
            this.A00.A0A();
        }
        C110105dW.A0m(this);
        if (getIntent().getBooleanExtra("extra_open_transaction_confirmation_fragment", false)) {
            PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
            this.A01 = paymentBottomSheet;
            Bundle A0D = C13690nt.A0D();
            IndiaUpiPaymentTransactionConfirmationFragment indiaUpiPaymentTransactionConfirmationFragment = new IndiaUpiPaymentTransactionConfirmationFragment();
            indiaUpiPaymentTransactionConfirmationFragment.A0T(A0D);
            indiaUpiPaymentTransactionConfirmationFragment.A0T(C13690nt.A0E(this));
            indiaUpiPaymentTransactionConfirmationFragment.A0E = new AnonymousClass5u5(this, paymentBottomSheet);
            paymentBottomSheet.A01 = indiaUpiPaymentTransactionConfirmationFragment;
            Afb(paymentBottomSheet, "IndiaUpiPaymentTransactionConfirmationFragment");
        }
        this.A02.A02(new IDxSDetectorShape311S0100000_3_I1(this, 3));
    }

    public Dialog onCreateDialog(int i2) {
        C32241fu A002;
        PaymentSettingsFragment paymentSettingsFragment = this.A01;
        if (paymentSettingsFragment instanceof IndiaUpiPaymentSettingsFragment) {
            if (i2 == 100) {
                A002 = C32241fu.A00(paymentSettingsFragment.A0D());
                A002.A01(R.string.str10b3);
                A002.A07(false);
                C110105dW.A0w(A002, paymentSettingsFragment, 44, R.string.str0e87);
                A002.A02(R.string.str10af);
            } else if (i2 == 101) {
                A002 = C32241fu.A00(paymentSettingsFragment.A0D());
                A002.A01(R.string.str0ba6);
                A002.A07(true);
                C110105dW.A0w(A002, paymentSettingsFragment, 45, R.string.str0e87);
            }
            return A002.create();
        }
        return super.onCreateDialog(i2);
    }

    public void onResume() {
        super.onResume();
        if (this.A02.A03()) {
            AnonymousClass5x9.A01(this);
        }
    }
}

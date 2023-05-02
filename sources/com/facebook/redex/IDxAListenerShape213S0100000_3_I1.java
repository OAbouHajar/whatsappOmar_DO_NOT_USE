package com.facebook.redex;

import X.C110665ec;
import X.C13680ns;
import android.view.KeyEvent;
import android.widget.TextView;
import com.obwhatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.obwhatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;

public class IDxAListenerShape213S0100000_3_I1 implements TextView.OnEditorActionListener {
    public Object A00;
    public final int A01;

    public IDxAListenerShape213S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        int i3 = this.A01;
        Object obj = this.A00;
        if (i3 != 0) {
            IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = (IndiaUpiDisplaySecureQrCodeView) obj;
            if (i2 != 6) {
                return false;
            }
            C110665ec r2 = indiaUpiDisplaySecureQrCodeView.A0G;
            r2.A03.A0B(C13680ns.A0f(indiaUpiDisplaySecureQrCodeView.A0F));
            return true;
        }
        IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity = (IndiaUpiDebitCardVerificationActivity) obj;
        if (i2 != 6) {
            return false;
        }
        indiaUpiDebitCardVerificationActivity.A3m();
        return true;
    }
}

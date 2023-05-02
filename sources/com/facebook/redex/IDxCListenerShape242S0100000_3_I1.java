package com.facebook.redex;

import X.AnonymousClass2St;
import X.C110105dW;
import X.C110685ef;
import X.C111425gA;
import X.C1205762e;
import X.C1222969a;
import X.C13680ns;
import android.text.TextUtils;
import android.view.View;
import com.obwhatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;
import com.obwhatsapp.payments.ui.widget.PaymentAmountInputField;

public class IDxCListenerShape242S0100000_3_I1 implements View.OnFocusChangeListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape242S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onFocusChange(View view, boolean z2) {
        switch (this.A01) {
            case 0:
                C111425gA r0 = (C111425gA) this.A00;
                if (z2) {
                    C110685ef r1 = r0.A07;
                    C1222969a r2 = r1.A07;
                    Integer A0Y = C13680ns.A0Y();
                    String A06 = r1.A06();
                    AnonymousClass2St A0N = C110105dW.A0N();
                    A0N.A01("product_flow", "p2m");
                    r2.AKU(A0N, A0Y, 116, A06, (String) null);
                    return;
                }
                return;
            case 1:
                IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = (IndiaUpiDisplaySecureQrCodeView) this.A00;
                if (z2 && !TextUtils.isEmpty(indiaUpiDisplaySecureQrCodeView.A0F.getText())) {
                    PaymentAmountInputField paymentAmountInputField = indiaUpiDisplaySecureQrCodeView.A0F;
                    paymentAmountInputField.setSelection(paymentAmountInputField.getText().length());
                    return;
                }
                return;
            default:
                View.OnFocusChangeListener onFocusChangeListener = ((C1205762e) this.A00).A00;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view, z2);
                    return;
                }
                return;
        }
    }
}

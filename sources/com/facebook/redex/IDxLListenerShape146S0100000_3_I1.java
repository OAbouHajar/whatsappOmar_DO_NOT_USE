package com.facebook.redex;

import X.AnonymousClass2JI;
import X.C111325fm;
import X.C1205762e;
import android.view.View;
import android.view.ViewTreeObserver;
import com.obwhatsapp.payments.ui.widget.PaymentView;

public class IDxLListenerShape146S0100000_3_I1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public final int A01;

    public IDxLListenerShape146S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onGlobalLayout() {
        switch (this.A01) {
            case 0:
                AnonymousClass2JI r4 = (AnonymousClass2JI) this.A00;
                View view = (View) r4.A05;
                view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                if (!r4.isShowing()) {
                    r4.showAtLocation(view, 48, 0, 1000000);
                    return;
                }
                return;
            case 1:
                C111325fm r42 = (C111325fm) this.A00;
                View view2 = (View) r42.A05;
                view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (!r42.isShowing()) {
                    r42.showAtLocation(view2, 48, 0, 1000000);
                    C1205762e r2 = r42.A0I;
                    r2.A02.setVisibility(8);
                    View view3 = r2.A01;
                    if (view3 != null) {
                        view3.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                PaymentView paymentView = (PaymentView) this.A00;
                paymentView.A0t.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                paymentView.A0z.A01(1);
                return;
        }
    }
}

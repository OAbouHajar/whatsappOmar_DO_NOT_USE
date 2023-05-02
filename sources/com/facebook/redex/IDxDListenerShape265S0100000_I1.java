package com.facebook.redex;

import X.C05230Pu;
import X.C05500Rr;
import X.C12260k6;
import android.widget.PopupWindow;

public class IDxDListenerShape265S0100000_I1 implements PopupWindow.OnDismissListener {
    public Object A00;
    public final int A01;

    public IDxDListenerShape265S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onDismiss() {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            C05230Pu r1 = (C05230Pu) obj;
            C12260k6 r0 = r1.A00;
            if (r0 != null) {
                r0.APt(r1);
                return;
            }
            return;
        }
        ((C05500Rr) obj).A02();
    }
}

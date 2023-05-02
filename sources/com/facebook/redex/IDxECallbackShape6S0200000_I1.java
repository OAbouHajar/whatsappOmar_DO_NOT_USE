package com.facebook.redex;

import X.AnonymousClass0PK;
import X.C015707n;
import X.C02780Ex;
import android.graphics.Rect;

public class IDxECallbackShape6S0200000_I1 extends AnonymousClass0PK {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxECallbackShape6S0200000_I1(Rect rect, C02780Ex r2, int i2) {
        this.A02 = i2;
        this.A00 = r2;
        this.A01 = rect;
    }

    public Rect A00(C015707n r3) {
        int i2 = this.A02;
        Rect rect = (Rect) this.A01;
        if (i2 == 0 || !rect.isEmpty()) {
            return rect;
        }
        return null;
    }
}

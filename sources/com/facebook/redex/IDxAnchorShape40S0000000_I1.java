package com.facebook.redex;

import X.C12700kp;
import android.view.View;

public class IDxAnchorShape40S0000000_I1 implements C12700kp {
    public final int A00;

    public IDxAnchorShape40S0000000_I1(int i2) {
        this.A00 = i2;
    }

    public final int AF6(View view, int i2) {
        switch (this.A00) {
            case 0:
                return Math.min(view == null ? 0 : view.getMeasuredHeight(), (int) (((float) i2) * 0.75f));
            case 1:
                return 0;
            default:
                View view2 = view.getParent() instanceof View ? (View) view.getParent() : view;
                return Math.min(view.getMeasuredHeight(), i2 - ((int) (((float) Math.min(view2.getWidth(), view2.getHeight())) / 1.7777778f)));
        }
    }
}

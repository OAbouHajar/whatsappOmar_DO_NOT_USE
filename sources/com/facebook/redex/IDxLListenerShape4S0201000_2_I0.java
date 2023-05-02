package com.facebook.redex;

import X.C14870pt;
import X.C30511cT;
import android.view.ViewTreeObserver;

public class IDxLListenerShape4S0201000_2_I0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxLListenerShape4S0201000_2_I0(C30511cT r3, int i2) {
        this.A03 = i2;
        this.A02 = r3;
        this.A01 = new RunnableRunnableShape18S0100000_I1_1((Object) this, i2 != 0 ? 3 : 2);
    }

    public void onGlobalLayout() {
        int i2 = this.A03;
        C30511cT r2 = (C30511cT) this.A02;
        int width = (i2 != 0 ? r2.A02 : r2.A0C.A02).getWidth();
        if (width != 0 && width != this.A00) {
            this.A00 = width;
            C14870pt r1 = r2.A0M;
            Runnable runnable = (Runnable) this.A01;
            r1.A0J(runnable);
            r1.A0K(runnable);
        }
    }
}

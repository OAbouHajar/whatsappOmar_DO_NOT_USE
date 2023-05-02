package com.facebook.redex;

import X.AnonymousClass2Sv;
import X.C14550pN;
import X.C14750ph;
import android.content.Context;

public class IDxCListenerShape239S0100000_3_I1 implements AnonymousClass2Sv {
    public Object A00;
    public final int A01;

    public IDxCListenerShape239S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AOW() {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            Context context = (Context) obj;
            context.startActivity(C14750ph.A00(context));
            return;
        }
        C14550pN r2 = (C14550pN) obj;
        r2.A2X(C14750ph.A00(r2), true);
    }
}

package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass05J;
import X.AnonymousClass0NZ;
import X.AnonymousClass0Q0;
import X.AnonymousClass0WJ;
import X.C05070Pd;
import X.C09630fp;
import android.view.View;

public class IDxCListenerShape31S0200000_I1 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape31S0200000_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void onClick(View view) {
        if (this.A02 != 0) {
            AnonymousClass0Q0 r2 = (AnonymousClass0Q0) this.A00;
            r2.A02.post(new C09630fp(r2));
            C05070Pd r0 = (C05070Pd) ((AnonymousClass0NZ) this.A01).A00.A0C.peek();
            if (r0 != null) {
                AnonymousClass0WJ r02 = r0.A00.A00;
                if (r02 != null) {
                    r02.A00();
                    throw AnonymousClass000.A0Z();
                }
                throw AnonymousClass000.A0V("RequestData does not exist in BloksSurfaceController.");
            }
            return;
        }
        ((AnonymousClass05J) this.A01).A05();
    }
}

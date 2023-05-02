package com.facebook.redex;

import X.AnonymousClass03Y;
import X.AnonymousClass1YG;
import X.AnonymousClass39Z;
import X.C16740tZ;
import X.C30031bd;
import X.C436020t;
import android.graphics.drawable.Drawable;

public class IDxACallbackShape8S0200000_2_I1 extends AnonymousClass03Y {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxACallbackShape8S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void A01(Drawable drawable) {
        AnonymousClass1YG r1;
        if (this.A02 != 0) {
            r1 = ((AnonymousClass39Z) this.A00).A0C.A0b;
            if (r1 == null || !(drawable instanceof C436020t)) {
                return;
            }
        } else if (!(drawable instanceof C436020t) || (r1 = ((C30031bd) this.A00).A0b) == null) {
            return;
        }
        r1.Ahb((C16740tZ) this.A01);
    }
}

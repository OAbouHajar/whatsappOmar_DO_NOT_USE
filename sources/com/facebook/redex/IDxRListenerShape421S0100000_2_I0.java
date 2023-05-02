package com.facebook.redex;

import X.C37661pW;
import X.C37681pY;
import X.C447125f;

public class IDxRListenerShape421S0100000_2_I0 implements C37681pY {
    public Object A00;
    public final int A01;

    public IDxRListenerShape421S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AQO(Object obj, Object obj2, Object obj3, boolean z2) {
        if (this.A01 != 0) {
            ((C37661pW) this.A00).A01().execute(new RunnableRunnableShape9S0100000_I0_8(obj2, 18));
            return;
        }
        C447125f r6 = (C447125f) obj3;
        ((C37681pY) this.A00).AQO(obj, ((C447125f) obj2).A01, r6 == null ? null : r6.A01, z2);
    }
}

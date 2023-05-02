package com.facebook.redex;

import X.AnonymousClass2W7;
import X.AnonymousClass3K2;
import X.AnonymousClass5RY;
import X.C005602k;
import X.C108565Om;
import X.C32191fn;
import com.obwhatsapp.biz.cart.view.fragment.CartFragment;

public class IDxRListenerShape40S0300000_2_I1 implements C108565Om {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxRListenerShape40S0300000_2_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final void ASc(long j2) {
        if (this.A03 != 0) {
            C005602k r4 = (C005602k) this.A00;
            C32191fn r3 = (C32191fn) this.A01;
            AnonymousClass5RY r2 = (AnonymousClass5RY) this.A02;
            int i2 = r4.A06;
            if (i2 == -1) {
                i2 = r4.A05;
            }
            r2.ASd(r3.AFE(i2), j2);
            return;
        }
        CartFragment cartFragment = (CartFragment) this.A02;
        ((AnonymousClass2W7) this.A01).ABo(((C005602k) this.A00).A00());
        AnonymousClass3K2.A11(cartFragment.A06(), cartFragment.A0g, j2);
    }
}

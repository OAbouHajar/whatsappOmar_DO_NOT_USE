package com.obwhatsapp.group;

import X.AnonymousClass1DI;
import X.AnonymousClass2O9;
import X.AnonymousClass2VT;
import X.C16050sL;
import X.C18450wi;
import X.C30361cE;
import X.C53272fR;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;

public class IDxCObserverShape80S0100000_2_I0 extends C53272fR {
    public Object A00;
    public final int A01;

    public IDxCObserverShape80S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(C30361cE r4, C16050sL r5) {
        if (2 - this.A01 != 0) {
            super.A00(r4, r5);
            return;
        }
        C18450wi.A0H(r5, 0);
        ((AnonymousClass1DI) this.A00).A00(r5, r4.A04.size(), 3);
    }

    public void A01(C16050sL r5) {
        switch (this.A01) {
            case 0:
                AnonymousClass2VT r1 = (AnonymousClass2VT) this.A00;
                if (r5.equals(r1.A01)) {
                    r1.A06();
                    return;
                }
                return;
            case 1:
                AnonymousClass2O9 r3 = (AnonymousClass2O9) this.A00;
                if (r5 == r3.A0C) {
                    r3.A0L.Acl(new RunnableRunnableShape9S0100000_I0_8(r3, 25));
                    return;
                }
                return;
            default:
                super.A01(r5);
                return;
        }
    }
}

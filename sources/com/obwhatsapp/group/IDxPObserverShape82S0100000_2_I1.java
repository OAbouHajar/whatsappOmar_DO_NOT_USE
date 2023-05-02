package com.obwhatsapp.group;

import X.AnonymousClass1DI;
import X.AnonymousClass1V8;
import X.AnonymousClass1VD;
import X.C13700nu;
import X.C16050sL;
import X.C16060sN;
import X.C18450wi;
import X.C30361cE;
import com.obwhatsapp.biz.BusinessProfileExtraFieldsActivity;
import java.util.Set;

public class IDxPObserverShape82S0100000_2_I1 extends AnonymousClass1VD {
    public Object A00;
    public final int A01;

    public IDxPObserverShape82S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(C30361cE r4, C16060sN r5) {
        if (2 - this.A01 != 0) {
            super.A00(r4, r5);
            return;
        }
        C18450wi.A0H(r5, 0);
        AnonymousClass1DI r2 = (AnonymousClass1DI) this.A00;
        C13700nu.A0X(r2.A0B, r2, r5, r4, 34);
    }

    public void A01(C16050sL r2) {
        if (1 - this.A01 != 0) {
            super.A01(r2);
        } else {
            ((AnonymousClass1V8) this.A00).A3J();
        }
    }

    public void A03(C16050sL r2) {
        if (1 - this.A01 != 0) {
            super.A03(r2);
        } else {
            ((AnonymousClass1V8) this.A00).A3J();
        }
    }

    public void A05(Set set) {
        switch (this.A01) {
            case 0:
                ((BusinessProfileExtraFieldsActivity) this.A00).A35();
                return;
            case 1:
                ((AnonymousClass1V8) this.A00).A3J();
                return;
            default:
                super.A05(set);
                return;
        }
    }
}

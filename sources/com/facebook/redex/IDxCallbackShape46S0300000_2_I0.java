package com.facebook.redex;

import X.AnonymousClass4KU;
import X.AnonymousClass5PR;
import X.C16740tZ;
import X.C55672k9;
import java.util.List;

public class IDxCallbackShape46S0300000_2_I0 implements AnonymousClass5PR {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCallbackShape46S0300000_2_I0(C16740tZ r1, C55672k9 r2, List list, int i2) {
        this.A03 = i2;
        this.A00 = r2;
        this.A01 = r1;
        this.A02 = list;
    }

    public final void AOt(Object obj) {
        if (this.A03 != 0) {
            C55672k9 r2 = (C55672k9) this.A00;
            r2.A05 = (CharSequence) obj;
            r2.A06((C16740tZ) this.A01, (List) this.A02);
            return;
        }
        AnonymousClass4KU r6 = (AnonymousClass4KU) obj;
        ((C55672k9) this.A00).A04(r6.A00, r6.A01, (C16740tZ) this.A01, (List) this.A02);
    }
}

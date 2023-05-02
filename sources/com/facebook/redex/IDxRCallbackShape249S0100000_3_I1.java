package com.facebook.redex;

import X.AnonymousClass5Q8;
import X.AnonymousClass62B;
import X.C112885jv;
import X.C14550pN;

public class IDxRCallbackShape249S0100000_3_I1 implements AnonymousClass5Q8 {
    public Object A00;
    public final int A01;

    public IDxRCallbackShape249S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void ARP(String str) {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
            case 1:
                ((C14550pN) obj).Ac1();
                return;
            case 2:
                ((C112885jv) obj).A04.A05();
                return;
            case 3:
                ((AnonymousClass62B) obj).A00.A05.A05();
                return;
            default:
                ((C14550pN) obj).A05.A05();
                return;
        }
    }
}

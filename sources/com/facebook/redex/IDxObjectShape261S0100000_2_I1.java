package com.facebook.redex;

import X.AnonymousClass1DT;
import X.AnonymousClass1DU;
import X.AnonymousClass22M;
import X.AnonymousClass2AF;
import X.AnonymousClass3FI;
import X.AnonymousClass4N7;
import X.C29111a3;
import X.C73483oC;

public class IDxObjectShape261S0100000_2_I1 implements AnonymousClass1DT, AnonymousClass1DU {
    public Object A00;
    public final int A01;

    public IDxObjectShape261S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final Object AIT() {
        AnonymousClass3FI r2;
        AnonymousClass4N7 r1;
        int i2;
        switch (this.A01) {
            case 0:
                ((C29111a3) this.A00).ATn();
                break;
            case 1:
                r2 = (AnonymousClass3FI) this.A00;
                r1 = r2.A07;
                i2 = 10;
                break;
            case 2:
                r2 = (AnonymousClass3FI) this.A00;
                r2.A03.A01(74);
                r1 = r2.A07;
                i2 = 12;
                break;
            case 3:
                ((AnonymousClass2AF) this.A00).A0J.A09(C73483oC.A00);
                return null;
            default:
                ((AnonymousClass2AF) this.A00).A0J.A0B(C73483oC.A00);
                return null;
        }
        r1.A01 = i2;
        r2.A02();
        return AnonymousClass22M.A00;
    }
}

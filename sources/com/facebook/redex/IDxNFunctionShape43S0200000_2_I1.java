package com.facebook.redex;

import X.AnonymousClass4UO;
import X.AnonymousClass4UQ;
import X.AnonymousClass4UT;
import X.AnonymousClass4UU;
import X.C16300so;
import X.C28371Vv;
import X.C32261fw;
import X.C86764Ub;
import X.C86774Uc;
import X.C87004Uz;

public class IDxNFunctionShape43S0200000_2_I1 implements C32261fw {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxNFunctionShape43S0200000_2_I1(C16300so r1, C28371Vv r2, int i2) {
        this.A02 = i2;
        this.A00 = r2;
        this.A01 = r1;
    }

    public final Object A52(C28371Vv r4) {
        int i2 = this.A02;
        C28371Vv r2 = (C28371Vv) this.A00;
        C16300so r1 = (C16300so) this.A01;
        switch (i2) {
            case 0:
            case 3:
            case 15:
            case 17:
                return new C86774Uc(r1, r4, r2);
            case 2:
            case 5:
                return new AnonymousClass4UO(r1, r4, r2);
            case 6:
            case 7:
            case 9:
            case 11:
                return new AnonymousClass4UT(r1, r4, r2);
            case 8:
            case 10:
                return new AnonymousClass4UU(r1, r4, r2);
            case 12:
                return new AnonymousClass4UQ(r1, r4, r2);
            case 16:
                return new C87004Uz(r1, r4, r2);
            default:
                return new C86764Ub(r1, r4, r2);
        }
    }
}

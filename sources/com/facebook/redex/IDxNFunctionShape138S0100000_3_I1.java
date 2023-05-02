package com.facebook.redex;

import X.C119135wb;
import X.C119145wc;
import X.C16300so;
import X.C28371Vv;
import X.C32261fw;
import X.C86774Uc;

public class IDxNFunctionShape138S0100000_3_I1 implements C32261fw {
    public Object A00;
    public final int A01;

    public IDxNFunctionShape138S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final Object A52(C28371Vv r4) {
        switch (this.A01) {
            case 0:
                return new C119135wb(r4);
            case 1:
                return new C119145wc(r4);
            default:
                return new C86774Uc((C16300so) null, r4, (C28371Vv) this.A00);
        }
    }
}

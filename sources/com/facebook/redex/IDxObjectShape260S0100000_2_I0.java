package com.facebook.redex;

import X.AnonymousClass1DT;
import X.AnonymousClass1DU;
import X.AnonymousClass22M;
import X.C46202Cw;
import com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;

public class IDxObjectShape260S0100000_2_I0 implements AnonymousClass1DT, AnonymousClass1DU {
    public Object A00;
    public final int A01;

    public IDxObjectShape260S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final Object AIT() {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            return C46202Cw.A00((C46202Cw) obj);
        }
        ((BusinessDirectoryContextualSearchViewModel) obj).AOG();
        return AnonymousClass22M.A00;
    }
}

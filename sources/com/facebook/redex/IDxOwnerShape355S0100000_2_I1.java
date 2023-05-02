package com.facebook.redex;

import X.C108235Ne;
import X.C65313Ug;
import X.C96364oD;
import X.C97524q8;

public class IDxOwnerShape355S0100000_2_I1 implements C108235Ne {
    public Object A00;
    public final int A01;

    public IDxOwnerShape355S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void Abk(C65313Ug r3) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (2 - i2 != 0) {
            ((C96364oD) obj).A06(r3);
            return;
        }
        r3.clear();
        ((C97524q8) obj).A04.add(r3);
    }
}

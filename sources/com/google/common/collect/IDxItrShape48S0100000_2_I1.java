package com.google.common.collect;

import X.C1048257b;
import X.C67733cI;
import X.C87494Wz;

public class IDxItrShape48S0100000_2_I1 extends C1048257b {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxItrShape48S0100000_2_I1(C67733cI r1, int i2) {
        super(r1);
        this.A01 = i2;
        this.A00 = r1;
    }

    public static Object result(IDxItrShape48S0100000_2_I1 iDxItrShape48S0100000_2_I1, int i2) {
        return ((C67733cI) iDxItrShape48S0100000_2_I1.A00).backingMap.getKey(i2);
    }

    public C87494Wz result(int i2) {
        return ((C67733cI) this.A00).backingMap.getEntry(i2);
    }

    /* renamed from: result  reason: collision with other method in class */
    public Object m13result(int i2) {
        return this.A01 != 0 ? result(i2) : result(this, i2);
    }
}

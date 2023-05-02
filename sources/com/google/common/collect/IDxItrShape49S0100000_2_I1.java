package com.google.common.collect;

import X.C1048557e;
import X.C105935Bu;
import X.C67703cF;
import java.util.Map;

public class IDxItrShape49S0100000_2_I1 extends C1048557e {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxItrShape49S0100000_2_I1(C105935Bu r2, int i2) {
        super(r2, (IDxItrShape49S0100000_2_I1) null);
        this.A01 = i2;
        this.A00 = r2;
    }

    public static Object getOutput(IDxItrShape49S0100000_2_I1 iDxItrShape49S0100000_2_I1, int i2) {
        return ((C105935Bu) iDxItrShape49S0100000_2_I1.A00).key(i2);
    }

    public static Object getOutput$CompactHashMap$3(IDxItrShape49S0100000_2_I1 iDxItrShape49S0100000_2_I1, int i2) {
        return ((C105935Bu) iDxItrShape49S0100000_2_I1.A00).value(i2);
    }

    public Object getOutput(int i2) {
        switch (this.A01) {
            case 0:
                return getOutput(this, i2);
            case 1:
                return getOutput(i2);
            default:
                return getOutput$CompactHashMap$3(this, i2);
        }
    }

    /* renamed from: getOutput  reason: collision with other method in class */
    public Map.Entry m14getOutput(int i2) {
        return new C67703cF((C105935Bu) this.A00, i2);
    }
}

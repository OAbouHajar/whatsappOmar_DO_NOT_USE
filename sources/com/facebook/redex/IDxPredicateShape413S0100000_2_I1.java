package com.facebook.redex;

import X.AnonymousClass03O;
import X.AnonymousClass1KM;
import java.util.Set;

public class IDxPredicateShape413S0100000_2_I1 implements AnonymousClass03O {
    public Object A00;
    public final int A01;

    public IDxPredicateShape413S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean test(Object obj) {
        int i2 = this.A01;
        Object obj2 = this.A00;
        return i2 != 0 ? ((Set) obj2).contains(obj) : !((AnonymousClass1KM) obj2).A04.A0Z.get();
    }
}

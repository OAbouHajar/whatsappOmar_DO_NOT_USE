package com.facebook.redex;

import X.C30671cl;
import X.C39891tE;
import java.util.Comparator;

public class IDxComparatorShape185S0100000_3_I1 implements Comparator {
    public Object A00;
    public final int A01;

    public IDxComparatorShape185S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final int compare(Object obj, Object obj2) {
        C30671cl r11 = (C30671cl) obj2;
        C39891tE r0 = (C39891tE) ((C30671cl) obj).A08;
        long j2 = Long.MAX_VALUE;
        if (r0 != null) {
            long j3 = r0.A06;
            if (j3 >= 0) {
                j2 = j3;
            }
        }
        C39891tE r02 = (C39891tE) r11.A08;
        long j4 = Long.MAX_VALUE;
        if (r02 != null) {
            long j5 = r02.A06;
            if (j5 >= 0) {
                j4 = j5;
            }
        }
        return (j2 > j4 ? 1 : (j2 == j4 ? 0 : -1));
    }
}

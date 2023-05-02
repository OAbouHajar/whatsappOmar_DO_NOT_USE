package com.facebook.redex;

import X.AnonymousClass020;
import X.AnonymousClass0IS;
import X.AnonymousClass3K2;
import X.C32451gN;
import java.util.Comparator;

public class IDxComparatorShape0S0000020_2_I0 implements Comparator {
    public double A00;
    public double A01;
    public final int A02;

    public IDxComparatorShape0S0000020_2_I0(double d2, double d3, int i2) {
        this.A02 = i2;
        this.A00 = d2;
        this.A01 = d3;
    }

    public final int compare(Object obj, Object obj2) {
        if (this.A02 != 0) {
            double d2 = this.A00;
            double d3 = this.A01;
            return Double.compare(AnonymousClass3K2.A00((C32451gN) obj, d2, d3), AnonymousClass3K2.A00((C32451gN) obj2, d2, d3));
        }
        double d4 = this.A00;
        double d5 = this.A01;
        AnonymousClass020 r6 = ((AnonymousClass0IS) obj).A0J;
        double d6 = r6.A00 - d4;
        double d7 = r6.A01 - d5;
        double d8 = (d6 * d6) + (d7 * d7);
        AnonymousClass020 r8 = ((AnonymousClass0IS) obj2).A0J;
        double d9 = r8.A00 - d4;
        double d10 = r8.A01 - d5;
        return Double.compare(d8, (d9 * d9) + (d10 * d10));
    }
}

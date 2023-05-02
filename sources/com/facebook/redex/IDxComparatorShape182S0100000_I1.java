package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass01Q;
import X.AnonymousClass0SA;
import java.util.Comparator;

public class IDxComparatorShape182S0100000_I1 implements Comparator {
    public Object A00;
    public final int A01;

    public IDxComparatorShape182S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        if (this.A01 == 0) {
            return ((AnonymousClass0SA) obj).A02 - ((AnonymousClass0SA) obj2).A02;
        }
        float A04 = AnonymousClass000.A04(((AnonymousClass01Q) obj).A01);
        float A042 = AnonymousClass000.A04(((AnonymousClass01Q) obj2).A01);
        if (A042 > A04) {
            return 1;
        }
        return A04 <= A042 ? 0 : -1;
    }
}

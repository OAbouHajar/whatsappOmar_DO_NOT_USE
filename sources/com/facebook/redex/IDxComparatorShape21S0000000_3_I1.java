package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass1Vt;
import X.C39911tG;
import java.util.Comparator;

public class IDxComparatorShape21S0000000_3_I1 implements Comparator {
    public final int A00;

    public IDxComparatorShape21S0000000_3_I1(int i2) {
        this.A00 = i2;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                String A0A = ((C39911tG) obj).A0A();
                AnonymousClass00B.A06(A0A);
                String A0A2 = ((C39911tG) obj2).A0A();
                AnonymousClass00B.A06(A0A2);
                return A0A.compareTo(A0A2);
            case 1:
                return (((AnonymousClass1Vt) obj2).A06 > ((AnonymousClass1Vt) obj).A06 ? 1 : (((AnonymousClass1Vt) obj2).A06 == ((AnonymousClass1Vt) obj).A06 ? 0 : -1));
            default:
                return (int) (((AnonymousClass1Vt) obj2).A05 - ((AnonymousClass1Vt) obj).A05);
        }
    }
}

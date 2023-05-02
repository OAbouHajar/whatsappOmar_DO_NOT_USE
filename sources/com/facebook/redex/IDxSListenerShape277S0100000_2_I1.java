package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass027;
import X.AnonymousClass1MG;
import X.AnonymousClass33c;
import X.AnonymousClass39R;
import X.AnonymousClass5QT;
import X.C26161Mo;
import X.C34151jm;
import java.util.List;

public class IDxSListenerShape277S0100000_2_I1 implements AnonymousClass5QT {
    public Object A00;
    public final int A01;

    public IDxSListenerShape277S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AXt(C34151jm r5, Integer num, int i2) {
        if (this.A01 != 0) {
            AnonymousClass5QT r0 = ((AnonymousClass33c) this.A00).A06;
            if (r0 != null) {
                r0.AXt(r5, num, i2);
                return;
            }
            return;
        }
        AnonymousClass39R r1 = (AnonymousClass39R) this.A00;
        AnonymousClass5QT r02 = r1.A04;
        if (r02 != null) {
            r02.AXt(r5, num, i2);
            if (r1.A01()) {
                AnonymousClass1MG r3 = r1.A0G;
                AnonymousClass00B.A06(r3);
                r3.A00();
                C26161Mo r03 = r1.A0F;
                AnonymousClass00B.A06(r03);
                AnonymousClass027 r2 = r03.A03;
                AnonymousClass00B.A06(r2.A01());
                r3.A01(num.intValue(), i2, ((List) r2.A01()).size());
            }
        }
    }
}

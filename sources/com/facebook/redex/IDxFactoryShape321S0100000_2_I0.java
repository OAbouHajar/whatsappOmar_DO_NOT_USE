package com.facebook.redex;

import X.AnonymousClass01J;
import X.AnonymousClass13Y;
import X.AnonymousClass14M;
import X.AnonymousClass2FC;
import X.AnonymousClass5QB;
import X.C102394ys;
import X.C17260un;

public class IDxFactoryShape321S0100000_2_I0 implements AnonymousClass13Y {
    public Object A00;
    public final int A01;

    public IDxFactoryShape321S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public C102394ys A71(AnonymousClass5QB r3) {
        AnonymousClass01J r0;
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                r0 = ((C17260un) obj).A01.A8o;
                break;
            case 1:
                r0 = ((C17260un) obj).A01.A9u;
                break;
            case 2:
                r0 = ((AnonymousClass2FC) obj).A03.A0t;
                break;
            default:
                r0 = ((AnonymousClass2FC) obj).A03.A0z;
                break;
        }
        return new C102394ys((AnonymousClass14M) r0.get(), r3);
    }
}

package com.facebook.redex;

import X.AnonymousClass2FC;
import X.AnonymousClass4HI;
import X.AnonymousClass5P0;
import X.AnonymousClass5P1;
import X.C17180uf;
import X.C50142Yd;

public class IDxFactoryShape406S0100000_2_I0 implements AnonymousClass5P0 {
    public Object A00;
    public final int A01;

    public IDxFactoryShape406S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public AnonymousClass4HI A6v(AnonymousClass5P1 r3) {
        int i2 = this.A01;
        Object obj = this.A00;
        return new AnonymousClass4HI((C17180uf) (i2 != 0 ? ((AnonymousClass2FC) obj).A02 : ((C50142Yd) obj).A04).A2n.get(), r3);
    }
}

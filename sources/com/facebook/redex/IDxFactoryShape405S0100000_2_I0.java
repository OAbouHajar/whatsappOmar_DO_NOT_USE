package com.facebook.redex;

import X.AnonymousClass013;
import X.AnonymousClass01J;
import X.AnonymousClass2FC;
import X.AnonymousClass5P0;
import X.AnonymousClass5P1;
import X.AnonymousClass5P2;
import X.C16150sX;
import X.C17180uf;
import X.C50142Yd;
import X.C616239q;

public class IDxFactoryShape405S0100000_2_I0 implements AnonymousClass5P2 {
    public Object A00;
    public final int A01;

    public IDxFactoryShape405S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public C616239q A6w(AnonymousClass5P1 r5) {
        C16150sX r1;
        AnonymousClass013 A0Z;
        AnonymousClass01J r0;
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            AnonymousClass2FC r02 = (AnonymousClass2FC) obj;
            r1 = r02.A02;
            A0Z = C16150sX.A0Z(r1);
            r0 = r02.A03.A0s;
        } else {
            C50142Yd r03 = (C50142Yd) obj;
            r1 = r03.A04;
            A0Z = C16150sX.A0Z(r1);
            r0 = r03.A03.A03;
        }
        return new C616239q((C17180uf) r1.A2n.get(), (AnonymousClass5P0) r0.get(), r5, A0Z);
    }
}

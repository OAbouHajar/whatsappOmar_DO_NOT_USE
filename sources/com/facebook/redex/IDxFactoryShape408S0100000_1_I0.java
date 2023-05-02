package com.facebook.redex;

import X.AnonymousClass2FC;
import X.AnonymousClass2FD;
import X.AnonymousClass2Z2;
import X.AnonymousClass3FH;
import X.AnonymousClass4DN;
import X.C108655Ov;
import X.C108665Ow;
import X.C108675Ox;
import X.C108685Oy;
import X.C108695Oz;
import X.C16150sX;
import X.C16980tz;
import X.C17180uf;
import X.C25601Kk;
import X.C29101a2;
import X.C29111a3;
import X.C49132Rg;
import X.C50142Yd;
import X.C616239q;
import X.C85894Qk;
import X.C88204a7;

public class IDxFactoryShape408S0100000_1_I0 implements C108655Ov {
    public Object A00;
    public final int A01;

    public IDxFactoryShape408S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public AnonymousClass3FH A78(C108665Ow r18, C108675Ox r19, C108685Oy r20, C108695Oz r21, C616239q r22, C29101a2 r23, C29111a3 r24, int i2) {
        C17180uf A0D;
        C88204a7 r10;
        AnonymousClass4DN r12;
        C25601Kk r5;
        C16980tz A0V;
        AnonymousClass2Z2 A07;
        if (this.A01 != 0) {
            AnonymousClass2FC r0 = (AnonymousClass2FC) this.A00;
            C16150sX r2 = r0.A02;
            A0D = C16150sX.A0D(r2);
            AnonymousClass2FD r3 = r0.A03;
            C16150sX r1 = r3.A1m;
            r10 = new C88204a7((C25601Kk) r1.A6w.get());
            r12 = new AnonymousClass4DN(C16150sX.A0Z(r1));
            r5 = (C25601Kk) r2.A6w.get();
            A0V = C16150sX.A0V(r1);
            A07 = r3.A01();
        } else {
            C50142Yd r32 = (C50142Yd) this.A00;
            C16150sX r25 = r32.A04;
            A0D = C16150sX.A0D(r25);
            C16150sX r13 = r32.A03.A0b;
            r10 = new C88204a7((C25601Kk) r13.A6w.get());
            r12 = new AnonymousClass4DN(C16150sX.A0Z(r13));
            r5 = (C25601Kk) r25.A6w.get();
            C49132Rg r14 = r32.A01;
            A0V = C16150sX.A0V(r14.A1s);
            A07 = r14.A07();
        }
        return new AnonymousClass3FH(A0D, r5, r18, r19, r20, r21, r10, new C85894Qk(A07, A0V), r12, r22, r23, r24, i2);
    }
}

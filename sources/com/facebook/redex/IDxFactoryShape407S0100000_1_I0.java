package com.facebook.redex;

import X.AnonymousClass01J;
import X.AnonymousClass2FC;
import X.AnonymousClass2FD;
import X.AnonymousClass399;
import X.AnonymousClass3F7;
import X.AnonymousClass5P3;
import X.C16150sX;
import X.C16260sj;
import X.C16320sq;
import X.C17210ui;
import X.C18110wA;
import X.C25511Kb;
import X.C25641Ko;
import X.C29121a4;
import X.C29131a5;
import X.C49132Rg;
import X.C50142Yd;
import X.C50592a6;

public class IDxFactoryShape407S0100000_1_I0 implements AnonymousClass5P3 {
    public Object A00;
    public final int A01;

    public IDxFactoryShape407S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public AnonymousClass3F7 A6x(C29131a5 r14, C29121a4 r15) {
        C16150sX r3;
        C16320sq A1B;
        C16260sj A0X;
        C17210ui A0E;
        C25641Ko r7;
        C18110wA r2;
        AnonymousClass01J r0;
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            AnonymousClass2FC r1 = (AnonymousClass2FC) obj;
            r3 = r1.A02;
            A1B = C16150sX.A1B(r3);
            A0X = C16150sX.A0X(r3);
            A0E = C16150sX.A0E(r3);
            r7 = (C25641Ko) r3.ALS.get();
            AnonymousClass2FD r12 = r1.A03;
            r2 = (C18110wA) r12.A1m.ABF.get();
            r0 = r12.A0q;
        } else {
            C50142Yd r13 = (C50142Yd) obj;
            r3 = r13.A04;
            A1B = C16150sX.A1B(r3);
            A0X = C16150sX.A0X(r3);
            A0E = C16150sX.A0E(r3);
            r7 = (C25641Ko) r3.ALS.get();
            C49132Rg r16 = r13.A01;
            r2 = (C18110wA) r16.A1s.ABF.get();
            r0 = r16.A0N;
        }
        return new AnonymousClass3F7(A0E, new AnonymousClass399((C50592a6) r0.get(), r2), (C25511Kb) r3.A2u.get(), r7, C16150sX.A0F(r3), r14, r15, A0X, A1B);
    }
}

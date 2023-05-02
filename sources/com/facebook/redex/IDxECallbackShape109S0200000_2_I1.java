package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass1KD;
import X.AnonymousClass28T;
import X.AnonymousClass2HW;
import X.AnonymousClass3K3;
import X.C102374yq;
import X.C102404yt;
import X.C108775Ph;
import X.C448025p;

public class IDxECallbackShape109S0200000_2_I1 implements AnonymousClass2HW {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxECallbackShape109S0200000_2_I1(C102404yt r1, C448025p r2, int i2) {
        this.A02 = i2;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void APY() {
        ((C448025p) this.A01).APZ(AnonymousClass3K3.A0e(this.A02 != 0 ? "network error while refreshing token" : "network error while creating user"));
    }

    public void AQa(Exception exc) {
        ((C448025p) this.A01).AQa(exc);
    }

    public void AY5(AnonymousClass28T r5) {
        AnonymousClass1KD A6z;
        C448025p r0;
        if (this.A02 != 0) {
            C108775Ph r1 = ((C102404yt) this.A00).A03;
            AnonymousClass00B.A06(r5);
            Object obj = r5.A02.A00;
            AnonymousClass00B.A06(obj);
            A6z = r1.A6z((String) obj);
            r0 = (C448025p) this.A01;
        } else {
            C102404yt r3 = (C102404yt) this.A00;
            C108775Ph r12 = r3.A03;
            Object obj2 = r5.A02.A00;
            AnonymousClass00B.A06(obj2);
            A6z = r12.A6z((String) obj2);
            r0 = new C102374yq(r5, r3, (C448025p) this.A01);
        }
        A6z.Aah(r0);
    }
}

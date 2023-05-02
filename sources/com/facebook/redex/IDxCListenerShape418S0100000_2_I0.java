package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass027;
import X.AnonymousClass26Y;
import X.AnonymousClass2RR;
import android.util.Pair;

public class IDxCListenerShape418S0100000_2_I0 implements AnonymousClass26Y {
    public Object A00;
    public final int A01;

    public IDxCListenerShape418S0100000_2_I0(AnonymousClass2RR r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public void AQT(Pair pair) {
        AnonymousClass027 r1;
        if (this.A01 != 0) {
            r1 = ((AnonymousClass2RR) this.A00).A06;
        } else {
            int A0D = AnonymousClass000.A0D(pair.first);
            AnonymousClass2RR r0 = (AnonymousClass2RR) this.A00;
            r1 = 405 == A0D ? r0.A03 : r0.A07;
        }
        if (r1 != null) {
            r1.A09(Boolean.TRUE);
        }
    }

    public /* bridge */ /* synthetic */ void AYB(Object obj) {
        ((AnonymousClass2RR) this.A00).A0L.Acl(new RunnableRunnableShape12S0200000_I1(this, this.A01 != 0 ? 42 : 41, obj));
    }
}

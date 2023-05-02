package com.facebook.redex;

import X.AnonymousClass3AT;
import X.AnonymousClass4TD;
import X.AnonymousClass4VC;
import X.C30271c3;
import X.C84084Je;
import X.C90804eq;
import X.C96224nz;

public class RunnableRunnableShape1S0101200_I1 implements Runnable {
    public int A00;
    public long A01;
    public long A02;
    public Object A03;
    public final int A04;

    public RunnableRunnableShape1S0101200_I1(Object obj, int i2, int i3, long j2, long j3) {
        this.A04 = i3;
        this.A03 = obj;
        this.A00 = i2;
        this.A01 = j2;
        this.A02 = j3;
    }

    public final void run() {
        int i2 = this.A04;
        Object obj = this.A03;
        if (i2 != 0) {
            C96224nz r3 = (C96224nz) ((C84084Je) obj).A02;
            AnonymousClass3AT r1 = r3.A06;
            AnonymousClass4VC A032 = r3.A03(r1.A03.isEmpty() ? null : (C30271c3) C90804eq.getLast(r1.A03));
            r3.A05(A032, new IDxEventShape165S0100000_2_I1(A032, 15), 1006);
            return;
        }
        ((AnonymousClass4TD) obj).A01.AMs(this.A00, this.A01, this.A02);
    }
}

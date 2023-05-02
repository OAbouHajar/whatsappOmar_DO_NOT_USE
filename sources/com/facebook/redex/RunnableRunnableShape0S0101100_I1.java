package com.facebook.redex;

import X.AnonymousClass4GS;

public class RunnableRunnableShape0S0101100_I1 implements Runnable {
    public int A00;
    public long A01;
    public Object A02;
    public final int A03;

    public RunnableRunnableShape0S0101100_I1(Object obj, int i2, int i3, long j2) {
        this.A03 = i3;
        this.A02 = obj;
        this.A00 = i2;
        this.A01 = j2;
    }

    public final void run() {
        int i2 = this.A03;
        AnonymousClass4GS r0 = (AnonymousClass4GS) this.A02;
        if (i2 != 0) {
            r0.A01.AZc(this.A01, this.A00);
            return;
        }
        r0.A01.AQC(this.A00, this.A01);
    }
}

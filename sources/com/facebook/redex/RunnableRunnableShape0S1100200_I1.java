package com.facebook.redex;

import X.AnonymousClass4GS;
import X.AnonymousClass4TD;

public class RunnableRunnableShape0S1100200_I1 implements Runnable {
    public long A00;
    public long A01;
    public Object A02;
    public String A03;
    public final int A04;

    public RunnableRunnableShape0S1100200_I1(Object obj, String str, int i2, long j2, long j3) {
        this.A04 = i2;
        this.A02 = obj;
        this.A03 = str;
        this.A00 = j2;
        this.A01 = j3;
    }

    public final void run() {
        int i2 = this.A04;
        Object obj = this.A02;
        if (i2 != 0) {
            ((AnonymousClass4GS) obj).A01.AZY(this.A03, this.A00, this.A01);
            return;
        }
        ((AnonymousClass4TD) obj).A01.AMk(this.A03, this.A00, this.A01);
    }
}

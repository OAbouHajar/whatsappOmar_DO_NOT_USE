package com.facebook.redex;

import X.C015707n;
import X.C12370kH;
import android.animation.Animator;

public class IDxCListenerShape96S0200000_I1 implements C12370kH {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape96S0200000_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void AO4() {
        int i2 = this.A02;
        Object obj = this.A01;
        if (i2 != 0) {
            ((C015707n) obj).A0D();
        } else {
            ((Animator) obj).end();
        }
    }
}

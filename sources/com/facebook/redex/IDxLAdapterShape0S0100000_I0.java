package com.facebook.redex;

import X.AnonymousClass03Y;
import X.C015707n;
import X.C016907z;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

public class IDxLAdapterShape0S0100000_I0 extends AnimatorListenerAdapter {
    public Object A00;
    public final int A01;

    public IDxLAdapterShape0S0100000_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A01 != 0) {
            C016907z r4 = (C016907z) this.A00;
            ArrayList arrayList = new ArrayList(r4.A05);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((AnonymousClass03Y) arrayList.get(i2)).A01(r4);
            }
            return;
        }
        ((C015707n) this.A00).A0E();
        animator.removeListener(this);
    }

    public void onAnimationStart(Animator animator) {
        if (1 - this.A01 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        ArrayList arrayList = new ArrayList(((C016907z) this.A00).A05);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2);
        }
    }
}

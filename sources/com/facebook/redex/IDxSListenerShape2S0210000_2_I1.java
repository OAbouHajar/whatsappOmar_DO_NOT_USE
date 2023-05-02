package com.facebook.redex;

import X.C108535Oj;
import X.C62723Er;
import android.graphics.Bitmap;

public class IDxSListenerShape2S0210000_2_I1 implements C108535Oj {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public IDxSListenerShape2S0210000_2_I1(Object obj, int i2, Object obj2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void ASw(Bitmap bitmap, C62723Er r4, boolean z2) {
        if (this.A02) {
            return;
        }
        if (r4.A04 == 3) {
            this.A02 = true;
            C62723Er r1 = (C62723Er) this.A01;
            r1.A08.ASw(bitmap, r1, z2);
            return;
        }
        ((C62723Er) this.A01).A08.ASw(bitmap, r4, z2);
    }
}

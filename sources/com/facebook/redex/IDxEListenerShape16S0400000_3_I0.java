package com.facebook.redex;

import X.AnonymousClass2Su;
import X.AnonymousClass65G;
import X.AnonymousClass65K;
import X.C117695tP;
import X.C14530pL;
import X.C29671b0;
import android.content.Intent;

public class IDxEListenerShape16S0400000_3_I0 implements AnonymousClass2Su {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxEListenerShape16S0400000_3_I0(C14530pL r1, C29671b0 r2, C117695tP r3, Object obj, int i2) {
        this.A04 = i2;
        this.A00 = r3;
        this.A02 = obj;
        this.A01 = r2;
        this.A03 = r1;
    }

    public boolean AM4(Intent intent, int i2, int i3) {
        int i4 = this.A04;
        C117695tP r1 = (C117695tP) this.A00;
        if (i4 != 0) {
            if (i2 != 1002) {
                return false;
            }
            r1.A00.Acq(new AnonymousClass65K((C29671b0) this.A01, this.A02));
            ((C14530pL) this.A03).A31(this);
            return true;
        } else if (i2 != 1001) {
            return false;
        } else {
            r1.A00.Acq(new AnonymousClass65G((C29671b0) this.A01, this.A02));
            ((C14530pL) this.A03).A31(this);
            return true;
        }
    }
}

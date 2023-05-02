package com.facebook.redex;

import X.AnonymousClass2Su;
import X.C108625Os;
import X.C114795oc;
import X.C14530pL;
import X.C85884Qj;
import android.content.Intent;

public class IDxEListenerShape47S0300000_3_I0 implements AnonymousClass2Su {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxEListenerShape47S0300000_3_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public boolean AM4(Intent intent, int i2, int i3) {
        int i4 = this.A03;
        C14530pL r0 = (C14530pL) this.A02;
        if (i4 != 0) {
            r0.A31(this);
            if (i2 != 1) {
                return false;
            }
            ((C85884Qj) this.A01).A00(i3 != -1 ? i3 != 0 ? C114795oc.ERROR : C114795oc.CANCELLED : C114795oc.OK);
            return true;
        }
        r0.A31(this);
        boolean z2 = false;
        if (i2 != 30) {
            return false;
        }
        C108625Os r1 = (C108625Os) this.A01;
        if (i3 == -1) {
            z2 = true;
        }
        r1.AWT(z2);
        return true;
    }
}

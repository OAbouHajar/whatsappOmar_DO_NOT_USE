package com.facebook.redex;

import X.C108535Oj;
import X.C16320sq;
import X.C26781Pd;
import X.C41681wN;
import X.C62723Er;
import android.graphics.Bitmap;

public class IDxSListenerShape103S0200000_2_I0 implements C108535Oj {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxSListenerShape103S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void ASw(Bitmap bitmap, C62723Er r7, boolean z2) {
        if (this.A02 != 0) {
            C41681wN r4 = (C41681wN) this.A00;
            Object obj = this.A01;
            if (r4.A01 != null) {
                C16320sq r2 = r4.A0U;
                r2.Aco(new RunnableRunnableShape5S0200000_I0_3(r4, 32, bitmap));
                r2.Acl(new RunnableRunnableShape5S0200000_I0_3(r4, 34, obj));
                return;
            }
            return;
        }
        C26781Pd r0 = (C26781Pd) this.A00;
        C108535Oj r1 = (C108535Oj) this.A01;
        if (!z2) {
            r0.A0A.remove(r7);
        }
        r1.ASw(bitmap, r7, z2);
    }
}

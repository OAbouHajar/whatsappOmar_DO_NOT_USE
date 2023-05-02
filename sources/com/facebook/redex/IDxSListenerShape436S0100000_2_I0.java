package com.facebook.redex;

import X.AnonymousClass2Ut;
import X.C108755Pf;
import android.view.View;

public class IDxSListenerShape436S0100000_2_I0 implements C108755Pf {
    public Object A00;
    public final int A01;

    public IDxSListenerShape436S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AWp(boolean z2) {
        View view;
        RunnableRunnableShape0S0110000_I0 runnableRunnableShape0S0110000_I0;
        if (this.A01 != 0) {
            AnonymousClass2Ut r3 = (AnonymousClass2Ut) this.A00;
            view = r3.A05;
            runnableRunnableShape0S0110000_I0 = new RunnableRunnableShape0S0110000_I0(r3, 18, z2);
        } else {
            view = (View) this.A00;
            runnableRunnableShape0S0110000_I0 = new RunnableRunnableShape0S0110000_I0(view, 14, z2);
        }
        view.post(runnableRunnableShape0S0110000_I0);
    }
}

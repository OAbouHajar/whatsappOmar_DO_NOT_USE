package com.facebook.redex;

import X.AnonymousClass04N;
import X.C000900k;
import X.C05370Qr;
import X.C16010sH;
import X.C16490t9;
import X.C48962Qc;
import X.C50382Zg;
import android.app.Activity;
import android.view.View;

public class IDxConsumerShape29S0300000_2_I0 implements AnonymousClass04N {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxConsumerShape29S0300000_2_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void accept(Object obj) {
        if (this.A03 != 0) {
            C48962Qc r2 = (C48962Qc) this.A00;
            Activity activity = (Activity) this.A01;
            View view = (View) this.A02;
            C16010sH r5 = (C16010sH) obj;
            if (r5 != null) {
                r2.A0B(view, (C000900k) activity, r5);
                return;
            }
            return;
        }
        C50382Zg r3 = (C50382Zg) this.A00;
        C16490t9 r22 = (C16490t9) this.A01;
        Activity activity2 = (Activity) this.A02;
        C05370Qr r52 = (C05370Qr) obj;
        r3.A02 = r52;
        if (r52 != null) {
            r3.A08.A00(activity2, r52, r22);
        }
        r3.A00(r3.A01, r3.A07);
        r3.A00(r3.A00, r3.A06);
    }
}

package com.facebook.redex;

import X.AnonymousClass01A;
import X.AnonymousClass5x9;
import X.C1220868f;
import android.app.Activity;

public class IDxSDetectorShape311S0100000_3_I1 implements C1220868f {
    public Object A00;
    public final int A01;

    public IDxSDetectorShape311S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AWi() {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 2:
            case 4:
                AnonymousClass5x9.A01(((AnonymousClass01A) obj).A0C());
                return;
            default:
                AnonymousClass5x9.A01((Activity) obj);
                return;
        }
    }
}

package com.facebook.redex;

import X.AnonymousClass53K;
import X.C208211s;
import X.C43141zP;
import X.C90194dg;
import android.graphics.Point;
import java.util.concurrent.Callable;

public class IDxCallableShape149S0100000_2_I1 implements Callable {
    public Object A00;
    public final int A01;

    public IDxCallableShape149S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ Object call() {
        int i2;
        switch (this.A01) {
            case 0:
                return this.A00;
            case 1:
                AnonymousClass53K r1 = (AnonymousClass53K) this.A00;
                C90194dg r0 = r1.A03;
                if (r0 != null && r0.A0B()) {
                    i2 = r1.A00();
                    break;
                } else {
                    i2 = -6;
                    break;
                }
                break;
            case 2:
                ((AnonymousClass53K) this.A00).A05();
                i2 = 0;
                break;
            case 3:
                AnonymousClass53K r2 = (AnonymousClass53K) this.A00;
                C90194dg r12 = r2.A03;
                return (r12 == null || !r12.A0B()) ? new Point(0, 0) : new Point(r12.A04(), r2.A03.A03());
            case 4:
                return ((C208211s) this.A00).A0I();
            case 5:
                i2 = ((C208211s) this.A00).A03();
                break;
            default:
                return ((C43141zP) this.A00).A00();
        }
        return Integer.valueOf(i2);
    }
}

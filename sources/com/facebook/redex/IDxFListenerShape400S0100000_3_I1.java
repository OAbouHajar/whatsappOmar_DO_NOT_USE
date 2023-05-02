package com.facebook.redex;

import X.AnonymousClass5zC;
import X.AnonymousClass687;
import X.C110115dX;
import X.C114875ok;
import X.C115345pb;
import X.C116015qg;
import X.C119575yh;
import android.graphics.Point;

public class IDxFListenerShape400S0100000_3_I1 implements AnonymousClass687 {
    public Object A00;
    public final int A01;

    public IDxFListenerShape400S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void ARS(Point point, C114875ok r8) {
        Object[] objArr;
        int i2;
        int i3;
        if (this.A01 != 0) {
            AnonymousClass5zC r5 = (AnonymousClass5zC) ((IDxCallableShape47S0200000_3_I1) this.A00).A00;
            if (!r5.A0e) {
                long j2 = r5.A0D ? 4000 : 2000;
                synchronized (r5) {
                    r5.A09();
                    r5.A0b = r5.A0T.A02("reset_focus", new IDxCallableShape150S0100000_3_I1(r5, 3), j2);
                }
                return;
            }
            return;
        }
        C119575yh r52 = (C119575yh) this.A00;
        C116015qg r4 = r52.A0B;
        if (r4 != null) {
            int A012 = C110115dX.A01(r8, C115345pb.A00);
            if (A012 != 1) {
                if (A012 != 2) {
                    if (A012 == 3 || A012 == 4) {
                        i3 = 13;
                    } else if (A012 == 5) {
                        i3 = 14;
                    } else {
                        return;
                    }
                    C119575yh.A00(r52, r4, i3);
                    return;
                } else if (point != null) {
                    objArr = new Object[]{r4, point};
                    i2 = 12;
                } else {
                    return;
                }
            } else if (point != null) {
                objArr = new Object[]{r4, point};
                i2 = 11;
            } else {
                return;
            }
            C119575yh.A00(r52, objArr, i2);
        }
    }
}

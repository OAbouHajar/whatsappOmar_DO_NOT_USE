package com.facebook.redex;

import X.AnonymousClass07B;
import X.AnonymousClass3BE;
import X.AnonymousClass3QV;
import X.AnonymousClass4NF;
import X.C16180sb;
import X.C16300so;
import X.C18020w1;
import X.C18820xJ;
import X.C18830xK;
import X.C18840xL;
import X.C30701co;
import X.C30761cu;
import X.C34641kb;
import X.C38241qT;
import X.C43061zH;
import X.C61973Bd;
import java.io.File;

public class RunnableRunnableShape1S0301000_I1 implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public RunnableRunnableShape1S0301000_I1(Object obj, Object obj2, Object obj3, int i2, int i3) {
        this.A04 = i3;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A00 = i2;
    }

    public void run() {
        if (this.A04 != 0) {
            AnonymousClass3BE r0 = (AnonymousClass3BE) this.A01;
            int i2 = this.A00;
            C43061zH r4 = (C43061zH) this.A03;
            C16300so r1 = r0.A01;
            C16180sb r2 = r0.A02;
            C18820xJ r9 = r0.A0H;
            C18020w1 r3 = r0.A03;
            C18830xK r10 = r0.A0I;
            C18840xL r8 = r0.A0G;
            C38241qT r7 = r0.A0D;
            C30761cu r6 = r0.A0C;
            C30701co r5 = r0.A0B;
            C61973Bd.A02(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, (File) this.A02, r5.A0u, i2);
            return;
        }
        AnonymousClass4NF r42 = (AnonymousClass4NF) this.A01;
        r42.A04.execute(new RunnableRunnableShape14S0200000_I1_2(this, 11, AnonymousClass07B.A00(new AnonymousClass3QV((C34641kb) this.A03, (C34641kb) this.A02, r42))));
    }
}

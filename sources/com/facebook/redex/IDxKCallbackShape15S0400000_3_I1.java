package com.facebook.redex;

import X.AnonymousClass024;
import X.AnonymousClass1XK;
import X.AnonymousClass2HJ;
import X.AnonymousClass50C;
import X.AnonymousClass5wX;
import X.AnonymousClass692;
import X.C117475t3;
import X.C117915tl;
import X.C118505un;
import X.C119805ze;
import X.C1209263n;
import java.io.File;

public class IDxKCallbackShape15S0400000_3_I1 implements AnonymousClass692 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxKCallbackShape15S0400000_3_I1(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A04 = i2;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A03 = obj4;
        this.A02 = obj;
    }

    public void AVP(AnonymousClass2HJ r4) {
        if (this.A04 != 0) {
            ((C118505un) this.A00).A02.A06.execute(new C1209263n((C117475t3) this.A01));
            return;
        }
        C119805ze r1 = (C119805ze) this.A01;
        Integer num = (Integer) this.A03;
        r1.AKW(r4, num);
        r1.AQX(r4, num);
    }

    public void AVQ(AnonymousClass50C r5) {
        if (this.A04 != 0) {
            AnonymousClass1XK r1 = (AnonymousClass1XK) this.A03;
            ((C118505un) this.A00).A00(r5, (C117475t3) this.A01, r1, (File) this.A02);
            return;
        }
        C119805ze r3 = (C119805ze) this.A01;
        r3.AKX((Integer) this.A03);
        ((AnonymousClass5wX) this.A00).A01((AnonymousClass024) this.A02, r3, new C117915tl(r5));
    }
}

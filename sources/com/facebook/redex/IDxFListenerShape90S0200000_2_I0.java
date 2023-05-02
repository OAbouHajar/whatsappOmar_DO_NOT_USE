package com.facebook.redex;

import X.AnonymousClass2DL;
import X.AnonymousClass3HE;
import X.AnonymousClass5QY;
import X.C16740tZ;
import X.C35691mL;
import X.C60032zq;
import com.obwhatsapp.biz.linkedaccounts.LinkedAccountsMediaCard;

public class IDxFListenerShape90S0200000_2_I0 implements AnonymousClass5QY {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxFListenerShape90S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void ARD(C60032zq r10, int i2) {
        C60032zq r4 = r10;
        if (this.A02 != 0) {
            AnonymousClass2DL r3 = (AnonymousClass2DL) this.A00;
            r3.A0P.A07(r10, (C16740tZ) this.A01, new AnonymousClass3HE(r3, i2));
            return;
        }
        C35691mL r5 = (C35691mL) this.A01;
        r10.setTag(r5.A04);
        ((LinkedAccountsMediaCard) this.A00).A04.A01(r4, r5, new IDxBListenerShape285S0100000_2_I1(r10, 3), new IDxSListenerShape268S0100000_2_I1(r10, 4), 2);
    }
}

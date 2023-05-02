package com.obwhatsapp.backup.google;

import X.AnonymousClass2GJ;
import X.AnonymousClass2GM;
import X.AnonymousClass390;
import X.AnonymousClass3BK;
import X.C615839m;
import X.C616039o;
import X.C61743Ad;
import X.C70983iF;
import com.facebook.redex.IDxSListenerShape416S0100000_2_I1;

public class IDxDTask6Shape3S0300000_2_I1 extends C70983iF {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxDTask6Shape3S0300000_2_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public /* bridge */ /* synthetic */ Object A00(int i2) {
        IDxSListenerShape416S0100000_2_I1 iDxSListenerShape416S0100000_2_I1;
        AnonymousClass2GM r3;
        AnonymousClass3BK r6;
        C615839m r7;
        AnonymousClass2GJ r5;
        if (this.A03 != 0) {
            AnonymousClass390 r2 = (AnonymousClass390) this.A00;
            r3 = r2.A06;
            r6 = (AnonymousClass3BK) this.A01;
            r7 = (C615839m) this.A02;
            iDxSListenerShape416S0100000_2_I1 = new IDxSListenerShape416S0100000_2_I1(r2.A0Q, 1);
            r5 = r2.A05;
        } else {
            iDxSListenerShape416S0100000_2_I1 = new IDxSListenerShape416S0100000_2_I1(this, 0);
            C616039o r0 = (C616039o) this.A00;
            r3 = r0.A0L;
            r6 = (AnonymousClass3BK) this.A01;
            r7 = (C615839m) this.A02;
            r5 = r0.A0J;
        }
        C61743Ad A05 = r3.A05(iDxSListenerShape416S0100000_2_I1, r5, r6, r7, i2);
        r7.A02();
        return A05;
    }
}

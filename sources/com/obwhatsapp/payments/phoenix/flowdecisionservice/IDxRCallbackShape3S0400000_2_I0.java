package com.obwhatsapp.payments.phoenix.flowdecisionservice;

import X.AnonymousClass51A;
import X.C17950vu;
import X.C18450wi;
import X.C28371Vv;
import com.facebook.redex.RunnableRunnableShape0S1600000_I1;
import com.facebook.redex.RunnableRunnableShape1S0500000_I1;
import com.facebook.redex.RunnableRunnableShape1S1400000_I1;

public class IDxRCallbackShape3S0400000_2_I0 extends AnonymousClass51A {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxRCallbackShape3S0400000_2_I0(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A04 = i2;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A02 = obj4;
        this.A00 = obj;
    }

    public void APb(String str) {
        int i2 = this.A04;
        String str2 = str;
        C18450wi.A0H(str, 0);
        C17950vu r3 = (C17950vu) this.A03;
        r3.A05.Acq(new RunnableRunnableShape1S1400000_I1(this, r3, this.A01, this.A00, str2, i2 != 0 ? 4 : 3));
    }

    public void AQe(C28371Vv r10, String str) {
        int i2;
        C28371Vv r3 = r10;
        if (this.A04 != 0) {
            C18450wi.A0H(str, 0);
            i2 = 1;
            C18450wi.A0H(r10, 1);
        } else {
            i2 = 0;
            C18450wi.A0H(str, 0);
            C18450wi.A0H(r10, 1);
        }
        C17950vu r5 = (C17950vu) this.A03;
        r5.A05.Acq(new RunnableRunnableShape0S1600000_I1(this, r3, this.A02, r5, this.A01, this.A00, i2));
    }

    public void AYG(C28371Vv r9, String str) {
        int i2 = this.A04;
        C28371Vv r4 = r9;
        C18450wi.A0H(r9, 1);
        C17950vu r3 = (C17950vu) this.A03;
        r3.A05.Acq(new RunnableRunnableShape1S0500000_I1(this.A00, r3, r4, this.A01, this.A02, i2 != 0 ? 5 : 4));
    }
}

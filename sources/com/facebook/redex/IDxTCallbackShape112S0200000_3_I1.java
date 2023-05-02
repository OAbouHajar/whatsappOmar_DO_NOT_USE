package com.facebook.redex;

import X.AnonymousClass1NO;
import X.AnonymousClass2HJ;
import X.C110115dX;
import X.C118185uH;
import X.C118245uN;
import X.C118575uu;
import X.C1222268t;
import X.C18310wU;
import X.C28371Vv;
import X.C35081lL;
import com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1;

public class IDxTCallbackShape112S0200000_3_I1 implements C1222268t {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxTCallbackShape112S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void AQW(AnonymousClass2HJ r5) {
        if (this.A02 != 0) {
            ((C118185uH) this.A01).A00(r5);
            return;
        }
        C118245uN r3 = (C118245uN) this.A01;
        if (r3.A01.compareAndSet(false, true)) {
            r3.A02.decrementAndGet();
            r3.A00.AQW(r5);
        }
    }

    public void AYC(String str) {
        if (this.A02 != 0) {
            C118575uu r5 = (C118575uu) this.A00;
            C18310wU r7 = r5.A04;
            C35081lL[] r3 = new C35081lL[4];
            C110115dX.A14("action", "pin-credential-check", r3);
            r3[1] = new C35081lL("token", str);
            C35081lL.A01("credential-id", r5.A0B, r3);
            r3[3] = new C35081lL("device-id", r5.A0A.A01());
            C28371Vv r9 = new C28371Vv("account", r3);
            Object obj = this.A01;
            r7.A0H(new IDxRCallbackShape20S0200000_3_I1(r5.A00, r5.A03, r5.A01, obj, r5, 14), r9, "get", AnonymousClass1NO.A0L);
            return;
        }
        ((C118245uN) this.A01).A00(0, str);
    }
}

package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass1TV;
import X.AnonymousClass2HJ;
import X.C111765hN;
import X.C112315iI;
import X.C1222668x;
import X.C35301lh;
import com.whatsapp.util.Log;

public class IDxCCallbackShape2S1300000_3_I1 implements C1222668x {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public IDxCCallbackShape2S1300000_3_I1(C35301lh r1, AnonymousClass1TV r2, C112315iI r3, String str, int i2) {
        this.A04 = i2;
        this.A00 = r3;
        this.A02 = r1;
        this.A03 = str;
        this.A01 = r2;
    }

    public void AP5(C111765hN r8) {
        int i2 = this.A04;
        C112315iI r1 = (C112315iI) this.A00;
        C35301lh r2 = r8.A02;
        AnonymousClass00B.A06(r2);
        String str = r8.A03;
        C35301lh r3 = (C35301lh) this.A02;
        String str2 = this.A03;
        AnonymousClass1TV r4 = (AnonymousClass1TV) this.A01;
        if (i2 != 0) {
            r1.A01(r2, r3, r4, str, str2);
        } else {
            r1.A00(r2, r3, r4, str, str2);
        }
    }

    public void AQW(AnonymousClass2HJ r2) {
        Log.w(this.A04 != 0 ? "PAY: IndiaUpiPaymentMethodAction: could not fetch VPA information to remove payment method" : "PAY: IndiaUpiPaymentMethodAction: could not fetch VPA information to set default payment method");
        ((AnonymousClass1TV) this.A01).AWC(r2);
    }
}

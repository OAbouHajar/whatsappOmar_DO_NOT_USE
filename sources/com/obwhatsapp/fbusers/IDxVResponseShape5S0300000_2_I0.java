package com.obwhatsapp.fbusers;

import X.AnonymousClass144;
import X.AnonymousClass148;
import X.AnonymousClass14L;
import X.AnonymousClass2HW;
import X.AnonymousClass2HY;
import X.AnonymousClass3FY;
import X.AnonymousClass4UI;
import java.security.PublicKey;
import java.security.cert.X509Certificate;

public class IDxVResponseShape5S0300000_2_I0 extends AnonymousClass2HY {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxVResponseShape5S0300000_2_I0(AnonymousClass2HW r1, AnonymousClass2HW r2, AnonymousClass14L r3, AnonymousClass144 r4, int i2) {
        super(r1);
        this.A03 = i2;
        this.A00 = r3;
        this.A02 = r4;
        this.A01 = r2;
    }

    public void AYK(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        int i2 = this.A03;
        AnonymousClass14L r1 = (AnonymousClass14L) this.A00;
        AnonymousClass148 r0 = (AnonymousClass148) r1.A01.get();
        AnonymousClass144 r2 = (AnonymousClass144) this.A02;
        Integer num2 = num;
        PublicKey publicKey2 = publicKey;
        X509Certificate x509Certificate3 = x509Certificate;
        if (i2 != 0) {
            r0.A00(r2).AaX(r1.A00(r2), new AnonymousClass3FY((AnonymousClass2HW) this.A01, r2, r1.A00), new AnonymousClass4UI(), num2, publicKey2, x509Certificate3);
            return;
        }
        r0.A00(r2).AaU(new AnonymousClass3FY((AnonymousClass2HW) this.A01, r2, r1.A00), new AnonymousClass4UI(), num2, publicKey2, x509Certificate3);
    }
}

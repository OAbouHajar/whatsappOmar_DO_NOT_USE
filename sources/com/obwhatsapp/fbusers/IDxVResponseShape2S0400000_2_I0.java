package com.obwhatsapp.fbusers;

import X.AnonymousClass144;
import X.AnonymousClass148;
import X.AnonymousClass14L;
import X.AnonymousClass28T;
import X.AnonymousClass2HW;
import X.AnonymousClass2HY;
import X.AnonymousClass3FY;
import X.AnonymousClass4UI;
import X.C213713v;
import java.security.PublicKey;
import java.security.cert.X509Certificate;

public class IDxVResponseShape2S0400000_2_I0 extends AnonymousClass2HY {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxVResponseShape2S0400000_2_I0(AnonymousClass2HW r1, Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        super(r1);
        this.A04 = i2;
        this.A00 = obj3;
        this.A03 = obj;
        this.A01 = obj2;
        this.A02 = obj4;
    }

    public void AYK(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        int i2 = this.A04;
        AnonymousClass14L r1 = (AnonymousClass14L) this.A00;
        AnonymousClass148 r0 = (AnonymousClass148) r1.A01.get();
        Integer num2 = num;
        PublicKey publicKey2 = publicKey;
        X509Certificate x509Certificate3 = x509Certificate;
        if (i2 != 0) {
            AnonymousClass144 r2 = (AnonymousClass144) this.A03;
            r0.A00(r2).AaV(new AnonymousClass3FY((AnonymousClass2HW) this.A01, r2, r1.A00), new AnonymousClass4UI(), num2, this.A02, publicKey2, x509Certificate3);
            return;
        }
        AnonymousClass28T r12 = (AnonymousClass28T) this.A03;
        AnonymousClass144 r22 = r12.A01;
        C213713v A002 = r0.A00(r22);
        AnonymousClass3FY r13 = new AnonymousClass3FY((AnonymousClass2HW) this.A01, r22, r1.A00);
        AnonymousClass4UI r14 = (AnonymousClass4UI) this.A02;
        if (r14 == null) {
            r14 = new AnonymousClass4UI();
        }
        A002.AaY(r12, r13, r14, num2, publicKey2, x509Certificate3);
    }
}

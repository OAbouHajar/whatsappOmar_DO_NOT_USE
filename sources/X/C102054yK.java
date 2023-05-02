package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.4yK  reason: invalid class name and case insensitive filesystem */
public final class C102054yK implements AnonymousClass2HZ {
    public final /* synthetic */ AnonymousClass5SY A00;
    public final /* synthetic */ AnonymousClass22J A01;

    public C102054yK(AnonymousClass5SY r1, AnonymousClass22J r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void APa(Exception exc) {
        this.A00.APY();
    }

    public void AQa(Exception exc) {
        this.A00.AQa(exc);
    }

    public void AYK(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        AnonymousClass3K2.A1H(x509Certificate, x509Certificate2);
        this.A01.AIU(new AnonymousClass4WO(num, publicKey, x509Certificate, x509Certificate2));
    }
}

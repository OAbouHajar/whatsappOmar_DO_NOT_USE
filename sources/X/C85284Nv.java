package X;

import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.X509Certificate;
import java.util.Date;

/* renamed from: X.4Nv  reason: invalid class name and case insensitive filesystem */
public class C85284Nv {
    public final int A00;
    public final PublicKey A01;
    public final CertPath A02;
    public final X509Certificate A03;
    public final Date A04;
    public final C1047156p A05;

    public C85284Nv(PublicKey publicKey, CertPath certPath, X509Certificate x509Certificate, Date date, C1047156p r5, int i2) {
        this.A05 = r5;
        this.A04 = date;
        this.A02 = certPath;
        this.A00 = i2;
        this.A03 = x509Certificate;
        this.A01 = publicKey;
    }

    public static CertPathValidatorException A00(String str, Throwable th, C85284Nv r5) {
        return new CertPathValidatorException(str, th, r5.A02, r5.A00);
    }
}

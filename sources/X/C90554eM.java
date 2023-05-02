package X;

import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.4eM  reason: invalid class name and case insensitive filesystem */
public class C90554eM {
    public static AnonymousClass5IQ A00(Object obj) {
        if (obj instanceof X509Certificate) {
            return A02((X509Certificate) obj);
        }
        throw AnonymousClass000.A0W("getIssuer");
    }

    public static AnonymousClass5IQ A01(X509CRL x509crl) {
        if (x509crl != null) {
            return A04(x509crl.getIssuerX500Principal());
        }
        throw AnonymousClass3K4.A0V();
    }

    public static AnonymousClass5IQ A02(X509Certificate x509Certificate) {
        if (x509Certificate instanceof AnonymousClass5NO) {
            AnonymousClass5IQ r0 = ((C105785Be) ((AnonymousClass5NO) x509Certificate)).f154c.A03.A05;
            if (r0 != null) {
                return r0;
            }
        } else if (x509Certificate != null) {
            return A04(x509Certificate.getIssuerX500Principal());
        }
        throw AnonymousClass3K4.A0V();
    }

    public static AnonymousClass5IQ A03(X509Certificate x509Certificate) {
        if (!(x509Certificate instanceof AnonymousClass5NO)) {
            return A04(x509Certificate.getSubjectX500Principal());
        }
        AnonymousClass5IQ r0 = ((C105785Be) ((AnonymousClass5NO) x509Certificate)).f154c.A03.A06;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass3K4.A0V();
    }

    public static AnonymousClass5IQ A04(X500Principal x500Principal) {
        byte[] encoded;
        AnonymousClass5IQ A01;
        if (x500Principal != null && (encoded = x500Principal.getEncoded()) != null && (A01 = AnonymousClass5IQ.A01(encoded)) != null) {
            return A01;
        }
        throw AnonymousClass3K4.A0V();
    }
}

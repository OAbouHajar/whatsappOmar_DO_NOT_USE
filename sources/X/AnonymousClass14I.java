package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;

/* renamed from: X.14I  reason: invalid class name */
public class AnonymousClass14I {
    public X509Certificate A00(String str, String[] strArr) {
        Certificate certificate;
        Collection<? extends Certificate> generateCertificates = CertificateFactory.getInstance("X.509").generateCertificates(new ByteArrayInputStream(str.getBytes(AnonymousClass01S.A08)));
        if (!generateCertificates.isEmpty()) {
            X509Certificate[] x509CertificateArr = (X509Certificate[]) generateCertificates.toArray(new X509Certificate[0]);
            int length = x509CertificateArr.length;
            if (length >= 2) {
                try {
                    certificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(Base64.decode("MIIEfTCCA2WgAwIBAgIUTRB3DSS1IoPy5PHlIVftCO3ytEswDQYJKoZIhvcNAQEL\nBQAweTEoMCYGA1UEAwwfRmFjZWJvb2sgUm9vdGNhbmFsIFByb2QgUm9vdCBDQTEL\nMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNhbGlmb3JuaWExEzARBgNVBAcMCk1lbmxv\nIFBhcmsxFjAUBgNVBAoMDUZhY2Vib29rIEluYy4wHhcNMTgwMjIxMDAwNjQzWhcN\nNDgwMjIxMDAwNjQzWjB5MSgwJgYDVQQDDB9GYWNlYm9vayBSb290Y2FuYWwgUHJv\nZCBSb290IENBMQswCQYDVQQGEwJVUzETMBEGA1UECAwKQ2FsaWZvcm5pYTETMBEG\nA1UEBwwKTWVubG8gUGFyazEWMBQGA1UECgwNRmFjZWJvb2sgSW5jLjCCASIwDQYJ\nKoZIhvcNAQEBBQADggEPADCCAQoCggEBAO04IfUs0M4IPVwJHLAFSTulY1/R/cEk\nhDlIKmpRA3IiSG7eAgBxWuvUZti2zm4G0ftPVUJOqjhavu+EOW9iT6WBZojtRNsF\nkJKJIBrfwg3A9i2BMF7PUsDNMRkRnUmiZeQ5HY/sPLYCwp6rYLaUHC5E+73y9ByS\nssnmlJCPTsv+OgdFpFHJaSf0YOL33xheHDrdElYAibh4dOtg4v7lWh/D1vpLi4Y1\ngFD8BICeUIZe622gRnj84hCkkbE6kJyCqO3l2FXMPYZjhlUa8vRE4qsUUCAZmamW\nNDGKDH5z2EuC3glVU9B5NJdfn3FXh7/Pv49sV70hs+pGkOwwuhsJ1dUCAwEAAaOB\n/DCB+TAPBgNVHRMBAf8EBTADAQH/MB0GA1UdDgQWBBT6a6rC4jjPN1kw0KTesLkl\nsYoajDCBtgYDVR0jBIGuMIGrgBT6a6rC4jjPN1kw0KTesLklsYoajKF9pHsweTEo\nMCYGA1UEAwwfRmFjZWJvb2sgUm9vdGNhbmFsIFByb2QgUm9vdCBDQTELMAkGA1UE\nBhMCVVMxEzARBgNVBAgMCkNhbGlmb3JuaWExEzARBgNVBAcMCk1lbmxvIFBhcmsx\nFjAUBgNVBAoMDUZhY2Vib29rIEluYy6CFE0Qdw0ktSKD8uTx5SFX7Qjt8rRLMA4G\nA1UdDwEB/wQEAwIBhjANBgkqhkiG9w0BAQsFAAOCAQEAW9EUmvvxgcxEPfxB7G7R\nwxwk6m4xPBTc0UArnWCLZRmRBmaKYPovC0brhKF7Dfn9IcXEhhmsLRnBy/1xtbWG\nW1kQzQeIUaDgXymE+dmnmorhuwepwELcsX7UB1RM0HoES3Z0Y2EvS4/iz5Q3GMEb\n/J5FVduXkm+NClL+6qAn4xHGpwGsa2Prpe8f9UZTCCiwwfT9IxvRpe/oTeE9G3VK\nUIb2ZHo1/PQSXAAxcyYAjVBHpiSW/C0iI5qqy9Lie27rkaShHA4X8xEkX0VfRRQF\n40UYnDkeEcv4yUiVBDTefvTzBpB2WihYr/FzBBkKF/9PBE+5uM8458vAmItA8vrr\nWA==\n", 2)));
                } catch (CertificateException unused) {
                    Log.e("Can't generate the X509 certificate");
                    certificate = null;
                }
                AnonymousClass00B.A06(certificate);
                int i2 = 0;
                X509Certificate x509Certificate = x509CertificateArr[0];
                X509Certificate x509Certificate2 = x509CertificateArr[1];
                PublicKey publicKey = certificate.getPublicKey();
                try {
                    Date date = new Date();
                    do {
                        x509CertificateArr[i2].checkValidity(date);
                        i2++;
                    } while (i2 < length);
                    if (!x509Certificate.getSubjectX500Principal().getName().equals(x509Certificate2.getIssuerX500Principal().getName())) {
                        if (x509Certificate2.getSubjectX500Principal().getName().equals(x509Certificate.getIssuerX500Principal().getName())) {
                            X509Certificate x509Certificate3 = x509Certificate2;
                            x509Certificate2 = x509Certificate;
                            x509Certificate = x509Certificate3;
                        } else {
                            throw new CertificateException("SecureAuthenticationUtils : Certificate validation failed");
                        }
                    }
                    x509Certificate.verify(publicKey);
                    x509Certificate2.verify(x509Certificate.getPublicKey());
                    String name = x509Certificate2.getSubjectX500Principal().getName();
                    for (String equals : strArr) {
                        if (name.equals(equals)) {
                            return x509Certificate2;
                        }
                    }
                    throw new CertificateException("SecureAuthenticationUtils : Certificate validation failed");
                } catch (CertificateExpiredException e2) {
                    throw e2;
                } catch (GeneralSecurityException e3) {
                    StringBuilder sb = new StringBuilder("Something went wrong while validating certificate ");
                    sb.append(e3);
                    Log.e(sb.toString());
                    throw e3;
                }
            } else {
                throw new CertificateException("SecureAuthenticationUtils : Certificate validation failed");
            }
        } else {
            throw new CertificateException("Could not create certificates");
        }
    }
}

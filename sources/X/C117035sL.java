package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* renamed from: X.5sL  reason: invalid class name and case insensitive filesystem */
public class C117035sL {
    public X509Certificate A00;
    public final AnonymousClass14I A01;
    public final C18300wT A02;

    public C117035sL(AnonymousClass14I r4, C18300wT r5) {
        X509Certificate x509Certificate;
        this.A02 = r5;
        this.A01 = r4;
        try {
            x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(Base64.decode("MIICUDCCAfegAwIBAgIUHkgEbXTAygu7dguuo6MjyvPo5NIwCgYIKoZIzj0EAwIw\nfjELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNhbGlmb3JuaWExHjAcBgNVBAoMFUZh\nY2Vib29rIFBheW1lbnRzIEluYzE6MDgGA1UEAwwxRmFjZWJvb2sgUGF5bWVudHMg\nU2VjdXJlIFRpZXIgTWFzdGVyIFNpZ25pbmcgQ2VydDAeFw0yMDA2MDUyMTM0NTda\nFw0yMTA2MDUyMTM0NTdaMH4xCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9y\nbmlhMR4wHAYDVQQKDBVGYWNlYm9vayBQYXltZW50cyBJbmMxOjA4BgNVBAMMMUZh\nY2Vib29rIFBheW1lbnRzIFNlY3VyZSBUaWVyIE1hc3RlciBTaWduaW5nIENlcnQw\nWTATBgcqhkjOPQIBBggqhkjOPQMBBwNCAARnZ9FlWc2rSXyZyUtL8QwJydBYY2MS\n66NHUT47JHzSgcBp0eG9D2M0uVX8PDPTzyz2fTuECD8v4f2gT+TtYaeqo1MwUTAd\nBgNVHQ4EFgQUODetYD68XqFs905klyRBeS2NyYcwHwYDVR0jBBgwFoAUODetYD68\nXqFs905klyRBeS2NyYcwDwYDVR0TAQH/BAUwAwEB/zAKBggqhkjOPQQDAgNHADBE\nAiBG/FnYWDJstMBNPzuY00DHyLQNwcsVDGDTpukjQPUiZAIgDK+ALUqfDCP/EOaP\nQF2tMIxySbNPehxhprHHZtNf1zg=", 0)));
        } catch (CertificateException unused) {
            Log.e("Can't generate the X509 certificate");
            x509Certificate = null;
        }
        this.A00 = x509Certificate;
    }
}

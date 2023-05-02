package X;

import com.whatsapp.util.Log;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.58d  reason: invalid class name and case insensitive filesystem */
public class C1050858d implements X509TrustManager {
    public final /* synthetic */ C78353xn A00;

    public C1050858d(C78353xn r1) {
        this.A00 = r1;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (x509CertificateArr.length >= 1) {
            try {
                if (!AnonymousClass474.A00(x509CertificateArr[0]).equals(this.A00.A00.A01)) {
                    throw new CertificateException("Certificate is not valid");
                }
            } catch (CertificateEncodingException e2) {
                Log.e("fpm/HashCheckingSSLSocketFactory/failed to encode certificate", e2);
            }
        } else {
            throw new CertificateException("Chain have to have at least 1 certificate");
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}

package X;

import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;

/* renamed from: X.5Bd  reason: invalid class name and case insensitive filesystem */
public class C105775Bd extends X509CertSelector implements C109955Ul {
    public boolean ALL(Object obj) {
        if (!(obj instanceof X509Certificate)) {
            return false;
        }
        return super.match((Certificate) obj);
    }

    public boolean match(Certificate certificate) {
        return ALL(certificate);
    }
}

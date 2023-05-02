package X;

import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.X509CRLSelector;

/* renamed from: X.5Bb  reason: invalid class name and case insensitive filesystem */
public class C105755Bb extends X509CRLSelector {
    public final AnonymousClass5AI A00;

    public C105755Bb(AnonymousClass5AI r3) {
        this.A00 = r3;
        CRLSelector cRLSelector = r3.A01;
        if (cRLSelector instanceof X509CRLSelector) {
            X509CRLSelector x509CRLSelector = (X509CRLSelector) cRLSelector;
            setCertificateChecking(x509CRLSelector.getCertificateChecking());
            setDateAndTime(x509CRLSelector.getDateAndTime());
            setIssuers(x509CRLSelector.getIssuers());
            setMinCRLNumber(x509CRLSelector.getMinCRL());
            setMaxCRLNumber(x509CRLSelector.getMaxCRL());
        }
    }

    public boolean match(CRL crl) {
        AnonymousClass5AI r0 = this.A00;
        return r0 == null ? AnonymousClass000.A1V(crl) : r0.ALL(crl);
    }
}

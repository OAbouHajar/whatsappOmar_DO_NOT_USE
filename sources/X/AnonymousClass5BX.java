package X;

import java.io.IOException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CertSelector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.5BX  reason: invalid class name */
public class AnonymousClass5BX extends PKIXParameters {
    public int A00 = 0;
    public List A01 = AnonymousClass000.A0u();
    public List A02 = AnonymousClass000.A0u();
    public Set A03 = C13680ns.A0o();
    public Set A04 = C13680ns.A0o();
    public Set A05 = C13680ns.A0o();
    public Set A06 = C13680ns.A0o();
    public C109955Ul A07;
    public boolean A08;
    public boolean A09 = false;

    public AnonymousClass5BX(Set set) {
        super(set);
    }

    public void A00(PKIXParameters pKIXParameters) {
        setDate(pKIXParameters.getDate());
        setCertPathCheckers(pKIXParameters.getCertPathCheckers());
        setCertStores(pKIXParameters.getCertStores());
        setAnyPolicyInhibited(pKIXParameters.isAnyPolicyInhibited());
        setExplicitPolicyRequired(pKIXParameters.isExplicitPolicyRequired());
        setPolicyMappingInhibited(pKIXParameters.isPolicyMappingInhibited());
        setRevocationEnabled(pKIXParameters.isRevocationEnabled());
        setInitialPolicies(pKIXParameters.getInitialPolicies());
        setPolicyQualifiersRejected(pKIXParameters.getPolicyQualifiersRejected());
        setSigProvider(pKIXParameters.getSigProvider());
        setTargetCertConstraints(pKIXParameters.getTargetCertConstraints());
        try {
            setTrustAnchors(pKIXParameters.getTrustAnchors());
            if (pKIXParameters instanceof AnonymousClass5BX) {
                AnonymousClass5BX r3 = (AnonymousClass5BX) pKIXParameters;
                this.A00 = r3.A00;
                this.A09 = r3.A09;
                this.A08 = r3.A08;
                C109955Ul r0 = r3.A07;
                this.A07 = r0 == null ? null : (C109955Ul) r0.clone();
                this.A02 = C13680ns.A0n(r3.A02);
                this.A01 = C13680ns.A0n(r3.A01);
                this.A06 = new HashSet(r3.A06);
                this.A05 = new HashSet(r3.A05);
                this.A04 = new HashSet(r3.A04);
                this.A03 = new HashSet(r3.A03);
            }
        } catch (Exception e2) {
            throw AnonymousClass000.A0a(e2.getMessage());
        }
    }

    public Object clone() {
        try {
            AnonymousClass5BX r0 = new AnonymousClass5BX(getTrustAnchors());
            r0.A00(this);
            return r0;
        } catch (Exception e2) {
            throw AnonymousClass000.A0a(e2.getMessage());
        }
    }

    public void setCertStores(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                addCertStore((CertStore) it.next());
            }
        }
    }

    public void setTargetCertConstraints(CertSelector certSelector) {
        C105775Bd r1;
        super.setTargetCertConstraints(certSelector);
        if (certSelector != null) {
            X509CertSelector x509CertSelector = (X509CertSelector) certSelector;
            if (x509CertSelector != null) {
                r1 = new C105775Bd();
                r1.setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
                r1.setBasicConstraints(x509CertSelector.getBasicConstraints());
                r1.setCertificate(x509CertSelector.getCertificate());
                r1.setCertificateValid(x509CertSelector.getCertificateValid());
                r1.setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
                try {
                    r1.setPathToNames(x509CertSelector.getPathToNames());
                    r1.setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
                    r1.setNameConstraints(x509CertSelector.getNameConstraints());
                    r1.setPolicy(x509CertSelector.getPolicy());
                    r1.setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
                    r1.setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
                    r1.setIssuer(x509CertSelector.getIssuer());
                    r1.setKeyUsage(x509CertSelector.getKeyUsage());
                    r1.setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
                    r1.setSerialNumber(x509CertSelector.getSerialNumber());
                    r1.setSubject(x509CertSelector.getSubject());
                    r1.setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
                    r1.setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
                } catch (IOException e2) {
                    throw AnonymousClass000.A0T(AnonymousClass000.A0g("error in passed in selector: ", e2));
                }
            } else {
                throw AnonymousClass000.A0T("cannot create from null selector");
            }
        } else {
            r1 = null;
        }
        this.A07 = r1;
    }
}

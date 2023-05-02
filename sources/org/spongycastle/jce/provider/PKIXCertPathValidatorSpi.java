package org.spongycastle.jce.provider;

import X.AnonymousClass000;
import X.AnonymousClass3IS;
import X.AnonymousClass3K2;
import X.AnonymousClass3K4;
import X.AnonymousClass5A6;
import X.AnonymousClass5AA;
import X.AnonymousClass5AH;
import X.AnonymousClass5BS;
import X.AnonymousClass5BX;
import X.AnonymousClass5I3;
import X.AnonymousClass5IH;
import X.AnonymousClass5IQ;
import X.AnonymousClass5NO;
import X.AnonymousClass5NQ;
import X.C1047056o;
import X.C1047156p;
import X.C105785Be;
import X.C13680ns;
import X.C32211fp;
import X.C615439i;
import X.C803243k;
import X.C88434aU;
import X.C90554eM;
import X.C90924f5;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi {
    public final AnonymousClass5NQ A00;
    public final boolean A01;

    public PKIXCertPathValidatorSpi() {
        this(false);
    }

    public PKIXCertPathValidatorSpi(boolean z2) {
        this.A00 = new AnonymousClass5AA();
        this.A01 = z2;
    }

    public static void A00(X509Certificate x509Certificate) {
        if (x509Certificate instanceof AnonymousClass5NO) {
            RuntimeException e2 = null;
            try {
                if (((C105785Be) ((AnonymousClass5NO) x509Certificate)).f154c.A03 != null) {
                    return;
                }
            } catch (RuntimeException e3) {
                e2 = e3;
            }
            throw C803243k.A00("unable to process TBSCertificate", e2);
        }
        try {
            AnonymousClass5I3.A00(x509Certificate.getTBSCertificate());
        } catch (CertificateEncodingException e4) {
            throw C803243k.A00("unable to process TBSCertificate", e4);
        } catch (IllegalArgumentException e5) {
            throw C803243k.A00(e5.getMessage(), (Throwable) null);
        }
    }

    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) {
        C1047156p r4;
        AnonymousClass5IQ r26;
        PublicKey publicKey;
        HashSet A0o;
        CertPathParameters certPathParameters2 = certPathParameters;
        if (certPathParameters2 instanceof PKIXParameters) {
            C88434aU r1 = new C88434aU((PKIXParameters) certPathParameters2);
            if (certPathParameters2 instanceof AnonymousClass5BX) {
                AnonymousClass5BX r42 = (AnonymousClass5BX) certPathParameters2;
                r1.A08 = r42.A09;
                r1.A00 = r42.A00;
            }
            r4 = new C1047156p(r1);
        } else if (certPathParameters2 instanceof C1047056o) {
            r4 = ((C1047056o) certPathParameters2).A02;
        } else if (certPathParameters2 instanceof C1047156p) {
            r4 = (C1047156p) certPathParameters2;
        } else {
            StringBuilder A0r = AnonymousClass000.A0r("Parameters must be a ");
            AnonymousClass3K4.A0v(PKIXParameters.class, A0r);
            throw AnonymousClass3K4.A0d(AnonymousClass000.A0h(" instance.", A0r));
        }
        Set set = r4.A08;
        if (set != null) {
            CertPath certPath2 = certPath;
            List<? extends Certificate> certificates = certPath2.getCertificates();
            int size = certificates.size();
            if (!certificates.isEmpty()) {
                Date date = new Date();
                Date date2 = r4.A03;
                if (date2 != null) {
                    date = new Date(date2.getTime());
                }
                PKIXParameters pKIXParameters = r4.A01;
                Set<String> initialPolicies = pKIXParameters.getInitialPolicies();
                try {
                    TrustAnchor A012 = C90924f5.A01(pKIXParameters.getSigProvider(), (X509Certificate) certificates.get(certificates.size() - 1), set);
                    if (A012 != null) {
                        A00(A012.getTrustedCert());
                        C88434aU r2 = new C88434aU(r4);
                        r2.A05 = Collections.singleton(A012);
                        C1047156p r43 = new C1047156p(r2);
                        int i2 = size + 1;
                        ArrayList[] arrayListArr = new ArrayList[i2];
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayListArr[i3] = AnonymousClass000.A0u();
                        }
                        HashSet A0o2 = C13680ns.A0o();
                        A0o2.add("2.5.29.32.0");
                        AnonymousClass3IS r22 = new AnonymousClass3IS("2.5.29.32.0", (PolicyNode) null, AnonymousClass000.A0u(), A0o2, C13680ns.A0o(), 0, false);
                        arrayListArr[0].add(r22);
                        C615439i r18 = new C615439i();
                        HashSet A0o3 = C13680ns.A0o();
                        PKIXParameters pKIXParameters2 = r43.A01;
                        int i4 = i2;
                        if (pKIXParameters2.isExplicitPolicyRequired()) {
                            i4 = 0;
                        }
                        int i5 = i2;
                        if (pKIXParameters2.isAnyPolicyInhibited()) {
                            i5 = 0;
                        }
                        if (pKIXParameters2.isPolicyMappingInhibited()) {
                            i2 = 0;
                        }
                        X509Certificate trustedCert = A012.getTrustedCert();
                        if (trustedCert != null) {
                            try {
                                r26 = C90554eM.A03(trustedCert);
                                publicKey = trustedCert.getPublicKey();
                            } catch (RuntimeException e2) {
                                throw new AnonymousClass5BS("Subject of trust anchor could not be (re)encoded.", e2, certPath2, -1);
                            }
                        } else {
                            r26 = C90554eM.A04(A012.getCA());
                            publicKey = A012.getCAPublicKey();
                        }
                        try {
                            C90924f5.A0A(publicKey);
                            AnonymousClass5AH r8 = r43.A09;
                            if (r8 != null) {
                                if (!r8.A00.match((Certificate) certificates.get(0))) {
                                    throw new AnonymousClass5BS("Target certificate in certification path does not match targetConstraints.", (Throwable) null, certPath2, 0);
                                }
                            }
                            List<PKIXCertPathChecker> certPathCheckers = pKIXParameters2.getCertPathCheckers();
                            for (PKIXCertPathChecker init : certPathCheckers) {
                                init.init(false);
                            }
                            AnonymousClass5A6 r9 = r43.A0A ? new AnonymousClass5A6(this.A00) : null;
                            int size2 = certificates.size() - 1;
                            int i6 = size;
                            X509Certificate x509Certificate = null;
                            while (size2 >= 0) {
                                int i7 = size - size2;
                                x509Certificate = (X509Certificate) certificates.get(size2);
                                boolean A1R = AnonymousClass000.A1R(size2, certificates.size() - 1);
                                try {
                                    A00(x509Certificate);
                                    C32211fp.A0A(publicKey, certPath2, trustedCert, date, r26, r9, r43, size2, A1R);
                                    boolean z2 = this.A01;
                                    C32211fp.A0I(certPath2, r18, size2, z2);
                                    r22 = C32211fp.A08(certPath2, C32211fp.A07(certPath2, A0o3, r22, arrayListArr, size2, i5, z2), size2);
                                    if (i4 > 0 || r22 != null) {
                                        if (i7 != size) {
                                            if (x509Certificate == null || x509Certificate.getVersion() != 1) {
                                                C32211fp.A0C(certPath2, size2);
                                                r22 = C32211fp.A09(certPath2, r22, arrayListArr, size2, i2);
                                                C32211fp.A0H(certPath2, r18, size2);
                                                int A0A = AnonymousClass3K2.A0A(certPath2, size2, i4);
                                                int A0A2 = AnonymousClass3K2.A0A(certPath2, size2, i2);
                                                int A0A3 = AnonymousClass3K2.A0A(certPath2, size2, i5);
                                                i4 = C32211fp.A00(certPath2, size2, A0A);
                                                i2 = C32211fp.A01(certPath2, size2, A0A2);
                                                i5 = C32211fp.A02(certPath2, size2, A0A3);
                                                C32211fp.A0D(certPath2, size2);
                                                i6 = C32211fp.A04(certPath2, size2, C32211fp.A03(certPath2, size2, i6));
                                                C32211fp.A0E(certPath2, size2);
                                                Set criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
                                                C32211fp.A0F(certPath2, certPathCheckers, criticalExtensionOIDs != null ? AnonymousClass3K2.A0r(criticalExtensionOIDs) : C13680ns.A0o(), size2);
                                                r26 = C90554eM.A03(x509Certificate);
                                                try {
                                                    publicKey = C90924f5.A00(certPath2.getCertificates(), this.A00, size2);
                                                    C90924f5.A0A(publicKey);
                                                    trustedCert = x509Certificate;
                                                } catch (CertPathValidatorException e3) {
                                                    throw new CertPathValidatorException("Next working key could not be retrieved.", e3, certPath2, size2);
                                                }
                                            } else if (i7 != 1 || !x509Certificate.equals(A012.getTrustedCert())) {
                                                throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", (Throwable) null, certPath2, size2);
                                            }
                                        }
                                        size2--;
                                    } else {
                                        throw new AnonymousClass5BS("No valid policy tree found when one expected.", (Throwable) null, certPath2, size2);
                                    }
                                } catch (C803243k e4) {
                                    throw new CertPathValidatorException(e4.getMessage(), e4._underlyingException, certPath2, size2);
                                }
                            }
                            if (!x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN()) && i4 != 0) {
                                i4--;
                            }
                            int i8 = size2 + 1;
                            int A05 = C32211fp.A05(certPath2, i8, i4);
                            Set criticalExtensionOIDs2 = x509Certificate.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs2 != null) {
                                A0o = AnonymousClass3K2.A0r(criticalExtensionOIDs2);
                                A0o.remove(C32211fp.A04);
                                A0o.remove(AnonymousClass5IH.A0E.A01);
                            } else {
                                A0o = C13680ns.A0o();
                            }
                            C32211fp.A0G(certPath2, certPathCheckers, A0o, i8);
                            AnonymousClass3IS A06 = C32211fp.A06(certPath2, initialPolicies, A0o3, r43, r22, arrayListArr, i8);
                            if (A05 > 0 || A06 != null) {
                                return new PKIXCertPathValidatorResult(A012, A06, x509Certificate.getPublicKey());
                            }
                            throw new CertPathValidatorException("Path processing failed on policy.", (Throwable) null, certPath2, size2);
                        } catch (CertPathValidatorException e5) {
                            throw new AnonymousClass5BS("Algorithm identifier of public key of trust anchor could not be read.", e5, certPath2, -1);
                        }
                    } else {
                        throw new CertPathValidatorException("Trust anchor for certification path not found.", (Throwable) null, certPath2, -1);
                    }
                } catch (C803243k e6) {
                    throw new CertPathValidatorException(e6.getMessage(), e6._underlyingException, certPath2, certificates.size() - 1);
                }
            } else {
                throw new CertPathValidatorException("Certification path is empty.", (Throwable) null, certPath2, -1);
            }
        } else {
            throw AnonymousClass3K4.A0d("trustAnchors is null, this is not allowed for certification path validation.");
        }
    }
}

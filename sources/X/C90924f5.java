package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.text.ParseException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.4f5  reason: invalid class name and case insensitive filesystem */
public class C90924f5 {
    public static final String A00 = AnonymousClass5IH.A05.A01;
    public static final String A01 = AnonymousClass5IH.A09.A01;
    public static final String A02 = AnonymousClass5IH.A0K.A01;

    public static PublicKey A00(List list, AnonymousClass5NQ r5, int i2) {
        DSAPublicKey dSAPublicKey;
        PublicKey publicKey = ((Certificate) list.get(i2)).getPublicKey();
        if (!(publicKey instanceof DSAPublicKey)) {
            return publicKey;
        }
        DSAPublicKey dSAPublicKey2 = (DSAPublicKey) publicKey;
        if (dSAPublicKey2.getParams() != null) {
            return dSAPublicKey2;
        }
        do {
            i2++;
            if (i2 < list.size()) {
                PublicKey publicKey2 = ((Certificate) list.get(i2)).getPublicKey();
                if (publicKey2 instanceof DSAPublicKey) {
                    dSAPublicKey = (DSAPublicKey) publicKey2;
                } else {
                    throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
                }
            } else {
                throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
        } while (dSAPublicKey.getParams() == null);
        DSAParams params = dSAPublicKey.getParams();
        try {
            return KeyFactory.getInstance("DSA", ((AnonymousClass5AA) r5).A00).generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params.getP(), params.getQ(), params.getG()));
        } catch (Exception e2) {
            throw AnonymousClass000.A0a(e2.getMessage());
        }
    }

    public static TrustAnchor A01(String str, X509Certificate x509Certificate, Set set) {
        X509CertSelector x509CertSelector = new X509CertSelector();
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        x509CertSelector.setSubject(issuerX500Principal);
        Iterator it = set.iterator();
        TrustAnchor trustAnchor = null;
        Exception e2 = null;
        AnonymousClass5IQ r6 = null;
        PublicKey publicKey = null;
        while (it.hasNext() && trustAnchor == null) {
            trustAnchor = (TrustAnchor) it.next();
            if (trustAnchor.getTrustedCert() != null) {
                if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                    publicKey = trustAnchor.getTrustedCert().getPublicKey();
                }
                trustAnchor = null;
            } else {
                if (!(trustAnchor.getCA() == null || trustAnchor.getCAName() == null || trustAnchor.getCAPublicKey() == null)) {
                    if (r6 == null) {
                        r6 = AnonymousClass5IQ.A01(issuerX500Principal.getEncoded());
                    }
                    try {
                        if (r6.equals(AnonymousClass5IQ.A01(trustAnchor.getCA().getEncoded()))) {
                            publicKey = trustAnchor.getCAPublicKey();
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                trustAnchor = null;
            }
            if (publicKey != null) {
                if (str == null) {
                    try {
                        x509Certificate.verify(publicKey);
                    } catch (Exception e3) {
                        e2 = e3;
                        trustAnchor = null;
                        publicKey = null;
                    }
                } else {
                    x509Certificate.verify(publicKey, str);
                }
            }
        }
        if (trustAnchor != null || e2 == null) {
            return trustAnchor;
        }
        throw C803243k.A00("TrustAnchor found but certificate validation failed.", e2);
    }

    public static Collection A02(X509Certificate x509Certificate, List list, List list2) {
        String str;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(C90554eM.A02(x509Certificate).A01());
            try {
                byte[] extensionValue = x509Certificate.getExtensionValue(A00);
                if (extensionValue != null) {
                    byte[] bArr = C107405Ib.A01(extensionValue).A00;
                    C107405Ib r0 = (bArr instanceof AnonymousClass5Hr ? (AnonymousClass5Hr) bArr : bArr != null ? new AnonymousClass5Hr(C32411gJ.A00(bArr)) : null).A01;
                    byte[] bArr2 = r0 != null ? r0.A00 : null;
                    if (bArr2 != null) {
                        x509CertSelector.setSubjectKeyIdentifier(new AnonymousClass5IT(bArr2).A01());
                    }
                }
            } catch (Exception unused) {
            }
            AnonymousClass5AH r1 = new AnonymousClass5AH((CertSelector) x509CertSelector.clone());
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                A0B(linkedHashSet, list, r1);
                A0B(linkedHashSet, list2, r1);
                return linkedHashSet;
            } catch (C803243k e2) {
                e = e2;
                str = "Issuer certificate cannot be searched.";
                throw C803243k.A00(str, e);
            }
        } catch (Exception e3) {
            e = e3;
            str = "Subject criteria for certificate selector to find issuer certificate could not be set.";
            throw C803243k.A00(str, e);
        }
    }

    public static Collection A03(C1047056o r3) {
        C1047156p r32 = r3.A02;
        AnonymousClass5AH r2 = r32.A09;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            A0B(linkedHashSet, r32.A05, r2);
            A0B(linkedHashSet, r32.A01.getCertStores(), r2);
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
            CertSelector certSelector = r2.A00;
            X509Certificate certificate = certSelector instanceof X509CertSelector ? ((X509CertSelector) certSelector).getCertificate() : null;
            if (certificate != null) {
                return Collections.singleton(certificate);
            }
            throw new CertPathBuilderException("No certificate found matching targetConstraints.");
        } catch (C803243k e2) {
            throw new AnonymousClass5BO(e2);
        }
    }

    public static Date A04(CertPath certPath, Date date, int i2, int i3) {
        if (1 != i2 || i3 <= 0) {
            return date;
        }
        int i4 = i3 - 1;
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i4);
        if (i4 == 0) {
            C107395Ia r2 = null;
            try {
                byte[] extensionValue = ((X509Certificate) certPath.getCertificates().get(i4)).getExtensionValue(C109665Tc.A07.A01);
                if (extensionValue != null) {
                    r2 = C107395Ia.A01(C32051fZ.A02(extensionValue));
                }
                if (r2 != null) {
                    try {
                        return r2.A0C();
                    } catch (ParseException e2) {
                        throw C803243k.A00("Date from date of cert gen extension could not be parsed.", e2);
                    }
                }
            } catch (IOException | IllegalArgumentException unused) {
                throw C803243k.A00("Date of cert gen extension could not be read.", (Throwable) null);
            }
        }
        return x509Certificate.getNotBefore();
    }

    public static Set A05(X509CRL x509crl, Date date, List list, List list2, AnonymousClass5NQ r13) {
        String str;
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            x509CRLSelector.addIssuerName(C90554eM.A01(x509crl).A01());
            try {
                C32051fZ A07 = A07(A01, x509crl);
                BigInteger bigInteger = null;
                BigInteger bigInteger2 = A07 != null ? new BigInteger(1, C33041hq.A00(A07).A01) : null;
                try {
                    byte[] extensionValue = x509crl.getExtensionValue(A02);
                    if (bigInteger2 != null) {
                        bigInteger = bigInteger2.add(BigInteger.valueOf(1));
                    }
                    x509CRLSelector.setMinCRLNumber(bigInteger);
                    AnonymousClass4NZ r1 = new AnonymousClass4NZ(x509CRLSelector);
                    r1.A03 = C33111hx.A02(extensionValue);
                    r1.A02 = true;
                    r1.A00 = bigInteger2;
                    AnonymousClass5AI r5 = new AnonymousClass5AI(r1);
                    Set<X509CRL> A002 = AnonymousClass4YB.A00(date, list, list2, r5);
                    if (A002.isEmpty() && C89714cm.A01("org.spongycastle.x509.enableCRLDP")) {
                        try {
                            CertificateFactory instance = CertificateFactory.getInstance("X.509", ((AnonymousClass5AA) r13).A00);
                            AnonymousClass5IE[] A03 = AnonymousClass5I6.A00(extensionValue).A03();
                            for (int i2 = 0; i2 < A03.length; i2++) {
                                AnonymousClass5IN r12 = A03[i2].A00;
                                if (r12 != null && r12.A00 == 0) {
                                    AnonymousClass5IP[] A032 = AnonymousClass5IG.A00(r12.A01).A03();
                                    int i3 = 0;
                                    while (i3 < A032.length) {
                                        AnonymousClass5IP r2 = A032[i2];
                                        if (r2.A00 == 6) {
                                            try {
                                                A002 = AnonymousClass4YB.A00(date, Collections.EMPTY_LIST, Collections.singletonList(C90354e0.A01(new URI(((C33031hp) r2.A01).AGJ()), instance, date)), r5);
                                                break;
                                            } catch (Exception unused) {
                                                continue;
                                            }
                                        } else {
                                            i3++;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            throw C803243k.A00(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("cannot create certificate factory: ")), e2);
                        }
                    }
                    HashSet A0o = C13680ns.A0o();
                    for (X509CRL x509crl2 : A002) {
                        Set criticalExtensionOIDs = x509crl2.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs == null ? false : criticalExtensionOIDs.contains(C32211fp.A05)) {
                            A0o.add(x509crl2);
                        }
                    }
                    return A0o;
                } catch (Exception e3) {
                    e = e3;
                    str = "Issuing distribution point extension value could not be read.";
                    throw C803243k.A00(str, e);
                }
            } catch (Exception e4) {
                e = e4;
                str = "CRL number extension could not be extracted from CRL.";
                throw C803243k.A00(str, e);
            }
        } catch (IOException e5) {
            e = e5;
            str = "Cannot extract issuer from CRL.";
            throw C803243k.A00(str, e);
        }
    }

    public static final Set A06(C32411gJ r6) {
        HashSet A0o = C13680ns.A0o();
        if (r6 != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C33061hs r3 = new C33061hs(byteArrayOutputStream);
            Enumeration A0B = r6.A0B();
            while (A0B.hasMoreElements()) {
                try {
                    C32071fb r0 = (C32071fb) A0B.nextElement();
                    if (r0 != null) {
                        r3.A04(r0.Agm(), true);
                        A0o.add(new PolicyQualifierInfo(byteArrayOutputStream.toByteArray()));
                        byteArrayOutputStream.reset();
                    } else {
                        throw AnonymousClass3K3.A0e("null object detected");
                    }
                } catch (IOException e2) {
                    throw new AnonymousClass5BS("Policy qualifier info cannot be decoded.", e2);
                }
            }
        }
        return A0o;
    }

    public static C32051fZ A07(String str, X509Extension x509Extension) {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        try {
            return C32051fZ.A02(C107405Ib.A01(extensionValue).A00);
        } catch (Exception e2) {
            throw C803243k.A00(AnonymousClass000.A0h(str, AnonymousClass000.A0r("exception processing extension ")), e2);
        }
    }

    public static AnonymousClass3IS A08(AnonymousClass3IS r3, AnonymousClass3IS r4, List[] listArr) {
        AnonymousClass3IS r0 = (AnonymousClass3IS) r4.getParent();
        if (r3 != null) {
            if (r0 == null) {
                for (int i2 = 0; i2 < listArr.length; i2++) {
                    listArr[i2] = AnonymousClass000.A0u();
                }
            } else {
                r0.A03.remove(r4);
                A0C(r4, listArr);
                return r3;
            }
        }
        return null;
    }

    public static void A09(Object obj, X509CRL x509crl, Date date, AnonymousClass4JF r8) {
        String str;
        X509CRLEntry x509CRLEntry;
        int i2;
        try {
            byte[] extensionValue = x509crl.getExtensionValue(AnonymousClass5IH.A0K.A01);
            if (extensionValue != null && AnonymousClass5IF.A00(C107405Ib.A01(extensionValue).A00).A03) {
                x509CRLEntry = x509crl.getRevokedCertificate(((X509Certificate) obj).getSerialNumber());
                if (x509CRLEntry != null) {
                    X500Principal certificateIssuer = x509CRLEntry.getCertificateIssuer();
                    if (certificateIssuer == null) {
                        certificateIssuer = x509crl.getIssuerX500Principal();
                    }
                    if (!C90554eM.A00(obj).equals(C90554eM.A04(certificateIssuer))) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (!C90554eM.A00(obj).equals(C90554eM.A04(x509crl.getIssuerX500Principal())) || (x509CRLEntry = x509crl.getRevokedCertificate(((X509Certificate) obj).getSerialNumber())) == null) {
                return;
            }
            if (x509CRLEntry.hasExtensions()) {
                if (!x509CRLEntry.hasUnsupportedCriticalExtension()) {
                    try {
                        AnonymousClass5IZ A002 = AnonymousClass5IZ.A00(A07(AnonymousClass5IH.A0T.A01, x509CRLEntry));
                        if (A002 != null) {
                            i2 = A002.A0A();
                            if (date.getTime() < x509CRLEntry.getRevocationDate().getTime() || i2 == 0 || i2 == 1 || i2 == 2 || i2 == 10) {
                                r8.A00 = i2;
                                r8.A01 = x509CRLEntry.getRevocationDate();
                            }
                            return;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str = "Reason code CRL entry extension could not be decoded.";
                        throw C803243k.A00(str, e);
                    }
                } else {
                    throw C803243k.A00("CRL entry has unsupported critical extensions.", (Throwable) null);
                }
            }
            i2 = 0;
            if (date.getTime() < x509CRLEntry.getRevocationDate().getTime()) {
            }
            r8.A00 = i2;
            r8.A01 = x509CRLEntry.getRevocationDate();
        } catch (Exception e3) {
            throw new AnonymousClass5BM(e3);
        } catch (CRLException e4) {
            e = e4;
            str = "Failed check for indirect CRL.";
            throw C803243k.A00(str, e);
        }
    }

    public static void A0A(PublicKey publicKey) {
        try {
            C107365Hx.A00(publicKey.getEncoded());
        } catch (Exception e2) {
            throw new AnonymousClass5BS("Subject public key cannot be decoded.", e2);
        }
    }

    public static void A0B(LinkedHashSet linkedHashSet, List list, AnonymousClass5AH r5) {
        for (Object next : list) {
            if (next instanceof AnonymousClass5R4) {
                try {
                    linkedHashSet.addAll(((AnonymousClass5R4) next).ADM(r5));
                } catch (AnonymousClass5AU e2) {
                    throw C803243k.A00("Problem while picking certificates from X.509 store.", e2);
                }
            } else {
                try {
                    linkedHashSet.addAll(((CertStore) next).getCertificates(new C105765Bc(r5)));
                } catch (CertStoreException e3) {
                    throw C803243k.A00("Problem while picking certificates from certificate store.", e3);
                }
            }
        }
    }

    public static void A0C(AnonymousClass3IS r1, List[] listArr) {
        listArr[r1.getDepth()].remove(r1);
        if (!r1.A03.isEmpty()) {
            Iterator children = r1.getChildren();
            while (children.hasNext()) {
                A0C((AnonymousClass3IS) children.next(), listArr);
            }
        }
    }
}

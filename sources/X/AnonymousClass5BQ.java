package X;

import java.security.InvalidParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathChecker;
import java.security.cert.CertPathParameters;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.spongycastle.jcajce.provider.asymmetric.x509.CertificateFactory;

/* renamed from: X.5BQ  reason: invalid class name */
public class AnonymousClass5BQ extends CertPathBuilderSpi {
    public Exception A00;
    public final AnonymousClass5NQ A01;
    public final boolean A02;

    public AnonymousClass5BQ() {
        this(false);
    }

    public AnonymousClass5BQ(boolean z2) {
        this.A01 = new AnonymousClass5AA();
        this.A02 = true;
    }

    public CertPathBuilderResult A00(X509Certificate x509Certificate, List list, C1047056o r11) {
        int i2;
        C803243k r0;
        Collection A0u;
        CertPathBuilderResult certPathBuilderResult = null;
        if (!list.contains(x509Certificate) && !r11.A01.contains(x509Certificate) && ((i2 = r11.A00) == -1 || list.size() - 1 <= i2)) {
            list.add(x509Certificate);
            try {
                CertificateFactory certificateFactory = new CertificateFactory();
                AnonymousClass5BU r7 = new AnonymousClass5BU(this.A02);
                C1047156p r4 = r11.A02;
                Set set = r4.A08;
                PKIXParameters pKIXParameters = r4.A01;
                boolean z2 = false;
                try {
                    if (C90924f5.A01(pKIXParameters.getSigProvider(), x509Certificate, set) != null) {
                        z2 = true;
                    }
                } catch (Exception unused) {
                }
                if (z2) {
                    try {
                        CertPath engineGenerateCertPath = certificateFactory.engineGenerateCertPath(list);
                        try {
                            PKIXCertPathValidatorResult pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult) r7.engineValidate(engineGenerateCertPath, r11);
                            return new PKIXCertPathBuilderResult(engineGenerateCertPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
                        } catch (Exception e2) {
                            r0 = C803243k.A00("Certification path could not be validated.", e2);
                            throw r0;
                        }
                    } catch (Exception e3) {
                        r0 = C803243k.A00("Certification path could not be constructed from certificate list.", e3);
                        throw r0;
                    }
                } else {
                    ArrayList A0u2 = AnonymousClass000.A0u();
                    A0u2.addAll(r4.A05);
                    try {
                        byte[] extensionValue = x509Certificate.getExtensionValue(AnonymousClass5IH.A0J.A01);
                        Map map = r4.A07;
                        if (extensionValue == null) {
                            A0u = Collections.EMPTY_LIST;
                        } else {
                            AnonymousClass5IP[] A03 = AnonymousClass5IG.A00(C107405Ib.A01(extensionValue).A00).A03();
                            A0u = AnonymousClass000.A0u();
                            for (int i3 = 0; i3 != A03.length; i3++) {
                                map.get(A03[i3]);
                            }
                        }
                        A0u2.addAll(A0u);
                        HashSet A0o = C13680ns.A0o();
                        try {
                            A0o.addAll(C90924f5.A02(x509Certificate, pKIXParameters.getCertStores(), A0u2));
                            if (!A0o.isEmpty()) {
                                Iterator it = A0o.iterator();
                                while (it.hasNext() && certPathBuilderResult == null) {
                                    certPathBuilderResult = A00((X509Certificate) it.next(), list, r11);
                                }
                                if (certPathBuilderResult == null) {
                                    list.remove(x509Certificate);
                                    return certPathBuilderResult;
                                }
                            } else {
                                throw C803243k.A00("No issuer certificate for certificate in certification path found.", (Throwable) null);
                            }
                        } catch (C803243k e4) {
                            r0 = C803243k.A00("Cannot find issuer certificate for certificate in certification path.", e4);
                            throw r0;
                        }
                    } catch (CertificateParsingException e5) {
                        r0 = C803243k.A00("No additional X.509 stores can be added from certificate locations.", e5);
                        throw r0;
                    }
                }
            } catch (Exception unused2) {
                throw AnonymousClass000.A0a("Exception creating support classes.");
            } catch (C803243k e6) {
                this.A00 = e6;
            }
        }
        return certPathBuilderResult;
    }

    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) {
        C1047056o r5;
        C88054Zs r2;
        if (certPathParameters instanceof PKIXBuilderParameters) {
            PKIXBuilderParameters pKIXBuilderParameters = (PKIXBuilderParameters) certPathParameters;
            C88434aU r3 = new C88434aU((PKIXParameters) pKIXBuilderParameters);
            if (certPathParameters instanceof AnonymousClass5BX) {
                AnonymousClass5Kq r52 = (AnonymousClass5Kq) certPathParameters;
                Iterator it = Collections.unmodifiableList(r52.A01).iterator();
                while (it.hasNext()) {
                    it.next();
                    r3.A02.add((Object) null);
                }
                r2 = new C88054Zs(new C1047156p(r3));
                r2.A01.addAll(Collections.unmodifiableSet(r52.A01));
                int i2 = r52.A00;
                if (i2 >= -1) {
                    r2.A00 = i2;
                } else {
                    throw new InvalidParameterException("The maximum path length parameter can not be less than -1.");
                }
            } else {
                r2 = new C88054Zs(pKIXBuilderParameters);
            }
            r5 = new C1047056o(r2);
        } else if (certPathParameters instanceof C1047056o) {
            r5 = (C1047056o) certPathParameters;
        } else {
            StringBuilder A0r = AnonymousClass000.A0r("Parameters must be an instance of ");
            AnonymousClass3K4.A0v(PKIXBuilderParameters.class, A0r);
            A0r.append(" or ");
            AnonymousClass3K4.A0v(C1047056o.class, A0r);
            throw AnonymousClass3K4.A0d(AnonymousClass000.A0h(".", A0r));
        }
        ArrayList A0u = AnonymousClass000.A0u();
        CertPathBuilderResult certPathBuilderResult = null;
        Iterator it2 = C90924f5.A03(r5).iterator();
        while (true) {
            if (it2.hasNext()) {
                if (certPathBuilderResult != null) {
                    break;
                }
                certPathBuilderResult = A00((X509Certificate) it2.next(), A0u, r5);
            } else if (certPathBuilderResult == null) {
                Exception exc = this.A00;
                if (exc == null) {
                    throw new CertPathBuilderException("Unable to find certificate chain.");
                } else if (exc instanceof C803243k) {
                    throw new CertPathBuilderException(exc.getMessage(), this.A00.getCause());
                } else {
                    throw new CertPathBuilderException("Possible certificate chain could not be validated.", exc);
                }
            }
        }
        return certPathBuilderResult;
    }

    public /* bridge */ /* synthetic */ CertPathChecker engineGetRevocationChecker() {
        return new AnonymousClass5BY(this.A01);
    }
}

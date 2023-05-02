package org.spongycastle.jcajce.provider.asymmetric.x509;

import X.AnonymousClass000;
import X.AnonymousClass48F;
import X.AnonymousClass5AA;
import X.AnonymousClass5BN;
import X.AnonymousClass5BV;
import X.AnonymousClass5Hs;
import X.AnonymousClass5I2;
import X.AnonymousClass5IS;
import X.AnonymousClass5NQ;
import X.C107525In;
import X.C107595Iu;
import X.C107665Jb;
import X.C107685Jd;
import X.C32031fX;
import X.C32041fY;
import X.C32071fb;
import X.C32411gJ;
import X.C33011hn;
import X.C88504ac;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CertificateFactory extends CertificateFactorySpi {
    public static final C88504ac A07 = new C88504ac("CERTIFICATE");
    public static final C88504ac A08 = new C88504ac("CRL");
    public static final C88504ac A09 = new C88504ac("PKCS7");
    public int A00 = 0;
    public int A01 = 0;
    public InputStream A02 = null;
    public InputStream A03 = null;
    public C107595Iu A04 = null;
    public C107595Iu A05 = null;
    public final AnonymousClass5NQ A06 = new AnonymousClass5AA();

    public final CRL A00() {
        C107595Iu r0 = this.A04;
        if (r0 == null) {
            return null;
        }
        int i2 = this.A00;
        C32071fb[] r1 = r0.A01;
        if (i2 >= r1.length) {
            return null;
        }
        this.A00 = i2 + 1;
        C32071fb r12 = r1[i2];
        return new C107665Jb(r12 instanceof AnonymousClass5Hs ? (AnonymousClass5Hs) r12 : r12 != null ? new AnonymousClass5Hs(C32411gJ.A00(r12)) : null, this.A06);
    }

    public final CRL A01(C32411gJ r4) {
        if (r4 == null) {
            return null;
        }
        if (r4.A0A() <= 1 || !(r4.A0C(0) instanceof C32041fY) || !r4.A0C(0).equals(C32031fX.A2K)) {
            return new C107665Jb(new AnonymousClass5Hs(C32411gJ.A00(r4)), this.A06);
        }
        C32411gJ A012 = C32411gJ.A01((C107525In) r4.A0C(1), true);
        this.A04 = (A012 != null ? new AnonymousClass5IS(C32411gJ.A00(A012)) : null).A02;
        return A00();
    }

    public final Certificate A02() {
        C32071fb r1;
        C107595Iu r3 = this.A05;
        if (r3 == null) {
            return null;
        }
        do {
            int i2 = this.A01;
            C32071fb[] r12 = r3.A01;
            if (i2 >= r12.length) {
                return null;
            }
            this.A01 = i2 + 1;
            r1 = r12[i2];
        } while (!(r1 instanceof C32411gJ));
        return new C107685Jd(AnonymousClass5I2.A00(r1), this.A06);
    }

    public final Certificate A03(C32411gJ r4) {
        if (r4 == null) {
            return null;
        }
        if (r4.A0A() <= 1 || !(r4.A0C(0) instanceof C32041fY) || !r4.A0C(0).equals(C32031fX.A2K)) {
            return new C107685Jd(AnonymousClass5I2.A00(r4), this.A06);
        }
        C32411gJ A012 = C32411gJ.A01((C107525In) r4.A0C(1), true);
        this.A05 = (A012 != null ? new AnonymousClass5IS(C32411gJ.A00(A012)) : null).A01;
        return A02();
    }

    public CRL engineGenerateCRL(InputStream inputStream) {
        InputStream inputStream2 = this.A02;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.A02 = inputStream;
            this.A04 = null;
            this.A00 = 0;
        }
        try {
            C107595Iu r0 = this.A04;
            if (r0 == null) {
                if (!inputStream.markSupported()) {
                    inputStream = new ByteArrayInputStream(AnonymousClass48F.A00(inputStream));
                }
                inputStream.mark(1);
                int read = inputStream.read();
                if (read == -1) {
                    return null;
                }
                inputStream.reset();
                return read != 48 ? A01(A08.A01(inputStream)) : A01(C32411gJ.A00(new C33011hn(inputStream, true).A05()));
            } else if (this.A00 != r0.A01.length) {
                return A00();
            } else {
                this.A04 = null;
                this.A00 = 0;
                return null;
            }
        } catch (CRLException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new CRLException(e3.toString());
        }
    }

    public Collection engineGenerateCRLs(InputStream inputStream) {
        ArrayList A0u = AnonymousClass000.A0u();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            CRL engineGenerateCRL = engineGenerateCRL(bufferedInputStream);
            if (engineGenerateCRL == null) {
                return A0u;
            }
            A0u.add(engineGenerateCRL);
        }
    }

    public CertPath engineGenerateCertPath(InputStream inputStream) {
        return new AnonymousClass5BN(inputStream, "PkiPath");
    }

    public CertPath engineGenerateCertPath(InputStream inputStream, String str) {
        return new AnonymousClass5BN(inputStream, str);
    }

    public CertPath engineGenerateCertPath(List list) {
        for (Object next : list) {
            if (next != null && !(next instanceof X509Certificate)) {
                throw new CertificateException(AnonymousClass000.A0h(next.toString(), AnonymousClass000.A0r("list contains non X509Certificate object while creating CertPath\n")));
            }
        }
        return new AnonymousClass5BN(list);
    }

    public Certificate engineGenerateCertificate(InputStream inputStream) {
        InputStream inputStream2 = this.A03;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.A03 = inputStream;
            this.A05 = null;
            this.A01 = 0;
        }
        try {
            C107595Iu r0 = this.A05;
            if (r0 == null) {
                if (!inputStream.markSupported()) {
                    inputStream = new ByteArrayInputStream(AnonymousClass48F.A00(inputStream));
                }
                inputStream.mark(1);
                int read = inputStream.read();
                if (read == -1) {
                    return null;
                }
                inputStream.reset();
                return read != 48 ? A03(A07.A01(inputStream)) : A03(C32411gJ.A00(new C33011hn(inputStream).A05()));
            } else if (this.A01 != r0.A01.length) {
                return A02();
            } else {
                this.A05 = null;
                this.A01 = 0;
                return null;
            }
        } catch (Exception e2) {
            throw new AnonymousClass5BV(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("parsing issue: ")), e2, this);
        }
    }

    public Collection engineGenerateCertificates(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList A0u = AnonymousClass000.A0u();
        while (true) {
            Certificate engineGenerateCertificate = engineGenerateCertificate(bufferedInputStream);
            if (engineGenerateCertificate == null) {
                return A0u;
            }
            A0u.add(engineGenerateCertificate);
        }
    }

    public Iterator engineGetCertPathEncodings() {
        return AnonymousClass5BN.A00.iterator();
    }
}

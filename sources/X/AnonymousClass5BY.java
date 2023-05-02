package X;

import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5BY  reason: invalid class name */
public class AnonymousClass5BY extends PKIXRevocationChecker implements AnonymousClass5SG {
    public static final Map A04;
    public C85284Nv A00;
    public final AnonymousClass5NQ A01;
    public final AnonymousClass5A6 A02;
    public final AnonymousClass5A7 A03;

    static {
        HashMap A0x = AnonymousClass000.A0x();
        A04 = A0x;
        A0x.put(AnonymousClass3K3.A0w("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        A0x.put(C32031fX.A2D, "SHA224WITHRSA");
        A0x.put(C32031fX.A2E, "SHA256WITHRSA");
        AnonymousClass3K2.A1O(C32031fX.A2F, A0x);
        AnonymousClass3K2.A1P(C32111ff.A0G, A0x);
    }

    public AnonymousClass5BY(AnonymousClass5NQ r2) {
        this.A01 = r2;
        this.A02 = new AnonymousClass5A6(r2);
        this.A03 = new AnonymousClass5A7(r2, this);
    }

    public void AIJ(C85284Nv r2) {
        this.A00 = r2;
        this.A02.AIJ(r2);
        this.A03.AIJ(r2);
    }

    public void check(Certificate certificate, Collection collection) {
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (!getOptions().contains(PKIXRevocationChecker.Option.ONLY_END_ENTITY) || x509Certificate.getBasicConstraints() == -1) {
            if (getOptions().contains(PKIXRevocationChecker.Option.PREFER_CRLS)) {
                try {
                    this.A02.check(certificate);
                } catch (AnonymousClass5BR e2) {
                    e = e2;
                    if (!getOptions().contains(PKIXRevocationChecker.Option.NO_FALLBACK)) {
                        this.A03.check(certificate);
                        return;
                    }
                    throw e;
                }
            } else {
                try {
                    this.A03.check(certificate);
                } catch (AnonymousClass5BR e3) {
                    e = e3;
                    if (!getOptions().contains(PKIXRevocationChecker.Option.NO_FALLBACK)) {
                        this.A02.check(certificate);
                        return;
                    }
                    throw e;
                }
            }
        }
    }

    public List getSoftFailExceptions() {
        return null;
    }

    public Set getSupportedExtensions() {
        return null;
    }

    public void init(boolean z2) {
        this.A00 = null;
        AnonymousClass5A6 r1 = this.A02;
        if (!z2) {
            r1.A01 = null;
            r1.A00 = new Date();
            AnonymousClass5A7 r12 = this.A03;
            r12.A01 = null;
            r12.A02 = C89714cm.A01("ocsp.enable");
            r12.A00 = C89714cm.A00("ocsp.responderURL");
            return;
        }
        throw new CertPathValidatorException("forward checking not supported");
    }

    public boolean isForwardCheckingSupported() {
        return false;
    }
}

package X;

import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;

/* renamed from: X.5A5  reason: invalid class name */
public class AnonymousClass5A5 implements AnonymousClass5SG {
    public final PKIXCertPathChecker A00;

    public AnonymousClass5A5(PKIXCertPathChecker pKIXCertPathChecker) {
        this.A00 = pKIXCertPathChecker;
    }

    public void AIJ(C85284Nv r3) {
        this.A00.init(false);
    }

    public void check(Certificate certificate) {
        this.A00.check(certificate);
    }
}

package X;

import java.security.cert.CRLException;

/* renamed from: X.5BM  reason: invalid class name */
public class AnonymousClass5BM extends CRLException {
    public Throwable cause;

    public AnonymousClass5BM(Throwable th) {
        super("Exception reading IssuingDistributionPoint");
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}

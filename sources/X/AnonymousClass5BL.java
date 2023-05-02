package X;

import java.security.cert.CRLException;

/* renamed from: X.5BL  reason: invalid class name */
public class AnonymousClass5BL extends CRLException {
    public Throwable cause;

    public AnonymousClass5BL(Throwable th) {
        super("Exception reading IssuingDistributionPoint");
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}

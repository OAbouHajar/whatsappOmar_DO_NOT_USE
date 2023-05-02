package X;

import java.security.cert.CertPathBuilderException;

/* renamed from: X.5BO  reason: invalid class name */
public class AnonymousClass5BO extends CertPathBuilderException {
    public Throwable cause;

    public AnonymousClass5BO(Throwable th) {
        super("Error finding target certificate.");
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}

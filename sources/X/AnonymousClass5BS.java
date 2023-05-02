package X;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;

/* renamed from: X.5BS  reason: invalid class name */
public class AnonymousClass5BS extends CertPathValidatorException {
    public Throwable cause;

    public AnonymousClass5BS() {
        super("OCSP response expired");
    }

    public AnonymousClass5BS(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public AnonymousClass5BS(String str, Throwable th, CertPath certPath, int i2) {
        super(str, th, certPath, i2);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}

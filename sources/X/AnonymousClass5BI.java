package X;

import java.security.InvalidKeyException;

/* renamed from: X.5BI  reason: invalid class name */
public class AnonymousClass5BI extends InvalidKeyException {
    public final Throwable cause;

    public AnonymousClass5BI(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}

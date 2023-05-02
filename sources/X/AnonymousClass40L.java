package X;

import java.io.IOException;

/* renamed from: X.40L  reason: invalid class name */
public class AnonymousClass40L extends IOException {
    public Throwable cause;

    public AnonymousClass40L(String str) {
        super(str);
    }

    public AnonymousClass40L(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}

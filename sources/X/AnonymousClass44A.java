package X;

/* renamed from: X.44A  reason: invalid class name */
public class AnonymousClass44A extends IllegalStateException {
    public Throwable cause;

    public AnonymousClass44A(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}

package X;

/* renamed from: X.44B  reason: invalid class name */
public class AnonymousClass44B extends IllegalStateException {
    public Throwable cause;

    public AnonymousClass44B(String str) {
        super(str);
    }

    public AnonymousClass44B(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}

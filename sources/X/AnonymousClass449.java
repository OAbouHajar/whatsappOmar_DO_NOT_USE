package X;

/* renamed from: X.449  reason: invalid class name */
public class AnonymousClass449 extends IllegalStateException {
    public Throwable cause;

    public AnonymousClass449(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}

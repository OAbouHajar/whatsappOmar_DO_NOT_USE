package X;

/* renamed from: X.5Ap  reason: invalid class name */
public class AnonymousClass5Ap extends RuntimeException {
    public final Throwable nested;

    public AnonymousClass5Ap() {
        super("best");
        this.nested = null;
    }

    public AnonymousClass5Ap(Throwable th) {
        this.nested = th;
    }
}

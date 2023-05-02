package X;

/* renamed from: X.5BA  reason: invalid class name */
public class AnonymousClass5BA extends Throwable {
    public AnonymousClass5BA() {
        super("Failure occurred while trying to finish a future.");
    }

    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}

package X;

/* renamed from: X.25H  reason: invalid class name */
public class AnonymousClass25H extends Exception {
    public AnonymousClass25H(Throwable th) {
        super(th.getClass().getName());
        setStackTrace(th.getStackTrace());
    }
}

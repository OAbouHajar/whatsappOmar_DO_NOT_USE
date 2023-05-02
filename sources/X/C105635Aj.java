package X;

/* renamed from: X.5Aj  reason: invalid class name and case insensitive filesystem */
public final class C105635Aj extends RuntimeException {
    public final AnonymousClass1UM context;

    public C105635Aj(AnonymousClass1UM r1) {
        this.context = r1;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public String getLocalizedMessage() {
        return this.context.toString();
    }
}

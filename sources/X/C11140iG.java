package X;

/* renamed from: X.0iG  reason: invalid class name and case insensitive filesystem */
public final class C11140iG extends RuntimeException {
    public final AnonymousClass0K3 callbackName;
    public final Throwable cause;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11140iG(AnonymousClass0K3 r2, Throwable th) {
        super(th);
        C18450wi.A0H(r2, 1);
        this.callbackName = r2;
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}

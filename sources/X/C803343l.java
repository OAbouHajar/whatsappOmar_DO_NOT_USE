package X;

/* renamed from: X.43l  reason: invalid class name and case insensitive filesystem */
public class C803343l extends Exception {
    public Throwable cause;

    public C803343l(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}

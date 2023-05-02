package X;

/* renamed from: X.43k  reason: invalid class name and case insensitive filesystem */
public class C803243k extends Exception {
    public Throwable _underlyingException;

    public C803243k(String str, Throwable th) {
        super(str);
        this._underlyingException = th;
    }

    public static C803243k A00(String str, Throwable th) {
        return new C803243k(str, th);
    }

    public Throwable getCause() {
        return this._underlyingException;
    }
}

package X;

/* renamed from: X.1ai  reason: invalid class name and case insensitive filesystem */
public class C29491ai extends RuntimeException {
    public C29491ai(String str) {
        super(str);
    }

    public C29491ai(String str, Throwable th) {
        super(str);
        setStackTrace(th.getStackTrace());
    }
}

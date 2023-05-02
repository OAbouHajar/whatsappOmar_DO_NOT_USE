package X;

/* renamed from: X.1da  reason: invalid class name and case insensitive filesystem */
public class C31141da extends C31151db {
    public final int retryAfter;

    public C31141da(String str, int i2) {
        super(str);
        this.retryAfter = i2;
    }

    public static C31141da A00(Throwable th) {
        return new C31141da(th.getMessage(), -1);
    }
}

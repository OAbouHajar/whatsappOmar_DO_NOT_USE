package X;

/* renamed from: X.43i  reason: invalid class name and case insensitive filesystem */
public class C803043i extends Exception {
    public final String message;

    public C803043i() {
        StringBuilder A0r = AnonymousClass000.A0r("Package ");
        A0r.append("com.facebook.stella");
        this.message = AnonymousClass000.A0h(" not authorized", A0r);
    }

    public String getMessage() {
        return this.message;
    }
}

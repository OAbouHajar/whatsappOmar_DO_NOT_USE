package X;

/* renamed from: X.43m  reason: invalid class name and case insensitive filesystem */
public class C803443m extends Exception {
    public C799541z errorType;
    public String message;

    public C803443m(C799541z r1, String str) {
        super(str);
        this.message = str;
        this.errorType = r1;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Error type: ");
        A0r.append(this.errorType);
        A0r.append(". ");
        return AnonymousClass000.A0h(this.message, A0r);
    }
}

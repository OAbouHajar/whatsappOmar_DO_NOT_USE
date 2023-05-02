package X;

/* renamed from: X.5p3  reason: invalid class name and case insensitive filesystem */
public class C115065p3 extends Exception {
    public final int errorCode;
    public final String errorMessage;

    public C115065p3(C114785ob r2) {
        super(r2.description);
        this.errorCode = r2.code;
        this.errorMessage = r2.description;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Error ");
        A0r.append(this.errorCode);
        A0r.append(" : ");
        return AnonymousClass000.A0h(this.errorMessage, A0r);
    }
}

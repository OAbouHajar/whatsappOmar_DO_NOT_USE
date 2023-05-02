package X;

/* renamed from: X.43t  reason: invalid class name and case insensitive filesystem */
public class C804143t extends Exception {
    public static final long serialVersionUID = 1;

    public C804143t(String str) {
        super(str);
    }

    public C804143t(Throwable th) {
        super("Invalid quoted-printable encoding", th);
    }
}

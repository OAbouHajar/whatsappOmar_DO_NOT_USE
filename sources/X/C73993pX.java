package X;

/* renamed from: X.3pX  reason: invalid class name and case insensitive filesystem */
public class C73993pX extends C86394Sn {
    public final String A00;

    public C73993pX(String str) {
        super(1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((C73993pX) obj).A00);
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        AnonymousClass000.A1K(A1Z, super.hashCode());
        return AnonymousClass3K2.A08(this.A00, A1Z);
    }
}

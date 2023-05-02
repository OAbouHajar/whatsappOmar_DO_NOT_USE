package X;

/* renamed from: X.3lT  reason: invalid class name and case insensitive filesystem */
public class C72043lT extends C31301dt {
    public final C34331k5 A00;
    public final String A01;

    public C72043lT(C34331k5 r2, String str) {
        super(AnonymousClass428.A0I);
        this.A00 = r2;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.A01;
        String str2 = ((C72043lT) obj).A01;
        if (str == null) {
            return str2 == null;
        }
        if (str.equals(str2)) {
            return true;
        }
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}

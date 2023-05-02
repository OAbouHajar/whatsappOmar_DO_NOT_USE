package X;

/* renamed from: X.3lU  reason: invalid class name and case insensitive filesystem */
public class C72053lU extends C31301dt {
    public final C109255Ri A00;
    public final String A01;

    public C72053lU(C109255Ri r2, String str) {
        super(AnonymousClass428.A0U);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A01.equals(((C72053lU) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }
}

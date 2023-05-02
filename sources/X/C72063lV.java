package X;

/* renamed from: X.3lV  reason: invalid class name and case insensitive filesystem */
public class C72063lV extends C31301dt {
    public AnonymousClass26B A00;
    public C34331k5 A01;

    public C72063lV(AnonymousClass26B r2, C34331k5 r3) {
        super(AnonymousClass428.A0X);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((C72063lV) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}

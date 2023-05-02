package X;

/* renamed from: X.3lY  reason: invalid class name and case insensitive filesystem */
public class C72093lY extends C31301dt {
    public final C34331k5 A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C72093lY(C34331k5 r2, String str, String str2, boolean z2) {
        super(AnonymousClass428.A0b);
        this.A02 = str;
        this.A00 = r2;
        this.A03 = z2;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            C72093lY r5 = (C72093lY) obj;
            if (!this.A01.equals(r5.A01) || !this.A02.equals(r5.A02) || this.A03 != r5.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.A01.hashCode();
    }
}

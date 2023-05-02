package X;

/* renamed from: X.3la  reason: invalid class name and case insensitive filesystem */
public class C72113la extends C31301dt {
    public final int A00;
    public final int A01;
    public final C34331k5 A02;
    public final String A03;
    public final String A04;

    public C72113la(C34331k5 r2, String str, String str2) {
        super(AnonymousClass428.A0V);
        this.A00 = C52602e7.A00(str);
        this.A01 = C52602e7.A01(str);
        this.A04 = str;
        this.A03 = str2;
        this.A02 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A04.equals(((C72113la) obj).A04);
    }

    public int hashCode() {
        return this.A04.hashCode();
    }
}

package X;

/* renamed from: X.3l5  reason: invalid class name and case insensitive filesystem */
public class C71813l5 extends C71823l6 {
    public final String A00;

    public C71813l5(C108645Ou r2, String str, int i2) {
        super(r2, C13680ns.A0a(), i2);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((C71813l5) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}

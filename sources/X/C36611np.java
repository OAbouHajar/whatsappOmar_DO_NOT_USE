package X;

/* renamed from: X.1np  reason: invalid class name and case insensitive filesystem */
public class C36611np {
    public final Object A00;
    public final Object A01;

    public C36611np(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C36611np)) {
            return false;
        }
        C36611np r3 = (C36611np) obj;
        Object obj2 = r3.A00;
        Object obj3 = this.A00;
        if (obj2 == null) {
            if (obj3 != null) {
                return false;
            }
        } else if (obj3 == null || !obj2.equals(obj3)) {
            return false;
        }
        Object obj4 = r3.A01;
        Object obj5 = this.A01;
        return obj4 == null ? obj5 == null : obj5 != null && obj4.equals(obj5);
    }

    public int hashCode() {
        return this.A00.hashCode() ^ this.A01.hashCode();
    }
}

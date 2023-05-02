package X;

/* renamed from: X.4UJ  reason: invalid class name */
public class AnonymousClass4UJ {
    public final int A00;
    public final C15830rv A01;
    public final Object A02;

    public AnonymousClass4UJ(C15830rv r1, Object obj, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = r1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass4UJ r5 = (AnonymousClass4UJ) obj;
            if (this.A00 == r5.A00) {
                Object obj2 = this.A02;
                Object obj3 = r5.A02;
                return obj2 != null ? obj2.equals(obj3) : obj3 == null;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.A00 * 31;
        Object obj = this.A02;
        return i2 + (obj != null ? obj.hashCode() : 0);
    }
}

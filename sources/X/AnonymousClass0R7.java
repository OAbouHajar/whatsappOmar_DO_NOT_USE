package X;

/* renamed from: X.0R7  reason: invalid class name */
public class AnonymousClass0R7 {
    public Object A00;
    public Object A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass01Q)) {
            return false;
        }
        AnonymousClass01Q r4 = (AnonymousClass01Q) obj;
        Object obj2 = r4.A00;
        Object obj3 = this.A00;
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        Object obj4 = r4.A01;
        Object obj5 = this.A01;
        return obj4 == obj5 || (obj4 != null && obj4.equals(obj5));
    }

    public int hashCode() {
        int i2 = 0;
        int A0C = AnonymousClass000.A0C(this.A00);
        Object obj = this.A01;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return A0C ^ i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Pair{");
        A0r.append(String.valueOf(this.A00));
        A0r.append(" ");
        A0r.append(String.valueOf(this.A01));
        return AnonymousClass000.A0h("}", A0r);
    }
}

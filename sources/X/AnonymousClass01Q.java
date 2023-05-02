package X;

/* renamed from: X.01Q  reason: invalid class name */
public class AnonymousClass01Q {
    public final Object A00;
    public final Object A01;

    public AnonymousClass01Q(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass01Q)) {
            return false;
        }
        AnonymousClass01Q r4 = (AnonymousClass01Q) obj;
        return AnonymousClass08I.A01(r4.A00, this.A00) && AnonymousClass08I.A01(r4.A01, this.A01);
    }

    public int hashCode() {
        Object obj = this.A00;
        int i2 = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.A01;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.A00);
        sb.append(" ");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }
}

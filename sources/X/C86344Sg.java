package X;

/* renamed from: X.4Sg  reason: invalid class name and case insensitive filesystem */
public class C86344Sg {
    public final Integer A00;

    public C86344Sg(Integer num) {
        this.A00 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((C86344Sg) obj).A00;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.intValue();
    }
}

package X;

/* renamed from: X.2kj  reason: invalid class name and case insensitive filesystem */
public class C55962kj extends AnonymousClass2UZ {
    public C55962kj(Object obj, int i2) {
        super(obj, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass2UZ r5 = (AnonymousClass2UZ) obj;
            if (this.A00 != r5.A00 || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[type: ");
        sb.append(this.A00);
        sb.append(", data: ");
        sb.append(this.A01);
        sb.append("]");
        return sb.toString();
    }
}

package X;

/* renamed from: X.1y8  reason: invalid class name */
public class AnonymousClass1y8 {
    public byte A00;
    public C15830rv A01;

    public AnonymousClass1y8(C15830rv r1, byte b2) {
        this.A01 = r1;
        this.A00 = b2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass1y8 r5 = (AnonymousClass1y8) obj;
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
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(" ");
        sb.append(this.A00);
        return sb.toString();
    }
}

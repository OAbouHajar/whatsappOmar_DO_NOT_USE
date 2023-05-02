package X;

/* renamed from: X.0o5  reason: invalid class name and case insensitive filesystem */
public final class C13790o5 {
    public final int A00;
    public final Class A01;

    public C13790o5(Class cls, int i2) {
        this.A01 = cls;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13790o5)) {
            return false;
        }
        C13790o5 r4 = (C13790o5) obj;
        return this.A01 == r4.A01 && this.A00 == r4.A00;
    }

    public int hashCode() {
        return ((((this.A01.hashCode() ^ 1000003) * 1000003) ^ this.A00) * 1000003) ^ 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.A01);
        sb.append(", type=");
        sb.append(this.A00 == 1 ? "required" : "set");
        sb.append(", direct=");
        sb.append(true);
        sb.append("}");
        return sb.toString();
    }
}

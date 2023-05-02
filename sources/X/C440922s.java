package X;

/* renamed from: X.22s  reason: invalid class name and case insensitive filesystem */
public final class C440922s extends C441022t {
    public static final C440922s A00 = new C440922s(1, 0);

    public C440922s(int i2, int i3) {
        super(i2, i3, 1);
    }

    public Integer A04() {
        return Integer.valueOf(this.A01);
    }

    public Integer A05() {
        return Integer.valueOf(this.A00);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C440922s)) {
            return false;
        }
        if (A03() && ((C441022t) obj).A03()) {
            return true;
        }
        C441022t r3 = (C441022t) obj;
        return this.A00 == r3.A00 && this.A01 == r3.A01;
    }

    public int hashCode() {
        if (A03()) {
            return -1;
        }
        return (this.A00 * 31) + this.A01;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append("..");
        sb.append(this.A01);
        return sb.toString();
    }
}

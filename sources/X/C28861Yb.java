package X;

/* renamed from: X.1Yb  reason: invalid class name and case insensitive filesystem */
public class C28861Yb {
    public final int A00;
    public final int A01;
    public final String A02;

    public C28861Yb(int i2, String str, int i3) {
        this.A02 = str;
        this.A01 = i2;
        this.A00 = i3;
    }

    public int A00() {
        return this.A00;
    }

    public int A01() {
        return this.A01;
    }

    public String A02() {
        return this.A02;
    }

    public String[] A03() {
        return new String[]{this.A02, String.valueOf(this.A01), String.valueOf(this.A00)};
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C28861Yb)) {
            return false;
        }
        C28861Yb r4 = (C28861Yb) obj;
        return this.A02.equals(r4.A02) && this.A01 == r4.A01 && this.A00 == r4.A00;
    }

    public int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass1ZW.A03(4, this.A02));
        sb.append(":");
        sb.append(this.A00);
        sb.append(":");
        sb.append(this.A01);
        return sb.toString();
    }
}

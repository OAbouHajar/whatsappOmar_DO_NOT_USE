package X;

/* renamed from: X.1XN  reason: invalid class name */
public class AnonymousClass1XN {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public AnonymousClass1XN(int i2, int i3, int i4, int i5) {
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A01 = i5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{maxKb=");
        sb.append(this.A02);
        sb.append(", quality=");
        sb.append(this.A03);
        sb.append(", maxEdge=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}

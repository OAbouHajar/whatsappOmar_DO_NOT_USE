package X;

/* renamed from: X.1zQ  reason: invalid class name and case insensitive filesystem */
public class C43151zQ {
    public final String A00;
    public final boolean A01;

    public C43151zQ(String str, boolean z2) {
        this.A00 = str;
        this.A01 = z2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[hash=");
        sb.append(this.A00);
        sb.append(", optimistic=");
        sb.append(this.A01);
        sb.append("]");
        return sb.toString();
    }
}

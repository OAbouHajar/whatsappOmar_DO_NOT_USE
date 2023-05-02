package X;

/* renamed from: X.1pw  reason: invalid class name and case insensitive filesystem */
public class C37911pw implements Comparable {
    public int A00;
    public long A01;

    /* renamed from: A00 */
    public int compareTo(C37911pw r8) {
        if (r8 == this) {
            return 0;
        }
        long j2 = (long) (this.A00 - r8.A00);
        if (j2 == 0) {
            j2 = this.A01 - r8.A01;
        }
        if (j2 < 0) {
            return -1;
        }
        return j2 > 0 ? 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append(" ");
        sb.append(this.A01);
        return sb.toString();
    }
}

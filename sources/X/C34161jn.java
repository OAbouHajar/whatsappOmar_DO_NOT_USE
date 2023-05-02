package X;

/* renamed from: X.1jn  reason: invalid class name and case insensitive filesystem */
public class C34161jn {
    public final long A00;
    public final C16010sH A01;
    public final C16010sH A02;

    public C34161jn(C16010sH r1, C16010sH r2, long j2) {
        this.A01 = r1;
        this.A00 = j2;
        this.A02 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C34161jn r7 = (C34161jn) obj;
            if (this.A00 == r7.A00 && this.A01.equals(r7.A01)) {
                return this.A02.equals(r7.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.A00;
        return (((this.A01.hashCode() * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A02.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SearchResult{group=");
        sb.append(this.A01);
        sb.append(", lastMessageTimestamp=");
        sb.append(this.A00);
        sb.append(", matchingContact=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}

package X;

/* renamed from: X.1ak  reason: invalid class name and case insensitive filesystem */
public class C29511ak {
    public final int A00;
    public final long A01;
    public final String A02;

    public C29511ak(int i2, String str, long j2) {
        this.A02 = str;
        this.A00 = i2;
        this.A01 = j2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C29511ak)) {
            return false;
        }
        C29511ak r7 = (C29511ak) obj;
        return this.A02.equals(r7.A02) && this.A00 == r7.A00 && this.A01 == r7.A01;
    }

    public int hashCode() {
        int i2 = this.A00;
        int hashCode = ((this.A02.hashCode() * 31) + (i2 ^ (i2 >>> 32))) * 31;
        long j2 = this.A01;
        return hashCode + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02);
        sb.append(":");
        sb.append(this.A00);
        sb.append(":");
        sb.append(this.A01);
        sb.append(";");
        return sb.toString();
    }
}

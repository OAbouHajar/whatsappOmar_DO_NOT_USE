package X;

/* renamed from: X.25R  reason: invalid class name */
public class AnonymousClass25R {
    public final int A00;
    public final String A01;

    public AnonymousClass25R(int i2, String str) {
        this.A00 = i2;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass25R)) {
            return false;
        }
        AnonymousClass25R r4 = (AnonymousClass25R) obj;
        return this.A00 == r4.A00 && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return ((this.A01.hashCode() + 31) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FileDownloadToken{reportType=");
        sb.append(this.A00);
        sb.append(", fileHash='");
        sb.append(this.A01);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}

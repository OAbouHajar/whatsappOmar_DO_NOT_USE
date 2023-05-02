package X;

/* renamed from: X.1v4  reason: invalid class name and case insensitive filesystem */
public class C41021v4 {
    public final int A00;
    public final String A01;

    public C41021v4(int i2, String str) {
        this.A00 = i2;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntegrityCheckResult{result=");
        sb.append(this.A00);
        sb.append(", jidSuffix='");
        sb.append(this.A01);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}

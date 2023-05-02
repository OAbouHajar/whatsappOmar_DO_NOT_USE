package X;

/* renamed from: X.1tS  reason: invalid class name and case insensitive filesystem */
public class C40031tS {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final String A03;

    public C40031tS(String str, String str2, boolean z2) {
        this.A03 = str;
        this.A00 = str2;
        this.A01 = z2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A03);
        sb.append("=");
        sb.append(this.A02 ? "skipped" : this.A00);
        return sb.toString();
    }
}

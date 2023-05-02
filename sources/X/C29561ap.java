package X;

/* renamed from: X.1ap  reason: invalid class name and case insensitive filesystem */
public class C29561ap {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public C29561ap(String str, String str2, String str3, String str4, String str5, String str6, int i2, boolean z2) {
        this.A06 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A04 = str4;
        this.A03 = str5;
        this.A00 = i2;
        this.A07 = z2;
        this.A05 = str6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SelectedRoute{authority='");
        sb.append(this.A02);
        sb.append("' authorityType='");
        sb.append(this.A00);
        sb.append("'");
        sb.append('}');
        return sb.toString();
    }
}

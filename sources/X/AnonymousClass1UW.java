package X;

/* renamed from: X.1UW  reason: invalid class name */
public class AnonymousClass1UW {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public AnonymousClass1UW(String str, String str2, int i2, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A06 = z2;
        this.A04 = z3;
        this.A00 = i2;
        this.A03 = z4;
        this.A05 = z5;
        this.A02 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NetworkInformation{wifi=");
        sb.append(this.A06);
        sb.append(", mobile=");
        sb.append(this.A04);
        sb.append(", subType=");
        sb.append(this.A00);
        sb.append(", connected=");
        sb.append(this.A03);
        sb.append(", roaming=");
        sb.append(this.A05);
        sb.append(", typeName='");
        sb.append(this.A02);
        sb.append('\'');
        sb.append(", subTypeName='");
        sb.append(this.A01);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}

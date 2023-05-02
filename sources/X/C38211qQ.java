package X;

import java.util.Set;

/* renamed from: X.1qQ  reason: invalid class name and case insensitive filesystem */
public class C38211qQ {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final Set A09;
    public final Set A0A;
    public final Set A0B;
    public final boolean A0C;

    public C38211qQ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Set set, Set set2, Set set3, boolean z2) {
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A00 = str5;
        this.A01 = str6;
        this.A02 = str7;
        this.A03 = str8;
        this.A0B = set;
        this.A09 = set2;
        this.A0A = set3;
        String str10 = "fallback";
        this.A08 = !str10.equals(str9) ? "primary" : str10;
        this.A0C = z2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RouteHost{hostname='");
        sb.append(this.A04);
        sb.append('\'');
        sb.append(", upload=");
        Object obj = this.A0B;
        Object obj2 = "all";
        if (obj == null) {
            obj = obj2;
        }
        sb.append(obj);
        sb.append(", download=");
        Object obj3 = this.A09;
        if (obj3 != null) {
            obj2 = obj3;
        }
        sb.append(obj2);
        sb.append(", downloadBuckets=");
        Object obj4 = this.A0A;
        if (obj4 == null) {
            obj4 = "null";
        }
        sb.append(obj4);
        sb.append(", type=");
        sb.append(this.A08);
        sb.append(", forceIp=");
        sb.append(this.A0C);
        sb.append(", targetRegion=");
        sb.append((String) null);
        sb.append(", targetTask=");
        sb.append((String) null);
        sb.append('}');
        return sb.toString();
    }
}

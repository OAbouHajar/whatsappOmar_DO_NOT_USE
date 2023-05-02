package X;

import java.util.List;

/* renamed from: X.0Pr  reason: invalid class name and case insensitive filesystem */
public class C05200Pr {
    public final char A00;
    public final double A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C05200Pr(String str, String str2, List list, char c2, double d2) {
        this.A04 = list;
        this.A00 = c2;
        this.A01 = d2;
        this.A03 = str;
        this.A02 = str2;
    }

    public int hashCode() {
        return ((((0 + this.A00) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode();
    }
}

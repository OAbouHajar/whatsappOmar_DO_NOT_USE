package X;

/* renamed from: X.4S6  reason: invalid class name */
public class AnonymousClass4S6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass2BF A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public AnonymousClass4S6(AnonymousClass2BF r1, String str, String str2, int i2, int i3, int i4, boolean z2) {
        this.A02 = i2;
        this.A01 = i3;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = r1;
        this.A00 = i4;
        this.A06 = z2;
    }

    public String A00() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A02);
        A0o.append("-");
        A0o.append(this.A04);
        A0o.append("-");
        A0o.append(this.A01);
        A0o.append("-");
        A0o.append(this.A06);
        return A0o.toString();
    }
}

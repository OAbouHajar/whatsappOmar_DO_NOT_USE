package X;

/* renamed from: X.3pf  reason: invalid class name and case insensitive filesystem */
public final class C74053pf extends C18940xV {
    public final double A00;
    public final int A01;
    public final int A02;
    public final Double A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final /* synthetic */ AnonymousClass1PS A07;

    public C74053pf(AnonymousClass1PS r1, Double d2, String str, String str2, String str3, double d3, int i2, int i3) {
        this.A07 = r1;
        this.A04 = str;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = d3;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = d2;
    }

    public void A06(C16740tZ r12, int i2) {
        C18450wi.A0H(r12, 0);
        if (C18450wi.A0R(r12.A0k, "directory")) {
            String str = this.A04;
            C15830rv r0 = r12.A11.A00;
            if (C18450wi.A0R(str, r0 == null ? null : r0.getRawString())) {
                AnonymousClass1PS r1 = this.A07;
                r1.A01.A08(this.A03, 9, this.A06, this.A05, this.A00, this.A02, this.A01);
                r1.A00();
            }
        }
    }
}

package X;

/* renamed from: X.5hf  reason: invalid class name and case insensitive filesystem */
public final class C111935hf extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public C111935hf() {
        super(3558, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A04);
        r3.AdT(5, this.A05);
        r3.AdT(6, this.A06);
        r3.AdT(7, this.A03);
        r3.AdT(8, this.A07);
        r3.AdT(9, this.A08);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamAlertsUserAction {");
        C16470t7.appendFieldToStringBuilder(A0r, "alertActionTarget", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "alertActionType", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "alertCategory", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "alertDescription", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "alertId", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "alertReferral", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "alertRenderingCategory", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "alertTitle", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "contextScreen", this.A08);
        return AnonymousClass000.A0h("}", A0r);
    }
}

package X;

/* renamed from: X.3sT  reason: invalid class name and case insensitive filesystem */
public final class C75633sT extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;

    public C75633sT() {
        super(1656, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(8, this.A07);
        r3.AdT(5, this.A00);
        r3.AdT(4, this.A02);
        r3.AdT(3, this.A01);
        r3.AdT(7, this.A03);
        r3.AdT(6, this.A04);
        r3.AdT(1, this.A05);
        r3.AdT(2, this.A06);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamStatusRowView {");
        C16470t7.appendFieldToStringBuilder(A0r, "psaCampaigns", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "statusRowEntryMethod", C13690nt.A0d(this.A00));
        C16470t7.appendFieldToStringBuilder(A0r, "statusRowIndex", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "statusRowSection", C13690nt.A0d(this.A01));
        C16470t7.appendFieldToStringBuilder(A0r, "statusRowUnreadItemCount", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "statusRowViewCount", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "statusSessionId", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "statusViewerSessionId", this.A06);
        return AnonymousClass000.A0h("}", A0r);
    }
}

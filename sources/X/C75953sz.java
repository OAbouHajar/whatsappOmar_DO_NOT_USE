package X;

/* renamed from: X.3sz  reason: invalid class name and case insensitive filesystem */
public final class C75953sz extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public String A0K;

    public C75953sz() {
        super(1658, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(23, this.A00);
        r3.AdT(25, this.A01);
        r3.AdT(4, this.A05);
        r3.AdT(17, this.A0K);
        r3.AdT(18, this.A0A);
        r3.AdT(19, this.A02);
        r3.AdT(22, this.A03);
        r3.AdT(14, this.A0B);
        r3.AdT(16, this.A0C);
        r3.AdT(7, this.A0D);
        r3.AdT(5, this.A0E);
        r3.AdT(8, this.A0F);
        r3.AdT(9, this.A04);
        r3.AdT(10, this.A0G);
        r3.AdT(3, this.A06);
        r3.AdT(6, this.A0H);
        r3.AdT(2, this.A0I);
        r3.AdT(11, this.A07);
        r3.AdT(1, this.A0J);
        r3.AdT(26, this.A08);
        r3.AdT(27, this.A09);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamStatusItemView {");
        C16470t7.appendFieldToStringBuilder(A0r, "isPosterBiz", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "isPosterInAddressBook", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "mediaType", C13690nt.A0d(this.A05));
        C16470t7.appendFieldToStringBuilder(A0r, "psaCampaignId", this.A0K);
        C16470t7.appendFieldToStringBuilder(A0r, "psaCampaignItemIndex", this.A0A);
        C16470t7.appendFieldToStringBuilder(A0r, "psaLinkAvailable", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "psaLinkClick", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "statusItemImpressionCount", this.A0B);
        C16470t7.appendFieldToStringBuilder(A0r, "statusItemIndex", this.A0C);
        C16470t7.appendFieldToStringBuilder(A0r, "statusItemLength", this.A0D);
        C16470t7.appendFieldToStringBuilder(A0r, "statusItemLoadTime", this.A0E);
        C16470t7.appendFieldToStringBuilder(A0r, "statusItemReplied", this.A0F);
        C16470t7.appendFieldToStringBuilder(A0r, "statusItemUnread", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "statusItemViewCount", this.A0G);
        C16470t7.appendFieldToStringBuilder(A0r, "statusItemViewResult", C13690nt.A0d(this.A06));
        C16470t7.appendFieldToStringBuilder(A0r, "statusItemViewTime", this.A0H);
        C16470t7.appendFieldToStringBuilder(A0r, "statusRowIndex", this.A0I);
        C16470t7.appendFieldToStringBuilder(A0r, "statusRowSection", C13690nt.A0d(this.A07));
        C16470t7.appendFieldToStringBuilder(A0r, "statusViewerSessionId", this.A0J);
        C16470t7.appendFieldToStringBuilder(A0r, "urlStatusClicked", C13690nt.A0d(this.A08));
        C16470t7.appendFieldToStringBuilder(A0r, "urlStatusType", C13690nt.A0d(this.A09));
        return AnonymousClass000.A0h("}", A0r);
    }
}

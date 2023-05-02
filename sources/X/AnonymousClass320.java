package X;

/* renamed from: X.320  reason: invalid class name */
public final class AnonymousClass320 extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;

    public AnonymousClass320() {
        super(2978, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(9, this.A00);
        r3.AdT(10, this.A01);
        r3.AdT(8, this.A02);
        r3.AdT(6, this.A03);
        r3.AdT(7, this.A08);
        r3.AdT(4, this.A09);
        r3.AdT(5, this.A04);
        r3.AdT(3, this.A05);
        r3.AdT(1, this.A06);
        r3.AdT(2, this.A07);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamStatusMute {");
        C16470t7.appendFieldToStringBuilder(A0r, "isPosterBiz", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "isPosterInAddressBook", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "muteAction", C13690nt.A0d(this.A02));
        C16470t7.appendFieldToStringBuilder(A0r, "muteOrigin", C13690nt.A0d(this.A03));
        C16470t7.appendFieldToStringBuilder(A0r, "psaCampaignId", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "psaCampaignIds", this.A09);
        C16470t7.appendFieldToStringBuilder(A0r, "psaCampaignItemIndex", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "statusItemIndex", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "statusSessionId", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "statusViewerSessionId", this.A07);
        return AnonymousClass000.A0h("}", A0r);
    }
}

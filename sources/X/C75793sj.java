package X;

/* renamed from: X.3sj  reason: invalid class name and case insensitive filesystem */
public final class C75793sj extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public String A08;
    public String A09;

    public C75793sj() {
        super(3690, AnonymousClass3K3.A0d(), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(5, this.A08);
        r3.AdT(6, this.A09);
        r3.AdT(7, this.A04);
        r3.AdT(8, this.A05);
        r3.AdT(9, this.A07);
        r3.AdT(10, this.A06);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamStatusViewerTrafficActions {");
        C16470t7.appendFieldToStringBuilder(A0r, "fullStatusViewed", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "isFirstViewOfStatus", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "isPosterBiz", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "isPosterInAddressBook", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "statusId", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "statusPosterJid", this.A09);
        C16470t7.appendFieldToStringBuilder(A0r, "statusReplyMessageType", C13690nt.A0d(this.A04));
        C16470t7.appendFieldToStringBuilder(A0r, "statusViewEntryPoint", C13690nt.A0d(this.A05));
        C16470t7.appendFieldToStringBuilder(A0r, "statusViewerSessionId", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "statusViewerTrafficActionType", C13690nt.A0d(this.A06));
        return AnonymousClass000.A0h("}", A0r);
    }
}

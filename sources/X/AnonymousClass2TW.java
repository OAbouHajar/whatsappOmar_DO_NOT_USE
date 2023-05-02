package X;

/* renamed from: X.2TW  reason: invalid class name */
public final class AnonymousClass2TW extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public String A07;
    public String A08;

    public AnonymousClass2TW() {
        super(3688, new AnonymousClass00F(1, 1, 1), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(5, this.A07);
        r3.AdT(6, this.A08);
        r3.AdT(7, this.A04);
        r3.AdT(8, this.A05);
        r3.AdT(9, this.A06);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamStatusViewerActions {");
        C16470t7.appendFieldToStringBuilder(sb, "fullStatusViewed", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "isFirstViewOfStatus", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "isPosterBiz", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "isPosterInAddressBook", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "statusId", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "statusPosterJid", this.A08);
        Integer num = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "statusViewEntryPoint", num == null ? null : num.toString());
        Integer num2 = this.A05;
        C16470t7.appendFieldToStringBuilder(sb, "statusViewerNonTrafficActionType", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "statusViewerSessionId", this.A06);
        sb.append("}");
        return sb.toString();
    }
}

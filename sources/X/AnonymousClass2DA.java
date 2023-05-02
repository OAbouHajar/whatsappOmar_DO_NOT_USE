package X;

/* renamed from: X.2DA  reason: invalid class name */
public final class AnonymousClass2DA extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public String A0C;

    public AnonymousClass2DA() {
        super(3796, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A03);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A00);
        r3.AdT(5, this.A0C);
        r3.AdT(6, this.A04);
        r3.AdT(7, this.A05);
        r3.AdT(8, this.A06);
        r3.AdT(10, this.A07);
        r3.AdT(11, this.A08);
        r3.AdT(12, this.A09);
        r3.AdT(14, this.A0A);
        r3.AdT(15, this.A0B);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamNotificationEngagement {");
        C16470t7.appendFieldToStringBuilder(sb, "avgNotifEngagementT", this.A03);
        Integer num = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "groupSizeBucket", num == null ? null : num.toString());
        Integer num2 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "groupTypeClient", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "isAGroup", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "threadId", this.A0C);
        C16470t7.appendFieldToStringBuilder(sb, "totalNotifMarkAsRead", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "totalNotifMissedCallVoipCallback", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "totalNotifMissedCallVoipMessage", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "totalNotifReply", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "totalNotifRtcVoipAccept", this.A08);
        C16470t7.appendFieldToStringBuilder(sb, "totalNotifRtcVoipDecline", this.A09);
        C16470t7.appendFieldToStringBuilder(sb, "totalNotifShown", this.A0A);
        C16470t7.appendFieldToStringBuilder(sb, "totalNotifTapToOpen", this.A0B);
        sb.append("}");
        return sb.toString();
    }
}

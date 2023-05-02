package X;

/* renamed from: X.2Jb  reason: invalid class name and case insensitive filesystem */
public final class C47462Jb extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;
    public String A0A;

    public C47462Jb() {
        super(3546, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A05);
        r3.AdT(2, this.A06);
        r3.AdT(3, this.A00);
        r3.AdT(4, this.A01);
        r3.AdT(5, this.A02);
        r3.AdT(13, this.A07);
        r3.AdT(7, this.A03);
        r3.AdT(12, this.A09);
        r3.AdT(8, this.A0A);
        r3.AdT(10, this.A04);
        r3.AdT(11, this.A08);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamStatusPosterActions {");
        C16470t7.appendFieldToStringBuilder(sb, "retryCount", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "statusAudienceSize", this.A06);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "statusContentSource", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "statusContentType", num2 == null ? null : num2.toString());
        Integer num3 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "statusCreationEntryPoint", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "statusDuration", this.A07);
        Integer num4 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "statusEventType", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "statusId", this.A09);
        C16470t7.appendFieldToStringBuilder(sb, "statusPostFailureReason", this.A0A);
        Integer num5 = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "statusPrivacyType", num5 == null ? null : num5.toString());
        C16470t7.appendFieldToStringBuilder(sb, "statusSessionId", this.A08);
        sb.append("}");
        return sb.toString();
    }
}

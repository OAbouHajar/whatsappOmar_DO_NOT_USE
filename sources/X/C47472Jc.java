package X;

/* renamed from: X.2Jc  reason: invalid class name and case insensitive filesystem */
public final class C47472Jc extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;

    public C47472Jc() {
        super(1176, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(6, this.A02);
        r3.AdT(2, this.A03);
        r3.AdT(7, this.A04);
        r3.AdT(5, this.A07);
        r3.AdT(8, this.A00);
        r3.AdT(9, this.A01);
        r3.AdT(4, this.A05);
        r3.AdT(3, this.A06);
        r3.AdT(1, this.A08);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamStatusPost {");
        Integer num = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "defaultStatusPrivacySetting", num == null ? null : num.toString());
        Integer num2 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "mediaType", num2 == null ? null : num2.toString());
        Integer num3 = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "perPostStatusPrivacySetting", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "retryCount", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "statusAudienceSelectorClicked", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "statusAudienceSelectorUpdated", this.A01);
        Integer num4 = this.A05;
        C16470t7.appendFieldToStringBuilder(sb, "statusPostOrigin", num4 == null ? null : num4.toString());
        Integer num5 = this.A06;
        C16470t7.appendFieldToStringBuilder(sb, "statusPostResult", num5 == null ? null : num5.toString());
        C16470t7.appendFieldToStringBuilder(sb, "statusSessionId", this.A08);
        sb.append("}");
        return sb.toString();
    }
}

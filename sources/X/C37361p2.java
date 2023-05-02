package X;

/* renamed from: X.1p2  reason: invalid class name and case insensitive filesystem */
public final class C37361p2 extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public String A0A;
    public String A0B;

    public C37361p2() {
        super(2292, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(12, this.A04);
        r3.AdT(6, this.A05);
        r3.AdT(11, this.A00);
        r3.AdT(13, this.A01);
        r3.AdT(5, this.A06);
        r3.AdT(4, this.A07);
        r3.AdT(2, this.A02);
        r3.AdT(8, this.A03);
        r3.AdT(9, this.A08);
        r3.AdT(10, this.A0A);
        r3.AdT(1, this.A0B);
        r3.AdT(3, this.A09);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMdBootstrapHistoryDataUploaded {");
        C16470t7.appendFieldToStringBuilder(sb, "historySyncStageProgress", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapChatsCount", this.A05);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapHistoryPayloadType", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapHistoryUploadStepResult", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapMessagesCount", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapPayloadSize", this.A07);
        Integer num3 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapPayloadType", num3 == null ? null : num3.toString());
        Integer num4 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapStepResult", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "mdHsOldestMessageTimestamp", this.A08);
        C16470t7.appendFieldToStringBuilder(sb, "mdRegAttemptId", this.A0A);
        C16470t7.appendFieldToStringBuilder(sb, "mdSessionId", this.A0B);
        C16470t7.appendFieldToStringBuilder(sb, "mdTimestamp", this.A09);
        sb.append("}");
        return sb.toString();
    }
}

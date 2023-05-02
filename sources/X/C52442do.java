package X;

/* renamed from: X.2do  reason: invalid class name and case insensitive filesystem */
public final class C52442do extends C16470t7 {
    public Integer A00;
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
    public String A0B;

    public C52442do() {
        super(2296, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(14, this.A03);
        r3.AdT(6, this.A04);
        r3.AdT(13, this.A00);
        r3.AdT(5, this.A05);
        r3.AdT(4, this.A06);
        r3.AdT(2, this.A01);
        r3.AdT(7, this.A07);
        r3.AdT(8, this.A02);
        r3.AdT(1, this.A0B);
        r3.AdT(9, this.A08);
        r3.AdT(10, this.A09);
        r3.AdT(3, this.A0A);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMdBootstrapHistoryDataDownloaded {");
        C16470t7.appendFieldToStringBuilder(sb, "historySyncStageProgress", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapChatsCount", this.A04);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapHistoryPayloadType", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapMessagesCount", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapPayloadSize", this.A06);
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapPayloadType", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapStepDuration", this.A07);
        Integer num3 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapStepResult", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "mdSessionId", this.A0B);
        C16470t7.appendFieldToStringBuilder(sb, "mdStorageQuotaBytes", this.A08);
        C16470t7.appendFieldToStringBuilder(sb, "mdStorageQuotaUsedBytes", this.A09);
        C16470t7.appendFieldToStringBuilder(sb, "mdTimestamp", this.A0A);
        sb.append("}");
        return sb.toString();
    }
}

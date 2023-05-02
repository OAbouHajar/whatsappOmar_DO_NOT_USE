package X;

/* renamed from: X.1ow  reason: invalid class name and case insensitive filesystem */
public final class C37301ow extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;

    public C37301ow() {
        super(2288, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(8, this.A04);
        r3.AdT(7, this.A00);
        r3.AdT(3, this.A01);
        r3.AdT(2, this.A02);
        r3.AdT(5, this.A03);
        r3.AdT(6, this.A06);
        r3.AdT(1, this.A07);
        r3.AdT(4, this.A05);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMdBootstrapDataGenerated {");
        C16470t7.appendFieldToStringBuilder(sb, "historySyncStageProgress", this.A04);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapHistoryPayloadType", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapPayloadType", num2 == null ? null : num2.toString());
        Integer num3 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapSource", num3 == null ? null : num3.toString());
        Integer num4 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapStepResult", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "mdRegAttemptId", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "mdSessionId", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "mdTimestamp", this.A05);
        sb.append("}");
        return sb.toString();
    }
}

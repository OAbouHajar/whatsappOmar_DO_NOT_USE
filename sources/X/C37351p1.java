package X;

/* renamed from: X.1p1  reason: invalid class name and case insensitive filesystem */
public final class C37351p1 extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;

    public C37351p1() {
        super(3162, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A03);
        r3.AdT(3, this.A01);
        r3.AdT(4, this.A02);
        r3.AdT(5, this.A05);
        r3.AdT(6, this.A06);
        r3.AdT(7, this.A04);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMdBootstrapHistoryDataDelivered {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapHistoryPayloadType", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapHistoryReceiptRetryCount", this.A03);
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapPayloadType", num2 == null ? null : num2.toString());
        Integer num3 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapStepResult", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "mdRegAttemptId", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "mdSessionId", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "mdTimestamp", this.A04);
        sb.append("}");
        return sb.toString();
    }
}

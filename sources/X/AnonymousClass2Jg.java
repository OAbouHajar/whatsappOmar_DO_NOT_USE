package X;

/* renamed from: X.2Jg  reason: invalid class name */
public final class AnonymousClass2Jg extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;

    public AnonymousClass2Jg() {
        super(1174, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(6, this.A00);
        r3.AdT(1, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(5, this.A01);
        r3.AdT(2, this.A04);
        r3.AdT(3, this.A05);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamStatusTabClose {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "statusSessionFbShareError", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "statusSessionId", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "statusSessionReplyCount", this.A03);
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "statusSessionShareStatusCtaTap", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "statusSessionTimeSpent", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "statusSessionViewCount", this.A05);
        sb.append("}");
        return sb.toString();
    }
}

package X;

/* renamed from: X.23V  reason: invalid class name */
public final class AnonymousClass23V extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;

    public AnonymousClass23V() {
        super(3488, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A03);
        r3.AdT(2, this.A00);
        r3.AdT(3, this.A04);
        r3.AdT(4, this.A01);
        r3.AdT(5, this.A05);
        r3.AdT(6, this.A02);
        r3.AdT(7, this.A06);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamKeepInChatPerf {");
        C16470t7.appendFieldToStringBuilder(sb, "chatEphemeralityDuration", this.A03);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "kicErrorCode", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "kicMessageEphemeralityDuration", this.A04);
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "kicRequestType", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "requestSendTime", this.A05);
        Integer num3 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "response", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "threadId", this.A06);
        sb.append("}");
        return sb.toString();
    }
}

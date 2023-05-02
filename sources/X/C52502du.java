package X;

/* renamed from: X.2du  reason: invalid class name and case insensitive filesystem */
public final class C52502du extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public String A04;

    public C52502du() {
        super(2998, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(5, this.A02);
        r3.AdT(3, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(1, this.A04);
        r3.AdT(4, this.A03);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMdBootstrapHistoryDataReceived {");
        C16470t7.appendFieldToStringBuilder(sb, "historySyncStageProgress", this.A02);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapHistoryPayloadType", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapPayloadType", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "mdSessionId", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "mdTimestamp", this.A03);
        sb.append("}");
        return sb.toString();
    }
}

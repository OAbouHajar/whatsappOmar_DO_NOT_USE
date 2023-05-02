package X;

/* renamed from: X.1ox  reason: invalid class name and case insensitive filesystem */
public final class C37311ox extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;

    public C37311ox() {
        super(2290, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(5, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(2, this.A00);
        r3.AdT(7, this.A01);
        r3.AdT(8, this.A05);
        r3.AdT(1, this.A06);
        r3.AdT(3, this.A04);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMdBootstrapAppStateDataUploaded {");
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapContactsCount", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapPayloadSize", this.A03);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapPayloadType", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapStepResult", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "mdRegAttemptId", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "mdSessionId", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "mdTimestamp", this.A04);
        sb.append("}");
        return sb.toString();
    }
}

package X;

/* renamed from: X.255  reason: invalid class name */
public final class AnonymousClass255 extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;

    public AnonymousClass255() {
        super(2294, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(4, this.A02);
        r3.AdT(2, this.A00);
        r3.AdT(6, this.A03);
        r3.AdT(7, this.A01);
        r3.AdT(1, this.A07);
        r3.AdT(8, this.A04);
        r3.AdT(9, this.A05);
        r3.AdT(3, this.A06);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMdBootstrapAppStateDataDownloaded {");
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapPayloadSize", this.A02);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapPayloadType", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapStepDuration", this.A03);
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "mdBootstrapStepResult", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "mdSessionId", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "mdStorageQuotaBytes", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "mdStorageQuotaUsedBytes", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "mdTimestamp", this.A06);
        sb.append("}");
        return sb.toString();
    }
}

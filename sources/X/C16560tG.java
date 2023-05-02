package X;

/* renamed from: X.0tG  reason: invalid class name and case insensitive filesystem */
public final class C16560tG extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;

    public C16560tG() {
        super(2242, new AnonymousClass00F(1, 1, 100), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(6, this.A01);
        r3.AdT(4, this.A04);
        r3.AdT(7, this.A02);
        r3.AdT(2, this.A05);
        r3.AdT(1, this.A03);
        r3.AdT(3, this.A06);
        r3.AdT(5, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamSignCredential {");
        Integer num = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "applicationState", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "overallT", this.A04);
        Integer num2 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "projectCode", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "retryCount", this.A05);
        Integer num3 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "signCredentialResult", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "signCredentialT", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "waConnectedToChatd", this.A00);
        sb.append("}");
        return sb.toString();
    }
}

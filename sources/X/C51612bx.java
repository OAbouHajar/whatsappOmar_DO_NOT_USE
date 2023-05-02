package X;

/* renamed from: X.2bx  reason: invalid class name and case insensitive filesystem */
public final class C51612bx extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;

    public C51612bx() {
        super(460, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(10, this.A02);
        r3.AdT(6, this.A03);
        r3.AdT(5, this.A05);
        r3.AdT(1, this.A04);
        r3.AdT(3, this.A06);
        r3.AdT(4, this.A00);
        r3.AdT(8, this.A01);
        r3.AdT(2, this.A07);
        r3.AdT(7, this.A08);
        r3.AdT(9, this.A09);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamLogin {");
        Integer num = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "androidKeystoreState", num == null ? null : num.toString());
        Integer num2 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "connectionOrigin", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "connectionT", this.A05);
        Integer num3 = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "loginResult", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "loginT", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "longConnect", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "passive", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "retryCount", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "sequenceStep", this.A08);
        C16470t7.appendFieldToStringBuilder(sb, "serverErrorCode", this.A09);
        sb.append("}");
        return sb.toString();
    }
}

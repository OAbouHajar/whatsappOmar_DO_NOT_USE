package X;

/* renamed from: X.1xc  reason: invalid class name and case insensitive filesystem */
public final class C42331xc extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public String A07;
    public String A08;

    public C42331xc() {
        super(3468, new AnonymousClass00F(1, 1, 1), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A05);
        r3.AdT(2, this.A00);
        r3.AdT(3, this.A01);
        r3.AdT(11, this.A06);
        r3.AdT(5, this.A02);
        r3.AdT(6, this.A03);
        r3.AdT(7, this.A04);
        r3.AdT(8, this.A07);
        r3.AdT(9, this.A08);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamOtpRetriever {");
        C16470t7.appendFieldToStringBuilder(sb, "businessPhoneNumber", this.A05);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "ctaFallbackReason", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "ctaType", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "messageReceivedElapsedTimeSeconds", this.A06);
        Integer num3 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "otpEventSource", num3 == null ? null : num3.toString());
        Integer num4 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "otpEventType", num4 == null ? null : num4.toString());
        Integer num5 = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "otpProductType", num5 == null ? null : num5.toString());
        C16470t7.appendFieldToStringBuilder(sb, "otpSessionId", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "thirdPartyPackageNameFromIntent", this.A08);
        sb.append("}");
        return sb.toString();
    }
}

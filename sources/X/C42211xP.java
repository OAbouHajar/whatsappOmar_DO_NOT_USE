package X;

/* renamed from: X.1xP  reason: invalid class name and case insensitive filesystem */
public final class C42211xP extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;

    public C42211xP() {
        super(476, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(5, this.A03);
        r3.AdT(6, this.A0A);
        r3.AdT(4, this.A04);
        r3.AdT(2, this.A05);
        r3.AdT(8, this.A06);
        r3.AdT(1, this.A00);
        r3.AdT(9, this.A0B);
        r3.AdT(12, this.A01);
        r3.AdT(10, this.A02);
        r3.AdT(7, this.A07);
        r3.AdT(3, this.A0C);
        r3.AdT(11, this.A08);
        r3.AdT(13, this.A09);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamE2eMessageSend {");
        Integer num = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "e2eCiphertextType", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "e2eCiphertextVersion", this.A0A);
        Integer num2 = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "e2eDestination", num2 == null ? null : num2.toString());
        Integer num3 = this.A05;
        C16470t7.appendFieldToStringBuilder(sb, "e2eFailureReason", num3 == null ? null : num3.toString());
        Integer num4 = this.A06;
        C16470t7.appendFieldToStringBuilder(sb, "e2eReceiverType", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "e2eSuccessful", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "encRetryCount", this.A0B);
        C16470t7.appendFieldToStringBuilder(sb, "isLid", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "messageIsInvisible", this.A02);
        Integer num5 = this.A07;
        C16470t7.appendFieldToStringBuilder(sb, "messageMediaType", num5 == null ? null : num5.toString());
        C16470t7.appendFieldToStringBuilder(sb, "retryCount", this.A0C);
        Integer num6 = this.A08;
        C16470t7.appendFieldToStringBuilder(sb, "revokeType", num6 == null ? null : num6.toString());
        Integer num7 = this.A09;
        C16470t7.appendFieldToStringBuilder(sb, "typeOfGroup", num7 == null ? null : num7.toString());
        sb.append("}");
        return sb.toString();
    }
}

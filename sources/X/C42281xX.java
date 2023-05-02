package X;

/* renamed from: X.1xX  reason: invalid class name and case insensitive filesystem */
public final class C42281xX extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public Long A0B;

    public C42281xX() {
        super(1728, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(21, this.A05);
        r3.AdT(18, this.A09);
        r3.AdT(22, this.A00);
        r3.AdT(14, this.A01);
        r3.AdT(9, this.A02);
        r3.AdT(2, this.A06);
        r3.AdT(1, this.A07);
        r3.AdT(20, this.A0A);
        r3.AdT(19, this.A0B);
        r3.AdT(23, this.A08);
        r3.AdT(16, this.A03);
        r3.AdT(17, this.A04);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamForwardSend {");
        Integer num = this.A05;
        C16470t7.appendFieldToStringBuilder(sb, "disappearingChatInitiator", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "ephemeralityDuration", this.A09);
        C16470t7.appendFieldToStringBuilder(sb, "isForwardedForward", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "isFrequentlyForwarded", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "messageIsInternational", this.A02);
        Integer num2 = this.A06;
        C16470t7.appendFieldToStringBuilder(sb, "messageMediaType", num2 == null ? null : num2.toString());
        Integer num3 = this.A07;
        C16470t7.appendFieldToStringBuilder(sb, "messageType", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "receiverDefaultDisappearingDuration", this.A0A);
        C16470t7.appendFieldToStringBuilder(sb, "senderDefaultDisappearingDuration", this.A0B);
        Integer num4 = this.A08;
        C16470t7.appendFieldToStringBuilder(sb, "typeOfGroup", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "wouldBeFrequentlyForwardedAt3", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "wouldBeFrequentlyForwardedAt4", this.A04);
        sb.append("}");
        return sb.toString();
    }
}

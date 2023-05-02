package X;

/* renamed from: X.1dA  reason: invalid class name and case insensitive filesystem */
public final class C30911dA extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;

    public C30911dA() {
        super(450, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(16, this.A0F);
        r3.AdT(10, this.A08);
        r3.AdT(14, this.A09);
        r3.AdT(25, this.A0A);
        r3.AdT(13, this.A0G);
        r3.AdT(19, this.A00);
        r3.AdT(18, this.A01);
        r3.AdT(24, this.A02);
        r3.AdT(9, this.A03);
        r3.AdT(4, this.A04);
        r3.AdT(23, this.A05);
        r3.AdT(5, this.A06);
        r3.AdT(2, this.A0B);
        r3.AdT(6, this.A0H);
        r3.AdT(7, this.A0I);
        r3.AdT(1, this.A0C);
        r3.AdT(8, this.A07);
        r3.AdT(22, this.A0J);
        r3.AdT(17, this.A0K);
        r3.AdT(12, this.A0L);
        r3.AdT(20, this.A0D);
        r3.AdT(11, this.A0M);
        r3.AdT(21, this.A0E);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMessageReceive {");
        C16470t7.appendFieldToStringBuilder(sb, "deviceCount", this.A0F);
        Integer num = this.A08;
        C16470t7.appendFieldToStringBuilder(sb, "deviceSizeBucket", num == null ? null : num.toString());
        Integer num2 = this.A09;
        C16470t7.appendFieldToStringBuilder(sb, "disappearingChatInitiator", num2 == null ? null : num2.toString());
        Integer num3 = this.A0A;
        C16470t7.appendFieldToStringBuilder(sb, "editType", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "ephemeralityDuration", this.A0G);
        C16470t7.appendFieldToStringBuilder(sb, "isAReply", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "isForwardedForward", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "isLid", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "isViewOnce", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "messageIsInternational", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "messageIsInvisible", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "messageIsOffline", this.A06);
        Integer num4 = this.A0B;
        C16470t7.appendFieldToStringBuilder(sb, "messageMediaType", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "messageReceiveT0", this.A0H);
        C16470t7.appendFieldToStringBuilder(sb, "messageReceiveT1", this.A0I);
        Integer num5 = this.A0C;
        C16470t7.appendFieldToStringBuilder(sb, "messageType", num5 == null ? null : num5.toString());
        C16470t7.appendFieldToStringBuilder(sb, "mutedGroupMessage", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "paddingBytesSize", this.A0J);
        C16470t7.appendFieldToStringBuilder(sb, "participantCount", this.A0K);
        C16470t7.appendFieldToStringBuilder(sb, "receiverDefaultDisappearingDuration", this.A0L);
        Integer num6 = this.A0D;
        C16470t7.appendFieldToStringBuilder(sb, "revokeType", num6 == null ? null : num6.toString());
        C16470t7.appendFieldToStringBuilder(sb, "senderDefaultDisappearingDuration", this.A0M);
        Integer num7 = this.A0E;
        C16470t7.appendFieldToStringBuilder(sb, "typeOfGroup", num7 == null ? null : num7.toString());
        sb.append("}");
        return sb.toString();
    }
}

package X;

/* renamed from: X.1xT  reason: invalid class name and case insensitive filesystem */
public final class C42251xT extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Double A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public Long A0Q;
    public Long A0R;
    public Long A0S;
    public Long A0T;
    public Long A0U;

    public C42251xT() {
        super(854, new AnonymousClass00F(1, 5, 5), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(31, this.A0M);
        r3.AdT(25, this.A0E);
        r3.AdT(30, this.A0F);
        r3.AdT(23, this.A00);
        r3.AdT(21, this.A0N);
        r3.AdT(40, this.A0O);
        r3.AdT(35, this.A01);
        r3.AdT(39, this.A02);
        r3.AdT(22, this.A03);
        r3.AdT(8, this.A04);
        r3.AdT(41, this.A0G);
        r3.AdT(4, this.A05);
        r3.AdT(7, this.A06);
        r3.AdT(29, this.A07);
        r3.AdT(24, this.A08);
        r3.AdT(3, this.A0H);
        r3.AdT(1, this.A0I);
        r3.AdT(17, this.A09);
        r3.AdT(11, this.A0P);
        r3.AdT(2, this.A0J);
        r3.AdT(37, this.A0A);
        r3.AdT(32, this.A0Q);
        r3.AdT(28, this.A0R);
        r3.AdT(16, this.A0S);
        r3.AdT(33, this.A0T);
        r3.AdT(34, this.A0K);
        r3.AdT(27, this.A0U);
        r3.AdT(38, this.A0B);
        r3.AdT(18, this.A0C);
        r3.AdT(20, this.A0D);
        r3.AdT(36, this.A0L);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMessageSend {");
        C16470t7.appendFieldToStringBuilder(sb, "deviceCount", this.A0M);
        Integer num = this.A0E;
        C16470t7.appendFieldToStringBuilder(sb, "deviceSizeBucket", num == null ? null : num.toString());
        Integer num2 = this.A0F;
        C16470t7.appendFieldToStringBuilder(sb, "disappearingChatInitiator", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "e2eBackfill", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "ephemeralityDuration", this.A0N);
        C16470t7.appendFieldToStringBuilder(sb, "excessPayloadKbSize", this.A0O);
        C16470t7.appendFieldToStringBuilder(sb, "isAReply", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "isLid", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "isViewOnce", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "mediaCaptionPresent", this.A04);
        Integer num3 = this.A0G;
        C16470t7.appendFieldToStringBuilder(sb, "messageDistributionType", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "messageIsForward", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "messageIsInternational", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "messageIsInvisible", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "messageIsRevoke", this.A08);
        Integer num4 = this.A0H;
        C16470t7.appendFieldToStringBuilder(sb, "messageMediaType", num4 == null ? null : num4.toString());
        Integer num5 = this.A0I;
        C16470t7.appendFieldToStringBuilder(sb, "messageSendResult", num5 == null ? null : num5.toString());
        C16470t7.appendFieldToStringBuilder(sb, "messageSendResultIsTerminal", this.A09);
        C16470t7.appendFieldToStringBuilder(sb, "messageSendT", this.A0P);
        Integer num6 = this.A0J;
        C16470t7.appendFieldToStringBuilder(sb, "messageType", num6 == null ? null : num6.toString());
        C16470t7.appendFieldToStringBuilder(sb, "networkWasDisconnected", this.A0A);
        C16470t7.appendFieldToStringBuilder(sb, "participantCount", this.A0Q);
        C16470t7.appendFieldToStringBuilder(sb, "receiverDefaultDisappearingDuration", this.A0R);
        C16470t7.appendFieldToStringBuilder(sb, "resendCount", this.A0S);
        C16470t7.appendFieldToStringBuilder(sb, "revokeDuration", this.A0T);
        Integer num7 = this.A0K;
        C16470t7.appendFieldToStringBuilder(sb, "revokeType", num7 == null ? null : num7.toString());
        C16470t7.appendFieldToStringBuilder(sb, "senderDefaultDisappearingDuration", this.A0U);
        C16470t7.appendFieldToStringBuilder(sb, "stickerIsAvatar", this.A0B);
        C16470t7.appendFieldToStringBuilder(sb, "stickerIsFirstParty", this.A0C);
        C16470t7.appendFieldToStringBuilder(sb, "thumbSize", this.A0D);
        Integer num8 = this.A0L;
        C16470t7.appendFieldToStringBuilder(sb, "typeOfGroup", num8 == null ? null : num8.toString());
        sb.append("}");
        return sb.toString();
    }
}

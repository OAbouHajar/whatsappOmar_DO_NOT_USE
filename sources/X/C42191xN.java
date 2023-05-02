package X;

/* renamed from: X.1xN  reason: invalid class name and case insensitive filesystem */
public final class C42191xN extends C16470t7 {
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
    public Boolean A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public Long A0Q;
    public Long A0R;
    public Long A0S;
    public Long A0T;
    public Long A0U;
    public Long A0V;
    public Long A0W;
    public Long A0X;

    public C42191xN() {
        super(1994, new AnonymousClass00F(1, 1000, 2000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(16, this.A00);
        r3.AdT(36, this.A0K);
        r3.AdT(26, this.A0E);
        r3.AdT(11, this.A0L);
        r3.AdT(12, this.A0M);
        r3.AdT(1, this.A0N);
        r3.AdT(15, this.A01);
        r3.AdT(21, this.A0O);
        r3.AdT(17, this.A0F);
        r3.AdT(33, this.A02);
        r3.AdT(27, this.A03);
        r3.AdT(41, this.A04);
        r3.AdT(9, this.A05);
        r3.AdT(8, this.A06);
        r3.AdT(24, this.A07);
        r3.AdT(29, this.A08);
        r3.AdT(18, this.A0P);
        r3.AdT(3, this.A0G);
        r3.AdT(30, this.A09);
        r3.AdT(31, this.A0A);
        r3.AdT(4, this.A0H);
        r3.AdT(14, this.A0B);
        r3.AdT(37, this.A0Q);
        r3.AdT(34, this.A0R);
        r3.AdT(28, this.A0C);
        r3.AdT(39, this.A0S);
        r3.AdT(13, this.A0T);
        r3.AdT(10, this.A0U);
        r3.AdT(2, this.A0I);
        r3.AdT(40, this.A0V);
        r3.AdT(23, this.A0W);
        r3.AdT(25, this.A0D);
        r3.AdT(19, this.A0X);
        r3.AdT(38, this.A0J);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAndroidMessageSendPerf {");
        C16470t7.appendFieldToStringBuilder(sb, "appRestart", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "deviceCount", this.A0K);
        Integer num = this.A0E;
        C16470t7.appendFieldToStringBuilder(sb, "deviceSizeBucket", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "durationAbs", this.A0L);
        C16470t7.appendFieldToStringBuilder(sb, "durationRelative", this.A0M);
        C16470t7.appendFieldToStringBuilder(sb, "durationT", this.A0N);
        C16470t7.appendFieldToStringBuilder(sb, "fetchPrekeys", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "fetchPrekeysPercentage", this.A0O);
        Integer num2 = this.A0F;
        C16470t7.appendFieldToStringBuilder(sb, "groupSizeBucket", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "isDirectedMessage", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "isE2eBackfill", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "isLid", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "isMessageFanout", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "isMessageForward", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "isRevokeMessage", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "isViewOnce", this.A08);
        C16470t7.appendFieldToStringBuilder(sb, "jobsInQueue", this.A0P);
        Integer num3 = this.A0G;
        C16470t7.appendFieldToStringBuilder(sb, "mediaType", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "messageIsFirstUserMessage", this.A09);
        C16470t7.appendFieldToStringBuilder(sb, "messageIsInvisible", this.A0A);
        Integer num4 = this.A0H;
        C16470t7.appendFieldToStringBuilder(sb, "messageType", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "networkWasDisconnected", this.A0B);
        C16470t7.appendFieldToStringBuilder(sb, "participantCount", this.A0Q);
        C16470t7.appendFieldToStringBuilder(sb, "phoneCores", this.A0R);
        C16470t7.appendFieldToStringBuilder(sb, "prekeysEligibleForPrallelProcessing", this.A0C);
        C16470t7.appendFieldToStringBuilder(sb, "receiverDeviceCount", this.A0S);
        C16470t7.appendFieldToStringBuilder(sb, "sendCount", this.A0T);
        C16470t7.appendFieldToStringBuilder(sb, "sendRetryCount", this.A0U);
        Integer num5 = this.A0I;
        C16470t7.appendFieldToStringBuilder(sb, "sendStage", num5 == null ? null : num5.toString());
        C16470t7.appendFieldToStringBuilder(sb, "senderDeviceCount", this.A0V);
        C16470t7.appendFieldToStringBuilder(sb, "senderKeyDistributionCountPercentage", this.A0W);
        C16470t7.appendFieldToStringBuilder(sb, "sessionsMissingWhenComposing", this.A0D);
        C16470t7.appendFieldToStringBuilder(sb, "threadsInExecution", this.A0X);
        Integer num6 = this.A0J;
        C16470t7.appendFieldToStringBuilder(sb, "typeOfGroup", num6 == null ? null : num6.toString());
        sb.append("}");
        return sb.toString();
    }
}

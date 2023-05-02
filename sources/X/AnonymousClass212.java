package X;

/* renamed from: X.212  reason: invalid class name */
public final class AnonymousClass212 extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public String A0O;
    public String A0P;

    public AnonymousClass212() {
        super(1138, new AnonymousClass00F(1, 20, 200), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(10, this.A05);
        r3.AdT(8, this.A06);
        r3.AdT(11, this.A07);
        r3.AdT(7, this.A08);
        r3.AdT(17, this.A09);
        r3.AdT(14, this.A0O);
        r3.AdT(1, this.A00);
        r3.AdT(20, this.A0A);
        r3.AdT(26, this.A01);
        r3.AdT(15, this.A02);
        r3.AdT(24, this.A0B);
        r3.AdT(23, this.A0C);
        r3.AdT(27, this.A0D);
        r3.AdT(25, this.A0E);
        r3.AdT(13, this.A0P);
        r3.AdT(22, this.A0F);
        r3.AdT(19, this.A03);
        r3.AdT(4, this.A0G);
        r3.AdT(5, this.A0H);
        r3.AdT(3, this.A0I);
        r3.AdT(6, this.A0J);
        r3.AdT(2, this.A0K);
        r3.AdT(21, this.A0L);
        r3.AdT(18, this.A0M);
        r3.AdT(16, this.A0N);
        r3.AdT(12, this.A04);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAndroidMediaTranscodeEvent {");
        C16470t7.appendFieldToStringBuilder(sb, "dstDurationSec", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "dstHeight", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "dstSize", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "dstWidth", this.A08);
        C16470t7.appendFieldToStringBuilder(sb, "durationMs", this.A09);
        C16470t7.appendFieldToStringBuilder(sb, "errorType", this.A0O);
        C16470t7.appendFieldToStringBuilder(sb, "fileIsDoodle", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "firstScanSize", this.A0A);
        C16470t7.appendFieldToStringBuilder(sb, "hasStatusMessage", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "isSuccess", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "lowQualitySize", this.A0B);
        C16470t7.appendFieldToStringBuilder(sb, "maxEdge", this.A0C);
        C16470t7.appendFieldToStringBuilder(sb, "mediaId", this.A0D);
        C16470t7.appendFieldToStringBuilder(sb, "midQualitySize", this.A0E);
        C16470t7.appendFieldToStringBuilder(sb, "operation", this.A0P);
        C16470t7.appendFieldToStringBuilder(sb, "photoCompressionQuality", this.A0F);
        C16470t7.appendFieldToStringBuilder(sb, "progressiveJpeg", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "srcBitrate", this.A0G);
        C16470t7.appendFieldToStringBuilder(sb, "srcDurationSec", this.A0H);
        C16470t7.appendFieldToStringBuilder(sb, "srcHeight", this.A0I);
        C16470t7.appendFieldToStringBuilder(sb, "srcSize", this.A0J);
        C16470t7.appendFieldToStringBuilder(sb, "srcWidth", this.A0K);
        C16470t7.appendFieldToStringBuilder(sb, "thumbnailSize", this.A0L);
        C16470t7.appendFieldToStringBuilder(sb, "totalQueueMs", this.A0M);
        C16470t7.appendFieldToStringBuilder(sb, "transcodeMediaType", this.A0N);
        C16470t7.appendFieldToStringBuilder(sb, "transcoderSupported", this.A04);
        sb.append("}");
        return sb.toString();
    }
}

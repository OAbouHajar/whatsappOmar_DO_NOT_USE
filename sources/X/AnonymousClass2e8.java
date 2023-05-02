package X;

/* renamed from: X.2e8  reason: invalid class name */
public final class AnonymousClass2e8 extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;

    public AnonymousClass2e8() {
        super(3904, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A02);
        r3.AdT(3, this.A06);
        r3.AdT(4, this.A00);
        r3.AdT(5, this.A03);
        r3.AdT(6, this.A04);
        r3.AdT(7, this.A05);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamNonMessagePeerDataOperationResponse {");
        C16470t7.appendFieldToStringBuilder(sb, "peerDataErrorCount", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "peerDataNotFoundCount", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "peerDataRequestSessionId", this.A06);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "peerDataRequestType", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "peerDataResponseCount", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "peerDataSuccessProcessCount", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "peerDataSuccessResponseCount", this.A05);
        sb.append("}");
        return sb.toString();
    }
}

package X;

/* renamed from: X.25A  reason: invalid class name */
public final class AnonymousClass25A extends C16470t7 {
    public Integer A00;
    public Long A01;
    public String A02;

    public AnonymousClass25A() {
        super(3906, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A02);
        r3.AdT(3, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamNonMessagePeerDataRequest {");
        C16470t7.appendFieldToStringBuilder(sb, "peerDataRequestCount", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "peerDataRequestSessionId", this.A02);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "peerDataRequestType", num == null ? null : num.toString());
        sb.append("}");
        return sb.toString();
    }
}

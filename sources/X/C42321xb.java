package X;

/* renamed from: X.1xb  reason: invalid class name and case insensitive filesystem */
public final class C42321xb extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;

    public C42321xb() {
        super(3578, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A04);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A00);
        r3.AdT(5, this.A03);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamE2eRetryReject {");
        Integer num = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "messageType", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "msgRetryCount", this.A04);
        Integer num2 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "retryRejectReason", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "retryRevoke", this.A00);
        Integer num3 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "senderDeviceType", num3 == null ? null : num3.toString());
        sb.append("}");
        return sb.toString();
    }
}

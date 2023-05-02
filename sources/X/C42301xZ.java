package X;

/* renamed from: X.1xZ  reason: invalid class name and case insensitive filesystem */
public final class C42301xZ extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;

    public C42301xZ() {
        super(3656, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A03);
        r3.AdT(4, this.A04);
        r3.AdT(5, this.A05);
        r3.AdT(6, this.A02);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamRevokeMessageSend {");
        C16470t7.appendFieldToStringBuilder(sb, "messageSendResultIsTerminal", this.A00);
        Integer num = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "messageType", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "resendCount", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "retryCount", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "revokeDuration", this.A05);
        Integer num2 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "revokeType", num2 == null ? null : num2.toString());
        sb.append("}");
        return sb.toString();
    }
}

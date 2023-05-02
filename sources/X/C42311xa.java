package X;

/* renamed from: X.1xa  reason: invalid class name and case insensitive filesystem */
public final class C42311xa extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;

    public C42311xa() {
        super(894, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(4, this.A01);
        r3.AdT(1, this.A02);
        r3.AdT(3, this.A03);
        r3.AdT(2, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamE2eRetryAfterDelivery {");
        Integer num = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "deviceType", num == null ? null : num.toString());
        Integer num2 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "messageType", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "msgRetryCount", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "retryRevoke", this.A00);
        sb.append("}");
        return sb.toString();
    }
}

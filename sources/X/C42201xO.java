package X;

/* renamed from: X.1xO  reason: invalid class name and case insensitive filesystem */
public final class C42201xO extends C16470t7 {
    public Integer A00;
    public Integer A01;

    public C42201xO() {
        super(2176, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(1, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMdBadDeviceSentMessage {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "dsmError", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "peerType", num2 == null ? null : num2.toString());
        sb.append("}");
        return sb.toString();
    }
}

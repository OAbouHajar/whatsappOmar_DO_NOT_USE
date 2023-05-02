package X;

/* renamed from: X.2eh  reason: invalid class name and case insensitive filesystem */
public final class C52942eh extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;

    public C52942eh() {
        super(2180, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A02);
        r3.AdT(3, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(4, this.A03);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMdDeviceSyncAck {");
        Integer num = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "chatType", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "isLid", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "revoke", this.A01);
        Integer num2 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "typeOfGroup", num2 == null ? null : num2.toString());
        sb.append("}");
        return sb.toString();
    }
}

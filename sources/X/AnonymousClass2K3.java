package X;

/* renamed from: X.2K3  reason: invalid class name */
public final class AnonymousClass2K3 extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;

    public AnonymousClass2K3() {
        super(1250, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(3, this.A01);
        r3.AdT(1, this.A02);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamStatusRevoke {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "mediaType", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "statusLifeT", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "statusSessionId", this.A02);
        sb.append("}");
        return sb.toString();
    }
}
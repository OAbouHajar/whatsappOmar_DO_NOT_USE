package X;

/* renamed from: X.1dD  reason: invalid class name and case insensitive filesystem */
public final class C30941dD extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;

    public C30941dD() {
        super(3802, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A02);
        r3.AdT(3, this.A00);
        r3.AdT(4, this.A03);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamUrlReceive {");
        Integer num = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "inlineVideoType", num == null ? null : num.toString());
        Integer num2 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "messageType", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "mmsThumbnailUrlAvail", this.A00);
        Integer num3 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "urlPreviewState", num3 == null ? null : num3.toString());
        sb.append("}");
        return sb.toString();
    }
}

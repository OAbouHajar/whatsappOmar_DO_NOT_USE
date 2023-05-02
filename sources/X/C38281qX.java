package X;

/* renamed from: X.1qX  reason: invalid class name and case insensitive filesystem */
public final class C38281qX extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public String A03;

    public C38281qX() {
        super(2740, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A03);
        r3.AdT(4, this.A02);
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamStickerCommonQueryToStaticServer {");
        C16470t7.appendFieldToStringBuilder(sb, "httpResponseCode", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "params", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "queryLatencyMs", this.A02);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "queryType", num == null ? null : num.toString());
        sb.append("}");
        return sb.toString();
    }
}

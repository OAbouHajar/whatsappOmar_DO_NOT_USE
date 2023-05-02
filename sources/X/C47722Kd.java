package X;

/* renamed from: X.2Kd  reason: invalid class name and case insensitive filesystem */
public final class C47722Kd extends C16470t7 {
    public Double A00;
    public Double A01;
    public Integer A02;
    public Long A03;

    public C47722Kd() {
        super(1638, new AnonymousClass00F(1, 50, 1000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A03);
        r3.AdT(12, this.A02);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAndroidScrollPerfEvent {");
        C16470t7.appendFieldToStringBuilder(sb, "frameDropsPerMin", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "largeFrameDropsPerMin", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "scrollDurationT", this.A03);
        Integer num = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "surface", num == null ? null : num.toString());
        sb.append("}");
        return sb.toString();
    }
}

package X;

/* renamed from: X.2ie  reason: invalid class name and case insensitive filesystem */
public final class C55022ie extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;

    public C55022ie() {
        super(2070, new AnonymousClass00F(1, 20, 20), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(9, this.A00);
        r3.AdT(4, this.A01);
        r3.AdT(1, this.A03);
        r3.AdT(2, this.A04);
        r3.AdT(8, this.A02);
        r3.AdT(3, this.A05);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamCameraTtRecordVideo {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "cameraApi", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "cameraFacing", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "cameraTtStartVideo", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "cameraTtStopVideo", this.A04);
        Integer num3 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "cameraType", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "requestedVideoResolution", this.A05);
        sb.append("}");
        return sb.toString();
    }
}

package X;

/* renamed from: X.1cB  reason: invalid class name and case insensitive filesystem */
public final class C30331cB extends C16470t7 {
    public Boolean A00;
    public Double A01;
    public Long A02;

    public C30331cB() {
        super(3738, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A02);
        r3.AdT(3, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamCallReplayerUpload {");
        C16470t7.appendFieldToStringBuilder(sb, "compressionGain", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "sizeAfterCompression", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "uploadSuccess", this.A00);
        sb.append("}");
        return sb.toString();
    }
}

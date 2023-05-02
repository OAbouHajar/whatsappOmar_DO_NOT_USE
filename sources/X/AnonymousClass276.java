package X;

/* renamed from: X.276  reason: invalid class name */
public final class AnonymousClass276 extends C16470t7 {
    public Double A00;
    public Integer A01;
    public Integer A02;
    public Long A03;

    public AnonymousClass276() {
        super(848, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(4, this.A00);
        r3.AdT(3, this.A03);
        r3.AdT(2, this.A02);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamProfilePicDownload {");
        Integer num = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "profilePicDownloadResult", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "profilePicDownloadSize", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "profilePicDownloadT", this.A03);
        Integer num2 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "profilePicType", num2 == null ? null : num2.toString());
        sb.append("}");
        return sb.toString();
    }
}

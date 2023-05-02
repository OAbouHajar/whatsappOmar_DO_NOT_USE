package X;

/* renamed from: X.2KV  reason: invalid class name */
public final class AnonymousClass2KV extends C16470t7 {
    public Integer A00;
    public Long A01;
    public String A02;

    public AnonymousClass2KV() {
        super(1536, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(5, this.A00);
        r3.AdT(1, this.A01);
        r3.AdT(7, this.A02);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamCamera {");
        String str = null;
        Integer num = this.A00;
        if (num != null) {
            str = num.toString();
        }
        C16470t7.appendFieldToStringBuilder(sb, "cameraOrigin", str);
        C16470t7.appendFieldToStringBuilder(sb, "cameraPresentationT", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "cameraViewType", this.A02);
        sb.append("}");
        return sb.toString();
    }
}

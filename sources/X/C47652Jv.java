package X;

/* renamed from: X.2Jv  reason: invalid class name and case insensitive filesystem */
public final class C47652Jv extends C16470t7 {
    public Long A00;
    public String A01;

    public C47652Jv() {
        super(1376, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(1, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamBusinessMute {");
        C16470t7.appendFieldToStringBuilder(sb, "muteT", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "muteeId", this.A01);
        sb.append("}");
        return sb.toString();
    }
}

package X;

/* renamed from: X.2Ju  reason: invalid class name and case insensitive filesystem */
public final class C47642Ju extends C16470t7 {
    public String A00;

    public C47642Ju() {
        super(1378, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamBusinessUnmute {");
        C16470t7.appendFieldToStringBuilder(sb, "muteeId", this.A00);
        sb.append("}");
        return sb.toString();
    }
}

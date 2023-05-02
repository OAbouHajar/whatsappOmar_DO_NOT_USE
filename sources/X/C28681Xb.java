package X;

/* renamed from: X.1Xb  reason: invalid class name and case insensitive filesystem */
public final class C28681Xb extends C16470t7 {
    public Boolean A00;
    public Integer A01;

    public C28681Xb() {
        super(3150, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamGatedChatOpened {");
        Integer num = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "chatGatedReason", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "selfInitiated", this.A00);
        sb.append("}");
        return sb.toString();
    }
}

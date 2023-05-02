package X;

/* renamed from: X.1Xa  reason: invalid class name and case insensitive filesystem */
public final class C28671Xa extends C16470t7 {
    public Integer A00;

    public C28671Xa() {
        super(3152, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamGatedMessageReceived {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "chatGatedReason", num == null ? null : num.toString());
        sb.append("}");
        return sb.toString();
    }
}

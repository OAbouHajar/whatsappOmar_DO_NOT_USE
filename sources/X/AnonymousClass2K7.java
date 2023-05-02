package X;

/* renamed from: X.2K7  reason: invalid class name */
public final class AnonymousClass2K7 extends C16470t7 {
    public Integer A00;
    public Integer A01;

    public AnonymousClass2K7() {
        super(2700, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamStructuredMessage {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "messageClass", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "messageMediaType", num2 == null ? null : num2.toString());
        sb.append("}");
        return sb.toString();
    }
}

package X;

/* renamed from: X.2JW  reason: invalid class name */
public final class AnonymousClass2JW extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public String A03;

    public AnonymousClass2JW() {
        super(3486, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A02);
        r3.AdT(2, this.A00);
        r3.AdT(3, this.A03);
        r3.AdT(4, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamKeepInChatNux {");
        C16470t7.appendFieldToStringBuilder(sb, "chatEphemeralityDuration", this.A02);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "kicNuxActionName", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "threadId", this.A03);
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "trigger", num2 == null ? null : num2.toString());
        sb.append("}");
        return sb.toString();
    }
}

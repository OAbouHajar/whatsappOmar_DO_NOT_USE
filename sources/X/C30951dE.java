package X;

/* renamed from: X.1dE  reason: invalid class name and case insensitive filesystem */
public final class C30951dE extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public String A02;

    public C30951dE() {
        super(3560, new AnonymousClass00F(1, 1, 1), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A02);
        r3.AdT(3, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamStatusReplyReceived {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "statusMediaType", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "statusPosterJid", this.A02);
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "statusReplyMessageType", num2 == null ? null : num2.toString());
        sb.append("}");
        return sb.toString();
    }
}

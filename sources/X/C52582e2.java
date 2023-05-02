package X;

/* renamed from: X.2e2  reason: invalid class name and case insensitive filesystem */
public final class C52582e2 extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;

    public C52582e2() {
        super(1616, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamChatFilterEvent {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "actionType", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "filterType", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "sessionId", this.A02);
        sb.append("}");
        return sb.toString();
    }
}

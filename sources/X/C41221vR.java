package X;

/* renamed from: X.1vR  reason: invalid class name and case insensitive filesystem */
public final class C41221vR extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;

    public C41221vR() {
        super(3808, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(5, this.A04);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamPnhRequestRevealAction {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "pnhAction", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "pnhChatParty", num2 == null ? null : num2.toString());
        Integer num3 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "pnhChatType", num3 == null ? null : num3.toString());
        Integer num4 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "pnhEntryPoint", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "threadId", this.A04);
        sb.append("}");
        return sb.toString();
    }
}

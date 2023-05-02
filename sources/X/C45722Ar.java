package X;

/* renamed from: X.2Ar  reason: invalid class name and case insensitive filesystem */
public final class C45722Ar extends C16470t7 {
    public Integer A00;
    public String A01;

    public C45722Ar() {
        super(3198, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamDeepLinkMsgSent {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "deepLinkAction", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "deepLinkSessionId", this.A01);
        sb.append("}");
        return sb.toString();
    }
}

package X;

/* renamed from: X.2E1  reason: invalid class name */
public final class AnonymousClass2E1 extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;

    public AnonymousClass2E1() {
        super(2472, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A00);
        r3.AdT(1, this.A02);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamUserNotice {");
        C16470t7.appendFieldToStringBuilder(sb, "userNoticeContentVersion", this.A01);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "userNoticeEvent", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "userNoticeId", this.A02);
        sb.append("}");
        return sb.toString();
    }
}

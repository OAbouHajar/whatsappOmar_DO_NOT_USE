package X;

/* renamed from: X.1pa  reason: invalid class name and case insensitive filesystem */
public final class C37701pa extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public String A02;
    public String A03;

    public C37701pa() {
        super(3602, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A03);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAvatarEdit {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "avatarEditEntryPoint", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "avatarEditEvent", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "avatarEditorSessionId", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "waAvatarSessionId", this.A03);
        sb.append("}");
        return sb.toString();
    }
}

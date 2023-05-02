package X;

/* renamed from: X.1pZ  reason: invalid class name and case insensitive filesystem */
public final class C37691pZ extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;

    public C37691pZ() {
        super(3600, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A04);
        r3.AdT(6, this.A01);
        r3.AdT(2, this.A02);
        r3.AdT(3, this.A05);
        r3.AdT(4, this.A03);
        r3.AdT(7, this.A00);
        r3.AdT(5, this.A06);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAvatarBloksLaunch {");
        C16470t7.appendFieldToStringBuilder(sb, "avatarBloksLaunchErrorReason", this.A04);
        Integer num = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "avatarBloksLaunchErrorType", num == null ? null : num.toString());
        Integer num2 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "avatarBloksLaunchEvent", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "avatarEditorSessionId", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "fetchT", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "hasAvatar", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "waAvatarSessionId", this.A06);
        sb.append("}");
        return sb.toString();
    }
}

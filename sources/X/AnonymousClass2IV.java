package X;

/* renamed from: X.2IV  reason: invalid class name */
public final class AnonymousClass2IV extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;

    public AnonymousClass2IV() {
        super(472, new AnonymousClass00F(1, 100, 5000), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(5, this.A04);
        r3.AdT(8, this.A00);
        r3.AdT(6, this.A05);
        r3.AdT(4, this.A01);
        r3.AdT(7, this.A02);
        r3.AdT(3, this.A06);
        r3.AdT(1, this.A03);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamUiAction {");
        C16470t7.appendFieldToStringBuilder(sb, "deviceCount", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "isLid", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "participantCount", this.A05);
        Integer num = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "sizeBucket", num == null ? null : num.toString());
        Integer num2 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "uiActionChatType", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "uiActionT", this.A06);
        Integer num3 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "uiActionType", num3 == null ? null : num3.toString());
        sb.append("}");
        return sb.toString();
    }
}

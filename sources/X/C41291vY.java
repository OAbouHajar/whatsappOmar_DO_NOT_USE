package X;

/* renamed from: X.1vY  reason: invalid class name and case insensitive filesystem */
public final class C41291vY extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public String A05;

    public C41291vY() {
        super(3770, new AnonymousClass00F(1, 1, 1), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A03);
        r3.AdT(2, this.A04);
        r3.AdT(6, this.A00);
        r3.AdT(3, this.A05);
        r3.AdT(4, this.A01);
        r3.AdT(5, this.A02);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamBusinessTemplateMessageThreadLevelUserAction {");
        C16470t7.appendFieldToStringBuilder(sb, "businessPhoneNumber", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "deltaTime", this.A04);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "qbmFlag", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "templateId", this.A05);
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "threadActionEntryPoint", num2 == null ? null : num2.toString());
        Integer num3 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "threadLevelAction", num3 == null ? null : num3.toString());
        sb.append("}");
        return sb.toString();
    }
}

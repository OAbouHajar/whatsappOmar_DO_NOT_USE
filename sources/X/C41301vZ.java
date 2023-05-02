package X;

/* renamed from: X.1vZ  reason: invalid class name and case insensitive filesystem */
public final class C41301vZ extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public String A04;

    public C41301vZ() {
        super(3772, new AnonymousClass00F(1, 1, 1), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A02);
        r3.AdT(2, this.A03);
        r3.AdT(3, this.A00);
        r3.AdT(5, this.A01);
        r3.AdT(4, this.A04);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamBusinessTemplateMessageUserAction {");
        C16470t7.appendFieldToStringBuilder(sb, "businessPhoneNumber", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "deltaTime", this.A03);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "messageLevelAction", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "qbmFlag", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "templateId", this.A04);
        sb.append("}");
        return sb.toString();
    }
}

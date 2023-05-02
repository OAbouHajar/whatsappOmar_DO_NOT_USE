package X;

/* renamed from: X.2RT  reason: invalid class name */
public final class AnonymousClass2RT extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public String A06;

    public AnonymousClass2RT() {
        super(3002, new AnonymousClass00F(1, 1, 1), 2, 113760892);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(3, this.A02);
        r3.AdT(2, this.A03);
        r3.AdT(5, this.A04);
        r3.AdT(6, this.A05);
        r3.AdT(4, this.A00);
        r3.AdT(7, this.A01);
        r3.AdT(1, this.A06);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMessageTemplateBlocks {");
        Integer num = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "blockEntryPoint", num == null ? null : num.toString());
        Integer num2 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "blockReason", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "businessMessageTime", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "businessPhoneNumber", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "didUserReply", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "isUnsubBlock", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "templateId", this.A06);
        sb.append("}");
        return sb.toString();
    }
}

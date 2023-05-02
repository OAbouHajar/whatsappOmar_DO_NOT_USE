package X;

/* renamed from: X.1vc  reason: invalid class name and case insensitive filesystem */
public final class C41331vc extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public String A03;

    public C41331vc() {
        super(3948, new AnonymousClass00F(1, 1, 1), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(2, this.A00);
        r3.AdT(4, this.A02);
        r3.AdT(3, this.A03);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamMarketingOptOut {");
        C16470t7.appendFieldToStringBuilder(sb, "businessPhoneNumber", this.A01);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "marketingOptOutEventType", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "numIncomingMessages", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "templateId", this.A03);
        sb.append("}");
        return sb.toString();
    }
}

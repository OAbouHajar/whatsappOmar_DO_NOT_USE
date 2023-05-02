package X;

/* renamed from: X.1ce  reason: invalid class name and case insensitive filesystem */
public final class C30601ce extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public String A03;

    public C30601ce() {
        super(3080, new AnonymousClass00F(1, 1, 1), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A02);
        r3.AdT(4, this.A00);
        r3.AdT(5, this.A01);
        r3.AdT(3, this.A03);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamOtpCopyCodeClick {");
        C16470t7.appendFieldToStringBuilder(sb, "businessPhoneNumber", this.A02);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "otpEntryPoint", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "otpEventType", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "templateId", this.A03);
        sb.append("}");
        return sb.toString();
    }
}

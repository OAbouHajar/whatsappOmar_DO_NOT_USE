package X;

/* renamed from: X.1va  reason: invalid class name and case insensitive filesystem */
public final class C41311va extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;

    public C41311va() {
        super(3792, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A04);
        r3.AdT(6, this.A05);
        r3.AdT(4, this.A02);
        r3.AdT(5, this.A03);
        r3.AdT(7, this.A06);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamQbmMessageRead {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "chatsFolderType", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "contactType", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "deltaTime", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "messageTypeStr", this.A05);
        Integer num3 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "qbmFlag", num3 == null ? null : num3.toString());
        Integer num4 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "readSource", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "threadIdHmac", this.A06);
        sb.append("}");
        return sb.toString();
    }
}

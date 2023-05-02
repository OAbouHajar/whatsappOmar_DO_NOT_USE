package X;

/* renamed from: X.1vd  reason: invalid class name and case insensitive filesystem */
public final class C41341vd extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public C41341vd() {
        super(3876, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A04);
        r3.AdT(4, this.A06);
        r3.AdT(5, this.A02);
        r3.AdT(10, this.A05);
        r3.AdT(8, this.A03);
        r3.AdT(7, this.A07);
        r3.AdT(11, this.A08);
        r3.AdT(6, this.A09);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamQbmMessageReply {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "chatsFolderType", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "contactType", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "deltaTime", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "messageTypeStr", this.A06);
        Integer num3 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "qbmFlag", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "quotedDeltaTime", this.A05);
        Integer num4 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "quotedMessageQbmFlag", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "quotedMessageType", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "replyMessageType", this.A08);
        C16470t7.appendFieldToStringBuilder(sb, "threadIdHmac", this.A09);
        sb.append("}");
        return sb.toString();
    }
}

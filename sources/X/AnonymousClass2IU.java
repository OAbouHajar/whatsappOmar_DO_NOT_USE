package X;

/* renamed from: X.2IU  reason: invalid class name */
public final class AnonymousClass2IU extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public String A0D;

    public AnonymousClass2IU() {
        super(1980, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(9, this.A0A);
        r3.AdT(8, this.A02);
        r3.AdT(12, this.A00);
        r3.AdT(15, this.A01);
        r3.AdT(14, this.A0D);
        r3.AdT(6, this.A03);
        r3.AdT(5, this.A04);
        r3.AdT(10, this.A0B);
        r3.AdT(2, this.A05);
        r3.AdT(11, this.A06);
        r3.AdT(3, this.A07);
        r3.AdT(4, this.A0C);
        r3.AdT(1, this.A08);
        r3.AdT(13, this.A09);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamPlaceholderActivity {");
        C16470t7.appendFieldToStringBuilder(sb, "deviceCount", this.A0A);
        Integer num = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "deviceSizeBucket", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "isLid", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "messageBeforeReg", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "messageKeyHash", this.A0D);
        Integer num2 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "messageMediaType", num2 == null ? null : num2.toString());
        Integer num3 = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "messageType", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "participantCount", this.A0B);
        Integer num4 = this.A05;
        C16470t7.appendFieldToStringBuilder(sb, "placeholderActionInd", num4 == null ? null : num4.toString());
        Integer num5 = this.A06;
        C16470t7.appendFieldToStringBuilder(sb, "placeholderAddReason", num5 == null ? null : num5.toString());
        Integer num6 = this.A07;
        C16470t7.appendFieldToStringBuilder(sb, "placeholderChatTypeInd", num6 == null ? null : num6.toString());
        C16470t7.appendFieldToStringBuilder(sb, "placeholderTimePeriod", this.A0C);
        Integer num7 = this.A08;
        C16470t7.appendFieldToStringBuilder(sb, "placeholderTypeInd", num7 == null ? null : num7.toString());
        Integer num8 = this.A09;
        C16470t7.appendFieldToStringBuilder(sb, "typeOfGroup", num8 == null ? null : num8.toString());
        sb.append("}");
        return sb.toString();
    }
}

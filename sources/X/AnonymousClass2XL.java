package X;

/* renamed from: X.2XL  reason: invalid class name */
public final class AnonymousClass2XL extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;
    public String A07;

    public AnonymousClass2XL() {
        super(2130, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(4, this.A05);
        r3.AdT(5, this.A06);
        r3.AdT(3, this.A07);
        r3.AdT(6, this.A00);
        r3.AdT(8, this.A01);
        r3.AdT(7, this.A02);
        r3.AdT(1, this.A03);
        r3.AdT(2, this.A04);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAndroidInviteEvent {");
        C16470t7.appendFieldToStringBuilder(sb, "inviteAddressbookSize", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "inviteAddressbookWhatsappSize", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "inviteAppName", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "inviteContactPermissionDisabled", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "inviteContactWithMultiplePhoneNumbersClicked", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "inviteContactWithMultiplePhoneNumbersExists", this.A02);
        Integer num = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "inviteEventType", num == null ? null : num.toString());
        Integer num2 = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "inviteSource", num2 == null ? null : num2.toString());
        sb.append("}");
        return sb.toString();
    }
}

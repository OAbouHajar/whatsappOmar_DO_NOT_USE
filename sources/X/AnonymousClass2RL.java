package X;

/* renamed from: X.2RL  reason: invalid class name */
public final class AnonymousClass2RL extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;

    public AnonymousClass2RL() {
        super(1630, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(16, this.A03);
        r3.AdT(15, this.A00);
        r3.AdT(7, this.A04);
        r3.AdT(8, this.A01);
        r3.AdT(6, this.A08);
        r3.AdT(4, this.A09);
        r3.AdT(2, this.A0A);
        r3.AdT(1, this.A05);
        r3.AdT(17, this.A0B);
        r3.AdT(18, this.A0C);
        r3.AdT(9, this.A06);
        r3.AdT(10, this.A02);
        r3.AdT(11, this.A0D);
        r3.AdT(5, this.A0E);
        r3.AdT(19, this.A0F);
        r3.AdT(12, this.A07);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamCatalogView {");
        Integer num = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "bizPlatform", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "cartToggle", this.A00);
        Integer num2 = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "catalogEntryPoint", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "catalogEventSampled", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "catalogOwnerJid", this.A08);
        C16470t7.appendFieldToStringBuilder(sb, "catalogReportReasonCode", this.A09);
        C16470t7.appendFieldToStringBuilder(sb, "catalogSessionId", this.A0A);
        Integer num3 = this.A05;
        C16470t7.appendFieldToStringBuilder(sb, "catalogViewAction", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "collectionId", this.A0B);
        C16470t7.appendFieldToStringBuilder(sb, "collectionIndex", this.A0C);
        Integer num4 = this.A06;
        C16470t7.appendFieldToStringBuilder(sb, "deepLinkOpenFrom", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "isOrderMsgAttached", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "orderId", this.A0D);
        C16470t7.appendFieldToStringBuilder(sb, "productId", this.A0E);
        C16470t7.appendFieldToStringBuilder(sb, "productIndex", this.A0F);
        C16470t7.appendFieldToStringBuilder(sb, "quantity", this.A07);
        sb.append("}");
        return sb.toString();
    }
}

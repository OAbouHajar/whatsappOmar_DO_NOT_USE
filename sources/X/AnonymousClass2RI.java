package X;

/* renamed from: X.2RI  reason: invalid class name */
public final class AnonymousClass2RI extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public AnonymousClass2RI() {
        super(1722, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(13, this.A00);
        r3.AdT(1, this.A02);
        r3.AdT(7, this.A03);
        r3.AdT(3, this.A06);
        r3.AdT(14, this.A07);
        r3.AdT(15, this.A08);
        r3.AdT(8, this.A04);
        r3.AdT(10, this.A01);
        r3.AdT(9, this.A09);
        r3.AdT(2, this.A0A);
        r3.AdT(16, this.A0B);
        r3.AdT(11, this.A05);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamCatalogBiz {");
        C16470t7.appendFieldToStringBuilder(sb, "cartToggle", this.A00);
        Integer num = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "catalogBizAction", num == null ? null : num.toString());
        Integer num2 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "catalogEntryPoint", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "catalogSessionId", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "collectionId", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "collectionIndex", this.A08);
        Integer num3 = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "deepLinkOpenFrom", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "isOrderMsgAttached", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "orderId", this.A09);
        C16470t7.appendFieldToStringBuilder(sb, "productId", this.A0A);
        C16470t7.appendFieldToStringBuilder(sb, "productIndex", this.A0B);
        C16470t7.appendFieldToStringBuilder(sb, "quantity", this.A05);
        sb.append("}");
        return sb.toString();
    }
}

package X;

/* renamed from: X.22S  reason: invalid class name */
public final class AnonymousClass22S extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public String A04;

    public AnonymousClass22S() {
        super(3222, new AnonymousClass00F(1, 1, 1), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A03);
        r3.AdT(3, this.A01);
        r3.AdT(4, this.A04);
        r3.AdT(5, this.A02);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamStructuredMessageReceive {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "bizPlatform", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "businessOwnerJid", this.A03);
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "messageClass", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "messageClassAttributes", this.A04);
        Integer num3 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "messageMediaType", num3 == null ? null : num3.toString());
        sb.append("}");
        return sb.toString();
    }
}

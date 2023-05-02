package X;

/* renamed from: X.2OZ  reason: invalid class name */
public final class AnonymousClass2OZ extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public String A06;

    public AnonymousClass2OZ() {
        super(3450, new AnonymousClass00F(1, 1, 1), 2, 113760892);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A06);
        r3.AdT(4, this.A02);
        r3.AdT(5, this.A03);
        r3.AdT(6, this.A04);
        r3.AdT(7, this.A05);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamBusinessInteraction {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "businessInteractionAction", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "businessInteractionTargetScreen", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "businessJid", this.A06);
        Integer num3 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "entryPointApp", num3 == null ? null : num3.toString());
        Integer num4 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "entryPointSource", num4 == null ? null : num4.toString());
        Integer num5 = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "internalEntryPoint", num5 == null ? null : num5.toString());
        C16470t7.appendFieldToStringBuilder(sb, "sequenceNumber", this.A05);
        sb.append("}");
        return sb.toString();
    }
}

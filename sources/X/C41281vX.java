package X;

/* renamed from: X.1vX  reason: invalid class name and case insensitive filesystem */
public final class C41281vX extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public String A05;
    public String A06;

    public C41281vX() {
        super(3794, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(7, this.A05);
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A04);
        r3.AdT(3, this.A01);
        r3.AdT(4, this.A02);
        r3.AdT(6, this.A06);
        r3.AdT(5, this.A03);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamQbmThreadLevelAction {");
        C16470t7.appendFieldToStringBuilder(sb, "blockReasonIdentifier", this.A05);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "contactType", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "deltaTime", this.A04);
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "qbmFlag", num2 == null ? null : num2.toString());
        Integer num3 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "threadActionEntryPoint", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "threadIdHmac", this.A06);
        Integer num4 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "threadLevelAction", num4 == null ? null : num4.toString());
        sb.append("}");
        return sb.toString();
    }
}

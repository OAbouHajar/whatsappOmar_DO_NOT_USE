package X;

/* renamed from: X.1xS  reason: invalid class name and case insensitive filesystem */
public final class C42241xS extends C16470t7 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public String A08;
    public String A09;

    public C42241xS() {
        super(3524, new AnonymousClass00F(1, 1, 1), 2, 0);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A08);
        r3.AdT(2, this.A01);
        r3.AdT(9, this.A02);
        r3.AdT(3, this.A03);
        r3.AdT(4, this.A09);
        r3.AdT(5, this.A04);
        r3.AdT(6, this.A05);
        r3.AdT(7, this.A00);
        r3.AdT(8, this.A07);
        r3.AdT(10, this.A06);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamE2eMessageDecryptFailSender {");
        C16470t7.appendFieldToStringBuilder(sb, "clientMessageId", this.A08);
        Integer num = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "e2eCiphertextType", num == null ? null : num.toString());
        Integer num2 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "e2eDestination", num2 == null ? null : num2.toString());
        Integer num3 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "e2eFailureReason", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "e2eSenderJid", this.A09);
        Integer num4 = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "e2eSenderType", num4 == null ? null : num4.toString());
        Integer num5 = this.A05;
        C16470t7.appendFieldToStringBuilder(sb, "messageMediaType", num5 == null ? null : num5.toString());
        C16470t7.appendFieldToStringBuilder(sb, "offline", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "retryCount", this.A07);
        Integer num6 = this.A06;
        C16470t7.appendFieldToStringBuilder(sb, "revokeType", num6 == null ? null : num6.toString());
        sb.append("}");
        return sb.toString();
    }
}

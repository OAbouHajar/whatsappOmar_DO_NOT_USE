package X;

/* renamed from: X.2jg  reason: invalid class name and case insensitive filesystem */
public final class C55482jg extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;

    public C55482jg() {
        super(3124, new AnonymousClass00F(1, 1, 20), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(2, this.A00);
        r3.AdT(3, this.A01);
        r3.AdT(5, this.A02);
        r3.AdT(1, this.A03);
        r3.AdT(6, this.A04);
        r3.AdT(7, this.A05);
        r3.AdT(11, this.A06);
        r3.AdT(12, this.A07);
        r3.AdT(13, this.A08);
        r3.AdT(14, this.A09);
        r3.AdT(15, this.A0A);
        r3.AdT(16, this.A0B);
        r3.AdT(17, this.A0C);
        r3.AdT(18, this.A0D);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamContactInfo {");
        C16470t7.appendFieldToStringBuilder(sb, "avatar", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "blockContact", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "contactDetails", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "contactInfoVisit", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "disappearingMessages", this.A04);
        C16470t7.appendFieldToStringBuilder(sb, "encryption", this.A05);
        C16470t7.appendFieldToStringBuilder(sb, "mute", this.A06);
        C16470t7.appendFieldToStringBuilder(sb, "payments", this.A07);
        C16470t7.appendFieldToStringBuilder(sb, "reportContact", this.A08);
        C16470t7.appendFieldToStringBuilder(sb, "search", this.A09);
        C16470t7.appendFieldToStringBuilder(sb, "shareContact", this.A0A);
        C16470t7.appendFieldToStringBuilder(sb, "starredMessages", this.A0B);
        C16470t7.appendFieldToStringBuilder(sb, "videoCall", this.A0C);
        C16470t7.appendFieldToStringBuilder(sb, "voiceCall", this.A0D);
        sb.append("}");
        return sb.toString();
    }
}

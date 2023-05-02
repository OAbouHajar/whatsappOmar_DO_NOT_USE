package X;

/* renamed from: X.2JJ  reason: invalid class name */
public final class AnonymousClass2JJ extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public String A0E;

    public AnonymousClass2JJ() {
        super(3482, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(16, this.A00);
        r3.AdT(1, this.A08);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(15, this.A09);
        r3.AdT(4, this.A0A);
        r3.AdT(5, this.A04);
        r3.AdT(6, this.A05);
        r3.AdT(7, this.A06);
        r3.AdT(8, this.A07);
        r3.AdT(9, this.A03);
        r3.AdT(10, this.A0B);
        r3.AdT(11, this.A0C);
        r3.AdT(12, this.A0D);
        r3.AdT(13, this.A0E);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamDisappearingMessageKeepInChat {");
        C16470t7.appendFieldToStringBuilder(sb, "canEditDmSettings", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "chatEphemeralityDuration", this.A08);
        C16470t7.appendFieldToStringBuilder(sb, "isAGroup", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "isAdmin", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "keptCount", this.A09);
        C16470t7.appendFieldToStringBuilder(sb, "keptDelta", this.A0A);
        Integer num = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "kicActionName", num == null ? null : num.toString());
        Integer num2 = this.A05;
        C16470t7.appendFieldToStringBuilder(sb, "kicActor", num2 == null ? null : num2.toString());
        Integer num3 = this.A06;
        C16470t7.appendFieldToStringBuilder(sb, "kicEntryPoint", num3 == null ? null : num3.toString());
        Integer num4 = this.A07;
        C16470t7.appendFieldToStringBuilder(sb, "mediaType", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "messageExpiredOnUnkeep", this.A03);
        C16470t7.appendFieldToStringBuilder(sb, "messageExpiryTimer", this.A0B);
        C16470t7.appendFieldToStringBuilder(sb, "messagesInFolder", this.A0C);
        C16470t7.appendFieldToStringBuilder(sb, "messagesSelected", this.A0D);
        C16470t7.appendFieldToStringBuilder(sb, "threadId", this.A0E);
        sb.append("}");
        return sb.toString();
    }
}

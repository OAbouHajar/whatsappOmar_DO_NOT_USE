package X;

/* renamed from: X.2JX  reason: invalid class name */
public final class AnonymousClass2JX extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Long A05;

    public AnonymousClass2JX() {
        super(3698, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(7, this.A00);
        r3.AdT(2, this.A01);
        r3.AdT(3, this.A02);
        r3.AdT(4, this.A03);
        r3.AdT(5, this.A04);
        r3.AdT(6, this.A05);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamKeepInChatErrors {");
        C16470t7.appendFieldToStringBuilder(sb, "canEditDmSettings", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "isAGroup", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "isAdmin", this.A02);
        Integer num = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "kicAction", num == null ? null : num.toString());
        Integer num2 = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "kicErrorCode", num2 == null ? null : num2.toString());
        C16470t7.appendFieldToStringBuilder(sb, "kicMessageEphemeralityDuration", this.A05);
        sb.append("}");
        return sb.toString();
    }
}

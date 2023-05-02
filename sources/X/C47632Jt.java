package X;

/* renamed from: X.2Jt  reason: invalid class name and case insensitive filesystem */
public final class C47632Jt extends C16470t7 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public Long A06;

    public C47632Jt() {
        super(2280, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(3, this.A00);
        r3.AdT(5, this.A01);
        r3.AdT(4, this.A02);
        r3.AdT(1, this.A05);
        r3.AdT(6, this.A03);
        r3.AdT(2, this.A06);
        r3.AdT(7, this.A04);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamChatMute {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "actionConducted", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "chatMuteNotificationChoice", num2 == null ? null : num2.toString());
        Integer num3 = this.A02;
        C16470t7.appendFieldToStringBuilder(sb, "muteChatType", num3 == null ? null : num3.toString());
        C16470t7.appendFieldToStringBuilder(sb, "muteDuration", this.A05);
        Integer num4 = this.A03;
        C16470t7.appendFieldToStringBuilder(sb, "muteEntryPoint", num4 == null ? null : num4.toString());
        C16470t7.appendFieldToStringBuilder(sb, "muteGroupSize", this.A06);
        Integer num5 = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "waOfficialAccountName", num5 == null ? null : num5.toString());
        sb.append("}");
        return sb.toString();
    }
}

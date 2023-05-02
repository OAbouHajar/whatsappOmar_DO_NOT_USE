package X;

/* renamed from: X.1xU  reason: invalid class name and case insensitive filesystem */
public final class C42261xU extends C16470t7 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;

    public C42261xU() {
        super(1840, C16470t7.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(3, this.A00);
        r3.AdT(6, this.A01);
        r3.AdT(2, this.A02);
        r3.AdT(5, this.A03);
        r3.AdT(4, this.A04);
        r3.AdT(1, this.A05);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamStickerSend {");
        C16470t7.appendFieldToStringBuilder(sb, "stickerIsAnimated", this.A00);
        C16470t7.appendFieldToStringBuilder(sb, "stickerIsAvatar", this.A01);
        C16470t7.appendFieldToStringBuilder(sb, "stickerIsFirstParty", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "stickerIsFromStickerMaker", this.A03);
        Integer num = this.A04;
        C16470t7.appendFieldToStringBuilder(sb, "stickerSendMessageType", num == null ? null : num.toString());
        Integer num2 = this.A05;
        C16470t7.appendFieldToStringBuilder(sb, "stickerSendOrigin", num2 == null ? null : num2.toString());
        sb.append("}");
        return sb.toString();
    }
}

package X;

/* renamed from: X.1xV  reason: invalid class name and case insensitive filesystem */
public final class C42271xV extends C16470t7 {
    public Integer A00;
    public Integer A01;

    public C42271xV() {
        super(3894, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A00);
        r3.AdT(2, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamAvatarStickerSend {");
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "avatarStickerSendMessageType", num == null ? null : num.toString());
        Integer num2 = this.A01;
        C16470t7.appendFieldToStringBuilder(sb, "avatarStickerSendOriginType", num2 == null ? null : num2.toString());
        sb.append("}");
        return sb.toString();
    }
}

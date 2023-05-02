package X;

/* renamed from: X.2Dm  reason: invalid class name and case insensitive filesystem */
public final class C46302Dm extends C16470t7 {
    public Integer A00;
    public Long A01;
    public Long A02;
    public Long A03;

    public C46302Dm() {
        super(3256, new AnonymousClass00F(1, 1, 1), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(1, this.A01);
        r3.AdT(3, this.A00);
        r3.AdT(5, this.A02);
        r3.AdT(4, this.A03);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WamPrivacyNoticeBadging {");
        C16470t7.appendFieldToStringBuilder(sb, "noticeBadgingId", this.A01);
        Integer num = this.A00;
        C16470t7.appendFieldToStringBuilder(sb, "noticeBadgingStage", num == null ? null : num.toString());
        C16470t7.appendFieldToStringBuilder(sb, "noticeBadgingStarttime", this.A02);
        C16470t7.appendFieldToStringBuilder(sb, "noticeBadgingVersion", this.A03);
        sb.append("}");
        return sb.toString();
    }
}

package X;

/* renamed from: X.3sw  reason: invalid class name and case insensitive filesystem */
public final class C75923sw extends C16470t7 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;

    public C75923sw() {
        super(2884, AnonymousClass3K3.A0d(), 0, -1);
    }

    public void serialize(C29081Zz r3) {
        r3.AdT(11, this.A00);
        r3.AdT(12, this.A01);
        r3.AdT(13, this.A02);
        r3.AdT(14, this.A03);
        r3.AdT(1, this.A04);
        r3.AdT(6, this.A05);
        r3.AdT(9, this.A06);
        r3.AdT(8, this.A07);
        r3.AdT(5, this.A08);
        r3.AdT(3, this.A09);
        r3.AdT(15, this.A0A);
        r3.AdT(2, this.A0B);
        r3.AdT(7, this.A0C);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamStickerDailyAggregatedEvent {");
        C16470t7.appendFieldToStringBuilder(A0r, "stickerAddToFavoriteCount", this.A00);
        C16470t7.appendFieldToStringBuilder(A0r, "stickerPackDeleteCount", this.A01);
        C16470t7.appendFieldToStringBuilder(A0r, "stickerPickerOpenedCount", this.A02);
        C16470t7.appendFieldToStringBuilder(A0r, "stickerSearchOpenedCount", this.A03);
        C16470t7.appendFieldToStringBuilder(A0r, "stickerSendCount", this.A04);
        C16470t7.appendFieldToStringBuilder(A0r, "stickerSendCountForward", this.A05);
        C16470t7.appendFieldToStringBuilder(A0r, "stickerSendCountIsAnimated", this.A06);
        C16470t7.appendFieldToStringBuilder(A0r, "stickerSendCountIsFirstParty", this.A07);
        C16470t7.appendFieldToStringBuilder(A0r, "stickerSendCountStickerPickerTabEmotion", this.A08);
        C16470t7.appendFieldToStringBuilder(A0r, "stickerSendCountStickerPickerTabFavorites", this.A09);
        C16470t7.appendFieldToStringBuilder(A0r, "stickerSendCountStickerPickerTabPack", this.A0A);
        C16470t7.appendFieldToStringBuilder(A0r, "stickerSendCountStickerPickerTabRecents", this.A0B);
        C16470t7.appendFieldToStringBuilder(A0r, "stickerSendCountStickerSearch", this.A0C);
        return AnonymousClass000.A0h("}", A0r);
    }
}
